package tb;

import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.sdk.vmodel.main.c;
import com.taobao.android.editionswitcher.PositionInfo;
import com.taobao.android.editionswitcher.l;
import com.taobao.android.gateway.util.d;
import com.taobao.android.home.component.utils.j;
import com.taobao.android.task.Coordinator;
import com.taobao.homepage.utils.n;
import com.taobao.location.client.TBLocationClient;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.monitor.procedure.s;
import com.taobao.tao.infoflow.commonsubservice.dataservice.HomeInfoFlowDataService;
import com.taobao.tao.recommend3.gateway.model.request.AwesomeGetContainerParams;
import com.taobao.tao.recommend3.gateway.model.request.AwesomeGetRequestParams;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetData;
import com.taobao.tao.recommend3.gateway.request.f;
import com.taobao.themis.kernel.i;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.MethodEnum;

/* loaded from: classes.dex */
public class oqi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public oqj f32289a;
    public ope b;

    /* loaded from: classes.dex */
    public interface a {
        void a();

        void a(JSONObject jSONObject);

        void b(JSONObject jSONObject);
    }

    static {
        kge.a(-1337485469);
    }

    public static /* synthetic */ void a(oqi oqiVar, String[] strArr, JSONObject jSONObject, a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0c331d8", new Object[]{oqiVar, strArr, jSONObject, aVar, str});
        } else {
            oqiVar.a(strArr, jSONObject, aVar, str);
        }
    }

    public oqi(ope opeVar, oqj oqjVar) {
        this.f32289a = oqjVar;
        this.b = opeVar;
    }

    public void a(final JSONObject jSONObject, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66042db4", new Object[]{this, jSONObject, aVar});
            return;
        }
        com.taobao.tao.linklog.a.a("netRequest", "RecmdRequestController", "start action");
        if (b(jSONObject, aVar)) {
            return;
        }
        final String[] i = oqc.a().i(jSONObject);
        final String string = jSONObject.getString(i.CDN_REQUEST_TYPE);
        if (a(aVar, i, string)) {
            return;
        }
        lap.a("MTopRequest", "checkRequest", " requestParams is valid requestType:" + string);
        if (d.a()) {
            if (n.a(string)) {
                a(i, jSONObject, aVar, string);
                return;
            } else {
                Coordinator.execute(new Runnable() { // from class: tb.oqi.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            oqi.a(oqi.this, i, jSONObject, aVar, string);
                        }
                    }
                });
                return;
            }
        }
        a(i, jSONObject, aVar, string);
    }

    private boolean b(JSONObject jSONObject, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9fcecf97", new Object[]{this, jSONObject, aVar})).booleanValue();
        }
        if (jSONObject != null && !jSONObject.isEmpty()) {
            return false;
        }
        com.taobao.tao.linklog.a.b("netRequest", "param_error", "网关2.0网络请求，参数为空", "RecmdRequestController", "requestParam is empty");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("errorMsg", "requestParam is empty ");
        jSONObject2.put("errorCode", (Object) 1);
        aVar.b(jSONObject2);
        lap.a("MTopRequest", "checkRequestParams", "网关2.0网络请求，参数为空");
        return true;
    }

    private boolean a(a aVar, String[] strArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d0034b19", new Object[]{this, aVar, strArr, str})).booleanValue();
        }
        if (strArr != null && !StringUtils.isEmpty(str)) {
            return false;
        }
        com.taobao.tao.linklog.a.b("netRequest", "param_error", "网关2.0网络请求，参数异常", "RecmdRequestController", "containerId or requestType is empty");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorMsg", "containerId or requestType is empty");
        jSONObject.put("errorCode", (Object) 1);
        aVar.b(jSONObject);
        laq.a().a("MTopRequest").b("checkRequest").a("containerId", strArr == null ? "null" : "not null").a(i.CDN_REQUEST_TYPE, str).b();
        return true;
    }

    private void a(String[] strArr, JSONObject jSONObject, a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40d2218f", new Object[]{this, strArr, jSONObject, aVar, str});
            return;
        }
        com.taobao.tao.linklog.a.a("netRequest", "RecmdRequestController", "start action in async thread");
        String string = jSONObject.getString("strategy");
        int intValue = jSONObject.getIntValue("timeout");
        com.taobao.tao.recommend3.gateway.request.a aVar2 = new com.taobao.tao.recommend3.gateway.request.a();
        aVar2.f20911a = intValue;
        aVar2.c = MethodEnum.POST;
        String b = oqc.a().b(strArr);
        if (b == null) {
            return;
        }
        f a2 = this.f32289a.a(str, string, b);
        if (!a2.f20919a) {
            laq.a().b("handleRequest").a("MTopRequest").c("网关2.0网络请求，请求策略拦截.").a(i.CDN_REQUEST_TYPE, str).a("strategyState", a2.b).a("needRun", a2.f20919a ? "true" : "false").b();
            com.taobao.tao.linklog.a.b("netRequest", "process_error", "网关2.0网络请求，请求策略拦截", "RecmdRequestController", "strategyState : " + a2);
            return;
        }
        aVar2.b = a2.b;
        laq.a().a("MTopRequest").b("handleRequest").c("请求策略未拦截.").a(i.CDN_REQUEST_TYPE, str).a("请求策略", a2.b).a("containerId", b).b();
        a(strArr, b, jSONObject, aVar2, aVar);
        com.taobao.tao.linklog.a.a("netRequest", "RecmdRequestController", "end action");
    }

    private void a(String[] strArr, String str, JSONObject jSONObject, com.taobao.tao.recommend3.gateway.request.a aVar, a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d44ac80", new Object[]{this, strArr, str, jSONObject, aVar, aVar2});
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        AwesomeGetRequestParams a2 = a(strArr, jSONObject, aVar);
        com.taobao.tao.linklog.a.a("netRequest", "RecmdRequestController", "createRequestParams: " + (SystemClock.uptimeMillis() - uptimeMillis));
        if (a2 == null) {
            return;
        }
        lap.a("MTopRequest", "doRequest", " 请求参数处理完毕，开始发起真实请求, API:" + a2.API_NAME);
        a(str, a2, aVar, aVar2, (JSONObject) null);
    }

    private AwesomeGetRequestParams a(String[] strArr, JSONObject jSONObject, com.taobao.tao.recommend3.gateway.request.a aVar) {
        AwesomeGetContainerParams a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AwesomeGetRequestParams) ipChange.ipc$dispatch("7bef4e02", new Object[]{this, strArr, jSONObject, aVar});
        }
        AwesomeGetRequestParams awesomeGetRequestParams = new AwesomeGetRequestParams();
        for (String str : strArr) {
            oqa a3 = oqc.a().a(str);
            if (a3 != null && (a2 = a3.a(this.b, jSONObject)) != null) {
                awesomeGetRequestParams.containerParams.put(str, a2);
            }
        }
        String string = jSONObject.getString(i.CDN_REQUEST_TYPE);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        String a4 = a(string, awesomeGetRequestParams, jSONObject);
        if (StringUtils.equals(string, "coldStart")) {
            s.f18233a.d().a("CommonBizParams", Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
        }
        if (!StringUtils.isEmpty(a4)) {
            awesomeGetRequestParams.commonBizParams = a4;
        }
        if (!j.a("delGlobalLBS", true)) {
            String a5 = orc.a();
            if (!StringUtils.isEmpty(a5)) {
                awesomeGetRequestParams.globalLbs = a5;
            }
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("switchVersionRequest");
        if (jSONObject2 != null) {
            awesomeGetRequestParams.switchVersionRequest = jSONObject2;
        }
        TBLocationDTO tBLocationDTO = null;
        if (awesomeGetRequestParams.containerParams.isEmpty()) {
            lap.a("MTopRequest", "handleRequest", "基础参数创建过程中,容器参数为空");
            return null;
        }
        lar.k("utdid");
        awesomeGetRequestParams.userId = com.taobao.homepage.utils.i.a(string);
        awesomeGetRequestParams.nick = com.taobao.homepage.utils.i.b(string);
        awesomeGetRequestParams.utdid = kst.c();
        lar.l("utdid");
        if (com.taobao.tao.homepage.a.a()) {
            tBLocationDTO = TBLocationClient.b();
        }
        if (tBLocationDTO != null) {
            awesomeGetRequestParams.longitude = tBLocationDTO.longitude;
            awesomeGetRequestParams.latitude = tBLocationDTO.latitude;
            awesomeGetRequestParams.countryName = tBLocationDTO.countryName;
            awesomeGetRequestParams.provinceCode = tBLocationDTO.provinceCode;
            awesomeGetRequestParams.provinceName = tBLocationDTO.provinceName;
            awesomeGetRequestParams.cityCode = tBLocationDTO.cityCode;
            awesomeGetRequestParams.cityName = tBLocationDTO.cityName;
            awesomeGetRequestParams.areaCode = tBLocationDTO.areaCode;
            awesomeGetRequestParams.areaName = tBLocationDTO.areaName;
            awesomeGetRequestParams.address = tBLocationDTO.address;
            Long l = tBLocationDTO.timeStamp;
            if (l != null) {
                awesomeGetRequestParams.poiRefreshTime = l.longValue() / 1000;
            }
        }
        awesomeGetRequestParams.edition = a();
        PositionInfo b = l.b(gjv.f28356a);
        if (b != null) {
            awesomeGetRequestParams.countryCode = b.countryCode;
        }
        String b2 = com.taobao.homepage.utils.d.b("Preview", oqn.KEY_PREVIEW_PARAM, false);
        if (!StringUtils.isEmpty(b2)) {
            awesomeGetRequestParams.previewParam = b2;
        }
        if (jSONObject.containsKey("apiName")) {
            awesomeGetRequestParams.API_NAME = jSONObject.getString("apiName");
        }
        if (jSONObject.containsKey("apiVersion")) {
            awesomeGetRequestParams.VERSION = jSONObject.getString("apiVersion");
        }
        laq.a().a("MTopRequest").b("handleRequest").c("基础参数补全完毕.").a("API", awesomeGetRequestParams.API_NAME).a(c.K_API_VERSION, awesomeGetRequestParams.VERSION).a(jiq.TYPE_EDITION_CHANGE, awesomeGetRequestParams.edition).b();
        return awesomeGetRequestParams;
    }

    private void a(String str, AwesomeGetRequestParams awesomeGetRequestParams, com.taobao.tao.recommend3.gateway.request.a aVar, final a aVar2, final JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("553bea37", new Object[]{this, str, awesomeGetRequestParams, aVar, aVar2, jSONObject});
        } else {
            this.f32289a.a(str, awesomeGetRequestParams, aVar, new com.taobao.tao.recommend3.gateway.request.d() { // from class: tb.oqi.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.recommend3.gateway.request.d
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        aVar2.a();
                    }
                }

                @Override // com.taobao.tao.recommend3.gateway.request.d
                public void a(AwesomeGetData awesomeGetData) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("1c6637", new Object[]{this, awesomeGetData});
                        return;
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("dataModel", (Object) awesomeGetData);
                    jSONObject2.put("UIOperation", (Object) jSONObject);
                    jSONObject2.put("isSecondReturn", (Object) Boolean.valueOf(awesomeGetData.isSecondReturn));
                    aVar2.a(jSONObject2);
                }

                @Override // com.taobao.tao.recommend3.gateway.request.d
                public void a(String str2, String str3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str2, str3});
                        return;
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("errorMsg", (Object) str3);
                    jSONObject2.put("errorCode", (Object) str2);
                    aVar2.b(jSONObject2);
                }
            });
        }
    }

    private static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        PositionInfo b = l.b(gjv.f28356a);
        PositionInfo c = l.c(gjv.f28356a);
        HashMap hashMap = new HashMap();
        hashMap.put("countryId", b.countryCode);
        hashMap.put("cityId", b.cityId);
        hashMap.put("countryNumCode", b.countryNumCode);
        hashMap.put("actualLanguageCode", b.actualLanguageCode);
        hashMap.put("currencyCode", b.currencyCode);
        hashMap.put("selectedEditionCode", b.editionCode);
        hashMap.put("realEditionCode", c.editionCode);
        return JSON.toJSONString(hashMap);
    }

    private String a(String str, AwesomeGetRequestParams awesomeGetRequestParams, JSONObject jSONObject) {
        Map<String, String> requestCommonBizParams;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("38192c46", new Object[]{this, str, awesomeGetRequestParams, jSONObject});
        }
        kua a2 = kub.a(ksk.NEW_FACE_CHILD.f30287a, str);
        if (a2 == null) {
            return null;
        }
        JSONObject a3 = new ktw().a(new ktz(a2)).a(new kur(str)).a(new oqh(awesomeGetRequestParams)).a(new oqe()).a(new kuf(awesomeGetRequestParams)).a(new oqf(str)).a((JSONObject) null);
        HomeInfoFlowDataService a4 = com.taobao.tao.infoflow.commonsubservice.dataservice.a.a(ksk.NEW_FACE_CHILD.f30287a);
        if (a4 != null && (requestCommonBizParams = a4.getRequestCommonBizParams(jSONObject)) != null && (jSONObject2 = a3.getJSONObject(ktw.KEY)) != null) {
            jSONObject2.putAll(requestCommonBizParams);
        }
        return a3.getString(ktw.KEY);
    }
}
