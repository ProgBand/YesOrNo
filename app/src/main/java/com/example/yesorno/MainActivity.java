package com.example.yesorno;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;

public class MainActivity extends FragmentActivity
        implements BrainteaserListFragment.BrainteaserListListener, BrainteaserCategoryFragment.BrainteaserCategoryListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        BrainteaserListFragment brainteaserList = new BrainteaserListFragment();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.add(R.id.list_frag_container, brainteaserList);
        ft.addToBackStack(null);
        ft.commit();
        setContentView(R.layout.activity_main);
    }

    @Override
    public void itemClicked(long listId, long categoryId) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra(DetailActivity.EXTRA_BRAINTEASER_ID, (int) listId);
        intent.putExtra(DetailActivity.EXTRA_BRAINTEASER_CATEGORY_ID, (int) categoryId);
        startActivity(intent);
    }

    @Override
    public void categoryClicked(long id) {
        BrainteaserListFragment brainteaserList = new BrainteaserListFragment();
        brainteaserList.setBrainteaserCategoryId(id);
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.list_frag_container, brainteaserList);
        ft.addToBackStack(null);
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        ft.commit();
    }
}
