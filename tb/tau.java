package tb;

import android.content.Context;
import android.graphics.drawable.Drawable;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.view.dinamic_ext.DetailRichTextViewByCouponConstructor;
import com.taobao.android.detail.ttdetail.transfer.widget.coupon.XRichTextViewByCouponV3;
import com.taobao.android.detail.ttdetail.utils.y;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.af;
import com.taobao.android.dinamicx.widget.ak;
import tb.tbj;

/* loaded from: classes5.dex */
public class tau extends af {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final long DX_EVENT_ID;

    /* renamed from: a  reason: collision with root package name */
    public static long f33998a;
    public static long b;
    public static long c;
    public static long d;
    public static long e;
    public static long f;
    public static long g;
    public static long h;
    public static long i;
    public int j = 0;
    public int k = 1;
    public int l = 0;
    public int m = 0;
    public String n = "";
    public String o = "";
    public String p = "";
    public boolean q = false;
    public String r = com.taobao.android.weex_framework.util.a.ATOM_EXT_yellow;
    private XRichTextViewByCouponV3 s;

    public static /* synthetic */ Object ipc$super(tau tauVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            case -732824995:
                super.onBeforeMeasure((TextView) objArr[0]);
                return null;
            case -303753557:
                super.onRenderView((Context) objArr[0], (View) objArr[1]);
                return null;
            case 650865254:
                super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case 1115049375:
                super.onSetStringAttribute(((Number) objArr[0]).longValue(), (String) objArr[1]);
                return null;
            case 1184746505:
                return super.getDefaultValueForAttr(((Number) objArr[0]).longValue());
            case 2119721610:
                super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    static {
        kge.a(1218941327);
        long a2 = fxa.a(DetailRichTextViewByCouponConstructor.VIEW_TAG);
        DX_EVENT_ID = a2;
        f33998a = a2;
        b = -6563447616862746523L;
        c = 6129867569828159030L;
        d = -552088275168974636L;
        e = -552088275168515870L;
        f = -485287024816320973L;
        g = 1114549396929390636L;
        h = -196800204739237802L;
        i = -8863296171374004228L;
    }

    public tau() {
    }

    public tau(Context context) {
    }

    /* loaded from: classes5.dex */
    public static class a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1399286118);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new tau();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new tau();
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        this.s = new XRichTextViewByCouponV3(context);
        return this.s;
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        if (!(view instanceof XRichTextViewByCouponV3)) {
            return;
        }
        a((XRichTextViewByCouponV3) view);
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        super.onClone(dXWidgetNode, z);
        if (!(dXWidgetNode instanceof tau)) {
            return;
        }
        tau tauVar = (tau) dXWidgetNode;
        this.j = tauVar.j;
        this.k = tauVar.k;
        this.l = tauVar.l;
        this.m = tauVar.m;
        this.o = tauVar.o;
        this.n = tauVar.n;
        this.p = tauVar.p;
        this.q = tauVar.q;
        this.r = tauVar.r;
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i2), new Integer(i3)});
        } else {
            super.onMeasure(i2, i3);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.af
    public void onBeforeMeasure(TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d451fa5d", new Object[]{this, textView});
            return;
        }
        super.onBeforeMeasure(textView);
        a(textView);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public Object getDefaultValueForAttr(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("469dcc09", new Object[]{this, new Long(j)}) : i == j ? com.taobao.android.weex_framework.util.a.ATOM_EXT_yellow : super.getDefaultValueForAttr(j);
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i2)});
            return;
        }
        super.onSetIntAttribute(j, i2);
        if (b == j) {
            this.j = i2;
        }
        if (d == j) {
            this.l = i2;
        }
        if (e == j) {
            this.m = i2;
        }
        if (h != j) {
            return;
        }
        if (i2 == 1) {
            this.q = true;
        } else {
            this.q = false;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
            return;
        }
        super.onSetStringAttribute(j, str);
        if (c == j) {
            this.n = str;
        }
        if (f == j) {
            this.o = str;
        }
        if (g == j) {
            this.p = str;
        }
        if (i != j) {
            return;
        }
        this.r = str;
    }

    private void a(TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a92d3edc", new Object[]{this, textView});
        } else if (!(textView instanceof XRichTextViewByCouponV3)) {
        } else {
            a((XRichTextViewByCouponV3) textView, this.o, this.p, this.n, this.j, this.l, this.m, this.q, this.r);
        }
    }

    public void a(final XRichTextViewByCouponV3 xRichTextViewByCouponV3, String str, String str2, String str3, int i2, int i3, int i4, boolean z, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5b033c1", new Object[]{this, xRichTextViewByCouponV3, str, str2, str3, new Integer(i2), new Integer(i3), new Integer(i4), new Boolean(z), str4});
        } else if (xRichTextViewByCouponV3 == null) {
        } else {
            if (!StringUtils.isEmpty(str)) {
                xRichTextViewByCouponV3.setSeparator(str);
            }
            xRichTextViewByCouponV3.setXIconHeight(i2);
            xRichTextViewByCouponV3.setTextBgPaddingH(i3);
            xRichTextViewByCouponV3.setTextBgPaddingV(i4);
            xRichTextViewByCouponV3.setIcon(null);
            if (!StringUtils.isEmpty(str2)) {
                tbj.a(str2, y.a(xRichTextViewByCouponV3), new tbj.a() { // from class: tb.tau.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.tbj.a
                    public void a(Drawable drawable) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("dd037b8c", new Object[]{this, drawable});
                        } else {
                            xRichTextViewByCouponV3.setTextBackground(drawable);
                        }
                    }
                }, null);
            }
            if (StringUtils.isEmpty(str3)) {
                return;
            }
            tbj.a(str3, y.a(xRichTextViewByCouponV3), new tbj.a() { // from class: tb.tau.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.tbj.a
                public void a(Drawable drawable) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("dd037b8c", new Object[]{this, drawable});
                    } else {
                        xRichTextViewByCouponV3.setIcon(drawable);
                    }
                }
            }, null);
        }
    }
}
