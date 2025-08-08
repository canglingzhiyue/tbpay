package com.taobao.android.sku;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.widget.RecyclerView;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.alibaba.android.icart.core.QueryParamsManager;
import com.alibaba.android.ultron.engine.a;
import com.alibaba.android.ultron.vfw.dataloader.d;
import com.alibaba.android.ultron.vfw.dataloader.j;
import com.alibaba.android.ultron.vfw.instance.UltronError;
import com.alibaba.android.ultron.vfw.instance.UltronInstanceConfig;
import com.alibaba.android.ultron.vfw.instance.d;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliConfigInterface;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.ak;
import com.taobao.android.dinamicx.bd;
import com.taobao.android.dinamicx.bn;
import com.taobao.android.sku.utils.n;
import com.taobao.android.sku.utils.o;
import com.taobao.android.ultron.datamodel.imp.DMEvent;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import mtopsdk.mtop.global.SDKUtils;
import tb.bob;
import tb.fut;
import tb.ixt;
import tb.ixu;
import tb.ixx;
import tb.ixy;
import tb.ixz;
import tb.iya;
import tb.iyg;
import tb.iyh;
import tb.jpx;
import tb.kge;

/* loaded from: classes6.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LOG_TAG = "AliXSkuCore";
    public static final String MARK_SHARED_PREFERENCES_KEY = "type";
    public static final String MARK_SHARED_PREFERENCES_NAME = "sku_mark_type";
    public static final String ULTRON_CONFIG_MODULE_NAME = "sku";

    /* renamed from: a */
    public static ThreadPoolExecutor f15144a;
    private e A;
    private f B;
    private String d;
    private Context e;
    private com.taobao.android.sku.f f;
    private com.alibaba.android.ultron.vfw.instance.d g;
    private com.taobao.android.sku.data.a h;
    private com.taobao.android.sku.presenter.c i;
    private iya j;
    private iyh k;
    private a m;
    private String n;
    private iyg o;
    private String p;
    private ixt q;
    private String r;
    private String s;
    private g t;
    private InterfaceC0579c v;
    private long w;
    private d x;
    private com.alibaba.android.ultron.event.base.c y;
    private ixu z;
    private int b = 1002;
    private Map<String, Integer> c = new ConcurrentHashMap();
    private Handler l = new Handler(Looper.getMainLooper());
    private String u = QueryParamsManager.DEFAULT_CART_FROM;

    /* loaded from: classes6.dex */
    public interface b {
        void a();
    }

    /* renamed from: com.taobao.android.sku.c$c */
    /* loaded from: classes6.dex */
    public interface InterfaceC0579c {
        void a(String str);
    }

    /* loaded from: classes6.dex */
    public interface d {
        void a(JSONObject jSONObject);
    }

    /* loaded from: classes6.dex */
    public interface e {
        void a();
    }

    /* loaded from: classes6.dex */
    public interface f {
        void a(int i, int i2);
    }

    /* loaded from: classes6.dex */
    public interface g {
        void a(int i, String str);
    }

    public static /* synthetic */ String a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c7f95927", new Object[]{cVar}) : cVar.u;
    }

    public static /* synthetic */ void a(c cVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73b9b177", new Object[]{cVar, jSONObject});
        } else {
            cVar.f(jSONObject);
        }
    }

    public static /* synthetic */ void b(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bf188da", new Object[]{cVar});
        } else {
            cVar.H();
        }
    }

    public static /* synthetic */ com.taobao.android.sku.data.a c(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.sku.data.a) ipChange.ipc$dispatch("8d23262b", new Object[]{cVar}) : cVar.h;
    }

    public static /* synthetic */ String d(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("75593ec4", new Object[]{cVar}) : cVar.d;
    }

    public static /* synthetic */ InterfaceC0579c e(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (InterfaceC0579c) ipChange.ipc$dispatch("5b3a902b", new Object[]{cVar}) : cVar.v;
    }

    public static /* synthetic */ com.taobao.android.sku.presenter.c f(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.sku.presenter.c) ipChange.ipc$dispatch("ed11eb30", new Object[]{cVar}) : cVar.i;
    }

    public static /* synthetic */ iyg g(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (iyg) ipChange.ipc$dispatch("2aca130", new Object[]{cVar}) : cVar.o;
    }

    public static /* synthetic */ void h(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9663a60", new Object[]{cVar});
        } else {
            cVar.L();
        }
    }

    public static /* synthetic */ a i(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("8eeeec69", new Object[]{cVar}) : cVar.m;
    }

    public static /* synthetic */ Handler j(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("5042e4a4", new Object[]{cVar}) : cVar.l;
    }

    static {
        kge.a(-857890499);
        f15144a = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.taobao.android.sku.c.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a */
            private final AtomicInteger f15145a = new AtomicInteger(1);

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
                }
                Thread thread = new Thread(runnable, "AliXSkuCore Thread - " + this.f15145a.getAndIncrement());
                if (thread.isDaemon()) {
                    thread.setDaemon(false);
                }
                if (thread.getPriority() != 5) {
                    thread.setPriority(5);
                }
                return thread;
            }
        });
    }

    public c(Context context, String str, String str2) {
        if (context == null) {
            throw new IllegalArgumentException("params context can not be null");
        }
        this.w = System.currentTimeMillis();
        f15144a.allowCoreThreadTimeOut(true);
        this.d = StringUtils.isEmpty(str) ? "sku" : str;
        this.e = context;
        this.p = str2;
        UltronInstanceConfig ultronInstanceConfig = new UltronInstanceConfig();
        ultronInstanceConfig.c(jpx.a(this.e));
        ultronInstanceConfig.a(this.d);
        ultronInstanceConfig.b(a(context));
        ultronInstanceConfig.a(UltronInstanceConfig.ExposureStrategy.EXPOSURE_ONCE);
        ultronInstanceConfig.a(true);
        ultronInstanceConfig.b(D());
        this.g = com.alibaba.android.ultron.vfw.instance.d.a(ultronInstanceConfig, context);
        this.h = new com.taobao.android.sku.data.a(this, context, this.g);
        this.i = new com.taobao.android.sku.presenter.c(context, this);
        this.j = new iya(context, this, this.g.d());
        this.f = new com.taobao.android.sku.f(this, this.e, this.g, this.h, this.i);
        this.o = new iyg(this.h, this.i);
        this.k = new iyh();
        F();
        G();
        I();
        J();
        C();
        E();
    }

    public Rect a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("ef387fb1", new Object[]{this});
        }
        ixu ixuVar = this.z;
        if (ixuVar != null) {
            return ixuVar.a();
        }
        return null;
    }

    public void a(ixu ixuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee92fbf2", new Object[]{this, ixuVar});
        } else {
            this.z = ixuVar;
        }
    }

    private void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c5ab4a", new Object[]{this});
        } else {
            this.h.d(new JSONObject() { // from class: com.taobao.android.sku.AliXSkuCore$2
                {
                    put("addCartFrom", (Object) c.a(c.this));
                }
            });
        }
    }

    private boolean D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d3c2cf", new Object[]{this})).booleanValue();
        }
        AliConfigInterface a2 = com.taobao.android.e.a();
        if (a2 != null) {
            return Boolean.parseBoolean(a2.a("android_detail", "sku_multi_js_engine", "true"));
        }
        return false;
    }

    private void E() {
        bd a2;
        DinamicXEngine d2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e1da4c", new Object[]{this});
            return;
        }
        bob l = this.g.l();
        if (l == null || (a2 = l.a()) == null || (d2 = a2.d()) == null) {
            return;
        }
        d2.a(new ak() { // from class: com.taobao.android.sku.c.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                c.this = this;
            }

            @Override // com.taobao.android.dinamicx.ak
            public long a() {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("56c6c5c", new Object[]{this})).longValue() : SDKUtils.getCorrectionTimeMillis();
            }
        });
    }

    public void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669e4a77", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            this.u = str;
            e(new JSONObject() { // from class: com.taobao.android.sku.AliXSkuCore$4
                {
                    put("addCartFrom", (Object) c.a(c.this));
                }
            });
        }
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.u;
    }

    public void a(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d8a2226", new Object[]{this, new Long(j), str});
        } else {
            this.f.a(j, str);
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        y();
        this.g.b(this.y);
        this.g.m();
        this.f.b();
        this.k.b();
        com.taobao.android.sku.pad.b.INSTANCE.a();
    }

    public void a(InterfaceC0579c interfaceC0579c) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6b0df3a", new Object[]{this, interfaceC0579c});
        } else {
            this.v = interfaceC0579c;
        }
    }

    private void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eff1cd", new Object[]{this});
            return;
        }
        this.y = new com.alibaba.android.ultron.event.base.c() { // from class: com.taobao.android.sku.c.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.ultron.event.base.c
            public void a(com.alibaba.android.ultron.event.base.e eVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("93d93503", new Object[]{this, eVar});
                } else {
                    if (eVar == null) {
                    }
                }
            }

            @Override // com.alibaba.android.ultron.event.base.c
            public void b(com.alibaba.android.ultron.event.base.e eVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("4d50c2a2", new Object[]{this, eVar});
                }
            }

            {
                c.this = this;
            }
        };
        this.g.a(this.y);
    }

    public String c() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this});
        }
        JSONObject o = this.h.o();
        if (o == null || (jSONObject = o.getJSONObject("global_data")) == null) {
            return "0";
        }
        String string = jSONObject.getString("skuId");
        return StringUtils.isEmpty(string) ? "0" : string;
    }

    private void f(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9040aa3", new Object[]{this, jSONObject});
        } else if (jSONObject == null || jSONObject.isEmpty() || !Boolean.parseBoolean(jSONObject.getString("shouldScrollToBankPeriod"))) {
        } else {
            this.l.postDelayed(new Runnable() { // from class: com.taobao.android.sku.c.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    c.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        RecyclerView l = c.this.h().a().l();
                        l.smoothScrollToPosition(l.getAdapter().getItemCount() - 1);
                    } catch (Throwable unused) {
                    }
                }
            }, 15L);
        }
    }

    private void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fe094e", new Object[]{this});
        } else {
            this.g.a(new d.b() { // from class: com.taobao.android.sku.c.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alibaba.android.ultron.vfw.instance.d.InterfaceC0100d
                public void a(com.alibaba.android.ultron.vfw.dataloader.d dVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e5ead625", new Object[]{this, dVar});
                    }
                }

                {
                    c.this = this;
                }

                @Override // com.alibaba.android.ultron.vfw.instance.d.b
                public void a(String str, com.alibaba.android.ultron.vfw.dataloader.d dVar) {
                    JSONObject a2;
                    JSONObject jSONObject;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("bd05169b", new Object[]{this, str, dVar});
                        return;
                    }
                    c.b(c.this);
                    if (dVar == null) {
                        return;
                    }
                    d.a d2 = dVar.d();
                    if (d2 != null) {
                        c.c(c.this).e(d2.c);
                        c.c(c.this).f(d2.b);
                    }
                    Object b2 = dVar.b(com.alibaba.android.ultron.vfw.dataloader.a.KEY_DATA_PARSER_RESULT);
                    if (!(b2 instanceof j) || (a2 = ((j) b2).a()) == null || (jSONObject = a2.getJSONObject("sku_script")) == null) {
                        return;
                    }
                    c.c(c.this).g(jSONObject);
                    c.a(c.this, jSONObject.getJSONObject("id_biz_installment"));
                }

                @Override // com.alibaba.android.ultron.vfw.instance.d.b
                public void a(String str, a.d dVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d7417ae1", new Object[]{this, str, dVar});
                    } else if (dVar == null || dVar.f2547a == null) {
                    } else {
                        dVar.f2547a.getJSONObject("sku_script");
                    }
                }

                @Override // com.alibaba.android.ultron.vfw.instance.d.InterfaceC0100d
                public void a(UltronError ultronError) {
                    String str;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("1f64095d", new Object[]{this, ultronError});
                        return;
                    }
                    c.b(c.this);
                    if (ultronError != null) {
                        str = "domain: " + ultronError.domain + " code: " + ultronError.code + " msg: " + ultronError.getMessage();
                    } else {
                        str = "unknown UltronError is null";
                    }
                    o.a(c.d(c.this), o.UM_DOWNGRADE_E, str);
                    if (c.e(c.this) == null) {
                        return;
                    }
                    c.e(c.this).a(str);
                }
            });
        }
    }

    private void H() {
        com.alibaba.android.ultron.engine.a p;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40c20cf", new Object[]{this});
        } else if (!jpx.a(this.e) || (p = this.g.p()) == null) {
        } else {
            if (p.b()) {
                this.i.a(new HashMap<String, String>() { // from class: com.taobao.android.sku.AliXSkuCore$8
                    {
                        c.this = this;
                        put("engineType", "JSI");
                    }
                });
            } else if (!p.c()) {
            } else {
                this.i.a(new HashMap<String, String>() { // from class: com.taobao.android.sku.AliXSkuCore$9
                    {
                        c.this = this;
                        put("engineType", "Web");
                    }
                });
            }
        }
    }

    private void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41a3850", new Object[]{this});
            return;
        }
        a(com.taobao.android.sku.dinamicx.widget.d.DX_WIDGET_ID, new com.taobao.android.sku.dinamicx.widget.d());
        a(com.taobao.android.sku.dinamicx.widget.a.DX_WIDGET_ID, new com.taobao.android.sku.dinamicx.widget.a());
        a(com.taobao.android.sku.dinamicx.widget.b.DX_WIDGET_ID, new com.taobao.android.sku.dinamicx.widget.b());
        a(com.taobao.android.sku.dinamicx.widget.c.DX_WIDGET_ID, new com.taobao.android.sku.dinamicx.widget.c());
        a(ixz.DX_PARSER_ID, new ixz());
        a(ixy.DX_PARSER_ID, new ixy(this.c));
        a(ixx.DX_WIDGET_ID, new ixx(this.c));
    }

    public static void a(bd bdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("156633a2", new Object[]{bdVar});
        } else if (bdVar == null) {
        } else {
            bdVar.a(com.taobao.android.sku.dinamicx.widget.d.DX_WIDGET_ID, new com.taobao.android.sku.dinamicx.widget.d());
            bdVar.a(com.taobao.android.sku.dinamicx.widget.a.DX_WIDGET_ID, new com.taobao.android.sku.dinamicx.widget.a());
            bdVar.a(com.taobao.android.sku.dinamicx.widget.b.DX_WIDGET_ID, new com.taobao.android.sku.dinamicx.widget.b());
            bdVar.a(com.taobao.android.sku.dinamicx.widget.c.DX_WIDGET_ID, new com.taobao.android.sku.dinamicx.widget.c());
            bdVar.a(ixz.DX_PARSER_ID, new ixz());
            bdVar.a(ixy.DX_PARSER_ID, new ixy(null));
            bdVar.a(ixx.DX_WIDGET_ID, new ixx(null));
        }
    }

    private void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4284fd1", new Object[]{this});
        } else if (StringUtils.isEmpty(this.p)) {
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("uniqueId", (Object) this.p);
            e(jSONObject);
        }
    }

    private int a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e1d6453", new Object[]{this, context})).intValue();
        }
        this.b = context.getApplicationContext().getSharedPreferences(MARK_SHARED_PREFERENCES_NAME, 0).getInt("type", this.b);
        return this.b;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        this.b = i;
        this.g.c(this.b);
    }

    public void b(int i) {
        DinamicXEngine d2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        bob l = this.g.l();
        if (l == null || (d2 = l.a().d()) == null) {
            return;
        }
        d2.b().a(i);
    }

    public int f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue() : this.b;
    }

    public com.taobao.android.sku.data.a g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.sku.data.a) ipChange.ipc$dispatch("866cbb3e", new Object[]{this}) : this.h;
    }

    public com.taobao.android.sku.presenter.c h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.sku.presenter.c) ipChange.ipc$dispatch("d478e27f", new Object[]{this}) : this.i;
    }

    public iya i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (iya) ipChange.ipc$dispatch("4c935d05", new Object[]{this}) : this.j;
    }

    public void a(iyh iyhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee9b2aa0", new Object[]{this, iyhVar});
        } else if (iyhVar == null || iyhVar == this.k) {
        } else {
            this.k = iyhVar;
        }
    }

    public iyh j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (iyh) ipChange.ipc$dispatch("5445033d", new Object[]{this}) : this.k;
    }

    public com.alibaba.android.ultron.vfw.instance.d k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.android.ultron.vfw.instance.d) ipChange.ipc$dispatch("38fafc17", new Object[]{this}) : this.g;
    }

    public Map<String, Integer> l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("7666dbe8", new Object[]{this}) : this.c;
    }

    public JSONObject m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("5c7d6194", new Object[]{this}) : this.h.h();
    }

    public String n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("84c15f4b", new Object[]{this}) : this.h.b();
    }

    public Context o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("b7f2926e", new Object[]{this}) : this.e;
    }

    public String p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("91ccd489", new Object[]{this}) : this.p;
    }

    public ixt q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ixt) ipChange.ipc$dispatch("8a208689", new Object[]{this}) : this.q;
    }

    public void a(ixt ixtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee928793", new Object[]{this, ixtVar});
        } else {
            this.q = ixtVar;
        }
    }

    public String r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9ed849c7", new Object[]{this}) : this.r;
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.r = str;
        }
    }

    public String s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("255e0466", new Object[]{this}) : this.s;
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            this.s = str;
        }
    }

    public String t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("abe3bf05", new Object[]{this}) : this.h.m();
    }

    public String u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("326979a4", new Object[]{this}) : this.d;
    }

    public String v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b8ef3443", new Object[]{this}) : this.f.h();
    }

    public void a(com.taobao.android.sku.presenter.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de4862ff", new Object[]{this, dVar});
        } else {
            this.i.a(dVar);
        }
    }

    public void a(long j, com.taobao.android.dinamicx.widget.ak akVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a2b983", new Object[]{this, new Long(j), akVar});
        } else {
            this.g.a(j, akVar);
        }
    }

    public void a(long j, fut futVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("926eae27", new Object[]{this, new Long(j), futVar});
        } else {
            this.g.a(j, futVar);
        }
    }

    public void a(long j, bn bnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa971a4c", new Object[]{this, new Long(j), bnVar});
        } else {
            this.g.a(j, bnVar);
        }
    }

    public void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a2717e", new Object[]{this});
        } else {
            this.i.e();
        }
    }

    public void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b088ff", new Object[]{this});
        } else {
            this.i.f();
        }
    }

    public void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bea080", new Object[]{this});
        } else {
            this.i.c();
        }
    }

    public void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ccb801", new Object[]{this});
        } else {
            this.i.b();
        }
    }

    public void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a97c48", new Object[]{this});
            return;
        }
        com.taobao.android.sku.presenter.d a2 = this.i.a();
        if (a2 == null) {
            return;
        }
        this.g.a(a2.j(), a2.l(), a2.k());
        this.f.a(this.i);
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        this.h.a(jSONObject);
        this.f.a(this.h);
    }

    public void a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2b490", new Object[]{this, str, str2, str3, str4});
            return;
        }
        this.h.a(str, str2, str3, str4);
        this.f.b(this.h);
    }

    public void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0cfe3b8", new Object[]{this, str});
        } else {
            this.f.a("", str);
        }
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            x();
        }
    }

    public void a(String str, JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60829596", new Object[]{this, str, jSONObject, new Boolean(z)});
            return;
        }
        x();
        if (jSONObject == null || jSONObject.isEmpty()) {
            return;
        }
        this.c = new ConcurrentHashMap();
        this.h.b(jSONObject);
        this.f.a(str, this.h, z);
    }

    public void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
        } else {
            this.f.a(jSONObject);
        }
    }

    public void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c50c34c6", new Object[]{this, jSONObject});
            return;
        }
        d dVar = this.x;
        if (dVar == null) {
            return;
        }
        dVar.a(jSONObject);
    }

    public void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6b15399", new Object[]{this, dVar});
        } else {
            this.x = dVar;
        }
    }

    public void d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("265ed165", new Object[]{this, jSONObject});
            return;
        }
        this.h.c(jSONObject);
        this.f.c(this.h);
    }

    public void e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87b16e04", new Object[]{this, jSONObject});
            return;
        }
        this.h.d(jSONObject);
        this.f.c(this.h);
    }

    public void d(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
            return;
        }
        b(new JSONObject() { // from class: com.taobao.android.sku.AliXSkuCore$10
            {
                put("action", "pvs_selected");
                put("params", (Object) new JSONObject() { // from class: com.taobao.android.sku.AliXSkuCore$10.1
                    {
                        put("pvs", (Object) str);
                    }
                });
            }
        });
        com.alibaba.android.ultron.event.base.e a2 = this.g.d().a();
        a2.a("adjustState");
        a2.a(new DMEvent("adjustState", new JSONObject() { // from class: com.taobao.android.sku.AliXSkuCore$11
            {
                put("subType", "check_prop_value");
                put("payload", (Object) new JSONObject() { // from class: com.taobao.android.sku.AliXSkuCore$11.1
                    {
                        put("checkedPVs", (Object) str);
                    }
                });
            }
        }, null));
        this.g.d().a(a2);
    }

    public void e(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
            return;
        }
        b(new JSONObject() { // from class: com.taobao.android.sku.AliXSkuCore$12
            {
                put("action", "sku_id_selected");
                put("params", (Object) new JSONObject() { // from class: com.taobao.android.sku.AliXSkuCore$12.1
                    {
                        put("skuId", (Object) str);
                    }
                });
            }
        });
        com.alibaba.android.ultron.event.base.e a2 = this.g.d().a();
        a2.a("adjustState");
        a2.a(new DMEvent("adjustState", new JSONObject() { // from class: com.taobao.android.sku.AliXSkuCore$13
            {
                put("subType", "check_prop_value");
                put("payload", (Object) new JSONObject() { // from class: com.taobao.android.sku.AliXSkuCore$13.1
                    {
                        put("checkedSkuId", (Object) str);
                    }
                });
            }
        }, null));
        this.g.d().a(a2);
    }

    private void L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4447ed3", new Object[]{this});
            return;
        }
        Log.e("SKU trace", "show dialog time " + System.currentTimeMillis());
        if (this.w <= 0) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.w;
        String str = this.d;
        o.a(str, o.UM_PERFORMANCE_M, "开启耗时：" + ((currentTimeMillis / 50) * 50));
        this.w = 0L;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else {
            this.f.g();
        }
    }

    public void a(String str, final boolean z, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3b0622c", new Object[]{this, str, new Boolean(z), str2});
            return;
        }
        this.n = str2;
        a(str, null, null, null, z, new b() { // from class: com.taobao.android.sku.c.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                c.this = this;
            }

            @Override // com.taobao.android.sku.c.b
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                if (z) {
                    c.f(c.this).b();
                }
                if (c.this.M()) {
                    c.f(c.this).b();
                } else {
                    if (!StringUtils.isEmpty(str2) && !c.g(c.this).a(str2)) {
                        c.f(c.this).b();
                    }
                    c.this.x();
                }
                c.h(c.this);
            }
        });
    }

    public boolean M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4529658", new Object[]{this})).booleanValue();
        }
        if (StringUtils.isEmpty(this.n) || !n.a("enable_weex_silent_action") || !this.h.v()) {
            return false;
        }
        String v = v();
        boolean s = this.h.s();
        boolean t = this.h.t();
        if ("BUYNOW".equals(v) && !s && !t && this.h.w()) {
            return true;
        }
        return "ADDCART".equals(v) && !s && this.h.x();
    }

    private void a(String str, JSONObject jSONObject, String str2, d.c cVar, boolean z, final b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15800ab9", new Object[]{this, str, jSONObject, str2, cVar, new Boolean(z), bVar});
            return;
        }
        if (z) {
            if (this.m == null) {
                this.m = new a();
            }
            this.l.postDelayed(this.m, 500L);
        }
        b bVar2 = new b() { // from class: com.taobao.android.sku.c.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                c.this = this;
            }

            @Override // com.taobao.android.sku.c.b
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                c.j(c.this).removeCallbacks(c.i(c.this));
                b bVar3 = bVar;
                if (bVar3 == null) {
                    return;
                }
                bVar3.a();
            }
        };
        if (!StringUtils.isEmpty(this.h.i())) {
            this.f.a(str, str2, cVar, bVar2);
        } else {
            a(jSONObject, str2, cVar, bVar2);
        }
        K();
    }

    public void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4366752", new Object[]{this});
        } else if (this.h.h() == null) {
            o.a("exposureSku return because mDataEngine originData null");
        } else {
            com.taobao.android.sku.f fVar = this.f;
            o.b(this.h.b(), this.h.c(), s(), t(), fVar.a(fVar.a(this.h, false)));
            this.f.i();
            try {
                com.taobao.android.behavir.a a2 = com.taobao.android.behavir.b.a();
                String n = n();
                Context context = this.e;
                a2.commitEnter(o.PAGE_NAME, n, context, "itemId=" + this.h.b(), "sellerId=" + this.h.c());
            } catch (Throwable th) {
                o.a(" AbstractBehaviRProtocol.commitEnter exception " + th);
            }
        }
    }

    public void a(JSONObject jSONObject, String str, d.c cVar, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ae94bf7", new Object[]{this, jSONObject, str, cVar, bVar});
            return;
        }
        this.h.h(jSONObject);
        this.g.a(this.h.h(), str, cVar);
        if (bVar == null) {
            return;
        }
        bVar.a();
    }

    public void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b793c9", new Object[]{this});
            return;
        }
        this.f.a();
        e eVar = this.A;
        if (eVar == null) {
            return;
        }
        eVar.a();
    }

    public void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6b1c7f8", new Object[]{this, eVar});
        } else {
            this.A = eVar;
        }
    }

    public void a(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6b23c57", new Object[]{this, fVar});
        } else {
            this.B = fVar;
        }
    }

    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        f fVar = this.B;
        if (fVar == null) {
            return;
        }
        fVar.a(i, i2);
    }

    public void a(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6b2b0b6", new Object[]{this, gVar});
        } else {
            this.t = gVar;
        }
    }

    public void a(int i, String str) {
        g gVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
        } else if (!n.a("enable_sku_mtop_monitor") || (gVar = this.t) == null) {
        } else {
            gVar.a(i, str);
        }
    }

    /* loaded from: classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(2137500142);
            kge.a(-1390502639);
        }

        private a() {
            c.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                c.this.z();
            }
        }
    }
}
