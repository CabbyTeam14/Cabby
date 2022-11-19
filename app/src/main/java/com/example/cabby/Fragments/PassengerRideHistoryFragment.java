package com.example.cabby.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.cabby.Adapters.PassengerRideAdapter;
import com.example.cabby.Model.Ride;
import com.example.cabby.R;
import com.example.cabby.Tools.Mockup;
import com.example.cabby.activities.PassengerRideDetailsActivity;
import com.example.cabby.activities.PassengerRideHistoryActivity;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PassengerRideHistoryFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PassengerRideHistoryFragment extends ListFragment {

    public PassengerRideHistoryFragment() {
        // Required empty public constructor
    }


    public static PassengerRideHistoryFragment newInstance(String param1, String param2) {
        PassengerRideHistoryFragment fragment = new PassengerRideHistoryFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        PassengerRideAdapter adapter = new PassengerRideAdapter(getActivity());
        setListAdapter(adapter);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_passenger_ride_history, container, false);
    }

    @Override
    public void onListItemClick(@NonNull ListView l, @NonNull View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Ride picked_ride = Mockup.getRides().get(position);
        Intent ride_detail_intent = new Intent(getActivity(), PassengerRideDetailsActivity.class);
        ride_detail_intent.putExtra("ride", picked_ride);
        startActivity(ride_detail_intent);
    }
}