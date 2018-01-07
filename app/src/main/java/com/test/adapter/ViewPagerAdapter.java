package com.test.adapter;

import android.annotation.SuppressLint;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;


@SuppressWarnings("ALL")
@SuppressLint("ALL")

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    List<String> mTitle=new ArrayList<>();
    List<Fragment> mFragments = new ArrayList<>();


    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }

    public void addFragment(Fragment fragment,String title){
        mFragments.add(fragment);
        mTitle.add(title);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTitle.get(position);
    }


}
