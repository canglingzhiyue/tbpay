package com.taobao.android.dinamicx.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatCheckBox;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class bj extends g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-715010443);
    }

    public static /* synthetic */ Object ipc$super(bj bjVar, String str, Object... objArr) {
        if (str.hashCode() == 1568407179) {
            super.measureWithButter(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBeginSetConstAttribute(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad746430", new Object[]{this, context});
        }
    }

    public bj() {
        a(true);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onEndSetConstAttribute(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6436122", new Object[]{this, context});
        } else {
            createNativeView(context);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void measureWithButter(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d7bfe8b", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.measureWithButter(i, i2);
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) getNativeView();
        appCompatCheckBox.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
        if (getLayoutWidth() > 0 && getLayoutHeight() > 0) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth > 0 && measuredHeight > 0) {
            a(appCompatCheckBox, measuredWidth, measuredHeight);
        } else {
            appCompatCheckBox.setButtonDrawable((Drawable) null);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void layoutWithButter(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("296ce2f7", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            ((AppCompatCheckBox) getNativeView()).layout(i, i2, i3, i4);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.g, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
        } else if (view == null || !(view instanceof AppCompatCheckBox)) {
        } else {
            AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) view;
            appCompatCheckBox.setClickable(true);
            int layoutWidth = getLayoutWidth();
            int layoutHeight = getLayoutHeight();
            if (layoutWidth > 0 && layoutHeight > 0) {
                a(appCompatCheckBox, layoutWidth, layoutHeight);
            } else {
                appCompatCheckBox.setButtonDrawable((Drawable) null);
            }
            if (a() == 1) {
                z = true;
            }
            a(appCompatCheckBox, z);
        }
    }

    /* loaded from: classes5.dex */
    public static class a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-979279796);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new bj();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.g, com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new bj();
    }
}
