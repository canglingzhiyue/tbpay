package com.taobao.android.dinamicx.widget;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.view.DXNativeSwitch;
import tb.kge;

/* loaded from: classes5.dex */
public class bn extends aa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(851047366);
    }

    public static /* synthetic */ Object ipc$super(bn bnVar, String str, Object... objArr) {
        if (str.hashCode() == 1568407179) {
            super.measureWithButter(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void measureWithButter(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d7bfe8b", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.measureWithButter(i, i2);
        DXNativeSwitch dXNativeSwitch = (DXNativeSwitch) getNativeView();
        dXNativeSwitch.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
        if (getLayoutHeight() > 0) {
            return;
        }
        a(dXNativeSwitch.getContext(), dXNativeSwitch, getMeasuredHeight());
    }

    @Override // com.taobao.android.dinamicx.widget.aa, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
        } else if (view == null || !(view instanceof DXNativeSwitch)) {
        } else {
            DXNativeSwitch dXNativeSwitch = (DXNativeSwitch) view;
            dXNativeSwitch.setClickable(true);
            dXNativeSwitch.setTextOn("");
            dXNativeSwitch.setTextOff("");
            dXNativeSwitch.setShowText(false);
            dXNativeSwitch.setThumbTextPadding(0);
            dXNativeSwitch.setSplitTrack(false);
            int layoutHeight = getLayoutHeight();
            if (layoutHeight > 0) {
                a(context, dXNativeSwitch, layoutHeight);
            }
            this.f = true;
            if (this.e != 1) {
                z = false;
            }
            dXNativeSwitch.setChecked(z);
            this.f = false;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void layoutWithButter(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("296ce2f7", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            ((DXNativeSwitch) getNativeView()).layout(i, i2, i3, i4);
        }
    }

    /* loaded from: classes5.dex */
    public static class a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(413901981);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new bn();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.aa, com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new bn();
    }
}
