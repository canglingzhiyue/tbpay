package com.taobao.android.tbsku;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.q;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliConfigInterface;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.sku.c;
import com.taobao.android.sku.data.AliXSkuAsyncTask;
import com.taobao.android.sku.utils.d;
import com.taobao.android.sku.utils.g;
import com.taobao.android.sku.utils.o;
import com.taobao.android.sku.utils.r;
import com.taobao.android.tbsku.bizevent.f;
import com.taobao.android.tbsku.channel.DetailWvPlugin;
import com.taobao.android.tbsku.channel.SkuBizBroadcastReceiver;
import com.taobao.android.tbsku.channel.SkuBizWvPlugin;
import com.taobao.android.tbsku.network.cross.RelatedAuctionsParams;
import com.taobao.android.ultron.datamodel.imp.DMEvent;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.fgl;
import tb.ixt;
import tb.iyf;
import tb.jcv;
import tb.jdi;
import tb.jpx;
import tb.kge;

/* loaded from: classes6.dex */
public class TBXSkuCore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private com.taobao.android.sku.c f15385a;
    private Context b;
    private SkuBizBroadcastReceiver c;
    private jcv d;
    private boolean e;
    private Map<String, JSONObject> f;
    private Map<String, List<String>> g;
    private Map<String, List<String>> h;
    private Map<String, String> i;
    private String k;
    private String l;
    private String m;
    private String n;
    private volatile c o;
    private long q;
    private SkuSizeChartUpdateReceiver r;
    private com.taobao.android.tbsku.dialog.a s;

    /* loaded from: classes6.dex */
    public interface a {
        void a(c cVar);
    }

    /* loaded from: classes6.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public String f15400a;
        public String b;
        public Map<String, List<String>> c;
        public Map<String, List<String>> d;
        public String e;
        public String f;
        public Map<String, String> g;

        static {
            kge.a(665972711);
        }

        public b(String str, String str2, Map<String, List<String>> map, Map<String, List<String>> map2, String str3, String str4, Map<String, String> map3) {
            this.f15400a = str;
            this.b = str2;
            this.c = map;
            this.d = map2;
            this.e = str3;
            this.f = str4;
            this.g = map3;
        }
    }

    /* loaded from: classes6.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public d.a f15401a;
        public d.a b;

        static {
            kge.a(-651328380);
        }

        public c(d.a aVar, d.a aVar2) {
            this.f15401a = aVar;
            this.b = aVar2;
        }
    }

    static {
        kge.a(-70831547);
    }

    public static /* synthetic */ c a(TBXSkuCore tBXSkuCore, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("9a152276", new Object[]{tBXSkuCore, cVar});
        }
        tBXSkuCore.o = cVar;
        return cVar;
    }

    public static /* synthetic */ com.taobao.android.tbsku.dialog.a a(TBXSkuCore tBXSkuCore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.tbsku.dialog.a) ipChange.ipc$dispatch("540121b8", new Object[]{tBXSkuCore}) : tBXSkuCore.s;
    }

    public static /* synthetic */ void a(TBXSkuCore tBXSkuCore, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fc9c5fc", new Object[]{tBXSkuCore, jSONObject});
        } else {
            tBXSkuCore.e(jSONObject);
        }
    }

    public static /* synthetic */ void a(TBXSkuCore tBXSkuCore, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("665e683e", new Object[]{tBXSkuCore, str});
        } else {
            tBXSkuCore.k(str);
        }
    }

    public static /* synthetic */ boolean a(TBXSkuCore tBXSkuCore, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8cab6de4", new Object[]{tBXSkuCore, new Boolean(z)})).booleanValue();
        }
        tBXSkuCore.e = z;
        return z;
    }

    public static /* synthetic */ com.taobao.android.sku.c b(TBXSkuCore tBXSkuCore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.sku.c) ipChange.ipc$dispatch("94c47e94", new Object[]{tBXSkuCore}) : tBXSkuCore.f15385a;
    }

    public static /* synthetic */ void b(TBXSkuCore tBXSkuCore, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8377f0bd", new Object[]{tBXSkuCore, jSONObject});
        } else {
            tBXSkuCore.f(jSONObject);
        }
    }

    public static /* synthetic */ jcv c(TBXSkuCore tBXSkuCore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jcv) ipChange.ipc$dispatch("1fda7dd7", new Object[]{tBXSkuCore}) : tBXSkuCore.d;
    }

    public static /* synthetic */ Context d(TBXSkuCore tBXSkuCore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("e6208ec9", new Object[]{tBXSkuCore}) : tBXSkuCore.b;
    }

    public static /* synthetic */ c e(TBXSkuCore tBXSkuCore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("2d54ea5d", new Object[]{tBXSkuCore}) : tBXSkuCore.o;
    }

    public static /* synthetic */ Map f(TBXSkuCore tBXSkuCore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("ec044904", new Object[]{tBXSkuCore}) : tBXSkuCore.f;
    }

    public TBXSkuCore(Context context) {
        this(context, null);
        this.b = context;
    }

    public TBXSkuCore(Context context, String str) {
        this.f = new ConcurrentHashMap();
        this.g = new LinkedHashMap();
        this.h = new LinkedHashMap();
        this.i = new LinkedHashMap();
        this.k = "file:///android_asset/script/skuCore_uglify.js";
        this.l = "f6f887a75821f279ad1b03fb1243a3e1";
        this.m = "file:///android_asset/ultron/originalUltronData_uglify.json";
        this.n = "83b9ce346f98acab1f171b816b9a0b69";
        if (context == null) {
            throw new IllegalArgumentException("params context can not be null");
        }
        this.q = System.currentTimeMillis();
        iyf.a().b("beforeMtop", "container");
        this.b = context;
        this.f15385a = new com.taobao.android.sku.c(context, o.DEFAULT_BIZ_NAME, str);
        a(this.f15385a);
        q.a(SkuBizWvPlugin.NAME, (Class<? extends e>) SkuBizWvPlugin.class);
        f();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.taobao.sku.intent.action.transferData");
        intentFilter.addCategory("android.intent.category.DEFAULT");
        this.c = new SkuBizBroadcastReceiver(this, str);
        this.b.registerReceiver(this.c, intentFilter);
        k();
    }

    private void a(com.taobao.android.sku.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5708c099", new Object[]{this, cVar});
        } else {
            cVar.a(new c.d() { // from class: com.taobao.android.tbsku.TBXSkuCore.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.sku.c.d
                public void a(JSONObject jSONObject) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
                    } else if (jSONObject == null) {
                    } else {
                        String string = jSONObject.getString("action");
                        JSONObject jSONObject2 = new JSONObject();
                        try {
                            jSONObject2.putAll(jSONObject.getJSONObject("params"));
                        } catch (Throwable unused) {
                        }
                        if ("next_page_dark_curtain".equals(string)) {
                            TBXSkuCore.a(TBXSkuCore.this, jSONObject2);
                        } else if (!"dark_curtain_on_action_callback".equals(string) || TBXSkuCore.a(TBXSkuCore.this) == null) {
                        } else {
                            TBXSkuCore.a(TBXSkuCore.this).a(jSONObject2);
                        }
                    }
                }
            });
        }
    }

    private void e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87b16e04", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
        } else {
            JSONArray jSONArray = jSONObject.getJSONArray("imageInfoList");
            JSONObject jSONObject2 = jSONObject.getJSONObject("currentImage");
            JSONArray jSONArray2 = jSONObject.getJSONArray("clickImgRect");
            String string = jSONObject.getString("from");
            String string2 = jSONObject.getString("skuBaseNotDisplayed");
            String string3 = jSONObject.getString("bottomMode");
            String string4 = jSONObject.getString("skuLightoffDowngrade");
            if (Boolean.valueOf(g()).booleanValue() && !"true".equals(string4)) {
                this.s = new com.taobao.android.tbsku.dialog.a(this.b, string, jSONObject2, jSONArray, jSONArray2, string2, string3, this.f15385a.i().b());
                this.s.a();
                return;
            }
            new com.taobao.android.tbsku.dialog.b(this.b, jSONObject2, jSONArray, this.f15385a.i().b()).a();
        }
    }

    private boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        JSONObject h = this.f15385a.g().h();
        if (h == null || h.getJSONObject("feature") == null) {
            return false;
        }
        AliConfigInterface a2 = com.taobao.android.e.a();
        if (a2 != null && !Boolean.parseBoolean(a2.a("android_sku", "XLightOffEnable", "true"))) {
            i.a("[XLightOff]TBXSkuCore", "orange android_sku XLightOffEnable:false");
            return false;
        }
        return "true".equalsIgnoreCase(h.getJSONObject("feature").getString("skuLightOff"));
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        iyf.a().a("beforeMtop", (Map<String, String>) null);
        iyf.a().b("afterMtop", "container");
        iyf.a().b("initData", "afterMtop");
        this.f15385a.a(g.a(str));
        this.f15385a.A();
        h();
        b(this.f15385a);
        iyf.a().a("initData", (Map<String, String>) null);
        a(new a() { // from class: com.taobao.android.tbsku.TBXSkuCore.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.tbsku.TBXSkuCore.a
            public void a(c cVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7828755", new Object[]{this, cVar});
                } else {
                    TBXSkuCore.b(TBXSkuCore.this).a(cVar.f15401a.f15204a, cVar.f15401a.b, cVar.b.f15204a, cVar.b.b);
                }
            }
        });
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        iyf.a().a("beforeMtop", (Map<String, String>) null);
        iyf.a().b("afterMtop", "container");
        iyf.a().b("initData", "afterMtop");
        long currentTimeMillis = System.currentTimeMillis();
        JSONObject a2 = g.a(jSONObject);
        iyf.a().a("parseJsonInInitSku", "initData", currentTimeMillis, System.currentTimeMillis(), null);
        this.f15385a.a(a2);
        this.f15385a.A();
        h();
        b(this.f15385a);
        iyf.a().a("initData", (Map<String, String>) null);
        a(new a() { // from class: com.taobao.android.tbsku.TBXSkuCore.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.tbsku.TBXSkuCore.a
            public void a(c cVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7828755", new Object[]{this, cVar});
                } else {
                    TBXSkuCore.b(TBXSkuCore.this).a(cVar.f15401a.f15204a, cVar.f15401a.b, cVar.b.f15204a, cVar.b.b);
                }
            }
        });
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.f15385a.b(i);
        }
    }

    public void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23c7e1fd", new Object[]{this, str});
        } else {
            this.f15385a.f(str);
        }
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f15385a.n();
    }

    public com.taobao.android.sku.c b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.sku.c) ipChange.ipc$dispatch("abf12ffe", new Object[]{this}) : this.f15385a;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            b(UUID.randomUUID().toString());
        }
    }

    public void b(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        a(new a() { // from class: com.taobao.android.tbsku.TBXSkuCore.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.tbsku.TBXSkuCore.a
            public void a(c cVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7828755", new Object[]{this, cVar});
                } else {
                    TBXSkuCore.b(TBXSkuCore.this).a(str);
                }
            }
        });
        try {
            this.b.unregisterReceiver(this.c);
        } catch (Exception unused) {
        }
        l();
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.e;
    }

    public void a(ixt ixtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee928793", new Object[]{this, ixtVar});
        } else {
            this.f15385a.a(ixtVar);
        }
    }

    public void a(jcv jcvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef205b5b", new Object[]{this, jcvVar});
        } else {
            this.d = jcvVar;
        }
    }

    public void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
        } else {
            this.f15385a.d(jSONObject);
        }
    }

    public void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c50c34c6", new Object[]{this, jSONObject});
        } else {
            this.f15385a.e(jSONObject);
        }
    }

    public void c(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            a(new a() { // from class: com.taobao.android.tbsku.TBXSkuCore.10
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.tbsku.TBXSkuCore.a
                public void a(c cVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7828755", new Object[]{this, cVar});
                    } else {
                        TBXSkuCore.b(TBXSkuCore.this).d(str);
                    }
                }
            });
        }
    }

    public void d(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else {
            a(new a() { // from class: com.taobao.android.tbsku.TBXSkuCore.11
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.tbsku.TBXSkuCore.a
                public void a(c cVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7828755", new Object[]{this, cVar});
                    } else {
                        TBXSkuCore.b(TBXSkuCore.this).e(str);
                    }
                }
            });
        }
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
        } else {
            this.f15385a.b(str);
        }
    }

    public void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669e4a77", new Object[]{this, str});
        } else {
            this.f15385a.c(str);
        }
    }

    private void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else {
            this.f15385a.a(new c.InterfaceC0579c() { // from class: com.taobao.android.tbsku.TBXSkuCore.12
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.sku.c.InterfaceC0579c
                public void a(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                        return;
                    }
                    TBXSkuCore.a(TBXSkuCore.this, true);
                    try {
                        if (TBXSkuCore.c(TBXSkuCore.this) != null) {
                            TBXSkuCore.c(TBXSkuCore.this).a(str);
                        }
                    } catch (Throwable unused) {
                    }
                    TBXSkuCore.this.c();
                    if (!jpx.a(TBXSkuCore.d(TBXSkuCore.this))) {
                        return;
                    }
                    r.a(TBXSkuCore.d(TBXSkuCore.this), str, 1);
                }
            });
        }
    }

    private void b(com.taobao.android.sku.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bf188da", new Object[]{this, cVar});
            return;
        }
        cVar.i().a(com.taobao.android.tbsku.bizevent.c.EVENT_TYPE, new com.taobao.android.tbsku.bizevent.c());
        cVar.i().a(com.taobao.android.tbsku.bizevent.b.EVENT_TYPE, new com.taobao.android.tbsku.bizevent.b());
        cVar.i().a(com.taobao.android.tbsku.bizevent.a.EVENT_TYPE, new com.taobao.android.tbsku.bizevent.a());
        cVar.i().a(com.taobao.android.tbsku.bizevent.g.EVENT_TYPE, new com.taobao.android.tbsku.bizevent.g());
        cVar.i().a(f.EVENT_TYPE, new f());
        cVar.i().a(com.taobao.android.tbsku.bizevent.e.EVENT_TYPE, new com.taobao.android.tbsku.bizevent.e());
        cVar.i().a().b(com.taobao.android.tbsku.bizevent.d.EVENT_TYPE, new com.taobao.android.tbsku.bizevent.d());
    }

    private void a(final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7819e97", new Object[]{this, aVar});
        } else {
            new AliXSkuAsyncTask<b, Void, c>() { // from class: com.taobao.android.tbsku.TBXSkuCore.13
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass13 anonymousClass13, String str, Object... objArr) {
                    if (str.hashCode() == -1507519932) {
                        super.a((AnonymousClass13) objArr[0]);
                        return null;
                    }
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                }

                @Override // com.taobao.android.sku.data.AliXSkuAsyncTask
                public c a(b... bVarArr) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (c) ipChange2.ipc$dispatch("8336a63e", new Object[]{this, bVarArr});
                    }
                    if (TBXSkuCore.e(TBXSkuCore.this) != null) {
                        return TBXSkuCore.e(TBXSkuCore.this);
                    }
                    TBXSkuCore.a(TBXSkuCore.this, new c(d.a(TBXSkuCore.d(TBXSkuCore.this), bVarArr[0].f15400a, bVarArr[0].b, bVarArr[0].c, bVarArr[0].d), d.a(TBXSkuCore.d(TBXSkuCore.this), bVarArr[0].e, bVarArr[0].f, bVarArr[0].g)));
                    return TBXSkuCore.e(TBXSkuCore.this);
                }

                @Override // com.taobao.android.sku.data.AliXSkuAsyncTask
                public void a(c cVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7828755", new Object[]{this, cVar});
                        return;
                    }
                    super.a((AnonymousClass13) cVar);
                    a aVar2 = aVar;
                    if (aVar2 == null) {
                        return;
                    }
                    aVar2.a(cVar);
                }
            }.b(new b(this.m, this.n, this.g, this.h, this.k, this.l, this.i));
        }
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
        } else {
            a(new a() { // from class: com.taobao.android.tbsku.TBXSkuCore.14
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.tbsku.TBXSkuCore.a
                public void a(c cVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7828755", new Object[]{this, cVar});
                    } else {
                        TBXSkuCore.b(TBXSkuCore.this).w();
                    }
                }
            });
        }
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
        } else {
            a(new a() { // from class: com.taobao.android.tbsku.TBXSkuCore.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.tbsku.TBXSkuCore.a
                public void a(c cVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7828755", new Object[]{this, cVar});
                    } else {
                        TBXSkuCore.b(TBXSkuCore.this).x();
                    }
                }
            });
        }
    }

    public void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0cfe3b8", new Object[]{this, str});
        } else {
            a(UUID.randomUUID().toString(), false, str);
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else {
            this.f15385a.d();
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            h(UUID.randomUUID().toString());
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            a(UUID.randomUUID().toString(), z);
        }
    }

    public void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb017cf9", new Object[]{this, str});
        } else {
            a(str, true);
        }
    }

    public void a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{this, str, new Boolean(z)});
        } else {
            a(str, z, (String) null);
        }
    }

    private void a(final String str, final boolean z, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3b0622c", new Object[]{this, str, new Boolean(z), str2});
            return;
        }
        j();
        final long currentTimeMillis = System.currentTimeMillis();
        a(new a() { // from class: com.taobao.android.tbsku.TBXSkuCore.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.tbsku.TBXSkuCore.a
            public void a(c cVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7828755", new Object[]{this, cVar});
                    return;
                }
                iyf.a().a("threadSwitchInShowSku", "beforeWeexInitInShow", currentTimeMillis, System.currentTimeMillis(), null);
                TBXSkuCore tBXSkuCore = TBXSkuCore.this;
                TBXSkuCore.b(tBXSkuCore, TBXSkuCore.b(tBXSkuCore).m());
                TBXSkuCore.b(TBXSkuCore.this).a(str, z, str2);
            }
        });
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        try {
            long a2 = jdi.a(this.f15385a.g().g().getJSONObject("skuTimeStamp"));
            if (a2 <= 0) {
                return;
            }
            iyf.a().a("btnClick", "nav", a2, this.q == 0 ? a2 : this.q, null);
            this.q = 0L;
        } catch (Throwable unused) {
        }
    }

    public void m(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6df97b3e", new Object[]{this, str});
        } else {
            a(new a() { // from class: com.taobao.android.tbsku.TBXSkuCore.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.tbsku.TBXSkuCore.a
                public void a(c cVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7828755", new Object[]{this, cVar});
                    } else {
                        TBXSkuCore.b(TBXSkuCore.this).g(str);
                    }
                }
            });
        }
    }

    public void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4533163a", new Object[]{this, str});
        } else {
            a(UUID.randomUUID().toString(), str);
        }
    }

    public void a(final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            a(new a() { // from class: com.taobao.android.tbsku.TBXSkuCore.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.tbsku.TBXSkuCore.a
                public void a(c cVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7828755", new Object[]{this, cVar});
                    } else {
                        TBXSkuCore.b(TBXSkuCore.this).a(str, str2);
                    }
                }
            });
        }
    }

    public void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f64af7b", new Object[]{this, str});
        } else {
            a(UUID.randomUUID().toString(), str, false);
        }
    }

    public void b(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d257bc1", new Object[]{this, str, new Boolean(z)});
        } else {
            a(UUID.randomUUID().toString(), str, z);
        }
    }

    public void a(final String str, final String str2, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dbad4d8", new Object[]{this, str, str2, new Boolean(z)});
        } else {
            a(new a() { // from class: com.taobao.android.tbsku.TBXSkuCore.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.tbsku.TBXSkuCore.a
                public void a(c cVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7828755", new Object[]{this, cVar});
                        return;
                    }
                    JSONObject a2 = g.a(str2);
                    TBXSkuCore.b(TBXSkuCore.this).a(str, a2, z);
                    TBXSkuCore.b(TBXSkuCore.this, a2);
                }
            });
        }
    }

    public void d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("265ed165", new Object[]{this, jSONObject});
        } else {
            a(UUID.randomUUID().toString(), jSONObject, false);
        }
    }

    public void a(JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a79284c", new Object[]{this, jSONObject, new Boolean(z)});
        } else {
            a(UUID.randomUUID().toString(), jSONObject, z);
        }
    }

    public void a(final String str, final JSONObject jSONObject, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60829596", new Object[]{this, str, jSONObject, new Boolean(z)});
            return;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        a(new a() { // from class: com.taobao.android.tbsku.TBXSkuCore.15
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.tbsku.TBXSkuCore.a
            public void a(c cVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7828755", new Object[]{this, cVar});
                    return;
                }
                iyf.a().a("threadSwitchInUpdateSku", "beforeWeexInitInUpdate", currentTimeMillis, System.currentTimeMillis(), null);
                TBXSkuCore.b(TBXSkuCore.this).a(str, jSONObject, z);
            }
        });
    }

    private void k(String str) {
        JSONObject jSONObject;
        JSONObject g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d99648bc", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str) || (jSONObject = this.f.get(str)) == null || jSONObject.isEmpty()) {
        } else {
            com.taobao.android.sku.data.a g2 = this.f15385a.g();
            final JSONObject jSONObject2 = (g2 == null || (g = g2.g()) == null) ? null : g.getJSONObject("id_biz_relatedAuctions");
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            jSONObject2.put("relatedAuction", (Object) jSONObject);
            this.f15385a.e(new JSONObject() { // from class: com.taobao.android.tbsku.TBXSkuCore.16
                {
                    put("id_biz_relatedAuctions", (Object) jSONObject2);
                }
            });
            com.alibaba.android.ultron.event.base.e a2 = this.f15385a.k().d().a();
            a2.a("adjustState");
            a2.a(new DMEvent("adjustState", new JSONObject() { // from class: com.taobao.android.tbsku.TBXSkuCore.17
                {
                    put("subType", "relatedAuctionUpdated");
                    put("payload", (Object) new JSONObject() { // from class: com.taobao.android.tbsku.TBXSkuCore.17.1
                    });
                }
            }, null));
            this.f15385a.k().d().a(a2);
        }
    }

    private void f(JSONObject jSONObject) {
        JSONObject g;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9040aa3", new Object[]{this, jSONObject});
            return;
        }
        final String a2 = a();
        if (TextUtils.isEmpty(a2)) {
            return;
        }
        com.taobao.android.sku.data.a g2 = this.f15385a.g();
        if (g2 != null && (g = g2.g()) != null && (jSONObject2 = g.getJSONObject("id_biz_relatedAuctions")) != null && jSONObject2.getBooleanValue("gone")) {
            return;
        }
        try {
            if (jSONObject.getJSONObject("resource").getJSONObject("relatedAuctions").getBooleanValue("useLocalPrice")) {
                return;
            }
        } catch (Throwable unused) {
        }
        JSONObject jSONObject3 = this.f.get(a2);
        if (jSONObject3 != null && !jSONObject3.isEmpty()) {
            return;
        }
        JSONArray jSONArray = null;
        try {
            jSONArray = jSONObject.getJSONObject("resource").getJSONObject("relatedAuctions").getJSONArray("items");
        } catch (Throwable unused2) {
        }
        if (jSONArray == null || jSONArray.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Object> it = jSONArray.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof JSONObject) {
                String string = ((JSONObject) next).getString("itemId");
                if (!TextUtils.isEmpty(string)) {
                    arrayList.add(string);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        com.taobao.android.sku.network.c cVar = new com.taobao.android.sku.network.c(this.b, new RelatedAuctionsParams(arrayList));
        cVar.a(new IRemoteBaseListener() { // from class: com.taobao.android.tbsku.TBXSkuCore.18
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                JSONObject parseObject;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                } else if (mtopResponse == null) {
                } else {
                    String str = new String(mtopResponse.getBytedata());
                    if (TextUtils.isEmpty(str) || (parseObject = JSONObject.parseObject(str)) == null || parseObject.getJSONObject("data") == null) {
                        return;
                    }
                    TBXSkuCore.f(TBXSkuCore.this).put(a2, parseObject.getJSONObject("data"));
                    TBXSkuCore.a(TBXSkuCore.this, a2);
                }
            }
        });
        cVar.a();
    }

    public static void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[0]);
        } else {
            q.a(DetailWvPlugin.NAME, (Class<? extends e>) DetailWvPlugin.class);
        }
    }

    /* loaded from: classes6.dex */
    public class SkuSizeChartUpdateReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-2120605801);
        }

        private SkuSizeChartUpdateReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            String a2 = TBXSkuCore.this.a();
            if (TextUtils.isEmpty(a2) || !TBXSkuCore.b(TBXSkuCore.this).p().equals(intent.getStringExtra("skuToken")) || !a2.equals(intent.getStringExtra(fgl.ORIGINALITEMID))) {
                return;
            }
            intent.getStringExtra(fgl.TARGETITEMID);
            intent.getStringExtra("needCallback");
            TBXSkuCore.b(TBXSkuCore.this).b(new JSONObject() { // from class: com.taobao.android.tbsku.TBXSkuCore.SkuSizeChartUpdateReceiver.1
                {
                    put("action", "size_chart_update_detail");
                    put("params", (Object) new JSONObject() { // from class: com.taobao.android.tbsku.TBXSkuCore.SkuSizeChartUpdateReceiver.1.1
                        {
                            put("changed", "true");
                        }
                    });
                }
            });
        }
    }

    private void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.taobao.sku.intent.action.sizeChartUpdate");
        intentFilter.addCategory("android.intent.category.DEFAULT");
        this.r = new SkuSizeChartUpdateReceiver();
        this.b.registerReceiver(this.r, intentFilter);
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        try {
            if (this.r == null) {
                return;
            }
            this.b.unregisterReceiver(this.r);
        } catch (Throwable unused) {
        }
    }
}
