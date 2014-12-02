package com.seniorproject.eventfoundry.eventfoundry;

import android.app.ListFragment;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by James.Kimani on 12/1/2014.
 */
public class ListViewDemoFragment extends ListFragment {
    private List<Car> mItems;        // ListView items list

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // initialize the items list
        mItems = new ArrayList<Car>();
        Resources resources = getResources();

        mItems.add(new Car("Ford", 1940, R.drawable.help, "Needing work"));
        mItems.add(new Car("Toyota", 1994, R.drawable.heart, "Lovable"));
        mItems.add(new Car("Honda", 1999, R.drawable.fish, "Wet"));
        mItems.add(new Car("Porche", 2005, R.drawable.lightning, "Fast!"));
        mItems.add(new Car("Jeep", 200, R.drawable.star, "Awesome"));
        mItems.add(new Car("Rust-Bucket", 2010, R.drawable.bug, "Not *very* good"));
        mItems.add(new Car("Moon Lander", 1971, R.drawable.up, "Out of this world"));

        // initialize and set the list adapter
        setListAdapter(new ListViewDemoAdapter(getActivity(), mItems));
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        // remove the dividers from the ListView of the ListFragment
        getListView().setDivider(null);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        // retrieve theListView item
        Car car = mItems.get(position);

        // do something
        Toast.makeText(getActivity(), car.getMake(), Toast.LENGTH_SHORT).show();
    }
}


