package com.taobao.tao.recommend3.newface.gateway.action;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.exception.GatewayException;
import com.taobao.homepage.utils.HomePageUtility;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.tao.homepage.f;
import com.taobao.tao.recommend3.a;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import tb.gkc;
import tb.gke;
import tb.kge;
import tb.opb;
import tb.ope;
import tb.opf;
import tb.opw;
import tb.oqc;
import tb.ovi;

/* loaded from: classes.dex */
public class c implements gke {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ope f20931a;

    static {
        kge.a(-822052071);
        kge.a(1464465151);
    }

    public static /* synthetic */ ope a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ope) ipChange.ipc$dispatch("332f4cca", new Object[]{cVar}) : cVar.f20931a;
    }

    public static /* synthetic */ void a(c cVar, JSONObject jSONObject, gkc gkcVar, String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f182963a", new Object[]{cVar, jSONObject, gkcVar, str, new Integer(i), str2});
        } else {
            cVar.a(jSONObject, gkcVar, str, i, str2);
        }
    }

    public static /* synthetic */ void a(c cVar, JSONObject jSONObject, gkc gkcVar, String str, AwesomeGetContainerData awesomeGetContainerData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b0e1eaf", new Object[]{cVar, jSONObject, gkcVar, str, awesomeGetContainerData});
        } else {
            cVar.a(jSONObject, gkcVar, str, awesomeGetContainerData);
        }
    }

    public c(ope opeVar) throws GatewayException {
        if (opeVar == null) {
            throw new GatewayException("RecmdDataSource should not be null");
        }
        this.f20931a = opeVar;
    }

    @Override // tb.gke
    public void a(final JSONObject jSONObject, final gkc gkcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff35999", new Object[]{this, jSONObject, gkcVar});
            return;
        }
        com.taobao.android.home.component.utils.e.c("gateway2.loadCache", "start action:", jSONObject.toJSONString());
        com.taobao.tao.linklog.a.a("cacheProcess", "gateway2.loadCache", "start action");
        final String[] i = oqc.a().i(jSONObject);
        if (i == null) {
            a(jSONObject, gkcVar, (String) null, 1, "containers");
            return;
        }
        try {
            jSONObject.getBooleanValue("needSync");
        } catch (Throwable th) {
            com.taobao.android.home.component.utils.e.a("gateway2.loadCache", th, new String[0]);
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(i));
        com.taobao.tao.recommend3.tracelog.b.a().a("loadCacheByNewFaceLoadCacheAction", 1);
        this.f20931a.a(arrayList, new opf() { // from class: com.taobao.tao.recommend3.newface.gateway.action.c.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.opf
            public void a(List<String> list, List<String> list2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("78fe44a", new Object[]{this, list, list2});
                    return;
                }
                com.taobao.tao.recommend3.tracelog.b.a().b("loadCacheByNewFaceLoadCacheAction");
                if (list == null || list.isEmpty()) {
                    c cVar = c.this;
                    JSONObject jSONObject2 = jSONObject;
                    gkc gkcVar2 = gkcVar;
                    c.a(cVar, jSONObject2, gkcVar2, null, 4, "load cache : read file error, cid=" + i);
                }
                for (String str : list) {
                    AwesomeGetContainerData b = c.a(c.this).b(str);
                    if (b == null || b.getBaseData() == null) {
                        c cVar2 = c.this;
                        JSONObject jSONObject3 = jSONObject;
                        gkc gkcVar3 = gkcVar;
                        c.a(cVar2, jSONObject3, gkcVar3, str, 4, "load cache : container data is null, cid=" + str);
                    } else {
                        List<SectionModel> a2 = opb.a(str, b, (AwesomeGetContainerData) null);
                        c.a(c.this).a(str, a2);
                        c.this.a(str, a2, jSONObject, gkcVar);
                        com.taobao.tao.linklog.a.a("cacheProcess", "gateway2.loadCache", "load cache data trigger successfully");
                        c cVar3 = c.this;
                        c.a(cVar3, jSONObject, gkcVar, str, c.a(cVar3).b(str));
                    }
                }
                ovi.a().e();
            }
        });
        com.taobao.android.home.component.utils.e.c("gateway2.loadCache", "end action");
        com.taobao.tao.linklog.a.a("cacheProcess", "gateway2.loadCache", "end action");
    }

    public void a(final String str, List<SectionModel> list, final JSONObject jSONObject, final gkc gkcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4c45f3e", new Object[]{this, str, list, jSONObject, gkcVar});
        } else if (list == null || list.isEmpty() || str == null || TextUtils.isEmpty(str)) {
        } else {
            if (TextUtils.equals(oqc.a().c(str) ? "guess" : "homepage", "homepage")) {
                com.taobao.tao.homepage.f.a().a(list, "homepage", new f.b() { // from class: com.taobao.tao.recommend3.newface.gateway.action.c.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.tao.homepage.f.b
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                            return;
                        }
                        c cVar = c.this;
                        c.a(cVar, jSONObject, gkcVar, str, c.a(cVar).b(str));
                    }
                });
            } else {
                com.taobao.tao.recommend3.a.a().a(list, "guess", new a.b() { // from class: com.taobao.tao.recommend3.newface.gateway.action.c.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.tao.recommend3.a.b
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                            return;
                        }
                        com.taobao.tao.linklog.a.a("cacheProcess", "gateway2.loadCache", "template download completed trigger successfully");
                        c cVar = c.this;
                        c.a(cVar, jSONObject, gkcVar, str, c.a(cVar).b(str));
                    }
                }, str);
            }
        }
    }

    private void a(JSONObject jSONObject, gkc gkcVar, String str, AwesomeGetContainerData awesomeGetContainerData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfbe68df", new Object[]{this, jSONObject, gkcVar, str, awesomeGetContainerData});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("containerModel", (Object) awesomeGetContainerData);
        jSONObject2.put("dataChangeType", "base");
        jSONObject2.put("dataSourceType", (Object) (HomePageUtility.a(awesomeGetContainerData) ? "local" : "remote"));
        jSONObject2.put("containerId", (Object) str);
        opw.a(jSONObject2, opw.a(jSONObject));
        gkcVar.a("success", jSONObject2, null);
    }

    private void a(JSONObject jSONObject, gkc gkcVar, String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a91420a", new Object[]{this, jSONObject, gkcVar, str, new Integer(i), str2});
            return;
        }
        com.taobao.tao.linklog.a.b("cacheProcess", "param_error", "网关2.0缓存处理，加载失败", "gateway2.loadCache", str2);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("containerId", (Object) str);
        jSONObject2.put("errorCode", (Object) Integer.valueOf(i));
        jSONObject2.put("errorMsg", (Object) str2);
        opw.a(jSONObject2, opw.a(jSONObject));
        gkcVar.a("fail", jSONObject2, null);
    }
}
