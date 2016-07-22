package com.example.lcy.topnews.base;

import android.os.Bundle;
import android.view.KeyEvent;

import com.example.lcy.topnews.util.DoubleClickExitUtil;

import butterknife.ButterKnife;
import me.imid.swipebacklayout.lib.SwipeBackLayout;
import me.imid.swipebacklayout.lib.app.SwipeBackActivity;

/**
 * 与其憧憬未来，不如把握现在。
 * Created by lcy on 2016-7-12.
 */
public abstract class BaseAppCompatActivity extends SwipeBackActivity {
    private SwipeBackLayout mSwipeBackLayout;

    private DoubleClickExitUtil mDoubleClickExitUtil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getContentViewId());
        ButterKnife.bind(this);
        mSwipeBackLayout = getSwipeBackLayout();
        setSwipeBackEnable(setSwipeBackEnable());
        mSwipeBackLayout.setEdgeTrackingEnabled(SwipeBackLayout.EDGE_LEFT);
        initViewsAndDatas(savedInstanceState);
        BaseAppManager.getInstance().addActivity(this);
        mDoubleClickExitUtil = new DoubleClickExitUtil(this);
    }

    protected abstract boolean setSwipeBackEnable();

    protected abstract void initViewsAndDatas(Bundle savedInstanceState);

    protected abstract int getContentViewId();

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (event.getKeyCode() == KeyEvent.KEYCODE_BACK) {
            return mDoubleClickExitUtil.onKeyDown(keyCode, event);
        }
        return super.onKeyDown(keyCode, event);
    }
}
