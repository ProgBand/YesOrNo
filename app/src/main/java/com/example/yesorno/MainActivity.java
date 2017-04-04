package com.example.yesorno;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends FragmentActivity
        implements BrainteaserListFragment.BrainteaserListListener, BrainteaserCategoryFragment.BrainteaserCategoryListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        BrainteaserListFragment brainteaserList = new BrainteaserListFragment();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.list_frag_container, brainteaserList);
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

    public void onButtonClick(View view) {

        switch (view.getId()) {
            case R.id.category_1:
                categoryClicked(0);
                Toast toast = Toast.makeText(getApplicationContext(),
                        "Первая категория", Toast.LENGTH_SHORT);
                toast.show();
                break;
            case R.id.category_2:
                categoryClicked(1);
                Toast toast2 = Toast.makeText(getApplicationContext(),
                        "2 категория", Toast.LENGTH_SHORT);
                toast2.show();
                break;
            case R.id.category_3:
                categoryClicked(2);
                Toast toast3 = Toast.makeText(getApplicationContext(),
                        "3 категория", Toast.LENGTH_SHORT);
                toast3.show();
                break;
            case R.id.category_4:
                categoryClicked(3);
                Toast toast4 = Toast.makeText(getApplicationContext(),
                        "4 категория", Toast.LENGTH_SHORT);
                toast4.show();
                break;
            case R.id.category_5:
                categoryClicked(4);
                Toast toast5 = Toast.makeText(getApplicationContext(),
                        "5 категория", Toast.LENGTH_SHORT);
                toast5.show();
                break;
        }
    }

}
