package com.alipay.mobile.intelligentdecision.manager;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.intelligentdecision.DecisionContext;
import com.alipay.mobile.intelligentdecision.FutureHelper;
import com.alipay.mobile.intelligentdecision.IDeviceInfoUtil;
import com.alipay.mobile.intelligentdecision.callback.TBDaiCallBack;
import com.alipay.mobile.intelligentdecision.engine.DecisionEngine;
import com.alipay.mobile.intelligentdecision.log.DecisionLogcat;
import com.alipay.mobile.intelligentdecision.rpc.FrameworkUtils;
import com.alipay.mobile.verifyidentity.utils.task.AsyncTaskExecutor;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.tmall.android.dai.DAI;
import com.tmall.android.dai.DAIError;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public class AIManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final String f5735a = "AIManager";
    private static volatile AIManager c;
    private AtomicBoolean d = new AtomicBoolean(true);
    public AtomicBoolean b = new AtomicBoolean(true);

    /* loaded from: classes3.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public Object f5740a;
        public int b;
        public long c;
        public String d;
        public String e;
        public String f;

        public a(Object obj, int i, long j, String str, String str2, String str3) {
            this.f5740a = obj;
            this.b = i;
            this.c = j;
            this.d = str;
            this.e = str2;
            this.f = str3;
        }
    }

    public static /* synthetic */ AtomicBoolean a(AIManager aIManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("81b469c8", new Object[]{aIManager}) : aIManager.b;
    }

    public static /* synthetic */ void a(AIManager aIManager, JSONObject jSONObject, String str, String str2, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8034cd8", new Object[]{aIManager, jSONObject, str, str2, bundle});
        } else {
            aIManager.a(jSONObject, str, str2, bundle);
        }
    }

    public static /* synthetic */ String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]) : f5735a;
    }

    public static /* synthetic */ AtomicBoolean b(AIManager aIManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("ab1be2a7", new Object[]{aIManager}) : aIManager.d;
    }

    private AIManager() {
    }

    public static AIManager a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AIManager) ipChange.ipc$dispatch("95954388", new Object[0]);
        }
        if (c == null) {
            synchronized (AIManager.class) {
                if (c == null) {
                    c = new AIManager();
                }
            }
        }
        return c;
    }

    public final void a(JSONObject jSONObject, final String str, final String str2, final Bundle bundle) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bdd7ab8", new Object[]{this, jSONObject, str, str2, bundle});
        } else if (jSONObject == null) {
            DecisionLogcat.b(f5735a, "predictObj == null");
        } else {
            DecisionLogcat.b(f5735a, "predictObj != null");
            final JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            if (jSONObject2 == null) {
                DecisionLogcat.b(f5735a, "obj == null");
            } else if (!jSONObject2.getBooleanValue("enable")) {
                DecisionLogcat.b(f5735a, "predit not scene_enable");
            } else {
                JSONArray jSONArray = jSONObject2.getJSONArray("bio_type");
                String string = bundle.getString("bio_type", "");
                if (jSONArray != null && jSONArray.size() > 0) {
                    Iterator<Object> it = jSONArray.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = false;
                            break;
                        } else if (string.contains(it.next().toString())) {
                            z = true;
                            break;
                        }
                    }
                    if (!z) {
                        return;
                    }
                }
                final String string2 = jSONObject2.getString("scene_code");
                String str3 = f5735a;
                DecisionLogcat.b(str3, "predit start scenecode:" + string2);
                final JSONArray jSONArray2 = jSONObject2.getJSONArray("param_list");
                if (jSONArray2 != null) {
                    String str4 = f5735a;
                    DecisionLogcat.b(str4, "paramList:" + jSONArray2.toJSONString());
                }
                DecisionLogcat.b(f5735a, "startAICompute");
                if (!this.d.get()) {
                    DecisionLogcat.b(f5735a, "have start predit, so return");
                    return;
                }
                this.d.set(false);
                try {
                    AsyncTaskExecutor.getInstance().execute(new Runnable() { // from class: com.alipay.mobile.intelligentdecision.manager.AIManager.2
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public final void run() {
                            String a2;
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            try {
                                final int intValue = jSONObject2.getIntValue("timeout");
                                long currentTimeMillis = System.currentTimeMillis();
                                Object a3 = new FutureHelper().a(new Callable<Object>() { // from class: com.alipay.mobile.intelligentdecision.manager.AIManager.2.1
                                    public static volatile transient /* synthetic */ IpChange $ipChange;

                                    @Override // java.util.concurrent.Callable
                                    public final Object call() {
                                        IpChange ipChange3 = $ipChange;
                                        if (ipChange3 instanceof IpChange) {
                                            return ipChange3.ipc$dispatch("6d249ded", new Object[]{this});
                                        }
                                        try {
                                            return AIManager.a(string2, str2, bundle, jSONArray2);
                                        } catch (Exception e) {
                                            return "call exception:" + e.getMessage();
                                        }
                                    }
                                }, intValue);
                                if (!jSONObject2.getBooleanValue("report")) {
                                    AIManager.b(AIManager.this).set(true);
                                    AIManager.b(AIManager.this).set(true);
                                    return;
                                }
                                a aVar = new a(a3, intValue, currentTimeMillis, str, string2, str2);
                                if (aVar.f5740a != null) {
                                    long currentTimeMillis2 = System.currentTimeMillis();
                                    SharedPreferences sharedPreferences = IDCacheManager.a(DecisionContext.getInstance().getContext()).f5743a;
                                    String valueOf = String.valueOf(aVar.f5740a);
                                    if ("TIME_OUT".equalsIgnoreCase(valueOf)) {
                                        String str5 = aVar.d;
                                        String str6 = aVar.e;
                                        a2 = AIManager.a(aVar.f, currentTimeMillis2 - aVar.c, currentTimeMillis2, str5, str6, sharedPreferences.getInt("predictConfig_version_" + FrameworkUtils.getUserId(), 0), valueOf, valueOf, aVar.b);
                                    } else {
                                        if (!valueOf.startsWith("EXCEPTION") && !valueOf.startsWith("call exception")) {
                                            String str7 = aVar.d;
                                            String str8 = aVar.e;
                                            a2 = AIManager.a(aVar.f, currentTimeMillis2 - aVar.c, currentTimeMillis2, str7, str8, sharedPreferences.getInt("predictConfig_version_" + FrameworkUtils.getUserId(), 0), valueOf, "", 0);
                                        }
                                        String str9 = aVar.d;
                                        String str10 = aVar.e;
                                        a2 = AIManager.a(aVar.f, currentTimeMillis2 - aVar.c, currentTimeMillis2, str9, str10, sharedPreferences.getInt("predictConfig_version_" + FrameworkUtils.getUserId(), 0), valueOf, valueOf, 0);
                                    }
                                    String b = AIManager.b();
                                    DecisionLogcat.b(b, "get ai data:" + a2);
                                    LogReportManager.a().a(a2, "model");
                                } else {
                                    LogReportManager.a().a("get AI data null!", "model");
                                    DecisionLogcat.b(AIManager.b(), "get client data null!");
                                }
                                AIManager.b(AIManager.this).set(true);
                                AIManager.b(AIManager.this).set(true);
                            } catch (Throwable unused) {
                                AIManager.b(AIManager.this).set(true);
                            }
                        }
                    }, "startAICompute");
                } catch (Throwable unused) {
                    this.d.set(true);
                }
            }
        }
    }

    public static String a(final String str, final String str2, Bundle bundle, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6df5cda0", new Object[]{str, str2, bundle, jSONArray});
        }
        DecisionLogcat.b(f5735a, "getMobileAixData");
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(bundle.getString("mcSalesProd"))) {
            hashMap.put("viScene", "");
        } else {
            hashMap.put("viScene", bundle.getString("mcSalesProd"));
        }
        hashMap.put("biometry_type", Integer.valueOf(IDeviceInfoUtil.a(DecisionContext.getInstance().getContext())));
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.size(); i++) {
                String string = jSONArray.getString(i);
                String str3 = f5735a;
                DecisionLogcat.b(str3, "key:" + string + ", value:" + bundle.get(string));
                if (bundle.get(string) != null) {
                    hashMap.put(string, bundle.get(string));
                }
            }
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final JSONObject jSONObject = new JSONObject();
        try {
            DAI.runComputeByAlias(str, hashMap, new TBDaiCallBack(new TBDaiCallBack.DaiCallback() { // from class: com.alipay.mobile.intelligentdecision.manager.AIManager.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Removed duplicated region for block: B:51:0x0140  */
                @Override // com.alipay.mobile.intelligentdecision.callback.TBDaiCallBack.DaiCallback
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void a(java.lang.Object... r8) {
                    /*
                        Method dump skipped, instructions count: 333
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.intelligentdecision.manager.AIManager.AnonymousClass3.a(java.lang.Object[]):void");
                }

                @Override // com.alipay.mobile.intelligentdecision.callback.TBDaiCallBack.DaiCallback
                public final void a(DAIError dAIError) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e7ac4563", new Object[]{this, dAIError});
                        return;
                    }
                    String b = AIManager.b();
                    DecisionLogcat.b(b, "AiManager onError:" + dAIError.getMessage());
                    JSONObject.this.put("errorMsg", (Object) dAIError.getMessage());
                    countDownLatch.countDown();
                }
            }));
            countDownLatch.await();
        } catch (Throwable th) {
            String str4 = f5735a;
            DecisionLogcat.b(str4, "AiManager runCompute erro:" + th.getMessage());
            jSONObject.put("errorMsg", (Object) ("AiManager runCompute error:" + th.getMessage()));
        }
        return jSONObject.toJSONString();
    }

    public static /* synthetic */ String a(String str, long j, long j2, String str2, String str3, int i, String str4, String str5, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("30917ce", new Object[]{str, new Long(j), new Long(j2), str2, str3, new Integer(i), str4, str5, new Integer(i2)});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("verifyid", (Object) str);
        jSONObject.put(HiAnalyticsConstant.BI_KEY_COST_TIME, (Object) Long.valueOf(j));
        jSONObject.put("current_time", (Object) Long.valueOf(j2));
        jSONObject.put("timing", (Object) str2);
        jSONObject.put("model_scene", (Object) str3);
        jSONObject.put("config_version", (Object) Integer.valueOf(i));
        jSONObject.put("idp", (Object) ("a;" + DecisionEngine.a()));
        jSONObject.put("app_name", (Object) IDeviceInfoUtil.e());
        jSONObject.put("app_version", (Object) IDeviceInfoUtil.f());
        jSONObject.put("device_model", (Object) IDeviceInfoUtil.b());
        if (!TextUtils.isEmpty(str5)) {
            jSONObject.put("exception", (Object) str5);
        } else if (i2 > 0) {
            jSONObject.put("timeout", (Object) Integer.valueOf(i2));
        } else {
            jSONObject.put("model_result", (Object) str4);
        }
        return jSONObject.toJSONString();
    }
}
