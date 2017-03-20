package com.example.yesorno;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class DetailActivity extends FragmentActivity {
    public static final String EXTRA_BRAINTEASER_ID = "listId";
    public static final String EXTRA_BRAINTEASER_CATEGORY_ID = "categoryId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        BrainteaserDetailFragment brainteaserDetailFragment = (BrainteaserDetailFragment)
                getSupportFragmentManager().findFragmentById(R.id.detail_frag);
        int brainteaserId = (int) getIntent().getExtras().get(EXTRA_BRAINTEASER_ID);
        int brainteaserCategoryId = (int) getIntent().getExtras().get(EXTRA_BRAINTEASER_CATEGORY_ID);
        brainteaserDetailFragment.setBrainteaserCategoryId(brainteaserCategoryId);
        brainteaserDetailFragment.setBrainteaserId(brainteaserId);
    }
}
