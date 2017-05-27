package com.example.yesorno;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.view.View;

import com.example.yesorno.dao.BrainteaserDaoWebImpl;
import com.example.yesorno.model.Brainteaser;

import java.io.IOException;
import java.util.ArrayList;

import me.yokeyword.swipebackfragment.SwipeBackActivity;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends SwipeBackActivity
        implements BrainteaserListFragment.BrainteaserListListener{
    private ArrayList<Brainteaser> brainteasers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        BrainteaserListFragment brainteaserList = new BrainteaserListFragment();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.list_frag_container, brainteaserList);
        ft.commit();
        setContentView(R.layout.activity_main);
        setSwipeBackEnable(false);
    }

    @Override
    public void itemClicked(long listId, long categoryId) {
        BrainteaserDetailFragment brainteaserDetail = new BrainteaserDetailFragment();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        brainteaserDetail.setBrainteaserId((int) listId);
        brainteaserDetail.setBrainteaserCategoryId((int) categoryId);
        ft.replace(R.id.brainteaser_category_frag, brainteaserDetail);
        ft.addToBackStack(null);
        ft.commit();
    }

    public void categoryClicked(long id) {
        BrainteaserListFragment brainteaserList = new BrainteaserListFragment();
        brainteaserList.setBrainteaserCategoryId(id);
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        ft.replace(R.id.list_frag_container, brainteaserList);
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        ft.addToBackStack(null);
        ft.commit();
    }

    public void onButtonClick(View view) {
        switch (view.getId()) {
            case R.id.category_1:
                categoryClicked(1);
                break;
            case R.id.category_2:
                categoryClicked(2);
                break;
            case R.id.category_3:
                categoryClicked(3);
                break;
            case R.id.category_4:
                categoryClicked(4);
                break;
            case R.id.category_5:
                categoryClicked(5);
                break;
        }
    }

}
