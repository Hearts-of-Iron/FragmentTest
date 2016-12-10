package com.example.tengf.text;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by xushuzhan on 2016/12/2.
 */

public class SecondAdapter extends FragmentPagerAdapter {


    String []  mTitles;
    List<Fragment> mFragments;
    public void setTitles(String[] titles){
        mTitles = titles;
    }
    public void setFragments(List<Fragment> fragments){
        mFragments = fragments;
    }

    public SecondAdapter(FragmentManager fm) {
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

    @Override
    public CharSequence getPageTitle(int position) {
        return mTitles[position];
    }
}
