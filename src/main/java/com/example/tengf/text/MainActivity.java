package com.example.tengf.text;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    SecondAdapter mSecondAdapter;
    TabLayout mTabLayout;
    ViewPager mViewPager;
    String [] titles = new String[]{"FirstTab","SecondTab"};
    List<Fragment> mFragments;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        mTabLayout = (TabLayout) findViewById(R.id.tab_layout);
        mViewPager = (ViewPager) findViewById(R.id.viewpager);

        mSecondAdapter = new SecondAdapter(getSupportFragmentManager());
        mSecondAdapter.setTitles(titles);

        mFragments = new ArrayList<>();
        mFragments.add(new Fragment_one());
        mFragments.add(new Fragment_two());

        mSecondAdapter.setFragments(mFragments);
        mTabLayout.setTabMode(TabLayout.MODE_FIXED);
        mViewPager.setAdapter(mSecondAdapter);
        mTabLayout.setupWithViewPager(mViewPager);
    }
}
