package com.taobao.tao.recommend3.newface.gateway.action;

import android.content.Context;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.security.faceauth.api.AntDetector;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.gateway.exception.GatewayException;
import com.taobao.android.task.Coordinator;
import com.taobao.homepage.utils.m;
import com.taobao.homepage.utils.n;
import com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.tao.homepage.f;
import com.taobao.tao.recommend3.a;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerInnerData;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.bga;
import tb.gkc;
import tb.gke;
import tb.kge;
import tb.ksm;
import tb.kso;
import tb.ksr;
import tb.lar;
import tb.opb;
import tb.ope;
import tb.opw;
import tb.oqa;
import tb.oqb;
import tb.oqc;
import tb.oqd;
import tb.ora;

/* loaded from: classes.dex */
public class NewFaceDataProcessAction implements gke {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ope f20920a;
    private String b;
    private long c;

    /* loaded from: classes8.dex */
    public static class RefreshModel implements Serializable {
        public String containerId;
        public String dataChangeType;

        static {
            kge.a(-1325537584);
            kge.a(1028243835);
        }

        public RefreshModel(String str, String str2) {
            this.containerId = str;
            this.dataChangeType = str2;
        }
    }

    static {
        kge.a(1358302146);
        kge.a(1464465151);
    }

    public static /* synthetic */ ope a(NewFaceDataProcessAction newFaceDataProcessAction) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ope) ipChange.ipc$dispatch("c470cc6b", new Object[]{newFaceDataProcessAction}) : newFaceDataProcessAction.f20920a;
    }

    public static /* synthetic */ void a(NewFaceDataProcessAction newFaceDataProcessAction, String str, AwesomeGetContainerData awesomeGetContainerData, String str2, gkc gkcVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bddae7dc", new Object[]{newFaceDataProcessAction, str, awesomeGetContainerData, str2, gkcVar, new Boolean(z)});
        } else {
            newFaceDataProcessAction.a(str, awesomeGetContainerData, str2, gkcVar, z);
        }
    }

    public static /* synthetic */ void a(NewFaceDataProcessAction newFaceDataProcessAction, String str, AwesomeGetContainerData awesomeGetContainerData, String str2, gkc gkcVar, boolean z, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8558be94", new Object[]{newFaceDataProcessAction, str, awesomeGetContainerData, str2, gkcVar, new Boolean(z), jSONObject});
        } else {
            newFaceDataProcessAction.a(str, awesomeGetContainerData, str2, gkcVar, z, jSONObject);
        }
    }

    public NewFaceDataProcessAction(ope opeVar) throws GatewayException {
        if (opeVar == null) {
            throw new GatewayException("RecmdDataSource should not be null");
        }
        this.f20920a = opeVar;
    }

    @Override // tb.gke
    public void a(final JSONObject jSONObject, final gkc gkcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff35999", new Object[]{this, jSONObject, gkcVar});
            return;
        }
        lar.g("NewFaceDataProcessAction");
        this.b = jSONObject.getString(com.taobao.themis.kernel.i.CDN_REQUEST_TYPE);
        this.c = SystemClock.uptimeMillis();
        if (opb.b()) {
            Coordinator.execute(new Runnable() { // from class: com.taobao.tao.recommend3.newface.gateway.action.NewFaceDataProcessAction.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    lar.g("NewFaceDataProcessAction_executeAction1");
                    NewFaceDataProcessAction.this.b(jSONObject, gkcVar);
                    lar.h("NewFaceDataProcessAction_executeAction1");
                }
            });
        } else {
            lar.g("NewFaceDataProcessAction_executeAction2");
            b(jSONObject, gkcVar);
            lar.h("NewFaceDataProcessAction_executeAction2");
        }
        lar.h("NewFaceDataProcessAction");
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:135:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(final com.alibaba.fastjson.JSONObject r26, final tb.gkc r27) {
        /*
            Method dump skipped, instructions count: 732
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.recommend3.newface.gateway.action.NewFaceDataProcessAction.b(com.alibaba.fastjson.JSONObject, tb.gkc):void");
    }

    private void a(String str, boolean z) {
        boolean z2;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{this, str, new Boolean(z)});
            return;
        }
        boolean z3 = !com.taobao.homepage.utils.i.c(str);
        if (z) {
            str2 = "dataParse2";
            z2 = true;
        } else {
            z2 = z3;
            str2 = "dataParse";
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        oqd.a(this.b, str2, uptimeMillis, uptimeMillis - this.c, null, z2);
    }

    private void a(Context context, final AwesomeGetContainerData awesomeGetContainerData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66cd0ddc", new Object[]{this, context, awesomeGetContainerData});
        } else if (context == null || awesomeGetContainerData == null) {
        } else {
            Coordinator.execute(new com.taobao.tao.recommend3.tracelog.e() { // from class: com.taobao.tao.recommend3.newface.gateway.action.NewFaceDataProcessAction.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.recommend3.tracelog.e
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    JSONObject ext = awesomeGetContainerData.getExt();
                    JSONArray jSONArray = null;
                    JSONObject jSONObject = ext == null ? null : ext.getJSONObject(AntDetector.EXT_KEY_AB_TEST);
                    if (jSONObject != null) {
                        jSONArray = jSONObject.getJSONArray("track_data");
                    }
                    if (jSONArray == null || jSONArray.isEmpty()) {
                        return;
                    }
                    Iterator<Object> it = jSONArray.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (next instanceof JSONObject) {
                            JSONObject jSONObject2 = (JSONObject) next;
                            String string = jSONObject2.getString("experimentId");
                            String string2 = jSONObject2.getString("bucketId");
                            String string3 = jSONObject2.getString("publishId");
                            if (!StringUtils.isEmpty(string) && !StringUtils.isEmpty(string2) && !StringUtils.isEmpty(string3)) {
                                bga.c.a("homepage", string, string2, string3);
                            }
                        }
                    }
                }
            });
        }
    }

    private void a(AwesomeGetContainerData awesomeGetContainerData, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("682edb8c", new Object[]{this, awesomeGetContainerData, jSONObject});
            return;
        }
        String str = StringUtils.equals("coldStart", jSONObject.getString(com.taobao.themis.kernel.i.CDN_REQUEST_TYPE)) ? "2" : "0";
        this.f20920a.a(awesomeGetContainerData.base, str);
        this.f20920a.a(awesomeGetContainerData.delta, str);
    }

    private void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
            return;
        }
        oqa a2 = oqc.a().a(str);
        if (a2 == null) {
            return;
        }
        a2.b(jSONObject);
    }

    private void a(String str, JSONObject jSONObject, ope opeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2ea684a", new Object[]{this, str, jSONObject, opeVar});
            return;
        }
        oqa a2 = oqc.a().a(str);
        if (a2 == null) {
            return;
        }
        a2.c(opeVar, jSONObject);
    }

    private void a(AwesomeGetContainerData awesomeGetContainerData, AwesomeGetContainerData awesomeGetContainerData2, String str, JSONObject jSONObject, gkc gkcVar, List<RefreshModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cfaf508", new Object[]{this, awesomeGetContainerData, awesomeGetContainerData2, str, jSONObject, gkcVar, list});
            return;
        }
        com.taobao.tao.linklog.a.a("dataProcess", "NewFaceDataProcessAction", "start mergeDelta containerId : " + str);
        boolean z = awesomeGetContainerData2.base != null && awesomeGetContainerData2.base.dataChange;
        boolean z2 = awesomeGetContainerData2.delta != null && awesomeGetContainerData2.delta.dataChange;
        boolean E = n.n().E();
        if (E) {
            c(str, awesomeGetContainerData2, gkcVar);
        }
        if (z) {
            List<SectionModel> list2 = null;
            List<SectionModel> baseData = awesomeGetContainerData.getBaseData();
            boolean z3 = baseData != null && awesomeGetContainerData2.getPageNum() > 0;
            if (z3) {
                if (awesomeGetContainerData2.getBaseData() != null) {
                    list2 = new ArrayList<>(awesomeGetContainerData2.getBaseData());
                }
                awesomeGetContainerData2.base.sections.addAll(0, baseData);
                awesomeGetContainerData2.base.homePagePopDatas = awesomeGetContainerData.base.homePagePopDatas;
                a(awesomeGetContainerData, awesomeGetContainerData2);
            }
            if (awesomeGetContainerData2.base != null && awesomeGetContainerData.base != null) {
                awesomeGetContainerData2.base.isFirstPage = !z3;
                awesomeGetContainerData2.base.infoFlowCardStartBizCode = awesomeGetContainerData.base.infoFlowCardStartBizCode;
                awesomeGetContainerData2.base.infoFlowCardStartOffset = awesomeGetContainerData.base.infoFlowCardStartOffset;
                awesomeGetContainerData2.base.infoFlowCardPopBizCode = awesomeGetContainerData.base.infoFlowCardPopBizCode;
                if (awesomeGetContainerData2.base.extSections == null || awesomeGetContainerData2.base.extSections.isEmpty()) {
                    awesomeGetContainerData2.base.extSections = awesomeGetContainerData.base.extSections;
                }
            }
            a(str, awesomeGetContainerData2);
            awesomeGetContainerData2.totalSectionList = opb.a(str, awesomeGetContainerData2, awesomeGetContainerData);
            if (!z3) {
                list2 = awesomeGetContainerData2.getTotalData();
            }
            String string = jSONObject.getString(com.taobao.themis.kernel.i.CDN_REQUEST_TYPE);
            com.taobao.android.home.component.utils.e.e(m.TAG, "mergeDelta preloadCards ： " + str + " ,requestType = " + string);
            m.a(str, list2, string, awesomeGetContainerData2.getPageNum());
        } else if (z2) {
            a(awesomeGetContainerData, awesomeGetContainerData2, str);
        }
        this.f20920a.a(str, awesomeGetContainerData2.base);
        this.f20920a.a(str, awesomeGetContainerData2.delta, opb.a(awesomeGetContainerData2));
        this.f20920a.a(str, awesomeGetContainerData2.getTotalData());
        String str2 = "delta";
        if (!n.o() ? !z2 : z) {
            str2 = "base";
        }
        jSONObject.put("dataChangeType", (Object) str2);
        a(str, jSONObject, this.f20920a);
        if (!E) {
            a(str, awesomeGetContainerData2.getTotalData(), gkcVar);
        }
        ora.a(awesomeGetContainerData2.getExt());
        if (!n.o()) {
            a(str, this.f20920a.b(str), str2, gkcVar, false, jSONObject);
        } else {
            list.add(new RefreshModel(str, str2));
        }
        com.taobao.tao.linklog.a.a("dataProcess", "NewFaceDataProcessAction", "end mergeDelta, dataChangeType : " + str2);
    }

    private void a(AwesomeGetContainerData awesomeGetContainerData, AwesomeGetContainerData awesomeGetContainerData2, String str) {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9e322a", new Object[]{this, awesomeGetContainerData, awesomeGetContainerData2, str});
            return;
        }
        if (awesomeGetContainerData2.delta.ext != null && awesomeGetContainerData != null && awesomeGetContainerData.base != null && (string = awesomeGetContainerData2.delta.ext.getString("feedsStartSectionBizCode")) != null && !string.equals(awesomeGetContainerData.base.infoFlowCardStartBizCode)) {
            awesomeGetContainerData.base.infoFlowCardStartBizCode = string;
            if (awesomeGetContainerData.base.ext != null) {
                awesomeGetContainerData.base.ext.put("feedsStartSectionBizCode", (Object) string);
            }
        }
        if (awesomeGetContainerData != null && awesomeGetContainerData.getBaseData() != null) {
            awesomeGetContainerData2.base = awesomeGetContainerData.base;
            awesomeGetContainerData2.totalSectionList = opb.a(str, awesomeGetContainerData2, awesomeGetContainerData);
            awesomeGetContainerData2.base.sections = awesomeGetContainerData2.totalSectionList;
        }
        b(str, awesomeGetContainerData2);
    }

    private void a(String str, AwesomeGetContainerData awesomeGetContainerData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfc8472e", new Object[]{this, str, awesomeGetContainerData});
        } else if (awesomeGetContainerData != null && a(awesomeGetContainerData.base)) {
            oqb.a(str, awesomeGetContainerData.base.passParams);
        } else if (awesomeGetContainerData == null || awesomeGetContainerData.base == null) {
        } else {
            awesomeGetContainerData.base.passParams = oqb.a(str);
        }
    }

    private void b(String str, AwesomeGetContainerData awesomeGetContainerData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef7f7b2f", new Object[]{this, str, awesomeGetContainerData});
        } else if (awesomeGetContainerData == null) {
        } else {
            JSONObject a2 = oqb.a(str);
            if (a(awesomeGetContainerData.delta)) {
                JSONObject jSONObject = awesomeGetContainerData.delta.passParams;
                if (a2 == null) {
                    a2 = jSONObject;
                } else if (jSONObject != null && !jSONObject.isEmpty()) {
                    a2.putAll(jSONObject);
                }
                oqb.a(str, a2);
            }
            if (awesomeGetContainerData.base == null) {
                return;
            }
            awesomeGetContainerData.base.passParams = a2;
        }
    }

    private boolean a(AwesomeGetContainerInnerData awesomeGetContainerInnerData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("77c49a66", new Object[]{this, awesomeGetContainerInnerData})).booleanValue();
        }
        if (awesomeGetContainerInnerData != null && awesomeGetContainerInnerData.ext != null) {
            return awesomeGetContainerInnerData.ext.getBooleanValue("updatePassParams");
        }
        return false;
    }

    private void a(String str, String str2, JSONObject jSONObject, gkc gkcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c497f05", new Object[]{this, str, str2, jSONObject, gkcVar});
        } else if (gkcVar == null) {
        } else {
            com.taobao.tao.linklog.a.b("dataProcess", "param_error", "网关2.0数据处理，参数异常", "NewFaceDataProcessAction", str2);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("containerId", (Object) str);
            jSONObject2.put("errorCode", (Object) 1);
            jSONObject2.put("errorMsg", (Object) str2);
            if (jSONObject != null && jSONObject.containsKey("isSecondReturn")) {
                jSONObject2.put("isSecondReturn", jSONObject.get("isSecondReturn"));
            }
            opw.a(jSONObject2, opw.a(jSONObject));
            gkcVar.a("finish", jSONObject2, null);
            ksr.b("dataProcess", "1.0", "param_error", str2, "containerId", str);
        }
    }

    private void a(String str, AwesomeGetContainerData awesomeGetContainerData, String str2, gkc gkcVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6eff46b", new Object[]{this, str, awesomeGetContainerData, str2, gkcVar, new Boolean(z)});
        } else {
            a(str, awesomeGetContainerData, str2, gkcVar, z, (JSONObject) null);
        }
    }

    private void a(String str, AwesomeGetContainerData awesomeGetContainerData, String str2, gkc gkcVar, boolean z, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14d3bfe5", new Object[]{this, str, awesomeGetContainerData, str2, gkcVar, new Boolean(z), jSONObject});
        } else if (gkcVar == null) {
        } else {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("containerId", (Object) str);
            jSONObject2.put("containerModel", (Object) awesomeGetContainerData);
            jSONObject2.put("dataChangeType", (Object) str2);
            jSONObject2.put("dataSourceType", (Object) (z ? "download" : "remote"));
            if (jSONObject != null) {
                jSONObject2.put("scrollPosition", jSONObject.get("scrollPosition"));
                jSONObject2.put("UIOperation", jSONObject.get("UIOperation"));
                if (jSONObject.containsKey("isSecondReturn")) {
                    jSONObject2.put("isSecondReturn", jSONObject.get("isSecondReturn"));
                }
            }
            opw.a(jSONObject2, opw.a(jSONObject));
            gkcVar.a("finish", jSONObject2, null);
        }
    }

    public void a(final String str, List<SectionModel> list, final gkc gkcVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed3cf120", new Object[]{this, str, list, gkcVar, new Boolean(z)});
        } else if (list == null || list.isEmpty() || str == null || StringUtils.isEmpty(str)) {
        } else {
            if (StringUtils.equals(oqc.a().c(str) ? "guess" : "homepage", "homepage")) {
                com.taobao.tao.homepage.f.a().a(list, "homepage", new f.b() { // from class: com.taobao.tao.recommend3.newface.gateway.action.NewFaceDataProcessAction.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.tao.homepage.f.b
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                            return;
                        }
                        NewFaceDataProcessAction newFaceDataProcessAction = NewFaceDataProcessAction.this;
                        NewFaceDataProcessAction.a(newFaceDataProcessAction, str, NewFaceDataProcessAction.a(newFaceDataProcessAction).b(str), "base", gkcVar, true);
                    }
                });
            } else {
                com.taobao.tao.recommend3.a.a().a(list, "guess", z, new a.b() { // from class: com.taobao.tao.recommend3.newface.gateway.action.NewFaceDataProcessAction.6
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.tao.recommend3.a.b
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                            return;
                        }
                        NewFaceDataProcessAction newFaceDataProcessAction = NewFaceDataProcessAction.this;
                        NewFaceDataProcessAction.a(newFaceDataProcessAction, str, NewFaceDataProcessAction.a(newFaceDataProcessAction).b(str), "base", gkcVar, true);
                        com.taobao.tao.linklog.a.a("dataProcess", "NewFaceDataProcessAction", "template download completed trigger successfully");
                    }
                }, str);
            }
        }
    }

    private void a(String str, kso ksoVar, ope opeVar, AwesomeGetContainerData awesomeGetContainerData, gkc gkcVar, JSONObject jSONObject, List<RefreshModel> list) {
        List<SectionModel> baseData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8799190d", new Object[]{this, str, ksoVar, opeVar, awesomeGetContainerData, gkcVar, jSONObject, list});
            return;
        }
        List<SectionModel> g = opeVar.g(str);
        if (g == null || g.isEmpty() || awesomeGetContainerData == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(g);
        if (!ksm.a(arrayList, ksoVar) || (baseData = awesomeGetContainerData.getBaseData()) == null || baseData.size() == 0) {
            return;
        }
        int i = ksoVar.f30290a;
        int i2 = ksoVar.b;
        if (i2 == -1) {
            i2 = arrayList.size() - 1;
        }
        while (i2 >= i) {
            arrayList.remove(i2);
            i2--;
        }
        arrayList.addAll(i, baseData);
        String string = jSONObject.getString(com.taobao.themis.kernel.i.CDN_REQUEST_TYPE);
        com.taobao.android.home.component.utils.e.e(m.TAG, "mergeUpdateData preloadCards ： " + str + " ,requestType = " + string);
        m.a(str, awesomeGetContainerData.getBaseData(), string, awesomeGetContainerData.getPageNum());
        awesomeGetContainerData.base.sections = arrayList;
        if (awesomeGetContainerData.delta != null && awesomeGetContainerData.delta.sections != null) {
            awesomeGetContainerData.delta.sections = new ArrayList();
        }
        awesomeGetContainerData.totalSectionList = opb.a(str, awesomeGetContainerData, (AwesomeGetContainerData) null);
        opeVar.a(false, str, awesomeGetContainerData.base, 2);
        opeVar.a(str, awesomeGetContainerData.delta, opb.a(awesomeGetContainerData));
        opeVar.a(str, awesomeGetContainerData.getTotalData());
        a(str, awesomeGetContainerData.getTotalData(), gkcVar);
        if (!n.o()) {
            a(str, opeVar.b(str), "base", gkcVar, false, jSONObject);
        } else {
            list.add(new RefreshModel(str, "base"));
        }
        com.taobao.tao.linklog.a.a("dataProcess", "NewFaceDataProcessAction", "end mergeUpdateData, dataChangeType : base");
    }

    private void a(String str, List<SectionModel> list, gkc gkcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de5cc834", new Object[]{this, str, list, gkcVar});
        } else if (b(str, list, gkcVar)) {
        } else {
            a(str, list, gkcVar, false);
        }
    }

    private void c(final String str, AwesomeGetContainerData awesomeGetContainerData, final gkc gkcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1448e541", new Object[]{this, str, awesomeGetContainerData, gkcVar});
            return;
        }
        oqa a2 = oqc.a().a(str);
        if (a2 == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        List<SectionModel> baseData = awesomeGetContainerData.getBaseData();
        List<SectionModel> deltaData = awesomeGetContainerData.getDeltaData();
        if (baseData != null && !baseData.isEmpty()) {
            arrayList.addAll(baseData);
        }
        if (deltaData != null && !deltaData.isEmpty()) {
            arrayList.addAll(deltaData);
        }
        if (arrayList.isEmpty() || a2.a(arrayList, new IDxItemRenderService.b() { // from class: com.taobao.tao.recommend3.newface.gateway.action.NewFaceDataProcessAction.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService.b
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                NewFaceDataProcessAction newFaceDataProcessAction = NewFaceDataProcessAction.this;
                NewFaceDataProcessAction.a(newFaceDataProcessAction, str, NewFaceDataProcessAction.a(newFaceDataProcessAction).b(str), "base", gkcVar, true);
                com.taobao.tao.linklog.a.a("dataProcess", "NewFaceDataProcessAction", "template download completed trigger successfully");
            }
        })) {
            return;
        }
        a(str, arrayList, gkcVar);
    }

    private boolean b(final String str, List<SectionModel> list, final gkc gkcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("53d6ee79", new Object[]{this, str, list, gkcVar})).booleanValue();
        }
        oqa a2 = oqc.a().a(str);
        if (a2 != null) {
            return a2.a(list, new IDxItemRenderService.b() { // from class: com.taobao.tao.recommend3.newface.gateway.action.NewFaceDataProcessAction.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService.b
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    NewFaceDataProcessAction newFaceDataProcessAction = NewFaceDataProcessAction.this;
                    NewFaceDataProcessAction.a(newFaceDataProcessAction, str, NewFaceDataProcessAction.a(newFaceDataProcessAction).b(str), "base", gkcVar, true);
                    com.taobao.tao.linklog.a.a("dataProcess", "NewFaceDataProcessAction", "template download completed trigger successfully");
                }
            });
        }
        return false;
    }

    private void a(AwesomeGetContainerData awesomeGetContainerData, AwesomeGetContainerData awesomeGetContainerData2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("804c6060", new Object[]{this, awesomeGetContainerData, awesomeGetContainerData2});
            return;
        }
        JSONObject ext = awesomeGetContainerData.getExt();
        if (ext == null) {
            return;
        }
        JSONObject jSONObject = ext.getJSONObject("popContainerConfig");
        JSONObject ext2 = awesomeGetContainerData2.getExt();
        if (ext2 == null) {
            ext2 = new JSONObject();
        }
        ext2.put("popContainerConfig", (Object) jSONObject);
    }
}
