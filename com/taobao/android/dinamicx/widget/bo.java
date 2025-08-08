package com.taobao.android.dinamicx.widget;

import android.content.Context;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.view.DXNativeTextView;
import tb.gaz;
import tb.kge;

/* loaded from: classes5.dex */
public class bo extends af {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private DXNativeTextView f12086a;

    static {
        kge.a(940339583);
    }

    public static /* synthetic */ Object ipc$super(bo boVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -740240234) {
            super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
            return null;
        } else if (hashCode == 1115049375) {
            super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
            return null;
        } else if (hashCode != 2119721610) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
            return null;
        }
    }

    public bo(Context context) {
        super(context);
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        DXNativeTextView dXNativeTextView = new DXNativeTextView(context);
        dXNativeTextView.setTextColor(getTextColor());
        dXNativeTextView.setTextSize(0, getTextSize());
        setNativeTextStyle(dXNativeTextView, getTextStyle());
        setNativeMaxLines(dXNativeTextView, getMaxLines());
        setNativeTextGravity(dXNativeTextView, getTextGravity());
        setNativeTextIncludeFontPadding(dXNativeTextView, true);
        this.f12086a = dXNativeTextView;
        return dXNativeTextView;
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else {
            super.onClone(dXWidgetNode, z);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void measureWithButter(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d7bfe8b", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        if (StringUtils.isEmpty(getText()) && getLayoutHeight() == -2) {
            this.f12086a.measure(i, View.MeasureSpec.makeMeasureSpec(0, 1073741824));
        } else {
            this.f12086a.measure(i, i2);
        }
        setMeasuredDimension(this.f12086a.getMeasuredWidthAndState(), this.f12086a.getMeasuredHeightAndState());
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void layoutWithButter(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("296ce2f7", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            this.f12086a.layout(i, i2, i3, i4);
        }
    }

    /* loaded from: classes5.dex */
    public static class a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1000692054);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new bo((Context) obj);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new bo((Context) obj);
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (5737767606580872653L == j) {
            setTextColor(i);
            this.f12086a.setTextColor(tryFetchDarkModeColor("textColor", 0, i));
        } else if (-1564827143683948874L == j) {
            setTextGravity(i);
            setNativeTextGravity(this.f12086a, i);
        } else if (4685059187929305417L == j) {
            setMaxLines(i);
            this.f12086a.setMaxLines(getMaxLines());
        } else if (gaz.DXRICHTEXT_MAXWIDTH == j) {
            setMaxWidth(i);
            this.f12086a.setMaxWidth(getMaxWidth());
        } else if (1650157837879951391L == j) {
            setLineBreakMode(i);
            setNativeEllipsize(this.f12086a, getLineBreakMode());
        } else if (j == 1046654090308105836L) {
            if (i == 0) {
                z = false;
            }
            setIncludeFontPadding_Android(z);
            setNativeTextIncludeFontPadding(this.f12086a, isIncludeFontPadding_Android());
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (38178040921L == j) {
            setText(str);
            setNativeText(this.f12086a, getText());
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        DXRuntimeContext dXRuntimeContext;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        if (!StringUtils.isEmpty(getFont())) {
            setNativeTextFont(this.f12086a, getFont(), getTextStyle());
        } else if (getTextStyle() != -1) {
            setNativeTextStyle(this.f12086a, getTextStyle());
        }
        setNativeTextFlags(this.f12086a, getTextFlags());
        if (isEnableTextSizeStrategy() && (dXRuntimeContext = getDXRuntimeContext()) != null) {
            DXEngineConfig a2 = dXRuntimeContext.C().a();
            if (a2 == null || !a2.n()) {
                z = false;
            }
            if (z) {
                setTextSize(com.taobao.android.dinamicx.p.a(dXRuntimeContext, getTextSize()));
            }
        }
        this.f12086a.setTextSize(0, getTextSize());
        setAutoSizeTextTypeUniformWithConfiguration(this.f12086a, isAutoSizeMinTextSize(), isAutoSizeMaxTextSize());
    }
}
