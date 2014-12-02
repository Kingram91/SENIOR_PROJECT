package com.seniorproject.eventfoundry.eventfoundry;

/**
 * Created by James.Kimani on 12/2/2014.
 */
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
public class TextFragment extends Fragment {
    ImageView icon;
    TextView name, location,date,price;
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.eventitem_layout, container, false);

        name= (TextView) view.findViewById(R.id.eventName);
        location= (TextView)view.findViewById(R.id.eventLocation);
        date = (TextView)view.findViewById(R.id.eventDate);
        price = (TextView)view.findViewById(R.id.eventPrice);
        icon = (ImageView)view.findViewById(R.id.icon);
        return view;
    }
}
