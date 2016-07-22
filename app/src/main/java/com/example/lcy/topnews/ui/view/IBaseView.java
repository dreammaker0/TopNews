package com.example.lcy.topnews.ui.view;

import com.example.lcy.topnews.entity.NewsEntity;

import java.util.List;

/**
 * Created by lcy on 2016/2/16.
 */
public interface IBaseView {

    void setListData(List<NewsEntity.ResultBean.DataBean> datas);

    void showProgressDialog();

    void hideProgressDialog();

    void showErrorMsg(String msg);

    /*void showProgress();

    void hideProgress();

    void showFailedError(String error);

    void showEmpty();

    void showNetError();*/
}
