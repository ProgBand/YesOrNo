package com.example.yesorno;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.yesorno.model.Brainteaser;
import com.squareup.picasso.Picasso;

import java.util.List;

public class BrainteaserAdapter extends ArrayAdapter {

    private List<Brainteaser> brainteasersList;
    private int resource;
    private LayoutInflater inflater;

    public BrainteaserAdapter(Context context, int resource, int textViewResourceId, List<Brainteaser> objects) {
        super(context, resource, textViewResourceId, objects);
        brainteasersList = objects;
        this.resource = resource;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = inflater.inflate(resource, null);
        }

        final ViewHolder holder = new ViewHolder();
        holder.brainteaserIcon = (ImageView) convertView.findViewById(R.id.icon);
        holder.brainteaserName = (TextView) convertView.findViewById(R.id.title);
        Picasso.with(getContext())
                .load(brainteasersList.get(position).getImgUrl())
                .into(holder.brainteaserIcon);
        holder.brainteaserName.setText(brainteasersList.get(position).getName());
        return super.getView(position, convertView, parent);
    }

    public class ViewHolder {
        ImageView brainteaserIcon;
        TextView brainteaserName;
    }
}
