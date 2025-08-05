package com.taobao.android.dinamicx.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.view.DXNativeTextView;
import tb.fxl;

/* loaded from: classes5.dex */
public class ap extends af {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_WIDGET_XICONFONTVIEW = -4224482009255257824L;
    public static final long DX_XICONFONTVIEW_DISABLEATTACHTYPEFACE = -7462430612507895697L;

    /* renamed from: a  reason: collision with root package name */
    private boolean f12057a;

    /* loaded from: classes.dex */
    public static class a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new ap();
        }
    }

    public static /* synthetic */ Object ipc$super(ap apVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -740240234) {
            super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
            return null;
        } else if (hashCode == -303753557) {
            super.onRenderView((Context) objArr[0], (View) objArr[1]);
            return null;
        } else if (hashCode != 2119721610) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
            return null;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        if (this.f12057a) {
            return new TNativeIconFontViewV2(context);
        }
        return new TNativeIconFontView(context);
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new ap();
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
        } else if (view == null) {
        } else {
            super.onRenderView(context, view);
            if (!this.f12057a) {
                return;
            }
            Typeface a2 = fxl.a(context);
            if (a2 != null) {
                ((DXNativeTextView) view).setTypeface(a2);
            }
            ((DXNativeTextView) view).setIncludeFontPadding(false);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == DX_XICONFONTVIEW_DISABLEATTACHTYPEFACE) {
            if (i == 1) {
                z = true;
            }
            this.f12057a = z;
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        super.onClone(dXWidgetNode, z);
        if (!(dXWidgetNode instanceof ap)) {
            return;
        }
        this.f12057a = ((ap) dXWidgetNode).f12057a;
    }
}
