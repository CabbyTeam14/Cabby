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

import com.example.cabby.Adapters.PassengerInboxAdapter;
import com.example.cabby.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PassengerInboxFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PassengerInboxFragment extends ListFragment {


    public PassengerInboxFragment() {
        // Required empty public constructor
    }

    public static PassengerInboxFragment newInstance(String param1, String param2) {
        PassengerInboxFragment fragment = new PassengerInboxFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        PassengerInboxAdapter adapter = new PassengerInboxAdapter(getActivity());
        setListAdapter(adapter);

    }

    @Override
    public void onListItemClick(@NonNull ListView l, @NonNull View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_passenger_inbox, container, false);
    }


}