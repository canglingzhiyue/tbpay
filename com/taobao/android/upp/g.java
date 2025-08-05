package com.taobao.android.upp;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.decision.BHRDecisionEngine;
import com.taobao.android.behavir.event.BHREvent;
import com.taobao.android.behavir.util.UtUtils;
import com.taobao.android.ucp.bridge.NativeDelegate;
import com.taobao.android.upp.e;
import com.taobao.tao.log.TLog;
import java.util.Iterator;
import java.util.Map;
import tb.kge;

/* loaded from: classes.dex */
public class g extends UppProtocolImpl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1360878205);
    }

    @Override // com.taobao.android.upp.UppProtocolImpl
    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        }
    }

    @Override // com.taobao.android.upp.UppProtocolImpl, com.taobao.android.upp.e
    public void addBizFeatures(Map<String, Object> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc5b50b9", new Object[]{this, map, str});
        } else if (map == null) {
        } else {
            NativeDelegate.AddUserFeature(str, new JSONObject(map));
        }
    }

    @Override // com.taobao.android.upp.UppProtocolImpl
    public String registerUCPResourceScheme(String str, JSONObject jSONObject, String str2, Object obj, e.b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1741054", new Object[]{this, str, jSONObject, str2, obj, bVar}) : NativeDelegate.registerResourceSchemeToCpp(str2, obj, str, jSONObject, new c(bVar));
    }

    @Override // com.taobao.android.upp.UppProtocolImpl
    public String registerUCPResourceScheme(String str, JSONObject jSONObject, String str2, Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8631894d", new Object[]{this, str, jSONObject, str2, obj}) : NativeDelegate.registerResourceSchemeToCpp(str2, obj, str, jSONObject, null);
    }

    @Override // com.taobao.android.upp.UppProtocolImpl, com.taobao.android.upp.e
    public void registerUPPCallbackWithScene(String str, Object obj, e.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97714296", new Object[]{this, str, obj, aVar});
        } else {
            NativeDelegate.addSceneCallback(str, obj, aVar, null);
        }
    }

    @Override // com.taobao.android.upp.UppProtocolImpl
    public void unRegisterUPPCallbackWithScene(String str, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c0e598b", new Object[]{this, str, activity});
        } else {
            NativeDelegate.removeSceneCallback(str, activity);
        }
    }

    @Override // com.taobao.android.upp.UppProtocolImpl
    public void registerUPPCallbackWithScene(String str, Object obj, e.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97722b54", new Object[]{this, str, obj, cVar});
        } else {
            NativeDelegate.addSceneCallback(str, obj, null, cVar);
        }
    }

    @Override // com.taobao.android.upp.UppProtocolImpl
    public void registerUPPCallbackWithScene(String str, Activity activity, e.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83ec5d0c", new Object[]{this, str, activity, aVar});
        } else {
            NativeDelegate.addSceneCallback(str, activity, aVar, null);
        }
    }

    @Override // com.taobao.android.upp.UppProtocolImpl
    public void registerUCPPlans(JSONObject jSONObject, JSONObject jSONObject2, String str, Activity activity, e.b bVar, e.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a002df21", new Object[]{this, jSONObject, jSONObject2, str, activity, bVar, aVar});
        } else if (!com.taobao.android.behavix.d.e()) {
            UtUtils.a("UCP", 19999, "behavixNull", "registerUCPPlans", "", "");
            printThreadName("registerUCPPlans");
        } else {
            Log.e("sijian", "aaa");
            if (jSONObject == null || jSONObject.isEmpty()) {
                return;
            }
            try {
                if (jSONObject.containsKey("ucpData")) {
                    jSONObject = jSONObject.getJSONObject("ucpData");
                }
                NativeDelegate.registerUCPPlansToCpp(jSONObject);
                JSONArray jSONArray = jSONObject.getJSONObject("plan").getJSONArray("diff");
                if (jSONArray == null) {
                    return;
                }
                Iterator<Object> it = jSONArray.iterator();
                while (it.hasNext()) {
                    JSONObject jSONObject3 = (JSONObject) it.next();
                    if (jSONObject3 != null) {
                        NativeDelegate.registerResourceSchemeToCpp(str, activity, jSONObject3.getJSONObject("data").getString("schemeId"), jSONObject2, new d(bVar));
                    }
                }
                if (!TextUtils.isEmpty(str)) {
                    registerUPPCallbackWithScene(str, activity, aVar);
                }
                BHREvent buildInternalEvent = BHREvent.buildInternalEvent(str, "PlanRegister", String.valueOf(activity.hashCode()), true);
                JSONObject jSONObject4 = new JSONObject();
                if (jSONObject2 != null) {
                    jSONObject4.putAll(jSONObject2);
                }
                jSONObject4.put("br_action", (Object) "register");
                jSONObject4.put("br_from", (Object) "ucp");
                buildInternalEvent.bizArgKVMapObject = jSONObject4;
                BHRDecisionEngine.a().a(buildInternalEvent);
            } catch (Exception e) {
                TLog.loge("UppProtocolImplCpp", "registerUCPPlans", e);
            }
        }
    }
}
