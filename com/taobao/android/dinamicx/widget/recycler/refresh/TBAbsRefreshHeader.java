package com.taobao.android.dinamicx.widget.recycler.refresh;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.recycler.refresh.TBSwipeRefreshLayout;
import tb.kge;

/* loaded from: classes5.dex */
public abstract class TBAbsRefreshHeader extends RelativeLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public TBSwipeRefreshLayout.b mPullRefreshListener;
    public RefreshState mState;

    /* loaded from: classes5.dex */
    public enum RefreshHeaderStyle {
        NORMAL,
        DARK
    }

    /* loaded from: classes5.dex */
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
        kge.a(1583200720);
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
            ipChange.ipc$dispatch("33155d40", new Object[]{this, refreshHeaderStyle});
        }
    }

    public TBAbsRefreshHeader(Context context) {
        super(context);
        this.mState = RefreshState.NONE;
    }

    public RefreshState getCurrentState() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RefreshState) ipChange.ipc$dispatch("8c02439c", new Object[]{this}) : this.mState;
    }

    public void setPullRefreshListener(TBSwipeRefreshLayout.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("983fc19b", new Object[]{this, bVar});
        } else {
            this.mPullRefreshListener = bVar;
        }
    }
}
