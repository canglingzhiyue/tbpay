package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.phone.wallet.spmtracker.Constant;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.b;
import com.taobao.android.home.component.utils.e;
import com.taobao.android.home.component.utils.j;
import com.taobao.android.speed.TBSpeed;
import com.taobao.homepage.utils.d;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.tao.common.ucp.UcpManager;
import com.taobao.tao.homepage.launcher.g;
import com.taobao.tao.linklog.a;
import com.taobao.tao.recommend3.gateway.model.request.AwesomeGetContainerParams;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetPageData;
import com.taobao.tao.recommend3.util.c;
import com.taobao.taolive.room.utils.aw;
import com.taobao.themis.kernel.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import mtopsdk.mtop.global.SDKUtils;

/* loaded from: classes.dex */
public abstract class oqt {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static Integer c;

    /* renamed from: a  reason: collision with root package name */
    public String f32311a;
    private HashSet<String> b = new HashSet<>();

    public abstract boolean a();

    static {
        kge.a(-1751273640);
        c = null;
    }

    public oqt(String str) {
        this.f32311a = str;
        b();
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.b.add("pullRefresh");
        this.b.add("coldStart");
        this.b.add(b.REFRESH_SOURCE_HOT_START);
        this.b.add(Constant.KEY_PAGEBACK);
        this.b.add("editionSwitch");
        this.b.add("pageEnter");
    }

    public boolean a(ope opeVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("78a1b3c0", new Object[]{this, opeVar, jSONObject})).booleanValue();
        }
        if (jSONObject == null) {
            return true;
        }
        boolean booleanValue = jSONObject.getBooleanValue("isNextPage");
        AwesomeGetContainerData b = opeVar.b(this.f32311a);
        boolean isLastPage = b == null ? false : b.isLastPage();
        if (booleanValue && isLastPage) {
            a.b("netRequest", "param_error", "网关2.0网络请求，无法请求下一页", "SubContainerParamsUtils", "lastPage can not request next page");
            return true;
        } else if (booleanValue && ept.SUB_BIND_VIEW.equals(jSONObject.getString(suq.REFRESH_BROWSER_BADGE_DATA_ARGS_TRIGGER_TYPE)) && b != null && b.getPageNum() == 0 && opeVar.g(this.f32311a) != null && opeVar.g(this.f32311a).size() < 10) {
            a.b("netRequest", "process_error", "网关2.0网络请求，请求优化拦截", "SubContainerParamsUtils", "optimize request scroll next page is active intercept. index = 0 request is 拦截");
            if (jqm.a()) {
                e.e("jimbo", "index = 0 request is 拦截");
            }
            return true;
        } else if (!booleanValue || !"scroll".equals(jSONObject.getString(suq.REFRESH_BROWSER_BADGE_DATA_ARGS_TRIGGER_TYPE)) || ((b == null || b.getPageNum() == 0) && (opeVar.g(this.f32311a) == null || opeVar.g(this.f32311a).size() <= 10))) {
            return false;
        } else {
            a.b("netRequest", "process_error", "网关2.0网络请求，请求优化拦截", "SubContainerParamsUtils", "scroll request is not should here, so is active intercept. scroll request is 拦截");
            if (jqm.a()) {
                e.e("jimbo", "scroll request is 拦截");
            }
            return true;
        }
    }

    public AwesomeGetContainerParams b(ope opeVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AwesomeGetContainerParams) ipChange.ipc$dispatch("19ba7821", new Object[]{this, opeVar, jSONObject});
        }
        JSONObject parseObject = JSON.parseObject(JSON.toJSONString(jSONObject));
        if (!a(this.f32311a, parseObject, opeVar)) {
            return null;
        }
        AwesomeGetContainerParams b = b(this.f32311a, parseObject, opeVar);
        JSONObject jSONObject2 = parseObject.getJSONObject("bizParam");
        if (jSONObject2 != null) {
            jSONObject2.put("hundredClickItemId", (Object) c.g(this.f32311a));
            ktt.a(jSONObject2);
        }
        if (a()) {
            com.taobao.android.ai.b.a().a(this.f32311a, jSONObject2);
        }
        return b;
    }

    private boolean a(String str, JSONObject jSONObject, ope opeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c2ea684e", new Object[]{this, str, jSONObject, opeVar})).booleanValue();
        }
        a.a("netRequest", "SubContainerParamsUtils", "start doRequest");
        boolean booleanValue = jSONObject.getBooleanValue("isNextPage");
        if (!jSONObject.getBooleanValue("forceRequest") && !booleanValue) {
            boolean j = opeVar.j(str);
            if (!j) {
                try {
                    if (jSONObject.getBooleanValue("checkDeltaExpire")) {
                        return opeVar.i(str);
                    }
                } catch (Throwable unused) {
                }
            }
            if (!j) {
                a.a("netRequest", "SubContainerParamsUtils", "!isDataExpired return");
                return false;
            }
        }
        return true;
    }

    private AwesomeGetContainerParams b(String str, JSONObject jSONObject, ope opeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AwesomeGetContainerParams) ipChange.ipc$dispatch("eb96896f", new Object[]{this, str, jSONObject, opeVar});
        }
        AwesomeGetContainerParams awesomeGetContainerParams = new AwesomeGetContainerParams();
        awesomeGetContainerParams.requestType = jSONObject.getString(i.CDN_REQUEST_TYPE);
        AwesomeGetContainerData b = opeVar.b(str);
        if (b != null) {
            if (!jSONObject.getBooleanValue("forceRequest")) {
                long j = 0;
                awesomeGetContainerParams.baseCacheTime = b.base == null ? 0L : opb.a(gjv.f28356a, b.base.cacheTime);
                if (b.delta != null) {
                    j = opb.a(gjv.f28356a, b.delta.cacheTime);
                }
                awesomeGetContainerParams.deltaCacheTime = j;
                awesomeGetContainerParams.clientReqTime = System.currentTimeMillis();
                awesomeGetContainerParams.clientReqOffsetTime = SDKUtils.getTimeOffset();
            }
            if (jSONObject.getBooleanValue("isCurrentPage")) {
                awesomeGetContainerParams.pageParams = b.getPageParams();
            } else if (!jSONObject.getBooleanValue("isNextPage")) {
                AwesomeGetPageData awesomeGetPageData = new AwesomeGetPageData();
                awesomeGetPageData.pageNum = 0;
                awesomeGetPageData.virtualPageNum = 0;
                awesomeGetContainerParams.pageParams = awesomeGetPageData;
            } else if (!b.isLastPage()) {
                AwesomeGetPageData m1282clone = b.base.pageParams.m1282clone();
                m1282clone.pageNum++;
                m1282clone.virtualPageNum++;
                awesomeGetContainerParams.pageParams = m1282clone;
            }
            List<SectionModel> deltaData = b.getDeltaData();
            if (deltaData != null && deltaData.size() > 0) {
                ArrayList arrayList = new ArrayList(deltaData.size());
                for (SectionModel sectionModel : deltaData) {
                    String string = sectionModel.getString("sectionBizCode");
                    if (!StringUtils.isEmpty(string)) {
                        arrayList.add(string);
                    }
                }
                awesomeGetContainerParams.deltaSections = arrayList;
            }
        }
        awesomeGetContainerParams.passParams = oqb.a(str);
        if (awesomeGetContainerParams.passParams == null) {
            awesomeGetContainerParams.passParams = new JSONObject();
        }
        if (!StringUtils.isEmpty(TBSpeed.getSubEdition())) {
            awesomeGetContainerParams.passParams.put("subEdition", (Object) TBSpeed.getSubEdition());
        }
        if (!StringUtils.isEmpty(TBSpeed.getSpeedPassParams())) {
            awesomeGetContainerParams.passParams.put("subEditionPassParams", (Object) TBSpeed.getSpeedPassParams());
        }
        JSONObject jSONObject2 = (JSONObject) jSONObject.get("bizParam");
        if (jSONObject2 != null) {
            awesomeGetContainerParams.bizParams = new JSONObject(jSONObject2);
        } else {
            awesomeGetContainerParams.bizParams = new JSONObject();
        }
        JSONObject a2 = UcpManager.a().a(awesomeGetContainerParams.requestType);
        if (a2 != null) {
            awesomeGetContainerParams.bizParams.put("uppParams", (Object) a2);
        }
        awesomeGetContainerParams.bizParams.put("new2021UIEnable", (Object) true);
        awesomeGetContainerParams.bizParams.put(com.taobao.homepage.view.widgets.bgcontainer.a.IS_COMPLEX_TEXTURE, (Object) true);
        orb.a(awesomeGetContainerParams.bizParams);
        String b2 = d.b(com.taobao.tao.homepage.revision.a.MINI_APP_RELATION, "null");
        if (b2 != null) {
            awesomeGetContainerParams.bizParams.put(com.taobao.tao.homepage.revision.a.MINI_APP_RELATION, (Object) b2);
        }
        awesomeGetContainerParams.bizParams.put("deviceLevel", (Object) g.b());
        JSONObject a3 = com.taobao.homepage.utils.c.a(oqc.a().m());
        if (a3 != null) {
            awesomeGetContainerParams.bizParams.putAll(a3);
        }
        try {
            a(awesomeGetContainerParams, str, jSONObject, opeVar);
        } catch (Throwable th) {
            if (jqm.a()) {
                th.printStackTrace();
            } else {
                HashMap hashMap = new HashMap(1);
                hashMap.put("errorMsg", th.getMessage());
                ksr.a("netRequest", "request_add_repeat_params", "1.0", "GUESS_YOU_LIKE", hashMap, "request_add_repeat_params", "");
            }
        }
        String k = opeVar.k(str);
        if (!StringUtils.isEmpty(k)) {
            jSONObject2.put("expireAction", (Object) k);
        }
        if (StringUtils.equals(awesomeGetContainerParams.requestType, Constant.KEY_PAGEBACK)) {
            oqu.a().a(awesomeGetContainerParams.bizParams);
        }
        awesomeGetContainerParams.bizParams.put(ovr.KEY_TAB_BAR_FRAMEWORK, (Object) ovr.FRAMEWORK_MICROSERVICES);
        return awesomeGetContainerParams;
    }

    private void a(AwesomeGetContainerParams awesomeGetContainerParams, String str, JSONObject jSONObject, ope opeVar) {
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4838f44", new Object[]{this, awesomeGetContainerParams, str, jSONObject, opeVar});
            return;
        }
        if (c == null) {
            c = Integer.valueOf(j.h());
        }
        if (c.intValue() <= 0 || opeVar == null || opeVar.c(str) == null) {
            return;
        }
        String str4 = awesomeGetContainerParams.requestType;
        List<SectionModel> g = opeVar.g(str);
        String str5 = "";
        if (g == null || g.size() <= 0) {
            str2 = str5;
            str3 = str2;
        } else {
            StringBuilder sb = new StringBuilder();
            boolean z = true;
            for (int size = g.size() - 1; size >= 0 && size >= g.size() - c.intValue(); size--) {
                String a2 = a(g.get(size));
                if (!StringUtils.isEmpty(a2)) {
                    if (!z) {
                        sb.append(",");
                    }
                    sb.append(a2);
                    z = false;
                }
            }
            str2 = sb.toString();
            str3 = a(g);
            Integer integer = jSONObject.getInteger("index");
            if (integer != null) {
                while (StringUtils.isEmpty(str5)) {
                    int i2 = i + 1;
                    if (i >= 4 || integer.intValue() <= 0 || integer.intValue() >= g.size() - 1) {
                        break;
                    }
                    str5 = a(g.get(integer.intValue()));
                    integer = Integer.valueOf(integer.intValue() - 1);
                    i = i2;
                }
            }
        }
        if (awesomeGetContainerParams.bizParams == null) {
            return;
        }
        awesomeGetContainerParams.bizParams.put("currentRequestType", (Object) str4);
        awesomeGetContainerParams.bizParams.put("latestHundredItem", (Object) str2);
        awesomeGetContainerParams.bizParams.put("firstPagePVID", (Object) str3);
        awesomeGetContainerParams.bizParams.put("currentExposureItemID", (Object) str5);
    }

    private String a(List<SectionModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("80c38867", new Object[]{this, list});
        }
        String str = null;
        if (list != null && !list.isEmpty()) {
            for (SectionModel sectionModel : list) {
                str = sectionModel.getJSONObject("args").getString(aw.PARAM_PVID);
                if (!StringUtils.isEmpty(str)) {
                    break;
                }
            }
        }
        return str;
    }

    private String a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("15c87a18", new Object[]{this, jSONObject}) : (jSONObject == null || jSONObject.getJSONObject("item") == null || jSONObject.getJSONObject("item").getJSONObject("0") == null || jSONObject.getJSONObject("item").getJSONObject("0").getJSONObject("clickParam") == null) ? "" : jSONObject.getJSONObject("item").getJSONObject("0").getJSONObject("clickParam").getString("itemId");
    }
}
