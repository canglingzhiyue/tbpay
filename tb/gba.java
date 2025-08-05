package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.DXRichTextLinkEvent;
import com.taobao.android.dinamicx.expression.event.DXRichTextPressEvent;
import com.taobao.android.dinamicx.view.richtext.node.b;
import com.taobao.android.dinamicx.view.richtext.node.c;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.ak;
import tb.mto;

/* loaded from: classes5.dex */
public class gba extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXTEXTSPAN_BORDERWIDTHBOTTOM = -7546047556260837628L;
    public static final long DXTEXTSPAN_BORDERWIDTHLEFT = 1317227382400967960L;
    public static final long DXTEXTSPAN_BORDERWIDTHRIGHT = 9159148641061676940L;
    public static final long DXTEXTSPAN_BORDERWIDTHTOP = 3321771109451140287L;
    public static final long DXTEXTSPAN_ENABLETEXTSIZESTRATEGY = 4822617398935994384L;
    public static final long DXTEXTSPAN_FONT = 34149272427L;
    public static final long DXTEXTSPAN_ISBOLD = 9423384817756195L;
    public static final long DXTEXTSPAN_ISITALIC = 3527554185889034042L;
    public static final long DXTEXTSPAN_ISTRUNCATED = -1735247218921453423L;
    public static final long DXTEXTSPAN_LINK = 35873943762L;
    public static final long DXTEXTSPAN_ONLINK = 9859228430928305L;
    public static final long DXTEXTSPAN_ONPRESS = 5176476879387311985L;
    public static final long DXTEXTSPAN_PRESS = 19050239308914L;
    public static final long DXTEXTSPAN_SHADOWCOLOR = -7272671779511765872L;
    public static final long DXTEXTSPAN_SHADOWOFFSET = -946588628814454279L;
    public static final long DXTEXTSPAN_SHADOWRADIUS = -946376925464026374L;
    public static final long DXTEXTSPAN_STRIKETHROUGHCOLOR = -5920401438808043356L;
    public static final long DXTEXTSPAN_STRIKETHROUGHSTYLE = -5902081368050436426L;
    public static final int DXTEXTSPAN_STRIKETHROUGHSTYLE_DOUBLE = 3;
    public static final int DXTEXTSPAN_STRIKETHROUGHSTYLE_NONE = 0;
    public static final int DXTEXTSPAN_STRIKETHROUGHSTYLE_SINGLE = 1;
    public static final int DXTEXTSPAN_STRIKETHROUGHSTYLE_THICK = 2;
    public static final long DXTEXTSPAN_TEXT = 38178040921L;
    public static final long DXTEXTSPAN_TEXTCOLOR = 5737767606580872653L;
    public static final long DXTEXTSPAN_TEXTSIZE = 6751005219504497256L;
    public static final long DXTEXTSPAN_TEXTSPAN = -2672364301597372865L;
    public static final long DXTEXTSPAN_TRUNCATESTRATEGY = -4543350806168160567L;
    public static final int DXTEXTSPAN_TRUNCATESTRATEGY_NONE = 0;
    public static final int DXTEXTSPAN_TRUNCATESTRATEGY_TRUNCATESTART = 1;
    public static final long DXTEXTSPAN_UNDERLINECOLOR = 2436253123551448787L;
    public static final long DXTEXTSPAN_UNDERLINESTYLE = 2437398193491227877L;
    public static final int DXTEXTSPAN_UNDERLINESTYLE_DOUBLE = 3;
    public static final int DXTEXTSPAN_UNDERLINESTYLE_NONE = 0;
    public static final int DXTEXTSPAN_UNDERLINESTYLE_SINGLE = 1;
    public static final int DXTEXTSPAN_UNDERLINESTYLE_THICK = 2;
    private String b;
    private boolean c;
    private boolean d;
    private boolean e;
    private String f;
    public b g;
    private boolean h;
    private String m;
    private Integer n;
    private int o;
    private c v;

    /* renamed from: a  reason: collision with root package name */
    private boolean f28268a = true;
    private int i = 0;

    static {
        kge.a(-803805793);
    }

    public static /* synthetic */ Object ipc$super(gba gbaVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1814733277:
                return super.onCreateView((Context) objArr[0]);
            case -1775895211:
                super.onBindEvent((Context) objArr[0], (View) objArr[1], ((Number) objArr[2]).longValue());
                return null;
            case -1133248269:
                return new Integer(super.getDefaultValueForIntAttr(((Number) objArr[0]).longValue()));
            case -879570230:
                super.onSetListAttribute(((Number) objArr[0]).longValue(), (JSONArray) objArr[1]);
                return null;
            case -740240234:
                super.onSetIntAttribute(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
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

    /* loaded from: classes5.dex */
    public class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f28273a;
        public int g;
        public JSONArray h;
        public double i;
        public int j;
        public int b = 0;
        public int c = -1;
        public int d = -1;
        public int e = -1;
        public int f = -1;
        public int k = 0;
        private String m = "none";

        static {
            kge.a(-485081227);
        }

        public b() {
        }

        public static /* synthetic */ String a(b bVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("4875ccec", new Object[]{bVar}) : bVar.m;
        }

        public static /* synthetic */ String a(b bVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("18f33562", new Object[]{bVar, str});
            }
            bVar.m = str;
            return str;
        }

        public b a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("6193caba", new Object[]{this});
            }
            b bVar = new b();
            bVar.f28273a = this.f28273a;
            bVar.b = this.b;
            bVar.c = this.c;
            bVar.d = this.d;
            bVar.e = this.e;
            bVar.f = this.f;
            bVar.g = this.g;
            bVar.h = this.h;
            bVar.i = this.i;
            bVar.j = this.j;
            bVar.k = this.k;
            bVar.m = this.m;
            return bVar;
        }
    }

    /* loaded from: classes.dex */
    public static class a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-1266045578);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new gba();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new gba();
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode == null || !(dXWidgetNode instanceof gba)) {
        } else {
            super.onClone(dXWidgetNode, z);
            gba gbaVar = (gba) dXWidgetNode;
            this.g = gbaVar.g;
            this.b = gbaVar.b;
            this.c = gbaVar.c;
            this.d = gbaVar.d;
            this.e = gbaVar.e;
            this.f = gbaVar.f;
            this.m = gbaVar.m;
            this.n = gbaVar.n;
            this.o = gbaVar.o;
            this.v = gbaVar.v;
            this.f28268a = gbaVar.f28268a;
            this.i = gbaVar.i;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        if (!fqi.a(this)) {
            return super.onCreateView(context);
        }
        return null;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBindEvent(Context context, View view, final long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9625fd55", new Object[]{this, context, view, new Long(j)});
            return;
        }
        c cVar = this.v;
        if (cVar == null) {
            if (fqi.a(this)) {
                return;
            }
            super.onBindEvent(context, view, j);
        } else if (j == 9859228430928305L) {
            cVar.a(new b.a() { // from class: tb.gba.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.dinamicx.view.richtext.node.b.a
                public void a(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                        return;
                    }
                    DXRichTextLinkEvent dXRichTextLinkEvent = new DXRichTextLinkEvent(j);
                    dXRichTextLinkEvent.setLink(str);
                    gba.this.postEvent(dXRichTextLinkEvent);
                }
            });
        } else if (j == 5176476879387311985L) {
            cVar.a(new b.InterfaceC0479b() { // from class: tb.gba.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.dinamicx.view.richtext.node.b.InterfaceC0479b
                public boolean a(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
                    }
                    DXRichTextPressEvent dXRichTextPressEvent = new DXRichTextPressEvent(j);
                    dXRichTextPressEvent.setData(str);
                    gba.this.postEvent(dXRichTextPressEvent);
                    return true;
                }
            });
        } else if (j == 18903999933159L) {
            cVar.a(new b.d() { // from class: tb.gba.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.dinamicx.view.richtext.node.b.d
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        gba.this.postEvent(new DXEvent(18903999933159L));
                    }
                }
            });
        } else if (j == -6544685697300501093L) {
            cVar.a(new b.c() { // from class: tb.gba.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.dinamicx.view.richtext.node.b.c
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        gba.this.postEvent(new DXEvent(-6544685697300501093L));
                    }
                }
            });
        } else if (fqi.a(this)) {
        } else {
            super.onBindEvent(context, view, j);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetListAttribute(long j, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb92d2ca", new Object[]{this, new Long(j), jSONArray});
        } else if (j == -946588628814454279L) {
            a(jSONArray);
        } else {
            super.onSetListAttribute(j, jSONArray);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j), str});
        } else if (j == 34149272427L) {
            this.b = str;
        } else if (j == 35873943762L) {
            this.f = str;
        } else if (j == 19050239308914L) {
            a(str);
        } else if (j == 38178040921L) {
            this.m = str;
        } else {
            super.onSetStringAttribute(j, str);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetDoubleAttribute(long j, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f65009", new Object[]{this, new Long(j), new Double(d)});
        } else if (j == -946376925464026374L) {
            a(d);
        } else {
            super.onSetDoubleAttribute(j, d);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j, int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j), new Integer(i)});
        } else if (j == 9423384817756195L) {
            if (i == 0) {
                z = false;
            }
            this.c = z;
        } else if (j == 3527554185889034042L) {
            if (i == 0) {
                z = false;
            }
            this.d = z;
        } else if (j == -1735247218921453423L) {
            if (i == 0) {
                z = false;
            }
            this.e = z;
        } else if (j == -7272671779511765872L) {
            b(i);
        } else if (j == -5920401438808043356L) {
            c(i);
        } else if (j == -5902081368050436426L) {
            d(i);
        } else if (j == 5737767606580872653L) {
            this.n = Integer.valueOf(i);
        } else if (j == 6751005219504497256L) {
            this.o = i;
        } else if (j == 2436253123551448787L) {
            i(i);
        } else if (j == 2437398193491227877L) {
            j(i);
        } else if (j == 4822617398935994384L) {
            if (i == 0) {
                z = false;
            }
            this.f28268a = z;
        } else if (j == DXTEXTSPAN_BORDERWIDTHBOTTOM) {
            e(i);
        } else if (j == DXTEXTSPAN_BORDERWIDTHLEFT) {
            f(i);
        } else if (j == DXTEXTSPAN_BORDERWIDTHRIGHT) {
            g(i);
        } else if (j == DXTEXTSPAN_BORDERWIDTHTOP) {
            h(i);
        } else if (j == DXTEXTSPAN_TRUNCATESTRATEGY) {
            k(i);
        } else {
            super.onSetIntAttribute(j, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public String getDefaultValueForStringAttr(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f1f9c28", new Object[]{this, new Long(j)}) : j == 19050239308914L ? "none" : super.getDefaultValueForStringAttr(j);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j)})).intValue();
        }
        if (j == -5902081368050436426L || j == 2437398193491227877L) {
            return 0;
        }
        if (j == 5737767606580872653L) {
            return -16777216;
        }
        if (j == 4822617398935994384L) {
            return 1;
        }
        if (j != DXTEXTSPAN_BORDERWIDTHBOTTOM && j != DXTEXTSPAN_BORDERWIDTHLEFT && j != DXTEXTSPAN_BORDERWIDTHRIGHT && j != DXTEXTSPAN_BORDERWIDTHTOP) {
            return super.getDefaultValueForIntAttr(j);
        }
        return -1;
    }

    public c a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("416c82f8", new Object[]{this});
        }
        if (TextUtils.isEmpty(this.m)) {
            return null;
        }
        int l = l();
        int n = n();
        int m = m();
        int k = k();
        c.a d = new c.a(this.m, getEngine()).a(this.o).c(getBackGroundColor()).d(getBorderColor());
        int[] iArr = new int[4];
        if (l != 0) {
            l = getBorderWidth();
        }
        iArr[0] = l;
        if (n != 0) {
            n = getBorderWidth();
        }
        iArr[1] = n;
        if (m != 0) {
            m = getBorderWidth();
        }
        iArr[2] = m;
        if (k != 0) {
            k = getBorderWidth();
        }
        iArr[3] = k;
        c.a q = d.a(iArr).e(getBorderType()).f(getDashWidth()).g(getDashGap()).h(getCornerRadius()).b(new int[]{getCornerRadiusLeftTop(), getCornerRadiusRightTop(), getCornerRadiusLeftBottom(), getCornerRadiusRightBottom()}).a(this.c).b(this.d).a(this.f).b(e()).c((float) h()).m(f()).j(o()).i(p()).l(i()).k(j()).n(getPaddingLeft()).o(getPaddingRight()).p(getPaddingTop()).q(getPaddingBottom());
        Integer num = this.n;
        if (num != null) {
            q.b(num.intValue());
        }
        JSONArray g = g();
        if (g != null) {
            if (g.size() > 0) {
                q.a(g.getFloat(0).floatValue());
            }
            if (g.size() >= 2) {
                q.b(g.getFloat(1).floatValue());
            }
        }
        if (getDXRuntimeContext() != null && getDXRuntimeContext().m() != null) {
            q.a(getDXRuntimeContext().m().getAssets(), this.b);
        }
        this.v = q.a();
        return this.v;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this});
        }
        b bVar = this.g;
        return bVar == null ? "none" : b.a(bVar);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        q();
        b.a(this.g, str);
    }

    public int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue();
        }
        b bVar = this.g;
        if (bVar != null) {
            return bVar.g;
        }
        return 0;
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        q();
        this.g.g = i;
    }

    public JSONArray g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("959a7310", new Object[]{this});
        }
        b bVar = this.g;
        if (bVar != null) {
            return bVar.h;
        }
        return null;
    }

    public void a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad9ea590", new Object[]{this, jSONArray});
            return;
        }
        q();
        this.g.h = jSONArray;
    }

    public double h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5cf10dd", new Object[]{this})).doubleValue();
        }
        b bVar = this.g;
        return bVar == null ? mto.a.GEO_NOT_SUPPORT : bVar.i;
    }

    public void a(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a82180d6", new Object[]{this, new Double(d)});
            return;
        }
        q();
        this.g.i = d;
    }

    public int i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5dd2863", new Object[]{this})).intValue();
        }
        b bVar = this.g;
        if (bVar != null) {
            return bVar.j;
        }
        return 0;
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
            return;
        }
        q();
        this.g.j = i;
    }

    public int j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5eb3fe4", new Object[]{this})).intValue();
        }
        b bVar = this.g;
        if (bVar != null) {
            return bVar.k;
        }
        return 0;
    }

    public void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
            return;
        }
        q();
        this.g.k = i;
    }

    public int k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5f95765", new Object[]{this})).intValue();
        }
        b bVar = this.g;
        if (bVar != null) {
            return bVar.c;
        }
        return -1;
    }

    public void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef4f617", new Object[]{this, new Integer(i)});
            return;
        }
        q();
        this.g.c = i;
    }

    public int l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6076ee6", new Object[]{this})).intValue();
        }
        b bVar = this.g;
        if (bVar != null) {
            return bVar.d;
        }
        return -1;
    }

    public void f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0a9ceb6", new Object[]{this, new Integer(i)});
            return;
        }
        q();
        this.g.d = i;
    }

    public int m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6158667", new Object[]{this})).intValue();
        }
        b bVar = this.g;
        if (bVar != null) {
            return bVar.e;
        }
        return -1;
    }

    public void g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25ea755", new Object[]{this, new Integer(i)});
            return;
        }
        q();
        this.g.e = i;
    }

    public int n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6239de8", new Object[]{this})).intValue();
        }
        b bVar = this.g;
        if (bVar != null) {
            return bVar.f;
        }
        return -1;
    }

    public void h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4137ff4", new Object[]{this, new Integer(i)});
            return;
        }
        q();
        this.g.f = i;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.o;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.o = i;
        }
    }

    public int o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("631b569", new Object[]{this})).intValue();
        }
        b bVar = this.g;
        if (bVar != null) {
            return bVar.f28273a;
        }
        return 0;
    }

    public void i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5c85893", new Object[]{this, new Integer(i)});
            return;
        }
        q();
        this.g.f28273a = i;
    }

    public int p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("63fccea", new Object[]{this})).intValue();
        }
        b bVar = this.g;
        if (bVar != null) {
            return bVar.b;
        }
        return 0;
    }

    public void j(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b77d3132", new Object[]{this, new Integer(i)});
            return;
        }
        q();
        this.g.b = i;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.e;
    }

    public int r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("65bfbec", new Object[]{this})).intValue() : this.i;
    }

    public void k(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b93209d1", new Object[]{this, new Integer(i)});
        } else {
            this.i = i;
        }
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.f28268a;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.f28268a = z;
        }
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
            return;
        }
        b bVar = this.g;
        if (bVar == null) {
            this.g = new b();
            this.h = true;
        } else if (this.h) {
        } else {
            this.g = bVar.a();
            this.h = true;
        }
    }
}
