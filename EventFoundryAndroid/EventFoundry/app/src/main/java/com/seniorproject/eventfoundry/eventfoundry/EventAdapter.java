package com.seniorproject.eventfoundry.eventfoundry;


import java.util.List;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class EventAdapter extends ArrayAdapter<Event> {

    Context context;
    List<Event> eventItem;
    public EventAdapter(Context context, List<Event> eventItem) {
        super(context, R.layout.eventlist_fragment, eventItem);
    }

    @Override
    public int getCount() {

        return eventItem.size();
    }

    @Override
    public Event getItem(int position) {

        return eventItem.get(position);
    }

    @Override
    public long getItemId(int position) {

        return eventItem.indexOf(getItem(position));
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            LayoutInflater mInflater = (LayoutInflater) context
                    .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = mInflater.inflate(R.layout.eventitem_layout, null);
        }

        ImageView imgIcon = (ImageView) convertView.findViewById(R.id.icon);
        TextView txtName = (TextView) convertView.findViewById(R.id.eventName);
        TextView txtDate = (TextView) convertView.findViewById(R.id.eventDate);
        TextView txtLocation = (TextView) convertView.findViewById(R.id.eventLocation);
        TextView txtPrice = (TextView) convertView.findViewById(R.id.eventPrice);



        Event row_pos = eventItem.get(position);
        // setting the image resource and title
        imgIcon.setImageResource(row_pos.getIconID());
        txtName.setText(row_pos.getName());
        txtDate.setText(row_pos.getDate());
        txtLocation.setText(row_pos.getLocation());
        txtPrice.setText(row_pos.getPrice());


        return convertView;

    }

}