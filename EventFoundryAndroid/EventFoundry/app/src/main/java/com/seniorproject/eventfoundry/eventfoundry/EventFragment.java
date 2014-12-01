package com.seniorproject.eventfoundry.eventfoundry;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by James.Kimani on 11/30/2014.
 */
public class EventFragment extends Fragment {
    public EventFragment(){}
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_eventlist, container, false);

        return rootView;
    }

}
