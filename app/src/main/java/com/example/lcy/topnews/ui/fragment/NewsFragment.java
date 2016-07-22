package com.example.lcy.topnews.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.example.lcy.topnews.R;
import com.example.lcy.topnews.base.BaseLazyLoadFragment;
import com.example.lcy.topnews.entity.NewsEntity;
import com.example.lcy.topnews.ui.activity.NewsDetailActivity;
import com.example.lcy.topnews.ui.adapter.NewsAdapter;
import com.example.lcy.topnews.ui.presenter.NewsPresenter;
import com.example.lcy.topnews.ui.view.NewsView;
import com.example.lcy.topnews.util.ColorUtils;
import com.example.lcy.topnews.util.SnackBarUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import butterknife.BindView;

/**
 * 与其憧憬未来，不如把握现在。
 * Created by lcy on 2016-7-21.
 */
public class NewsFragment extends BaseLazyLoadFragment implements NewsView, SwipeRefreshLayout.OnRefreshListener, BaseQuickAdapter.OnRecyclerViewItemClickListener {
    @BindView(R.id.swipeRefreshLayout)
    SwipeRefreshLayout mSwipeRefreshLayout;

    @BindView(R.id.recyclerView)
    RecyclerView mRecyclerView;

    private String mType;

    private NewsPresenter mNewsPresenter;

    private NewsAdapter mNewsAdapter;

    private boolean mIsFirst = true;

    private List<NewsEntity.ResultBean.DataBean> mDatas = new ArrayList();

    public static NewsFragment newInstance(Bundle bundle) {
        NewsFragment fragment = new NewsFragment();
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_news;
    }

    @Override
    protected void initView() {
        mType = getArguments().getString("type");
        mNewsPresenter = new NewsPresenter(this, mType);

        mSwipeRefreshLayout.setOnRefreshListener(this);
        mSwipeRefreshLayout.setColorSchemeColors(ColorUtils.randomColor(),
                ColorUtils.randomColor(),
                ColorUtils.randomColor(),
                ColorUtils.randomColor());

        mRecyclerView.setLayoutManager(new LinearLayoutManager(mContext));
        mNewsAdapter = new NewsAdapter(R.layout.item_news, mDatas);
        mRecyclerView.setAdapter(mNewsAdapter);
        mNewsAdapter.setOnRecyclerViewItemClickListener(this);
    }

    @Override
    protected void initData() {
        if (mIsFirst) {
            mSwipeRefreshLayout.post(new Runnable() {
                @Override
                public void run() {
                    mSwipeRefreshLayout.setRefreshing(true);
                }
            });
            onRefresh();
            mIsFirst = false;
        }
    }

    @Override
    public void setListData(List<NewsEntity.ResultBean.DataBean> datas) {
        SnackBarUtil.showSnackBar(mSwipeRefreshLayout, "加载成功");
        mDatas.clear();
        Collections.sort(datas, new Comparator<NewsEntity.ResultBean.DataBean>() {
            @Override
            public int compare(NewsEntity.ResultBean.DataBean dataBean, NewsEntity.ResultBean.DataBean t1) {
                return t1.getDate().compareTo(dataBean.getDate());
            }
        });
        mDatas.addAll(datas);
        mNewsAdapter.notifyDataChangedAfterLoadMore(true);
    }

    @Override
    public void showProgressDialog() {

    }

    @Override
    public void hideProgressDialog() {
        mSwipeRefreshLayout.post(new Runnable() {
            @Override
            public void run() {
                mSwipeRefreshLayout.setRefreshing(false);
            }
        });
    }

    @Override
    public void showErrorMsg(String msg) {
        SnackBarUtil.showSnackBar(mSwipeRefreshLayout, msg);
    }

    @Override
    public void onRefresh() {
        mNewsPresenter.getNewsData();
    }

    @Override
    public void onItemClick(View view, int i) {
        Intent intent = new Intent(getContext(), NewsDetailActivity.class);
        intent.putExtra("data", mDatas.get(i));
        startActivity(intent);
    }
}
