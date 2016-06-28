package com.example.android.tourguide.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.tourguide.R;
import com.example.android.tourguide.models.Reach;

import java.util.ArrayList;

/**
 * Created by goransi on 28.6.2016..
 */
public class ReachAdapter extends BaseAdapter {

    ArrayList<Reach> mReachArrayList;
    Context mContext;

    public ReachAdapter(Context context, ArrayList<Reach> mReachArrayList) {
        this.mReachArrayList = mReachArrayList;
        mContext = context;
    }

    @Override
    public int getCount() {
        return mReachArrayList.size();
    }

    @Override
    public Reach getItem(int position) {
        return mReachArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View convertView = view;

        if (convertView == null){
            convertView = LayoutInflater.from(mContext).inflate(R.layout.reach_list_item, viewGroup, false);
        }
        TextView textViewTitle = (TextView) convertView.findViewById(R.id.title);
        TextView textViewSubtitle = (TextView) convertView.findViewById(R.id.subtitle);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.reach_image);

        imageView.setImageResource(mReachArrayList.get(i).getResIdImage());
        textViewTitle.setText(mReachArrayList.get(i).getTitle());
        textViewSubtitle.setText(mReachArrayList.get(i).getSubtitle());

        return convertView;

    }
}
