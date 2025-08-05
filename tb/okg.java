package tb;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.config.BHRTaskConfigBase;
import com.taobao.homepage.utils.HomePageUtility;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class okg extends lhc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1513158672);
    }

    public static /* synthetic */ Object ipc$super(okg okgVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public okg(ljs ljsVar) {
        super(ljsVar);
    }

    @Override // tb.lhc, com.taobao.infoflow.protocol.engine.invoke.biz.l
    public Map<String, String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this});
        }
        JSONObject e = e();
        if (e == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        try {
            return (Map) JSONObject.parseObject(e.toJSONString(), new TypeReference<Map<String, String>>() { // from class: tb.okg.1
            }, new Feature[0]);
        } catch (Exception e2) {
            lap.a(BHRTaskConfigBase.TYPE_CONFIG_UT, "getUpdateNextPageProperties", "出现异常： " + e2);
            return hashMap;
        }
    }

    private JSONObject e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("bf3ec58c", new Object[]{this});
        }
        JSONObject d = HomePageUtility.d();
        if (d == null) {
            lap.a(BHRTaskConfigBase.TYPE_CONFIG_UT, "getNextPageProperties", "searchBarSection == nul");
            return null;
        }
        JSONObject jSONObject = d.getJSONObject("subSection");
        if (jSONObject == null) {
            lap.a(BHRTaskConfigBase.TYPE_CONFIG_UT, "getNextPageProperties", "subSection == nul");
            return null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("tabBar");
        if (jSONObject2 == null) {
            lap.a(BHRTaskConfigBase.TYPE_CONFIG_UT, "getNextPageProperties", "tabBar == nul");
            return null;
        }
        JSONObject jSONObject3 = jSONObject2.getJSONObject("item");
        if (jSONObject3 == null) {
            lap.a(BHRTaskConfigBase.TYPE_CONFIG_UT, "getNextPageProperties", "item == nul");
            return null;
        }
        JSONObject jSONObject4 = jSONObject3.getJSONObject("1");
        if (jSONObject4 == null) {
            lap.a(BHRTaskConfigBase.TYPE_CONFIG_UT, "getNextPageProperties", "tabBarSection == nul");
            return null;
        }
        return jSONObject4.getJSONObject("passOnTrack");
    }
}
