package com.taobao.mytaobao.ultron;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v4.util.ArrayMap;
import android.text.TextUtils;
import android.widget.LinearLayout;
import com.alibaba.ability.localization.b;
import com.alibaba.ability.localization.constants.Language;
import com.alibaba.android.ultron.vfw.instance.UltronInstanceConfig;
import com.alibaba.android.ultron.vfw.instance.d;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.taobao.android.autosize.OnScreenChangedListener;
import com.taobao.android.behavir.BehaviR;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.bd;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.revisionswitch.TBRevisionSwitchManager;
import com.taobao.android.task.Coordinator;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import com.taobao.aranger.annotation.method.UIThread;
import com.taobao.login4android.api.Login;
import com.taobao.mytaobao.homepage.plugin.TBMyTaobaoWVPlugin;
import com.taobao.mytaobao.ultron.event.m;
import com.taobao.mytaobao.ultron.event.n;
import com.taobao.mytaobao.ultron.event.p;
import com.taobao.mytaobao.ultron.event.q;
import com.taobao.mytaobao.ultron.event.r;
import com.taobao.mytaobao.ultron.event.s;
import com.taobao.mytaobao.ultron.event.t;
import com.taobao.mytaobao.ultron.event.u;
import com.taobao.mytaobao.ultron.event.v;
import com.taobao.mytaobao.ultron.event.w;
import com.taobao.mytaobao.ultron.model.SecScreenBean;
import com.taobao.mytaobao.view.MTPtrRecyclerView;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import mtopsdk.mtop.domain.MtopResponse;
import tb.bkz;
import tb.bla;
import tb.blb;
import tb.bny;
import tb.boc;
import tb.boz;
import tb.ilw;
import tb.jnw;
import tb.jny;
import tb.joc;
import tb.kge;
import tb.mtp;
import tb.mtr;
import tb.mtx;
import tb.mtz;
import tb.mua;
import tb.mug;
import tb.mui;
import tb.mvn;
import tb.mvx;
import tb.mwe;
import tb.mwf;
import tb.mwo;
import tb.mwq;
import tb.mwr;
import tb.mxa;
import tb.mxe;
import tb.mxf;
import tb.mxj;
import tb.mxm;
import tb.mxo;
import tb.mxz;
import tb.nde;
import tb.nwv;
import tb.qnp;
import tb.qpl;
import tb.thg;
import tb.thh;
import tb.tjq;
import tb.xks;
import tb.xkt;

/* loaded from: classes7.dex */
public class e implements mwo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "MTBPresenter";
    private MtbBizProxy A;

    /* renamed from: a  reason: collision with root package name */
    public com.taobao.mytaobao.basement.i f18498a;
    private com.alibaba.android.ultron.vfw.instance.d c;
    private com.taobao.mytaobao.message.a d;
    private a e;
    public com.taobao.mytaobao.ultron.a f;
    private b.a g;
    private BroadcastReceiver h;
    private com.taobao.mytaobao.ultron.dinamicX.eventHandler.vipModuleSliderLayoutEventHandler.a m;
    private SecScreenBean n;
    private com.taobao.mytaobao.ultron.model.b o;
    private com.taobao.mytaobao.basement.a p;
    private bkz r;
    private blb s;
    private mwq u;
    private boolean v;
    private OnScreenChangedListener x;
    private d y;
    public final Handler i = new Handler(mtz.b);
    private int j = 0;
    private final r b = new r(false);
    public boolean z = false;
    private final AtomicInteger C = new AtomicInteger(0);
    private boolean q = false;

    /* loaded from: classes7.dex */
    public interface a {
        void a();

        void a(int i, int i2, int i3, JSONObject jSONObject);
    }

    static {
        kge.a(913616806);
        kge.a(413133415);
    }

    private JSONObject e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("26170924", new Object[]{this, jSONObject}) : jSONObject;
    }

    public static /* synthetic */ com.alibaba.android.ultron.vfw.instance.d a(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.android.ultron.vfw.instance.d) ipChange.ipc$dispatch("fd9484f0", new Object[]{eVar}) : eVar.c;
    }

    public static /* synthetic */ JSONObject a(e eVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("bd8dfe5", new Object[]{eVar, jSONObject}) : eVar.e(jSONObject);
    }

    public static /* synthetic */ JSONObject a(e eVar, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("ceb35deb", new Object[]{eVar, jSONObject, jSONObject2}) : eVar.a(jSONObject, jSONObject2);
    }

    public static /* synthetic */ void a(e eVar, DMComponent dMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c8b5f1d", new Object[]{eVar, dMComponent});
        } else {
            eVar.a(dMComponent);
        }
    }

    public static /* synthetic */ void a(e eVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20178c95", new Object[]{eVar, str});
        } else {
            eVar.f(str);
        }
    }

    public static /* synthetic */ void a(e eVar, String str, int i, MtopResponse mtopResponse, jny jnyVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be21abc2", new Object[]{eVar, str, new Integer(i), mtopResponse, jnyVar, jSONObject});
        } else {
            eVar.a(str, i, mtopResponse, jnyVar, jSONObject);
        }
    }

    public static /* synthetic */ void a(e eVar, MtopResponse mtopResponse, jny jnyVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30e16435", new Object[]{eVar, mtopResponse, jnyVar, str});
        } else {
            eVar.a(mtopResponse, jnyVar, str);
        }
    }

    public static /* synthetic */ MtbBizProxy b(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MtbBizProxy) ipChange.ipc$dispatch("9020e5fc", new Object[]{eVar}) : eVar.A;
    }

    public static /* synthetic */ void b(e eVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95248524", new Object[]{eVar, jSONObject});
        } else {
            eVar.c(jSONObject);
        }
    }

    public static /* synthetic */ void c(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f068f0d", new Object[]{eVar});
        } else {
            eVar.y();
        }
    }

    public static /* synthetic */ void c(e eVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31928183", new Object[]{eVar, jSONObject});
        } else {
            eVar.f(jSONObject);
        }
    }

    public static /* synthetic */ com.taobao.mytaobao.basement.a d(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.mytaobao.basement.a) ipChange.ipc$dispatch("dfa03514", new Object[]{eVar}) : eVar.p;
    }

    public static /* synthetic */ void d(e eVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce007de2", new Object[]{eVar, jSONObject});
        } else {
            eVar.d(jSONObject);
        }
    }

    public static /* synthetic */ void e(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cb80e8f", new Object[]{eVar});
        } else {
            eVar.x();
        }
    }

    public static /* synthetic */ int f(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c390ce43", new Object[]{eVar})).intValue();
        }
        int i = eVar.j;
        eVar.j = i - 1;
        return i;
    }

    public static /* synthetic */ a g(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("faacf4eb", new Object[]{eVar}) : eVar.e;
    }

    public static /* synthetic */ int h(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("91424dc5", new Object[]{eVar})).intValue() : eVar.j;
    }

    public void a(final MtbBizProxy mtbBizProxy, boolean z, com.alibaba.android.ultron.vfw.instance.d dVar, mvx mvxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad5ceb5c", new Object[]{this, mtbBizProxy, new Boolean(z), dVar, mvxVar});
            return;
        }
        nwv.b("beforeInitData 1.0");
        this.v = z;
        this.A = mtbBizProxy;
        if (dVar == null) {
            this.c = a(mtbBizProxy);
            k.a(this.c, mvxVar);
        } else {
            this.c = dVar;
        }
        nwv.b("beforeInitData 1.011111");
        r();
        nwv.b("beforeInitData 1.022222");
        a(mvxVar);
        nwv.b("beforeInitData 1.0333333");
        this.c.a("userTrack", new com.taobao.mytaobao.ultron.event.i());
        this.c.a("openUrl", new w());
        this.c.a("asyncRefresh", new v());
        this.r = new bkz(this.c);
        nwv.b("beforeInitData 1.0444444");
        this.f = new com.taobao.mytaobao.ultron.a(this);
        this.s = this.r.a("pageback", new bla());
        nwv.b("beforeInitData 1.05555");
        this.p = mtbBizProxy.b();
        this.f18498a = mtbBizProxy.o();
        this.m = new com.taobao.mytaobao.ultron.dinamicX.eventHandler.vipModuleSliderLayoutEventHandler.a();
        nwv.b("beforeInitData 1.066666");
        if (com.alibaba.ability.localization.b.c()) {
            this.d = new com.taobao.mytaobao.message.a(dVar, this.A.m(), "headerModule");
            this.d.a();
            a();
        }
        this.u = new mwq(this);
        nwv.b("beforeInitData 1.5");
        this.c.a("default", this.u);
        final Activity m = mtbBizProxy.m();
        if (com.taobao.android.autosize.l.d((Context) m) || com.taobao.android.autosize.l.b((Context) m)) {
            this.x = new OnScreenChangedListener() { // from class: com.taobao.mytaobao.ultron.e.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.autosize.OnScreenChangedListener
                public void onActivityChanged(Activity activity, int i, Configuration configuration) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("994f466c", new Object[]{this, activity, new Integer(i), configuration});
                    }
                }

                @Override // com.taobao.android.autosize.OnScreenChangedListener
                public void onScreenChanged(int i, Configuration configuration) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("cfdcd1d", new Object[]{this, new Integer(i), configuration});
                        return;
                    }
                    Rect a2 = com.taobao.android.autosize.i.a(m);
                    int a3 = DXWidgetNode.DXMeasureSpec.a(a2.width(), 1073741824);
                    int a4 = DXWidgetNode.DXMeasureSpec.a(a2.height(), 1073741824);
                    e.a(e.this).q().f(a3);
                    e.a(e.this).q().g(a4);
                    e.a(e.this).q().b(127);
                    TLog.loge("mtbMainLink", "onScreenChanged windowRect.width()=" + a2.width() + " windowRect.height()=" + a2.height());
                    mtbBizProxy.g();
                    mtbBizProxy.a(a2.width());
                }
            };
            com.taobao.android.autosize.h.a().c(this.x);
        }
        nwv.b("beforeInitData 1.55");
        com.taobao.mytaobao.basement.i iVar = this.f18498a;
        this.y = new d(iVar == null ? null : iVar.w);
        nwv.b("beforeInitData 1.6");
    }

    private com.alibaba.android.ultron.vfw.instance.d a(final com.taobao.mytaobao.base.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.android.ultron.vfw.instance.d) ipChange.ipc$dispatch("8ba95e14", new Object[]{this, dVar});
        }
        UltronInstanceConfig c = new UltronInstanceConfig().a("mytaobao").c(false);
        if (mxj.b("mtbDiffRefresh", false)) {
            TLog.loge("mtbMainLink", "开启奥创diff刷新");
            c.l(true);
        }
        c.a(new boc.a().a(10086).a("mytaobao").a(new DXEngineConfig.a("mytaobao").a(true, true)).a(new boc.b() { // from class: com.taobao.mytaobao.ultron.e.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.boc.b
            public void a(Context context, bd bdVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("fd794b9a", new Object[]{this, context, bdVar});
                } else {
                    bdVar.d().a(dVar.m());
                }
            }
        }).a());
        return com.alibaba.android.ultron.vfw.instance.d.a(c, dVar.m());
    }

    public void a(Fragment fragment, LinearLayout linearLayout, MTPtrRecyclerView mTPtrRecyclerView, LinearLayout linearLayout2) {
        boz gVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f275ff1e", new Object[]{this, fragment, linearLayout, mTPtrRecyclerView, linearLayout2});
        } else if (this.c == null) {
        } else {
            if (!com.taobao.mytaobao.base.c.r()) {
                this.q = true;
                gVar = new l(mTPtrRecyclerView, fragment);
            } else {
                this.q = false;
                gVar = new g();
            }
            this.c.a(gVar);
            nwv.b("sdsdsdsdsd");
            this.c.a(linearLayout, mTPtrRecyclerView, linearLayout2);
            nwv.b("cccccc");
            this.c.d(1);
            this.c.n();
        }
    }

    private void a(mvx mvxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f54b8c89", new Object[]{this, mvxVar});
            return;
        }
        this.c.a(mwf.DX_EVENT_MTB_ONTAP, new mwf(this));
        this.c.a(com.taobao.mytaobao.ultron.dinamicX.eventHandler.vipModuleSliderLayoutEventHandler.a.DX_EVENT_MTBVIPSLIDERLAYOUTHANDLER, this.m);
        this.c.a(com.taobao.mytaobao.ultron.event.d.DX_EVENT_MTB_SCROLL_EXPOSE, new com.taobao.mytaobao.ultron.event.d());
        this.c.a(s.DX_EVENT_MTB_TOOLSSCROLLEXPOSE, new s());
        this.c.a(com.taobao.mytaobao.ultron.event.c.DX_EVENT_MTBORDERSLIDEREVENTHANDLE, new com.taobao.mytaobao.ultron.event.c(false));
        this.c.a(mwe.DX_EVENT_ONMTBEQUITYSLIDERFINISH, new mwe(mvxVar));
        r.a();
        this.c.a(r.DX_EVENT_MTBSLIDEREXPOSEUT, this.b);
        this.c.a(thh.DX_EVENT_SWITCHACCOUNT, new thh());
        this.c.a(thg.DX_EVENT_OPENURL, new thg());
        this.c.a(tjq.DX_EVENT_OPENRECSKU, new tjq());
        this.c.a(18619468269105L, new u());
        this.c.a(-9059485389533098272L, new t());
        this.c.a(com.taobao.oversea.mytaobao.a.DX_EVENT_RECYCLERVIEWLOADMORE, new com.taobao.oversea.mytaobao.a());
        this.c.a(9715203841581550L, new xkt());
        this.c.a(-3356328757096570660L, new xks());
    }

    private void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
            return;
        }
        this.c.d().a("BehaviX", new com.taobao.mytaobao.ultron.event.b());
        this.c.d().a(com.taobao.mytaobao.ultron.event.l.EVENT_TYPE, new com.taobao.mytaobao.ultron.event.l());
        com.taobao.mytaobao.ultron.model.c cVar = new com.taobao.mytaobao.ultron.model.c();
        this.c.d().a(q.EVENT_TYPE, new q(cVar));
        this.c.d().a(p.EVENT_TYPE, new p(cVar));
        this.c.d().a(n.EVENT_TYPE, new n());
        try {
            this.c.q().e().a().d().a(m.AKMTBEventChainForUltonEventAbilityAbilityHashType, new m(this));
        } catch (Throwable unused) {
        }
    }

    public void a(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84162689", new Object[]{this, str, str2, map});
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        IDMComponent a2 = a(str);
        if (a2 == null) {
            return;
        }
        map.put(com.taobao.android.gateway.util.b.KEY_TARGET_COMPONENT, a(str));
        com.alibaba.android.ultron.event.base.e a3 = this.c.d().a().a(str2);
        a3.a(a2);
        a3.e(str2);
        a3.a((Object) map);
        this.c.d().a(a3);
    }

    public IDMComponent a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IDMComponent) ipChange.ipc$dispatch("b15a5336", new Object[]{this, str}) : this.c.b().b(str);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.q || !com.taobao.mytaobao.basement.a.d()) {
        } else {
            mxf.a(mxf.beforeOverSeaApi);
            b(s());
            mxf.b(mxf.beforeOverSeaApi);
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        } else {
            mxe.INSTANCE.a(new mtr<JSONObject>() { // from class: com.taobao.mytaobao.ultron.e.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.mtr
                public /* synthetic */ void onResult(boolean z, String str, JSONObject jSONObject) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("cc0b3077", new Object[]{this, new Boolean(z), str, jSONObject});
                    } else {
                        a(z, str, jSONObject);
                    }
                }

                public void a(boolean z, String str, JSONObject jSONObject) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("86df5f7a", new Object[]{this, new Boolean(z), str, jSONObject});
                    } else if (z) {
                        JSONObject a2 = e.a(e.this, jSONObject);
                        nwv.a(a2);
                        JSONObject l = b.a().l();
                        b.a().a(a2, b.CACHE_KEY_ULTRON_MTB);
                        final JSONObject a3 = e.a(e.this, jSONObject, l);
                        final JSONObject jSONObject2 = a3.getJSONObject("data");
                        JSONObject jSONObject3 = jSONObject2.getJSONObject("global");
                        com.taobao.mytaobao.base.c.a(jSONObject2);
                        if (e.b(e.this) != null) {
                            e.b(e.this).e.a(jSONObject2);
                        }
                        Runnable runnable = new Runnable() { // from class: com.taobao.mytaobao.ultron.e.3.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                e.a(e.this, com.taobao.mytaobao.base.c.b());
                                e.c(e.this);
                                if (e.b(e.this) == null) {
                                    return;
                                }
                                e.b(e.this).a(a3, true);
                                e.d(e.this).a(e.this, jSONObject2, "action_cache_invalid");
                            }
                        };
                        boolean a4 = mxj.a("enableDelayRefresh", true);
                        if (mxe.INSTANCE.c() == 1 || !a4) {
                            mtz.a(runnable);
                        } else {
                            e.this.i.postDelayed(runnable, 1000L);
                        }
                        mui.a(jSONObject3);
                        e.e(e.this);
                        e.b(e.this, jSONObject2);
                        e.d(e.this, jSONObject2);
                        e.this.a(jSONObject2);
                        e.this.g();
                        DMComponent dMComponent = (DMComponent) e.this.e("headerModule");
                        if (dMComponent != null) {
                            e.a(e.this, dMComponent);
                        }
                        e.c(e.this, jSONObject2);
                        if (TextUtils.equals("action_pull_refresh", "action_cache_invalid") && e.this.f18498a != null) {
                            e.this.f18498a.d();
                        }
                        mxf.b("processQueryData");
                    } else {
                        qpl.a("mtbMainLink", "loadMtopMainData failed: " + str);
                        mtz.a(new Runnable() { // from class: com.taobao.mytaobao.ultron.e.3.2
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                e.c(e.this);
                                if (e.b(e.this) == null) {
                                    return;
                                }
                                e.b(e.this).k();
                            }
                        });
                    }
                }
            });
        }
    }

    private JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("87d5db88", new Object[]{this, jSONObject, jSONObject2});
        }
        if (com.taobao.mytaobao.base.c.g()) {
            this.C.incrementAndGet();
            return jSONObject;
        }
        try {
            qnp qnpVar = new qnp();
            boolean z2 = this.C.getAndIncrement() == 0;
            if (mxe.INSTANCE.c() == 1) {
                z = true;
            }
            return qnpVar.a(jSONObject, jSONObject2, z2, z);
        } catch (Throwable unused) {
            return jSONObject;
        }
    }

    private void f(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669e4a77", new Object[]{this, str});
            return;
        }
        if (TextUtils.equals(str, "stark_s_mytaobao_24")) {
            str = "v24";
        }
        MtbBizProxy mtbBizProxy = this.A;
        if (mtbBizProxy == null) {
            return;
        }
        mtbBizProxy.a("mtbVersion", str);
        this.A.a("mtb_v", str);
        String str3 = "0";
        if (com.taobao.mytaobao.base.c.d()) {
            str2 = "1";
        } else {
            str2 = com.taobao.mytaobao.base.c.k() ? "2" : str3;
        }
        this.A.a("mtb_apm_test", str2);
        this.A.a("mtb_preloadDataHit", mxe.INSTANCE.c() == 0 ? "1" : str3);
        MtbBizProxy mtbBizProxy2 = this.A;
        if (com.taobao.mytaobao.base.c.f()) {
            str3 = "1";
        }
        mtbBizProxy2.a("enableBasementRefreshTwice", str3);
        this.A.a("hitDefaultV24TypeV2", String.valueOf(com.taobao.mytaobao.base.c.k));
        this.A.a("disableUIRefreshOnPagePause", String.valueOf(com.taobao.mytaobao.base.c.t()));
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        mxf.a("loadCache");
        JSONObject l = b.a().l();
        JSONObject jSONObject = l != null ? l.getJSONObject(mtp.b.f31254a) : null;
        MtbBizProxy mtbBizProxy = this.A;
        if (mtbBizProxy != null) {
            mtbBizProxy.e.a(jSONObject);
        }
        MtbBizProxy mtbBizProxy2 = this.A;
        if (mtbBizProxy2 != null) {
            mtbBizProxy2.a(true, b(jSONObject));
        }
        com.taobao.mytaobao.base.c.a(jSONObject);
        f(com.taobao.mytaobao.base.c.b());
        d(jSONObject);
        mxf.b("loadCache");
        mxf.a("cacheRender");
        nwv.b("before render Cache");
        if (l != null) {
            this.c.a(l, (d.c) null);
        }
        nwv.b("after render Cache");
        a(l, this.f);
        mxf.b("cacheRender");
        JSONObject c = b.a().c();
        if (c != null) {
            this.c.a(c, (d.c) null);
        }
        a(c, (com.taobao.mytaobao.ultron.a) null);
        nwv.b("zzz1");
        this.p.a(this, jSONObject);
        nwv.b("zzz2");
        a aVar = this.e;
        if (aVar != null) {
            aVar.a(0, 0, 0, jSONObject);
        }
        nwv.b("zzz2");
        if (l != null) {
            f(l.getJSONObject("data"));
            a(jSONObject);
        }
        nwv.b("zzz4");
    }

    private void a(JSONObject jSONObject, com.taobao.mytaobao.ultron.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1c2952f", new Object[]{this, jSONObject, aVar});
        } else if (jSONObject == null || this.c.b() == null) {
        } else {
            mui.a(this.c.b().c());
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.c.o();
        this.c.d(1);
        this.c.n();
        b.a().i();
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        IDMComponent b = b(str);
        if (b == null && !TextUtils.isEmpty(str2)) {
            b = e(str2);
        }
        this.c.a(b);
    }

    public IDMComponent b(String str) {
        com.alibaba.android.ultron.vfw.instance.d dVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("e5087df7", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str) && (dVar = this.c) != null && dVar.b() != null) {
            return this.c.b().b(str);
        }
        return null;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        c();
        c("action_cache_invalid");
    }

    private SecScreenBean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SecScreenBean) ipChange.ipc$dispatch("124e23fd", new Object[]{this});
        }
        SecScreenBean secScreenBean = this.n;
        if (secScreenBean == null || secScreenBean.apiName == null || secScreenBean.apiVersion == null) {
            return null;
        }
        if (secScreenBean.data != null) {
            a(secScreenBean.data);
        }
        return secScreenBean;
    }

    private void a(HashMap<String, String> hashMap) {
        com.taobao.mytaobao.ultron.model.b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("656bbc4b", new Object[]{this, hashMap});
            return;
        }
        String str = hashMap.get(PushConstants.PARAMS);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        JSONObject jSONObject = null;
        try {
            jSONObject = JSONObject.parseObject(str);
        } catch (Throwable th) {
            mxm.a("parse_json", "generateSecParams", "二楼配置解析异常 " + th.getMessage());
        }
        if (jSONObject == null || (bVar = this.o) == null) {
            return;
        }
        jSONObject.put(com.taobao.mytaobao.ultron.model.b.KEY_SHOW_SEC_SCREEN_LIVE_MODE, (Object) String.valueOf(bVar.d()));
        jSONObject.put(com.taobao.mytaobao.ultron.model.b.KEY_SHOW_SEC_SCREEN_SHOP_MODE, (Object) String.valueOf(this.o.e()));
        hashMap.put(PushConstants.PARAMS, jSONObject.toString());
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : b.a().f();
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf2450ee", new Object[]{this, aVar});
        } else {
            this.e = aVar;
        }
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else {
            d(str);
        }
    }

    private void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6782afb", new Object[]{this});
        } else if (this.c.x() == null) {
        } else {
            this.c.x().B();
        }
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
            return;
        }
        if (TextUtils.equals(str, "action_cache_invalid")) {
            mtx.d(this.v).a("MainInterface");
        }
        mxf.a(mxf.beforeMainApi);
        SecScreenBean s = s();
        a(str, s);
        mxf.b(mxf.beforeMainApi);
        if (!com.taobao.mytaobao.basement.a.d() || this.q) {
            return;
        }
        mxf.a(mxf.beforeOverSeaApi);
        b(s);
        mxf.b(mxf.beforeOverSeaApi);
    }

    private void a(String str, SecScreenBean secScreenBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7287d93", new Object[]{this, str, secScreenBean});
            return;
        }
        mxf.a("queryAndRender");
        HashMap hashMap = new HashMap();
        a(hashMap, secScreenBean);
        hashMap.put("deviceLevel", String.valueOf(com.taobao.mytaobao.base.c.a()));
        this.j = 0;
        jnw a2 = mwr.a(this.c.a(), "mtop.taobao.reborn.mclaren", "2.0", hashMap, true);
        this.j++;
        TLog.loge("mtbMainLink", "调用主接口");
        a2.c(this.c.b()).a(null, new h(str, this));
    }

    public void a(final String str, final MtopResponse mtopResponse, final int i, final jny jnyVar) {
        final JSONObject a2;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdeab107", new Object[]{this, str, mtopResponse, new Integer(i), jnyVar});
            return;
        }
        try {
            JSONObject jSONObject = (JSONObject) JSON.parseObject(mtopResponse.getBytedata(), JSONObject.class, new Feature[0]);
            JSONObject l = b.a().l();
            nwv.a(jSONObject);
            a(mtopResponse, jnyVar, b.CACHE_KEY_ULTRON_MTB);
            try {
                qnp qnpVar = new qnp();
                boolean z2 = this.C.getAndIncrement() == 0;
                if (mxe.INSTANCE.c() != 1) {
                    z = false;
                }
                a2 = qnpVar.a(jSONObject, l, z2, z);
            } catch (Throwable unused) {
            }
            mtz.a(new Runnable() { // from class: com.taobao.mytaobao.ultron.e.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (e.this.z) {
                    } else {
                        e.c(e.this);
                        mxf.a(mxf.renderMainApiData);
                        e.a(e.this).d().a(e.a(e.this).x().b(), (Object) null);
                        e.a(e.this).r().a(a2);
                        e.a(e.this).a(e.this.f);
                        e.a(e.this).a(127);
                        mxf.b(mxf.renderMainApiData);
                        e.a(e.this, str, i, mtopResponse, jnyVar, a2);
                    }
                }
            });
        } catch (Throwable unused2) {
        }
    }

    @UIThread
    private void a(String str, int i, MtopResponse mtopResponse, jny jnyVar, JSONObject jSONObject) {
        JSONObject jSONObject2;
        com.taobao.mytaobao.basement.i iVar;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbb57fdf", new Object[]{this, str, new Integer(i), mtopResponse, jnyVar, jSONObject});
        } else if (this.z) {
        } else {
            if (TextUtils.equals(str, "action_cache_invalid")) {
                mtx.d(this.v).a("MainInterface", null);
            }
            mxf.b("queryAndRender");
            mxf.a("processQueryData");
            this.j--;
            MtbBizProxy mtbBizProxy = this.A;
            if (mtbBizProxy != null) {
                mtbBizProxy.l();
            }
            if (jnyVar != null && jnyVar.c() != null) {
                mui.a(jnyVar.c());
            }
            if (jSONObject != null) {
                jSONObject2 = jSONObject.getJSONObject("data");
            } else {
                mtopResponse.parseJsonByte();
                jSONObject2 = ((JSONObject) JSON.parseObject(mtopResponse.getBytedata(), JSONObject.class, new Feature[0])).getJSONObject("data");
            }
            this.p.a(this, jSONObject2, str);
            com.taobao.mytaobao.base.c.a(jSONObject2);
            MtbBizProxy mtbBizProxy2 = this.A;
            if (mtbBizProxy2 != null) {
                mtbBizProxy2.e.a(jSONObject2);
                this.A.e.a(true);
            }
            x();
            c(jSONObject2);
            if (mxz.c()) {
                if (this.n != null) {
                    z = false;
                }
                d(jSONObject2);
                if (z) {
                    b();
                }
            } else {
                d(jSONObject2);
            }
            a(jSONObject2);
            g();
            v();
            mxf.a("UPPdata");
            DMComponent dMComponent = (DMComponent) e("headerModule");
            if (dMComponent != null) {
                a(dMComponent);
            }
            a aVar = this.e;
            if (aVar != null && this.j == 0) {
                aVar.a(2, 0, 0, jSONObject2);
            }
            f(jSONObject2);
            mxf.b("UPPdata");
            MtbBizProxy mtbBizProxy3 = this.A;
            if (mtbBizProxy3 != null) {
                mtbBizProxy3.a(false, b(jSONObject2));
            }
            BehaviR.getInstance().commitRequest("Page_MyTaobao", str, null, "success=true");
            t();
            if (TextUtils.equals("action_pull_refresh", str) && (iVar = this.f18498a) != null) {
                iVar.d();
            }
            mxf.b("processQueryData");
        }
    }

    public void a(String str, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1453b77", new Object[]{this, str, mtopResponse});
        } else if (this.z) {
        } else {
            y();
            TLog.loge("mtbMainLink", "主接口onError retCode=" + mtopResponse.getRetCode() + " retMsg=" + mtopResponse.getRetMsg());
            if (TextUtils.equals(str, "action_cache_invalid")) {
                mtx.d(this.v).a("MainInterface", mtx.b());
            }
            if (mtopResponse != null) {
                mtopResponse.getRetCode();
            }
            this.j--;
            MtbBizProxy mtbBizProxy = this.A;
            if (mtbBizProxy != null) {
                mtbBizProxy.l();
            }
            a aVar = this.e;
            if (aVar != null && this.j == 0) {
                aVar.a(2, 0, 2, null);
            }
            BehaviR.getInstance().commitRequest("Page_MyTaobao", str, null, "success=false");
        }
    }

    private void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c50c34c6", new Object[]{this, jSONObject});
            return;
        }
        JSONArray b = b.b(jSONObject);
        if (b != null && b.size() > 0) {
            com.taobao.mytaobao.base.c.m = true;
            ArrayList arrayList = new ArrayList(b.size());
            for (int i = 0; i < b.size(); i++) {
                arrayList.add(b.getJSONObject(i).getString("orderId"));
            }
            com.taobao.mytaobao.ultron.fatigue.a.a(Login.getUserId()).a(arrayList);
            com.taobao.mytaobao.ultron.fatigue.a.a(Login.getUserId()).e();
            return;
        }
        com.taobao.mytaobao.base.c.m = false;
    }

    private void a(DMComponent dMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9411d260", new Object[]{this, dMComponent});
            return;
        }
        JSONObject events = dMComponent.getEvents();
        if (events == null) {
            return;
        }
        JSONArray jSONArray = events.getJSONArray("openSetting");
        if (jSONArray != null) {
            n.a(jSONArray, "settingButton.hasRedDot");
        }
        JSONArray jSONArray2 = events.getJSONArray("openUserLogo");
        if (jSONArray2 != null) {
            n.a(jSONArray2, "userInfo.bubbleText");
        }
        dMComponent.writeBackDataAndReloadEvent(dMComponent.getData(), false);
    }

    private void d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("265ed165", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
            this.o = null;
            this.n = null;
        } else {
            this.n = SecScreenBean.readGlobalSecScreenBean(jSONObject);
            com.taobao.mytaobao.ultron.model.b.a(jSONObject);
            if (this.o != null) {
                return;
            }
            this.o = com.taobao.mytaobao.ultron.model.b.b();
        }
    }

    private void b(final SecScreenBean secScreenBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c6fcb4a", new Object[]{this, secScreenBean});
        } else if (secScreenBean == null) {
        } else {
            jnw a2 = a(secScreenBean);
            this.j++;
            com.alibaba.android.ultron.vfw.instance.d dVar = this.c;
            dVar.a(a2.c(dVar.b()), (Object) null, new joc() { // from class: com.taobao.mytaobao.ultron.e.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.joc
                public void a(int i, MtopResponse mtopResponse, Object obj, boolean z, Map<String, ?> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("dc169ead", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z), map});
                        return;
                    }
                    e.f(e.this);
                    if (e.g(e.this) != null && e.h(e.this) == 0) {
                        e.g(e.this).a(3, 0, 2, null);
                    }
                    if (e.b(e.this) != null) {
                        e.b(e.this).l();
                    }
                    com.taobao.oversea.mytaobao.b.a().b();
                }

                @Override // tb.joc
                public void a(int i, MtopResponse mtopResponse, Object obj, jny jnyVar, Map<String, ?> map) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b57ff8e", new Object[]{this, new Integer(i), mtopResponse, obj, jnyVar, map});
                        return;
                    }
                    e.f(e.this);
                    if (e.b(e.this) != null) {
                        e.b(e.this).l();
                    }
                    e.a(e.this, mtopResponse, jnyVar, b.CACHE_KEY_ULTRON_SEC_SCREEN);
                    if ("true".equals(secScreenBean.data.get("canLoadMore"))) {
                        try {
                            org.json.JSONObject jSONObject = mtopResponse.getDataJsonObject().getJSONObject("global");
                            com.taobao.oversea.mytaobao.b.a().a(secScreenBean, jSONObject != null ? jSONObject.getJSONObject(nde.ECHO).toString() : "{\"itemLastCount\":0,\"pageNo\":0,\"pageTotal\":0}");
                        } catch (Exception unused) {
                        }
                    } else {
                        com.taobao.oversea.mytaobao.b.a().b();
                    }
                    if (jnyVar != null && jnyVar.c() != null) {
                        mui.a(jnyVar.c());
                    }
                    if (e.g(e.this) == null || e.h(e.this) != 0) {
                        return;
                    }
                    e.g(e.this).a(3, 0, 0, null);
                }
            }, this.f);
        }
    }

    private jnw a(SecScreenBean secScreenBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jnw) ipChange.ipc$dispatch("9be3334a", new Object[]{this, secScreenBean});
        }
        if (secScreenBean == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        if (secScreenBean.data != null) {
            hashMap.putAll(secScreenBean.data);
            JSONObject jSONObject = new JSONObject();
            String str = "true";
            if (!str.equals(secScreenBean.data.get("canLoadMore"))) {
                str = "false";
            }
            jSONObject.put("canLoadMore", (Object) str);
            hashMap.put("bizParams", jSONObject.toJSONString());
        }
        return mwr.a(this.c.a(), secScreenBean.apiName, secScreenBean.apiVersion, hashMap, secScreenBean.unitTrade);
    }

    private void a(Map<String, String> map, SecScreenBean secScreenBean) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c296a17e", new Object[]{this, map, secScreenBean});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("useUpp", (Object) Boolean.toString(false));
        if (!TBRevisionSwitchManager.i().a("new2021UIEnable") || !mxa.c()) {
            z = false;
        }
        jSONObject.put("new2021UIEnable", (Object) Boolean.valueOf(z));
        if (secScreenBean != null && secScreenBean.apiName != null) {
            jSONObject.put(mtp.USE_SEC_SCREEN_API, (Object) secScreenBean.apiName);
        }
        String jSONString = JSON.toJSONString(com.taobao.mytaobao.ultron.fatigue.a.a(Login.getUserId()).b());
        if (!TextUtils.isEmpty(jSONString)) {
            jSONObject.put("orderFatigue", (Object) jSONString);
        }
        if (com.taobao.android.tbelder.b.c()) {
            jSONObject.put("elderFont", (Object) "true");
        }
        Float w = com.taobao.mytaobao.base.c.w();
        if (w != null) {
            jSONObject.put(com.taobao.infoflow.taobao.subservice.biz.videocardanimationservice.impl.d.ASPECT_RATIO, (Object) w);
        }
        map.put(PushConstants.PARAMS, JSON.toJSONString(jSONObject));
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject == null || !jSONObject.containsKey("global")) {
        } else {
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject("global");
                String[] strArr = null;
                JSONArray jSONArray = jSONObject2 != null ? jSONObject2.getJSONArray("deliveryConditionKey") : null;
                if (jSONArray != null) {
                    strArr = (String[]) jSONArray.toArray(new String[0]);
                }
                this.y.a(strArr);
            } catch (Exception unused) {
            }
        }
    }

    public void g() {
        IDMComponent e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        com.alibaba.android.ultron.vfw.instance.d dVar = this.c;
        if (dVar == null || dVar.b() == null || (e = e("orderModule")) == null) {
            return;
        }
        com.alibaba.android.ultron.event.base.e a2 = this.c.d().a();
        a2.a(e);
        this.y.a(a2);
    }

    public com.alibaba.android.ultron.vfw.instance.d h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.android.ultron.vfw.instance.d) ipChange.ipc$dispatch("d88c8954", new Object[]{this}) : this.c;
    }

    public static JSONObject b(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7b75e747", new Object[]{jSONObject});
        }
        if (jSONObject != null && jSONObject.containsKey("global") && (jSONObject2 = jSONObject.getJSONObject("global")) != null) {
            return jSONObject2.getJSONObject("customSkin");
        }
        return null;
    }

    private void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69459fd", new Object[]{this});
        } else {
            Coordinator.execute(new Runnable() { // from class: com.taobao.mytaobao.ultron.e.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    mxa.b();
                    mxa.a(mxa.NEW_CONTENT_GROUP, mxa.NEW_CONTENT_KEY, Boolean.valueOf(TBRevisionSwitchManager.i().a(ilw.KEY_NEW_CONTENT_ENABLE)));
                }
            });
        }
    }

    public IDMComponent e(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IDMComponent) ipChange.ipc$dispatch("8012fe3a", new Object[]{this, str}) : a(this.c, str);
    }

    public static IDMComponent a(com.alibaba.android.ultron.vfw.instance.d dVar, String str) {
        List<IDMComponent> b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("88e05f9b", new Object[]{dVar, str});
        }
        if (dVar == null || TextUtils.isEmpty(str) || dVar.b() == null || (b = dVar.b().b()) == null || b.size() <= 0) {
            return null;
        }
        for (IDMComponent iDMComponent : b) {
            if (iDMComponent != null && TextUtils.equals(str, iDMComponent.getTag())) {
                return iDMComponent;
            }
        }
        return null;
    }

    private void a(MtopResponse mtopResponse, jny jnyVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1db24f92", new Object[]{this, mtopResponse, jnyVar, str});
        } else {
            b.a().a(mtopResponse, jnyVar, str);
        }
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        com.alibaba.android.ultron.vfw.instance.d dVar = this.c;
        if (dVar == null) {
            return;
        }
        dVar.b(2);
    }

    public void a(String str, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c6cddef", new Object[]{this, str, intent});
        } else if (mug.ACTION_REFRESH_PAGE.equals(str) || mug.ACTION_REFRESH_PAGE_WHEN_SHOW.equals(str)) {
            c("action_cache_invalid");
        } else if ("MyTaobao_Order_Refresh".equals(str)) {
            g();
        } else if ("EDITON_SWITCHER_EDITTION_CODE_CHANGED".equals(str) || mvn.ACTION_USER_AVATAR_CHANGED.equals(str)) {
            v();
            d();
            c();
            TLog.loge("mtbMainLink", "收到广播，清数据， actionName=" + str);
        } else if (mug.ACTION_SCROLL_TO_CARD.equals(str)) {
            com.taobao.mytaobao.basement.monitor.b.a().a("bctScrollToCard");
            TLog.loge("mtbMainLink", "收到广播，滚动， actionName=" + str);
            String stringExtra = intent.getStringExtra("cardId");
            String stringExtra2 = intent.getStringExtra("cardTag");
            if (TextUtils.isEmpty(stringExtra)) {
                stringExtra = intent.getStringExtra("arg1");
            }
            a(stringExtra, stringExtra2);
        } else if (!"taobao.action.ACTION_REVISION_SWITCH_CHANGE".equals(str)) {
        } else {
            v();
            if (intent.getBooleanExtra("isLazy", false)) {
                return;
            }
            d();
            c();
            TLog.loge("mtbMainLink", "收到广播，清数据， actionName=" + str);
        }
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        this.A = null;
        this.C.set(0);
        this.i.removeCallbacksAndMessages(null);
        b.a aVar = this.g;
        if (aVar != null) {
            com.alibaba.ability.localization.b.b(aVar);
        }
        if (this.h != null) {
            LocalBroadcastManager.getInstance(this.A.m()).unregisterReceiver(this.h);
        }
        this.z = true;
        if (this.x != null) {
            com.taobao.android.autosize.h.a().d(this.x);
        }
        com.alibaba.android.ultron.vfw.instance.d dVar = this.c;
        if (dVar != null) {
            dVar.m();
        }
        com.taobao.mytaobao.ultron.a aVar2 = this.f;
        if (aVar2 != null) {
            aVar2.a();
        }
        mwq mwqVar = this.u;
        if (mwqVar != null) {
            mwqVar.a();
        }
        this.e = null;
        bkz bkzVar = this.r;
        if (bkzVar != null) {
            bkzVar.a("pageback");
        }
        com.taobao.mytaobao.message.a aVar3 = this.d;
        if (aVar3 != null) {
            aVar3.b();
        }
        b.a().p();
    }

    public boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[]{this})).booleanValue();
        }
        if (this.n == null) {
            return false;
        }
        com.taobao.mytaobao.ultron.model.b a2 = com.taobao.mytaobao.ultron.model.b.a();
        boolean z = !a2.a(this.o);
        this.o = a2;
        this.o.c();
        return z;
    }

    @Override // tb.mwo
    public void a(List<IDMComponent> list) {
        a aVar;
        com.taobao.mytaobao.ultron.dinamicX.eventHandler.vipModuleSliderLayoutEventHandler.a aVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
            return;
        }
        r.a();
        for (IDMComponent iDMComponent : list) {
            if ("vipModule".equals(iDMComponent.getTag()) && (aVar2 = this.m) != null) {
                aVar2.a((DMComponent) iDMComponent);
            }
            ArrayMap<String, Object> extMap = iDMComponent.getExtMap();
            if (extMap != null) {
                extMap.remove(mtp.KEY_EXPOSED_MARK);
            }
        }
        if (com.alibaba.android.ultron.engine.utils.a.a(list) || (aVar = this.e) == null) {
            return;
        }
        aVar.a();
    }

    public void p() {
        blb blbVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        com.taobao.mytaobao.basement.i iVar = this.f18498a;
        if ((iVar == null || !iVar.t()) && (blbVar = this.s) != null) {
            blbVar.a("pageback", null);
        }
        if (!com.alibaba.ability.localization.b.c()) {
            return;
        }
        this.c.q().g(false);
        ArrayList arrayList = new ArrayList();
        arrayList.add((DMComponent) e("headerModule"));
        this.c.a(arrayList);
    }

    private void f(JSONObject jSONObject) {
        final JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9040aa3", new Object[]{this, jSONObject});
            return;
        }
        try {
            jSONObject2 = jSONObject.getJSONObject("global").getJSONObject("passParams");
        } catch (Exception unused) {
            jSONObject2 = new JSONObject(0);
        }
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject(0);
        }
        Coordinator.execute(new Runnable() { // from class: com.taobao.mytaobao.ultron.e.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    mxo.a(TBMyTaobaoWVPlugin.TAG, jSONObject2.toJSONString());
                }
            }
        });
    }

    private void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b088ff", new Object[]{this});
        } else {
            Coordinator.execute(new Runnable() { // from class: com.taobao.mytaobao.ultron.e.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("mytaobaoVersion", (Object) com.taobao.mytaobao.base.c.b());
                    jSONObject.put("bizType", (Object) com.taobao.mytaobao.base.c.m());
                    jSONObject.put("pageType", (Object) com.taobao.mytaobao.base.c.n());
                    jSONObject.put("version", (Object) com.taobao.mytaobao.base.c.l());
                    String jSONString = jSONObject.toJSONString();
                    mua.a(com.taobao.mytaobao.basement.monitor.b.MODULE_NAME, 19997, "tbMytaobaoVersion", null, null, jSONObject);
                    AppMonitor.Counter.commit(com.taobao.mytaobao.basement.monitor.b.MODULE_NAME, "TBLoadPerformance", jSONString, 1.0d);
                    TLog.loge("mtbMainLink", "mtbVersion=" + jSONString);
                }
            });
        }
    }

    private void y() {
        bny q;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bea080", new Object[]{this});
            return;
        }
        com.alibaba.android.ultron.vfw.instance.d dVar = this.c;
        if (dVar == null || (q = dVar.q()) == null) {
            return;
        }
        q.g(false);
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.g = new b.a() { // from class: com.taobao.mytaobao.ultron.e.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.ability.localization.b.a
            public void a(Language language, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("246661b", new Object[]{this, language, str});
                } else {
                    mug.a(true, mug.ACTION_REFRESH_PAGE, new String[0]);
                }
            }
        };
        com.alibaba.ability.localization.b.a(this.g);
        LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(this.A.m());
        IntentFilter intentFilter = new IntentFilter("CURRENCY_CHANGE");
        this.h = new BroadcastReceiver() { // from class: com.taobao.mytaobao.ultron.MTBPresenter$10
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                } else {
                    mug.a(true, mug.ACTION_REFRESH_PAGE, new String[0]);
                }
            }
        };
        localBroadcastManager.registerReceiver(this.h, intentFilter);
    }
}
