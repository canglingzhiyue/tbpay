package com.taobao.uikit.extend.component.refresh;

import android.content.Context;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout;
import tb.kge;

/* loaded from: classes9.dex */
public abstract class TBLoadMoreFooter extends RelativeLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public TBSwipeRefreshLayout.OnPushLoadMoreListener mPushLoadMoreListener;

    /* loaded from: classes9.dex */
    public enum LoadMoreState {
        NONE,
        PUSH_TO_LOAD,
        RELEASE_TO_LOAD,
        LOADING
    }

    static {
        kge.a(1904742623);
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

    public void setPushLoadMoreListener(TBSwipeRefreshLayout.OnPushLoadMoreListener onPushLoadMoreListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40699777", new Object[]{this, onPushLoadMoreListener});
        } else {
            this.mPushLoadMoreListener = onPushLoadMoreListener;
        }
    }
}
