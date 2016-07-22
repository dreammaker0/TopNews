package com.example.lcy.topnews.ui.presenter;

import android.text.TextUtils;

import com.example.lcy.topnews.common.Constants;
import com.example.lcy.topnews.entity.NewsEntity;
import com.example.lcy.topnews.net.ApiFactory;
import com.example.lcy.topnews.ui.view.NewsView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * 与其憧憬未来，不如把握现在。
 * Created by lcy on 2016-7-20.
 */
public class NewsPresenter {
    private NewsView mNewsView;
    private String mType;

    public NewsPresenter(NewsView newsView, String type) {
        mNewsView = newsView;
        mType = type;
    }

    public void getNewsData() {
        mNewsView.showProgressDialog();
        ApiFactory.INSTANCE.getAPI().getNewsData(mType, Constants.APP_KEY).enqueue(new Callback<NewsEntity>() {
            @Override
            public void onResponse(Call<NewsEntity> call, Response<NewsEntity> response) {
                mNewsView.hideProgressDialog();
                if (response.code() == 200) {
                    if (TextUtils.equals("1", response.body().getResult().getStat())) {
                        mNewsView.setListData(response.body().getResult().getData());
                    } else {
                        mNewsView.showErrorMsg(response.body().getReason());
                    }
                } else {
                    mNewsView.showErrorMsg(response.message());
                }
            }

            @Override
            public void onFailure(Call<NewsEntity> call, Throwable t) {
                mNewsView.showErrorMsg(t.getMessage());
                mNewsView.hideProgressDialog();
            }
        });
    }
}
