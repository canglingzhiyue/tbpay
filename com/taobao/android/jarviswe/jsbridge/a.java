package com.taobao.android.jarviswe.jsbridge;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.r;
import mtopsdk.common.util.StringUtils;
import android.util.Base64;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.mnn.BaseMnnRunUnit;
import com.mobile.auth.gatewayauth.Constant;
import com.taobao.android.behavix.behavixswitch.j;
import com.taobao.android.xsearchplugin.jarvis.utils.JarvisConstant;
import com.taobao.avplayer.TBPlayerConst;
import com.taobao.orange.OrangeConfig;
import com.taobao.walle.bridge.CppApiBridge;
import com.tmall.android.dai.DAI;
import com.tmall.android.dai.DAICallback;
import com.tmall.android.dai.DAIError;
import com.tmall.android.dai.DAIKVStoreage;
import com.tmall.android.dai.e;
import com.tmall.android.dai.f;
import com.tmall.android.dai.internal.config.ConfigServiceNative;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.tensorflow.contrib.tmall.task.TaskManager;
import tb.gsi;
import tb.kge;
import tb.ktk;
import tb.noa;

/* loaded from: classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "CommBridge";

    /* renamed from: a  reason: collision with root package name */
    public static JSONObject f12970a;
    private static a b;

    static {
        kge.a(-1581405207);
        f12970a = new JSONObject();
    }

    private a() {
    }

    public static synchronized a a() {
        synchronized (a.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("416feff0", new Object[0]);
            }
            if (b == null) {
                b = new a();
            }
            return b;
        }
    }

    public void a(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cebe5e6f", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            Map<String, Object> statusInfo = DAI.getStatusInfo();
            String optString = new org.json.JSONObject(str).optString(BaseMnnRunUnit.KEY_TASK_NAME);
            r rVar = new r();
            JSONArray jSONArray = new JSONArray();
            boolean booleanValue = ((Boolean) statusInfo.get(Constant.API_PARAMS_KEY_ENABLE)).booleanValue();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("name", "环境初始化");
            jSONObject.put("status", "finish");
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("overallInfo", "环境开关已全部开启");
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            JSONArray jSONArray2 = new JSONArray();
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            jSONObject4.put("name", "isStarted");
            jSONObject4.put("value", booleanValue);
            jSONObject4.put("des", "walle是否启动");
            Iterator<Map.Entry<String, Object>> it = statusInfo.entrySet().iterator();
            while (it.hasNext()) {
                try {
                    Map.Entry<String, Object> next = it.next();
                    Iterator<Map.Entry<String, Object>> it2 = it;
                    org.json.JSONObject jSONObject5 = new org.json.JSONObject();
                    JSONArray jSONArray3 = jSONArray;
                    jSONObject5.put("name", next.getKey());
                    org.json.JSONObject jSONObject6 = jSONObject;
                    if (!"models".equals(next.getKey()) && next.getValue() != null) {
                        if ("true".equals(next.getValue().toString())) {
                            jSONObject5.put("value", true);
                        } else if ("false".equals(next.getValue().toString())) {
                            jSONObject5.put("value", false);
                        } else if (next.getValue() instanceof Map) {
                            jSONObject5.put("value", new JSONObject((Map) next.getValue()).toString());
                        } else {
                            jSONObject5.put("value", next.getValue().toString());
                        }
                        jSONObject5.put("description", "");
                        jSONArray2.put(jSONObject5);
                    }
                    it = it2;
                    jSONArray = jSONArray3;
                    jSONObject = jSONObject6;
                } catch (Exception e) {
                    e = e;
                    e.printStackTrace();
                    return;
                }
            }
            JSONArray jSONArray4 = jSONArray;
            org.json.JSONObject jSONObject7 = jSONObject;
            jSONObject3.put("items", jSONArray2);
            jSONObject3.put(Constant.API_PARAMS_KEY_ENABLE, booleanValue);
            jSONObject3.put("sectionTitle", "walle");
            org.json.JSONObject jSONObject8 = new org.json.JSONObject();
            Map<String, String> configs = OrangeConfig.getInstance().getConfigs(com.taobao.android.behavix.behavixswitch.a.ORANGE_GROUP_NAME);
            JSONArray jSONArray5 = new JSONArray();
            org.json.JSONObject jSONObject9 = new org.json.JSONObject();
            jSONObject9.put("name", "isStarted");
            jSONObject9.put("value", true);
            jSONObject9.put("des", "walle是否启动");
            for (Map.Entry<String, String> entry : configs.entrySet()) {
                org.json.JSONObject jSONObject10 = new org.json.JSONObject();
                jSONObject10.put("name", entry.getKey());
                if (!j.c.K_BIZARGS_CONFIG.equals(entry.getKey()) && !j.a.K_BEHAVIX_CONFIG.equals(entry.getKey())) {
                    if ("true".equals(entry.getValue())) {
                        jSONObject10.put("value", true);
                    } else if ("false".equals(entry.getValue())) {
                        jSONObject10.put("value", false);
                    } else {
                        jSONObject10.put("value", entry.getValue());
                    }
                    jSONObject10.put("description", "");
                    jSONArray5.put(jSONObject10);
                }
            }
            boolean z = false;
            jSONObject8.put("items", jSONArray5);
            jSONObject8.put(Constant.API_PARAMS_KEY_ENABLE, true);
            jSONObject8.put("sectionTitle", "BehaviX");
            JSONArray jSONArray6 = new JSONArray();
            jSONArray6.put(jSONObject3);
            jSONArray6.put(jSONObject8);
            jSONObject2.put("submodule", jSONArray6);
            jSONObject7.put("content", jSONObject2);
            jSONArray4.put(jSONObject7);
            HashMap a2 = a(optString);
            org.json.JSONObject jSONObject11 = new org.json.JSONObject();
            org.json.JSONObject jSONObject12 = new org.json.JSONObject();
            org.json.JSONObject jSONObject13 = new org.json.JSONObject();
            if (a2 != null) {
                org.json.JSONObject jSONObject14 = new org.json.JSONObject();
                jSONObject14.put("overallInfo", "register成功");
                jSONObject14.put("data", new JSONArray());
                jSONObject11.put("name", "register");
                Object obj = "finish";
                jSONObject11.put("status", obj);
                jSONObject11.put("content", jSONObject14);
                jSONArray4.put(jSONObject11);
                org.json.JSONObject jSONObject15 = new org.json.JSONObject();
                Boolean bool = (Boolean) a2.get(e.MODEL_STATUS_KEY_TRIGGER);
                if (bool != null) {
                    z = bool.booleanValue();
                }
                jSONObject15.put("overallInfo", z ? "trigger成功" : "没有触发过");
                jSONObject15.put("data", new JSONArray());
                jSONObject12.put("status", z ? obj : "wait");
                jSONObject12.put("name", JarvisConstant.KEY_JARVIS_TRIGGER);
                jSONObject12.put("content", jSONObject15);
                jSONArray4.put(jSONObject12);
                String str2 = (String) a2.get(e.MODEL_STATUS_KEY_LAST_RUN_TIME);
                org.json.JSONObject jSONObject16 = new org.json.JSONObject();
                if (str2 == null) {
                    obj = "wait";
                }
                jSONObject16.put("overallInfo", str2 != null ? "运行时间" + str2 : "未运行");
                JSONArray jSONArray7 = new JSONArray();
                String str3 = (String) a2.get(e.MODEL_STATUS_KEY_LAST_ERROR);
                if (!StringUtils.isEmpty(str3)) {
                    org.json.JSONObject jSONObject17 = new org.json.JSONObject();
                    jSONObject17.put("name", "运行错误");
                    jSONObject17.put("value", str3);
                    jSONObject17.put("description", "model run failed");
                    jSONArray7.put(jSONObject17);
                }
                jSONObject16.put("data", jSONArray7);
                jSONObject13.put("name", "walle运行");
                jSONObject13.put("status", obj);
                jSONObject13.put("content", jSONObject16);
                jSONArray4.put(jSONObject13);
            } else {
                org.json.JSONObject jSONObject18 = new org.json.JSONObject();
                jSONObject18.put("overallInfo", "没有注册");
                jSONObject18.put("data", new JSONArray());
                jSONObject11.put("name", "register");
                jSONObject11.put("status", "error");
                jSONObject11.put("content", jSONObject18);
                jSONArray4.put(jSONObject11);
            }
            org.json.JSONObject jSONObject19 = new org.json.JSONObject();
            jSONObject19.put("data", jSONArray4);
            rVar.a(jSONObject19);
            wVCallBackContext.success(rVar);
        } catch (Exception e2) {
            e = e2;
        }
    }

    private HashMap a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("a40d9915", new Object[]{this, str}) : e.a(str);
    }

    public void b(String str, WVCallBackContext wVCallBackContext) {
        String config;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26c8930", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            String optString = jSONObject.optString("groupName");
            String optString2 = jSONObject.optString("key");
            if (StringUtils.isEmpty(optString2)) {
                config = OrangeConfig.getInstance().getCustomConfig(optString, "");
            } else {
                config = OrangeConfig.getInstance().getConfig(optString, optString2, "");
            }
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("resultData", config);
            r rVar = new r();
            rVar.a(jSONObject2);
            wVCallBackContext.success(rVar);
        } catch (Throwable th) {
            th.printStackTrace();
            wVCallBackContext.error("get Orange Config Error!!!");
        }
    }

    public void c(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("361ab3f1", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            String b2 = gsi.b(Base64.decode(new org.json.JSONObject(str).optString("zipString"), 0));
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("resultData", b2);
            r rVar = new r();
            rVar.a(jSONObject);
            wVCallBackContext.success(rVar);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void d(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69c8deb2", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            com.tmall.android.dai.model.a registeredModelForSceneName = DAI.getRegisteredModelForSceneName(new org.json.JSONObject(str).optString(TBPlayerConst.TBPlayerMethodSwitchPlayerScene_SceneName));
            if (registeredModelForSceneName == null) {
                return;
            }
            String str2 = "" + registeredModelForSceneName.b;
            String str3 = registeredModelForSceneName.d;
            String b2 = registeredModelForSceneName.b();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(noa.KEY_IS_BETA, str2);
            jSONObject.put("condition", str3);
            jSONObject.put("solutionName", b2);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("resultData", jSONObject);
            r rVar = new r();
            rVar.a(jSONObject2);
            wVCallBackContext.success(rVar);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void e(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d770973", new Object[]{this, str, wVCallBackContext});
            return;
        }
        ConfigServiceNative.a(str, 4);
        wVCallBackContext.success();
    }

    public void f(String str, WVCallBackContext wVCallBackContext) {
        String str2 = "true";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1253434", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            boolean equals = str2.equals(new org.json.JSONObject(str).optString("featureUploadAllSwitch"));
            TaskManager.getInstance().setDevicePreviewEnabled(equals);
            ktk.a(equals);
            if (!equals) {
                str2 = "false";
            }
            DAIKVStoreage.put("JARVIS", "featureUploadAllSwitch", str2);
            wVCallBackContext.success("setFeatureUploadAllSwitch success!!!");
        } catch (Throwable unused) {
            wVCallBackContext.error("setFeatureUploadAllSwitch failed!!!");
        }
    }

    public void g(String str, WVCallBackContext wVCallBackContext) {
        String str2 = "true";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d35ef5", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            boolean equals = str2.equals(DAIKVStoreage.getValue("JARVIS", "featureUploadAllSwitch"));
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            if (!equals) {
                str2 = "false";
            }
            jSONObject.put("resultData", str2);
            r rVar = new r();
            rVar.a(jSONObject);
            wVCallBackContext.success(rVar);
        } catch (Throwable unused) {
            wVCallBackContext.error("getFeatureUploadAllSwitch switch error!!!");
        }
    }

    public void h(String str, WVCallBackContext wVCallBackContext) {
        String str2 = "true";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("388189b6", new Object[]{this, str, wVCallBackContext});
            return;
        }
        try {
            boolean equals = str2.equals(f.a("WalleBridge", "betaOn"));
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            if (!equals) {
                str2 = "false";
            }
            jSONObject.put("resultData", str2);
            r rVar = new r();
            rVar.a(jSONObject);
            wVCallBackContext.success(rVar);
        } catch (Throwable unused) {
            wVCallBackContext.error("get beta switch error!!!");
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!"true".equals(f.a("WalleBridge", "betaOn"))) {
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("action", "betaSwitch");
            DAI.runComputeByAlias("LoadTaskBridge#Start", hashMap, new DAICallback() { // from class: com.taobao.android.jarviswe.jsbridge.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.tmall.android.dai.DAICallback
                public void onSuccess(Object... objArr) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f85dc9a6", new Object[]{this, objArr});
                        return;
                    }
                    String str = "betaSwitchInner is " + JSON.toJSONString(objArr);
                    if (objArr == null || objArr.length != 1 || !(objArr[0] instanceof HashMap)) {
                        return;
                    }
                    String valueOf = String.valueOf(((HashMap) objArr[0]).get("result"));
                    if (StringUtils.isEmpty(valueOf)) {
                        return;
                    }
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("beta_config", valueOf);
                    CppApiBridge.a().a("ScenesManager#SetBetaConfig", hashMap2);
                }

                @Override // com.tmall.android.dai.DAICallback
                public void onError(DAIError dAIError) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("326e086b", new Object[]{this, dAIError});
                    } else {
                        Log.e("DAITest", "call Beta task error");
                    }
                }
            });
        }
    }

    public void i(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c2fb477", new Object[]{this, str, wVCallBackContext});
            return;
        }
        com.taobao.android.jarviswe.a.a().d().execute(new Runnable() { // from class: com.taobao.android.jarviswe.jsbridge.a.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                }
            }
        });
        try {
            if (StringUtils.equals(new org.json.JSONObject(str).optString("betaSwitch"), "true")) {
                f.a("WalleBridge", "betaOn", "true");
                b();
            } else {
                f.a("WalleBridge", "betaOn", "false");
            }
            wVCallBackContext.success("set switch success!!!");
        } catch (Throwable unused) {
            wVCallBackContext.error("set switch failed!!!");
        }
    }
}
