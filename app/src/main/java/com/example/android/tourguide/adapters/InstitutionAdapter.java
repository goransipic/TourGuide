package com.example.android.tourguide.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.android.tourguide.R;
import com.example.android.tourguide.fragments.InstitutionsFragment;
import com.example.android.tourguide.models.Institution;
import com.example.android.tourguide.models.Tourist;

import java.util.ArrayList;

/**
 * Created by goransi on 28.6.2016..
 */
public class InstitutionAdapter extends BaseAdapter {

    ArrayList<Institution> mReachArrayList;
    Context mContext;

    public InstitutionAdapter(Context context, ArrayList<Institution> mReachArrayList) {
        this.mReachArrayList = mReachArrayList;
        mContext = context;
    }

    @Override
    public int getCount() {
        return mReachArrayList.size();
    }

    @Override
    public Institution getItem(int position) {
        return mReachArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View convertView = view;

        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.tourist_list_item, viewGroup, false);
        }
        TextView textViewTitle = (TextView) convertView.findViewById(R.id.title);
        TextView textViewSubtitle = (TextView) convertView.findViewById(R.id.subtitle);


        textViewTitle.setText(mReachArrayList.get(i).getTitle());
        textViewSubtitle.setText(mReachArrayList.get(i).getSubtitle());

        return convertView;

    }
}
