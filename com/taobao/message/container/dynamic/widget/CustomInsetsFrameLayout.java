package com.taobao.message.container.dynamic.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public class CustomInsetsFrameLayout extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int[] mInsets;

    static {
        kge.a(-1201151202);
    }

    public static /* synthetic */ Object ipc$super(CustomInsetsFrameLayout customInsetsFrameLayout, String str, Object... objArr) {
        if (str.hashCode() == -857843821) {
            return new Boolean(super.fitSystemWindows((Rect) objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public CustomInsetsFrameLayout(Context context) {
        super(context);
        this.mInsets = new int[4];
    }

    public CustomInsetsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mInsets = new int[4];
    }

    public CustomInsetsFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mInsets = new int[4];
    }

    public final int[] getInsets() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (int[]) ipChange.ipc$dispatch("38f1fad1", new Object[]{this}) : this.mInsets;
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ccde5793", new Object[]{this, rect})).booleanValue();
        }
        this.mInsets[0] = rect.left;
        this.mInsets[1] = rect.top;
        this.mInsets[2] = rect.right;
        this.mInsets[3] = rect.bottom;
        rect.left = 0;
        rect.top = 0;
        rect.right = 0;
        return super.fitSystemWindows(rect);
    }
}
