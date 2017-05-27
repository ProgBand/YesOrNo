package com.example.yesorno;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.yesorno.dao.BrainteaserDaoWebImpl;
import com.example.yesorno.model.Brainteaser;
import com.example.yesorno.util.ObjectOutputCache;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BrainteaserListFragment extends ListFragment {

    private long brainteaserCategoryId = 1;
    private BrainteaserListListener listener;

    interface BrainteaserListListener {
        void itemClicked(long listId, long categoryId);
    }

    public BrainteaserListFragment() {

    }

    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        BrainteaserDaoWebImpl.getApi().getByCategory((int) brainteaserCategoryId).enqueue(new Callback<List<Brainteaser>>() {
            @Override
            public void onResponse(Call<List<Brainteaser>> call, Response<List<Brainteaser>> response) {
                ArrayList<Brainteaser> brainteasers = new ArrayList<Brainteaser>();
                brainteasers.addAll(response.body());

                ObjectOutputCache writer = new ObjectOutputCache("brainList.ser", getContext());
                writer.cacheWriter(brainteasers);

                BrainteaserAdapter brainteaserAdapter =
                        new BrainteaserAdapter(inflater.getContext(), R.layout.custom_activity_list_item, R.id.title, brainteasers);
                setListAdapter(brainteaserAdapter);
            }

            @Override
            public void onFailure(Call<List<Brainteaser>> call, Throwable t) {

            }
        });
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.listener = (BrainteaserListListener) activity;
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        if (listener != null) {
            listener.itemClicked(id, brainteaserCategoryId);
        }
    }

    public void setBrainteaserCategoryId(long brainteaserCategoryId) {
        this.brainteaserCategoryId = brainteaserCategoryId;
    }

    public long getBrainteaserCategoryId() {
        return brainteaserCategoryId;
    }

}
