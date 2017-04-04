package com.example.yesorno;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.TextView;

public class DetailActivity extends FragmentActivity {
    public static final String EXTRA_BRAINTEASER_ID = "listId";
    public static final String EXTRA_BRAINTEASER_CATEGORY_ID = "categoryId";
    private String answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        int brainteaserId = (int) getIntent().getExtras().get(EXTRA_BRAINTEASER_ID);
        int brainteaserCategoryId = (int) getIntent().getExtras().get(EXTRA_BRAINTEASER_CATEGORY_ID);

        //**
            TextView title = (TextView) this.findViewById(R.id.textTitle);
            Brainteaser brainteaser = Brainteaser.brainteasers[ brainteaserCategoryId][ brainteaserId];
            title.setText(brainteaser.getName());
            TextView description = (TextView) this.findViewById(R.id.textDescription);
            description.setText(brainteaser.getDescription());
            answer = brainteaser.getAnswer();

        //**


      //  BrainteaserDetailFragment brainteaserDetailFragment = (BrainteaserDetailFragment)
      //          getSupportFragmentManager().findFragmentById(R.id.detail_frag);


     //   brainteaserDetailFragment.setBrainteaserCategoryId(brainteaserCategoryId);
     //   brainteaserDetailFragment.setBrainteaserId(brainteaserId);
    }

    public void onAnswerButtonClick(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(DetailActivity.this);
        builder.setMessage(answer)
                .setCancelable(false)
                .setNegativeButton("ОК",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });
        AlertDialog alert = builder.create();
        alert.show();
    }
}
