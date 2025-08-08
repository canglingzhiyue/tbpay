package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ai.b;
import com.taobao.android.gateway.exception.GatewayException;
import com.taobao.android.home.component.utils.e;
import com.taobao.android.task.Coordinator;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.realtimerecommend.j;
import com.taobao.tao.homepage.f;
import com.taobao.tao.recommend3.a;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetData;
import com.taobao.tao.recommend3.util.c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public class oot implements gke {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ope f32233a;
    private WeakReference<a> b;

    /* loaded from: classes8.dex */
    public interface a {
        void a(String str);
    }

    static {
        kge.a(2041907338);
        kge.a(1464465151);
    }

    public static /* synthetic */ ope a(oot ootVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ope) ipChange.ipc$dispatch("3384301e", new Object[]{ootVar}) : ootVar.f32233a;
    }

    public static /* synthetic */ void a(oot ootVar, AwesomeGetContainerData awesomeGetContainerData, String str, gkc gkcVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55cf3c19", new Object[]{ootVar, awesomeGetContainerData, str, gkcVar, new Boolean(z)});
        } else {
            ootVar.a(awesomeGetContainerData, str, gkcVar, z);
        }
    }

    public oot(ope opeVar, a aVar) throws GatewayException {
        if (opeVar == null) {
            throw new GatewayException("RecmdDataSource should not be null");
        }
        this.f32233a = opeVar;
        this.b = new WeakReference<>(aVar);
    }

    @Override // tb.gke
    public void a(final JSONObject jSONObject, final gkc gkcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff35999", new Object[]{this, jSONObject, gkcVar});
            return;
        }
        e.c("gateway2.dataProcess", "start action:", jSONObject.getString("containerId"));
        com.taobao.tao.linklog.a.a("dataProcess", "gateway2.dataProcess", "start action:" + jSONObject.getString("containerId"));
        if (opb.b()) {
            Coordinator.execute(new Runnable() { // from class: tb.oot.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        oot.this.b(jSONObject, gkcVar);
                    }
                }
            });
        } else {
            b(jSONObject, gkcVar);
        }
    }

    public void b(JSONObject jSONObject, gkc gkcVar) {
        AwesomeGetData awesomeGetData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c96ae738", new Object[]{this, jSONObject, gkcVar});
            return;
        }
        e.c("gateway2.dataProcess", "start action in async thread");
        com.taobao.tao.linklog.a.a("dataProcess", "gateway2.dataProcess", "start action in async thread");
        if (jSONObject == null) {
            a("actionParam is null", gkcVar);
            return;
        }
        try {
            awesomeGetData = (AwesomeGetData) jSONObject.get("dataModel");
        } catch (Throwable unused) {
            a("process responseData error", gkcVar);
        }
        if (awesomeGetData != null && awesomeGetData.containers != null && !awesomeGetData.containers.isEmpty()) {
            this.f32233a.a(awesomeGetData.currentPageParams);
            this.f32233a.b(awesomeGetData.currentUTParams);
            for (String str : awesomeGetData.containers.keySet()) {
                AwesomeGetContainerData awesomeGetContainerData = awesomeGetData.containers.get(str);
                if (awesomeGetContainerData == null) {
                    a("responseModel不能为空", gkcVar);
                    return;
                }
                kso ksoVar = (kso) jSONObject.get(osp.NATIVE_CUSTOM_PARAMS);
                if (ksoVar != null) {
                    a(str, ksoVar, this.f32233a, awesomeGetContainerData, gkcVar);
                } else {
                    boolean z = awesomeGetContainerData.base != null && awesomeGetContainerData.base.dataChange;
                    boolean z2 = (awesomeGetContainerData.delta == null || !awesomeGetContainerData.delta.dataChange || awesomeGetContainerData.getDeltaData() == null) ? false : true;
                    if (!z && !z2) {
                        a("is not base or delta refresh", gkcVar);
                        return;
                    }
                    AwesomeGetContainerData b = this.f32233a.b(str);
                    if (this.f32233a.f(str) != null) {
                        opb.a(b, awesomeGetContainerData);
                    }
                    a(b, awesomeGetContainerData, str, jSONObject.getJSONObject("bizParam"), gkcVar, jSONObject);
                    String str2 = "";
                    if (str.startsWith("recommend_home")) {
                        str2 = ksk.HOME_MAIN.c;
                    } else {
                        ksk a2 = ksk.a(str);
                        if (a2 != null) {
                            str2 = a2.c;
                        }
                    }
                    if (!StringUtils.isEmpty(str2)) {
                        b.a().a(str2, awesomeGetContainerData);
                    }
                    b.a().f();
                    a(str);
                    oor.a().a(awesomeGetData);
                }
            }
            e.c("gateway2.dataProcess", "end action");
            com.taobao.tao.linklog.a.a("dataProcess", "gateway2.dataProcess", "end action");
            return;
        }
        a("dataModel is empty", gkcVar);
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        a aVar = this.b.get();
        if (aVar == null) {
            return;
        }
        aVar.a(str);
    }

    private void a(AwesomeGetContainerData awesomeGetContainerData, AwesomeGetContainerData awesomeGetContainerData2, String str, JSONObject jSONObject, gkc gkcVar, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a31a23b9", new Object[]{this, awesomeGetContainerData, awesomeGetContainerData2, str, jSONObject, gkcVar, jSONObject2});
            return;
        }
        com.taobao.tao.linklog.a.a("dataProcess", "gateway2.dataProcess", "start mergeDelta containerId : " + str);
        boolean z2 = awesomeGetContainerData2.base != null && awesomeGetContainerData2.base.dataChange;
        boolean z3 = awesomeGetContainerData2.delta != null && awesomeGetContainerData2.delta.dataChange;
        if (z2) {
            if (awesomeGetContainerData.getBaseData() != null && awesomeGetContainerData2.getPageNum() > 0) {
                awesomeGetContainerData2.base.sections.addAll(0, awesomeGetContainerData.getBaseData());
            }
            awesomeGetContainerData2.totalSectionList = opb.a(str, awesomeGetContainerData2, awesomeGetContainerData);
        } else if (z3 && awesomeGetContainerData != null && awesomeGetContainerData.getBaseData() != null) {
            awesomeGetContainerData2.base = awesomeGetContainerData.base;
            awesomeGetContainerData2.totalSectionList = opb.a(str, awesomeGetContainerData2, awesomeGetContainerData);
        }
        this.f32233a.a(str, awesomeGetContainerData2.base, jSONObject != null && jSONObject.getBooleanValue("forbiddenCache"));
        this.f32233a.a(str, awesomeGetContainerData2.delta, opb.a(awesomeGetContainerData2));
        this.f32233a.a(str, awesomeGetContainerData2.getTotalData());
        ksk a2 = ksk.a(str);
        if (a2 != null && kst.a(a2.b) && !c.a(awesomeGetContainerData2)) {
            z = true;
        }
        List<SectionModel> totalData = awesomeGetContainerData2.getTotalData();
        if (awesomeGetContainerData2.supportInsertSections()) {
            ArrayList arrayList = new ArrayList(totalData);
            arrayList.addAll(awesomeGetContainerData2.getInsertSections());
            totalData = arrayList;
        }
        a(str, totalData, gkcVar, z);
        String str2 = z3 ? "delta" : "base";
        a(this.f32233a.b(str), str2, gkcVar);
        if (z2) {
            j.a(str, jSONObject2);
        }
        com.taobao.tao.linklog.a.a("dataProcess", "gateway2.dataProcess", "end mergeDelta, dataChangeType : " + str2);
    }

    private void a(String str, gkc gkcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a546043", new Object[]{this, str, gkcVar});
        } else if (gkcVar == null) {
        } else {
            com.taobao.tao.linklog.a.b("dataProcess", "param_error", "网关2.0数据处理，参数异常", "gateway2.dataProcess", str);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("errorCode", (Object) 1);
            jSONObject.put("errorMsg", (Object) str);
            gkcVar.a("finish", jSONObject, null);
        }
    }

    private void a(AwesomeGetContainerData awesomeGetContainerData, String str, gkc gkcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de7ebcbf", new Object[]{this, awesomeGetContainerData, str, gkcVar});
            return;
        }
        com.taobao.tao.linklog.a.a("dataProcess", "gateway2.dataProcess", "data processing completed trigger successfully");
        a(awesomeGetContainerData, str, gkcVar, false);
    }

    private void a(AwesomeGetContainerData awesomeGetContainerData, String str, gkc gkcVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1598df5", new Object[]{this, awesomeGetContainerData, str, gkcVar, new Boolean(z)});
        } else if (gkcVar == null) {
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("containerModel", (Object) awesomeGetContainerData);
            jSONObject.put("dataChangeType", (Object) str);
            jSONObject.put("dataSourceType", (Object) (z ? "download" : "remote"));
            gkcVar.a("finish", jSONObject, null);
        }
    }

    public void a(final String str, List<SectionModel> list, final gkc gkcVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed3cf120", new Object[]{this, str, list, gkcVar, new Boolean(z)});
        } else if (list == null || list.isEmpty() || str == null || StringUtils.isEmpty(str)) {
        } else {
            if (StringUtils.equals(str.startsWith("recommend_") ? "guess" : "homepage", "homepage")) {
                f.a().a(list, "homepage", new f.b() { // from class: tb.oot.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.tao.homepage.f.b
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                            return;
                        }
                        oot ootVar = oot.this;
                        oot.a(ootVar, oot.a(ootVar).b(str), "base", gkcVar, true);
                    }
                });
            } else {
                com.taobao.tao.recommend3.a.a().a(list, "guess", z, new a.b() { // from class: tb.oot.3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.tao.recommend3.a.b
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                            return;
                        }
                        oot ootVar = oot.this;
                        oot.a(ootVar, oot.a(ootVar).b(str), "base", gkcVar, true);
                        com.taobao.tao.linklog.a.a("dataProcess", "gateway2.dataProcess", "template download completed trigger successfully");
                    }
                }, str);
            }
        }
    }

    private void a(String str, kso ksoVar, ope opeVar, AwesomeGetContainerData awesomeGetContainerData, gkc gkcVar) {
        List<SectionModel> baseData;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd4e7154", new Object[]{this, str, ksoVar, opeVar, awesomeGetContainerData, gkcVar});
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
        awesomeGetContainerData.base.sections = arrayList;
        if (awesomeGetContainerData.delta != null && awesomeGetContainerData.delta.sections != null) {
            awesomeGetContainerData.delta.sections = new ArrayList();
        }
        awesomeGetContainerData.totalSectionList = opb.a(str, awesomeGetContainerData, (AwesomeGetContainerData) null);
        opeVar.a(str, awesomeGetContainerData.base);
        opeVar.a(str, awesomeGetContainerData.delta, opb.a(awesomeGetContainerData));
        opeVar.a(str, awesomeGetContainerData.getTotalData());
        ksk a2 = ksk.a(str);
        if (a2 != null && kst.a(a2.b) && !c.a(awesomeGetContainerData)) {
            z = true;
        }
        a(str, awesomeGetContainerData.getTotalData(), gkcVar, z);
        a(opeVar.b(str), "base", gkcVar);
        com.taobao.tao.linklog.a.a("dataProcess", "gateway2.dataProcess", "end mergeUpdateData, dataChangeType : base");
    }
}
