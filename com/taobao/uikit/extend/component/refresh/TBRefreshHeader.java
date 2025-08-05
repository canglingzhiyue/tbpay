package com.taobao.uikit.extend.component.refresh;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.extend.component.refresh.TBSwipeRefreshLayout;
import tb.kge;

/* loaded from: classes9.dex */
public abstract class TBRefreshHeader extends RelativeLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public TBSwipeRefreshLayout.OnPullRefreshListener mPullRefreshListener;
    public RefreshState mState;

    /* loaded from: classes9.dex */
    public enum RefreshHeaderStyle {
        NORMAL,
        DARK
    }

    /* loaded from: classes9.dex */
    public enum RefreshState {
        NONE,
        PULL_TO_REFRESH,
        RELEASE_TO_REFRESH,
        REFRESHING,
        PREPARE_TO_SECOND_FLOOR,
        SECOND_FLOOR_START,
        SECOND_FLOOR_END;

        @Override // java.lang.Enum
        public String toString() {
            switch (this) {
                case NONE:
                    return "NONE";
                case PULL_TO_REFRESH:
                    return "PULL_TO_REFRESH";
                case RELEASE_TO_REFRESH:
                    return "RELEASE_TO_REFRESH";
                case REFRESHING:
                    return "REFRESHING";
                case PREPARE_TO_SECOND_FLOOR:
                    return "PREPARE_TO_SECOND_FLOOR";
                case SECOND_FLOOR_START:
                    return "SECOND_FLOOR_START";
                case SECOND_FLOOR_END:
                    return "SECOND_FLOOR_END";
                default:
                    return "";
            }
        }
    }

    static {
        kge.a(-403857889);
    }

    public abstract void changeToState(RefreshState refreshState);

    public abstract View getRefreshView();

    public abstract View getSecondFloorView();

    public abstract void setProgress(float f);

    public abstract void setRefreshAnimation(String[] strArr, String str);

    public abstract void setRefreshTipColor(int i);

    public abstract void setRefreshTips(String[] strArr);

    public abstract void setSecondFloorView(View view);

    public void switchStyle(RefreshHeaderStyle refreshHeaderStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbda9585", new Object[]{this, refreshHeaderStyle});
        }
    }

    public TBRefreshHeader(Context context) {
        super(context);
        this.mState = RefreshState.NONE;
    }

    public RefreshState getCurrentState() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RefreshState) ipChange.ipc$dispatch("89567db5", new Object[]{this}) : this.mState;
    }

    public void setPullRefreshListener(TBSwipeRefreshLayout.OnPullRefreshListener onPullRefreshListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6f373e3", new Object[]{this, onPullRefreshListener});
        } else {
            this.mPullRefreshListener = onPullRefreshListener;
        }
    }
}
