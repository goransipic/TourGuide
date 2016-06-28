package com.example.android.tourguide.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.android.tourguide.R;
import com.example.android.tourguide.adapters.InstitutionAdapter;
import com.example.android.tourguide.adapters.TouristAgenciesAdapter;
import com.example.android.tourguide.models.Institution;
import com.example.android.tourguide.models.Tourist;

import java.util.ArrayList;

/**
 * Created by goransi on 28.6.2016..
 */
public class InstitutionsFragment extends Fragment {

    private ListView mListView;

    public static InstitutionsFragment newInstance() {

        return new InstitutionsFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        mListView = (ListView) inflater.inflate(R.layout.fragment_page, container, false);

        ArrayList<Institution> reachArrayList = new ArrayList<>();
        reachArrayList.add(new Institution(getString(R.string.institution_1),getString(R.string.institution_address_1)));
        reachArrayList.add(new Institution(getString(R.string.institution_2),getString(R.string.institution_address_2)));
        reachArrayList.add(new Institution(getString(R.string.institution_3),getString(R.string.institution_address_3)));
        reachArrayList.add(new Institution(getString(R.string.institution_4),getString(R.string.institution_address_4)));
        reachArrayList.add(new Institution(getString(R.string.institution_5),getString(R.string.institution_address_5)));

        InstitutionAdapter reachAdapter = new InstitutionAdapter(this.getContext(),reachArrayList);
        mListView.setAdapter(reachAdapter);

        return mListView;
    }

}
