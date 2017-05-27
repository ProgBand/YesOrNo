package com.example.yesorno;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.yesorno.model.Brainteaser;
import com.example.yesorno.util.ObjectInputFromCache;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import me.yokeyword.swipebackfragment.SwipeBackFragment;


public class BrainteaserDetailFragment extends SwipeBackFragment implements View.OnClickListener {
    private long brainteaserId = 1;
    private long categoryId = 1;
    private String answer;

    public BrainteaserDetailFragment() {
    }

    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_brainteaser_detail, container, false);
        return attachToSwipeBack(view);
    }

    @Override
    public void onStart() {
        super.onStart();
        final View view = getView();
        if (view != null) {
            Button btnAnswer = (Button) view.findViewById(R.id.answerButton);
            btnAnswer.setOnClickListener(this);

            ObjectInputFromCache reader = new ObjectInputFromCache("brainList.ser", getContext());
            ArrayList<Brainteaser> brainteasers =(ArrayList<Brainteaser>)reader.cacheReader();
            Brainteaser brainteaser = brainteasers.get((int)brainteaserId);

            TextView title = (TextView) view.findViewById(R.id.textTitle);
            title.setText(brainteaser.getName());
            TextView description = (TextView) view.findViewById(R.id.textDescription);
            description.setText(brainteaser.getDescription());
            answer = brainteaser.getAnswer();
            ImageView imgDescr = (ImageView) view.findViewById(R.id.imageDetail);
            Picasso.with(getContext())
                    .load(brainteaser.getImgUrl())
                    .into(imgDescr);

//            BrainteaserDaoWebImpl.getApi().getById((int)brainteaserId).enqueue(new Callback<Brainteaser>() {
//                @Override
//                public void onResponse(Call<Brainteaser> call, Response<Brainteaser> response) {
//                    Brainteaser brainteaser;
//                    brainteaser = response.body();
//                    TextView title = (TextView) view.findViewById(R.id.textTitle);
//                    title.setText(brainteaser.getName());
//                    TextView description = (TextView) view.findViewById(R.id.textDescription);
//                    description.setText(brainteaser.getDescription());
//                    answer = brainteaser.getAnswer();
//                    ImageView imgDescr = (ImageView) view.findViewById(R.id.imageDetail);
//                    Picasso.with(getContext())
//                            .load(brainteaser.getImgUrl())
//                            .into(imgDescr);
//                }
//
//                @Override
//                public void onFailure(Call<Brainteaser> call, Throwable t) {
//                    Toast.makeText(getContext(), "An error occurred during networking", Toast.LENGTH_SHORT).show();
//                }
//            });

        }
    }

    public void setBrainteaserId(int brainteaserId) {
        this.brainteaserId = brainteaserId;
    }

    public void setBrainteaserCategoryId(int brainteaserCategoryId) {
        this.categoryId = brainteaserCategoryId;
    }

    @Override
    public void onClick(View v) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
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
