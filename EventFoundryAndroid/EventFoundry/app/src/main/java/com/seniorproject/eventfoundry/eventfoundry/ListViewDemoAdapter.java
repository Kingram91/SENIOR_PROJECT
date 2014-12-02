package com.seniorproject.eventfoundry.eventfoundry;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.seniorproject.eventfoundry.eventfoundry.Car;
import com.seniorproject.eventfoundry.eventfoundry.R;

import java.util.List;

public class ListViewDemoAdapter extends ArrayAdapter<Car> {

    public ListViewDemoAdapter(Context context, List<Car> items) {
        super(context, R.layout.item_view, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;

        if(convertView == null) {
            // inflate the GridView item layout
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.item_view, parent, false);

            // initialize the view holder
            viewHolder = new ViewHolder();
            viewHolder.item_icon = (ImageView) convertView.findViewById(R.id.item_icon);
            viewHolder.item_txtMake = (TextView) convertView.findViewById(R.id.item_txtMake);
            viewHolder.item_txtCondition = (TextView) convertView.findViewById(R.id.item_txtCondition);
            viewHolder.item_txtYear = (TextView) convertView.findViewById(R.id.item_txtYear);
            convertView.setTag(viewHolder);
        } else {
            // recycle the already inflated view 
            viewHolder = (ViewHolder) convertView.getTag();
        }

        // update the item view
        Car car = getItem(position);
        viewHolder.item_icon.setImageResource(car.getIconID());
        viewHolder.item_txtMake.setText(car.getMake());
        viewHolder.item_txtCondition.setText(car.getCondition());
        viewHolder.item_txtYear.setText(car.getYear());

        return convertView;
    }

    /**
     * The view holder design pattern prevents using findViewById()
     * repeatedly in the getView() method of the adapter.
     *
     * @see http://developer.android.com/training/improving-layouts/smooth-scrolling.html#ViewHolder
     */
    private static class ViewHolder {
        ImageView item_icon;
        TextView item_txtMake;
        TextView item_txtCondition;
        TextView item_txtYear;
    }
}