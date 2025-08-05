package tb;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.view.holder.main.dinamic3.view.XRichTextViewByCategoryCouponV3;
import com.taobao.android.detail.datasdk.protocol.adapter.core.c;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.af;
import com.taobao.android.dinamicx.widget.ak;

/* loaded from: classes4.dex */
public class ebg extends af {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static long f27163a;
    public static long b;
    public static long c;
    public static long d;
    public static long e;
    public static long f;
    public static long g;
    public static long h;
    public static long i;
    public static long j;
    public static long k;
    public static long l;
    public static long m;
    public static long n;
    public static long o;
    public static long p;
    public static long q;
    private XRichTextViewByCategoryCouponV3 J;
    public String r = "";
    public String s = "";
    public String t = "";
    public String u = "";
    public String v = "";
    public String w = "";
    public String x = "";
    public String y = "";
    public String z = "";
    public String A = "";
    public String B = "";
    public String C = "";
    public String D = "";
    public String E = "";
    public String F = "";
    public String G = "";
    public String H = "";
    public JSONArray I = null;

    public static /* synthetic */ Object ipc$super(ebg ebgVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -879570230:
                super.onSetListAttribute(((Number) objArr[0]).longValue(), (JSONArray) objArr[1]);
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
        kge.a(1888645468);
        f27163a = -1249277414851879911L;
        b = 8149065464571961125L;
        c = -6563447616862746523L;
        d = -6563447616862746523L;
        e = -552088275168515870L;
        f = -196800204739237802L;
        g = -8863296171374004228L;
        h = 4066839280822632728L;
        i = 3958981860664598988L;
        j = -8289030898177851598L;
        k = -3577052199863591922L;
        l = 7896749355056729660L;
        m = -1485582649622385638L;
        n = -1482726928486703333L;
        o = -1566266168168592847L;
        p = -2856314709562814107L;
        q = 878022811155589830L;
    }

    public ebg() {
        emu.a("com.taobao.android.detail.core.detail.kit.view.holder.main.dinamic3.widget.XRichTextViewByCategoryCouponWidgetNode");
    }

    public ebg(Context context) {
        emu.a("com.taobao.android.detail.core.detail.kit.view.holder.main.dinamic3.widget.XRichTextViewByCategoryCouponWidgetNode");
    }

    /* loaded from: classes4.dex */
    public static class a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1221602355);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new ebg();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new ebg();
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        this.J = new XRichTextViewByCategoryCouponV3(context);
        return this.J;
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
            return;
        }
        super.onRenderView(context, view);
        if (!(view instanceof XRichTextViewByCategoryCouponV3)) {
            return;
        }
        a((XRichTextViewByCategoryCouponV3) view);
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        super.onClone(dXWidgetNode, z);
        if (!(dXWidgetNode instanceof ebg)) {
            return;
        }
        ebg ebgVar = (ebg) dXWidgetNode;
        if (z) {
            JSONArray jSONArray = ebgVar.I;
            if (jSONArray != null) {
                this.I = (JSONArray) jSONArray.clone();
            }
        } else {
            this.I = ebgVar.I;
        }
        this.s = ebgVar.s;
        this.t = ebgVar.t;
        this.u = ebgVar.u;
        this.v = ebgVar.v;
        this.w = ebgVar.w;
        this.x = ebgVar.x;
        this.y = ebgVar.y;
        this.A = ebgVar.A;
        this.B = ebgVar.B;
        this.C = ebgVar.C;
        this.D = ebgVar.D;
        this.E = ebgVar.E;
        this.F = ebgVar.F;
        this.G = ebgVar.G;
        this.H = ebgVar.H;
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i2), new Integer(i3)});
            return;
        }
        super.onMeasure(i2, i3);
        XRichTextViewByCategoryCouponV3 xRichTextViewByCategoryCouponV3 = this.J;
        if (xRichTextViewByCategoryCouponV3 == null) {
            return;
        }
        setMeasuredDimension(xRichTextViewByCategoryCouponV3.getMeasuredWidthAndState(), this.J.getMeasuredHeightAndState());
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
    public Object getDefaultValueForAttr(long j2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("469dcc09", new Object[]{this, new Long(j2)}) : super.getDefaultValueForAttr(j2);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetListAttribute(long j2, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb92d2ca", new Object[]{this, new Long(j2), jSONArray});
            return;
        }
        super.onSetListAttribute(j2, jSONArray);
        if (b != j2) {
            return;
        }
        this.I = jSONArray;
    }

    @Override // com.taobao.android.dinamicx.widget.af, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j2), str});
            return;
        }
        super.onSetStringAttribute(j2, str);
        if (c == j2) {
            this.s = str;
        }
        if (d == j2) {
            this.t = str;
        }
        if (e == j2) {
            this.u = str;
        }
        if (f == j2) {
            this.v = str;
        }
        if (g == j2) {
            this.w = str;
        }
        if (h == j2) {
            this.x = str;
        }
        if (i == j2) {
            this.y = str;
        }
        if (j == j2) {
            this.A = str;
        }
        if (k == j2) {
            this.B = str;
        }
        if (l == j2) {
            this.C = str;
        }
        if (m == j2) {
            this.D = str;
        }
        if (n == j2) {
            this.E = str;
        }
        if (o == j2) {
            this.F = str;
        }
        if (p == j2) {
            this.G = str;
        }
        if (q != j2) {
            return;
        }
        this.H = str;
    }

    private void a(TextView textView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a92d3edc", new Object[]{this, textView});
            return;
        }
        try {
            if (!(textView instanceof XRichTextViewByCategoryCouponV3)) {
                return;
            }
            a((XRichTextViewByCategoryCouponV3) textView, this.s, this.u, this.x, this.y, this.z, this.A, this.I, this.B, this.C, this.D, this.E, this.F, this.H, this.G);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void a(View view, String str, String str2, String str3, String str4, String str5, String str6, JSONArray jSONArray, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30490e54", new Object[]{this, view, str, str2, str3, str4, str5, str6, jSONArray, str7, str8, str9, str10, str11, str12, str13});
        } else if (view == null) {
        } else {
            final XRichTextViewByCategoryCouponV3 xRichTextViewByCategoryCouponV3 = (XRichTextViewByCategoryCouponV3) view;
            if (!TextUtils.isEmpty(str)) {
                xRichTextViewByCategoryCouponV3.setXIconHeight(Float.parseFloat(str));
            }
            if (!TextUtils.isEmpty(str2)) {
                xRichTextViewByCategoryCouponV3.setTextBgPaddingV(Float.parseFloat(str2));
            }
            if (!TextUtils.isEmpty(str3)) {
                xRichTextViewByCategoryCouponV3.setVIPTextColor(str3);
            }
            if (!TextUtils.isEmpty(str4)) {
                xRichTextViewByCategoryCouponV3.setTextLeftGap(Float.parseFloat(str4));
            }
            if (!TextUtils.isEmpty(str5)) {
                xRichTextViewByCategoryCouponV3.setVIPTextLeftGap(Float.parseFloat(str5));
            }
            if (!TextUtils.isEmpty(str6)) {
                xRichTextViewByCategoryCouponV3.setVIPTextRightGap(Float.parseFloat(str6));
            }
            if (!TextUtils.isEmpty(str7)) {
                xRichTextViewByCategoryCouponV3.setCouponGap(Float.parseFloat(str7));
            }
            if (!TextUtils.isEmpty(str9)) {
                xRichTextViewByCategoryCouponV3.setSplitLineColor(str9);
            }
            if (!TextUtils.isEmpty(str10)) {
                xRichTextViewByCategoryCouponV3.setSplitLineWidth(Float.parseFloat(str10));
            }
            if (!TextUtils.isEmpty(str11)) {
                xRichTextViewByCategoryCouponV3.setSplitLineGap(Float.parseFloat(str11));
            }
            if (!TextUtils.isEmpty(str13)) {
                xRichTextViewByCategoryCouponV3.setEllipsisSize(Integer.parseInt(str13));
            }
            if (jSONArray != null) {
                xRichTextViewByCategoryCouponV3.setBonusList(jSONArray);
            }
            if (!TextUtils.isEmpty(str12)) {
                xRichTextViewByCategoryCouponV3.setEllipsis(str12);
            }
            xRichTextViewByCategoryCouponV3.setIcon(null);
            if (TextUtils.isEmpty(str8)) {
                return;
            }
            dzv.a(str8, xRichTextViewByCategoryCouponV3.getContext(), new c.a() { // from class: tb.ebg.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.detail.datasdk.protocol.adapter.core.c.a
                public void a(Drawable drawable) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("dd037b8c", new Object[]{this, drawable});
                    } else {
                        xRichTextViewByCategoryCouponV3.setIcon(drawable);
                    }
                }
            }, null);
        }
    }
}
