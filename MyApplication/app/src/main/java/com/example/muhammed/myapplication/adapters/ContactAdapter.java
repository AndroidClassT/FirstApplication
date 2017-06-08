package com.example.muhammed.myapplication.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.muhammed.myapplication.R;
import com.example.muhammed.myapplication.models.ContactModel;

import java.util.ArrayList;

/**
 * Created by Muhammed on 08/06/17.
 */

public class ContactAdapter extends ArrayAdapter<ContactModel> {
    private ArrayList<ContactModel> models;

    public ContactAdapter(Context context, ArrayList<ContactModel> models) {
        super(context, R.layout.list_row, models);
        this.models = models;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        ViewHolder viewHolder;
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.list_row, parent, false);

            viewHolder = new ViewHolder();

            viewHolder.nameTextView = (TextView) convertView.findViewById(R.id.nameTextView);
            viewHolder.numberTextView = (TextView) convertView.findViewById(R.id.numberTextView);
            viewHolder.emailTextView = (TextView) convertView.findViewById(R.id.emailTextView);

            convertView.setTag(viewHolder);


        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }


        viewHolder.nameTextView.setText(models.get(position).getUserName());
        viewHolder.numberTextView.setText(models.get(position).getNumber());
        viewHolder.emailTextView.setText(models.get(position).getEmail());

        return convertView;
    }

    private static class ViewHolder {
        TextView nameTextView;
        TextView numberTextView;
        TextView emailTextView;
    }
}
