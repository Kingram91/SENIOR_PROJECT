package com.seniorproject.eventfoundry.eventfoundry;

/**
 * Created by James.Kimani on 12/2/2014.
 */
import java.util.ArrayList;
import java.util.List;

import android.app.ListFragment;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class EventFragment extends ListFragment implements OnItemClickListener {

    String[] names;
    String[] dates;
    String[] descriptions;
    String[] locations;
    String[] prices;
    String[] hosts;
    TypedArray icons;

    EventAdapter adapter;
    private List<Event> eventItems;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        names = getResources().getStringArray(R.array.eventNames);
        dates = getResources().getStringArray(R.array.eventDates);
        icons = getResources().obtainTypedArray(R.array.icons);
        descriptions = getResources().getStringArray(R.array.eventDescription);
        locations = getResources().getStringArray(R.array.eventLocation);
        prices = getResources().getStringArray(R.array.eventPrice);
        hosts = getResources().getStringArray(R.array.eventHost);

        eventItems = new ArrayList<Event>();

        for (int i = 0; i < names.length; i++) {
            Event items = new Event(""+i, names[i], dates[i], descriptions[i], locations[i], prices[i], hosts[i], icons.getResourceId(i, -1));

            eventItems.add(items);
        }

        adapter = new EventAdapter(getActivity(), eventItems);
        setListAdapter(adapter);
        getListView().setOnItemClickListener(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.eventlist_fragment, null, false);
    }
/**
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {

        super.onActivityCreated(savedInstanceState);

        names = getResources().getStringArray(R.array.eventNames);
        dates = getResources().getStringArray(R.array.eventDates);
        icons = getResources().obtainTypedArray(R.array.icons);
        descriptions = getResources().getStringArray(R.array.eventDescription);
        locations = getResources().getStringArray(R.array.eventLocation);
        prices = getResources().getStringArray(R.array.eventPrice);
        hosts = getResources().getStringArray(R.array.eventHost);

        eventItems = new ArrayList<Event>();

        for (int i = 0; i < names.length; i++) {
            Event items = new Event(""+i, names[i], dates[i], descriptions[i], locations[i], prices[i], hosts[i], icons.getResourceId(i, -1));

            eventItems.add(items);
        }

        adapter = new EventAdapter(getActivity(), eventItems);
        setListAdapter(adapter);
        getListView().setOnItemClickListener(this);

    }
*/
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position,
                            long id) {

        Toast.makeText(getActivity(), names[position], Toast.LENGTH_SHORT)
                .show();

    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        // retrieve theListView item
        Event event = eventItems.get(position);

        // do something
        Toast.makeText(getActivity(), event.getName(), Toast.LENGTH_SHORT).show();
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        public void onFragmentInteraction(String id);
    }

}

