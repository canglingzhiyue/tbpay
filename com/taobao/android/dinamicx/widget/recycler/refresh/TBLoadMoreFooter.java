package com.taobao.android.dinamicx.widget.recycler.refresh;

import android.content.Context;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.recycler.refresh.TBSwipeRefreshLayout;
import tb.kge;

/* loaded from: classes5.dex */
public abstract class TBLoadMoreFooter extends RelativeLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public TBSwipeRefreshLayout.c mPushLoadMoreListener;

    /* loaded from: classes5.dex */
    public enum LoadMoreState {
        NONE,
        PUSH_TO_LOAD,
        RELEASE_TO_LOAD,
        LOADING
    }

    static {
        kge.a(1964136752);
    }

    public abstract void changeToState(LoadMoreState loadMoreState);

    public abstract LoadMoreState getCurrentState();

    public abstract TextView getLoadMoreTipView();

    public abstract void setLoadMoreTipColor(int i);

    public abstract void setLoadMoreTips(String[] strArr);

    public abstract void setProgress(float f);

    public TBLoadMoreFooter(Context context) {
        super(context);
    }

    public void setPushLoadMoreListener(TBSwipeRefreshLayout.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b11e6dfd", new Object[]{this, cVar});
        } else {
            this.mPushLoadMoreListener = cVar;
        }
    }
}
