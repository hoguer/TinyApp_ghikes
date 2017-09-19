package com.hoguer.ghikes;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class HikeAdapter extends BaseAdapter {
    private Context mContext;
    private LayoutInflater mInflater;
    private ArrayList<Hike> mDataSource;

    public HikeAdapter(Context context, ArrayList<Hike> items) {
        mContext = context;
        mDataSource = items;
        mInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return mDataSource.size();
    }

    @Override
    public Object getItem(int position) {
        return mDataSource.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView = mInflater.inflate(R.layout.list_item_hike, parent, false);

        TextView titleTextView =
                (TextView) rowView.findViewById(R.id.hike_list_title);
        TextView subtitleTextView =
                (TextView) rowView.findViewById(R.id.hike_list_subtitle);
        TextView detailTextView =
                (TextView) rowView.findViewById(R.id.hike_list_detail);

        Hike hike = (Hike) getItem(position);
        titleTextView.setText(hike.name);
        subtitleTextView.setText(hike.description);
        detailTextView.setText(Double.toString(hike.distance));

        return rowView;
    }

}
