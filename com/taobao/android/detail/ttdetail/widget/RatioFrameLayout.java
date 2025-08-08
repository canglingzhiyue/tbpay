package com.taobao.android.detail.ttdetail.widget;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class RatioFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private float mFloatWHRatio;
    private String mWHRatio;

    static {
        kge.a(-182283004);
    }

    public static /* synthetic */ Object ipc$super(RatioFrameLayout ratioFrameLayout, String str, Object... objArr) {
        if (str.hashCode() == 650865254) {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public RatioFrameLayout(Context context) {
        super(context);
        this.mFloatWHRatio = -1.0f;
    }

    public RatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mFloatWHRatio = -1.0f;
    }

    public RatioFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mFloatWHRatio = -1.0f;
    }

    public RatioFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mFloatWHRatio = -1.0f;
    }

    public void setWHRatio(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4e539a9", new Object[]{this, str});
        } else if (StringUtils.equals(this.mWHRatio, str)) {
        } else {
            this.mWHRatio = str;
            parseWHRatio();
            requestLayout();
        }
    }

    public String getWHRatio() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b40f89d5", new Object[]{this}) : this.mWHRatio;
    }

    private void parseWHRatio() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58f9ceae", new Object[]{this});
        } else {
            this.mFloatWHRatio = com.taobao.android.detail.ttdetail.utils.f.a(this.mWHRatio, -1.0f);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        if (this.mFloatWHRatio != -1.0f) {
            i2 = View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i) / this.mFloatWHRatio), 1073741824);
        }
        super.onMeasure(i, i2);
    }
}
