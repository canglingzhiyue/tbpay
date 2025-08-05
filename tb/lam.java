package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.AlimamaAdvertising;
import com.taobao.android.home.component.utils.h;
import com.taobao.tao.Globals;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class lam {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(706738731);
    }

    public static void a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{jSONObject});
        } else if (!jSONObject.containsKey("clickParam") || (jSONObject2 = jSONObject.getJSONObject("clickParam")) == null || !jSONObject2.containsKey("args")) {
        } else {
            JSONObject jSONObject3 = jSONObject2.getJSONObject("args");
            JSONObject jSONObject4 = jSONObject2.getJSONObject("ext");
            Map<String, String> c = c(jSONObject4);
            Map<String, String> d = d(jSONObject4);
            if (jSONObject3.containsKey("advClickTracking")) {
                String string = jSONObject3.getString("advClickTracking");
                b(string, c, d);
                ldf.d(lsk.SPLASH_BUSINESS_TAG, "DXHTapEvent#handleEvent-> 上报广告点击埋点：" + string);
            }
            if (!jSONObject3.containsKey("advEventTracking")) {
                return;
            }
            String string2 = jSONObject3.getString("advEventTracking");
            c(string2, c, d);
            ldf.d(lsk.SPLASH_BUSINESS_TAG, "DXHTapEvent#handleEvent-> 上报广告互动埋点：" + string2);
        }
    }

    public static void b(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{jSONObject});
        } else if (!jSONObject.containsKey(h.TRACK_EXPOSURE_PARAM) || (jSONObject2 = jSONObject.getJSONObject(h.TRACK_EXPOSURE_PARAM)) == null || !jSONObject2.containsKey("args")) {
        } else {
            JSONObject jSONObject3 = jSONObject2.getJSONObject("args");
            JSONObject jSONObject4 = jSONObject3.getJSONObject("ext");
            Map<String, String> c = c(jSONObject4);
            Map<String, String> d = d(jSONObject4);
            if (jSONObject3.containsKey("advImpTracking")) {
                String string = jSONObject3.getString("advImpTracking");
                a(string, c, d);
                ldf.d(lsk.SPLASH_BUSINESS_TAG, "DXAppearExposeEventHandler#handleEvent-> 上报广告曝光埋点：" + string);
            }
            if (!jSONObject3.containsKey("advEventTracking")) {
                return;
            }
            String string2 = jSONObject3.getString("advEventTracking");
            c(string2, c, d);
            ldf.d(lsk.SPLASH_BUSINESS_TAG, "DXAppearExposeEventHandler#handleEvent-> 上报广告互动埋点：" + string2);
        }
    }

    private static Map<String, String> c(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8707747b", new Object[]{jSONObject});
        }
        HashMap hashMap = new HashMap(1);
        JSONObject e = e(jSONObject);
        if (e == null || (jSONObject2 = e.getJSONObject("monitorArgs")) == null) {
            return hashMap;
        }
        try {
            return (Map) JSONObject.parseObject(jSONObject2.toJSONString(), Map.class);
        } catch (Throwable unused) {
            return hashMap;
        }
    }

    private static Map<String, String> d(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b4e00eda", new Object[]{jSONObject});
        }
        HashMap hashMap = new HashMap(2);
        JSONObject e = e(jSONObject);
        if (e == null || (jSONObject2 = e.getJSONObject("utArgs")) == null) {
            return hashMap;
        }
        try {
            return (Map) JSONObject.parseObject(jSONObject2.toJSONString(), Map.class);
        } catch (Throwable unused) {
            return hashMap;
        }
    }

    private static JSONObject e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("26170924", new Object[]{jSONObject});
        }
        if (jSONObject != null) {
            return jSONObject.getJSONObject("advClientParam");
        }
        return null;
    }

    private static void a(String str, Map<String, String> map, Map<String, String> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb874e12", new Object[]{str, map, map2});
        } else {
            AlimamaAdvertising.instance().buildTanxImpTracking(Globals.getApplication(), str).a("tb_splash").b(map).a(map2).a();
        }
    }

    private static void b(String str, Map<String, String> map, Map<String, String> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78c1ff93", new Object[]{str, map, map2});
        } else {
            AlimamaAdvertising.instance().buildTanxClickTracking(Globals.getApplication(), str).a("tb_splash").b(map).a(map2).a();
        }
    }

    private static void c(String str, Map<String, String> map, Map<String, String> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fcb114", new Object[]{str, map, map2});
        } else {
            AlimamaAdvertising.instance().buildTanxEventTracking(Globals.getApplication(), str).a("tb_splash").b(map).a(map2).a();
        }
    }
}
