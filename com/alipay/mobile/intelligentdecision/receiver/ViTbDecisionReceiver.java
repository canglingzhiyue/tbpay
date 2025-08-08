package com.alipay.mobile.intelligentdecision.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.intelligentdecision.DecisionContext;
import com.alipay.mobile.intelligentdecision.engine.DecisionEngine;
import com.alipay.mobile.intelligentdecision.helper.VidFilterHelper;
import com.alipay.mobile.intelligentdecision.log.DecisionLogcat;
import com.alipay.mobile.intelligentdecision.manager.IDCacheManager;
import com.alipay.mobile.intelligentdecision.rpc.FrameworkUtils;
import com.alipay.mobile.verifyidentity.utils.task.AsyncTaskExecutor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public class ViTbDecisionReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile ViTbDecisionReceiver i;

    /* renamed from: a  reason: collision with root package name */
    private final String f5754a = "pay_enter";
    private final String b = "KExitMiniPayViewNotification";
    private final String c = "vi_enter";
    private final String d = "vi_exit";
    private final String e = "pwd_enter";
    private final String f = "pwd_exit";
    private String g = "";
    private AtomicBoolean h = new AtomicBoolean(false);

    public static /* synthetic */ String a(ViTbDecisionReceiver viTbDecisionReceiver) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("94a3761", new Object[]{viTbDecisionReceiver}) : viTbDecisionReceiver.g;
    }

    public static /* synthetic */ AtomicBoolean b(ViTbDecisionReceiver viTbDecisionReceiver) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("62833ffe", new Object[]{viTbDecisionReceiver}) : viTbDecisionReceiver.h;
    }

    private ViTbDecisionReceiver() {
    }

    public static ViTbDecisionReceiver getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViTbDecisionReceiver) ipChange.ipc$dispatch("5c9a2a09", new Object[0]);
        }
        if (i == null) {
            synchronized (ViTbDecisionReceiver.class) {
                if (i == null) {
                    i = new ViTbDecisionReceiver();
                }
            }
        }
        return i;
    }

    public void onReceive(final String str, final String str2, final String str3, final String str4, final Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12083641", new Object[]{this, str, str2, str3, str4, bundle});
            return;
        }
        DecisionLogcat.b("ViTbDecisionReceiver", "ViTbDecisionReceiver onreceive:" + str);
        if (!"pay_enter".equals(str)) {
            return;
        }
        if (!isOrangeSwitchOn()) {
            DecisionLogcat.b("ViTbDecisionReceiver", "ViTbDecisionReceiver return");
            return;
        }
        if (bundle != null) {
            if (!bundle.getBoolean("intelligentEnable", true)) {
                DecisionLogcat.b("ViTbDecisionReceiver", "intelligentEnable false");
                return;
            }
            String string = bundle.getString("userId");
            if (StringUtils.isEmpty(string)) {
                DecisionLogcat.b("ViTbDecisionReceiver", "uid empty, so return");
                return;
            }
            DecisionContext.getInstance().setCurrentUid(string);
        }
        DecisionLogcat.b("ViTbDecisionReceiver", "ViTbDecisionReceiver sceneid:" + str2);
        this.g = str;
        try {
            final Context context = DecisionContext.getInstance().getContext();
            AsyncTaskExecutor.getInstance().execute(new Runnable() { // from class: com.alipay.mobile.intelligentdecision.receiver.ViTbDecisionReceiver.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public final void run() {
                    boolean z;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        SharedPreferences sharedPreferences = IDCacheManager.a(context).f5743a;
                        String userId = FrameworkUtils.getUserId();
                        if (bundle != null) {
                            String string2 = bundle.getString("clientDecisionConfig");
                            DecisionLogcat.b("ViTbDecisionReceiver", "decisionConfig:" + string2);
                            if (!StringUtils.isEmpty(string2)) {
                                SharedPreferences.Editor edit = sharedPreferences.edit();
                                JSONObject parseObject = JSON.parseObject(string2);
                                JSONObject jSONObject = parseObject.getJSONObject("extractConfig");
                                if (jSONObject == null || !jSONObject.containsKey("enable") || jSONObject.getBooleanValue("enable")) {
                                    z = false;
                                } else {
                                    DecisionLogcat.b("ViTbDecisionReceiver", "extractConfig close");
                                    edit.putBoolean("extractConfig_enable_" + userId, false);
                                    z = true;
                                }
                                JSONObject jSONObject2 = parseObject.getJSONObject("predictConfig");
                                if (jSONObject2 != null && jSONObject2.containsKey("enable") && !jSONObject2.getBooleanValue("enable")) {
                                    DecisionLogcat.b("ViTbDecisionReceiver", "predictConfig close");
                                    edit.putBoolean("predictConfig_enable_" + userId, false);
                                    z = true;
                                }
                                JSONObject jSONObject3 = parseObject.getJSONObject("strategyConfig");
                                if (jSONObject3 != null && jSONObject3.containsKey("enable") && !jSONObject3.getBooleanValue("enable")) {
                                    DecisionLogcat.b("ViTbDecisionReceiver", "strategyConfig close");
                                    edit.putBoolean("strategyConfig_enable_" + userId, false);
                                    z = true;
                                }
                                if (z) {
                                    edit.commit();
                                }
                            }
                        }
                        boolean z2 = sharedPreferences.getBoolean("extractConfig_enable_" + userId, false);
                        boolean z3 = sharedPreferences.getBoolean("predictConfig_enable_" + userId, false);
                        boolean z4 = sharedPreferences.getBoolean("strategyConfig_enable_" + userId, false);
                        DecisionLogcat.b("ViTbDecisionReceiver", "uid:" + userId + ",extra_enable:" + z2 + ", predit_enable:" + z3 + ", stragy_enable:" + z4);
                        if (z2) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("bio_type", str4);
                            if (bundle != null) {
                                bundle2.putAll(bundle);
                            }
                            if (!VidFilterHelper.a().a(str3, ViTbDecisionReceiver.a(ViTbDecisionReceiver.this))) {
                                DecisionEngine.a(context);
                                DecisionEngine.a(ViTbDecisionReceiver.a(ViTbDecisionReceiver.this), str2, str3, bundle2);
                            }
                        }
                        if (z3) {
                            Bundle bundle3 = new Bundle();
                            bundle3.putString("bio_type", str4);
                            if (bundle != null) {
                                bundle3.putAll(bundle);
                            }
                            if (!VidFilterHelper.a().b(str3, ViTbDecisionReceiver.a(ViTbDecisionReceiver.this))) {
                                DecisionEngine.a(context);
                                DecisionEngine.b(ViTbDecisionReceiver.a(ViTbDecisionReceiver.this), str2, str3, bundle3);
                            }
                        }
                        if (!z4 || !"pay_enter".equalsIgnoreCase(str) || ViTbDecisionReceiver.b(ViTbDecisionReceiver.this).get()) {
                            return;
                        }
                        DecisionLogcat.b("ViTbDecisionReceiver", "registe local broadcast");
                        ViTbDecisionReceiver.b(ViTbDecisionReceiver.this).set(true);
                        IntentFilter intentFilter = new IntentFilter();
                        intentFilter.addAction("KExitMiniPayViewNotification");
                        LocalBroadcastManager.getInstance(context).registerReceiver(new BroadcastReceiver() { // from class: com.alipay.mobile.intelligentdecision.receiver.ViTbDecisionReceiver.1.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // android.content.BroadcastReceiver
                            public final void onReceive(Context context2, Intent intent) {
                                IpChange ipChange3 = $ipChange;
                                if (ipChange3 instanceof IpChange) {
                                    ipChange3.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                                    return;
                                }
                                DecisionLogcat.b("ViTbDecisionReceiver", "PAY_EXIT_ACTION occur");
                                try {
                                    IDCacheManager a2 = IDCacheManager.a(context2);
                                    if (a2.b != null) {
                                        a2.b.clear();
                                    }
                                    if (a2.c != null) {
                                        a2.c.clear();
                                    }
                                } catch (Throwable unused) {
                                    DecisionLogcat.b("ViTbDecisionReceiver", "clear error");
                                }
                                LocalBroadcastManager.getInstance(context2).unregisterReceiver(this);
                                ViTbDecisionReceiver.b(ViTbDecisionReceiver.this).set(false);
                            }
                        }, intentFilter);
                    } catch (Throwable th) {
                        DecisionLogcat.b("ViTbDecisionReceiver", "handle event error:" + th.getMessage());
                    }
                }
            }, "onReceive_task");
        } catch (Throwable th) {
            DecisionLogcat.b("ViTbDecisionReceiver", "error:" + th.getMessage());
        }
    }

    public static boolean isOrangeSwitchOn() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("54a72f56", new Object[0])).booleanValue();
        }
        try {
            String config = OrangeConfig.getInstance().getConfig("VerifyIdentityConfig", "closeViFutureCollect", "");
            DecisionLogcat.b("ViTbDecisionReceiver", "ViTbDecisionReceiver.closeViFutureCollect = " + config);
            return !"Y".equalsIgnoreCase(config);
        } catch (Throwable th) {
            DecisionLogcat.a("ViTbDecisionReceiver", "error:" + th.getMessage());
            return true;
        }
    }
}
