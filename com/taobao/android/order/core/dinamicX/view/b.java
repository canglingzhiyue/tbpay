package com.taobao.android.order.core.dinamicX.view;

import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.af;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import tb.hzy;
import tb.kge;

/* loaded from: classes6.dex */
public class b extends af {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PRICE_VIEW = -1774401487317544297L;
    public static final long DX_PRICE_VIEW_DECIMAL_SCALE = 1173920119500817859L;
    public static final long DX_PRICE_VIEW_PRICE = 19050247891224L;
    public static final long DX_PRICE_VIEW_SYMBOL_SCALE = 3292072420574688137L;

    /* renamed from: a  reason: collision with root package name */
    private static Pattern f14620a;
    private static Pattern b;
    private float c = 0.625f;
    private String d = "";
    private float e = 0.625f;

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1806543962:
                return new Double(super.getDefaultValueForDoubleAttr(((Number) objArr[0]).longValue()));
            case -638169079:
                super.onSetDoubleAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).doubleValue());
                return null;
            case 253729832:
                return super.getDefaultValueForStringAttr(((Number) objArr[0]).longValue());
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    static {
        kge.a(-1706436064);
        f14620a = Pattern.compile("[0-9]");
        b = Pattern.compile("[.]");
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new b();
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        hzy.a("DXPriceViewWidgetNode", "onClone", "----");
        if (dXWidgetNode == null || !(dXWidgetNode instanceof b)) {
            return;
        }
        super.onClone(dXWidgetNode, z);
        b bVar = (b) dXWidgetNode;
        this.c = bVar.c;
        this.d = bVar.d;
        this.e = bVar.e;
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        setText(a());
        super.onMeasure(i, i2);
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == DX_PRICE_VIEW_PRICE) {
            this.d = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetDoubleAttribute(long j, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f65009", new Object[]{this, new Long(j), new Double(d)});
        } else if (j == DX_PRICE_VIEW_DECIMAL_SCALE) {
            this.c = (float) d;
            if (this.c > 0.0f) {
                return;
            }
            this.c = 0.625f;
        } else if (j == DX_PRICE_VIEW_SYMBOL_SCALE) {
            this.e = (float) d;
            if (this.e > 0.0f) {
                return;
            }
            this.e = 0.625f;
        } else {
            super.onSetDoubleAttribute(j, d);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public String getDefaultValueForStringAttr(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f1f9c28", new Object[]{this, new Long(j)}) : j == DX_PRICE_VIEW_PRICE ? "" : super.getDefaultValueForStringAttr(j);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public double getDefaultValueForDoubleAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("945253a6", new Object[]{this, new Long(j)})).doubleValue();
        }
        if (j != DX_PRICE_VIEW_DECIMAL_SCALE && j != DX_PRICE_VIEW_SYMBOL_SCALE) {
            return super.getDefaultValueForDoubleAttr(j);
        }
        return 0.625d;
    }

    private CharSequence a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("d6b54652", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.d)) {
            return null;
        }
        SpannableString spannableString = new SpannableString(this.d);
        int i = -1;
        Matcher matcher = b.matcher(this.d);
        if (matcher.find()) {
            i = matcher.end();
        }
        Matcher matcher2 = f14620a.matcher(this.d);
        int start = matcher2.find() ? matcher2.start() : 0;
        int length = this.d.length();
        if (start != 0) {
            spannableString.setSpan(new RelativeSizeSpan(this.e), 0, start, 33);
        }
        if (i >= 0 && i != length) {
            spannableString.setSpan(new RelativeSizeSpan(this.c), i, length, 33);
        }
        return spannableString;
    }
}
