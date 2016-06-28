package com.example.android.tourguide.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.android.tourguide.R;
import com.example.android.tourguide.adapters.AccommodationAdapter;
import com.example.android.tourguide.adapters.ReachAdapter;
import com.example.android.tourguide.models.Accommodation;
import com.example.android.tourguide.models.Reach;

import java.util.ArrayList;

/**
 * Created by goransi on 28.6.2016..
 */
public class AccommodationFragment extends Fragment {


    private ListView mListView;

    public static Fragment newInstance() {
        return new AccommodationFragment();
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        mListView = (ListView) inflater.inflate(R.layout.fragment_page, container, false);

        ArrayList<Accommodation> reachArrayList = new ArrayList<>();

        reachArrayList.add(new Accommodation(getString(R.string.hotel_title_1),getString(R.string.hotel_address_1),R.drawable.atrium));
        reachArrayList.add(new Accommodation(getString(R.string.hotel_title_2),getString(R.string.hotel_address_2),R.drawable.art));
        reachArrayList.add(new Accommodation(getString(R.string.hotel_title_3),getString(R.string.hotel_address_3),R.drawable.corner));
        reachArrayList.add(new Accommodation(getString(R.string.hotel_title_4),getString(R.string.hotel_address_4),R.drawable.diklecijan_hotel));
        reachArrayList.add(new Accommodation(getString(R.string.hotel_title_5),getString(R.string.hotel_address_5),R.drawable.park));

        AccommodationAdapter reachAdapter = new AccommodationAdapter(this.getContext(),reachArrayList);
        mListView.setAdapter(reachAdapter);

        return mListView;

    }
}
