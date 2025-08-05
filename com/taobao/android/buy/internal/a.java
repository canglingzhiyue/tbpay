package com.taobao.android.buy.internal;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import com.ali.user.mobile.ability.excutor.BaseExecutor;
import com.alibaba.android.aura.AURAAliBuyCorePluginCenter;
import com.alibaba.android.aura.IAURAPluginCenter;
import com.alibaba.android.aura.datamodel.nextrpc.AURANextRPCEndpoint;
import com.alibaba.android.aura.datamodel.nextrpc.AURANextRPCIO;
import com.alibaba.android.aura.datamodel.nextrpc.b;
import com.alibaba.android.aura.datamodel.parse.AURAParseIO;
import com.alibaba.android.aura.datamodel.render.AURARenderOutput;
import com.alibaba.android.aura.k;
import com.alibaba.android.aura.nodemodel.AURAPluginContainerNodeModel;
import com.alibaba.android.aura.q;
import com.alibaba.android.aura.service.event.d;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.buy.internal.status.f;
import com.taobao.android.buy.toggle.AliBuyPerfSwitcher;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.ami;
import tb.aqq;
import tb.arc;
import tb.ard;
import tb.avj;
import tb.avk;
import tb.awi;
import tb.azo;
import tb.baw;
import tb.dst;
import tb.dsv;
import tb.dsw;
import tb.dsx;
import tb.dtl;
import tb.dtp;
import tb.dtx;
import tb.dtz;
import tb.dui;
import tb.duk;
import tb.fke;
import tb.ifz;
import tb.kge;

/* loaded from: classes4.dex */
public final class a implements dst {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_AURA_BUY_CONFIG = "aura_buy_config.json";
    public static final String DEFAULT_AURA_BUY_MAIN_FLOW = "aura.workflow.build";
    public static final String KEY_MODULE_NAME = "purchase";
    public static final String PRELOAD_MAIN_PAGE_FLOW = "aura.workflow.preload";

    /* renamed from: a */
    private HashMap<String, Object> f9230a;
    private Activity b;
    private k c;
    private f d;
    private b e;
    private String f;
    private String g;
    private AURAPluginContainerNodeModel h;
    private dsx i;
    private avk j;
    private String p;
    private AtomicBoolean k = new AtomicBoolean(false);
    private AtomicBoolean l = new AtomicBoolean(false);
    private JSONObject o = new JSONObject();
    private com.taobao.android.buy.toggle.a m = new com.taobao.android.buy.toggle.a();
    private boolean n = AliBuyPerfSwitcher.enableThreadPerf();

    static {
        kge.a(1923346698);
        kge.a(1292352548);
    }

    public static /* synthetic */ AtomicBoolean a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("11598dae", new Object[]{aVar}) : aVar.k;
    }

    public static /* synthetic */ AtomicBoolean b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("400af7cd", new Object[]{aVar}) : aVar.l;
    }

    public a() {
        ifz.a(0.001f);
    }

    @Override // tb.dst
    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80d6d64d", new Object[]{this, bVar});
            return;
        }
        this.b = bVar.b();
        this.e = bVar;
        this.p = dui.c(fke.b(this.b));
        a(this.b);
        b(this.e);
    }

    private void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
            return;
        }
        this.f = DEFAULT_AURA_BUY_CONFIG;
        this.j = new avk();
        this.e.a();
    }

    private f f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("76992d39", new Object[]{this});
        }
        if (this.d == null) {
            this.d = new f(this.b);
        }
        return this.d;
    }

    private void b(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7f4c72c", new Object[]{this, bVar});
            return;
        }
        a(bVar.f());
        a(bVar.e());
        c(bVar);
    }

    private void a(dsx dsxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5c5a86f", new Object[]{this, dsxVar});
            return;
        }
        this.i = dsxVar;
        b(dsxVar);
    }

    private void a(dsv dsvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5c4bfb1", new Object[]{this, dsvVar});
            return;
        }
        f().a(dsvVar.d());
        f().a(dsvVar.c());
        f().a(dsvVar.a());
        f().b(dsvVar.b());
    }

    private void c(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f12b80b", new Object[]{this, bVar});
            return;
        }
        HashMap<String, Object> d = this.i.d();
        if (d == null) {
            d = new HashMap<>();
        }
        this.f9230a = d;
        this.f9230a.put(a.class.getSimpleName(), this);
        a((Map<String, Object>) this.f9230a);
        this.f9230a.put("page_info", dui.a(fke.b(this.b)));
        this.f9230a.put(dtp.PAGE_NAME, bVar.c());
        this.f9230a.put("autoSize", Boolean.valueOf(ami.b(this.b)));
        this.f9230a.put("purchaseFrom", this.p);
        this.f9230a.put("itemCount", this.e.a(this.b).g().e());
        this.f9230a.put("bucket", AliBuyPerfSwitcher.getRealBucket());
        dsw a2 = bVar.a(this.b);
        this.f9230a.put(dtx.USERDATA_KEY_REQUEST_ADJUST, a2.b());
        this.f9230a.put("submit_rpc_params", a2.c());
        this.f9230a.put("aliBuyWorkFlowConfig", bVar.f());
        this.f9230a.put(dtl.USERDATA_KEY_STATUS_MANAGER, f());
        this.f9230a.put("submit_callback", bVar.g());
        this.f9230a.put("aliBuyDXConfig", bVar.d());
        this.f9230a.put(avk.USERDATA_KEY_ACTIVITY_RESULT, this.j);
        this.f9230a.put(awi.USER_CONTEXT_KEY_DECRYPT, bVar.h());
        this.f9230a.put("aliBuyPreload", this.l);
        this.f9230a.put("enableFilterEmptyNode", Boolean.valueOf(AliBuyPerfSwitcher.enablePopupWindowStreamResponse()));
        this.f9230a.put("enableExtendModules", Boolean.valueOf(baw.a()));
        this.f9230a.put("enableAsyncThread", Boolean.valueOf(this.n));
        this.f9230a.put("enableLogAsyncThread", Boolean.valueOf(AliBuyPerfSwitcher.enableLogPerf()));
        this.f9230a.put("enableParsePerf", Boolean.valueOf(AliBuyPerfSwitcher.enableParsePerf()));
        this.f9230a.put("enableParsePerfV2", Boolean.valueOf(AliBuyPerfSwitcher.enableParsePerfV2()));
        this.f9230a.put("enableStreamJson", Boolean.valueOf(AliBuyPerfSwitcher.enableStreamJson()));
        this.f9230a.put("enableAsyncUT", Boolean.valueOf(AliBuyPerfSwitcher.enableAsyncUT()));
        this.f9230a.put("enableIdleRender", Boolean.valueOf(AliBuyPerfSwitcher.enableIdleRender()));
        this.f9230a.put("enableCombineRender", Boolean.valueOf(AliBuyPerfSwitcher.enableCombineRender()));
    }

    private void a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        Intent b = fke.b(this.b);
        if (b == null) {
            ifz.a(ifz.a.b("buyFragment").a("intent is empty").c("EMPTY_INTENT_FORM_(containerPerformanceMonitor)").a(1.0f));
            return;
        }
        long longExtra = b.getLongExtra("START_CLICK_TIME", 0L);
        long longExtra2 = b.getLongExtra("COUPON_FINISH", 0L);
        long longExtra3 = b.getLongExtra("NAV_TO_URL_START_TIME", 0L);
        long longExtra4 = b.getLongExtra("NAV_START_ACTIVITY_TIME", 0L);
        long longExtra5 = b.getLongExtra("NEW_BUY_ON_CREATE_TIME", 0L);
        this.o.put(dtz.STAGE_KEY_CLICK_START, (Object) Long.valueOf(longExtra));
        this.o.put(dtz.STAGE_KEY_COUPON_FINISH, (Object) Long.valueOf(longExtra2));
        this.o.put(dtz.STAGE_KEY_URL_START, (Object) Long.valueOf(longExtra3));
        this.o.put(dtz.STAGE_KEY_NAV_START, (Object) Long.valueOf(longExtra4));
        this.o.put(dtz.STAGE_KEY_BUY_ON_CREATE, (Object) Long.valueOf(longExtra5));
        map.put(dtz.USER_CONTEXT_KEY, this.o);
    }

    private synchronized k c() {
        IAURAPluginCenter[] c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k) ipChange.ipc$dispatch("4c9f2b1b", new Object[]{this});
        }
        if (this.c == null) {
            this.c = c.a(this.b, this.p, this.f9230a);
            if (this.c == null) {
                this.c = k.a(new q(this.b, this.f9230a)).a(new AURAAliBuyCorePluginCenter());
                if (this.h != null && !baw.a()) {
                    this.c.a(this.h);
                    arc.a().a("PurchaseManager", "getAURAInstance", "使用了业务加载好的配置");
                    if (this.i != null && (c = this.i.c()) != null) {
                        this.c.a(c);
                    }
                    a(this.c);
                }
                this.c.a(this.f);
                arc.a().a("PurchaseManager", "getAURAInstance", "外部没有传入加载好的配置，使用文件路径加载配置");
                if (this.i != null) {
                    this.c.a(c);
                }
                a(this.c);
            }
            this.g = this.c.c().d();
        }
        return this.c;
    }

    private void a(k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c6b28d7", new Object[]{this, kVar});
            return;
        }
        Iterator<IAURAPluginCenter> it = c.a().iterator();
        while (it.hasNext()) {
            kVar.a(it.next());
        }
    }

    @Override // tb.dst
    public synchronized void a(final dst.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82fede56", new Object[]{this, aVar});
            return;
        }
        if (this.c == null) {
            this.c = c();
        }
        AURANextRPCIO e = e();
        arc.a().b("executeFlow");
        this.o.put(dtz.STAGE_KEY_AURA_START, (Object) Long.valueOf(System.currentTimeMillis()));
        this.c.a(DEFAULT_AURA_BUY_MAIN_FLOW, e, new aqq() { // from class: com.taobao.android.buy.internal.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                a.this = this;
            }

            @Override // tb.aqq
            public void a(com.alibaba.android.aura.datamodel.c cVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6b8a7af", new Object[]{this, cVar});
                    return;
                }
                Serializable b = cVar.b();
                if (b instanceof AURARenderOutput) {
                    View view = ((AURARenderOutput) b).getView();
                    a.a(a.this).set(true);
                    aVar.a(view);
                    return;
                }
                arc.a().c("PurchaseManager", BaseExecutor.EXECUTOR_SUFFIX, "失败，输出结果不是渲染view");
            }

            @Override // tb.aqq, tb.aqs
            public void a(com.alibaba.android.aura.b bVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2c671180", new Object[]{this, bVar});
                    return;
                }
                ard a2 = arc.a();
                a2.c("PurchaseManager", BaseExecutor.EXECUTOR_SUFFIX, "errog=" + bVar);
            }
        });
    }

    private AURANextRPCIO e() {
        AURANextRPCEndpoint a2;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (AURANextRPCIO) ipChange.ipc$dispatch("bcff023c", new Object[]{this});
        }
        com.alibaba.android.aura.datamodel.nextrpc.b a3 = AliBuyPerfSwitcher.enablePrefetch() ? new b.a().a() : null;
        boolean z2 = a(this.f9230a.get("enableStreamResponse")) || a(this.f9230a.get("enablePopupWindowStreamResponse"));
        if ("purchase".equalsIgnoreCase(this.g)) {
            dsw a4 = this.e.a(this.b);
            if (this.n || z2) {
                z = true;
            }
            a2 = a4.a(a3, z, z2);
        } else {
            a2 = this.e.a(this.b).a();
        }
        return new AURANextRPCIO(duk.KEY_SERVICE_NAME, a2);
    }

    private boolean a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6251248", new Object[]{this, obj})).booleanValue();
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return false;
    }

    @Override // tb.dst
    public void b(final dst.a<Void, AURAParseIO> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcda4897", new Object[]{this, aVar});
            return;
        }
        if (this.c == null) {
            this.c = c();
        }
        this.c.a("aura.workflow.request", e(), new aqq() { // from class: com.taobao.android.buy.internal.a.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                a.this = this;
            }

            @Override // tb.aqq
            public void a(com.alibaba.android.aura.datamodel.c cVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6b8a7af", new Object[]{this, cVar});
                    return;
                }
                Serializable b = cVar.b();
                if (b instanceof AURAParseIO) {
                    aVar.a((AURAParseIO) b);
                } else {
                    arc.a().c("PurchaseManager", BaseExecutor.EXECUTOR_SUFFIX, "失败，输出结果不是数据协议");
                }
            }

            @Override // tb.aqq, tb.aqs
            public void a(com.alibaba.android.aura.b bVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2c671180", new Object[]{this, bVar});
                    return;
                }
                ard a2 = arc.a();
                a2.c("PurchaseManager", BaseExecutor.EXECUTOR_SUFFIX, "errog=" + bVar);
            }
        });
    }

    @Override // tb.dst
    public void a(AURAParseIO aURAParseIO, final dst.a<Void, View> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9518fc6", new Object[]{this, aURAParseIO, aVar});
            return;
        }
        if (this.c == null) {
            this.c = c();
        }
        this.c.a("aura.workflow.localData.render", aURAParseIO, new aqq() { // from class: com.taobao.android.buy.internal.AliBuyPresenterImpl$3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.aqq
            public void a(com.alibaba.android.aura.datamodel.c cVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6b8a7af", new Object[]{this, cVar});
                    return;
                }
                Serializable b = cVar.b();
                if (b instanceof AURARenderOutput) {
                    View view = ((AURARenderOutput) b).getView();
                    a.a(a.this).set(true);
                    aVar.a(view);
                    return;
                }
                arc.a().c("PurchaseManager", BaseExecutor.EXECUTOR_SUFFIX, "失败，输出结果不是渲染view");
            }

            @Override // tb.aqq, tb.aqs
            public void a(com.alibaba.android.aura.b bVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2c671180", new Object[]{this, bVar});
                    return;
                }
                ard a2 = arc.a();
                a2.c("PurchaseManager", BaseExecutor.EXECUTOR_SUFFIX, "errog=" + bVar);
            }
        });
    }

    @Override // tb.dst
    public void a(JSONObject jSONObject, final dst.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6be90576", new Object[]{this, jSONObject, aVar});
            return;
        }
        if (this.c == null) {
            this.c = c();
        }
        this.c.a(PRELOAD_MAIN_PAGE_FLOW, new AURAParseIO(Arrays.asList(new com.alibaba.android.aura.datamodel.parse.a(jSONObject))), new aqq() { // from class: com.taobao.android.buy.internal.a.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                a.this = this;
            }

            @Override // tb.aqq
            public void a(com.alibaba.android.aura.datamodel.c cVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6b8a7af", new Object[]{this, cVar});
                    return;
                }
                Serializable b = cVar.b();
                if (b instanceof AURARenderOutput) {
                    View view = ((AURARenderOutput) b).getView();
                    if (a.a(a.this).get()) {
                        return;
                    }
                    a.b(a.this).set(true);
                    aVar.a(view);
                    return;
                }
                arc.a().c("PurchaseManager", BaseExecutor.EXECUTOR_SUFFIX, "失败，输出结果不是渲染view");
            }

            @Override // tb.aqq, tb.aqs
            public void a(com.alibaba.android.aura.b bVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("2c671180", new Object[]{this, bVar});
                    return;
                }
                ard a2 = arc.a();
                a2.c("PurchaseManager", BaseExecutor.EXECUTOR_SUFFIX, "errog=" + bVar);
            }
        });
    }

    @Override // tb.dst
    public void a(final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (this.c == null) {
        } else {
            avj.a(this.c, new AURAParseIO(new ArrayList<com.alibaba.android.aura.datamodel.parse.a>() { // from class: com.taobao.android.buy.internal.AliBuyPresenterImpl$5
                {
                    add(new com.alibaba.android.aura.datamodel.parse.a(jSONObject));
                }
            }));
        }
    }

    public void a(AURAParseIO aURAParseIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8eb929d8", new Object[]{this, aURAParseIO});
            return;
        }
        k kVar = this.c;
        if (kVar == null) {
            return;
        }
        avj.a(kVar, aURAParseIO);
    }

    @Override // tb.dst
    public void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
        } else if (this.c == null) {
        } else {
            d dVar = new d();
            dVar.a(jSONObject);
            com.alibaba.android.aura.service.event.c.a(this.c, str, dVar);
        }
    }

    @Override // tb.dst
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        k kVar = this.c;
        if (kVar == null) {
            return;
        }
        com.alibaba.android.aura.service.event.c.a(kVar, azo.EVENT_TYPE, new d());
    }

    @Override // tb.dst
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        k kVar = this.c;
        if (kVar != null) {
            kVar.a();
        }
        AliBuyPerfSwitcher.dumpLog();
    }

    private void b(dsx dsxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d448aef0", new Object[]{this, dsxVar});
            return;
        }
        AURAPluginContainerNodeModel b = dsxVar.b();
        if (b != null) {
            this.h = b;
            return;
        }
        String a2 = dsxVar.a();
        if (TextUtils.isEmpty(a2)) {
            return;
        }
        this.f = a2;
    }

    @Override // tb.dst
    public void a(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79f30285", new Object[]{this, new Integer(i), new Integer(i2), intent});
        } else {
            this.j.a(i, i2, intent);
        }
    }
}
