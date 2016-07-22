package com.example.lcy.topnews.net;

import com.example.lcy.topnews.common.Constants;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * 与其憧憬未来，不如把握现在。
 * Created by lcy on 2016-6-7.
 */
public enum RetrofitClient {
    INSTANCE;

    private final Retrofit mRetrofit;

    RetrofitClient() {
        mRetrofit = new Retrofit.Builder()
                //设置OKHttpClient
                .client(OKHttpFactory.INSTANCE.getOkHttpClient())
                //baseUrl
                .baseUrl(Constants.NEWS_BASE_URL)
                //gson转化器
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
    public Retrofit getRetrofit() {
        return mRetrofit;
    }
}