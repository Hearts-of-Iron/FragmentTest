package com.example.tengf.text;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by xushuzhan on 2016/12/2.
 */

public class Adapter extends PagerAdapter{
    List<View> mViews ;

    public Adapter(List<View> views){
        mViews = views;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        container.addView(mViews.get(position));
        return mViews.get(position);
    }
    @Override
    public int getCount() {
        return mViews.size();
    }
    @Override
    public boolean isViewFromObject(View view, Object object) {

        return view ==object;
    }
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView(mViews.get(position));
    }
}
