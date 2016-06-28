package com.example.android.tourguide.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.android.tourguide.R;
import com.example.android.tourguide.adapters.ReachAdapter;
import com.example.android.tourguide.adapters.TouristAgenciesAdapter;
import com.example.android.tourguide.models.Reach;
import com.example.android.tourguide.models.Tourist;

import java.util.ArrayList;

/**
 * Created by goransi on 28.6.2016..
 */
public class TouristAgenciesFragment extends Fragment {

    private ListView mListView;

    public static TouristAgenciesFragment newInstance() {

        return new TouristAgenciesFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        mListView = (ListView) inflater.inflate(R.layout.fragment_page, container, false);

        ArrayList<Tourist> reachArrayList = new ArrayList<>();
        reachArrayList.add(new Tourist(getString(R.string.agency_1),getString(R.string.agency_address_1)));
        reachArrayList.add(new Tourist(getString(R.string.agency_2),getString(R.string.agency_address_2)));
        reachArrayList.add(new Tourist(getString(R.string.agency_3),getString(R.string.agency_address_3)));
        reachArrayList.add(new Tourist(getString(R.string.agency_4),getString(R.string.agency_address_4)));
        reachArrayList.add(new Tourist(getString(R.string.agency_5),getString(R.string.agency_address_5)));

        TouristAgenciesAdapter reachAdapter = new TouristAgenciesAdapter(this.getContext(),reachArrayList);
        mListView.setAdapter(reachAdapter);

        return mListView;
    }

}
