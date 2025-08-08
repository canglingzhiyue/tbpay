package com.alipay.mobile.intelligentdecision.engine;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.intelligentdecision.DecisionContext;
import com.alipay.mobile.intelligentdecision.callback.IDResultListener;
import com.alipay.mobile.intelligentdecision.helper.ReportVersionHelper;
import com.alipay.mobile.intelligentdecision.log.DecisionLogcat;
import com.alipay.mobile.intelligentdecision.log.DecisonLogBehavior;
import com.alipay.mobile.intelligentdecision.manager.AIManager;
import com.alipay.mobile.intelligentdecision.manager.DecisionTaskManager;
import com.alipay.mobile.intelligentdecision.manager.IDCacheManager;
import com.alipay.mobile.intelligentdecision.model.ConfigEntity;
import com.alipay.mobile.intelligentdecision.model.DecisionTask;
import com.alipay.mobile.intelligentdecision.model.IDecisionResult;
import com.alipay.mobile.intelligentdecision.receiver.ViTbDecisionReceiver;
import com.alipay.mobile.intelligentdecision.rpc.FrameworkUtils;
import com.alipay.mobile.intelligentdecision.util.EncryptUtil;
import com.alipay.mobile.verifyidentity.common.Constants;
import com.alipay.mobile.verifyidentity.utils.CommonConstant;
import com.alipay.mobile.verifyidentity.utils.task.AsyncTaskExecutor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class DecisionEngine {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static volatile DecisionEngine f5723a = null;
    private static final String b = "DecisionEngine";

    public static String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : "1.1.1";
    }

    private DecisionEngine(Context context) {
        DecisionContext.getInstance().attachContext(context);
        DecisionLogcat.a(context.getPackageName());
    }

    public static DecisionEngine a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DecisionEngine) ipChange.ipc$dispatch("a1004238", new Object[]{context});
        }
        if (f5723a == null) {
            synchronized (DecisionEngine.class) {
                if (f5723a == null) {
                    f5723a = new DecisionEngine(context);
                }
            }
        }
        return f5723a;
    }

    public final synchronized void a(String str, String str2, String str3, Bundle bundle, IDResultListener iDResultListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c12a390f", new Object[]{this, str, str2, str3, bundle, iDResultListener});
            return;
        }
        String str4 = b;
        DecisionLogcat.b(str4, "startDecisionWithParams:" + str2 + ", bizId:" + str + ", sceneid:" + str3);
        if (StringUtils.isEmpty(str2)) {
            IDecisionResult iDecisionResult = new IDecisionResult();
            iDecisionResult.success = false;
            iDecisionResult.state = "error";
            iDecisionResult.errorCode = IDecisionResult.ENGINE_ERROR;
            iDResultListener.onDesicionResult(iDecisionResult);
            return;
        }
        DecisionTask decisionTask = new DecisionTask();
        decisionTask.f5753a = str;
        decisionTask.d = str2;
        decisionTask.b = bundle;
        decisionTask.c = iDResultListener;
        decisionTask.e = 3;
        if (DecisionTaskManager.a().b(decisionTask)) {
            IDecisionResult iDecisionResult2 = new IDecisionResult();
            iDecisionResult2.success = false;
            iDecisionResult2.state = "error";
            iDecisionResult2.errorCode = IDecisionResult.ENGINE_ERROR;
            iDResultListener.onDesicionResult(iDecisionResult2);
            return;
        }
        DecisionTaskManager.a().a(decisionTask);
    }

    public static void a(HashMap<String, ConfigEntity> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("656bbc4b", new Object[]{hashMap});
        } else {
            ReportVersionHelper.a(hashMap);
        }
    }

    public static void a(final String str, final String str2, final String str3, final Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97b732ce", new Object[]{str, str2, str3, bundle});
            return;
        }
        String str4 = b;
        DecisionLogcat.b(str4, "startDataCollect:" + str);
        final DecisonLogBehavior a2 = DecisonLogBehavior.a();
        if (StringUtils.isEmpty(str)) {
            return;
        }
        final Context context = DecisionContext.getInstance().getContext();
        final String userId = FrameworkUtils.getUserId();
        SharedPreferences sharedPreferences = IDCacheManager.a(context).f5743a;
        if (!sharedPreferences.getBoolean("extractConfig_enable_" + userId, false)) {
            DecisionLogcat.b(DecisonLogBehavior.f5728a, "startCollectClientData 2");
            return;
        }
        IDCacheManager a3 = IDCacheManager.a(context);
        JSONObject a4 = a3.a("extractConfig_" + userId);
        if (a4 != null) {
            DecisionLogcat.b(DecisonLogBehavior.f5728a, "have cache extractConfig");
            a2.a(a4, str, str2, str3, bundle);
            return;
        }
        String b2 = EncryptUtil.b();
        if (!a2.b.get()) {
            DecisionLogcat.b(DecisonLogBehavior.f5728a, "have start collect, so return");
            return;
        }
        a2.b.set(false);
        try {
            EncryptUtil.a(b2, new EncryptUtil.FileCallback() { // from class: com.alipay.mobile.intelligentdecision.log.DecisonLogBehavior.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.mobile.intelligentdecision.util.EncryptUtil.FileCallback
                public final void a(JSONObject jSONObject) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
                        return;
                    }
                    DecisonLogBehavior.b(DecisonLogBehavior.this).set(true);
                    DecisonLogBehavior.a(DecisonLogBehavior.this, jSONObject, str, str2, str3, bundle);
                    IDCacheManager a5 = IDCacheManager.a(context);
                    a5.a("extractConfig_" + userId, jSONObject);
                }
            });
        } catch (Throwable unused) {
            a2.b.set(true);
        }
    }

    public static void b(final String str, String str2, final String str3, final Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0b8846d", new Object[]{str, str2, str3, bundle});
            return;
        }
        final AIManager a2 = AIManager.a();
        String str4 = AIManager.f5735a;
        DecisionLogcat.b(str4, "startPredit:" + str + ", sceneid:" + str2);
        if (StringUtils.isEmpty(str)) {
            return;
        }
        final Context context = DecisionContext.getInstance().getContext();
        final String userId = FrameworkUtils.getUserId();
        SharedPreferences sharedPreferences = IDCacheManager.a(context).f5743a;
        if (!sharedPreferences.getBoolean("predictConfig_enable_" + userId, false)) {
            DecisionLogcat.b(AIManager.f5735a, "startPredit not enable");
            return;
        }
        IDCacheManager a3 = IDCacheManager.a(context);
        JSONObject a4 = a3.a("predictConfig_" + userId);
        if (a4 != null) {
            DecisionLogcat.b(AIManager.f5735a, "have cache predictConfig");
            a2.a(a4, str, str3, bundle);
            return;
        }
        String c = EncryptUtil.c();
        if (!a2.b.get()) {
            DecisionLogcat.b(AIManager.f5735a, "have start collect, so return");
            return;
        }
        a2.b.set(false);
        try {
            EncryptUtil.a(c, new EncryptUtil.FileCallback() { // from class: com.alipay.mobile.intelligentdecision.manager.AIManager.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.mobile.intelligentdecision.util.EncryptUtil.FileCallback
                public final void a(JSONObject jSONObject) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
                        return;
                    }
                    AIManager.a(AIManager.this).set(true);
                    AIManager.a(AIManager.this, jSONObject, str, str3, bundle);
                    IDCacheManager a5 = IDCacheManager.a(context);
                    a5.a("predictConfig_" + userId, jSONObject);
                }
            });
        } catch (Throwable unused) {
            a2.b.set(true);
        }
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            DecisionContext.getInstance().setCurrentUid(str);
        }
    }

    public static void a(String str, String str2, String str3, String str4, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27c4c644", new Object[]{str, str2, str3, str4, bundle});
        } else {
            ViTbDecisionReceiver.getInstance().onReceive(str, str2, str3, str4, bundle);
        }
    }

    public static void a(final Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b668f6c", new Object[]{bundle});
            return;
        }
        DecisionLogcat.b(b, "recordFeature");
        if (!ViTbDecisionReceiver.isOrangeSwitchOn()) {
            DecisionLogcat.b(b, "recordFeature return");
            return;
        }
        final IDCacheManager a2 = IDCacheManager.a(DecisionContext.getInstance().getContext());
        try {
            AsyncTaskExecutor.getInstance().execute(new Runnable() { // from class: com.alipay.mobile.intelligentdecision.manager.IDCacheManager.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public final void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        long j = bundle.getLong("spendTime");
                        String string = bundle.getString("result");
                        String string2 = bundle.getString("extend1");
                        String string3 = bundle.getString("extend2");
                        String string4 = bundle.getString("extend3");
                        String string5 = bundle.getString("cancel_type");
                        String string6 = bundle.getString("sceneId");
                        if (StringUtils.isEmpty(string3)) {
                            string3 = string4;
                        }
                        DecisionLogcat.b("IDCacheManager", "spendTime:" + j + ", result:" + string + ", vid:" + string2 + ", product:" + string3 + ", proResult:" + string5 + ",sceneid:" + string6);
                        UTHitBuilders.UTCustomHitBuilder uTCustomHitBuilder = new UTHitBuilders.UTCustomHitBuilder("VerifyIdentity_RESULT_DATA");
                        uTCustomHitBuilder.setEventPage("VerifyIdentity_Page_END");
                        uTCustomHitBuilder.setProperty("costTime", String.valueOf(j));
                        uTCustomHitBuilder.setProperty("finsihCode", string);
                        uTCustomHitBuilder.setProperty(Constants.VI_ENGINE_VERIFYID, string2);
                        uTCustomHitBuilder.setProperty(CommonConstant.PRO_VERIFY_TYPE, string3);
                        uTCustomHitBuilder.setProperty(AliFestivalWVPlugin.PARAMS_MODULE_NAME, string4);
                        uTCustomHitBuilder.setProperty(CommonConstant.PRO_VERIFY_RESULT, string5);
                        uTCustomHitBuilder.setProperty("sceneId", string6);
                        uTCustomHitBuilder.setProperty("userId", FrameworkUtils.getUserId());
                        UTAnalytics.getInstance().getDefaultTracker().send(uTCustomHitBuilder.build());
                    } catch (Throwable th) {
                        DecisionLogcat.b("IDCacheManager", "recordBizData error:" + th.getMessage());
                    }
                }
            }, "recordBizData thread");
        } catch (Throwable th) {
            DecisionLogcat.b("IDCacheManager", "recordBizData error:" + th.getMessage());
        }
    }
}
