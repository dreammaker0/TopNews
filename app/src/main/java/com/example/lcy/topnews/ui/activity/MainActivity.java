package com.example.lcy.topnews.ui.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;

import com.example.lcy.topnews.R;
import com.example.lcy.topnews.base.BaseAppCompatActivity;
import com.example.lcy.topnews.ui.adapter.NavigatorAdapter;
import com.example.lcy.topnews.ui.adapter.NewsFragmentPagerAdapter;
import com.example.lcy.topnews.ui.fragment.NewsFragment;

import net.lucode.hackware.magicindicator.MagicIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.CommonNavigator;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class MainActivity extends BaseAppCompatActivity {
    @BindView(R.id.magic_indicator)
    MagicIndicator mMagicIndicator;

    @BindView(R.id.viewPager)
    ViewPager mViewPager;

    private List<String> mTitleDatas = new ArrayList<>();

    private List<String> mColorDatas = new ArrayList<>();

    private NewsFragmentPagerAdapter mAdapter;

    private List<Fragment> mFragments = new ArrayList<>();

    @Override
    protected boolean setSwipeBackEnable() {
        return false;
    }

    @Override
    protected void initViewsAndDatas(Bundle savedInstanceState) {
        initData();

        final CommonNavigator commonNavigator = new CommonNavigator(this);
        commonNavigator.setEnablePivotScroll(true);
        NavigatorAdapter navigatorAdapter = new NavigatorAdapter(mTitleDatas, mColorDatas);
        navigatorAdapter.setupWithPager(mViewPager);
        commonNavigator.setAdapter(navigatorAdapter);
        mMagicIndicator.setNavigator(commonNavigator);

        mAdapter = new NewsFragmentPagerAdapter(getSupportFragmentManager(), mFragments);
        mViewPager.setAdapter(mAdapter);
        mViewPager.setOffscreenPageLimit(1);
        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                mMagicIndicator.onPageScrolled(position, positionOffset, positionOffsetPixels);
            }

            @Override
            public void onPageSelected(int position) {
                mMagicIndicator.onPageSelected(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                mMagicIndicator.onPageScrollStateChanged(state);
            }
        });
    }

    private void initData() {
        Bundle bundle = new Bundle();
        bundle.putString("type", "top");
        mFragments.add(NewsFragment.newInstance(bundle));

        bundle = new Bundle();
        bundle.putString("type", "shehui");
        mFragments.add(NewsFragment.newInstance(bundle));

        bundle = new Bundle();
        bundle.putString("type", "guonei");
        mFragments.add(NewsFragment.newInstance(bundle));

        bundle = new Bundle();
        bundle.putString("type", "guoji");
        mFragments.add(NewsFragment.newInstance(bundle));

        bundle = new Bundle();
        bundle.putString("type", "yule");
        mFragments.add(NewsFragment.newInstance(bundle));

        bundle = new Bundle();
        bundle.putString("type", "tiyu");
        mFragments.add(NewsFragment.newInstance(bundle));

        bundle = new Bundle();
        bundle.putString("type", "junshi");
        mFragments.add(NewsFragment.newInstance(bundle));

        bundle = new Bundle();
        bundle.putString("type", "keji");
        mFragments.add(NewsFragment.newInstance(bundle));

        bundle = new Bundle();
        bundle.putString("type", "caijing");
        mFragments.add(NewsFragment.newInstance(bundle));

        bundle = new Bundle();
        bundle.putString("type", "shishang");
        mFragments.add(NewsFragment.newInstance(bundle));

        mTitleDatas.add("头条");
        mTitleDatas.add("社会");
        mTitleDatas.add("国内");
        mTitleDatas.add("国际");
        mTitleDatas.add("娱乐");
        mTitleDatas.add("体育");
        mTitleDatas.add("军事");
        mTitleDatas.add("科技");
        mTitleDatas.add("财经");
        mTitleDatas.add("时尚");

        for (int i = 0; i < mTitleDatas.size(); i++) {
            //mColorDatas.add("#" + Integer.toHexString(ColorUtils.randomColor()));
            mColorDatas.add("#ffffff");
        }
    }

    @Override
    protected int getContentViewId() {
        return R.layout.activity_main;
    }


}
