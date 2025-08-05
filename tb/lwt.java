package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.PositionInfo;
import com.taobao.android.editionswitcher.b;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.request.AwesomeGetContainerParams;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.request.AwesomeGetRequestParams;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.response.AwesomeGetData;
import com.taobao.informationflowdataservice.dataservice.core.datasource.request.d;
import com.taobao.informationflowdataservice.dataservice.manager.protocol.adapter.core.IAppAdapter;
import com.taobao.informationflowdataservice.dataservice.manager.protocol.adapter.core.c;
import com.taobao.themis.kernel.i;
import java.util.HashMap;
import mtopsdk.mtop.domain.MethodEnum;

/* loaded from: classes7.dex */
public class lwt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private lwu f30954a;
    private lwd b;
    private lwz c;

    /* loaded from: classes7.dex */
    public interface a {
        void a(JSONObject jSONObject);

        void b(JSONObject jSONObject);
    }

    static {
        kge.a(-173275782);
    }

    public static /* synthetic */ void a(lwt lwtVar, String[] strArr, JSONObject jSONObject, a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f0a0154", new Object[]{lwtVar, strArr, jSONObject, aVar, str});
        } else {
            lwtVar.a(strArr, jSONObject, aVar, str);
        }
    }

    public lwt(lwz lwzVar, lwu lwuVar) {
        this.f30954a = lwuVar;
        this.b = lwzVar.b();
        this.c = lwzVar;
    }

    public void a(final JSONObject jSONObject, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e8b5972", new Object[]{this, jSONObject, aVar});
            return;
        }
        com.taobao.informationflowdataservice.dataservice.utils.baseutils.linklog.a.a("netRequest", "RecmdRequestController", "start action");
        if (b(jSONObject, aVar)) {
            return;
        }
        lxl.b("RecmdRequestController", "start action:", jSONObject.toJSONString());
        final String[] a2 = lwi.a(jSONObject);
        final String string = jSONObject.getString(i.CDN_REQUEST_TYPE);
        if (a(aVar, a2, string)) {
            return;
        }
        if (lxp.a()) {
            lxs.a().a(new Runnable() { // from class: tb.lwt.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        lwt.a(lwt.this, a2, jSONObject, aVar, string);
                    }
                }
            });
        } else {
            a(a2, jSONObject, aVar, string);
        }
    }

    private boolean b(JSONObject jSONObject, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b855fb55", new Object[]{this, jSONObject, aVar})).booleanValue();
        }
        if (jSONObject != null && !jSONObject.isEmpty()) {
            return false;
        }
        com.taobao.informationflowdataservice.dataservice.utils.baseutils.linklog.a.b("netRequest", "param_error", "网关2.0网络请求，参数为空", "RecmdRequestController", "requestParam is empty");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("errorMsg", "requestParam is empty ");
        jSONObject2.put("errorCode", (Object) 1);
        aVar.b(jSONObject2);
        return true;
    }

    private boolean a(a aVar, String[] strArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b7b3e1b", new Object[]{this, aVar, strArr, str})).booleanValue();
        }
        if (strArr != null && !TextUtils.isEmpty(str)) {
            return false;
        }
        com.taobao.informationflowdataservice.dataservice.utils.baseutils.linklog.a.b("netRequest", "param_error", "网关2.0网络请求，参数异常", "RecmdRequestController", "containerId or requestType is empty");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorMsg", "containerId or requestType is empty");
        jSONObject.put("errorCode", (Object) 1);
        aVar.b(jSONObject);
        return true;
    }

    private void a(String[] strArr, JSONObject jSONObject, a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("287919cd", new Object[]{this, strArr, jSONObject, aVar, str});
            return;
        }
        lxl.b("RecmdRequestController", "start action in async thread");
        com.taobao.informationflowdataservice.dataservice.utils.baseutils.linklog.a.a("netRequest", "RecmdRequestController", "start action in async thread");
        String string = jSONObject.getString("strategy");
        int intValue = jSONObject.getIntValue("timeout");
        com.taobao.informationflowdataservice.dataservice.core.datasource.request.a aVar2 = new com.taobao.informationflowdataservice.dataservice.core.datasource.request.a();
        aVar2.f17586a = intValue;
        aVar2.c = MethodEnum.POST;
        String a2 = lwi.a(this.c, strArr);
        if (a2 == null) {
            return;
        }
        d a3 = this.f30954a.a(str, string, a2);
        if (!a3.f17587a) {
            com.taobao.informationflowdataservice.dataservice.utils.baseutils.linklog.a.b("netRequest", "process_error", "网关2.0网络请求，请求策略拦截", "RecmdRequestController", "strategyState : " + a3);
            return;
        }
        aVar2.b = a3.b;
        a(strArr, a2, jSONObject, aVar2, aVar);
        lxl.b("RecmdRequestController", "end action");
        com.taobao.informationflowdataservice.dataservice.utils.baseutils.linklog.a.a("netRequest", "RecmdRequestController", "end action");
    }

    private void a(String[] strArr, String str, JSONObject jSONObject, com.taobao.informationflowdataservice.dataservice.core.datasource.request.a aVar, a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6a8f524", new Object[]{this, strArr, str, jSONObject, aVar, aVar2});
            return;
        }
        AwesomeGetRequestParams a2 = a(strArr, jSONObject, aVar);
        if (lxm.b()) {
            lxl.c("RecmdRequestController", JSON.toJSONString(a2));
        }
        if (a2 == null) {
            return;
        }
        a(str, a2, aVar, aVar2);
    }

    private void a(String str, AwesomeGetContainerParams awesomeGetContainerParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2711c98a", new Object[]{this, str, awesomeGetContainerParams});
        } else {
            this.c.c(str);
        }
    }

    private AwesomeGetRequestParams a(String[] strArr, JSONObject jSONObject, com.taobao.informationflowdataservice.dataservice.core.datasource.request.a aVar) {
        com.taobao.informationflowdataservice.dataservice.bizcode.model.a a2;
        AwesomeGetContainerParams a3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AwesomeGetRequestParams) ipChange.ipc$dispatch("7278054e", new Object[]{this, strArr, jSONObject, aVar});
        }
        AwesomeGetRequestParams awesomeGetRequestParams = new AwesomeGetRequestParams();
        for (String str : strArr) {
            lxg a4 = this.c.a(str);
            if (a4 != null && (a3 = a4.a(this.b.a(str), JSON.parseObject(JSON.toJSONString(jSONObject)))) != null) {
                a(str, a3);
                awesomeGetRequestParams.getContainerParams().put(str, a3);
            }
        }
        if (awesomeGetRequestParams.getContainerParams().isEmpty()) {
            return null;
        }
        c b = this.c.a().b();
        IAppAdapter a5 = this.c.a().a();
        awesomeGetRequestParams.setUserId(b.b());
        awesomeGetRequestParams.setNick(b.a());
        awesomeGetRequestParams.setUtdid(a5.getUTDID());
        awesomeGetRequestParams.setEncryptUserId(b.c() == null ? "" : b.c());
        lxx a6 = this.c.a().c().a();
        if (a6 != null) {
            awesomeGetRequestParams.setLongitude(a6.a());
            awesomeGetRequestParams.setLatitude(a6.b());
            awesomeGetRequestParams.setCountryName(a6.f());
            awesomeGetRequestParams.setProvinceCode(a6.c());
            awesomeGetRequestParams.setProvinceName(a6.g());
            awesomeGetRequestParams.setCityCode(a6.d());
            awesomeGetRequestParams.setCityName(a6.h());
            awesomeGetRequestParams.setAreaCode(a6.e());
            awesomeGetRequestParams.setAreaName(a6.i());
            awesomeGetRequestParams.setAddress(a6.j());
            Long valueOf = Long.valueOf(a6.k());
            if (valueOf != null) {
                awesomeGetRequestParams.setPoiRefreshTime(valueOf.longValue() / 1000);
            }
        }
        try {
            awesomeGetRequestParams.setEdition(a());
            PositionInfo b2 = b.b(gjv.f28356a);
            if (b2 != null) {
                awesomeGetRequestParams.setCountryCode(b2.countryCode);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (jSONObject.containsKey(oqn.KEY_PREVIEW_PARAM)) {
            awesomeGetRequestParams.setPreviewParam(jSONObject.getString(oqn.KEY_PREVIEW_PARAM));
        }
        awesomeGetRequestParams.setApiName(jSONObject.getString("apiName"));
        awesomeGetRequestParams.setVersion(jSONObject.getString("apiVersion"));
        Object obj = jSONObject.get("apiInfo");
        if (obj != null && (a2 = a(obj)) != null) {
            awesomeGetRequestParams.setApiName(a2.a());
            awesomeGetRequestParams.setVersion(a2.b());
        }
        return awesomeGetRequestParams;
    }

    private com.taobao.informationflowdataservice.dataservice.bizcode.model.a a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.informationflowdataservice.dataservice.bizcode.model.a) ipChange.ipc$dispatch("2b732c58", new Object[]{this, obj});
        }
        if (obj instanceof com.taobao.informationflowdataservice.dataservice.bizcode.model.a) {
            return (com.taobao.informationflowdataservice.dataservice.bizcode.model.a) obj;
        }
        if (!(obj instanceof JSONObject)) {
            return null;
        }
        JSONObject jSONObject = (JSONObject) obj;
        String string = jSONObject.getString("apiName");
        String string2 = jSONObject.getString("apiVersion");
        if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
            return new com.taobao.informationflowdataservice.dataservice.bizcode.model.a(string, string2);
        }
        return null;
    }

    private void a(String str, AwesomeGetRequestParams awesomeGetRequestParams, com.taobao.informationflowdataservice.dataservice.core.datasource.request.a aVar, final a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2ca1657", new Object[]{this, str, awesomeGetRequestParams, aVar, aVar2});
        } else {
            this.f30954a.a(str, awesomeGetRequestParams, aVar, new com.taobao.informationflowdataservice.dataservice.core.datasource.request.b() { // from class: tb.lwt.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.informationflowdataservice.dataservice.core.datasource.request.b
                public void a(AwesomeGetData awesomeGetData) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4ab53f9d", new Object[]{this, awesomeGetData});
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("dataModel", (Object) awesomeGetData);
                    aVar2.a(jSONObject);
                }

                @Override // com.taobao.informationflowdataservice.dataservice.core.datasource.request.b
                public void a(String str2, String str3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str2, str3});
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("errorMsg", (Object) str3);
                    jSONObject.put("errorCode", (Object) str2);
                    aVar2.b(jSONObject);
                }
            });
        }
    }

    private static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        PositionInfo b = b.b(gjv.f28356a);
        PositionInfo c = b.c(gjv.f28356a);
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
}
