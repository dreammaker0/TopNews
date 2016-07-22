package com.example.lcy.topnews.net;

import com.example.lcy.topnews.entity.NewsEntity;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by lcy on 2016-5-12.
 */
public interface IApiBiz {
    // 类型,,top(头条，默认),shehui(社会),guonei(国内),guoji(国际),yule(娱乐),tiyu(体育)junshi(军事),keji(科技),caijing(财经),shishang(时尚)
    @GET("index")
    Call<NewsEntity> getNewsData(@Query("type") String type, @Query("key") String key);
}
