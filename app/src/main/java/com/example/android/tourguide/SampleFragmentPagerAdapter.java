package com.example.android.tourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.android.tourguide.fragments.AccommodationFragment;
import com.example.android.tourguide.fragments.InstitutionsFragment;
import com.example.android.tourguide.fragments.ReachFragment;
import com.example.android.tourguide.fragments.TouristAgenciesFragment;

/**
 * Created by goransi on 28.6.2016..
 */
public class SampleFragmentPagerAdapter extends FragmentPagerAdapter {

    final int PAGE_COUNT = 4;
    private String[] tabTitles;
    private Context context;

    public SampleFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;

        tabTitles = new String[4];

        tabTitles[0] = context.getString(R.string.reach_split);
        tabTitles[1] =  context.getString(R.string.accommodation);
        tabTitles[2] = context.getString(R.string.getting_around);
        tabTitles[3] = context.getString(R.string.institutions);
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int position) {

        Fragment fragment = null;

        switch (position){
            case 0 :
                fragment = ReachFragment.newInstance();
                break;
            case 1:
                fragment = AccommodationFragment.newInstance();
                break;
            case 2:
                fragment = TouristAgenciesFragment.newInstance();
                break;
            case 3:
                fragment = InstitutionsFragment.newInstance();
                break;

        }

        return fragment;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }


}
