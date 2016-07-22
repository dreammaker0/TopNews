package com.example.lcy.topnews.util;

import android.content.res.Resources;
import android.graphics.Color;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.widget.TextView;

import com.example.lcy.topnews.R;
import com.example.lcy.topnews.base.BaseApplication;

/**
 * 与其憧憬未来，不如把握现在。
 * Created by lcy on 2016-7-22.
 */
public class SnackBarUtil {

    public static void showSnackBar(View view, int id) {
        Resources resources  = BaseApplication.mContext.getResources();
        Snackbar sb = Snackbar.make(view, resources.getString(id), Snackbar.LENGTH_SHORT);
        setSnackbarMessageTextColor(sb);
        sb.getView().setBackgroundColor(resources.getColor( R.color.snackbar_bg));
        sb.show();
    }

    public static void showSnackBar(View view, String msg) {
        Resources resources  = BaseApplication.mContext.getResources();
        Snackbar sb = Snackbar.make(view, msg, Snackbar.LENGTH_SHORT);
        setSnackbarMessageTextColor(sb);
        sb.getView().setBackgroundColor(resources.getColor( R.color.snackbar_bg));
        sb.show();
    }

    public static void setSnackbarMessageTextColor(Snackbar snackbar) {
        View view = snackbar.getView();
        ((TextView) view.findViewById(R.id.snackbar_text)).setTextColor(Color.parseColor("#448AFF"));
    }
}
