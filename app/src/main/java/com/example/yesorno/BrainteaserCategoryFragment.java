package com.example.yesorno;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class BrainteaserCategoryFragment extends ListFragment {

    interface BrainteaserCategoryListener {
        void categoryClicked(long id);
    }

    private BrainteaserCategoryListener listener;

    public BrainteaserCategoryFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String[] categoryNames = new String[BrainteaserCategory.categories.length];
        for (int i = 0; i < BrainteaserCategory.categories.length; i++) {
            categoryNames[i] = Integer.toString(BrainteaserCategory.categories[i].getId());
        }

        ArrayAdapter<String> categoryNamesAdapter = new ArrayAdapter<String>(
                inflater.getContext(), android.R.layout.simple_list_item_1, categoryNames);
        setListAdapter(categoryNamesAdapter);
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.listener = (BrainteaserCategoryListener) activity;
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        if (listener != null) {
            this.listener.categoryClicked(id);
        }
    }
}
