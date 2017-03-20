package com.example.yesorno;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class BrainteaserDetailFragment extends Fragment {
    private long brainteaserCategoryId;
    private long brainteaserId;

    public BrainteaserDetailFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_brainteaser_detail, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();
        if (view != null) {
            TextView title = (TextView) view.findViewById(R.id.textTitle);
            Brainteaser brainteaser = Brainteaser.brainteasers[(int) brainteaserCategoryId][(int) brainteaserId];
            title.setText(brainteaser.getName());
            TextView description = (TextView) view.findViewById(R.id.textDescription);
            description.setText(brainteaser.getDescription());
        }
    }

    public void setBrainteaserCategoryId(long brainteaserCategoryId) {
        this.brainteaserCategoryId = brainteaserCategoryId;
    }

    public void setBrainteaserId(int brainteaserId) {
        this.brainteaserId = brainteaserId;
    }

}
