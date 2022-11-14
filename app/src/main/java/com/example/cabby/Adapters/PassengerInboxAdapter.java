package com.example.cabby.Adapters;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.cabby.Model.Message;
import com.example.cabby.Model.Ride;
import com.example.cabby.R;
import com.example.cabby.Tools.Mockup;

public class PassengerInboxAdapter extends BaseAdapter {

    Activity activity;

    public PassengerInboxAdapter(Activity activity){ this.activity = activity;}

    @Override
    public int getCount() {
        return Mockup.getPassengerMessages().size();
    }

    @Override
    public Object getItem(int position) {
        return Mockup.getPassengerMessages().get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View vi = convertView;
        Message message = Mockup.getPassengerMessages().get(position);

        if (convertView == null){
            vi = activity.getLayoutInflater().inflate(R.layout.passenger_chat_preview, null);
        }

        TextView senderValue = (TextView)vi.findViewById(R.id.passenger_chat_preview_name);
        TextView contentValue = (TextView)vi.findViewById(R.id.passenger_chat_preview_message);
        TextView dateValue = (TextView)vi.findViewById(R.id.passenger_chat_preview_datetime);


        senderValue.setText(message.getSender());
        contentValue.setText(message.getContent());
        dateValue.setText(message.getDate());

        return vi;
    }
}
