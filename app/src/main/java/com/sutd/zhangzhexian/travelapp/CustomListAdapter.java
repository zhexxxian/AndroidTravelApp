package com.sutd.zhangzhexian.travelapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Lakshita on 11/14/2015.
 */
public class CustomListAdapter extends BaseAdapter {
    private ArrayList<ListItems> listData;
    private LayoutInflater layoutInflater;

    public CustomListAdapter(Context aContext, ArrayList<ListItems> listData) {
        this.listData = listData;
        layoutInflater = LayoutInflater.from(aContext);
    }

    @Override
    public int getCount() {
        return listData.size();
    }

    @Override
    public Object getItem(int position) {
        return listData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.daily_itnierary_row, null);
            holder = new ViewHolder();
            holder.place = (TextView) convertView.findViewById(R.id.placeText);
            holder.method = (TextView) convertView.findViewById(R.id.methodText);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.place.setText(listData.get(position).getPlace());
        holder.method.setText(listData.get(position).getMethod());

        return convertView;
    }

    static class ViewHolder {
        TextView place;
        TextView method;

    }
}
