package com.example.lcy.topnews.base;

import android.app.Application;
import android.content.Context;

import com.orhanobut.logger.Logger;


/**
 * 与其憧憬未来，不如把握现在。
 * Created by lcy on 2016-6-7.
 */
public class BaseApplication extends Application {
    public static Context mContext;


    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;
        // 初始化日志得到TAG
        Logger.init("lcy");
    }

}
