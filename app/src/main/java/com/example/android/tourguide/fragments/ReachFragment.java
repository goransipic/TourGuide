package com.example.android.tourguide.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.android.tourguide.R;
import com.example.android.tourguide.adapters.ReachAdapter;
import com.example.android.tourguide.models.Reach;

import java.util.ArrayList;

/**
 * Created by goransi on 28.6.2016..
 */
public class ReachFragment extends Fragment {

    private ListView mListView;

    public static ReachFragment newInstance() {

        return new ReachFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        mListView = (ListView) inflater.inflate(R.layout.fragment_page, container, false);

        ArrayList<Reach> reachArrayList = new ArrayList<>();
        reachArrayList.add(new Reach(getString(R.string.car_title),getString(R.string.arrival_by_car),R.drawable.car));
        reachArrayList.add(new Reach(getString(R.string.bus_title),getString(R.string.arrival_by_bus),R.drawable.bus));
        reachArrayList.add(new Reach(getString(R.string.plane_title),getString(R.string.arrival_by_plane),R.drawable.plane));
        reachArrayList.add(new Reach(getString(R.string.ship_title),getString(R.string.arrival_by_ship),R.drawable.ship));
        reachArrayList.add(new Reach(getString(R.string.train_title),getString(R.string.arrival_by_train),R.drawable.train));

        ReachAdapter reachAdapter = new ReachAdapter(this.getContext(),reachArrayList);
        mListView.setAdapter(reachAdapter);

        return mListView;
    }

}
