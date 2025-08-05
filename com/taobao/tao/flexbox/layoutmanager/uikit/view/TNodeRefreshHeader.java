package com.taobao.tao.flexbox.layoutmanager.uikit.view;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.extend.component.refresh.TBOldRefreshHeader;
import com.taobao.uikit.extend.component.refresh.TBRefreshHeader;
import com.taobao.uikit.feature.features.internal.pullrefresh.CustomProgressBar;
import com.taobao.uikit.feature.features.internal.pullrefresh.RefreshHeadView;
import tb.kge;
import tb.oeb;

/* loaded from: classes8.dex */
public class TNodeRefreshHeader extends TBOldRefreshHeader {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private float mRefreshTriggerPercent;
    private RefreshHeadView refreshHeadView;
    private CustomProgressBar refreshProgressView;

    static {
        kge.a(573498406);
    }

    public static /* synthetic */ Object ipc$super(TNodeRefreshHeader tNodeRefreshHeader, String str, Object... objArr) {
        if (str.hashCode() == 2079336650) {
            super.setProgress(((Number) objArr[0]).floatValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public TNodeRefreshHeader(Context context, float f, int i) {
        super(context);
        this.mRefreshTriggerPercent = f;
        if (getRefreshView() instanceof RefreshHeadView) {
            this.refreshHeadView = (RefreshHeadView) getRefreshView();
            this.refreshProgressView = this.refreshHeadView.getProgressbar();
            setRefreshTipSize(12);
        }
        setRefreshColor(i);
    }

    public void setRefreshColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("476ee2d2", new Object[]{this, new Integer(i)});
            return;
        }
        RefreshHeadView refreshHeadView = this.refreshHeadView;
        if (refreshHeadView == null) {
            return;
        }
        refreshHeadView.setRefreshViewColor(i);
    }

    @Override // com.taobao.uikit.extend.component.refresh.TBOldRefreshHeader, com.taobao.uikit.extend.component.refresh.TBRefreshHeader
    public void setProgress(float f) {
        CustomProgressBar customProgressBar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bf028ca", new Object[]{this, new Float(f)});
            return;
        }
        float f2 = this.mRefreshTriggerPercent;
        if (f2 > 0.0f) {
            f = f <= f2 ? 0.0f : (f - f2) * 2.0f;
        }
        if (oeb.aB()) {
            if (this.mState != TBRefreshHeader.RefreshState.PULL_TO_REFRESH && this.mState != TBRefreshHeader.RefreshState.RELEASE_TO_REFRESH) {
                return;
            }
            if (getMeasuredHeight() != 0 && (customProgressBar = this.refreshProgressView) != null) {
                customProgressBar.changeProgressBarState((int) (getMeasuredHeight() * f));
            }
            changeHeaderAlpha(f);
            return;
        }
        super.setProgress(f);
    }
}
