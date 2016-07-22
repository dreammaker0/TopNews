package com.example.lcy.topnews.ui.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * 与其憧憬未来，不如把握现在。
 * Created by lcy on 2016-7-21.
 */
public class NewsFragmentPagerAdapter extends FragmentPagerAdapter {
    private List<Fragment> mDatas;
    public NewsFragmentPagerAdapter(FragmentManager fm, List<Fragment> datas) {
        super(fm);
        mDatas = datas;
    }

    @Override
    public Fragment getItem(int position) {
        return mDatas.get(position);
    }

    @Override
    public int getCount() {
        return mDatas == null ? 0 : mDatas.size();
    }
}
