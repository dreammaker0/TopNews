package com.example.lcy.topnews.ui.adapter;

import android.view.View;
import android.widget.ImageView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.lcy.topnews.R;
import com.example.lcy.topnews.entity.NewsEntity;
import com.example.lcy.topnews.util.DateFormatterUtils;
import com.example.lcy.topnews.util.ImageManager;

import java.util.List;

/**
 * 与其憧憬未来，不如把握现在。
 * Created by lcy on 2016-7-21.
 */
public class NewsAdapter extends BaseQuickAdapter<NewsEntity.ResultBean.DataBean> {
    public NewsAdapter(View contentView, List<NewsEntity.ResultBean.DataBean> data) {
        super(contentView, data);
    }

    public NewsAdapter(int layoutResId, List<NewsEntity.ResultBean.DataBean> data) {
        super(layoutResId, data);
    }

    public NewsAdapter(List<NewsEntity.ResultBean.DataBean> data) {
        super(data);
    }

    @Override
    protected void convert(BaseViewHolder baseViewHolder, NewsEntity.ResultBean.DataBean dataBean) {
        baseViewHolder.setText(R.id.tv_title, dataBean.getTitle())
                      .setText(R.id.tv_author, dataBean.getAuthor_name())
                      .setText(R.id.tv_date, DateFormatterUtils.dateString2GoodExperienceFormat(dataBean.getDate()));
        ImageManager.getInstance().loadUrlImage(mContext, dataBean.getThumbnail_pic_s(), (ImageView) baseViewHolder.getView(R.id.iv_img));

    }
}
