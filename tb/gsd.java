package tb;

import com.alibaba.fastjson.JSON;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.xsearchplugin.jarvis.utils.JarvisConstant;
import com.taobao.mrt.utils.a;
import com.taobao.orange.OrangeConfig;
import com.tmall.android.dai.DAI;
import com.tmall.android.dai.f;
import com.tmall.android.dai.internal.config.Config;
import com.tmall.android.dai.internal.config.ConfigServiceNative;
import com.tmall.android.dai.internal.config.e;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class gsd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static gsd f28427a;

    static {
        kge.a(1085728509);
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        return false;
    }

    private gsd() {
    }

    public static synchronized gsd a() {
        synchronized (gsd.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (gsd) ipChange.ipc$dispatch("f053326", new Object[0]);
            }
            if (f28427a == null) {
                f28427a = new gsd();
            }
            return f28427a;
        }
    }

    public synchronized void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        String customConfig = OrangeConfig.getInstance().getCustomConfig("jarvis_scenes_v3", "");
        a.d("JarvisPkgLoadManagerV3", "reCheckPkgInfoCpp");
        ConfigServiceNative.a(customConfig);
        com.taobao.android.jarviswe.jsbridge.a.a().b();
        rku.a().c();
    }

    public com.tmall.android.dai.model.a a(JSONObject jSONObject) {
        JSONObject optJSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.tmall.android.dai.model.a) ipChange.ipc$dispatch("269f8524", new Object[]{this, jSONObject});
        }
        com.tmall.android.dai.model.a aVar = new com.tmall.android.dai.model.a();
        JSONObject optJSONObject2 = jSONObject.optJSONObject("mix");
        JSONObject optJSONObject3 = jSONObject.optJSONObject("walleConfig");
        JSONObject optJSONObject4 = jSONObject.optJSONObject("solutionConfig");
        gsj.a(optJSONObject2, jSONObject);
        gsj.a(optJSONObject3, jSONObject);
        gsj.a(optJSONObject4, jSONObject);
        aVar.a(jSONObject.optString("solutionName"));
        aVar.b(jSONObject.optString("furl"));
        aVar.c(jSONObject.optString("mmd5"));
        aVar.d(jSONObject.optString("cln"));
        JSONArray optJSONArray = jSONObject.optJSONArray(JarvisConstant.KEY_JARVIS_TRIGGER);
        if (optJSONArray != null && optJSONArray.length() > 0) {
            JSONObject optJSONObject5 = optJSONArray.optJSONObject(0);
            if ("jt".equals(optJSONObject5.optString("t"))) {
                JSONObject optJSONObject6 = optJSONObject5.optJSONObject(ErrorType.DATA);
                JSONArray optJSONArray2 = optJSONObject6.optJSONArray("pgin");
                aVar.g = optJSONObject5.optString("id");
                if (optJSONArray2 != null) {
                    String optString = optJSONArray2.optString(0);
                    String optString2 = optJSONObject6.optString("eid");
                    aVar.f23718a = "" + optString + "#" + optString2;
                }
            } else {
                List parseArray = JSON.parseArray(optJSONArray.toString(), Config.ModelTrigger.class);
                if (parseArray != null) {
                    Iterator it = parseArray.iterator();
                    while (it.hasNext()) {
                        aVar.a(e.a((Config.ModelTrigger) it.next()));
                    }
                }
            }
        }
        JSONObject optJSONObject7 = jSONObject.optJSONObject("resource");
        if (optJSONObject7 != null && optJSONObject7.length() > 0) {
            try {
                aVar.a((Config.ModelResource) JSON.parseObject(optJSONObject7.toString(), Config.ModelResource.class));
            } catch (Exception unused) {
            }
        }
        if (jSONObject.has("extend_info") && (optJSONObject = jSONObject.optJSONObject("extend_info")) != null) {
            aVar.c = optJSONObject.optString("jarvis_sceneName");
            aVar.b = optJSONObject.optBoolean("jarvis_isBeta");
            aVar.d = optJSONObject.optString("matched_condition");
        }
        aVar.e = jSONObject;
        return aVar;
    }

    private void b(com.tmall.android.dai.model.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60416955", new Object[]{this, aVar});
        } else if (aVar != null) {
            try {
                if (aVar.f() == null || aVar.f().versions == null) {
                    return;
                }
                Map<String, String> map = aVar.f().versions;
                for (String str : map.keySet()) {
                    f.a(str, "version", map.get(str));
                }
            } catch (Throwable th) {
                a.b("JarvisPkgLoadManagerV3", "writeModelVersionsToCache err: ", th);
            }
        }
    }

    public boolean a(com.tmall.android.dai.model.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ec0230fa", new Object[]{this, aVar})).booleanValue();
        }
        int registerModel = DAI.registerModel(aVar);
        b(aVar);
        return registerModel == 0;
    }
}
