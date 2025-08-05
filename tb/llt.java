package tb;

import android.app.Application;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alimama.AlimamaAdvertising;
import com.taobao.infoflow.core.engine.env.protocol.b;
import com.taobao.tao.Globals;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class llt implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2098375110);
        kge.a(-1148676039);
    }

    @Override // com.taobao.infoflow.core.engine.env.protocol.b
    public void a(Application application, String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e2e3cd0", new Object[]{this, application, str, str2, str3, map});
        } else {
            AlimamaAdvertising.instance().buildIfsExposure(application, str).withArgPid(str2).withArgNamespace(str3).withArgs(map).commit();
        }
    }

    @Override // com.taobao.infoflow.core.engine.env.protocol.b
    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else if (jSONObject == null || !jSONObject.containsKey("args")) {
        } else {
            JSONObject jSONObject2 = jSONObject.getJSONObject("args");
            JSONObject jSONObject3 = jSONObject2.getJSONObject("ext");
            Map<String, String> c = c(jSONObject3);
            Map<String, String> d = d(jSONObject3);
            if (jSONObject2.containsKey("advImpTracking")) {
                String string = jSONObject2.getString("advImpTracking");
                a(string, c, d);
                ldf.d(lsk.SPLASH_BUSINESS_TAG, "DXAppearExposeEventHandler#handleEvent-> 上报广告曝光埋点：" + string);
            }
            if (!jSONObject2.containsKey("advEventTracking")) {
                return;
            }
            String string2 = jSONObject2.getString("advEventTracking");
            c(string2, c, d);
            ldf.d(lsk.SPLASH_BUSINESS_TAG, "DXAppearExposeEventHandler#handleEvent-> 上报广告互动埋点：" + string2);
        }
    }

    @Override // com.taobao.infoflow.core.engine.env.protocol.b
    public void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
        } else if (jSONObject == null || !jSONObject.containsKey("args")) {
        } else {
            JSONObject jSONObject2 = jSONObject.getJSONObject("args");
            JSONObject jSONObject3 = jSONObject.getJSONObject("ext");
            Map<String, String> c = c(jSONObject3);
            Map<String, String> d = d(jSONObject3);
            if (jSONObject2.containsKey("advClickTracking")) {
                String string = jSONObject2.getString("advClickTracking");
                b(string, c, d);
                ldf.d(lsk.SPLASH_BUSINESS_TAG, "DXHTapEvent#handleEvent-> 上报广告点击埋点：" + string);
            }
            if (!jSONObject2.containsKey("advEventTracking")) {
                return;
            }
            String string2 = jSONObject2.getString("advEventTracking");
            c(string2, c, d);
            ldf.d(lsk.SPLASH_BUSINESS_TAG, "DXHTapEvent#handleEvent-> 上报广告互动埋点：" + string2);
        }
    }

    @Override // com.taobao.infoflow.core.engine.env.protocol.b
    public void a(String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("109fb67f", new Object[]{this, str, str2, str3, map});
        } else {
            AlimamaAdvertising.instance().commitIfsArrayExposure(str, str2, str3, map);
        }
    }

    @Override // com.taobao.infoflow.core.engine.env.protocol.b
    public void b(String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b10af9e", new Object[]{this, str, str2, str3, map});
        } else {
            AlimamaAdvertising.instance().buildTanxClickArrayTracking(str).a(str2).b(str3).a(map).a();
        }
    }

    private Map<String, String> c(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8707747b", new Object[]{this, jSONObject});
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

    private Map<String, String> d(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b4e00eda", new Object[]{this, jSONObject});
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

    private JSONObject e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("26170924", new Object[]{this, jSONObject});
        }
        if (jSONObject != null) {
            return jSONObject.getJSONObject("advClientParam");
        }
        return null;
    }

    private void a(String str, Map<String, String> map, Map<String, String> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb874e12", new Object[]{this, str, map, map2});
        } else {
            AlimamaAdvertising.instance().buildTanxImpTracking(Globals.getApplication(), str).a("tb_splash").b(map).a(map2).a();
        }
    }

    private void b(String str, Map<String, String> map, Map<String, String> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78c1ff93", new Object[]{this, str, map, map2});
        } else {
            AlimamaAdvertising.instance().buildTanxClickTracking(Globals.getApplication(), str).a("tb_splash").b(map).a(map2).a();
        }
    }

    private void c(String str, Map<String, String> map, Map<String, String> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fcb114", new Object[]{this, str, map, map2});
        } else {
            AlimamaAdvertising.instance().buildTanxEventTracking(Globals.getApplication(), str).a("tb_splash").b(map).a(map2).a();
        }
    }
}
