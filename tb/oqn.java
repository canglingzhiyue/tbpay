package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.j;
import com.taobao.android.speed.TBSpeed;
import com.taobao.homepage.utils.HomePageUtility;
import com.taobao.homepage.view.widgets.bgcontainer.a;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import com.taobao.tao.homepage.launcher.g;
import com.taobao.tao.recommend3.gateway.model.request.AwesomeGetContainerParams;
import com.taobao.tao.recommend3.gateway.model.response.AwesomeGetContainerData;
import com.taobao.tao.topmultitab.c;
import com.taobao.themis.kernel.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.global.SDKUtils;

/* loaded from: classes.dex */
public class oqn {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_PREVIEW_PARAM = "previewParam";
    private static Map<String, String> b;

    /* renamed from: a  reason: collision with root package name */
    private String f32302a;

    static {
        kge.a(-1528334286);
        b = new HashMap();
    }

    public oqn(String str) {
        this.f32302a = str;
    }

    public AwesomeGetContainerParams a(ope opeVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AwesomeGetContainerParams) ipChange.ipc$dispatch("ba4a9d42", new Object[]{this, opeVar, jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject(new HashMap(jSONObject));
        AwesomeGetContainerParams awesomeGetContainerParams = new AwesomeGetContainerParams();
        awesomeGetContainerParams.requestType = jSONObject2.getString(i.CDN_REQUEST_TYPE);
        AwesomeGetContainerData b2 = opeVar.b(this.f32302a);
        if (b2 != null) {
            if (!jSONObject2.getBooleanValue("forceRequest")) {
                if (!b(opeVar, jSONObject2)) {
                    return null;
                }
                long j = 0;
                awesomeGetContainerParams.baseCacheTime = b2.base == null ? 0L : b2.base.cacheTime;
                if (b2.delta != null) {
                    j = b2.delta.cacheTime;
                }
                awesomeGetContainerParams.deltaCacheTime = j;
                awesomeGetContainerParams.clientReqTime = System.currentTimeMillis();
                awesomeGetContainerParams.clientReqOffsetTime = SDKUtils.getTimeOffset();
            }
            awesomeGetContainerParams.realBaseCacheTime = b2.base == null ? HomePageUtility.b(this.f32302a) : b2.base.dataCacheTime;
            List<SectionModel> deltaData = b2.getDeltaData();
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
        lar.k("prepareCustomerParams");
        awesomeGetContainerParams.bizParams = a(jSONObject2);
        lar.l("prepareCustomerParams");
        awesomeGetContainerParams.passParams = oqb.a(this.f32302a);
        if (awesomeGetContainerParams.passParams == null) {
            awesomeGetContainerParams.passParams = new JSONObject();
        }
        if (!StringUtils.isEmpty(TBSpeed.getSubEdition())) {
            awesomeGetContainerParams.passParams.put("subEdition", (Object) TBSpeed.getSubEdition());
        }
        if (!StringUtils.isEmpty(TBSpeed.getSpeedPassParams())) {
            awesomeGetContainerParams.passParams.put("subEditionPassParams", (Object) TBSpeed.getSpeedPassParams());
        }
        return awesomeGetContainerParams;
    }

    private boolean b(ope opeVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3219415f", new Object[]{this, opeVar, jSONObject})).booleanValue();
        }
        boolean j = opeVar.j(this.f32302a);
        return jSONObject.getBooleanValue("checkDeltaExpire") ? j || opeVar.i(this.f32302a) : j;
    }

    private JSONObject a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("429586a8", new Object[]{this, jSONObject});
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("lastVersion", (Object) a());
        JSONObject jSONObject3 = new JSONObject();
        jSONObject2.put(this.f32302a, (Object) jSONObject3);
        jSONObject2.put(ilw.KEY_NEW_CONTENT_ENABLE, (Object) "true");
        jSONObject2.put("new2021UIEnable", (Object) true);
        jSONObject2.put(a.IS_COMPLEX_TEXTURE, (Object) true);
        orb.a(jSONObject2);
        jSONObject2.put("deviceLevel", (Object) g.b());
        String A = c.a().A();
        if (!StringUtils.isEmpty(A)) {
            jSONObject2.put("currentTabType", (Object) A);
        }
        JSONObject b2 = b(jSONObject);
        if (b2 != null) {
            jSONObject2.putAll(b2);
        }
        JSONObject a2 = com.taobao.homepage.utils.c.a(this.f32302a);
        if (a2 != null) {
            jSONObject2.putAll(a2);
        }
        if (!j.a("delGlobalLBS", true)) {
            orc.a(jSONObject2);
        }
        jSONObject3.put(ovr.KEY_TAB_BAR_FRAMEWORK, (Object) ovr.FRAMEWORK_MICROSERVICES);
        return jSONObject2;
    }

    private JSONObject b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("7b75e747", new Object[]{this, jSONObject}) : jSONObject.getJSONObject("bizParam");
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        if (!b.containsKey(this.f32302a)) {
            Map<String, String> map = b;
            String str = this.f32302a;
            map.put(str, com.taobao.homepage.business.permission.c.a(oqr.a(str), (String) null));
        }
        return b.get(this.f32302a);
    }
}
