package tb;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.android.umbrella.link.export.UMLLCons;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexErrorType;
import com.taobao.android.weex.WeexExternalEventCheckException;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexInstanceImpl;
import com.taobao.android.weex.WeexInstanceInternalMode;
import com.taobao.android.weex.WeexRenderType;
import com.taobao.android.weex.WeexValue;
import com.taobao.android.weex.config.WeexUnicornConfig;
import com.taobao.android.weex.g;
import com.taobao.android.weex.h;
import com.taobao.android.weex.instance.WeexDOMInstance;
import com.taobao.android.weex_framework.common.expection.WXExceptionConfig;
import com.taobao.android.weex_framework.common.expection.a;
import com.taobao.android.weex_framework.ui.b;
import com.taobao.android.weex_framework.ui.c;
import com.taobao.android.weex_framework.ui.h;
import com.taobao.android.weex_framework.ui.i;
import com.taobao.android.weex_framework.ui.n;
import com.taobao.android.weex_framework.util.f;
import com.taobao.android.weex_framework.util.l;
import com.taobao.android.weex_framework.util.o;
import com.taobao.android.weex_framework.util.r;
import com.taobao.android.weex_framework.util.s;
import com.taobao.android.weex_framework.util.t;
import com.taobao.weex.common.Constants;
import com.taobao.weex.utils.tools.TimeCalculator;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import tb.mto;

/* loaded from: classes6.dex */
public class juk implements h, juh {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String UNICORN_CONFIG_GROUP = "weexv2_option_abconfig";
    private jvs b;
    private c c;
    private i e;
    private final WeexInstanceImpl g;
    private View h;
    private final WeexInstance j;
    private final int k;
    private volatile jvr l;
    private WeexUnicornConfig t;
    private a u;
    private WeakReference<View> v;
    private b d = new b();
    private com.taobao.android.weex_framework.ui.h f = null;
    private n q = null;
    private final ArrayList<String> i = new ArrayList<>();
    private final ConcurrentHashMap<Integer, WeexInstance> m = new ConcurrentHashMap<>();
    private final long n = System.currentTimeMillis();
    private boolean o = false;
    private ArrayList<o> p = null;

    /* renamed from: a  reason: collision with root package name */
    public HashMap<String, String> f29774a = new HashMap<>();
    private int[] r = null;
    private boolean s = false;

    static {
        kge.a(-429335928);
        kge.a(971616296);
        kge.a(1947023493);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        }
    }

    @Override // com.taobao.android.weex.h
    public void onExecuteSuccess(WeexInstance weexInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad8178b2", new Object[]{this, weexInstance});
        }
    }

    public static /* synthetic */ double a(juk jukVar, jtz jtzVar, String str, Long l, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("20390dd9", new Object[]{jukVar, jtzVar, str, l, str2})).doubleValue() : jukVar.a(jtzVar, str, l, str2);
    }

    public static /* synthetic */ WeexInstanceImpl a(juk jukVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeexInstanceImpl) ipChange.ipc$dispatch("1365d55c", new Object[]{jukVar}) : jukVar.g;
    }

    public static /* synthetic */ void b(juk jukVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de9c08d9", new Object[]{jukVar});
        } else {
            jukVar.A();
        }
    }

    public static /* synthetic */ c c(juk jukVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("dc1e0007", new Object[]{jukVar}) : jukVar.c;
    }

    public static /* synthetic */ b d(juk jukVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("9f69a47", new Object[]{jukVar}) : jukVar.d;
    }

    public static /* synthetic */ com.taobao.android.weex_framework.ui.h e(juk jukVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.weex_framework.ui.h) ipChange.ipc$dispatch("37cf3560", new Object[]{jukVar}) : jukVar.f;
    }

    public static /* synthetic */ jvs f(juk jukVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jvs) ipChange.ipc$dispatch("33ba942", new Object[]{jukVar}) : jukVar.b;
    }

    public static /* synthetic */ jvr g(juk jukVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jvr) ipChange.ipc$dispatch("eadd7f82", new Object[]{jukVar}) : jukVar.l;
    }

    public static /* synthetic */ void h(juk jukVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75ae2fdf", new Object[]{jukVar});
        } else {
            jukVar.D();
        }
    }

    public static /* synthetic */ void i(juk jukVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64313660", new Object[]{jukVar});
        } else {
            jukVar.C();
        }
    }

    public juk(WeexInstanceImpl weexInstanceImpl, WeexInstance weexInstance, int i, com.taobao.android.weex.config.b bVar) {
        this.e = null;
        boolean z = false;
        this.g = weexInstanceImpl;
        this.j = weexInstance;
        this.k = i;
        if (bVar != null && bVar.a() != null) {
            this.t = bVar.a();
        } else {
            this.t = new WeexUnicornConfig();
        }
        z = (weexInstanceImpl.getMode() == WeexInstanceInternalMode.CANAL_MAIN || weexInstanceImpl.getMode() == WeexInstanceInternalMode.CANAL_SUB || weexInstanceImpl.getMode() == WeexInstanceInternalMode.XR) ? true : z;
        ArrayList<String> arrayList = this.i;
        HashMap<String, String> c = this.t.c();
        a(arrayList, c, weexInstanceImpl.getInstanceId() + "", z);
        this.i.addAll(weexInstanceImpl.getRenderEngineOptions());
        if (this.t.e()) {
            this.i.add("--enable-earlier-ready=true");
        }
        this.e = this.t.d();
        try {
            if (this.t.b() == WeexUnicornConfig.RenderMode.image) {
                this.t.a(WeexUnicornConfig.RenderMode.texture);
            }
        } catch (Exception unused) {
        }
        weexInstanceImpl.addInstanceListener(this);
    }

    public static void a(ArrayList<String> arrayList, HashMap<String, String> hashMap, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebae3279", new Object[]{arrayList, hashMap, str, new Boolean(z)});
            return;
        }
        arrayList.addAll(f.a((Map<String, Boolean>) null));
        arrayList.add("--instance-id=" + str);
        String c = f.c();
        arrayList.add("--screenshot-pixel-check-duration=" + c);
        arrayList.add("--thread-count=" + String.valueOf(f.d()));
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            arrayList.add("--" + entry.getKey() + "=" + entry.getValue());
        }
    }

    public List<String> j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("87269236", new Object[]{this}) : this.i;
    }

    public i k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i) ipChange.ipc$dispatch("58914da9", new Object[]{this}) : this.e;
    }

    public View a(com.taobao.android.weex_framework.ui.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("7d0fa0d0", new Object[]{this, hVar});
        }
        this.f = hVar;
        this.f.a(this.g.getContext());
        this.f.a();
        int[] iArr = this.r;
        if (iArr != null) {
            this.f.a(iArr[0], iArr[1]);
        }
        this.h = this.f.d();
        t.a(this.g.getInstanceId(), "bindView", this.h);
        B();
        x();
        if (!this.s && this.r != null) {
            this.f.w();
        }
        F();
        return this.h;
    }

    private void F() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eff1cd", new Object[]{this});
            return;
        }
        String v = f.v();
        if (TextUtils.isEmpty(v) || this.g == null || this.f == null) {
            return;
        }
        String[] split = v.split(",");
        String bundleUrl = this.g.getBundleUrl();
        if (!TextUtils.isEmpty(bundleUrl)) {
            int length = split.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (bundleUrl.contains(split[i])) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
        }
        if (!z) {
            return;
        }
        this.f.a(new xmp() { // from class: tb.juk.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.xmp
            public void a(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                    return;
                }
                int instanceId = juk.a(juk.this).getInstanceId();
                r.a(instanceId, "Unicorn", "当前页面:" + juk.a(juk.this).getContext() + ",msg:" + str).a();
            }
        });
    }

    private void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b088ff", new Object[]{this});
        } else if (TextUtils.isEmpty(this.g.getBundleUrl())) {
        } else {
            Uri parse = Uri.parse(this.g.getBundleUrl());
            if (!parse.isHierarchical() || !"true".equals(parse.getQueryParameter("wx_limit_raster_cache"))) {
                return;
            }
            y();
        }
    }

    private void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bea080", new Object[]{this});
        } else if (this.f == null || this.g.getContext() == null) {
        } else {
            this.f.a("setRasterCacheLimitSize", Float.valueOf(l.f(this.g.getContext()) * l.d(this.g.getContext()) * l.c(this.g.getContext())));
        }
    }

    @Override // tb.juh
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.o = z;
        }
    }

    @Override // tb.juh
    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.r = new int[2];
        int[] iArr = this.r;
        iArr[0] = i;
        iArr[1] = i2;
        com.taobao.android.weex_framework.ui.h hVar = this.f;
        if (hVar == null) {
            return;
        }
        hVar.a(i, i2);
    }

    @Override // tb.juh
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        com.taobao.android.weex_framework.ui.h hVar = this.f;
        if (hVar == null) {
            return;
        }
        hVar.r();
    }

    @Override // tb.juh
    public void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
        } else if (view == null) {
        } else {
            this.v = new WeakReference<>(view);
            this.d.a(this.v);
            if (this.f == null || this.g.getRootView() == null) {
                return;
            }
            this.f.a(true, this.d, null);
            this.g.getRootView().setOnTouchListener(this.d);
        }
    }

    @Override // tb.juh
    public void a(jvs jvsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f02abcd1", new Object[]{this, jvsVar});
            return;
        }
        this.b = jvsVar;
        a(new o() { // from class: tb.juk.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.weex_framework.util.o
            public void a() throws Exception {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    juk.b(juk.this);
                }
            }
        });
    }

    @Override // tb.juh
    public void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ec96a33", new Object[]{this, cVar});
            return;
        }
        this.c = cVar;
        if (this.d == null) {
            this.d = new b();
        }
        a(new o() { // from class: tb.juk.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.weex_framework.util.o
            public void a() throws Exception {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                juk.d(juk.this).a(juk.c(juk.this));
                if (juk.e(juk.this) == null) {
                    return;
                }
                juk.e(juk.this).a(true, juk.d(juk.this), null);
            }
        });
    }

    @Override // tb.juh
    public void a(final jvq jvqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f029d413", new Object[]{this, jvqVar});
        } else {
            a(new o() { // from class: tb.juk.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex_framework.util.o
                public void a() throws Exception {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        juk.e(juk.this).a(true, null, new h.a() { // from class: tb.juk.5.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // com.taobao.android.weex_framework.ui.h.a
                            public void a(boolean z, String str) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("f7197a36", new Object[]{this, new Boolean(z), str});
                                    return;
                                }
                                HashMap hashMap = new HashMap();
                                hashMap.put("state", Boolean.valueOf(z));
                                hashMap.put("acceptGestureType", str);
                                jvqVar.a(hashMap);
                            }
                        });
                    }
                }
            });
        }
    }

    @Override // tb.juh
    public void b(final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            a(new o() { // from class: tb.juk.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex_framework.util.o
                public void a() throws Exception {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else if (juk.e(juk.this) == null) {
                    } else {
                        juk.e(juk.this).a("scrollable.enableScroll", Boolean.valueOf(z));
                    }
                }
            });
        }
    }

    @Override // tb.juh
    public void a(final int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            a(new o() { // from class: tb.juk.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex_framework.util.o
                public void a() throws Exception {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else if (juk.e(juk.this) == null) {
                    } else {
                        HashMap hashMap = new HashMap();
                        hashMap.put("velocity", Integer.valueOf(i));
                        hashMap.put("velocityX", Integer.valueOf(i));
                        hashMap.put("velocityY", Integer.valueOf(i));
                        juk.e(juk.this).a("scrollable.goBallistic", hashMap);
                    }
                }
            });
        }
    }

    @Override // tb.juh
    public View d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f7f4866d", new Object[]{this});
        }
        View view = this.h;
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        return ((ViewGroup) view).getChildAt(0);
    }

    @Override // tb.juh
    public void a(jvr jvrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f02a4872", new Object[]{this, jvrVar});
        } else {
            this.l = jvrVar;
        }
    }

    public void a(int i, String str, int i2, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41448148", new Object[]{this, new Integer(i), str, new Integer(i2), str2});
            return;
        }
        z().a(i, str, String.valueOf(i2), str2, this.g.getInstanceId());
        z().a(i, str, String.valueOf(i2), str2, "", this.g);
    }

    private a z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("779a6bcb", new Object[]{this});
        }
        if (this.u == null) {
            this.u = new a();
        }
        return this.u;
    }

    public WeexInstance a(Context context, String str, int i, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexInstance) ipChange.ipc$dispatch("b945f33b", new Object[]{this, context, str, new Integer(i), new Float(f), new Float(f2)});
        }
        s.a("WeexCreateEmbed");
        Pair<String, String> a2 = com.taobao.android.weex.util.b.a(str);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("width", (Object) Float.valueOf(f));
        jSONObject2.put("height", (Object) Float.valueOf(f2));
        jSONObject.put("render_param", (Object) jSONObject2);
        g gVar = new g(context, (String) a2.first, (String) a2.second, WeexInstanceInternalMode.DOM, WeexRenderType.UNICORN);
        gVar.i = this.g;
        gVar.j = i;
        gVar.f = jSONObject;
        WeexDOMInstance createEmbed = WeexDOMInstance.createEmbed(gVar);
        this.m.put(Integer.valueOf(i), createEmbed);
        s.b("WeexCreateEmbed");
        return createEmbed;
    }

    public WeexInstance b(Context context, String str, int i, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexInstance) ipChange.ipc$dispatch("1ba10a1a", new Object[]{this, context, str, new Integer(i), new Float(f), new Float(f2)});
        }
        s.a("WeexCreateEmbedAsync");
        Pair<String, String> a2 = com.taobao.android.weex.util.b.a(str);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("width", (Object) Float.valueOf(f));
        jSONObject2.put("height", (Object) Float.valueOf(f2));
        jSONObject.put("render_param", (Object) jSONObject2);
        g gVar = new g(context, (String) a2.first, (String) a2.second, WeexInstanceInternalMode.DOM, WeexRenderType.UNICORN);
        gVar.i = this.g;
        gVar.j = i;
        gVar.f = jSONObject;
        gVar.k = true;
        WeexDOMInstance createEmbed = WeexDOMInstance.createEmbed(gVar);
        this.m.put(Integer.valueOf(i), createEmbed);
        s.b("WeexCreateEmbedAsync");
        return createEmbed;
    }

    public WeexInstance b(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeexInstance) ipChange.ipc$dispatch("dd2f377a", new Object[]{this, new Integer(i)}) : this.m.get(Integer.valueOf(i));
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
        } else {
            this.m.remove(Integer.valueOf(i));
        }
    }

    public void a(int i, WeexInstance weexInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f14fee79", new Object[]{this, new Integer(i), weexInstance});
        } else {
            this.m.put(Integer.valueOf(i), weexInstance);
        }
    }

    public Map<Integer, WeexInstance> l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("7666dbe8", new Object[]{this}) : this.m;
    }

    public boolean m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6158678", new Object[]{this})).booleanValue() : this.j != null;
    }

    public WeexInstance n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeexInstance) ipChange.ipc$dispatch("4550e9f", new Object[]{this}) : this.j;
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        com.taobao.android.weex_framework.ui.h hVar = this.f;
        if (hVar == null) {
            return;
        }
        hVar.i();
        this.f.j();
    }

    public void a(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ece6a48", new Object[]{this, nVar});
        } else {
            this.q = nVar;
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        s.a("ensureDelayedRenderComponent");
        if (this.f == null && this.q != null) {
            z = true;
        }
        com.taobao.android.weex.util.c.a(z);
        this.q.a(this.g);
        this.q = null;
        s.b("ensureDelayedRenderComponent");
    }

    public void b(com.taobao.android.weex_framework.ui.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96c728f", new Object[]{this, hVar});
            return;
        }
        s.a("bindRenderComponent");
        ((ViewGroup) this.g.getRootView()).addView(a(hVar), -1, -1);
        s.b("bindRenderComponent");
    }

    private Map<String, String> d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ecd53dad", new Object[]{this, new Integer(i)});
        }
        com.taobao.android.weex_framework.ui.h hVar = this.f;
        if (hVar == null) {
            return null;
        }
        return hVar.c(i);
    }

    private void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a97c48", new Object[]{this});
            return;
        }
        com.taobao.android.weex_framework.ui.h hVar = this.f;
        if (hVar == null || this.b == null) {
            return;
        }
        hVar.a(new h.b() { // from class: tb.juk.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.weex_framework.ui.h.b
            public void a(double d, double d2, String str, org.json.JSONObject jSONObject) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6040530c", new Object[]{this, new Double(d), new Double(d2), str, jSONObject});
                } else if (juk.f(juk.this) == null) {
                } else {
                    HashMap hashMap = new HashMap();
                    hashMap.put("pixels", Double.valueOf(d));
                    hashMap.put("velocity", Double.valueOf(d2));
                    hashMap.put(Constants.Name.CONTENT_OFFSET, jSONObject);
                    hashMap.put("axis", str);
                    juk.f(juk.this).a(hashMap);
                }
            }
        });
    }

    private void a(a aVar, int i, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11a39ba3", new Object[]{this, aVar, new Integer(i), str, str2, str3});
            return;
        }
        aVar.a(i, str, str2, str3, this.g.getInstanceId());
        aVar.a(i, str, str2, str3, "", this.g);
    }

    public void a(jtz jtzVar, HashMap<String, String> hashMap, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd913955", new Object[]{this, jtzVar, hashMap, str});
        } else {
            a(hashMap, jtzVar, str);
        }
    }

    public void a(jtz jtzVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d979c32", new Object[]{this, jtzVar, str});
        } else {
            a((HashMap<String, String>) null, jtzVar, str);
        }
    }

    private void a(HashMap<String, String> hashMap, final jtz jtzVar, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3e40655", new Object[]{this, hashMap, jtzVar, str});
        } else if (this.f == null) {
        } else {
            if (!f.l()) {
                hashMap = this.f.a(this.g.getInstanceId());
                a(hashMap, jtzVar);
            }
            final String str2 = hashMap.get("area_coverage");
            final String str3 = hashMap.get("end_time_stamp");
            final String str4 = hashMap.get("end_time_stamp_opt");
            final String str5 = hashMap.get("raster_end_time_stamp_opt");
            Long l = null;
            if (!TextUtils.isEmpty(str2)) {
                try {
                    l = Long.valueOf(str2);
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }
            final Long l2 = l;
            final String k = this.f.k();
            if (SystemClock.uptimeMillis() - SystemClock.uptimeMillis() > 3000.0d) {
                this.g.reportEngineException(WXExceptionConfig.EXCEPTION_WEEX_FRAMEWORK, "GET_SCREEN_PIXEL_TIMEOUT", "java getScreenshotPixelCheckInfo() over 3s");
            }
            if (f.l()) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: tb.juk.9
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        double a2 = juk.a(juk.this, jtzVar, k, l2, str);
                        if (juk.g(juk.this) == null) {
                            return;
                        }
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put(jvw.KEY_PAGE_STAGES_AREA_COVERAGE, str2);
                        hashMap2.put("wxInteraction", str3);
                        hashMap2.put(jvw.KEY_PAGE_STAGES_INTERACTION_OPT, str4);
                        hashMap2.put(jvw.KEY_PAGE_STAGES_RASTER_INTERACTION_OPT, str5);
                        hashMap2.put(jvw.KEY_PAGE_STAGES_SAME_PIXEL_MAX_COUNT, Double.valueOf(a2));
                        juk.g(juk.this).a(hashMap2);
                    }
                });
                return;
            }
            double a2 = a(jtzVar, k, l2, str);
            if (this.l == null) {
                return;
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.put(jvw.KEY_PAGE_STAGES_AREA_COVERAGE, str2);
            hashMap2.put("wxInteraction", str3);
            hashMap2.put(jvw.KEY_PAGE_STAGES_INTERACTION_OPT, str4);
            hashMap2.put(jvw.KEY_PAGE_STAGES_RASTER_INTERACTION_OPT, str5);
            hashMap2.put(jvw.KEY_PAGE_STAGES_SAME_PIXEL_MAX_COUNT, Double.valueOf(a2));
            this.l.a(hashMap2);
        }
    }

    private double a(jtz jtzVar, String str, Long l, String str2) {
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        JSONArray jSONArray;
        boolean z;
        double d6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1adb7fe9", new Object[]{this, jtzVar, str, l, str2})).doubleValue();
        }
        int instanceId = this.g.getInstanceId();
        a z2 = z();
        String str3 = "";
        boolean isEmpty = TextUtils.isEmpty(str);
        double d7 = mto.a.GEO_NOT_SUPPORT;
        if (isEmpty) {
            return mto.a.GEO_NOT_SUPPORT;
        }
        try {
            JSONObject parseObject = JSON.parseObject(str);
            double doubleValue = parseObject.getDouble("account_for").doubleValue();
            String string = parseObject.getString("pic_cull_rect");
            if (f.e()) {
                try {
                    JSONArray jSONArray2 = parseObject.getJSONArray("platform_view_rects");
                    double doubleValue2 = parseObject.getDouble("frame_size").doubleValue();
                    if (doubleValue2 > mto.a.GEO_NOT_SUPPORT) {
                        if (jSONArray2 != null) {
                            String str4 = str3;
                            d5 = 0.0d;
                            double d8 = 0.0d;
                            int i = 0;
                            while (i < jSONArray2.size()) {
                                JSONObject jSONObject = jSONArray2.getJSONObject(i);
                                int intValue = jSONObject.getInteger("view_id").intValue();
                                Map<String, String> d9 = d(intValue);
                                if (d9 != null) {
                                    jSONArray = jSONArray2;
                                    z = Boolean.parseBoolean(d9.get("isWhiteScreen"));
                                    str4 = str4 + intValue + "_" + d9.get("message") + ",";
                                } else {
                                    jSONArray = jSONArray2;
                                    z = false;
                                }
                                double doubleValue3 = jSONObject.getDouble("area").doubleValue();
                                d8 += z ? doubleValue3 / doubleValue2 : mto.a.GEO_NOT_SUPPORT;
                                d5 += doubleValue3;
                                i++;
                                jSONArray2 = jSONArray;
                            }
                            str3 = str4;
                            d = d8;
                        } else {
                            d = mto.a.GEO_NOT_SUPPORT;
                            d5 = mto.a.GEO_NOT_SUPPORT;
                        }
                        d2 = (((doubleValue2 - d5) * doubleValue) / doubleValue2) + (d * 100.0d);
                    } else {
                        d = mto.a.GEO_NOT_SUPPORT;
                        d2 = mto.a.GEO_NOT_SUPPORT;
                    }
                    d3 = d;
                    d7 = d2;
                    d4 = mto.a.GEO_NOT_SUPPORT;
                } catch (Throwable th) {
                    th = th;
                    d7 = mto.a.GEO_NOT_SUPPORT;
                    th.printStackTrace();
                    return d7;
                }
            } else {
                d7 = doubleValue;
                d4 = mto.a.GEO_NOT_SUPPORT;
                d3 = mto.a.GEO_NOT_SUPPORT;
            }
            if (d7 > d4) {
                try {
                    jtzVar.a().b(jvw.KEY_PAGE_STAGES_SAME_PIXEL_MAX_COUNT, Double.valueOf(d7).longValue());
                    r.d(instanceId, UMLLCons.FEATURE_TYPE_PAGE, "samePixelMaxCount").a("screenshotAccountFor", Double.valueOf(d7)).a();
                } catch (Throwable th2) {
                    th = th2;
                    th.printStackTrace();
                    return d7;
                }
            }
            try {
                if (d7 >= f.c(str2) && !this.o) {
                    if (l != null) {
                        String str5 = null;
                        if (l.longValue() == -1) {
                            str5 = "001";
                        } else if (l.longValue() >= 0 && l.longValue() <= 10) {
                            str5 = "000";
                        }
                        String str6 = str5;
                        if (str6 != null) {
                            z2.a(WXExceptionConfig.EXCEPTION_AREA_COVERAGE, WXExceptionConfig.KEY_AREA_COVERAGE, str6, "area coverage:" + l, instanceId);
                        }
                    }
                    double d10 = d3 * 100.0d;
                    if (d10 > d7 - d10) {
                        z2.a(10031, WXExceptionConfig.KEY_WHITE_SCREEN_PLATFORM_VIEW, "000", str3, instanceId);
                    }
                    if (parseObject.getBooleanValue("empty_root_layer_paint_bounds")) {
                        z2.a(WXExceptionConfig.EXCEPTION_UNICORN, WXExceptionConfig.KEY_WHITE_SCREEN_EMPTY_ROOT_LAYER_PAINT_BOUNDS, "000", "root layer paint bounds was empty", instanceId);
                    }
                    if (parseObject.getLongValue("duration") >= 5000.0d) {
                        d6 = d7;
                        try {
                            a(z2, WXExceptionConfig.EXCEPTION_WHITE_SCREEN_GE_5s, WXExceptionConfig.KEY_WHITE, "DEFAULT", "white screen pixel check\n account for:" + d7 + "  pic cull rect:" + string);
                        } catch (Throwable th3) {
                            th = th3;
                            d7 = d6;
                            th.printStackTrace();
                            return d7;
                        }
                    } else {
                        d6 = d7;
                    }
                    a(z2, 10018, WXExceptionConfig.KEY_WHITE, "DEFAULT", "white screen pixel check\n account for:" + d6 + "  pic cull rect:" + string);
                    return d6;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
        }
        return d7;
    }

    private void a(HashMap<String, String> hashMap, jtz jtzVar) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7800794b", new Object[]{this, hashMap, jtzVar});
        } else if (hashMap != null) {
            int instanceId = this.g.getInstanceId();
            String str = hashMap.get("end_time_interval");
            long j6 = -1;
            if (!TextUtils.isEmpty(str)) {
                try {
                    j = Long.valueOf(str).longValue();
                } catch (NumberFormatException unused) {
                    j = -1;
                }
                if (j > 0) {
                    jtzVar.a().b("wxInteraction", j);
                    r.a(instanceId, UMLLCons.FEATURE_TYPE_PAGE, noa.VALUE_BOT_SEARCH).a(this.n + j).a("time", Long.valueOf(j)).a();
                }
            }
            String str2 = hashMap.get("end_time_interval_opt");
            if (!TextUtils.isEmpty(str2)) {
                try {
                    j2 = Long.parseLong(str2);
                } catch (NumberFormatException unused2) {
                    j2 = -1;
                }
                if (j2 > 0) {
                    jtzVar.a().b(jvw.KEY_PAGE_STAGES_INTERACTION_OPT, j2);
                    r.a(instanceId, UMLLCons.FEATURE_TYPE_PAGE, "interactionOpt").a(this.n + j2).a("time", Long.valueOf(j2)).a();
                }
            }
            String str3 = hashMap.get("end_time_interval_screen_ratio");
            if (!TextUtils.isEmpty(str3)) {
                try {
                    j3 = Long.parseLong(str3);
                } catch (NumberFormatException unused3) {
                    j3 = -1;
                }
                if (j3 > 0) {
                    jtzVar.a().b(jvw.KEY_PAGE_STAGES_INTERACTION_SCREEN_RATIO, j3);
                    r.a(instanceId, UMLLCons.FEATURE_TYPE_PAGE, "interactionScreenRatio").a(this.n + j3).a("time", Long.valueOf(j3)).a();
                }
            }
            String str4 = hashMap.get("raster_end_time_interval_screen_ratio");
            if (!TextUtils.isEmpty(str4)) {
                try {
                    j4 = Long.parseLong(str4);
                } catch (NumberFormatException unused4) {
                    j4 = -1;
                }
                if (j4 > 0) {
                    jtzVar.a().b(jvw.KEY_PAGE_STAGES_RASTER_INTERACTION_SCREEN_RATIO, j4);
                    r.a(instanceId, UMLLCons.FEATURE_TYPE_PAGE, "interactionScreenRatioRaster").a(this.n + j4).a("time", Long.valueOf(j4)).a();
                }
            }
            String str5 = hashMap.get("raster_end_time_interval_opt");
            if (!TextUtils.isEmpty(str5)) {
                try {
                    j5 = Long.parseLong(str5);
                } catch (NumberFormatException unused5) {
                    j5 = -1;
                }
                if (j5 > 0) {
                    jtzVar.a().b(jvw.KEY_PAGE_STAGES_RASTER_INTERACTION_OPT, j5);
                    r.a(instanceId, UMLLCons.FEATURE_TYPE_PAGE, "interactionOptRaster").a(this.n + j5).a("time", Long.valueOf(j5)).a();
                }
            }
            String str6 = hashMap.get("area_coverage");
            Long l = null;
            if (!TextUtils.isEmpty(str6)) {
                try {
                    l = Long.valueOf(str6);
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
                if (l != null) {
                    r.d(instanceId, UMLLCons.FEATURE_TYPE_PAGE, "area").a("coverage", l).a();
                    jtzVar.a().b(jvw.KEY_PAGE_STAGES_AREA_COVERAGE, l.longValue());
                    com.taobao.android.weex_framework.util.g.f("Instance", "unicorn fsp area coverage:" + l);
                }
            }
            String str7 = hashMap.get("raster_end_time_interval");
            if (!TextUtils.isEmpty(str7)) {
                try {
                    j6 = Long.valueOf(str7).longValue();
                } catch (NumberFormatException unused6) {
                }
                if (j6 > 0) {
                    jtzVar.a().b(jvw.KEY_PAGE_STAGES_RASTER_INTERACTION, j6);
                    r.a(instanceId, UMLLCons.FEATURE_TYPE_PAGE, jvw.KEY_PAGE_STAGES_RASTER_INTERACTION).a(this.n + j6).a("time", Long.valueOf(j6)).a();
                }
            }
            String str8 = hashMap.get(TimeCalculator.TIMELINE_TAG);
            if (TextUtils.isEmpty(str8) || TextUtils.isEmpty(str8)) {
                return;
            }
            try {
                JSONObject parseObject = JSON.parseObject(str8);
                if (parseObject == null) {
                    return;
                }
                for (Map.Entry<String, Object> entry : parseObject.entrySet()) {
                    if (entry.getValue() instanceof JSONObject) {
                        Object obj = ((JSONObject) entry.getValue()).get(Constants.Name.INTERVAL);
                        if (obj instanceof BigDecimal) {
                            jtzVar.a().b("wxUni" + entry.getKey(), ((BigDecimal) obj).longValue());
                        }
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private void a(o oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63bff939", new Object[]{this, oVar});
        } else if (this.f != null) {
            oVar.run();
        } else {
            if (this.p == null) {
                this.p = new ArrayList<>();
            }
            this.p.add(oVar);
        }
    }

    private void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b793c9", new Object[]{this});
            return;
        }
        ArrayList<o> arrayList = this.p;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        Iterator<o> it = this.p.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
        this.p = null;
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        r.a(this.g.getInstanceId(), UMLLCons.FEATURE_TYPE_PAGE, "onActivityStart").a();
        a(new o() { // from class: tb.juk.10
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.weex_framework.util.o
            public void a() throws Exception {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else if (juk.e(juk.this) == null) {
                } else {
                    juk.e(juk.this).v();
                    juk.e(juk.this).e();
                    if (!f.g()) {
                        return;
                    }
                    juk.h(juk.this);
                }
            }
        });
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
            return;
        }
        r.a(this.g.getInstanceId(), UMLLCons.FEATURE_TYPE_PAGE, "onActivityResume").a();
        WeexValue weexValue = this.g.getInstanceInfo().get("js_version_info");
        z().a(this.g.getBundleUrl(), weexValue == null ? "" : weexValue.toStringValue(), "true");
        a(new o() { // from class: tb.juk.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.weex_framework.util.o
            public void a() throws Exception {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else if (juk.e(juk.this) == null) {
                } else {
                    juk.e(juk.this).f();
                    if (f.g()) {
                        return;
                    }
                    juk.h(juk.this);
                }
            }
        });
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
            return;
        }
        r.a(this.g.getInstanceId(), UMLLCons.FEATURE_TYPE_PAGE, "onActivityPause").a();
        z().a("", "", "");
        a(new o() { // from class: tb.juk.11
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.weex_framework.util.o
            public void a() throws Exception {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else if (juk.e(juk.this) == null) {
                } else {
                    juk.e(juk.this).g();
                    if (f.g()) {
                        return;
                    }
                    juk.i(juk.this);
                }
            }
        });
    }

    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
            return;
        }
        r.a(this.g.getInstanceId(), UMLLCons.FEATURE_TYPE_PAGE, "onActivityStop").a();
        a(new o() { // from class: tb.juk.12
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.weex_framework.util.o
            public void a() throws Exception {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else if (juk.e(juk.this) == null) {
                } else {
                    juk.e(juk.this).h();
                    if (!f.g()) {
                        return;
                    }
                    juk.i(juk.this);
                }
            }
        });
    }

    private void C() {
        com.taobao.android.weex_framework.ui.h hVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c5ab4a", new Object[]{this});
        } else if (Build.VERSION.SDK_INT < 23 || Process.is64Bit() || (hVar = this.f) == null) {
        } else {
            hVar.m();
        }
    }

    private void D() {
        com.taobao.android.weex_framework.ui.h hVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d3c2cb", new Object[]{this});
        } else if (Build.VERSION.SDK_INT < 23 || Process.is64Bit() || (hVar = this.f) == null) {
        } else {
            hVar.n();
        }
    }

    @Override // com.taobao.android.weex.h
    public void onInitSuccess(WeexInstance weexInstance, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f794a71b", new Object[]{this, weexInstance, new Boolean(z)});
        } else {
            z().c((WeexInstanceImpl) weexInstance);
        }
    }

    @Override // com.taobao.android.weex.h
    public void onInitFailed(WeexInstance weexInstance, boolean z, WeexErrorType weexErrorType, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bee002", new Object[]{this, weexInstance, new Boolean(z), weexErrorType, str});
        } else {
            a(WXExceptionConfig.EXCEPTION_FATAL, "", weexErrorType.ordinal(), str);
        }
    }

    @Override // com.taobao.android.weex.h
    public void onRenderSuccess(WeexInstance weexInstance, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a414e261", new Object[]{this, weexInstance, new Boolean(z)});
        } else {
            z().a(this.g);
        }
    }

    @Override // com.taobao.android.weex.h
    public void onRenderFailed(WeexInstance weexInstance, boolean z, WeexErrorType weexErrorType, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99cc9148", new Object[]{this, weexInstance, new Boolean(z), weexErrorType, str});
        } else {
            a(WXExceptionConfig.EXCEPTION_FATAL, WXExceptionConfig.KEY_RENDER, weexErrorType.ordinal(), str);
        }
    }

    @Override // com.taobao.android.weex.h
    public void onExecuteFailed(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55726f6d", new Object[]{this, weexInstance, weexErrorType, str});
        } else {
            a(WXExceptionConfig.EXCEPTION_FATAL, "", weexErrorType.ordinal(), str);
        }
    }

    @Override // com.taobao.android.weex.h
    public void onScriptException(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52b846bb", new Object[]{this, weexInstance, weexErrorType, str});
        } else {
            a(WXExceptionConfig.EXCEPTION_JS_RUNTIME_ERROR, WXExceptionConfig.KEY_JS_RUNTIME, weexErrorType.ordinal(), str);
        }
    }

    @Override // com.taobao.android.weex.h
    public void onEngineException(WeexInstance weexInstance, WeexErrorType weexErrorType, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a7821b2", new Object[]{this, weexInstance, weexErrorType, str});
        } else {
            a(WXExceptionConfig.EXCEPTION_JS_ENGINE_ERROR, WXExceptionConfig.KEY_JS_RUNTIME, weexErrorType.ordinal(), str);
        }
    }

    @Override // tb.juh
    public com.taobao.android.weex_framework.ui.h e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.weex_framework.ui.h) ipChange.ipc$dispatch("c706d550", new Object[]{this}) : this.f;
    }

    @Override // tb.juh
    public HashMap<String, String> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("31745610", new Object[]{this});
        }
        com.taobao.android.weex_framework.ui.h hVar = this.f;
        if (hVar == null) {
            return null;
        }
        return hVar.a(this.g.getInstanceId());
    }

    public Future<JSONObject> E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("f1e7cfe2", new Object[]{this});
        }
        final JSONObject jSONObject = new JSONObject();
        final FutureTask futureTask = new FutureTask(new Callable<JSONObject>() { // from class: tb.juk.13
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.alibaba.fastjson.JSONObject] */
            @Override // java.util.concurrent.Callable
            public /* synthetic */ JSONObject call() throws Exception {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ipChange2.ipc$dispatch("6d249ded", new Object[]{this}) : a();
            }

            public JSONObject a() throws Exception {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (JSONObject) ipChange2.ipc$dispatch("709f7788", new Object[]{this}) : jSONObject;
            }
        });
        this.g.getEngineInfoAsync(0, new WeexInstanceImpl.a() { // from class: tb.juk.14
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.weex.WeexInstanceImpl.a
            public void a(WeexValue weexValue) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b510c124", new Object[]{this, weexValue});
                    return;
                }
                if (weexValue.isObject()) {
                    jSONObject.putAll(weexValue.getObject());
                }
                r.a(juk.a(juk.this).getInstanceId(), "GetEngineInfoAsync", com.taobao.mtop.wvplugin.a.RESULT_KEY).a("info", jSONObject).a();
                futureTask.run();
            }
        });
        return futureTask;
    }

    @Override // tb.juh
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        com.taobao.android.weex_framework.ui.h hVar = this.f;
        if (hVar == null) {
            return;
        }
        hVar.t();
    }

    @Override // tb.juh
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        com.taobao.android.weex_framework.ui.h hVar = this.f;
        if (hVar == null) {
            return;
        }
        hVar.u();
    }

    @Override // tb.juh
    public HashMap<String, String> i() {
        HashMap<String, String> b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("100921d3", new Object[]{this});
        }
        com.taobao.android.weex_framework.ui.h hVar = this.f;
        if (hVar != null && (b = hVar.b(this.g.getInstanceId())) != null) {
            this.f29774a.putAll(b);
        }
        return this.f29774a;
    }

    @Override // com.taobao.android.weex.h
    public void onDestroyed(WeexInstance weexInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68c948df", new Object[]{this, weexInstance});
        } else {
            z().b((WeexInstanceImpl) weexInstance);
        }
    }

    @Override // tb.juh
    public void a(com.taobao.android.weex.n nVar) throws WeexExternalEventCheckException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9742b9c6", new Object[]{this, nVar});
            return;
        }
        com.taobao.android.weex_framework.ui.h hVar = this.f;
        if (hVar == null) {
            return;
        }
        hVar.a(nVar);
    }

    public void a(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0fea68", new Object[]{this, new Float(f), new Float(f2)});
            return;
        }
        com.taobao.android.weex_framework.ui.h hVar = this.f;
        if (hVar == null) {
            return;
        }
        hVar.a(f, f2);
    }

    @Override // tb.juh
    public void a(final tbq tbqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("207435", new Object[]{this, tbqVar});
        } else {
            a(new o() { // from class: tb.juk.15
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.weex_framework.util.o
                public void a() throws Exception {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else if (juk.e(juk.this) == null) {
                    } else {
                        juk.e(juk.this).a(tbqVar);
                    }
                }
            });
        }
    }

    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6782afb", new Object[]{this});
        } else if (this.f == null) {
        } else {
            r.a(this.g.getInstanceId(), UMLLCons.FEATURE_TYPE_PAGE, "onViewAppear").a();
            this.f.v();
        }
    }

    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686427c", new Object[]{this});
        } else if (this.f == null) {
        } else {
            r.a(this.g.getInstanceId(), UMLLCons.FEATURE_TYPE_PAGE, "onViewDisappear").a();
            this.f.w();
        }
    }

    public void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a2717e", new Object[]{this});
            return;
        }
        String bundleUrl = this.g.getBundleUrl();
        WeexValue weexValue = this.g.getInstanceInfo().get("js_version_info");
        z().a(bundleUrl, weexValue == null ? "" : weexValue.toStringValue(), "true");
    }

    public void v() {
        com.taobao.android.weex_framework.ui.h hVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69459fd", new Object[]{this});
            return;
        }
        if (this.r != null && (hVar = this.f) != null) {
            hVar.v();
            this.r = null;
        }
        this.s = true;
    }
}
