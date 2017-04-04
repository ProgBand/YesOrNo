package com.example.yesorno;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class BrainteaserListFragment extends ListFragment {

    private long brainteaserCategoryId = 0;

    interface BrainteaserListListener {
        void itemClicked(long listId, long categoryId);
    }

    private BrainteaserListListener listener;

    public BrainteaserListFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        String[] brainteaserList = new String[Brainteaser.brainteasers[(int) brainteaserCategoryId].length];
        for (int i = 0; i < brainteaserList.length; i++) {
            brainteaserList[i]=Brainteaser.brainteasers[(int) brainteaserCategoryId][i].getName();
        }

        ArrayAdapter brainteaserListAdapter = new
                ArrayAdapter(inflater.getContext(), R.layout.category_list_style, brainteaserList);
        setListAdapter(brainteaserListAdapter);

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
