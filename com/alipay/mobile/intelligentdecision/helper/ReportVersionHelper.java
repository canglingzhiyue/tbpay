package com.alipay.mobile.intelligentdecision.helper;

import android.content.Context;
import android.content.SharedPreferences;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.intelligentdecision.DecisionContext;
import com.alipay.mobile.intelligentdecision.IDeviceInfoUtil;
import com.alipay.mobile.intelligentdecision.engine.DecisionEngine;
import com.alipay.mobile.intelligentdecision.log.DecisionLogcat;
import com.alipay.mobile.intelligentdecision.manager.IDCacheManager;
import com.alipay.mobile.intelligentdecision.model.ConfigEntity;
import com.alipay.mobile.intelligentdecision.rpc.FrameworkUtils;
import com.alipay.mobile.intelligentdecision.rpc.IDConfigRequest;
import com.alipay.mobile.intelligentdecision.rpc.IDConfigResponse;
import com.alipay.mobile.intelligentdecision.rpc.IDRpcServiceBiz;
import com.alipay.mobile.intelligentdecision.util.EncryptUtil;
import com.alipay.mobile.verifyidentity.utils.task.AsyncTaskExecutor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import com.taobao.android.change.app.icon.biz.ChangeAppIconBridge;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public class ReportVersionHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static AtomicBoolean f5724a = new AtomicBoolean(true);

    /* loaded from: classes3.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private JSONArray f5725a;
        private SharedPreferences b;
        private HashMap<String, ConfigEntity> c;
        private boolean d = false;

        public a(JSONArray jSONArray, SharedPreferences sharedPreferences, HashMap<String, ConfigEntity> hashMap) {
            this.f5725a = jSONArray;
            this.b = sharedPreferences;
            this.c = hashMap;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                IDRpcServiceBiz iDRpcServiceBiz = new IDRpcServiceBiz();
                IDConfigRequest iDConfigRequest = new IDConfigRequest();
                iDConfigRequest.type = this.f5725a.toJSONString();
                String e = IDeviceInfoUtil.e();
                String f = IDeviceInfoUtil.f();
                String c = IDeviceInfoUtil.c();
                String b = IDeviceInfoUtil.b();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("idp", (Object) ("a;" + DecisionEngine.a()));
                jSONObject.put("appName", (Object) e);
                jSONObject.put("appVersion", (Object) f);
                jSONObject.put(Constants.KEY_OS_TYPE, (Object) "android");
                jSONObject.put("osVersion", (Object) c);
                jSONObject.put(ChangeAppIconBridge.KEY_DEVICEMODEL, (Object) b);
                jSONObject.put("userId", (Object) FrameworkUtils.getUserId());
                iDConfigRequest.envp = jSONObject.toJSONString();
                iDConfigRequest.extp = this.d ? "{\"timing\":\"startapp\"}" : "{\"timing\":\"view\"}";
                SharedPreferences.Editor edit = this.b.edit();
                Context context = DecisionContext.getInstance().getContext();
                IDConfigResponse config = iDRpcServiceBiz.config(iDConfigRequest);
                if (config != null && config.success) {
                    JSONObject parseObject = JSON.parseObject(config.config);
                    if (this.f5725a.contains("extractConfig")) {
                        String b2 = EncryptUtil.b();
                        EncryptUtil.a(b2);
                        if (parseObject == null || parseObject.getJSONObject("extractConfig") == null) {
                            edit.putBoolean("extractConfig_enable_" + FrameworkUtils.getUserId(), false);
                            if (this.c != null && this.c.get("extractConfig") != null) {
                                edit.putInt("extractConfig_version_" + FrameworkUtils.getUserId(), this.c.get("extractConfig").version);
                            }
                            IDCacheManager a2 = IDCacheManager.a(context);
                            a2.a("extractConfig_" + FrameworkUtils.getUserId(), (JSONObject) null);
                            EncryptUtil.a(b2, "");
                        } else {
                            JSONObject jSONObject2 = parseObject.getJSONObject("extractConfig");
                            IDCacheManager a3 = IDCacheManager.a(context);
                            a3.a("extractConfig_" + FrameworkUtils.getUserId(), jSONObject2);
                            boolean booleanValue = jSONObject2.getBooleanValue("enable");
                            int intValue = jSONObject2.getIntValue("version");
                            edit.putBoolean("extractConfig_enable_" + FrameworkUtils.getUserId(), booleanValue);
                            edit.putInt("extractConfig_version_" + FrameworkUtils.getUserId(), intValue);
                            EncryptUtil.a(b2, jSONObject2.toJSONString());
                        }
                    }
                    if (this.f5725a.contains("predictConfig")) {
                        String c2 = EncryptUtil.c();
                        EncryptUtil.a(c2);
                        if (parseObject == null || parseObject.getJSONObject("predictConfig") == null) {
                            edit.putBoolean("predictConfig_enable_" + FrameworkUtils.getUserId(), false);
                            if (this.c != null && this.c.get("predictConfig") != null) {
                                edit.putInt("predictConfig_version_" + FrameworkUtils.getUserId(), this.c.get("predictConfig").version);
                            }
                            IDCacheManager a4 = IDCacheManager.a(context);
                            a4.a("predictConfig_" + FrameworkUtils.getUserId(), (JSONObject) null);
                            EncryptUtil.a(c2, "");
                        } else {
                            JSONObject jSONObject3 = parseObject.getJSONObject("predictConfig");
                            IDCacheManager a5 = IDCacheManager.a(context);
                            a5.a("predictConfig_" + FrameworkUtils.getUserId(), jSONObject3);
                            boolean booleanValue2 = jSONObject3.getBooleanValue("enable");
                            int intValue2 = jSONObject3.getIntValue("version");
                            edit.putBoolean("predictConfig_enable_" + FrameworkUtils.getUserId(), booleanValue2);
                            edit.putInt("predictConfig_version_" + FrameworkUtils.getUserId(), intValue2);
                            EncryptUtil.a(c2, jSONObject3.toJSONString());
                        }
                    }
                    if (this.f5725a.contains("strategyConfig")) {
                        String a6 = EncryptUtil.a();
                        EncryptUtil.a(a6);
                        if (parseObject == null || parseObject.getJSONObject("strategyConfig") == null) {
                            edit.putBoolean("strategyConfig_enable_" + FrameworkUtils.getUserId(), false);
                            if (this.c != null && this.c.get("strategyConfig") != null) {
                                edit.putInt("strategyConfig_version_" + FrameworkUtils.getUserId(), this.c.get("strategyConfig").version);
                            }
                            IDCacheManager a7 = IDCacheManager.a(context);
                            a7.a("strategyConfig_" + FrameworkUtils.getUserId(), (JSONObject) null);
                            EncryptUtil.a(a6, "");
                        } else {
                            JSONObject jSONObject4 = parseObject.getJSONObject("strategyConfig");
                            IDCacheManager a8 = IDCacheManager.a(context);
                            a8.a("strategyConfig_" + FrameworkUtils.getUserId(), jSONObject4);
                            boolean booleanValue3 = jSONObject4.getBooleanValue("enable");
                            int intValue3 = jSONObject4.getIntValue("version");
                            edit.putBoolean("strategyConfig_enable_" + FrameworkUtils.getUserId(), booleanValue3);
                            edit.putInt("strategyConfig_version_" + FrameworkUtils.getUserId(), intValue3);
                            EncryptUtil.a(a6, jSONObject4.toJSONString());
                        }
                    }
                    edit.commit();
                }
            } catch (Throwable th) {
                try {
                    DecisionLogcat.b("ReportVersionHelper", "report error:" + th.getMessage());
                } finally {
                    ReportVersionHelper.a().set(true);
                }
            }
        }
    }

    public static /* synthetic */ AtomicBoolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("49f1dfa8", new Object[0]) : f5724a;
    }

    public static void a(HashMap<String, ConfigEntity> hashMap) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("656bbc4b", new Object[]{hashMap});
            return;
        }
        try {
            DecisionLogcat.b("ReportVersionHelper", "checkReportVersion");
            JSONArray jSONArray = new JSONArray();
            SharedPreferences sharedPreferences = IDCacheManager.a(DecisionContext.getInstance().getContext()).f5743a;
            SharedPreferences.Editor edit = sharedPreferences.edit();
            if (hashMap != null) {
                z = false;
                for (Map.Entry<String, ConfigEntity> entry : hashMap.entrySet()) {
                    String key = entry.getKey();
                    ConfigEntity value = entry.getValue();
                    if (value.version > sharedPreferences.getInt(key + "_version_" + FrameworkUtils.getUserId(), 0)) {
                        jSONArray.add(key);
                        z = true;
                    }
                    edit.putBoolean(key + "_enable_" + FrameworkUtils.getUserId(), value.enable);
                }
                edit.commit();
            } else {
                z = false;
            }
            if (!z || !f5724a.get()) {
                return;
            }
            f5724a.set(false);
            AsyncTaskExecutor.getInstance().execute(new a(jSONArray, sharedPreferences, hashMap), "get_new_config");
        } catch (Throwable th) {
            DecisionLogcat.a("ReportVersionHelper", th.getMessage());
        }
    }
}
