package com.taobao.tao.recommend3.gateway.request;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.PositionInfo;
import com.taobao.android.editionswitcher.l;
import com.taobao.android.home.component.utils.j;
import com.taobao.android.task.Coordinator;
import com.taobao.homepage.utils.HomePageUtility;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.location.client.TBLocationClient;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.login4android.api.Login;
import com.taobao.tao.homepage.launcher.g;
import com.taobao.tao.recommend3.gateway.model.request.AwesomeGetContainerParams;
import com.taobao.tao.recommend3.gateway.model.request.AwesomeGetRequestParams;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetData;
import com.taobao.tao.recommend3.gateway.prefetch.tschedule.TSRecmdReqPrefetch;
import com.taobao.taolive.room.utils.aw;
import com.taobao.themis.kernel.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import mtopsdk.mtop.domain.MethodEnum;
import tb.ept;
import tb.gjv;
import tb.jqm;
import tb.kge;
import tb.ksn;
import tb.kso;
import tb.kst;
import tb.ktt;
import tb.ktw;
import tb.ktx;
import tb.ktz;
import tb.kua;
import tb.kub;
import tb.ope;
import tb.oqn;
import tb.orc;
import tb.osp;
import tb.sdg;
import tb.suq;

/* loaded from: classes8.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Integer c;

    /* renamed from: a  reason: collision with root package name */
    public c f20912a;
    public ope b;

    /* loaded from: classes8.dex */
    public interface a {
        void a(JSONObject jSONObject);

        void b(JSONObject jSONObject);
    }

    public static /* synthetic */ void a(b bVar, JSONObject jSONObject, a aVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eac15e23", new Object[]{bVar, jSONObject, aVar, str, str2});
        } else {
            bVar.a(jSONObject, aVar, str, str2);
        }
    }

    static {
        kge.a(808304007);
        c = null;
    }

    public b(ope opeVar, c cVar) {
        this.f20912a = cVar;
        this.b = opeVar;
    }

    public void a(final JSONObject jSONObject, final a aVar) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ebbe1bd", new Object[]{this, jSONObject, aVar});
            return;
        }
        com.taobao.android.home.component.utils.e.c("RecmdRequestController", "start action:", jSONObject.toJSONString());
        com.taobao.tao.linklog.a.a("netRequest", "RecmdRequestController", "start action");
        if (jSONObject == null || jSONObject.isEmpty()) {
            com.taobao.tao.linklog.a.b("netRequest", "param_error", "网关2.0网络请求，参数为空", "RecmdRequestController", "requestParam is empty");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("errorMsg", "requestParam is empty ");
            jSONObject2.put("errorCode", (Object) 1);
            aVar.b(jSONObject2);
            return;
        }
        final String string = jSONObject.getString("containerId");
        final String string2 = jSONObject.getString(i.CDN_REQUEST_TYPE);
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
            com.taobao.tao.linklog.a.b("netRequest", "param_error", "网关2.0网络请求，参数异常", "RecmdRequestController", "containerId or requestType is empty");
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("errorMsg", "containerId or requestType is empty");
            jSONObject3.put("errorCode", (Object) 1);
            aVar.b(jSONObject3);
            return;
        }
        boolean booleanValue = jSONObject.getBooleanValue("isNextPage");
        AwesomeGetContainerData b = this.b.b(string);
        if (b != null) {
            z = b.isLastPage();
        }
        if (booleanValue && z) {
            com.taobao.tao.linklog.a.b("netRequest", "param_error", "网关2.0网络请求，无法请求下一页", "RecmdRequestController", "lastPage can not request next page");
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("errorMsg", "lastPage can not request next page");
            jSONObject4.put("errorCode", (Object) 1);
            aVar.b(jSONObject4);
        } else if (booleanValue && ept.SUB_BIND_VIEW.equals(jSONObject.getString(suq.REFRESH_BROWSER_BADGE_DATA_ARGS_TRIGGER_TYPE)) && b != null && b.getPageNum() == 0 && this.b.g(string) != null && this.b.g(string).size() < 10) {
            com.taobao.tao.linklog.a.b("netRequest", "process_error", "网关2.0网络请求，请求优化拦截", "RecmdRequestController", "optimize request scroll next page is active intercept. index = 0 request is 拦截");
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("errorMsg", "optimize request scroll next page is active intercept.");
            jSONObject5.put("errorCode", (Object) 5);
            aVar.b(jSONObject5);
            if (!jqm.a()) {
                return;
            }
            com.taobao.android.home.component.utils.e.e("jimbo", "index = 0 request is 拦截");
        } else if (booleanValue && "scroll".equals(jSONObject.getString(suq.REFRESH_BROWSER_BADGE_DATA_ARGS_TRIGGER_TYPE)) && ((b != null && b.getPageNum() != 0) || (this.b.g(string) != null && this.b.g(string).size() > 10))) {
            com.taobao.tao.linklog.a.b("netRequest", "process_error", "网关2.0网络请求，请求优化拦截", "RecmdRequestController", "scroll request is not should here, so is active intercept. scroll request is 拦截");
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("errorMsg", "scroll request is not should here, so is active intercept.");
            jSONObject6.put("errorCode", (Object) 5);
            aVar.b(jSONObject6);
            if (!jqm.a()) {
                return;
            }
            com.taobao.android.home.component.utils.e.e("jimbo", "scroll request is 拦截");
        } else if (com.taobao.android.gateway.util.d.a()) {
            Coordinator.execute(new Runnable() { // from class: com.taobao.tao.recommend3.gateway.request.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        b.a(b.this, jSONObject, aVar, string, string2);
                    }
                }
            });
        } else {
            a(jSONObject, aVar, string, string2);
        }
    }

    private ktx a(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ktx) ipChange.ipc$dispatch("cd5068a5", new Object[]{this, jSONObject, str});
        }
        kua a2 = kub.a(str, jSONObject.getString(i.CDN_REQUEST_TYPE));
        if (a2 != null) {
            return new ktz(a2);
        }
        return null;
    }

    private void a(JSONObject jSONObject, a aVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6169bc51", new Object[]{this, jSONObject, aVar, str, str2});
            return;
        }
        com.taobao.android.home.component.utils.e.c("RecmdRequestController", "start action in async thread");
        com.taobao.tao.linklog.a.a("netRequest", "RecmdRequestController", "start action in async thread");
        String string = jSONObject.getString("strategy");
        int intValue = jSONObject.getIntValue("timeout");
        com.taobao.tao.recommend3.gateway.request.a aVar2 = new com.taobao.tao.recommend3.gateway.request.a();
        aVar2.f20911a = intValue;
        aVar2.c = MethodEnum.POST;
        f a2 = this.f20912a.a(str2, string, str);
        if (!a2.f20919a) {
            com.taobao.tao.linklog.a.b("netRequest", "process_error", "网关2.0网络请求，请求策略拦截", "RecmdRequestController", "strategyState : " + a2);
            return;
        }
        aVar2.b = a2.b;
        a(str, jSONObject, aVar2);
        a(jSONObject, aVar2, aVar);
        com.taobao.android.home.component.utils.e.c("RecmdRequestController", "end action");
        com.taobao.tao.linklog.a.a("netRequest", "RecmdRequestController", "end action");
    }

    private void a(String str, JSONObject jSONObject, com.taobao.tao.recommend3.gateway.request.a aVar) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9ba3a05", new Object[]{this, str, jSONObject, aVar});
            return;
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("bizParam");
        if (jSONObject3 == null || (jSONObject2 = jSONObject3.getJSONObject(TSRecmdReqPrefetch.PREFETCH_PARAMS)) == null) {
            return;
        }
        try {
            jSONObject3.remove(TSRecmdReqPrefetch.PREFETCH_PARAMS);
            aVar.d = true;
            aVar.e = jSONObject2.getString("timeout");
            ArrayList arrayList = new ArrayList();
            jSONObject3.put("prefetch", "true");
            arrayList.add("prefetch");
            JSONArray jSONArray = jSONObject2.getJSONArray(TSRecmdReqPrefetch.PREFETCH_PARAMS_IGNORE);
            if (jSONArray != null) {
                Iterator<Object> it = jSONArray.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next != null) {
                        arrayList.add(next.toString());
                    }
                }
            }
            aVar.f = arrayList;
        } catch (Throwable unused) {
        }
    }

    private void a(JSONObject jSONObject, com.taobao.tao.recommend3.gateway.request.a aVar, final a aVar2) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1da6092a", new Object[]{this, jSONObject, aVar, aVar2});
            return;
        }
        com.taobao.tao.linklog.a.a("netRequest", "RecmdRequestController", "start doRequest");
        String string = jSONObject.getString("containerId");
        String string2 = jSONObject.getString("apiName");
        String string3 = jSONObject.getString("apiVersion");
        boolean booleanValue = jSONObject.getBooleanValue("isNextPage");
        if (!jSONObject.getBooleanValue("forceRequest") && !booleanValue) {
            boolean j = this.b.j(string);
            if (!j) {
                try {
                    if (jSONObject.getBooleanValue("checkDeltaExpire")) {
                        boolean i = this.b.i(string);
                        if (!string.startsWith("recommend_home_main_") && !string.startsWith("recommend_home_intl_") && !a(string)) {
                            z = true;
                            j = !j || (z && i);
                        }
                        JSONObject jSONObject2 = jSONObject.getJSONObject("bizParam");
                        z = jSONObject2 != null && !TextUtils.isEmpty(jSONObject2.getString("itemId"));
                        com.taobao.tao.linklog.a.a("netRequest", "RecmdRequestController", "WindVane param check : " + z);
                        if (!j) {
                        }
                    }
                } catch (Throwable unused) {
                }
            }
            if (!j) {
                com.taobao.tao.linklog.a.a("netRequest", "RecmdRequestController", "!isDataExpired return");
                return;
            }
        }
        AwesomeGetRequestParams a2 = a(jSONObject);
        a2.API_NAME = string2;
        a2.VERSION = string3;
        Object obj = jSONObject.get("apiInfo");
        if (obj != null && (obj instanceof ksn)) {
            ksn ksnVar = (ksn) obj;
            a2.API_NAME = ksnVar.a();
            a2.VERSION = ksnVar.b();
        }
        Object obj2 = jSONObject.get(osp.NATIVE_CUSTOM_PARAMS);
        final kso ksoVar = null;
        if (obj2 != null && (obj2 instanceof kso)) {
            ksoVar = (kso) obj2;
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("bizParam");
        if (jSONObject3 != null) {
            jSONObject3.put("hundredClickItemId", (Object) com.taobao.tao.recommend3.util.c.g(string));
            ktt.a(jSONObject3);
            jSONObject3.put("deviceLevel", (Object) g.b());
        }
        com.taobao.android.ai.b.a().a(string, jSONObject3);
        com.taobao.tao.linklog.a.a("netRequest", "RecmdRequestController", "start request containerId : " + string);
        this.f20912a.a(string, a2, aVar, new d() { // from class: com.taobao.tao.recommend3.gateway.request.b.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.recommend3.gateway.request.d
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                }
            }

            @Override // com.taobao.tao.recommend3.gateway.request.d
            public void a(AwesomeGetData awesomeGetData) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1c6637", new Object[]{this, awesomeGetData});
                    return;
                }
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("dataModel", (Object) awesomeGetData);
                kso ksoVar2 = ksoVar;
                if (ksoVar2 != null) {
                    jSONObject4.put(osp.NATIVE_CUSTOM_PARAMS, (Object) ksoVar2);
                }
                aVar2.a(jSONObject4);
            }

            @Override // com.taobao.tao.recommend3.gateway.request.d
            public void a(String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
                    return;
                }
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("errorMsg", (Object) str2);
                jSONObject4.put("errorCode", (Object) str);
                aVar2.b(jSONObject4);
            }
        });
    }

    private boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue() : str.startsWith("recommend_");
    }

    private AwesomeGetRequestParams a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AwesomeGetRequestParams) ipChange.ipc$dispatch("c13712c0", new Object[]{this, jSONObject});
        }
        AwesomeGetRequestParams awesomeGetRequestParams = new AwesomeGetRequestParams();
        awesomeGetRequestParams.userId = Login.getOldUserId();
        awesomeGetRequestParams.nick = Login.getOldNick();
        awesomeGetRequestParams.utdid = kst.c();
        TBLocationDTO b = com.taobao.tao.homepage.a.a() ? TBLocationClient.b() : null;
        if (b != null) {
            awesomeGetRequestParams.longitude = b.longitude;
            awesomeGetRequestParams.latitude = b.latitude;
            awesomeGetRequestParams.countryName = b.countryName;
            awesomeGetRequestParams.provinceCode = b.provinceCode;
            awesomeGetRequestParams.provinceName = b.provinceName;
            awesomeGetRequestParams.cityCode = b.cityCode;
            awesomeGetRequestParams.cityName = b.cityName;
            awesomeGetRequestParams.areaCode = b.areaCode;
            awesomeGetRequestParams.areaName = b.areaName;
            awesomeGetRequestParams.address = b.address;
            Long l = b.timeStamp;
            if (l != null) {
                awesomeGetRequestParams.poiRefreshTime = l.longValue() / 1000;
            }
        }
        String a2 = orc.a();
        if (!TextUtils.isEmpty(a2)) {
            awesomeGetRequestParams.globalLbs = a2;
        }
        awesomeGetRequestParams.edition = a();
        PositionInfo b2 = l.b(gjv.f28356a);
        if (b2 != null) {
            awesomeGetRequestParams.countryCode = b2.countryCode;
        }
        if (jSONObject.getJSONObject("switchVersionRequest") != null) {
            awesomeGetRequestParams.switchVersionRequest = jSONObject.getJSONObject("switchVersionRequest");
        }
        if (jSONObject.containsKey(oqn.KEY_PREVIEW_PARAM)) {
            awesomeGetRequestParams.previewParam = jSONObject.getString(oqn.KEY_PREVIEW_PARAM);
        }
        String string = jSONObject.getString("containerId");
        String b3 = b(jSONObject, string);
        if (!TextUtils.isEmpty(b3)) {
            awesomeGetRequestParams.commonBizParams = b3;
        }
        awesomeGetRequestParams.containerParams.put(string, a(string, jSONObject));
        return awesomeGetRequestParams;
    }

    private String b(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3a29568f", new Object[]{this, jSONObject, str});
        }
        ktw ktwVar = new ktw();
        ktx a2 = a(jSONObject, str);
        if (a2 != null) {
            ktwVar.a(a2);
        }
        ktwVar.a(new sdg());
        return ktwVar.a((JSONObject) null).getString(ktw.KEY);
    }

    private static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        PositionInfo b = l.b(gjv.f28356a);
        HashMap hashMap = new HashMap();
        hashMap.put("countryId", b.countryCode);
        hashMap.put("cityId", b.cityId);
        hashMap.put("countryNumCode", b.countryNumCode);
        hashMap.put("actualLanguageCode", b.actualLanguageCode);
        hashMap.put("currencyCode", b.currencyCode);
        return JSON.toJSONString(hashMap);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0066, code lost:
        if (android.text.TextUtils.equals(r0.requestType, "newInteractive") != false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.taobao.tao.recommend3.gateway.model.request.AwesomeGetContainerParams a(java.lang.String r12, com.alibaba.fastjson.JSONObject r13) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.recommend3.gateway.request.b.a(java.lang.String, com.alibaba.fastjson.JSONObject):com.taobao.tao.recommend3.gateway.model.request.AwesomeGetContainerParams");
    }

    private String b(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str}) : HomePageUtility.a();
    }

    private void a(AwesomeGetContainerParams awesomeGetContainerParams, String str, JSONObject jSONObject) {
        ope opeVar;
        String str2;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dba7df8", new Object[]{this, awesomeGetContainerParams, str, jSONObject});
            return;
        }
        if (c == null) {
            c = Integer.valueOf(j.h());
        }
        if (c.intValue() <= 0 || (opeVar = this.b) == null || opeVar.c(str) == null) {
            return;
        }
        String str3 = awesomeGetContainerParams.requestType;
        List<SectionModel> g = this.b.g(str);
        String str4 = "";
        if (g == null || g.size() <= 0) {
            str2 = str4;
        } else {
            StringBuilder sb = new StringBuilder();
            boolean z = true;
            for (int size = g.size() - 1; size >= 0 && size >= g.size() - c.intValue(); size--) {
                String b = b(g.get(size));
                if (!TextUtils.isEmpty(b)) {
                    if (!z) {
                        sb.append(",");
                    }
                    sb.append(b);
                    z = false;
                }
            }
            str2 = sb.toString();
            if (g != null && g.size() > 0) {
                awesomeGetContainerParams.bizParams.put("firstPagePVID", (Object) a(g, a(g)));
            }
            Integer integer = jSONObject.getInteger("index");
            if (integer != null) {
                while (TextUtils.isEmpty(str4)) {
                    int i2 = i + 1;
                    if (i >= 4 || integer.intValue() <= 0 || integer.intValue() >= g.size() - 1) {
                        break;
                    }
                    str4 = b(g.get(integer.intValue()));
                    integer = Integer.valueOf(integer.intValue() - 1);
                    i = i2;
                }
            }
        }
        if (awesomeGetContainerParams.bizParams == null) {
            return;
        }
        awesomeGetContainerParams.bizParams.put("currentRequestType", (Object) str3);
        awesomeGetContainerParams.bizParams.put("latestHundredItem", (Object) str2);
        awesomeGetContainerParams.bizParams.put("currentExposureItemID", (Object) str4);
    }

    private int a(List<SectionModel> list) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c705294c", new Object[]{this, list})).intValue() : Math.min(8, list.size());
    }

    private String a(List<SectionModel> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d92c6d16", new Object[]{this, list, new Integer(i)});
        }
        String str = "";
        for (int i2 = 0; i2 < i; i2++) {
            JSONObject jSONObject = list.get(i2).getJSONObject("args");
            if (jSONObject != null && (str = jSONObject.getString(aw.PARAM_PVID)) != null) {
                break;
            }
        }
        return str;
    }

    private String b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3f1ccf59", new Object[]{this, jSONObject}) : (jSONObject == null || jSONObject.getJSONObject("item") == null || jSONObject.getJSONObject("item").getJSONObject("0") == null || jSONObject.getJSONObject("item").getJSONObject("0").getJSONObject("clickParam") == null) ? "" : jSONObject.getJSONObject("item").getJSONObject("0").getJSONObject("clickParam").getString("itemId");
    }
}
