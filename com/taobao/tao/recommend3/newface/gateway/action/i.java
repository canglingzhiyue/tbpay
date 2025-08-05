package com.taobao.tao.recommend3.newface.gateway.action;

import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.exception.GatewayException;
import com.taobao.homepage.utils.n;
import com.taobao.homepage.utils.q;
import com.taobao.monitor.procedure.s;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import tb.gkc;
import tb.gke;
import tb.kge;
import tb.krv;
import tb.ksr;
import tb.kuk;
import tb.laq;
import tb.lar;
import tb.oog;
import tb.ope;
import tb.oqa;
import tb.oqc;
import tb.oqd;
import tb.oql;

/* loaded from: classes.dex */
public class i implements gke {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ope f20943a;
    private final l b;

    static {
        kge.a(1356660324);
        kge.a(1464465151);
    }

    public static /* synthetic */ ope a(i iVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ope) ipChange.ipc$dispatch("b08b7d50", new Object[]{iVar}) : iVar.f20943a;
    }

    public static /* synthetic */ void a(i iVar, JSONObject jSONObject, gkc gkcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1319f66f", new Object[]{iVar, jSONObject, gkcVar});
        } else {
            iVar.b(jSONObject, gkcVar);
        }
    }

    public static /* synthetic */ void a(i iVar, String str, ope opeVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a34ff288", new Object[]{iVar, str, opeVar, jSONObject});
        } else {
            iVar.a(str, opeVar, jSONObject);
        }
    }

    public i(ope opeVar) throws GatewayException {
        if (opeVar == null) {
            throw new GatewayException("RecmdDataSource should not be null");
        }
        this.f20943a = opeVar;
        this.b = new l();
        oql.a().a(this.b);
    }

    @Override // tb.gke
    public void a(final JSONObject jSONObject, final gkc gkcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff35999", new Object[]{this, jSONObject, gkcVar});
        } else if (jSONObject == null) {
        } else {
            String string = jSONObject.getString(com.taobao.themis.kernel.i.CDN_REQUEST_TYPE);
            if (TextUtils.equals(string, "loadCache")) {
                b(jSONObject, gkcVar);
                return;
            }
            s.f18233a.d().a("disableHomepageUIRefreshOnPagePause", Boolean.valueOf(n.n().d()));
            this.b.a(new Runnable() { // from class: com.taobao.tao.recommend3.newface.gateway.action.i.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        i.a(i.this, jSONObject, gkcVar);
                    }
                }
            }, string);
        }
    }

    private void b(JSONObject jSONObject, gkc gkcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c96ae738", new Object[]{this, jSONObject, gkcVar});
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        com.taobao.tao.linklog.a.a("umbrella.component.render", "gateway2.uiRefresh", "start action");
        String string = jSONObject.getString(com.taobao.themis.kernel.i.CDN_REQUEST_TYPE);
        lar.e("NewFaceUIRefreshAction_" + string);
        String string2 = jSONObject.getString("dataSourceType");
        String string3 = jSONObject.getString("containerId");
        String str = "NewFaceUIRefreshAction_" + string + "_" + string3;
        com.taobao.tao.recommend3.tracelog.b.a().a(str, 1);
        b(string3, this.f20943a, jSONObject);
        if (TextUtils.equals(string2, "local") && TextUtils.equals(string, "loadCache") && this.f20943a.h().get()) {
            ksr.c("UIRefresh", "loadCache_coldstart_ready");
        }
        a(jSONObject);
        oqd.a(string, SystemClock.uptimeMillis() - uptimeMillis, string3, string2);
        if (jSONObject != null && TextUtils.equals(jSONObject.getString(com.taobao.themis.kernel.i.CDN_REQUEST_TYPE), "coldStart")) {
            krv.a(krv.STAGE_DRAW_COLD_START_DATA);
        }
        lar.f("NewFaceUIRefreshAction_" + string);
        com.taobao.tao.recommend3.tracelog.b.a().b(str);
    }

    private void a(final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        String string = jSONObject.getString(com.taobao.themis.kernel.i.CDN_REQUEST_TYPE);
        final String string2 = jSONObject.getString("containerId");
        Object obj = jSONObject.get("containerModel");
        laq a2 = laq.a().a("MTopRequest").b("dataProcess").c("gateway2.uiRefresh.doProcess").a("containerId", string2).a("dataSourceType", jSONObject.getString("dataSourceType"));
        a2.a(com.taobao.themis.kernel.i.CDN_REQUEST_TYPE, string);
        if (this.f20943a.c(oqc.j().f30287a) != null) {
            a2.a("scene", "infoFlow");
            kuk.a("dataRefresh").a("scene", "infoFlow").a(com.taobao.themis.kernel.i.CDN_REQUEST_TYPE, string).b();
        }
        a2.b();
        oog.b();
        boolean booleanValue = jSONObject.getBooleanValue("isSecondReturn");
        if (!TextUtils.isEmpty(string2) && obj != null) {
            if (booleanValue && oqc.a().d(string2)) {
                return;
            }
            if (TextUtils.equals(string, "coldStart") && oqc.a().d(string2) && com.taobao.homepage.utils.i.a()) {
                com.taobao.gateway.dispatch.a.b().a(new Runnable() { // from class: com.taobao.tao.recommend3.newface.gateway.action.i.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        i iVar = i.this;
                        i.a(iVar, string2, i.a(iVar), jSONObject);
                    }
                }, 0L);
                return;
            } else {
                a(string2, this.f20943a, jSONObject);
                return;
            }
        }
        b(jSONObject);
    }

    private void b(String str, ope opeVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c0ba311", new Object[]{this, str, opeVar, jSONObject});
            return;
        }
        oqa a2 = oqc.a().a(str);
        if (a2 == null) {
            return;
        }
        lar.e("uiRefresh_start_" + str);
        a2.b(opeVar, jSONObject);
        lar.f("uiRefresh_finish_" + str);
    }

    private void a(String str, ope opeVar, JSONObject jSONObject) {
        AwesomeGetContainerData b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1daa9f32", new Object[]{this, str, opeVar, jSONObject});
            return;
        }
        oqa a2 = oqc.a().a(str);
        if (a2 == null) {
            return;
        }
        String string = jSONObject.getString(com.taobao.themis.kernel.i.CDN_REQUEST_TYPE);
        q.a(string, jSONObject.getString("dataChangeType"), TextUtils.equals(string, "loadCache") || ((b = opeVar.b(str)) != null && b.getPageNum() == 0));
        lar.e("uiRefresh_" + str);
        long uptimeMillis = SystemClock.uptimeMillis();
        a2.d(opeVar, jSONObject);
        com.taobao.android.home.component.utils.e.e("gateway2.uiRefresh", "uiRefresh cost time : " + (SystemClock.uptimeMillis() - uptimeMillis) + " , containerId : " + str + " , requestType : " + string);
        StringBuilder sb = new StringBuilder();
        sb.append("uiRefresh_");
        sb.append(str);
        lar.f(sb.toString());
    }

    private void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
            return;
        }
        String[] i = oqc.a().i(jSONObject);
        if (i == null) {
            return;
        }
        for (String str : i) {
            if (n.o()) {
                jSONObject.put("containerId", (Object) str);
                jSONObject.put("containerModel", (Object) this.f20943a.b(str));
            }
            if (jSONObject.get("containerId") == null) {
                jSONObject.put("containerId", (Object) str);
            }
            a(str, this.f20943a, jSONObject);
        }
    }
}
