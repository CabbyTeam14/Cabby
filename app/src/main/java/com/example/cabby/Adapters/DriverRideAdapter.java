package com.example.cabby.Adapters;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.cabby.Model.Ride;
import com.example.cabby.R;
import com.example.cabby.Tools.Mockup;

public class DriverRideAdapter extends BaseAdapter {

    private Activity activity;

    public DriverRideAdapter(Activity activity){ this.activity = activity;}

    @Override
    public int getCount() {
        return Mockup.getRides().size();
    }

    @Override
    public Object getItem(int i) {
        return Mockup.getRides().get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View vi = convertView;
        Ride ride = Mockup.getRides().get(position);

        if (convertView == null){
            vi = activity.getLayoutInflater().inflate(R.layout.driver_ride_history_item, null);
        }

        TextView date_value = (TextView)vi.findViewById(R.id.driver_rides_date_value);
        TextView time_value = (TextView)vi.findViewById(R.id.driver_rides_time_value);
        TextView from_value = (TextView)vi.findViewById(R.id.driver_rides_from_value);
        TextView to_value = (TextView)vi.findViewById(R.id.driver_rides_to_value);

        date_value.setText(ride.getDate());
        time_value.setText(ride.getTime());
        from_value.setText(ride.getFrom());
        to_value.setText(ride.getTo());

        return vi;
    }

}
