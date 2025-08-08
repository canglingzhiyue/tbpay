package tb;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alipay.mobile.common.transportext.amnet.AmnetConstant;
import com.android.alibaba.ip.runtime.IpChange;
import com.facebook.yoga.YogaAlign;
import com.facebook.yoga.YogaDisplay;
import com.facebook.yoga.YogaFlexDirection;
import com.facebook.yoga.YogaJustify;
import com.facebook.yoga.YogaPositionType;
import com.facebook.yoga.YogaWrap;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.g;
import com.taobao.tao.flexbox.layoutmanager.core.aa;
import com.taobao.tao.flexbox.layoutmanager.core.ab;
import com.taobao.tao.image.d;
import com.taobao.weex.common.Constants;
import com.taobao.weex.utils.WXUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes8.dex */
public class ogl {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public a aG;
    public b aH;
    public Object aI;
    public int aJ;
    public int aK;
    public int aL;
    public int aM;
    public int aN;
    public int aO;
    public int aQ;
    public int aR;
    public Boolean aV;
    public int ac;
    public int ad;
    public int ae;
    public int af;
    public int ag;
    public int ah;
    public int ai;
    public int aj;
    public int ak;
    public int al;
    public int am;
    public int an;
    public YogaAlign ao;
    public YogaAlign ap;
    public YogaAlign aq;
    public float ar;
    public float as;
    public float at;
    public float au;
    public YogaJustify aw;
    public YogaWrap ax;
    public YogaDisplay ay;
    public YogaPositionType az;
    public int[] bA;
    public String bc;
    public String bd;
    public boolean be;
    public int bg;
    public Rect bh;
    public boolean bi;
    public Map bk;
    public float bl;
    public float bm;
    public float bn;
    public float bo;
    public float bp;
    public List<c> bs;
    public aa bt;
    public ab bu;
    public Map bv;
    public int aa = -1;
    public int ab = -1;
    public YogaFlexDirection av = YogaFlexDirection.COLUMN;
    public int aA = -1;
    public int aB = -1;
    public int aC = -1;
    public int aD = -1;
    public int aE = 1;
    public int aF = 1;
    public int aP = 1;
    public boolean aS = false;
    public float aT = 1.0f;
    public boolean aU = true;
    public boolean aW = true;
    public String aX = null;
    public String aY = null;
    public boolean aZ = false;
    public boolean ba = true;
    public int bb = 1000;
    public boolean bf = false;
    public double bj = 1.0d;
    public float bq = 1.0f;
    public float br = 1.0f;
    public boolean bz = true;

    static {
        kge.a(-493830702);
    }

    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
        }
        return 0;
    }

    public void a(Context context, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("840caf86", new Object[]{this, context, str, obj});
        }
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        return null;
    }

    public void c(Context context, Object obj) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87ca3ffa", new Object[]{this, context, obj});
            return;
        }
        if (!"true".equals(oec.c(obj)) && !"visible".equals(oec.c(obj))) {
            z = false;
        }
        this.aU = z;
    }

    public void d(Context context, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c194e1d9", new Object[]{this, context, obj});
        } else {
            this.aW = oec.a(obj, true);
        }
    }

    public void e(Context context, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb5f83b8", new Object[]{this, context, obj});
        } else {
            this.aS = oec.a(obj, false);
        }
    }

    public void f(Context context, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("352a2597", new Object[]{this, context, obj});
        } else {
            this.bg = oec.a(obj, 0);
        }
    }

    public void g(Context context, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ef4c776", new Object[]{this, context, obj});
        } else {
            this.ba = oec.a(obj, true);
        }
    }

    /* loaded from: classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f32034a;
        public int b;
        public int c;
        public int d;
        public int e = 1;

        static {
            kge.a(-1673444033);
        }

        public static a a(aa aaVar, Context context, String str, aa.g gVar, boolean z) {
            String[] a2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("d4b19308", new Object[]{aaVar, context, str, gVar, new Boolean(z)});
            }
            a aVar = null;
            if (str != null && ((str.contains("#") || str.contains("rgba")) && (a2 = oec.a(str, ' ')) != null)) {
                aVar = new a();
                if (a2.length == 3) {
                    aVar.f32034a = ogl.a(aaVar, context, a2[0]);
                    aVar.b = ogl.a(aaVar, context, a2[1]);
                    aVar.e = odx.a(context, 2, a2[2], gVar, z);
                } else if (a2.length == 4) {
                    aVar.f32034a = ogl.a(aaVar, context, a2[0]);
                    aVar.b = ogl.a(aaVar, context, a2[1]);
                    aVar.c = ogl.a(aaVar, context, a2[2]);
                    aVar.e = odx.a(context, 2, a2[3], gVar, z);
                } else if (a2.length == 5) {
                    aVar.f32034a = ogl.a(aaVar, context, a2[0]);
                    aVar.b = ogl.a(aaVar, context, a2[1]);
                    aVar.c = ogl.a(aaVar, context, a2[2]);
                    aVar.d = ogl.a(aaVar, context, a2[3]);
                    aVar.e = odx.a(context, 2, a2[4], gVar, z);
                }
            }
            return aVar;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "BoxShadowParams{offsetX=" + this.f32034a + ", offsetY=" + this.b + ", blurRadius=" + this.c + ", spreadRadius=" + this.d + ", shadowColor=" + this.e + '}';
        }
    }

    /* loaded from: classes8.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f32035a;
        public int b;
        public int c;

        static {
            kge.a(-1895860666);
        }

        public static b a(Context context, int i, String str, aa.g gVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("5797d2", new Object[]{context, new Integer(i), str, gVar, new Boolean(z)});
            }
            String[] d = odx.d(str);
            if (d == null || d.length != 4) {
                return null;
            }
            b bVar = new b();
            if (d[1].equalsIgnoreCase("top")) {
                bVar.f32035a = 0;
            } else if (d[1].equalsIgnoreCase("bottom")) {
                bVar.f32035a = 1;
            } else if (d[1].equalsIgnoreCase("left")) {
                bVar.f32035a = 2;
            } else if (d[1].equalsIgnoreCase("right")) {
                bVar.f32035a = 3;
            }
            bVar.b = odx.a(context, i, d[2], gVar, z);
            bVar.c = odx.a(context, i, d[3], gVar, z);
            return bVar;
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                b bVar = (b) obj;
                if (this.f32035a == bVar.f32035a && this.b == bVar.b && this.c == bVar.c) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue() : Build.VERSION.SDK_INT >= 19 ? Objects.hash(Integer.valueOf(this.f32035a), Integer.valueOf(this.b), Integer.valueOf(this.c)) : System.identityHashCode(this);
        }
    }

    /* loaded from: classes8.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f32036a;
        public int b;
        public String c;
        public int d;

        static {
            kge.a(1332419565);
        }

        public c(String str) {
            this.b = 300;
            this.c = "ease";
            this.d = 0;
            List<String> b = oec.b(str.trim(), ' ');
            int size = b.size();
            if (size > 0) {
                this.f32036a = b.get(0);
                if (size > 1) {
                    String str2 = b.get(1);
                    if (str2.endsWith("ms")) {
                        this.b = oec.a((Object) str2.substring(0, str2.length() - 2), 0);
                    } else if (str2.endsWith("s")) {
                        this.b = oec.a((Object) str2.substring(0, str2.length() - 1), 0) * 1000;
                    } else {
                        this.b = oec.a((Object) str2, 0);
                    }
                }
                if (size > 2) {
                    this.c = b.get(2);
                }
                if (size <= 3) {
                    return;
                }
                String str3 = b.get(3);
                if (str3.endsWith("ms")) {
                    this.d = oec.a((Object) str3.substring(0, str3.length() - 2), 0);
                } else if (str3.endsWith("s")) {
                    this.d = oec.a((Object) str3.substring(0, str3.length() - 1), 0) * 1000;
                } else {
                    this.d = oec.a((Object) str3, 0);
                }
            }
        }

        public oeg a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (oeg) ipChange.ipc$dispatch("f08a1ed", new Object[]{this});
            }
            oeg oegVar = new oeg();
            oegVar.f31970a = this.b;
            oegVar.b = this.d;
            oegVar.f = oek.a(this.c);
            oegVar.h = new oeh();
            return oegVar;
        }

        public static List<c> a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("287b5bd5", new Object[]{str});
            }
            if (StringUtils.isEmpty(str)) {
                return null;
            }
            List<String> b = oec.b(str.trim(), ',');
            ArrayList arrayList = new ArrayList(b.size());
            for (String str2 : b) {
                arrayList.add(new c(str2));
            }
            return arrayList;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static tb.ogl.c a(java.lang.String r3, java.util.List<tb.ogl.c> r4) {
            /*
                com.android.alibaba.ip.runtime.IpChange r0 = tb.ogl.c.$ipChange
                boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                if (r1 == 0) goto L18
                r1 = 2
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = 0
                r1[r2] = r3
                r3 = 1
                r1[r3] = r4
                java.lang.String r3 = "f9eedf10"
                java.lang.Object r3 = r0.ipc$dispatch(r3, r1)
                tb.ogl$c r3 = (tb.ogl.c) r3
                return r3
            L18:
                if (r4 == 0) goto L3d
                java.util.Iterator r4 = r4.iterator()
            L1e:
                boolean r0 = r4.hasNext()
                if (r0 == 0) goto L3d
                java.lang.Object r0 = r4.next()
                tb.ogl$c r0 = (tb.ogl.c) r0
                java.lang.String r1 = r0.f32036a
                boolean r1 = r1.equals(r3)
                if (r1 != 0) goto L3c
                java.lang.String r1 = r0.f32036a
                java.lang.String r2 = "all"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L1e
            L3c:
                return r0
            L3d:
                r3 = 0
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.ogl.c.a(java.lang.String, java.util.List):tb.ogl$c");
        }
    }

    @Deprecated
    public static int a(Context context, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1434fc2f", new Object[]{context, obj})).intValue();
        }
        if (obj instanceof Number) {
            return ohd.a(context, ((Number) obj).toString());
        }
        return ohd.a(context, oec.c(obj));
    }

    public static int a(aa aaVar, Context context, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fd07d747", new Object[]{aaVar, context, obj})).intValue();
        }
        if (obj instanceof Number) {
            return ohd.a(aaVar, context, ((Number) obj).floatValue());
        }
        return ohd.a(aaVar, context, oec.c(obj));
    }

    public int a(aa aaVar, Context context, Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a3f3c5f3", new Object[]{this, aaVar, context, obj, new Boolean(z)})).intValue();
        }
        if (obj instanceof Number) {
            return ohd.a(aaVar, context, ((Number) obj).intValue());
        }
        return ohd.a(aaVar, context, oec.c(obj), z);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void a(Context context, HashMap hashMap) {
        char c2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9591153", new Object[]{this, context, hashMap});
            return;
        }
        Object obj = hashMap.get("attrs");
        if (obj instanceof Map) {
            hashMap.putAll((Map) obj);
        }
        this.bv = hashMap;
        ofg ofgVar = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            switch (str.hashCode()) {
                case -1880840443:
                    if (str.equals("theme-fontlevel-enabled")) {
                        c2 = '>';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1850307423:
                    if (str.equals("layout-animation")) {
                        c2 = '<';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1820411228:
                    if (str.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_border_bottom_right_radius)) {
                        c2 = '*';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1802976921:
                    if (str.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_flex_grow)) {
                        c2 = 20;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1802500706:
                    if (str.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_flex_wrap)) {
                        c2 = JSONLexer.EOI;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1779213470:
                    if (str.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_box_shadow)) {
                        c2 = '$';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1724158635:
                    if (str.equals("transition")) {
                        c2 = 'K';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1721943862:
                    if (str.equals("translateX")) {
                        c2 = 'A';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1721943861:
                    if (str.equals("translateY")) {
                        c2 = 'B';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1662432227:
                    if (str.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_max_width)) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1609594047:
                    if (str.equals("enabled")) {
                        c2 = '0';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1546463658:
                    if (str.equals("aspect-ratio")) {
                        c2 = 22;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1502084711:
                    if (str.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_padding_top)) {
                        c2 = '\t';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1483602118:
                    if (str.equals("auto-focus")) {
                        c2 = '-';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1454606755:
                    if (str.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_flex_shrink)) {
                        c2 = 21;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1383228885:
                    if (str.equals("bottom")) {
                        c2 = ' ';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1332194002:
                    if (str.equals("background")) {
                        c2 = '#';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1275203969:
                    if (str.equals("border-image-slice")) {
                        c2 = '=';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1267206133:
                    if (str.equals("opacity")) {
                        c2 = '.';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1221029593:
                    if (str.equals("height")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1089145580:
                    if (str.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_align_self)) {
                        c2 = 18;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1081309778:
                    if (str.equals("margin")) {
                        c2 = 11;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1032412580:
                    if (str.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_border_top_right_radius)) {
                        c2 = '(';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -925180581:
                    if (str.equals("rotate")) {
                        c2 = d.LEVEL_D;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -908189618:
                    if (str.equals("scaleX")) {
                        c2 = 'G';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -908189617:
                    if (str.equals("scaleY")) {
                        c2 = 'H';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -889953653:
                    if (str.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_min_width)) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -887955139:
                    if (str.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_margin_right)) {
                        c2 = '\r';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -806339567:
                    if (str.equals("padding")) {
                        c2 = 6;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -698087727:
                    if (str.equals("fading-edge")) {
                        c2 = 'M';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -681210700:
                    if (str.equals("highlight")) {
                        c2 = '@';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -528615460:
                    if (str.equals("clip-children")) {
                        c2 = '4';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -428786256:
                    if (str.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_max_height)) {
                        c2 = 5;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -396426912:
                    if (str.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_padding_right)) {
                        c2 = '\b';
                        break;
                    }
                    c2 = 65535;
                    break;
                case -386831417:
                    if (str.equals("target-transition-name")) {
                        c2 = '7';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 122:
                    if (str.equals(AmnetConstant.VAL_SUPPORT_ZSTD)) {
                        c2 = ';';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 115029:
                    if (str.equals("top")) {
                        c2 = 31;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3145721:
                    if (str.equals("flex")) {
                        c2 = 19;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3317767:
                    if (str.equals("left")) {
                        c2 = 29;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 18045802:
                    if (str.equals("click-interval")) {
                        c2 = '5';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 108511772:
                    if (str.equals("right")) {
                        c2 = 30;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 109250890:
                    if (str.equals("scale")) {
                        c2 = d.LEVEL_I;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 113126854:
                    if (str.equals("width")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 122090044:
                    if (str.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_justify_content)) {
                        c2 = 25;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 143541095:
                    if (str.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_padding_bottom)) {
                        c2 = '\n';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 292087426:
                    if (str.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_border_color)) {
                        c2 = ',';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 310371557:
                    if (str.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_border_width)) {
                        c2 = '+';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 366328779:
                    if (str.equals("dash-width")) {
                        c2 = riy.CONDITION_IF_MIDDLE;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 370434080:
                    if (str.equals("hidden-over-parent")) {
                        c2 = '3';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 529642498:
                    if (str.equals("overflow")) {
                        c2 = '2';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 587430648:
                    if (str.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_align_items)) {
                        c2 = 17;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 605322756:
                    if (str.equals("background-color")) {
                        c2 = '!';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 606085328:
                    if (str.equals("theme-font-scale")) {
                        c2 = riy.CONDITION_IF;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 609634231:
                    if (str.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_border_bottom_left_radius)) {
                        c2 = ')';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 610793468:
                    if (str.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_background_image)) {
                        c2 = WXUtils.PERCENT;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 679766083:
                    if (str.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_padding_left)) {
                        c2 = 7;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 695731883:
                    if (str.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_flex_direction)) {
                        c2 = 24;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 715446705:
                    if (str.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_align_content)) {
                        c2 = 16;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 747804969:
                    if (str.equals("position")) {
                        c2 = 28;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 881039699:
                    if (str.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_border_radius)) {
                        c2 = '&';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 941004998:
                    if (str.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_margin_left)) {
                        c2 = '\f';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 961048153:
                    if (str.equals("foreground-color")) {
                        c2 = '\"';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1052666732:
                    if (str.equals("transform")) {
                        c2 = 'J';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1052832078:
                    if (str.equals("translate")) {
                        c2 = 'C';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1118783052:
                    if (str.equals("accessibility-text")) {
                        c2 = '1';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1384173149:
                    if (str.equals("rotateX")) {
                        c2 = d.LEVEL_E;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1384173150:
                    if (str.equals("rotateY")) {
                        c2 = 'F';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1387629604:
                    if (str.equals(Constants.Value.HORIZONTAL)) {
                        c2 = 23;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1389003308:
                    if (str.equals("enable-self-transition")) {
                        c2 = '8';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1466337535:
                    if (str.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_border_top_left_radius)) {
                        c2 = '\'';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1558777425:
                    if (str.equals("source-transition-name")) {
                        c2 = '6';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1671764162:
                    if (str.equals("display")) {
                        c2 = 27;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1765726747:
                    if (str.equals("dash-gap")) {
                        c2 = '9';
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1941332754:
                    if (str.equals("visibility")) {
                        c2 = fxb.DIR;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1970025654:
                    if (str.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_margin_top)) {
                        c2 = 14;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 2043213058:
                    if (str.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_min_height)) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 2045742989:
                    if (str.equals("apm-valid")) {
                        c2 = d.LEVEL_L;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 2086035242:
                    if (str.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_margin_bottom)) {
                        c2 = 15;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            switch (c2) {
                case 0:
                    this.aa = a(this.bt, context, value);
                    break;
                case 1:
                    this.ab = a(this.bt, context, value);
                    break;
                case 2:
                    this.ac = a(this.bt, context, value);
                    break;
                case 3:
                    this.ad = a(this.bt, context, value);
                    break;
                case 4:
                    this.ae = a(this.bt, context, value);
                    break;
                case 5:
                    this.af = a(this.bt, context, value);
                    break;
                case 6:
                    String[] a2 = oec.a(oec.c(value), ',');
                    if (a2.length == 1) {
                        int a3 = ohd.a(this.bt, context, a2[0]);
                        this.aj = a3;
                        this.ai = a3;
                        this.ah = a3;
                        this.ag = a3;
                        break;
                    } else {
                        this.ag = ohd.a(this.bt, context, a2[0]);
                        this.ai = ohd.a(this.bt, context, a2[1]);
                        this.ah = ohd.a(this.bt, context, a2[2]);
                        this.aj = ohd.a(this.bt, context, a2[3]);
                    }
                case 7:
                    this.ag = a(this.bt, context, value);
                    break;
                case '\b':
                    this.ah = a(this.bt, context, value);
                    break;
                case '\t':
                    this.ai = a(this.bt, context, value);
                    break;
                case '\n':
                    this.aj = a(this.bt, context, value);
                    break;
                case 11:
                    String[] a4 = oec.a(oec.c(value), ',');
                    if (a4.length == 1) {
                        int a5 = ohd.a(this.bt, context, a4[0]);
                        this.an = a5;
                        this.al = a5;
                        this.am = a5;
                        this.ak = a5;
                        break;
                    } else {
                        this.ak = ohd.a(this.bt, context, a4[0]);
                        this.am = ohd.a(this.bt, context, a4[1]);
                        this.al = ohd.a(this.bt, context, a4[2]);
                        this.an = ohd.a(this.bt, context, a4[3]);
                    }
                case '\f':
                    this.ak = a(this.bt, context, value);
                    break;
                case '\r':
                    this.al = a(this.bt, context, value);
                    break;
                case 14:
                    this.am = a(this.bt, context, value);
                    break;
                case 15:
                    this.an = a(this.bt, context, value);
                    break;
                case 16:
                    this.ao = odx.i((String) value);
                    break;
                case 17:
                    this.ap = odx.i((String) value);
                    break;
                case 18:
                    this.aq = odx.i((String) value);
                    break;
                case 19:
                    this.ar = oec.b(value, 0);
                    break;
                case 20:
                    this.as = oec.b(value, 0);
                    break;
                case 21:
                    this.at = oec.b(value, 0);
                    break;
                case 22:
                    this.au = oec.b(value, 0);
                    break;
                case 23:
                    this.av = oec.a(hashMap.get(Constants.Value.HORIZONTAL), false) ? YogaFlexDirection.ROW : YogaFlexDirection.COLUMN;
                    break;
                case 24:
                    this.av = odx.g((String) value);
                    break;
                case 25:
                    this.aw = odx.h((String) value);
                    break;
                case 26:
                    this.ax = odx.f((String) value);
                    break;
                case 27:
                    this.ay = odx.l(oec.a(value, "flex"));
                    break;
                case 28:
                    this.az = odx.j((String) value);
                    break;
                case 29:
                    this.aA = a(this.bt, context, value);
                    break;
                case 30:
                    this.aB = a(this.bt, context, value);
                    break;
                case 31:
                    this.aC = a(this.bt, context, value);
                    break;
                case ' ':
                    this.aD = a(this.bt, context, value);
                    break;
                case '!':
                    m(context, value);
                    break;
                case '\"':
                    k(context, value);
                    break;
                case '#':
                    l(context, value);
                    break;
                case '$':
                    h(context, value);
                    break;
                case '%':
                    j(context, value);
                    break;
                case '&':
                    this.aJ = a(this.bt, context, value);
                    break;
                case '\'':
                    this.aK = a(this.bt, context, value);
                    break;
                case '(':
                    this.aL = a(this.bt, context, value);
                    break;
                case ')':
                    this.aM = a(this.bt, context, value);
                    break;
                case '*':
                    this.aN = a(this.bt, context, value);
                    break;
                case '+':
                    this.aO = a(this.bt, context, value);
                    break;
                case ',':
                    this.aP = odx.a(context, 1, a(str, value), c(), d());
                    break;
                case '-':
                    e(context, value);
                    break;
                case '.':
                    i(context, value);
                    break;
                case '/':
                    c(context, value);
                    break;
                case '0':
                    d(context, value);
                    break;
                case '1':
                    this.aX = oec.a(value, (String) null);
                    break;
                case '2':
                    this.aY = oec.a(value, (String) null);
                    break;
                case '3':
                    this.aZ = oec.a(value, false);
                    break;
                case '4':
                    g(context, value);
                    break;
                case '5':
                    int a6 = oec.a(value, -1);
                    if (a6 >= 0) {
                        this.bb = a6;
                    }
                    break;
                case '6':
                    this.bc = oec.a(value, (String) null);
                    break;
                case '7':
                    this.bd = oec.a(value, (String) null);
                    break;
                case '8':
                    this.be = oec.a(value, false);
                    break;
                case '9':
                    this.aR = a(this.bt, context, value);
                    break;
                case ':':
                    this.aQ = a(this.bt, context, value);
                    break;
                case ';':
                    f(context, value);
                    break;
                case '<':
                    this.bf = oec.a(value, false);
                    break;
                case '=':
                    String a7 = oec.a(value, (String) null);
                    if (a7 != null) {
                        this.bh = b(this.bt, context, a7);
                    } else {
                        this.bh = null;
                    }
                    break;
                case '>':
                    this.bi = oec.a(value, false);
                    break;
                case '?':
                    this.bj = oec.a(value, 1.0d);
                    break;
                case '@':
                    this.bk = oec.a(value, (Map) null);
                    break;
                case 'A':
                case 'B':
                case 'C':
                    z = true;
                    break;
                case 'D':
                case 'E':
                case 'F':
                    z2 = true;
                    break;
                case 'G':
                case 'H':
                case 'I':
                    z3 = true;
                    break;
                case 'J':
                    ofgVar = oek.a(this.bt, context, value);
                    z = true;
                    z2 = true;
                    z3 = true;
                    break;
                case 'K':
                    this.bs = c.a(oec.c(value));
                    break;
                case 'L':
                    this.bz = oec.a(value, true);
                    break;
                case 'M':
                    String a8 = oec.a(value, (String) null);
                    if (!StringUtils.isEmpty(a8)) {
                        List asList = Arrays.asList(a8.split(","));
                        if (this.bA == null) {
                            this.bA = new int[4];
                        }
                        if (asList.size() == 2) {
                            this.bA[0] = a(h(), context, asList.get(0));
                            this.bA[1] = a(h(), context, asList.get(1));
                            int[] iArr = this.bA;
                            iArr[3] = 0;
                            iArr[2] = 0;
                        } else if (asList.size() == 1) {
                            int[] iArr2 = this.bA;
                            int a9 = a(h(), context, asList.get(0));
                            iArr2[1] = a9;
                            iArr2[0] = a9;
                            int[] iArr3 = this.bA;
                            iArr3[3] = 0;
                            iArr3[2] = 0;
                        } else if (asList.size() == 3) {
                            this.bA[0] = a(h(), context, asList.get(0));
                            this.bA[1] = a(h(), context, asList.get(1));
                            this.bA[2] = a(h(), context, asList.get(2));
                            this.bA[3] = 0;
                            break;
                        } else if (asList.size() == 4) {
                            this.bA[0] = a(h(), context, asList.get(0));
                            this.bA[1] = a(h(), context, asList.get(1));
                            this.bA[2] = a(h(), context, asList.get(2));
                            this.bA[3] = a(h(), context, asList.get(3));
                        }
                    }
                default:
                    a(context, str, value);
                    break;
            }
        }
        if (z) {
            a(context, hashMap, ofgVar);
        }
        if (z2) {
            b(context, hashMap, ofgVar);
        }
        if (z3) {
            c(context, hashMap, ofgVar);
        }
        this.bv = null;
    }

    public void h(Context context, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8bf6955", new Object[]{this, context, obj});
            return;
        }
        try {
            this.aG = a.a(this.bt, context, oec.a(a(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_box_shadow, obj), (String) null), c(), d());
        } catch (Exception e) {
            ogg.b(e.getMessage());
        }
    }

    public void i(Context context, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e28a0b34", new Object[]{this, context, obj});
        } else {
            this.aT = oec.b(a("opacity", obj), 1);
        }
    }

    public void j(Context context, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c54ad13", new Object[]{this, context, obj});
        } else {
            this.aI = obj;
        }
    }

    public void k(Context context, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("561f4ef2", new Object[]{this, context, obj});
        } else {
            this.aF = odx.a(context, 1, a("foreground-color", obj), c(), d());
        }
    }

    public void l(Context context, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fe9f0d1", new Object[]{this, context, obj});
        } else {
            this.aH = b.a(context, 2, oec.a(a("background", obj), (String) null), c(), d());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
        if (r9.equals(com.taobao.android.weex_framework.util.a.ATOM_EXT_UDL_border_bottom_left_radius) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(android.content.Context r8, java.lang.String r9, java.lang.Object r10) {
        /*
            r7 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.ogl.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 3
            r3 = 2
            r4 = 0
            r5 = 4
            r6 = 1
            if (r1 == 0) goto L1b
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r1[r4] = r7
            r1[r6] = r8
            r1[r3] = r9
            r1[r2] = r10
            java.lang.String r8 = "ee3c37a5"
            r0.ipc$dispatch(r8, r1)
            return
        L1b:
            r0 = -1
            int r1 = r9.hashCode()
            switch(r1) {
                case -1820411228: goto L5f;
                case -1032412580: goto L55;
                case 292087426: goto L4b;
                case 310371557: goto L41;
                case 609634231: goto L38;
                case 881039699: goto L2e;
                case 1466337535: goto L24;
                default: goto L23;
            }
        L23:
            goto L69
        L24:
            java.lang.String r1 = "border-top-left-radius"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L69
            r2 = 1
            goto L6a
        L2e:
            java.lang.String r1 = "border-radius"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L69
            r2 = 0
            goto L6a
        L38:
            java.lang.String r1 = "border-bottom-left-radius"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L69
            goto L6a
        L41:
            java.lang.String r1 = "border-width"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L69
            r2 = 5
            goto L6a
        L4b:
            java.lang.String r1 = "border-color"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L69
            r2 = 6
            goto L6a
        L55:
            java.lang.String r1 = "border-top-right-radius"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L69
            r2 = 2
            goto L6a
        L5f:
            java.lang.String r1 = "border-bottom-right-radius"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L69
            r2 = 4
            goto L6a
        L69:
            r2 = -1
        L6a:
            switch(r2) {
                case 0: goto Lae;
                case 1: goto La5;
                case 2: goto L9c;
                case 3: goto L93;
                case 4: goto L8a;
                case 5: goto L81;
                case 6: goto L6e;
                default: goto L6d;
            }
        L6d:
            goto Lb6
        L6e:
            java.lang.Object r9 = r7.a(r9, r10)
            com.taobao.tao.flexbox.layoutmanager.core.aa$g r10 = r7.c()
            boolean r0 = r7.d()
            int r8 = tb.odx.a(r8, r6, r9, r10, r0)
            r7.aP = r8
            goto Lb6
        L81:
            com.taobao.tao.flexbox.layoutmanager.core.aa r9 = r7.bt
            int r8 = a(r9, r8, r10)
            r7.aO = r8
            return
        L8a:
            com.taobao.tao.flexbox.layoutmanager.core.aa r9 = r7.bt
            int r8 = a(r9, r8, r10)
            r7.aN = r8
            return
        L93:
            com.taobao.tao.flexbox.layoutmanager.core.aa r9 = r7.bt
            int r8 = a(r9, r8, r10)
            r7.aM = r8
            return
        L9c:
            com.taobao.tao.flexbox.layoutmanager.core.aa r9 = r7.bt
            int r8 = a(r9, r8, r10)
            r7.aL = r8
            return
        La5:
            com.taobao.tao.flexbox.layoutmanager.core.aa r9 = r7.bt
            int r8 = a(r9, r8, r10)
            r7.aK = r8
            return
        Lae:
            com.taobao.tao.flexbox.layoutmanager.core.aa r9 = r7.bt
            int r8 = a(r9, r8, r10)
            r7.aJ = r8
        Lb6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ogl.b(android.content.Context, java.lang.String, java.lang.Object):void");
    }

    private void a(Context context, HashMap hashMap, ofg ofgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1a69553", new Object[]{this, context, hashMap, ofgVar});
            return;
        }
        Object obj = hashMap.get("translateX");
        int a2 = obj != null ? a(this.bt, context, obj) : 0;
        Object obj2 = hashMap.get("translateY");
        int a3 = obj2 != null ? a(this.bt, context, obj2) : 0;
        Object obj3 = hashMap.get("translate");
        if (obj3 != null) {
            List<String> b2 = oec.b(obj3.toString().trim(), ' ');
            if (!b2.isEmpty()) {
                if (b2.size() == 1) {
                    a2 = a(this.bt, context, b2.get(0));
                    a3 = a(this.bt, context, b2.get(0));
                } else if (b2.size() > 1) {
                    a2 = a(this.bt, context, b2.get(0));
                    a3 = a(this.bt, context, b2.get(1));
                }
            }
        }
        if (ofgVar != null && ofgVar.e != null) {
            a2 = (int) ofgVar.e.x;
            a3 = (int) ofgVar.e.y;
        }
        this.bl = a2;
        this.bm = a3;
    }

    private void b(Context context, HashMap hashMap, ofg ofgVar) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("173a9e54", new Object[]{this, context, hashMap, ofgVar});
            return;
        }
        Object obj = hashMap.get("rotate");
        int a2 = obj != null ? oec.a(obj, 0) : 0;
        Object obj2 = hashMap.get("rotateX");
        int a3 = obj2 != null ? oec.a(obj2, 0) : 0;
        Object obj3 = hashMap.get("rotateY");
        if (obj3 != null) {
            i = oec.a(obj3, 0);
        }
        if (ofgVar != null) {
            if (ofgVar.c != -2.14748365E9f) {
                a2 = (int) ofgVar.c;
            }
            if (ofgVar.f31986a != -2.14748365E9f) {
                a3 = (int) ofgVar.f31986a;
            }
            if (ofgVar.b != -2.14748365E9f) {
                i = (int) ofgVar.b;
            }
        }
        this.bn = a2;
        this.bo = a3;
        this.bp = i;
    }

    private void c(Context context, HashMap hashMap, ofg ofgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ccea755", new Object[]{this, context, hashMap, ofgVar});
            return;
        }
        Object obj = hashMap.get("scaleX");
        float f = 1.0f;
        float b2 = obj != null ? oec.b(obj, 1) : 1.0f;
        Object obj2 = hashMap.get("scaleY");
        if (obj2 != null) {
            f = oec.b(obj2, 1);
        }
        Object obj3 = hashMap.get("scale");
        if (obj3 != null) {
            List<String> b3 = oec.b(obj3.toString().trim(), ' ');
            if (!b3.isEmpty()) {
                if (b3.size() == 1) {
                    b2 = oec.a((Object) b3.get(0), b2);
                    f = oec.a((Object) b3.get(0), f);
                } else if (b3.size() > 1) {
                    b2 = oec.a((Object) b3.get(0), b2);
                    f = oec.a((Object) b3.get(1), f);
                }
            }
        }
        if (ofgVar != null && ofgVar.d != null) {
            b2 = ofgVar.d.x;
            f = ofgVar.d.y;
        }
        this.bq = b2;
        this.br = f;
    }

    public static Rect b(aa aaVar, Context context, String str) {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("a1d4c76a", new Object[]{aaVar, context, str});
        }
        if (str != null && (split = str.split(",")) != null && split.length == 4) {
            return new Rect(ohd.a(aaVar, context, a(split[0])), ohd.a(aaVar, context, a(split[1])), ohd.a(aaVar, context, a(split[2])), ohd.a(aaVar, context, a(split[3])));
        }
        return null;
    }

    private static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        if (str == null) {
            return str;
        }
        String trim = str.trim();
        if (trim.endsWith("wx")) {
            trim = trim.substring(0, trim.length() - 2);
        }
        if (trim.endsWith("px")) {
            return trim;
        }
        return trim + "px";
    }

    public void a(aa aaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("691d3050", new Object[]{this, aaVar});
        } else if (aaVar == null) {
        } else {
            this.bu = aaVar.k();
            this.bt = aaVar;
        }
    }

    public aa h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (aa) ipChange.ipc$dispatch("989e392f", new Object[]{this}) : this.bt;
    }

    private boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        g x = com.taobao.tao.flexbox.layoutmanager.adapter.a.a().x();
        return x != null && this.bt.N() != null && x.a(this.bt.N()) && x.b(this.bt.N());
    }

    public Object a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("42bc9164", new Object[]{this, str, obj});
        }
        aa.g c2 = c();
        if (c2 != null && c2.b && !StringUtils.isEmpty(c2.f20302a) && !d() && ("auto".equals(c2.f20302a) || odx.THEME_FORCE_DARK.equals(c2.f20302a))) {
            if (g() && "auto".equals(c2.f20302a)) {
                String str2 = "dark-theme-" + str;
                Map i = i();
                if (i != null && i.containsKey(str2)) {
                    return i.get(str2);
                }
            } else if (odx.THEME_FORCE_DARK.equals(c2.f20302a)) {
                String str3 = "forcedark-theme-" + str;
                Map i2 = i();
                if (i2 != null && i2.containsKey(str3)) {
                    return i2.get(str3);
                }
            }
        }
        return obj;
    }

    private Map i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d67b6a5", new Object[]{this});
        }
        Map map = this.bv;
        if (map != null) {
            return map;
        }
        aa aaVar = this.bt;
        if (aaVar == null) {
            return null;
        }
        return aaVar.y();
    }

    public aa.g c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aa.g) ipChange.ipc$dispatch("4b95bf1", new Object[]{this});
        }
        aa aaVar = this.bt;
        if (aaVar == null) {
            return null;
        }
        return aaVar.M().ab();
    }

    public void m(Context context, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9b492b0", new Object[]{this, context, obj});
        } else {
            this.aE = odx.a(context, 2, a("background-color", obj), c(), d());
        }
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        Map map = this.bv;
        if (map != null) {
            return oec.a(map.get("theme-auto-color-enabled"), true);
        }
        aa aaVar = this.bt;
        if (aaVar == null) {
            return true;
        }
        return oec.a(aaVar.e("theme-auto-color-enabled"), true);
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : StringUtils.equals("hidden", this.aY);
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : this.aJ > 0 || this.aM > 0 || this.aN > 0 || this.aL > 0 || this.aK > 0;
    }
}
