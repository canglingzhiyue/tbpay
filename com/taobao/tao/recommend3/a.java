package com.taobao.tao.recommend3;

import android.support.v4.util.LongSparseArray;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.tempate.DTemplateManager;
import com.taobao.android.dinamic.tempate.DinamicTemplate;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.bn;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.android.dinamicx.widget.ak;
import com.taobao.android.home.component.utils.e;
import com.taobao.android.home.component.utils.j;
import com.taobao.homepage.utils.n;
import com.taobao.homepage.utils.o;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.bdx;
import tb.dln;
import tb.fut;
import tb.fvb;
import tb.fvd;
import tb.fve;
import tb.isw;
import tb.jdm;
import tb.jdn;
import tb.kge;
import tb.ksr;
import tb.kuu;
import tb.kuv;
import tb.kuw;
import tb.kux;
import tb.kuz;
import tb.kva;
import tb.kvb;
import tb.kvd;
import tb.kve;
import tb.kvg;
import tb.kvh;
import tb.kvi;
import tb.kvj;
import tb.kvk;
import tb.kvl;
import tb.kvm;
import tb.kvn;
import tb.kvp;
import tb.kvq;
import tb.kvv;
import tb.kvx;
import tb.kvz;
import tb.kwd;
import tb.kwe;
import tb.kwf;
import tb.kwg;
import tb.kwi;
import tb.kwl;
import tb.kwn;
import tb.kwo;
import tb.kwq;
import tb.kwr;
import tb.kws;
import tb.kwt;
import tb.kwu;
import tb.kwv;
import tb.kww;
import tb.lap;
import tb.ldf;
import tb.leg;
import tb.lms;
import tb.rhk;
import tb.rhl;
import tb.rhm;
import tb.rhn;
import tb.rho;
import tb.rhp;
import tb.rhq;
import tb.sdh;
import tb.tjq;
import tb.tps;
import tb.xmy;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, WeakReference<DinamicXEngine>> f20901a;
    private final DinamicXEngine b;
    private final LongSparseArray<ak> c;
    private final LongSparseArray<fut> d;
    private final LongSparseArray<bn> e;
    private final LongSparseArray<dln> f;
    private final com.taobao.android.dinamicx.ak g;
    private final boolean h;

    /* renamed from: com.taobao.tao.recommend3.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0875a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final a f20904a;

        static {
            kge.a(-115256561);
            f20904a = new a();
        }

        public static /* synthetic */ a a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("7f87cbf0", new Object[0]) : f20904a;
        }
    }

    /* loaded from: classes8.dex */
    public interface b {
        void a();
    }

    static {
        kge.a(-881395774);
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("7f87cbf0", new Object[0]) : C0875a.a();
    }

    private a() {
        this.f20901a = new HashMap();
        this.c = new LongSparseArray<>();
        this.d = new LongSparseArray<>();
        this.e = new LongSparseArray<>();
        this.f = new LongSparseArray<>();
        this.g = new kuu();
        this.h = c();
        ldf.d("RecommendDinamicXCenter", "购后是否允许 DX多实例 ： " + this.h);
        a(this.c);
        b(this.e);
        c(this.d);
        this.b = d();
        a(this.b);
    }

    public DinamicXEngine b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DinamicXEngine) ipChange.ipc$dispatch("870a047e", new Object[]{this}) : this.b;
    }

    public DinamicXEngine a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicXEngine) ipChange.ipc$dispatch("d3bb4895", new Object[]{this, str});
        }
        if (!this.h) {
            return b();
        }
        DinamicXEngine d = d();
        if (com.taobao.homepage.utils.b.a(str)) {
            d.b().a(true, com.taobao.homepage.utils.b.d());
        }
        a(d);
        this.f20901a.put(str, new WeakReference<>(d));
        return d;
    }

    private boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        return (com.taobao.homepage.utils.b.b() || com.taobao.homepage.utils.b.c()) || j.a("enableSmallScreenMultiDxEngine", true);
    }

    public void a(List<SectionModel> list, String str, b bVar, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d506b821", new Object[]{this, list, str, bVar, str2});
        } else {
            a(list, str, false, bVar, str2);
        }
    }

    public void a(List<SectionModel> list, String str, boolean z, final b bVar, String str2) {
        DinamicXEngine dinamicXEngine;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a19c873", new Object[]{this, list, str, new Boolean(z), bVar, str2});
        } else if (list != null && !list.isEmpty()) {
            final ArrayList arrayList = new ArrayList();
            final ArrayList arrayList2 = new ArrayList();
            WeakReference<DinamicXEngine> weakReference = this.f20901a.get(str2);
            if (!this.h) {
                dinamicXEngine = b();
            } else {
                dinamicXEngine = (weakReference == null || weakReference.get() == null) ? this.b : weakReference.get();
            }
            for (SectionModel sectionModel : list) {
                if (sectionModel != null && (jSONObject = sectionModel.getJSONObject("template")) != null) {
                    o.a a2 = o.a(jSONObject);
                    if (z) {
                        a2.f();
                    }
                    if (!a2.a()) {
                        DinamicTemplate d = a2.d();
                        if (d != null && !a(d, arrayList)) {
                            arrayList.add(d);
                        }
                    } else {
                        DXTemplateItem e = a2.e();
                        if (e != null && !a(e, arrayList2)) {
                            arrayList2.add(e);
                        }
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                DTemplateManager.a(str).a(arrayList, new com.taobao.android.dinamic.tempate.a() { // from class: com.taobao.tao.recommend3.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.dinamic.tempate.a
                    public void a(com.taobao.android.dinamic.tempate.b bVar2) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("fab23079", new Object[]{this, bVar2});
                        } else if (bVar2.b == null || bVar2.b.isEmpty()) {
                            com.taobao.tao.linklog.a.b(bdx.F_TEMPLATE_DOWNLOAD, "result_error", "2.0模板下载失败", "RecommendDinamicXCenter", "list : " + JSON.toJSONString(arrayList));
                        } else {
                            b bVar3 = bVar;
                            if (bVar3 == null) {
                                return;
                            }
                            bVar3.a();
                        }
                    }
                });
            }
            if (!arrayList2.isEmpty()) {
                if (!StringUtils.equals("guess", str)) {
                    e.e("RecommendDinamicXCenter", "current rmdEngine modulename is guess, cannot handle module : " + str);
                    com.taobao.tao.linklog.a.b(bdx.F_TEMPLATE_DOWNLOAD, "process_error", "不是猜你喜欢dinamic模块", "RecommendDinamicXCenter", "current rmdEngine modulename is guess, cannot handle module  : " + str + ", list3:" + JSON.toJSONString(arrayList2));
                    return;
                }
                dinamicXEngine.a(arrayList2);
                dinamicXEngine.a(new fve() { // from class: com.taobao.tao.recommend3.a.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.fve
                    public void onNotificationListener(fvb fvbVar) {
                        o.a a3;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("73876f63", new Object[]{this, fvbVar});
                            return;
                        }
                        if (fvbVar.f28139a == null || fvbVar.f28139a.isEmpty()) {
                            com.taobao.tao.linklog.a.b(bdx.F_TEMPLATE_DOWNLOAD, "result_error", "3.0模板下载失败", "RecommendDinamicXCenter", "list : " + JSON.toJSONString(arrayList2));
                        } else {
                            b bVar2 = bVar;
                            if (bVar2 != null) {
                                bVar2.a();
                            }
                        }
                        if (fvbVar.c == null || fvbVar.c.isEmpty()) {
                            return;
                        }
                        for (fvd fvdVar : fvbVar.c) {
                            if (fvdVar.c == 1000) {
                                JSONObject jSONObject2 = fvdVar.b;
                                ksr.a(fvdVar.f28145a, jSONObject2, "-2", "recommend dinamicX3 render failedv ", "GUESS_YOU_LIKE");
                                if (jSONObject2 != null && (a3 = o.a(jSONObject2.getJSONObject("template"))) != null) {
                                    a3.f();
                                    a3.a(true);
                                }
                            }
                        }
                    }
                });
            }
            for (DinamicTemplate dinamicTemplate : arrayList) {
                leg.a(dinamicTemplate.name, dinamicTemplate.version, dinamicTemplate.templateUrl, str);
            }
        }
    }

    private void a(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37589d99", new Object[]{this, dinamicXEngine});
            return;
        }
        lms.a(dinamicXEngine, this.c);
        dinamicXEngine.b(-7577370574697348630L, new kwu.a());
        dinamicXEngine.c(-7577370574697348630L, new xmy.a());
        lms.b(dinamicXEngine, this.d);
        lms.c(dinamicXEngine, this.e);
        lms.d(dinamicXEngine, this.f);
        dinamicXEngine.a(this.g);
        try {
            kwl.a(dinamicXEngine);
        } catch (Throwable th) {
            lap.a("dxInit", "initFowAdDX error", th.getMessage());
        }
    }

    private void a(LongSparseArray<ak> longSparseArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90c446d8", new Object[]{this, longSparseArray});
            return;
        }
        longSparseArray.put(-7752096208734590680L, new kwt.a());
        if (n.a()) {
            longSparseArray.put(-8690577844899785500L, new kws.a());
        } else {
            longSparseArray.put(-8690577844899785500L, new kwr.a());
        }
        longSparseArray.put(kwv.f30360a, new kwv.a());
        longSparseArray.put(-6240570111658900479L, new kwn.a());
        longSparseArray.put(-5996311416603680075L, new kww.a());
        longSparseArray.put(1202423593942681808L, new kwq.a());
        longSparseArray.put(-3771791355023224372L, new kwo.a());
    }

    private void b(LongSparseArray<bn> longSparseArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a3bd477", new Object[]{this, longSparseArray});
            return;
        }
        longSparseArray.put(37581716043L, new kvl());
        longSparseArray.put(isw.DX_EVENT_RTABITEMTAP, new isw());
        longSparseArray.put(5560765727008152586L, new kvm());
        longSparseArray.put(6136827152325085276L, new kvj());
        longSparseArray.put(-9200576388575376305L, new kvk());
        longSparseArray.put(-1980042490983877383L, new kuv());
        longSparseArray.put(rhl.DX_EVENT_HSAVEDATA, new rhl());
        longSparseArray.put(kvi.DX_EVENT_MAINADDCART, new kvi());
        longSparseArray.put(204709052093538189L, new kvh());
        longSparseArray.put(kuw.DX_EVENT_ELDERTABCLICK, new kuw());
        longSparseArray.put(34696035233L, new kvg());
        longSparseArray.put(-4629410644348754929L, new kvn());
        longSparseArray.put(kux.DX_EVENT_HEDITIONSWITCH, new kux());
        longSparseArray.put(kuz.DX_EVENT_HOPENPOP, new kuz());
        longSparseArray.put(kvb.DX_EVENT_HSEARCHTEXTSTORAGE, new kvb());
        longSparseArray.put(8520638904096683930L, new kve());
        longSparseArray.put(-5738105571919564880L, new kva());
        longSparseArray.put(9068808819005234401L, new kvd());
        longSparseArray.put(tjq.DX_EVENT_OPENRECSKU, new tjq());
        longSparseArray.put(rhk.DX_EVENT_HSETTOCURRENTMODEL, new rhk());
    }

    private void c(LongSparseArray<fut> longSparseArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b36216", new Object[]{this, longSparseArray});
            return;
        }
        longSparseArray.put(rhp.DX_PARSER_MAPTOARRAY, new rhp());
        longSparseArray.put(9422011105736515L, new rho());
        longSparseArray.put(5284242828433939926L, new kwf());
        longSparseArray.put(1293712961081187802L, new kwg());
        longSparseArray.put(-6150397287027100920L, new kvz());
        longSparseArray.put(jdm.DX_PARSER_TAOBAO_THEME_GET_CURRENT, new jdm());
        longSparseArray.put(jdn.DX_PARSER_TAOBAO_THEME_VALID, new jdn());
        longSparseArray.put(rhn.DX_PARSER_HGETDATA, new rhn());
        longSparseArray.put(6584495743641924598L, new kvv());
        longSparseArray.put(6875012019473020234L, new kvp());
        longSparseArray.put(kwd.DX_PARSER_NAVEXTHEIGHT, new kwd());
        longSparseArray.put(rhm.DX_PARSER_FESTIVAL, new rhm());
        longSparseArray.put(-5348504102650243981L, new kvq());
        longSparseArray.put(9860385864900610L, new kwe());
        longSparseArray.put(8281326256809424134L, new tps());
        longSparseArray.put(1466861815985736590L, new kvx());
        longSparseArray.put(-2517623531547489759L, new kwi());
        longSparseArray.put(-8936854687533104177L, new sdh());
        longSparseArray.put(rhq.DX_PARSER_HGETFROMCURRENTMODEL, new rhq());
    }

    private boolean a(DinamicTemplate dinamicTemplate, List<DinamicTemplate> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bee9bf67", new Object[]{this, dinamicTemplate, list})).booleanValue();
        }
        for (DinamicTemplate dinamicTemplate2 : list) {
            if (dinamicTemplate2.equals(dinamicTemplate)) {
                return true;
            }
        }
        return false;
    }

    private boolean a(DXTemplateItem dXTemplateItem, List<DXTemplateItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ef2e7106", new Object[]{this, dXTemplateItem, list})).booleanValue();
        }
        for (DXTemplateItem dXTemplateItem2 : list) {
            if (dXTemplateItem2.equals(dXTemplateItem)) {
                return true;
            }
        }
        return false;
    }

    private DinamicXEngine d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DinamicXEngine) ipChange.ipc$dispatch("fa9f483c", new Object[]{this}) : new DinamicXEngine(new DXEngineConfig.a("guess").b(2).a(1000).d(53).a("guess").a(false, false).e(false).a(1000).a());
    }
}
