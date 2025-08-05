package com.taobao.android.detail.core.ultronengine;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.widget.LinearLayoutManager;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.alibaba.android.ultron.engine.template.TemplateInfo;
import com.alibaba.android.ultron.engine.template.b;
import com.alibaba.android.ultron.vfw.dataloader.d;
import com.alibaba.android.ultron.vfw.dataloader.j;
import com.alibaba.android.ultron.vfw.dataloader.o;
import com.alibaba.android.ultron.vfw.instance.UltronError;
import com.alibaba.android.ultron.vfw.instance.UltronInstanceConfig;
import com.alibaba.android.ultron.vfw.instance.d;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.performance.BTags;
import com.taobao.android.detail.core.performance.l;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.core.utils.s;
import com.taobao.android.detail.datasdk.model.datamodel.node.RateNode;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.bnv;
import tb.bor;
import tb.bpg;
import tb.dws;
import tb.dya;
import tb.eba;
import tb.ebb;
import tb.ebd;
import tb.ebe;
import tb.ebg;
import tb.ebh;
import tb.ebi;
import tb.ebk;
import tb.ebl;
import tb.egg;
import tb.egq;
import tb.eha;
import tb.eiq;
import tb.emu;
import tb.emx;
import tb.end;
import tb.eng;
import tb.enh;
import tb.eox;
import tb.epe;
import tb.epj;
import tb.epo;
import tb.epp;
import tb.epz;
import tb.frg;
import tb.hng;
import tb.iuy;
import tb.kge;
import tb.kpa;
import tb.kqv;
import tb.oyw;

/* loaded from: classes4.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MODULE_NAME = "detail2";
    public static final String TAG = "EngineAdapter";
    private static String o;

    /* renamed from: a  reason: collision with root package name */
    public com.taobao.android.detail.datasdk.model.datamodel.node.b f9927a;
    private final DetailCoreActivity b;
    private final DetailRecyclerView d;
    private final LinearLayout e;
    private com.alibaba.android.ultron.vfw.instance.d f;
    private final eox g;
    private JSONObject j;
    private volatile end k;
    private volatile com.alibaba.android.ultron.vfw.dataloader.h l;
    private boolean m;
    private IDMComponent n;
    private d.c p;
    private final Handler c = new Handler(Looper.getMainLooper());
    private final List<String> h = new ArrayList();
    private final List<Object> i = new ArrayList();
    private List<e> q = new ArrayList();
    private boolean r = true;

    static {
        kge.a(469655077);
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public static /* synthetic */ com.alibaba.android.ultron.vfw.dataloader.h a(f fVar, com.alibaba.android.ultron.vfw.dataloader.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.android.ultron.vfw.dataloader.h) ipChange.ipc$dispatch("d3bd469b", new Object[]{fVar, hVar});
        }
        fVar.l = hVar;
        return hVar;
    }

    public static /* synthetic */ com.alibaba.android.ultron.vfw.instance.d a(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.android.ultron.vfw.instance.d) ipChange.ipc$dispatch("46dd52c", new Object[]{fVar}) : fVar.f;
    }

    public static /* synthetic */ void a(f fVar, com.taobao.android.detail.datasdk.model.datamodel.node.b bVar, com.taobao.android.ultron.datamodel.imp.b bVar2, List list, bnv bnvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32b04c50", new Object[]{fVar, bVar, bVar2, list, bnvVar});
        } else {
            fVar.a(bVar, bVar2, list, bnvVar);
        }
    }

    public static /* synthetic */ boolean a(f fVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3cdbe0f1", new Object[]{fVar, new Boolean(z)})).booleanValue();
        }
        fVar.m = z;
        return z;
    }

    public static /* synthetic */ DetailRecyclerView b(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DetailRecyclerView) ipChange.ipc$dispatch("be7ff2d6", new Object[]{fVar}) : fVar.d;
    }

    public static /* synthetic */ boolean b(f fVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ca169272", new Object[]{fVar, new Boolean(z)})).booleanValue();
        }
        fVar.r = z;
        return z;
    }

    public static /* synthetic */ LinearLayout c(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinearLayout) ipChange.ipc$dispatch("5fa4875c", new Object[]{fVar}) : fVar.e;
    }

    public static /* synthetic */ DetailCoreActivity d(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DetailCoreActivity) ipChange.ipc$dispatch("a077c8ef", new Object[]{fVar}) : fVar.b;
    }

    public static /* synthetic */ JSONObject e(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("f8317363", new Object[]{fVar}) : fVar.j;
    }

    public static /* synthetic */ boolean f(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b5a52ea6", new Object[]{fVar})).booleanValue() : fVar.m;
    }

    public static /* synthetic */ end g(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (end) ipChange.ipc$dispatch("6d872cea", new Object[]{fVar}) : fVar.k;
    }

    public f(DetailCoreActivity detailCoreActivity, com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        this.b = detailCoreActivity;
        this.f9927a = bVar;
        LinearLayout linearLayout = new LinearLayout(detailCoreActivity);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(-1);
        this.e = linearLayout;
        this.d = (DetailRecyclerView) View.inflate(detailCoreActivity, R.layout.x_detail_main_top_rv, null);
        this.d.setLayoutManager(new LinearLayoutManager(detailCoreActivity));
        this.g = emx.a(detailCoreActivity).b().m();
        a(detailCoreActivity, bVar);
        i.c(TAG, "UltronEngineAdapter created");
        emu.a("com.taobao.android.detail.core.ultronengine.UltronEngineAdapter");
    }

    public void a(com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c456302", new Object[]{this, bVar});
            return;
        }
        this.f9927a = bVar;
        this.f.a(b(bVar));
        c(bVar);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.l != null;
    }

    private void a(final Context context, com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41a1f4fa", new Object[]{this, context, bVar});
            return;
        }
        i.b(TAG, "UltronEngineAdapter ultron-view-kit ");
        UltronInstanceConfig ultronInstanceConfig = new UltronInstanceConfig();
        ultronInstanceConfig.c(false);
        ultronInstanceConfig.a("detail2");
        ultronInstanceConfig.e(15);
        ultronInstanceConfig.c("detail");
        ultronInstanceConfig.f(com.taobao.android.detail.core.utils.e.h());
        ultronInstanceConfig.g(com.taobao.android.detail.core.utils.e.g());
        ultronInstanceConfig.h(com.taobao.android.detail.core.utils.g.a());
        ultronInstanceConfig.e(com.taobao.android.detail.core.utils.e.k());
        ultronInstanceConfig.i(com.taobao.android.detail.core.utils.g.e());
        ultronInstanceConfig.k(com.taobao.android.detail.core.utils.g.d());
        ultronInstanceConfig.a(true);
        ultronInstanceConfig.a(UltronInstanceConfig.ExposureStrategy.EXPOSURE_ONCE);
        ultronInstanceConfig.d(1);
        if (l()) {
            ultronInstanceConfig.c(1);
        }
        if (!com.taobao.android.detail.core.utils.g.d()) {
            ultronInstanceConfig.a(new d(com.taobao.android.detail.core.perf.b.a(context)));
        }
        this.f = com.alibaba.android.ultron.vfw.instance.d.a(ultronInstanceConfig, context);
        this.f.d().a(new com.taobao.android.detail.core.ultronengine.event.a());
        this.f.d().a(com.taobao.android.detail.core.ultronengine.event.d.EVENT_TYPE, new com.taobao.android.detail.core.ultronengine.event.d());
        this.f.d().a("openProductParams", new com.taobao.android.detail.core.ultronengine.event.c());
        this.f.d().b("request", new com.taobao.android.detail.core.ultronengine.event.b());
        this.f.a(b(bVar));
        a(this.f);
        this.f.l().a().b().a(iuy.c);
        this.f.l().a().b().a(true, true);
        Iterator<Object> it = this.i.iterator();
        while (it.hasNext()) {
            it.next();
        }
        c(bVar);
        if (Looper.getMainLooper() == Looper.myLooper()) {
            this.f.a(new LinearLayout(context), this.d, this.e);
        } else {
            this.c.post(new Runnable() { // from class: com.taobao.android.detail.core.ultronengine.f.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (f.a(f.this) == null || f.b(f.this) == null || f.c(f.this) == null) {
                    } else {
                        f.a(f.this).a(new LinearLayout(context), f.b(f.this), f.c(f.this));
                    }
                }
            });
        }
    }

    private boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue();
        }
        return "1".equals(epj.h().a("android_detail", "createLazyComponentStrategy", "0")) || com.taobao.android.detail.core.utils.g.c();
    }

    private Map<String, String> b(com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f3d38838", new Object[]{this, bVar});
        }
        if (bVar == null) {
            return null;
        }
        com.taobao.android.detail.datasdk.model.datamodel.node.c cVar = new com.taobao.android.detail.datasdk.model.datamodel.node.c(bVar);
        HashMap hashMap = new HashMap(4);
        hashMap.put("item_id", cVar.i());
        hashMap.put("shop_id", cVar.o());
        hashMap.put("seller_id", cVar.h());
        try {
            hashMap.put("user_id", epo.g().e());
        } catch (Throwable th) {
            i.a(TAG, "getUtParams#getUserId", th);
        }
        hashMap.put("native_detail_v", "2.0");
        DetailCoreActivity detailCoreActivity = this.b;
        if ((detailCoreActivity instanceof DetailCoreActivity) && detailCoreActivity.f9411a != null && detailCoreActivity.f9411a.u != null) {
            hashMap.put("fromtorelation", detailCoreActivity.f9411a.u);
        }
        Map<String, String> g = cVar.g();
        if (g != null) {
            hashMap.putAll(g);
        }
        Map<String, String> f = cVar.f();
        if (g != null) {
            hashMap.putAll(f);
        }
        return hashMap;
    }

    private void a(com.alibaba.android.ultron.vfw.instance.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a26c908d", new Object[]{this, dVar});
            return;
        }
        dVar.a(hng.DETAIL_WIDGET_ID, new hng.a());
        dVar.a(ebi.f27168a, new ebi.a());
        dVar.a(ebk.f27171a, new ebk.a());
        dVar.a(ebe.f27161a, new ebe.a());
        dVar.a(ebh.f27165a, new ebh.a());
        dVar.a(ebg.f27163a, new ebg.a());
        dVar.a(ebd.f27160a, new ebd.a());
        dVar.a(ebl.f27173a, new ebl.a());
        if (s.a()) {
            dVar.a(frg.DX_PARSER_DX_ENV, new a());
            dVar.a(kpa.DX_PARSER_SCREENINFO, new dws.a());
        }
        dVar.a(-8964819166049023094L, new kqv());
        dVar.a(eba.EVENT_IDENTIFY.longValue(), new eba());
        dVar.a(ebb.EVENT_IDENTIFY.longValue(), new ebb());
    }

    private void c(com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33646b84", new Object[]{this, bVar});
        } else if (bVar == null) {
        } else {
            com.alibaba.android.ultron.vfw.dataloader.c a2 = com.alibaba.android.ultron.vfw.dataloader.c.a();
            a2.b("detailDataParser");
            a2.a(true);
            TemplateInfo e = e(bVar);
            if (e == null) {
                e = new TemplateInfo();
                e.setVersion("2");
                e.setTemplateId("1577694038300");
            }
            a2.a(e);
            this.f.a(a2);
            this.f.a("detailDataParser", new o() { // from class: com.taobao.android.detail.core.ultronengine.f.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alibaba.android.ultron.vfw.dataloader.o
                public void a(com.alibaba.android.ultron.vfw.dataloader.d dVar, com.alibaba.android.ultron.vfw.dataloader.i iVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b088e163", new Object[]{this, dVar, iVar});
                        return;
                    }
                    JSONObject jSONObject = null;
                    try {
                        if (dVar.d().f2693a != null) {
                            jSONObject = dVar.d().f2693a;
                            dVar.d().c = jSONObject;
                        } else {
                            jSONObject = dVar.d().c;
                        }
                        JSONObject jSONObject2 = dVar.d().b;
                        if (jSONObject2 != null) {
                            String string = jSONObject2.getString("type");
                            JSONObject jSONObject3 = jSONObject2.getJSONObject("eventData");
                            JSONArray jSONArray = jSONObject2.getJSONArray("dataMergeParams");
                            UnifyLog.d(f.TAG, "opState type: " + string);
                            com.alibaba.android.ultron.engine.utils.b.a(jSONObject3, jSONObject, jSONArray);
                        }
                    } catch (Exception e2) {
                        i.a(f.TAG, "", e2);
                        h.a(e2);
                    }
                    if (jSONObject != null) {
                        try {
                            JSONObject jSONObject4 = jSONObject.getJSONObject("componentsVO");
                            if (jSONObject4 != null) {
                                a(jSONObject4, jSONObject);
                                jSONObject.put("componentsVO", (Object) jSONObject4);
                            }
                        } catch (Exception e3) {
                            i.a(f.TAG, "", e3);
                            h.a("EngineAdapter_doParse", e3);
                        }
                    }
                    j jVar = new j();
                    jVar.a(jSONObject);
                    iVar.a(jVar);
                }

                private void a(JSONObject jSONObject, JSONObject jSONObject2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6f32d068", new Object[]{this, jSONObject, jSONObject2});
                        return;
                    }
                    ArrayList<String> arrayList = new ArrayList();
                    for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                        String key = entry.getKey();
                        Object a3 = epz.a(jSONObject2, entry.getValue(), true);
                        if (a3 instanceof JSONObject) {
                            JSONObject jSONObject3 = (JSONObject) a3;
                            if (jSONObject3.containsKey("filter")) {
                                String string = jSONObject3.getString("filter");
                                if (!TextUtils.isEmpty(string) && com.alibaba.android.ultron.engine.utils.h.a(f.d(f.this), string, jSONObject2)) {
                                    UnifyLog.d(f.TAG, "filter过滤掉了VO: " + key);
                                    arrayList.add(key);
                                }
                            }
                        }
                        entry.setValue(a3);
                    }
                    for (String str : arrayList) {
                        jSONObject.remove(str);
                    }
                }
            });
        }
    }

    public com.alibaba.android.ultron.vfw.instance.d c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.android.ultron.vfw.instance.d) ipChange.ipc$dispatch("8d29ca0f", new Object[]{this}) : this.f;
    }

    public LinearLayout d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinearLayout) ipChange.ipc$dispatch("df8a65c2", new Object[]{this}) : this.e;
    }

    public DetailRecyclerView e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DetailRecyclerView) ipChange.ipc$dispatch("c6785cd0", new Object[]{this}) : this.d;
    }

    public int f() {
        List<IDMComponent> f;
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b2e1e0", new Object[]{this})).intValue();
        }
        if (this.f.k() != null && this.f.k().f() != null && (f = this.f.k().f()) != null && f.size() != 0) {
            for (int i = 0; i < f.size(); i++) {
                IDMComponent iDMComponent = f.get(i);
                if (iDMComponent != null && iDMComponent.getFields() != null && (string = iDMComponent.getFields().getString("locatorId")) != null && string.toLowerCase().contains(RateNode.TAG)) {
                    return i + this.d.getHeaderViewsCount();
                }
            }
        }
        return -1;
    }

    private com.alibaba.android.ultron.vfw.dataloader.d d(final com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.android.ultron.vfw.dataloader.d) ipChange.ipc$dispatch("52ee95c2", new Object[]{this, bVar});
        }
        JSONObject a2 = bVar.a();
        d.a aVar = new d.a();
        aVar.f2693a = a2;
        com.alibaba.android.ultron.vfw.dataloader.d a3 = com.alibaba.android.ultron.vfw.dataloader.d.a("initial", aVar);
        bor borVar = new bor(new d.c() { // from class: com.taobao.android.detail.core.ultronengine.f.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.ultron.vfw.instance.d.c
            public void a(List<IDMComponent> list, bnv bnvVar, com.taobao.android.ultron.datamodel.imp.b bVar2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("57c33db", new Object[]{this, list, bnvVar, bVar2});
                } else if (bVar2 == null || list == null) {
                } else {
                    f.a(f.this, bVar, bVar2, list, bnvVar);
                }
            }
        });
        this.p = borVar;
        a3.a(borVar);
        return a3;
    }

    public enh a(com.taobao.android.detail.datasdk.model.datamodel.node.b bVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (enh) ipChange.ipc$dispatch("39853999", new Object[]{this, bVar, jSONObject});
        }
        if (jSONObject != null && bVar != null) {
            try {
                eng engVar = new eng(bVar, null, null, null);
                engVar.b = new com.taobao.android.detail.datasdk.model.datamodel.node.c(bVar);
                end endVar = new end(engVar, null, null);
                this.k = endVar;
                com.taobao.android.detail.core.perf.c.b(this.b, "detailDataProcess");
                com.taobao.android.detail.core.perf.c.a(this.b, "ultronDataProcess");
                if (b(bVar, jSONObject)) {
                    com.taobao.android.detail.core.perf.c.a(this.b, "viewRender");
                    bVar.b = true;
                    final egq a2 = new egg().a(null, bVar);
                    if (a2 == null) {
                        return null;
                    }
                    a2.f27296a = this;
                    engVar.d = a2;
                    this.c.post(new Runnable() { // from class: com.taobao.android.detail.core.ultronengine.f.4
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else if (eiq.m && com.taobao.android.detail.core.performance.preload.g.a().b()) {
                                i.a(l.a(f.TAG), "行业化降级到详情2.0");
                                com.taobao.android.detail.core.performance.preload.g.a().c();
                            } else {
                                dya y = f.d(f.this) == null ? null : f.d(f.this).y();
                                if (y == null) {
                                    return;
                                }
                                y.a(a2);
                            }
                        }
                    });
                    return new enh(engVar, endVar);
                }
            } catch (Throwable th) {
                epp.a(TAG, "createMainStructureResponse", th);
                h.a("EngineAdapter_createMainStructureResponse", th);
            }
        }
        return null;
    }

    private TemplateInfo e(com.taobao.android.detail.datasdk.model.datamodel.node.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateInfo) ipChange.ipc$dispatch("d614a8cd", new Object[]{this, bVar});
        }
        JSONObject a2 = b.a(bVar);
        if (a2 == null) {
            return null;
        }
        this.j = a2;
        TemplateInfo templateInfo = new TemplateInfo();
        templateInfo.setUrl(a2.getString("url"));
        templateInfo.setVersion(a2.getString("version"));
        templateInfo.setTemplateId(a2.getString("id"));
        return templateInfo;
    }

    private boolean b(final com.taobao.android.detail.datasdk.model.datamodel.node.b bVar, final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("22a28811", new Object[]{this, bVar, jSONObject})).booleanValue();
        }
        this.f.a(d(bVar), new com.alibaba.android.ultron.vfw.dataloader.f() { // from class: com.taobao.android.detail.core.ultronengine.f.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass5 anonymousClass5, String str, Object... objArr) {
                int hashCode = str.hashCode();
                if (hashCode == -1255022652) {
                    super.a((com.alibaba.android.ultron.vfw.dataloader.h) objArr[0], (UltronError) objArr[1]);
                    return null;
                } else if (hashCode == -1095944170) {
                    return super.a((j) objArr[0]);
                } else {
                    if (hashCode != -437475423) {
                        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                    }
                    super.a((com.alibaba.android.ultron.vfw.dataloader.h) objArr[0]);
                    return null;
                }
            }

            @Override // com.alibaba.android.ultron.vfw.dataloader.f, com.alibaba.android.ultron.vfw.dataloader.b
            public void a(com.alibaba.android.ultron.vfw.dataloader.h hVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e5eca7a1", new Object[]{this, hVar});
                } else {
                    super.a(hVar);
                }
            }

            @Override // com.alibaba.android.ultron.vfw.dataloader.f, com.alibaba.android.ultron.vfw.dataloader.b
            public void a(com.alibaba.android.ultron.vfw.dataloader.h hVar, UltronError ultronError) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b531dfc4", new Object[]{this, hVar, ultronError});
                    return;
                }
                super.a(hVar, ultronError);
                f.a(f.this, false);
                if (hVar.a() != null) {
                    b.a aVar = hVar.a().b;
                    if (aVar != null && aVar.f2569a == 100004) {
                        h.a(f.e(f.this), aVar);
                        return;
                    } else {
                        h.a(aVar, ultronError);
                        return;
                    }
                }
                h.a((b.a) null, ultronError);
            }

            @Override // com.alibaba.android.ultron.vfw.dataloader.f, com.alibaba.android.ultron.vfw.dataloader.i
            public j a(j jVar) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (j) ipChange2.ipc$dispatch("bead3816", new Object[]{this, jVar}) : super.a(jVar);
            }

            @Override // com.alibaba.android.ultron.vfw.dataloader.f
            public boolean b(com.alibaba.android.ultron.vfw.dataloader.h hVar) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("d7964dc4", new Object[]{this, hVar})).booleanValue();
                }
                if (hVar == null || hVar.c()) {
                    f.a(f.this, false);
                    b.a aVar = null;
                    if (hVar != null && hVar.a() != null) {
                        aVar = hVar.a().b;
                    }
                    h.a(aVar);
                    return false;
                }
                f.a(f.this, hVar);
                f.b(f.this, true);
                com.taobao.android.detail.core.perf.c.a(f.d(f.this), "checkEnable");
                f fVar = f.this;
                f.a(fVar, new com.taobao.android.detail.core.ultronengine.a(f.d(fVar)).a(bVar, jSONObject, hVar));
                com.taobao.android.detail.core.perf.c.b(f.d(f.this), "checkEnable");
                bVar.b = f.f(f.this);
                com.taobao.android.detail.core.perf.c.b(f.d(f.this), "ultronDataProcess");
                return false;
            }
        });
        return this.m;
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else if (!this.r || !a()) {
        } else {
            this.r = false;
            i.c(TAG, "renderView");
            this.f.a(this.l.a().c, this.p);
            a(this.b, this.l.a().c);
        }
    }

    private void a(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cb6e290", new Object[]{this, context, jSONObject});
        } else if (!com.taobao.android.detail.core.debug.b.a(context, jSONObject)) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("dataType", com.taobao.android.detail.core.debug.b.DATA_TYPE_RENDERT_DATA);
            hashMap.put(com.taobao.android.detail.core.debug.b.KEY_RENDERT_DATA, jSONObject.toJSONString());
            try {
                com.taobao.android.detail.core.debug.b.a(hashMap, context).asyncRequest();
            } catch (Exception e) {
                i.a(TAG, "postRenderData error " + Log.getStackTraceString(e));
            }
        }
    }

    public List<String> h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("b7e2e578", new Object[]{this}) : this.h;
    }

    public void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d069b668", new Object[]{this, eVar});
        } else if (eVar == null) {
        } else {
            this.q.add(eVar);
        }
    }

    private void a(com.taobao.android.detail.datasdk.model.datamodel.node.b bVar, com.taobao.android.ultron.datamodel.imp.b bVar2, List<IDMComponent> list, bnv bnvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af3a664f", new Object[]{this, bVar, bVar2, list, bnvVar});
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        this.h.clear();
        a(bVar2, bVar);
        for (IDMComponent iDMComponent : list) {
            if (TextUtils.equals("bottomBar", a(iDMComponent))) {
                arrayList2.add(iDMComponent);
                this.n = iDMComponent;
            } else if (a(iDMComponent, "detailInfoUltron")) {
                arrayList3.add(iDMComponent);
                if (iDMComponent.getFields() != null) {
                    String string = iDMComponent.getFields().getString("locatorId");
                    if (!TextUtils.isEmpty(string)) {
                        this.h.add(string);
                    }
                }
            }
        }
        bnvVar.a(arrayList);
        bnvVar.e(arrayList2);
        bnvVar.b(arrayList3);
        i.c(TAG, "body:" + arrayList3.size() + " footer:" + arrayList2.size());
        bVar.b = true;
        b(bVar2, bVar);
    }

    private void a(com.taobao.android.ultron.datamodel.imp.b bVar, com.taobao.android.detail.datasdk.model.datamodel.node.b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9656c6cc", new Object[]{this, bVar, bVar2});
            return;
        }
        DMComponent dMComponent = bVar.u().get("naviBar");
        if (dMComponent == null) {
            return;
        }
        epe d = this.g.d(dMComponent, bVar2);
        if (d != null) {
            this.k.c = d;
            this.c.post(new Runnable() { // from class: com.taobao.android.detail.core.ultronengine.f.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    dya y = f.d(f.this) == null ? null : f.d(f.this).y();
                    if (y == null) {
                        return;
                    }
                    i.a(com.taobao.android.detail.core.performance.i.a(f.TAG, BTags.TTNavBar), "processNavBar refreshActionBar");
                    y.a(f.g(f.this).c);
                }
            });
            return;
        }
        h.a();
    }

    private void b(com.taobao.android.ultron.datamodel.imp.b bVar, com.taobao.android.detail.datasdk.model.datamodel.node.b bVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c383eb", new Object[]{this, bVar, bVar2});
            return;
        }
        DMComponent dMComponent = bVar.u().get("detailHome");
        if (dMComponent == null) {
            h.b();
            return;
        }
        epe d = this.g.d(dMComponent, bVar2);
        if (!(d instanceof eha)) {
            h.b();
        } else {
            this.k.d = d;
        }
    }

    private boolean a(IDMComponent iDMComponent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a050eeba", new Object[]{this, iDMComponent, str})).booleanValue();
        }
        if (iDMComponent == null) {
            return false;
        }
        if (str.equals(a(iDMComponent))) {
            return true;
        }
        if (iDMComponent.getParent() == null) {
            return false;
        }
        return a(iDMComponent.getParent(), str);
    }

    private String a(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("41ebe234", new Object[]{this, iDMComponent});
        }
        if (iDMComponent.getParent() == null) {
            return iDMComponent.getPosition();
        }
        return iDMComponent.getParent().getPosition();
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        try {
            this.f.m();
            for (e eVar : this.q) {
                eVar.d();
            }
            this.q.clear();
        } catch (Throwable th) {
            h.a("EngineAdapter_onDestroy", th);
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        com.alibaba.android.ultron.vfw.instance.d dVar = this.f;
        if (dVar == null) {
            return;
        }
        com.alibaba.android.ultron.event.base.f d = dVar.d();
        com.alibaba.android.ultron.event.base.e a2 = d.a();
        a2.a("checkCollect");
        a2.a("clearAlreadyChecked", (Object) true);
        d.a(a2);
        i.c(TAG, "reBindBottomBar");
    }

    public com.taobao.android.detail.datasdk.model.datamodel.node.b k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.datasdk.model.datamodel.node.b) ipChange.ipc$dispatch("9b43fd3e", new Object[]{this}) : this.f9927a;
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        i.c(TAG, oyw.PRE_LOAD);
        o = bpg.d(context, "globalStyle.json");
    }

    /* loaded from: classes4.dex */
    public static class a extends frg {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(686477292);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == -858210922) {
                return super.evalWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // tb.frg, tb.fuf, tb.fut
        public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
            }
            if (objArr == null || objArr.length == 0) {
                return null;
            }
            return "platformDetail".equals(objArr[0]) ? "1" : super.evalWithArgs(objArr, dXRuntimeContext);
        }
    }
}
