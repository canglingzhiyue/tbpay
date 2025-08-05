package com.taobao.tao.homepage;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.tempate.DTemplateManager;
import com.taobao.android.dinamic.tempate.DinamicTemplate;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.bi;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.homepage.utils.n;
import com.taobao.homepage.utils.o;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import java.util.ArrayList;
import java.util.List;
import tb.fvb;
import tb.fvd;
import tb.fve;
import tb.jdm;
import tb.jdn;
import tb.kge;
import tb.ksr;
import tb.kuv;
import tb.kux;
import tb.kuz;
import tb.kva;
import tb.kvb;
import tb.kvc;
import tb.kvd;
import tb.kve;
import tb.kvf;
import tb.kvg;
import tb.kvm;
import tb.kvp;
import tb.kvq;
import tb.kvs;
import tb.kvu;
import tb.kvv;
import tb.kvx;
import tb.kvy;
import tb.kwa;
import tb.kwb;
import tb.kwc;
import tb.kwd;
import tb.kwh;
import tb.kwi;
import tb.kwn;
import tb.kwq;
import tb.leg;
import tb.ley;
import tb.lfo;
import tb.ncw;
import tb.rhl;
import tb.rhm;
import tb.rhn;
import tb.rho;
import tb.rhp;
import tb.sfl;
import tb.sto;
import tb.stp;
import tb.stq;

/* loaded from: classes.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f20589a;
    private DinamicXEngine b;

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static f f20592a;

        static {
            kge.a(-736994337);
            f20592a = new f();
        }

        public static /* synthetic */ f a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("43632bb4", new Object[0]) : f20592a;
        }
    }

    /* loaded from: classes8.dex */
    public interface b {
        void a();
    }

    static {
        kge.a(-1266283763);
    }

    private f() {
        this.f20589a = "HomepageDinamicXCenter";
        c();
    }

    public static f a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("43632bb4", new Object[0]) : a.a();
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        DinamicXEngine dinamicXEngine = this.b;
        if (dinamicXEngine == null || !dinamicXEngine.d()) {
            com.taobao.tao.recommend3.tracelog.b.a().a("HomepageDinamicXCenter-init", 4);
            DXEngineConfig.a a2 = new DXEngineConfig.a("homepage").b(2).a(1000);
            if (n.b()) {
                a2.e(false);
            }
            a2.a(1000);
            if (com.taobao.homepage.utils.b.a()) {
                a2.a(true, com.taobao.homepage.utils.b.d());
            }
            this.b = new DinamicXEngine(a2.a());
            com.taobao.tao.recommend3.tracelog.b.a().b("HomepageDinamicXCenter-init");
        }
        this.b.a(1202423593942681808L, new kwq.a());
        this.b.a(-6240570111658900479L, new kwn.a());
        this.b.a(34696035233L, new ley(new kvg()));
        this.b.a(-1980042490983877383L, new ley(new kuv()));
        this.b.a(kux.DX_EVENT_HEDITIONSWITCH, new ley(new kux()));
        this.b.a(-5348504102650243981L, new lfo(new kvq()));
        this.b.a(kuz.DX_EVENT_HOPENPOP, new ley(new kuz()));
        this.b.a(kvb.DX_EVENT_HSEARCHTEXTSTORAGE, new ley(new kvb()));
        this.b.a(8520638904096683930L, new ley(new kve()));
        this.b.a(-5738105571919564880L, new ley(new kva()));
        this.b.a(kvf.DX_EVENT_HTABCLICK, new ley(new kvf()));
        this.b.a(rhl.DX_EVENT_HSAVEDATA, new ley(new rhl()));
        this.b.a(kvc.DX_EVENT_HSETDATATOMODEL, new ley(new kvc()));
        this.b.a(9068808819005234401L, new ley(new kvd()));
        this.b.a(9422011105736515L, new lfo(new rho()));
        this.b.a(rhp.DX_PARSER_MAPTOARRAY, new lfo(new rhp()));
        this.b.a(kwd.DX_PARSER_NAVEXTHEIGHT, new lfo(new kwd()));
        this.b.a(rhm.DX_PARSER_FESTIVAL, new lfo(new rhm()));
        this.b.a(1466861815985736590L, new lfo(new kvx()));
        this.b.a(-2517623531547489759L, new lfo(new kwi()));
        this.b.a(kwh.DX_PARSER_REVISIONSWITCH, new lfo(new kwh()));
        this.b.a(kwa.DX_PARSER_HTABSELECTEDINDEX, new lfo(new kwa()));
        this.b.a(kvs.DX_PARSER_HGETDATAFROMMODEL, new lfo(new kvs()));
        this.b.a(jdm.DX_PARSER_TAOBAO_THEME_GET_CURRENT, new lfo(new jdm()));
        this.b.a(jdn.DX_PARSER_TAOBAO_THEME_VALID, new lfo(new jdn()));
        this.b.a(rhn.DX_PARSER_HGETDATA, new lfo(new rhn()));
        this.b.a(6584495743641924598L, new lfo(new kvv()));
        this.b.a(kvy.DX_PARSER_HISCLIENTCACHE, new lfo(new kvy()));
        this.b.a(kvu.DX_PARSER_HGETLASTCLICKEDPOPID, new lfo(new kvu()));
        this.b.a(6875012019473020234L, new lfo(new kvp()));
        this.b.a(ncw.DX_PARSER_HLOGIN, new lfo(new ncw()));
        this.b.a(sfl.DX_PARSER_HSEARCHBARDATA, new sfl());
        this.b.a(kwb.DX_PARSER_HTABCONTENTDISPLAYLAYOUTTYPE, new lfo(new kwb()));
        this.b.a(kwc.DX_PARSER_ISNEWPULL, new lfo(new kwc()));
        this.b.a(5560765727008152586L, new ley(new kvm()));
        this.b.a(3196545303523394880L, new stq.a());
        this.b.a(4912396181747440332L, new stp.a());
        this.b.a(sto.HREFRESHIMAGE, new sto.a());
        this.b.a(new bi() { // from class: com.taobao.tao.homepage.f.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.dinamicx.bi
            public int a(int i, int i2) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("5c1152bb", new Object[]{this, new Integer(i), new Integer(i2)})).intValue() : i2;
            }

            @Override // com.taobao.android.dinamicx.bi
            public /* synthetic */ boolean a() {
                return bi.CC.$default$a(this);
            }

            @Override // com.taobao.android.dinamicx.bi
            public boolean a(Context context) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("9e1d6464", new Object[]{this, context})).booleanValue() : !com.taobao.tao.topmultitab.a.c() && com.taobao.android.home.component.utils.b.a(context);
            }
        });
    }

    public DinamicXEngine b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DinamicXEngine) ipChange.ipc$dispatch("870a047e", new Object[]{this});
        }
        if (!this.b.d()) {
            this.b.o();
            c();
            com.taobao.android.home.component.utils.e.e("HomepageDinamicXCenter", "engine init failed, rebuild engine.");
        }
        return this.b;
    }

    public void a(List<SectionModel> list, String str, final b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ce929db", new Object[]{this, list, str, bVar});
        } else if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (SectionModel sectionModel : list) {
                a(sectionModel, arrayList, arrayList2);
            }
            if (!arrayList.isEmpty()) {
                DTemplateManager.a(str).a(arrayList, new com.taobao.android.dinamic.tempate.a() { // from class: com.taobao.tao.homepage.f.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.dinamic.tempate.a
                    public void a(com.taobao.android.dinamic.tempate.b bVar2) {
                        b bVar3;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("fab23079", new Object[]{this, bVar2});
                        } else if (bVar2.b == null || bVar2.b.isEmpty() || (bVar3 = bVar) == null) {
                        } else {
                            bVar3.a();
                        }
                    }
                });
            }
            if (!arrayList2.isEmpty()) {
                if (!TextUtils.equals("homepage", str)) {
                    com.taobao.android.home.component.utils.e.e("HomepageDinamicXCenter", "current homePageEngine modulename is homepage, cannot handle module : " + str);
                } else {
                    this.b.a(arrayList2);
                    this.b.a(new fve() { // from class: com.taobao.tao.homepage.f.3
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // tb.fve
                        public void onNotificationListener(fvb fvbVar) {
                            o.a a2;
                            b bVar2;
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("73876f63", new Object[]{this, fvbVar});
                                return;
                            }
                            if (fvbVar.f28139a != null && !fvbVar.f28139a.isEmpty() && (bVar2 = bVar) != null) {
                                bVar2.a();
                            }
                            if (fvbVar.c == null || fvbVar.c.isEmpty()) {
                                return;
                            }
                            for (fvd fvdVar : fvbVar.c) {
                                if (fvdVar.c == 1000) {
                                    JSONObject jSONObject = fvdVar.b;
                                    ksr.a(fvdVar.f28145a, jSONObject, "-1", "homepage dinamicX3.0 render failed", "");
                                    if (jSONObject != null && (a2 = o.a(jSONObject.getJSONObject("template"))) != null) {
                                        a2.f();
                                        a2.a(true);
                                    }
                                }
                            }
                        }
                    });
                }
            }
            for (DinamicTemplate dinamicTemplate : arrayList) {
                leg.a(dinamicTemplate.name, dinamicTemplate.version, dinamicTemplate.templateUrl, str);
            }
        }
    }

    private void a(JSONObject jSONObject, List<DinamicTemplate> list, List<DXTemplateItem> list2) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d985f36a", new Object[]{this, jSONObject, list, list2});
        } else if (jSONObject != null) {
            JSONObject jSONObject3 = jSONObject.getJSONObject("template");
            if (jSONObject3 != null) {
                b(jSONObject3, list, list2);
            }
            JSONObject jSONObject4 = jSONObject.getJSONObject("ext");
            if (jSONObject4 == null || !TextUtils.equals("true", jSONObject4.getString("downloadSubSectionTemplates")) || (jSONObject2 = jSONObject.getJSONObject("subSection")) == null) {
                return;
            }
            for (int i = 0; jSONObject2.containsKey(String.valueOf(i)); i++) {
                JSONObject jSONObject5 = jSONObject2.getJSONObject(String.valueOf(i));
                JSONObject jSONObject6 = jSONObject5 != null ? jSONObject5.getJSONObject("template") : null;
                if (jSONObject6 != null) {
                    b(jSONObject6, list, list2);
                }
            }
        }
    }

    private void b(JSONObject jSONObject, List<DinamicTemplate> list, List<DXTemplateItem> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12665409", new Object[]{this, jSONObject, list, list2});
            return;
        }
        o.a a2 = o.a(jSONObject);
        if (a2 == null) {
            return;
        }
        if (!a2.a()) {
            DinamicTemplate d = a2.d();
            if (d == null) {
                return;
            }
            list.add(d);
            return;
        }
        DXTemplateItem e = a2.e();
        if (e == null) {
            return;
        }
        list2.add(e);
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        DinamicXEngine dinamicXEngine = this.b;
        if (dinamicXEngine != null) {
            return dinamicXEngine.b().y();
        }
        return false;
    }
}
