package com.example.assignment4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class Adapteri extends ArrayAdapter<JsonData> {
    private Context context;
    ArrayList<JsonData> dataset;

    public Adapteri(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
        this.context = context;
        this.dataset = (ArrayList<JsonData>) objects;
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View v = layoutInflater.inflate(R.layout.custom_layout, parent, false);
        LinearLayout linearLayout = (LinearLayout) v;

        TextView title = v.findViewById(R.id.title);
        TextView body = v.findViewById(R.id.body);

        title.setText(dataset.get(position).getTitle());
        body.setText((dataset.get(position).getBody()));

        return v;
    }
}
