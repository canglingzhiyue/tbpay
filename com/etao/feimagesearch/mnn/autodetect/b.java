package com.etao.feimagesearch.mnn.autodetect;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.Size;
import android.util.SparseArray;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.g;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.x;
import kotlin.text.n;
import tb.kge;

/* loaded from: classes3.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;
    @JSONField(serialize = false)

    /* renamed from: a  reason: collision with root package name */
    public Bitmap f6751a;
    private String b;
    private String c;
    private Long d;
    private Long e;
    private List<RectF> f;
    private List<RectF> g;
    @JSONField(serialize = false)
    private List<Double> h;
    @JSONField(serialize = false)
    private List<Integer> i;
    private String j;
    private String k;
    private int l;
    private boolean m;
    @JSONField(serialize = false)
    private List<String> n;
    private String o;
    private RectF p;
    private String q;
    private String r;

    static {
        kge.a(-385050465);
        Companion = new a(null);
    }

    private b() {
        this.l = -1;
    }

    public /* synthetic */ b(o oVar) {
        this();
    }

    /* loaded from: classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-875984601);
        }

        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }

        @JvmStatic
        public final b a(Bitmap detectBitmap, Long l) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("555b7cc0", new Object[]{this, detectBitmap, l});
            }
            q.c(detectBitmap, "detectBitmap");
            b bVar = new b(null);
            bVar.a(l);
            bVar.a(detectBitmap);
            return bVar;
        }

        @JvmStatic
        public final b a(String str, String str2, Bitmap detectBitmap, Long l, Map<String, ? extends Object> map) {
            List f;
            int i;
            IpChange ipChange = $ipChange;
            int i2 = 4;
            int i3 = 0;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("c2e909af", new Object[]{this, str, str2, detectBitmap, l, map});
            }
            q.c(detectBitmap, "detectBitmap");
            if (map == null || map.isEmpty()) {
                return null;
            }
            b bVar = new b(null);
            try {
                bVar.d(x.f(map.get("labels")));
                bVar.c(x.f(map.get("scores")));
                bVar.c((String) map.get("result_code"));
                String str3 = (String) map.get("result_info");
                if (str3 != null) {
                    String i4 = bVar.i();
                    if (!TextUtils.isEmpty(i4) && (q.a((Object) i4, (Object) com.etao.feimagesearch.mnn.c.INVALID_RESULT_CODE) || q.a((Object) i4, (Object) com.etao.feimagesearch.mnn.c.OLD_ALGORITHM_CODE) || q.a((Object) i4, (Object) "A00003"))) {
                        List b = n.b((CharSequence) str3, new String[]{","}, false, 0, 6, (Object) null);
                        if (b.size() == 4) {
                            try {
                                bVar.a(new RectF(g.a((String) b.get(0), 0.0f), g.a((String) b.get(1), 0.0f), g.a((String) b.get(2), 0.0f), g.a((String) b.get(3), 0.0f)));
                            } catch (Exception unused) {
                                return null;
                            }
                        }
                    }
                } else {
                    str3 = null;
                }
                bVar.d(str3);
                bVar.a(g.b((String) map.get("result_tipid"), -1));
                bVar.a(g.a((String) map.get("debug"), false));
                bVar.e(x.f(map.get(com.taobao.tao.flexbox.layoutmanager.container.b.KEY_ACTIONS)));
                bVar.e(com.etao.feimagesearch.mnn.utils.a.a(map));
                bVar.g((String) map.get("perf_record"));
                bVar.f((String) map.get("tip_buffer"));
                List f2 = x.f(map.get("boxes"));
                if (f2 != null && !f2.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    int size = f2.size();
                    int i5 = 0;
                    while (i5 < size) {
                        List list = (List) f2.get(i5);
                        if (list != null && list.size() == i2) {
                            i = i5;
                            arrayList.add(new RectF((float) ((Number) list.get(i3)).doubleValue(), (float) ((Number) list.get(1)).doubleValue(), (float) ((Number) list.get(2)).doubleValue(), (float) ((Number) list.get(3)).doubleValue()));
                            i5 = i + 1;
                            i2 = 4;
                            i3 = 0;
                        }
                        i = i5;
                        i5 = i + 1;
                        i2 = 4;
                        i3 = 0;
                    }
                    bVar.b(arrayList);
                }
                if (bVar.k() && (f = x.f(map.get("debug_boxes"))) != null && !f.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    int size2 = f.size();
                    for (int i6 = 0; i6 < size2; i6++) {
                        List list2 = (List) f.get(i6);
                        if (list2 != null && list2.size() == 4) {
                            arrayList2.add(new RectF((float) ((Number) list2.get(0)).doubleValue(), (float) ((Number) list2.get(1)).doubleValue(), (float) ((Number) list2.get(2)).doubleValue(), (float) ((Number) list2.get(3)).doubleValue()));
                        }
                    }
                    bVar.a(arrayList2);
                }
                bVar.a(str);
                bVar.b(str2);
                bVar.a(detectBitmap);
                bVar.a(l);
                return bVar;
            } catch (Exception unused2) {
                return null;
            }
        }
    }

    /* renamed from: com.etao.feimagesearch.mnn.autodetect.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0231b {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final C0231b INSTANCE;
        public static final int TYPE_BACK = 3;
        public static final int TYPE_DECODE = 1;
        public static final int TYPE_DECODE_HARD = 5;
        public static final int TYPE_DEFAULT = -1;
        public static final int TYPE_FOCUS = 0;
        public static final int TYPE_OTHER_FACE = 6;
        public static final int TYPE_READY = 4;
        public static final int TYPE_TAG = 2;

        static {
            kge.a(-1214094611);
            INSTANCE = new C0231b();
        }

        private C0231b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @JvmStatic
        public static final SparseArray<String> a() {
            int b;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SparseArray) ipChange.ipc$dispatch("69917611", new Object[0]);
            }
            SparseArray<String> sparseArray = new SparseArray<>();
            String configString = com.etao.feimagesearch.config.b.dp();
            String str = configString;
            if (TextUtils.isEmpty(str)) {
                sparseArray.put(0, "请对准想搜的物品");
                sparseArray.put(1, "检测到条码，解码中");
                sparseArray.put(2, "对准商品正面识别更准");
                sparseArray.put(3, "对准正面拍，结果更准");
                sparseArray.put(4, "识别到商品，即将拉起结果页");
                sparseArray.put(5, "请再靠近一点，或查看【解码帮助】");
                sparseArray.put(6, "对准商品正面识别更准");
            } else {
                q.a((Object) configString, "configString");
                for (String str2 : n.b((CharSequence) str, new String[]{";"}, false, 0, 6, (Object) null)) {
                    List b2 = n.b((CharSequence) str2, new String[]{":"}, false, 0, 6, (Object) null);
                    if (b2.size() == 2 && (b = g.b((String) b2.get(0), -1)) >= 0) {
                        sparseArray.put(b, b2.get(1));
                    }
                }
            }
            return sparseArray;
        }
    }

    public final Bitmap a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("bc740346", new Object[]{this});
        }
        Bitmap bitmap = this.f6751a;
        if (bitmap == null) {
            q.b("detectBitmap");
        }
        return bitmap;
    }

    public final void a(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acc0f2c6", new Object[]{this, bitmap});
            return;
        }
        q.c(bitmap, "<set-?>");
        this.f6751a = bitmap;
    }

    public final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
    }

    public final void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.c;
    }

    public final void a(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ed6d4a7", new Object[]{this, l});
        } else {
            this.d = l;
        }
    }

    public final Long d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Long) ipChange.ipc$dispatch("809bb2ca", new Object[]{this}) : this.d;
    }

    public final void b(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b6fca28", new Object[]{this, l});
        } else {
            this.e = l;
        }
    }

    public final Long e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Long) ipChange.ipc$dispatch("683d8929", new Object[]{this}) : this.e;
    }

    public final void a(List<RectF> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else {
            this.f = list;
        }
    }

    public final void b(List<RectF> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d39e1eda", new Object[]{this, list});
        } else {
            this.g = list;
        }
    }

    public final List<RectF> f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("e89f38ba", new Object[]{this}) : this.g;
    }

    public final void c(List<Double> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e037145b", new Object[]{this, list});
        } else {
            this.h = list;
        }
    }

    public final List<Double> g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("d0410f19", new Object[]{this}) : this.h;
    }

    public final void d(List<Integer> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecd009dc", new Object[]{this, list});
        } else {
            this.i = list;
        }
    }

    public final List<Integer> h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("b7e2e578", new Object[]{this}) : this.i;
    }

    public final void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            this.j = str;
        }
    }

    public final String i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this}) : this.j;
    }

    public final void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else {
            this.k = str;
        }
    }

    public final void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.l = i;
        }
    }

    public final int j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5eb3fe4", new Object[]{this})).intValue() : this.l;
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.m = z;
        }
    }

    public final boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue() : this.m;
    }

    public final void e(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f968ff5d", new Object[]{this, list});
        } else {
            this.n = list;
        }
    }

    public final void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
        } else {
            this.o = str;
        }
    }

    public final String l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("77b5ea0d", new Object[]{this}) : this.o;
    }

    public final void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0cfe3b8", new Object[]{this, str});
        } else {
            this.r = str;
        }
    }

    public final String r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9ed849c7", new Object[]{this}) : this.r;
    }

    public final void a(RectF rectF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4ec1379", new Object[]{this, rectF});
        } else {
            this.p = rectF;
        }
    }

    public final RectF m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RectF) ipChange.ipc$dispatch("41a3d073", new Object[]{this}) : this.p;
    }

    public final void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669e4a77", new Object[]{this, str});
        } else {
            this.q = str;
        }
    }

    public final String q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("18528f28", new Object[]{this}) : this.q;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005c A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean n() {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.etao.feimagesearch.mnn.autodetect.b.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L19
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r2] = r4
            java.lang.String r2 = "6239df9"
            java.lang.Object r0 = r0.ipc$dispatch(r2, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L19:
            java.lang.String r0 = r4.j
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L24
            return r3
        L24:
            java.lang.String r0 = r4.j
            if (r0 != 0) goto L29
            goto L5d
        L29:
            int r1 = r0.hashCode()
            switch(r1) {
                case 1906701455: goto L47;
                case 1906701456: goto L3a;
                case 1906701457: goto L31;
                default: goto L30;
            }
        L30:
            goto L5d
        L31:
            java.lang.String r1 = "A00002"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L5d
            goto L42
        L3a:
            java.lang.String r1 = "A00001"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L5d
        L42:
            android.graphics.RectF r0 = r4.p
            if (r0 != 0) goto L5c
            goto L5d
        L47:
            java.lang.String r1 = "A00000"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L5d
            java.util.List<android.graphics.RectF> r0 = r4.g
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 == 0) goto L5d
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5c
            goto L5d
        L5c:
            r3 = 0
        L5d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etao.feimagesearch.mnn.autodetect.b.n():boolean");
    }

    public final boolean o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[]{this})).booleanValue() : this.l >= 0 || !n();
    }

    public final boolean p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[]{this})).booleanValue() : q.a((Object) this.j, (Object) com.etao.feimagesearch.mnn.c.NEW_ALGORITHM_CODE);
    }

    public final int a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821884b", new Object[]{this, new Float(f)})).intValue();
        }
        RectF rectF = this.p;
        if (rectF == null) {
            return -1;
        }
        float width = rectF.width() * rectF.height();
        if (width > 0) {
            float f2 = 1;
            if (width <= f2) {
                float centerX = rectF.centerX();
                float centerY = rectF.centerY();
                float f3 = f2 - 0.05f;
                return (int) Math.min(Math.min(Math.min((centerX - 0.05f) / (centerX - rectF.left), (f3 - centerX) / (rectF.right - centerX)), Math.min((centerY - 0.05f) / (centerY - rectF.top), (f3 - centerY) / (rectF.bottom - centerY))), (float) Math.sqrt(f / width));
            }
        }
        return -1;
    }

    public final Point a(Size size) {
        RectF rectF;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Point) ipChange.ipc$dispatch("6d726b2e", new Object[]{this, size});
        }
        if (size == null || (rectF = this.p) == null) {
            return null;
        }
        RectF rectF2 = new RectF(rectF.left * size.getWidth(), rectF.top * size.getHeight(), rectF.right * size.getWidth(), rectF.bottom * size.getHeight());
        return new Point((int) rectF2.centerX(), (int) rectF2.centerY());
    }

    public final String a(SparseArray<String> tipConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5783d635", new Object[]{this, tipConfig});
        }
        q.c(tipConfig, "tipConfig");
        String str = tipConfig.get(this.l);
        return str == null ? "" : str;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        String jSONString = JSON.toJSONString(this);
        q.a((Object) jSONString, "JSON.toJSONString(this)");
        return jSONString;
    }
}
