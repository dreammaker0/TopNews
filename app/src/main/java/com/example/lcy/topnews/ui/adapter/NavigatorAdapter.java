package com.example.lcy.topnews.ui.adapter;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.view.ViewPager;
import android.view.View;

import com.example.lcy.topnews.widget.ScaleTransitionPagerTitleView;

import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.CommonNavigatorAdapter;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerIndicator;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.abs.IPagerTitleView;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.indicators.BezierPagerIndicator;

import java.util.List;

/**
 * 与其憧憬未来，不如把握现在。
 * Created by lcy on 2016-7-20.
 */
public class NavigatorAdapter extends CommonNavigatorAdapter {
    private List<String> mColorDatas;
    private List<String> mTitleDatas;
    private ViewPager mViewPager;

    public NavigatorAdapter(List<String> titleDatas, List<String> colorDatas) {
        mColorDatas = colorDatas;
        mTitleDatas = titleDatas;
    }

    @Override
    public int getCount() {
        return mTitleDatas == null ? 0 : mTitleDatas.size();
    }

    @Override
    public IPagerTitleView getTitleView(Context context, final int index) {
        final ScaleTransitionPagerTitleView colorTransitionPagerTitleView = new ScaleTransitionPagerTitleView(context);
        colorTransitionPagerTitleView.setText(mTitleDatas.get(index));
        colorTransitionPagerTitleView.setTextSize(18);
        colorTransitionPagerTitleView.setNormalColor(Color.parseColor("#f2c4c4"));
        colorTransitionPagerTitleView.setSelectedColor(Color.WHITE);
        colorTransitionPagerTitleView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mViewPager != null) {
                    mViewPager.setCurrentItem(index);
                } else {
                    try {
                        throw new Exception("You should setup with a viewpager!");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        return colorTransitionPagerTitleView;
    }

    @Override
    public IPagerIndicator getIndicator(Context context) {
        BezierPagerIndicator indicator = new BezierPagerIndicator(context);
        indicator.setColorList(mColorDatas);
        return indicator;
    }

    public void setupWithPager(ViewPager viewPager) {
        mViewPager = viewPager;
    }

}
