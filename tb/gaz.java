package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.DXRichTextLinkEvent;
import com.taobao.android.dinamicx.expression.event.DXRichTextPressEvent;
import com.taobao.android.dinamicx.p;
import com.taobao.android.dinamicx.view.richtext.DXNativeRichText;
import com.taobao.android.dinamicx.view.richtext.e;
import com.taobao.android.dinamicx.view.richtext.node.RichText;
import com.taobao.android.dinamicx.view.richtext.node.c;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.ak;
import com.taobao.android.dinamicx.widget.m;
import java.util.ArrayList;
import java.util.List;
import tb.mto;

/* loaded from: classes5.dex */
public class gaz extends m {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_TEXT_COLOR = -16777216;
    public static final long DXRICHTEXT_BASELINE = 1445754069157927243L;
    public static final int DXRICHTEXT_BASELINE_BOTTOM = 0;
    public static final int DXRICHTEXT_BASELINE_DESCENT = 3;
    public static final int DXRICHTEXT_BASELINE_MIDDLE = 1;
    public static final int DXRICHTEXT_BASELINE_TOP = 2;
    public static final long DXRICHTEXT_ENABLECUSTOMTRUNCATION = -7904255114002670305L;
    public static final long DXRICHTEXT_ENABLEELLIPSIZEENDFIX_ANDROID = -7798689015804333677L;
    public static final long DXRICHTEXT_ENABLELINEBREAKMODECHAR = -3815747705576429330L;
    public static final long DXRICHTEXT_ENABLETEXTSIZESTRATEGY = 4822617398935994384L;
    public static final long DXRICHTEXT_EXPANDED = 2355535793353806417L;
    public static final long DXRICHTEXT_EXPANDLINES = 8720999726396813958L;
    public static final long DXRICHTEXT_FIRSTLINEHEADINDENT = 4761283217210504855L;
    public static final long DXRICHTEXT_FIRSTLINEHEADINDENTAP = 2302980643468677162L;
    public static final long DXRICHTEXT_FONT = 34149272427L;
    public static final long DXRICHTEXT_FORCEORIGINAL = -6490331624039946159L;
    public static final long DXRICHTEXT_IGNOREUNTRUNCATEDTAP = 867831422994583882L;
    public static final long DXRICHTEXT_ISBOLD = 9423384817756195L;
    public static final long DXRICHTEXT_ISITALIC = 3527554185889034042L;
    public static final int DXRICHTEXT_LABEL_TRUNCATION_BE_REMOVED = 2;
    public static final int DXRICHTEXT_LABEL_TRUNCATION_COMPLETE_DISPLAY = 1;
    public static final int DXRICHTEXT_LABEL_TRUNCATION_NO_TRIGGER = 0;
    public static final long DXRICHTEXT_LINEBREAKMODE = 1650157837879951391L;
    public static final int DXRICHTEXT_LINEBREAKMODE_CHAR = 4;
    public static final int DXRICHTEXT_LINEBREAKMODE_END = 3;
    public static final int DXRICHTEXT_LINEBREAKMODE_MIDDLE = 2;
    public static final int DXRICHTEXT_LINEBREAKMODE_NONE = 0;
    public static final int DXRICHTEXT_LINEBREAKMODE_START = 1;
    public static final long DXRICHTEXT_LINEHEIGHT = 6086495633913771275L;
    public static final long DXRICHTEXT_LINESPACING = -2369181291898902408L;
    public static final long DXRICHTEXT_LINK = 35873943762L;
    public static final long DXRICHTEXT_MAXHEIGHT = -2628143228636041048L;
    public static final long DXRICHTEXT_MAXLINES = 4685059187929305417L;
    public static final long DXRICHTEXT_MAXWIDTH = 4685059378591825230L;
    public static final long DXRICHTEXT_ONLINK = 9859228430928305L;
    public static final long DXRICHTEXT_ONPRESS = 5176476879387311985L;
    public static final long DXRICHTEXT_PRESS = 19050239308914L;
    public static final long DXRICHTEXT_RICHTEXT = -3256835378505648333L;
    public static final long DXRICHTEXT_SHADOWCOLOR = -7272671779511765872L;
    public static final long DXRICHTEXT_SHADOWOFFSET = -946588628814454279L;
    public static final long DXRICHTEXT_SHADOWRADIUS = -946376925464026374L;
    public static final long DXRICHTEXT_SHRINKLINES = 5091055928078111125L;
    public static final long DXRICHTEXT_STRIKETHROUGHCOLOR = -5920401438808043356L;
    public static final long DXRICHTEXT_STRIKETHROUGHSTYLE = -5902081368050436426L;
    public static final int DXRICHTEXT_STRIKETHROUGHSTYLE_DOUBLE = 3;
    public static final int DXRICHTEXT_STRIKETHROUGHSTYLE_NONE = 0;
    public static final int DXRICHTEXT_STRIKETHROUGHSTYLE_SINGLE = 1;
    public static final int DXRICHTEXT_STRIKETHROUGHSTYLE_THICK = 2;
    public static final long DXRICHTEXT_TEXTCOLOR = 5737767606580872653L;
    public static final long DXRICHTEXT_TEXTGRAVITY = -1564827143683948874L;
    public static final int DXRICHTEXT_TEXTGRAVITY_CENTER = 1;
    public static final int DXRICHTEXT_TEXTGRAVITY_LEFT = 0;
    public static final int DXRICHTEXT_TEXTGRAVITY_RIGHT = 2;
    public static final long DXRICHTEXT_TEXTSIZE = 6751005219504497256L;
    public static final long DXRICHTEXT_UNDERLINECOLOR = 2436253123551448787L;
    public static final long DXRICHTEXT_UNDERLINESTYLE = 2437398193491227877L;
    public static final int DXRICHTEXT_UNDERLINESTYLE_DOUBLE = 3;
    public static final int DXRICHTEXT_UNDERLINESTYLE_NONE = 0;
    public static final int DXRICHTEXT_UNDERLINESTYLE_SINGLE = 1;
    public static final int DXRICHTEXT_UNDERLINESTYLE_THICK = 2;
    public static final long DXRICHTEXT_WORDKERN = 7645877425838446932L;
    public static final CharSequence ELLIPSIS_TEXT;

    /* renamed from: a  reason: collision with root package name */
    public static int f28259a;
    public static int b;
    private static short g;
    private static short h;
    private static short j;
    private static short k;
    private static short l;
    private static short m;
    private static short n;
    private int B;
    private boolean C;
    private int D;
    private e J;
    public short e;
    public b f;
    private int i;
    private String p;
    private int w;
    private int x;
    private int c = 0;
    public boolean d = false;
    private int o = 0;
    private Integer v = -16777216;

    /* renamed from: tb.gaz$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public class AnonymousClass1 implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public AnonymousClass1() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            gaz.a(gaz.this);
            gaz.b(gaz.this);
        }
    }

    /* renamed from: tb.gaz$3  reason: invalid class name */
    /* loaded from: classes5.dex */
    public class AnonymousClass3 implements View.OnLongClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public AnonymousClass3() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
            }
            gaz.c(gaz.this);
            gaz.d(gaz.this);
            return true;
        }
    }

    /* renamed from: tb.gaz$5  reason: invalid class name */
    /* loaded from: classes5.dex */
    public class AnonymousClass5 implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public AnonymousClass5() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            gaz.a(gaz.this);
            gaz.b(gaz.this);
        }
    }

    /* renamed from: tb.gaz$7  reason: invalid class name */
    /* loaded from: classes5.dex */
    public class AnonymousClass7 implements View.OnLongClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public AnonymousClass7() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
            }
            gaz.c(gaz.this);
            gaz.d(gaz.this);
            return true;
        }
    }

    public static /* synthetic */ Object ipc$super(gaz gazVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1806543962:
                return new Double(super.getDefaultValueForDoubleAttr(((Number) objArr[0]).longValue()));
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
            case -244855388:
                super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                return null;
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

    @Override // com.taobao.android.dinamicx.widget.m
    public boolean isDisableFlatten() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e18ffb51", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int reusePoolMaxSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("184462af", new Object[]{this})).intValue();
        }
        return 50;
    }

    public static /* synthetic */ void a(gaz gazVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9e773f8", new Object[]{gazVar});
        } else {
            gazVar.j();
        }
    }

    public static /* synthetic */ void b(gaz gazVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d86a7a79", new Object[]{gazVar});
        } else {
            gazVar.i();
        }
    }

    public static /* synthetic */ void c(gaz gazVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6ed80fa", new Object[]{gazVar});
        } else {
            gazVar.l();
        }
    }

    public static /* synthetic */ void d(gaz gazVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b570877b", new Object[]{gazVar});
        } else {
            gazVar.k();
        }
    }

    static {
        kge.a(-1561790159);
        f28259a = 0;
        b = 1;
        ELLIPSIS_TEXT = "…";
        g = (short) 1;
        h = (short) 2;
        j = (short) 4;
        k = (short) 8;
        l = (short) 16;
        m = (short) 32;
        n = (short) 64;
    }

    /* loaded from: classes.dex */
    public static class a implements ak {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(950013704);
            kge.a(349752956);
        }

        @Override // com.taobao.android.dinamicx.widget.ak
        public DXWidgetNode build(Object obj) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new gaz();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new gaz();
    }

    public gaz() {
        this.i = 0;
        this.w = 0;
        if (f28259a == 0 && DinamicXEngine.i() != null) {
            f28259a = gbg.a(DinamicXEngine.i(), 12.0f);
        }
        this.x = f28259a;
        this.i = -1;
        this.w = 0;
        a(j);
        a(l);
    }

    @Override // com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
        } else if (dXWidgetNode == null || !(dXWidgetNode instanceof gaz)) {
        } else {
            super.onClone(dXWidgetNode, z);
            gaz gazVar = (gaz) dXWidgetNode;
            this.f = gazVar.f;
            this.c = gazVar.c;
            this.i = gazVar.i;
            this.p = gazVar.p;
            this.v = gazVar.v;
            this.w = gazVar.w;
            this.x = gazVar.x;
            this.C = gazVar.C;
            this.B = gazVar.B;
            this.D = gazVar.D;
            this.J = gazVar.J;
            this.e = gazVar.e;
            this.o = gazVar.o;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public View onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        DXNativeRichText dXNativeRichText = new DXNativeRichText(context);
        com.taobao.android.dinamicx.monitor.b.b(dXNativeRichText);
        return dXNativeRichText;
    }

    @Override // com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onRenderView(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ede516ab", new Object[]{this, context, view});
        } else if (!(view instanceof DXNativeRichText)) {
        } else {
            DXNativeRichText dXNativeRichText = (DXNativeRichText) view;
            dXNativeRichText.setRichTextRender(this.J);
            d();
            com.taobao.android.dinamicx.monitor.b.a(dXNativeRichText);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onBindEvent(Context context, View view, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9625fd55", new Object[]{this, context, view, new Long(j2)});
        } else if (j2 == 9859228430928305L && !TextUtils.isEmpty(s())) {
            view.setOnClickListener(new View.OnClickListener() { // from class: tb.gaz.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                    } else {
                        gaz.a(gaz.this);
                    }
                }
            });
        } else if (j2 == 5176476879387311985L && !TextUtils.isEmpty(this.p)) {
        } else {
            if (j2 == 18903999933159L) {
                view.setOnClickListener(new View.OnClickListener() { // from class: tb.gaz.4
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                        } else {
                            gaz.b(gaz.this);
                        }
                    }
                });
            } else if (j2 == -6544685697300501093L) {
                view.setOnLongClickListener(new View.OnLongClickListener() { // from class: tb.gaz.6
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnLongClickListener
                    public boolean onLongClick(View view2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("7edba102", new Object[]{this, view2})).booleanValue();
                        }
                        gaz.d(gaz.this);
                        return true;
                    }
                });
            } else {
                super.onBindEvent(context, view, j2);
            }
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onEndParser() {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b4ccc2", new Object[]{this});
            return;
        }
        DXRuntimeContext dXRuntimeContext = getDXRuntimeContext();
        List<DXWidgetNode> a2 = a((DXWidgetNode) this);
        boolean F = F();
        for (int i = 0; i < a2.size(); i++) {
            DXWidgetNode dXWidgetNode = a2.get(i);
            if (dXWidgetNode.getVisibility() != 2 && (dXWidgetNode instanceof gba)) {
                gba gbaVar = (gba) dXWidgetNode;
                if (F && gbaVar.d() && gbaVar.b() > 0) {
                    gbaVar.a((int) p.a(dXRuntimeContext, gbaVar.b()));
                }
                gbaVar.a(F && gbaVar.d());
            }
        }
        if (!F || dXRuntimeContext == null) {
            return;
        }
        DXEngineConfig a3 = dXRuntimeContext.C().a();
        if (a3 == null || !a3.n()) {
            z = false;
        }
        if (!z) {
            return;
        }
        this.x = (int) p.a(dXRuntimeContext, this.x);
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        b();
        e.a a2 = this.J.a(i, i2);
        this.o = this.J.m();
        if (a2 == null) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(a2.a(), a2.b());
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        } else {
            super.onLayout(z, i, i2, i3, i4);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetListAttribute(long j2, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb92d2ca", new Object[]{this, new Long(j2), jSONArray});
        } else if (j2 == -946588628814454279L) {
            a(jSONArray);
        } else {
            super.onSetListAttribute(j2, jSONArray);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetStringAttribute(long j2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42764d9f", new Object[]{this, new Long(j2), str});
        } else if (j2 == 34149272427L) {
            a(str);
        } else if (j2 == 35873943762L) {
            b(str);
        } else if (j2 == 19050239308914L) {
            this.p = str;
        } else {
            super.onSetStringAttribute(j2, str);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetDoubleAttribute(long j2, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9f65009", new Object[]{this, new Long(j2), new Double(d)});
        } else if (j2 == DXRICHTEXT_FIRSTLINEHEADINDENT) {
            a(d);
        } else if (j2 == DXRICHTEXT_LINEHEIGHT) {
            b(d);
        } else if (j2 == -2369181291898902408L) {
            c(d);
        } else if (j2 == -946376925464026374L) {
            d(d);
        } else if (j2 == DXRICHTEXT_WORDKERN) {
            e(d);
        } else {
            super.onSetDoubleAttribute(j2, d);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onSetIntAttribute(long j2, int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3e0d496", new Object[]{this, new Long(j2), new Integer(i)});
        } else if (j2 == DXRICHTEXT_BASELINE) {
            this.c = i;
        } else if (j2 == DXRICHTEXT_EXPANDLINES) {
            this.B = i;
        } else if (j2 == DXRICHTEXT_EXPANDED) {
            if (i == 0) {
                z = false;
            }
            this.C = z;
        } else if (j2 == DXRICHTEXT_SHRINKLINES) {
            this.D = i;
        } else if (j2 == 9423384817756195L) {
            if (i == 0) {
                z = false;
            }
            a(z);
        } else if (j2 == 3527554185889034042L) {
            if (i == 0) {
                z = false;
            }
            b(z);
        } else if (j2 == 1650157837879951391L) {
            this.i = i;
        } else if (j2 == DXRICHTEXT_MAXHEIGHT) {
            a(i);
        } else if (j2 == DXRICHTEXT_MAXWIDTH) {
            b(i);
        } else if (j2 == -7272671779511765872L) {
            d(i);
        } else if (j2 == -5920401438808043356L) {
            e(i);
        } else if (j2 == -5902081368050436426L) {
            f(i);
        } else if (j2 == 5737767606580872653L) {
            this.v = Integer.valueOf(i);
        } else if (j2 == -1564827143683948874L) {
            this.w = i;
        } else if (j2 == 6751005219504497256L) {
            this.x = i;
        } else if (j2 == 2436253123551448787L) {
            a(Integer.valueOf(i));
        } else if (j2 == 2437398193491227877L) {
            g(i);
        } else if (j2 == 4822617398935994384L) {
            if (i == 0) {
                z = false;
            }
            c(z);
        } else if (j2 == DXRICHTEXT_IGNOREUNTRUNCATEDTAP) {
            if (i == 0) {
                z = false;
            }
            d(z);
        } else if (j2 == DXRICHTEXT_FORCEORIGINAL) {
            if (i == 0) {
                z = false;
            }
            e(z);
        } else if (j2 == DXRICHTEXT_FIRSTLINEHEADINDENTAP) {
            c(i);
        } else if (j2 == DXRICHTEXT_ENABLELINEBREAKMODECHAR) {
            if (i == 0) {
                z = false;
            }
            f(z);
        } else if (j2 == -7798689015804333677L) {
            if (i == 0) {
                z = false;
            }
            g(z);
        } else {
            super.onSetIntAttribute(j2, i);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public double getDefaultValueForDoubleAttr(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("945253a6", new Object[]{this, new Long(j2)})).doubleValue();
        }
        if (j2 != DXRICHTEXT_LINEHEIGHT && j2 != -2369181291898902408L) {
            return super.getDefaultValueForDoubleAttr(j2);
        }
        return -1.0d;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public int getDefaultValueForIntAttr(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bc7400f3", new Object[]{this, new Long(j2)})).intValue();
        }
        if (j2 == DXRICHTEXT_BASELINE || j2 == DXRICHTEXT_ENABLECUSTOMTRUNCATION || j2 == 1650157837879951391L || j2 == -5902081368050436426L || j2 == 2437398193491227877L) {
            return 0;
        }
        if (j2 == 5737767606580872653L) {
            return -16777216;
        }
        if (j2 == 4822617398935994384L) {
            return 1;
        }
        if (j2 == 6751005219504497256L) {
            return f28259a;
        }
        if (j2 != DXRICHTEXT_FORCEORIGINAL) {
            return super.getDefaultValueForIntAttr(j2);
        }
        return 1;
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.J = new e();
        int i = this.C ? this.B : this.D;
        if (i <= 0) {
            i = Integer.MAX_VALUE;
        }
        this.J.d(getBorderColor());
        this.J.e(Math.max(getBorderWidth(), 0));
        this.J.a(getDXRuntimeContext().m());
        this.J.f(getCornerRadius());
        this.J.o(v() > 0 ? v() : (int) m());
        this.J.a(n());
        this.J.a(o());
        this.J.b(p());
        this.J.v(getDirection());
        this.J.e((float) E());
        this.J.n(a());
        this.J.m(i);
        this.J.k(u());
        this.J.l(t());
        this.J.a(C());
        this.J.g(f());
        this.J.i(A());
        this.J.h(g());
        this.J.r(getPaddingLeft());
        this.J.s(getPaddingRight());
        this.J.u(getPaddingBottom());
        this.J.t(getPaddingTop());
        this.J.p(h());
        this.J.q(e());
        this.J.d((float) q());
        this.J.f((float) r());
        this.J.c(J());
        int i2 = this.x;
        if (i2 > 0) {
            this.J.b(i2);
        }
        Integer num = this.v;
        if (num != null) {
            this.J.c(tryFetchDarkModeColor("textColor", 0, num.intValue()));
        }
        JSONArray x = x();
        if (x != null) {
            if (x.size() > 0) {
                this.J.a(x.getFloat(0).floatValue());
            }
            if (x.size() >= 2) {
                this.J.b(x.getFloat(1).floatValue());
            }
        }
        this.J.x(this.o);
        this.J.e(this.C);
        this.J.y(this.D);
        this.J.c((float) z());
        this.J.j(w());
        this.J.a(c());
    }

    private RichText c() {
        gay gayVar;
        com.taobao.android.dinamicx.view.richtext.node.a a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RichText) ipChange.ipc$dispatch("fa270354", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        List<DXWidgetNode> a3 = a((DXWidgetNode) this);
        for (int i = 0; i < a3.size(); i++) {
            DXWidgetNode dXWidgetNode = a3.get(i);
            if (dXWidgetNode.getVisibility() != 2) {
                if (dXWidgetNode instanceof gba) {
                    gba gbaVar = (gba) dXWidgetNode;
                    c a4 = gbaVar.a();
                    if (a4 != null) {
                        if (gbaVar.c()) {
                            if (!this.C) {
                                RichText richText = new RichText();
                                richText.add(a4);
                                this.J.a(richText.renderText());
                                this.i = 3;
                                this.J.n(3);
                            }
                        } else {
                            if (gbaVar.r() == 1 && this.i == 3 && !this.J.l()) {
                                this.J.d(true);
                                RichText richText2 = new RichText();
                                richText2.addAll(arrayList);
                                this.J.b(richText2);
                            }
                            arrayList.add(a4);
                        }
                        sb.append(a4.b());
                    }
                } else if ((dXWidgetNode instanceof gay) && (a2 = (gayVar = (gay) dXWidgetNode).a(true, H())) != null) {
                    if (gayVar.a()) {
                        if (!this.C) {
                            RichText richText3 = new RichText();
                            richText3.add(a2);
                            this.J.a(richText3.renderText());
                            this.i = 3;
                            this.J.n(3);
                        }
                    } else {
                        arrayList.add(a2);
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        RichText richText4 = new RichText();
        richText4.addAll(arrayList);
        if (getAccessibilityText() == null) {
            setAccessibilityText(sb.toString());
        }
        return richText4;
    }

    private List<DXWidgetNode> a(DXWidgetNode dXWidgetNode) {
        List<DXWidgetNode> children;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("afe8f7a0", new Object[]{this, dXWidgetNode});
        }
        ArrayList arrayList = new ArrayList();
        if (dXWidgetNode != null && (children = dXWidgetNode.getChildren()) != null && !children.isEmpty()) {
            for (DXWidgetNode dXWidgetNode2 : children) {
                if (dXWidgetNode2.getVisibility() != 2) {
                    if (dXWidgetNode2 instanceof gax) {
                        arrayList.addAll(a(dXWidgetNode2));
                    } else {
                        arrayList.add(dXWidgetNode2);
                    }
                }
            }
        }
        return arrayList;
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (fqi.n()) {
            try {
                List<DXWidgetNode> a2 = a((DXWidgetNode) this);
                if (a2.isEmpty()) {
                    return;
                }
                for (int i = 0; i < a2.size(); i++) {
                    DXWidgetNode dXWidgetNode = a2.get(i);
                    if (((dXWidgetNode instanceof gba) || (dXWidgetNode instanceof gay)) && fqi.a(dXWidgetNode)) {
                        DXWidgetNode referenceNode = !dXWidgetNode.isFlatten() ? dXWidgetNode.getReferenceNode() : dXWidgetNode;
                        if (referenceNode != null) {
                            referenceNode.bindEvent(dXWidgetNode.getDXRuntimeContext().m());
                        }
                    }
                }
            } catch (Exception e) {
                com.taobao.android.dinamicx.exception.a.b(e);
            }
        }
    }

    private int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue();
        }
        int i = this.c;
        if (i == 0) {
            return 0;
        }
        if (i == 2) {
            return 2;
        }
        if (i == 1) {
            return 1;
        }
        return i == 3 ? 3 : 0;
    }

    private int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue();
        }
        int D = D();
        if (D == 1) {
            return 1;
        }
        if (D == 3) {
            return 3;
        }
        return D == 2 ? 2 : 0;
    }

    private int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue();
        }
        int B = B();
        if (B == 1) {
            return 1;
        }
        if (B == 3) {
            return 3;
        }
        return B == 2 ? 2 : 0;
    }

    private int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5cf10e2", new Object[]{this})).intValue();
        }
        int i = this.w;
        if (i == 1) {
            return 1;
        }
        return i == 2 ? 2 : 0;
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else if (G() && !this.J.h()) {
        } else {
            postEvent(new DXEvent(18903999933159L));
        }
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        DXRichTextLinkEvent dXRichTextLinkEvent = new DXRichTextLinkEvent(9859228430928305L);
        dXRichTextLinkEvent.setLink(s());
        postEvent(dXRichTextLinkEvent);
    }

    private void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else {
            postEvent(new DXEvent(-6544685697300501093L));
        }
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        DXRichTextPressEvent dXRichTextPressEvent = new DXRichTextPressEvent(5176476879387311985L);
        dXRichTextPressEvent.setData(this.p);
        postEvent(dXRichTextPressEvent);
    }

    public double m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6158662", new Object[]{this})).doubleValue();
        }
        b bVar = this.f;
        return bVar == null ? mto.a.GEO_NOT_SUPPORT : bVar.f28267a;
    }

    public void a(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a82180d6", new Object[]{this, new Double(d)});
            return;
        }
        y();
        this.f.f28267a = d;
    }

    public String n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("84c15f4b", new Object[]{this});
        }
        b bVar = this.f;
        if (bVar != null) {
            return bVar.c;
        }
        return null;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        y();
        this.f.c = str;
    }

    public boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[]{this})).booleanValue();
        }
        short s = this.e;
        short s2 = g;
        return (s & s2) == s2;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (z) {
            this.e = (short) (this.e | g);
        } else {
            this.e = (short) (this.e & (~g));
        }
    }

    public boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[]{this})).booleanValue();
        }
        short s = this.e;
        short s2 = h;
        return (s & s2) == s2;
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else if (z) {
            this.e = (short) (this.e | h);
        } else {
            this.e = (short) (this.e & (~h));
        }
    }

    public double q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("64de466", new Object[]{this})).doubleValue();
        }
        b bVar = this.f;
        if (bVar != null) {
            return bVar.d;
        }
        return -1.0d;
    }

    public void b(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d65975", new Object[]{this, new Double(d)});
            return;
        }
        y();
        this.f.d = d;
    }

    public double r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65bfbe7", new Object[]{this})).doubleValue();
        }
        b bVar = this.f;
        if (bVar != null) {
            return bVar.e;
        }
        return -1.0d;
    }

    public void c(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b3214", new Object[]{this, new Double(d)});
            return;
        }
        y();
        this.f.e = d;
    }

    public String s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("255e0466", new Object[]{this});
        }
        b bVar = this.f;
        if (bVar != null) {
            return bVar.f;
        }
        return null;
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        y();
        this.f.f = str;
    }

    public int t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6782aee", new Object[]{this})).intValue();
        }
        b bVar = this.f;
        if (bVar != null) {
            return bVar.g;
        }
        return Integer.MAX_VALUE;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        y();
        this.f.g = i;
    }

    public int u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("686426f", new Object[]{this})).intValue();
        }
        b bVar = this.f;
        if (bVar != null) {
            return bVar.h;
        }
        return Integer.MAX_VALUE;
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        y();
        this.f.h = i;
    }

    public int v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("69459f0", new Object[]{this})).intValue();
        }
        b bVar = this.f;
        if (bVar != null) {
            return bVar.b;
        }
        return 0;
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
            return;
        }
        y();
        this.f.b = i;
    }

    public int w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6a27171", new Object[]{this})).intValue();
        }
        b bVar = this.f;
        if (bVar != null) {
            return bVar.i;
        }
        return 0;
    }

    public void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad401d78", new Object[]{this, new Integer(i)});
            return;
        }
        y();
        this.f.i = i;
    }

    public JSONArray x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("4dcd315f", new Object[]{this});
        }
        b bVar = this.f;
        if (bVar != null) {
            return bVar.j;
        }
        return null;
    }

    public void a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad9ea590", new Object[]{this, jSONArray});
            return;
        }
        y();
        this.f.j = jSONArray;
    }

    public void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bea080", new Object[]{this});
            return;
        }
        b bVar = this.f;
        if (bVar == null) {
            this.f = new b();
            this.d = true;
        } else if (this.d) {
        } else {
            this.f = bVar.a();
            this.d = true;
        }
    }

    public double z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6ccb7ef", new Object[]{this})).doubleValue();
        }
        b bVar = this.f;
        return bVar == null ? mto.a.GEO_NOT_SUPPORT : bVar.k;
    }

    public void d(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad400ab3", new Object[]{this, new Double(d)});
            return;
        }
        y();
        this.f.k = d;
    }

    public int A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3a97c3b", new Object[]{this})).intValue();
        }
        b bVar = this.f;
        if (bVar != null) {
            return bVar.l;
        }
        return 0;
    }

    public void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef4f617", new Object[]{this, new Integer(i)});
            return;
        }
        y();
        this.f.l = i;
    }

    public int B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3b793bc", new Object[]{this})).intValue();
        }
        b bVar = this.f;
        if (bVar != null) {
            return bVar.m;
        }
        return 0;
    }

    public void f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0a9ceb6", new Object[]{this, new Integer(i)});
            return;
        }
        y();
        this.f.m = i;
    }

    public Integer C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("5412cbf1", new Object[]{this});
        }
        b bVar = this.f;
        if (bVar != null) {
            return bVar.n;
        }
        return null;
    }

    public void a(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cdec50f", new Object[]{this, num});
            return;
        }
        y();
        this.f.n = num;
    }

    public int D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3d3c2be", new Object[]{this})).intValue();
        }
        b bVar = this.f;
        if (bVar != null) {
            return bVar.o;
        }
        return 0;
    }

    public void g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25ea755", new Object[]{this, new Integer(i)});
            return;
        }
        y();
        this.f.o = i;
    }

    public double E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3e1da3a", new Object[]{this})).doubleValue();
        }
        b bVar = this.f;
        return bVar == null ? mto.a.GEO_NOT_SUPPORT : bVar.p;
    }

    public void e(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef4e352", new Object[]{this, new Double(d)});
            return;
        }
        y();
        this.f.p = d;
    }

    @Override // com.taobao.android.dinamicx.widget.DXWidgetNode
    public boolean supportReuse() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("562c49f0", new Object[]{this})).booleanValue() : getClass() == gaz.class;
    }

    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
        }
        if (!I() && this.i == 4) {
            return 0;
        }
        return this.i;
    }

    public boolean F() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3eff1d1", new Object[]{this})).booleanValue() : h(j);
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else if (z) {
            a(j);
        } else {
            b(j);
        }
    }

    public boolean G() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3fe0952", new Object[]{this})).booleanValue() : h(k);
    }

    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
        } else if (z) {
            a(k);
        } else {
            b(k);
        }
    }

    public boolean H() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("40c20d3", new Object[]{this})).booleanValue() : h(l);
    }

    public void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef535e8", new Object[]{this, new Boolean(z)});
        } else if (z) {
            a(l);
        } else {
            b(l);
        }
    }

    public boolean I() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("41a3854", new Object[]{this})).booleanValue() : h(m);
    }

    public void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0aa0e87", new Object[]{this, new Boolean(z)});
        } else if (z) {
            a(m);
        } else {
            b(m);
        }
    }

    public boolean J() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4284fd5", new Object[]{this})).booleanValue() : h(n);
    }

    public void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25ee726", new Object[]{this, new Boolean(z)});
        } else if (z) {
            a(n);
        } else {
            b(n);
        }
    }

    public int K() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4366745", new Object[]{this})).intValue() : this.o;
    }

    public void a(short s) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821b925", new Object[]{this, new Short(s)});
        } else {
            this.e = (short) (s | this.e);
        }
    }

    public void b(short s) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d691c4", new Object[]{this, new Short(s)});
        } else {
            this.e = (short) ((~s) & this.e);
        }
    }

    public boolean h(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b4137ff8", new Object[]{this, new Integer(i)})).booleanValue() : (this.e & i) == i;
    }

    /* loaded from: classes5.dex */
    public class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public double f28267a;
        public int b;
        public String c;
        public String f;
        public int i;
        public JSONArray j;
        public double k;
        public int l;
        public Integer n;
        public double p;
        public double d = -1.0d;
        public double e = -1.0d;
        public int g = Integer.MAX_VALUE;
        public int h = Integer.MAX_VALUE;
        public int m = 0;
        public int o = 0;

        static {
            kge.a(1719542965);
        }

        public b() {
        }

        public b a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("61911080", new Object[]{this});
            }
            b bVar = new b();
            bVar.f28267a = this.f28267a;
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
            bVar.l = this.l;
            bVar.m = this.m;
            bVar.n = this.n;
            bVar.o = this.o;
            bVar.p = this.p;
            return bVar;
        }
    }
}
