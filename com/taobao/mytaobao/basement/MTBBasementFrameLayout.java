package com.taobao.mytaobao.basement;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public class MTBBasementFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int mBasementHeight;

    static {
        kge.a(-874134101);
    }

    public static /* synthetic */ Object ipc$super(MTBBasementFrameLayout mTBBasementFrameLayout, String str, Object... objArr) {
        if (str.hashCode() == 77186020) {
            super.setLayoutParams((ViewGroup.LayoutParams) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public MTBBasementFrameLayout(Context context) {
        super(context);
        this.mBasementHeight = 0;
    }

    public MTBBasementFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mBasementHeight = 0;
    }

    public MTBBasementFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mBasementHeight = 0;
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("499c3e4", new Object[]{this, layoutParams});
            return;
        }
        int i = this.mBasementHeight;
        if (i != 0) {
            layoutParams.height = i;
        }
        super.setLayoutParams(layoutParams);
    }

    public void setParamsWidthAndHeight(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd36f087", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.mBasementHeight = i2;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        layoutParams.width = i;
        layoutParams.height = i2;
        setLayoutParams(layoutParams);
    }
}
