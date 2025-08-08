package com.alipay.mobile.intelligentdecision.log;

import android.content.SharedPreferences;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.intelligentdecision.DecisionContext;
import com.alipay.mobile.intelligentdecision.FutureHelper;
import com.alipay.mobile.intelligentdecision.IDeviceInfoUtil;
import com.alipay.mobile.intelligentdecision.engine.DecisionEngine;
import com.alipay.mobile.intelligentdecision.manager.IDCacheManager;
import com.alipay.mobile.intelligentdecision.manager.LogReportManager;
import com.alipay.mobile.intelligentdecision.rpc.FrameworkUtils;
import com.alipay.mobile.verifyidentity.utils.task.AsyncTaskExecutor;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.riy;

/* loaded from: classes3.dex */
public class DecisonLogBehavior {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final String f5728a = "DecisonLogBehavior";
    private static volatile DecisonLogBehavior c;
    private static Map<String, StringBuffer> f = new HashMap();
    private BlockingQueue<a> d = new ArrayBlockingQueue(100);
    private AtomicBoolean e = new AtomicBoolean(false);
    private AtomicBoolean g = new AtomicBoolean(true);
    public AtomicBoolean b = new AtomicBoolean(true);

    /* loaded from: classes3.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public String f5734a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
        public Map<String, String> g;

        public a(String str, String str2, String str3, String str4, String str5, String str6, Map<String, String> map) {
            this.f5734a = str;
            this.b = str2;
            this.c = str4;
            this.d = str5;
            this.e = str6;
            this.f = str3;
            this.g = map;
        }
    }

    public static /* synthetic */ String a(DecisonLogBehavior decisonLogBehavior, String str, String str2, String str3, Bundle bundle) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8ad8fa39", new Object[]{decisonLogBehavior, str, str2, str3, bundle}) : decisonLogBehavior.a(str, str2, str3, bundle);
    }

    public static /* synthetic */ StringBuffer a(DecisonLogBehavior decisonLogBehavior, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (StringBuffer) ipChange.ipc$dispatch("2e75be87", new Object[]{decisonLogBehavior, str}) : decisonLogBehavior.b(str);
    }

    public static /* synthetic */ BlockingQueue a(DecisonLogBehavior decisonLogBehavior) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BlockingQueue) ipChange.ipc$dispatch("fa1cb32", new Object[]{decisonLogBehavior}) : decisonLogBehavior.d;
    }

    public static /* synthetic */ void a(DecisonLogBehavior decisonLogBehavior, JSONObject jSONObject, String str, String str2, String str3, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98b87c55", new Object[]{decisonLogBehavior, jSONObject, str, str2, str3, bundle});
        } else {
            decisonLogBehavior.a(jSONObject, str, str2, str3, bundle);
        }
    }

    public static /* synthetic */ void a(DecisonLogBehavior decisonLogBehavior, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4186363", new Object[]{decisonLogBehavior, str, str2});
        } else {
            decisonLogBehavior.b(str, str2);
        }
    }

    public static /* synthetic */ void a(DecisonLogBehavior decisonLogBehavior, String str, StringBuffer stringBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6f966c3", new Object[]{decisonLogBehavior, str, stringBuffer});
        } else {
            decisonLogBehavior.a(str, stringBuffer);
        }
    }

    public static /* synthetic */ void a(String str, long j, JSONObject jSONObject, String str2, SharedPreferences sharedPreferences, String str3, String str4, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ee32674", new Object[]{str, new Long(j), jSONObject, str2, sharedPreferences, str3, str4, new Long(j2)});
        } else {
            b(str, j, jSONObject, str2, sharedPreferences, str3, str4, j2);
        }
    }

    public static /* synthetic */ String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]) : f5728a;
    }

    public static /* synthetic */ AtomicBoolean b(DecisonLogBehavior decisonLogBehavior) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("e8eaa6d0", new Object[]{decisonLogBehavior}) : decisonLogBehavior.b;
    }

    public static /* synthetic */ void b(DecisonLogBehavior decisonLogBehavior, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("377ed2a4", new Object[]{decisonLogBehavior, str, str2});
        } else {
            decisonLogBehavior.a(str, str2);
        }
    }

    public static /* synthetic */ AtomicBoolean c(DecisonLogBehavior decisonLogBehavior) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("c9f6e151", new Object[]{decisonLogBehavior}) : decisonLogBehavior.g;
    }

    private DecisonLogBehavior() {
    }

    public static DecisonLogBehavior a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DecisonLogBehavior) ipChange.ipc$dispatch("e2cbf595", new Object[0]);
        }
        if (c == null) {
            synchronized (DecisonLogBehavior.class) {
                if (c == null) {
                    c = new DecisonLogBehavior();
                }
            }
        }
        return c;
    }

    private synchronized void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.e.getAndSet(true)) {
        } else {
            AsyncTaskExecutor.getInstance().execute(new Runnable() { // from class: com.alipay.mobile.intelligentdecision.log.DecisonLogBehavior.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public final void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    while (true) {
                        try {
                            a aVar = (a) DecisonLogBehavior.a(DecisonLogBehavior.this).take();
                            if (aVar.f5734a.equalsIgnoreCase("behavior")) {
                                if (aVar.b.equalsIgnoreCase("190916-1")) {
                                    String a2 = DecisonLogBehavior.a("", aVar.b, aVar.f, aVar.c, aVar.d, aVar.e, aVar.g);
                                    StringBuffer stringBuffer = new StringBuffer();
                                    stringBuffer.append(a2);
                                    DecisonLogBehavior decisonLogBehavior = DecisonLogBehavior.this;
                                    DecisonLogBehavior.a(decisonLogBehavior, aVar.f + "_" + aVar.c, stringBuffer);
                                    String b = DecisonLogBehavior.b();
                                    DecisionLogcat.b(b, "190916-1 key:" + aVar.f + "_" + aVar.c);
                                } else if (aVar.b.equalsIgnoreCase("190916-2")) {
                                    DecisonLogBehavior decisonLogBehavior2 = DecisonLogBehavior.this;
                                    DecisonLogBehavior.a(decisonLogBehavior2, aVar.f + "_" + aVar.c, DecisonLogBehavior.a("endSymbol", aVar.b, aVar.d, aVar.e, aVar.g));
                                    DecisonLogBehavior decisonLogBehavior3 = DecisonLogBehavior.this;
                                    String stringBuffer2 = DecisonLogBehavior.a(decisonLogBehavior3, aVar.f + "_" + aVar.c).toString();
                                    String b2 = DecisonLogBehavior.b();
                                    StringBuilder sb = new StringBuilder("result behavior:");
                                    sb.append(stringBuffer2);
                                    DecisionLogcat.b(b2, sb.toString());
                                    String str = "";
                                    if (aVar.g != null) {
                                        str = aVar.g.get("needReport");
                                    }
                                    if (StringUtils.isEmpty(str) || !"N".equalsIgnoreCase(str)) {
                                        LogReportManager.a().a(stringBuffer2);
                                    }
                                    DecisonLogBehavior a3 = DecisonLogBehavior.a();
                                    a3.a(aVar.f + "_" + aVar.c);
                                } else if (aVar.b.equalsIgnoreCase("191121-4")) {
                                    Map<String, String> map = aVar.g;
                                    if (map != null) {
                                        String str2 = map.get("strategy_version");
                                        if (!StringUtils.isEmpty(str2)) {
                                            DecisonLogBehavior decisonLogBehavior4 = DecisonLogBehavior.this;
                                            DecisonLogBehavior.b(decisonLogBehavior4, aVar.f + "_" + aVar.c, str2);
                                        }
                                    }
                                } else {
                                    String a4 = DecisonLogBehavior.a((String) null, aVar.b, aVar.d, aVar.e, aVar.g);
                                    String b3 = DecisonLogBehavior.b();
                                    DecisionLogcat.b(b3, aVar.b + " key:" + aVar.f + "_" + aVar.c + ",log:" + a4);
                                    DecisonLogBehavior decisonLogBehavior5 = DecisonLogBehavior.this;
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(aVar.f);
                                    sb2.append("_");
                                    sb2.append(aVar.c);
                                    DecisonLogBehavior.a(decisonLogBehavior5, sb2.toString(), a4);
                                }
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }, "logBehavior");
        }
    }

    private synchronized StringBuffer b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StringBuffer) ipChange.ipc$dispatch("346189ad", new Object[]{this, str});
        } else if (str != null) {
            StringBuffer stringBuffer = f.get(str);
            if (stringBuffer == null) {
                stringBuffer = new StringBuffer("");
                a(str, stringBuffer);
            }
            return stringBuffer;
        } else {
            return new StringBuffer("");
        }
    }

    private synchronized void a(String str, StringBuffer stringBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("290cda1c", new Object[]{this, str, stringBuffer});
            return;
        }
        if (str != null) {
            f.put(str, stringBuffer);
        }
    }

    private synchronized void a(String str, String str2) {
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else if (f == null) {
        } else {
            StringBuffer stringBuffer = f.get(str);
            if (stringBuffer != null && (indexOf = stringBuffer.indexOf("DEFAULT_VERSION")) != -1) {
                stringBuffer.replace(indexOf, indexOf + 15, str2);
            }
        }
    }

    public final synchronized void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        if (str != null) {
            f.remove(str);
        }
    }

    private synchronized void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
        } else {
            b(str).append(str2);
        }
    }

    private static String a(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8d869137", new Object[]{str, str2, map});
        }
        return c(str) + ";" + c(str2) + ";" + a(map);
    }

    private static String c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b82f346c", new Object[]{str}) : !StringUtils.isEmpty(str) ? str.replace("&", "＆").replace("=", "＝").replace(riy.ARRAY_START_STR, "［").replace(riy.ARRAY_END_STR, "］").replace(";", "；").replace(",", "，").replace(riy.BRACKET_START_STR, "（").replace(riy.BRACKET_END_STR, "）").replace("\r", " ").replace("\n", " ") : "-";
    }

    private static String a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1a4c023", new Object[]{map});
        }
        if (map == null) {
            return "-";
        }
        ArrayList arrayList = new ArrayList(map.keySet());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arrayList.size(); i++) {
            String str = (String) arrayList.get(i);
            String str2 = map.get(str);
            if (i == arrayList.size() - 1 && !StringUtils.isEmpty(str2)) {
                sb.append(str);
                sb.append("=");
                sb.append(c(str2));
            } else if (!StringUtils.isEmpty(str2)) {
                sb.append(str);
                sb.append("=");
                sb.append(c(str2));
                sb.append("&");
            }
        }
        if (sb.toString().endsWith("&")) {
            return sb.toString().substring(0, sb.toString().length() - 1);
        }
        return sb.toString();
    }

    private static String d(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f4d254b", new Object[]{str}) : StringUtils.isEmpty(str) ? "-" : str;
    }

    private static String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[0]) : new SimpleDateFormat("HH:mm:ss:SSS").format(new Date());
    }

    public final void a(JSONObject jSONObject, final String str, String str2, final String str3, final Bundle bundle) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd44a7ae", new Object[]{this, jSONObject, str, str2, str3, bundle});
        } else if (jSONObject == null) {
            DecisionLogcat.b(f5728a, "startCollectClientData 3");
        } else {
            final JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            if (jSONObject2 == null) {
                DecisionLogcat.b(f5728a, "startCollectClientData 4");
            } else if (!jSONObject2.getBooleanValue("enable")) {
                DecisionLogcat.b(f5728a, "startCollectClientData 5");
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
                JSONArray jSONArray2 = jSONObject2.getJSONArray("scene_whitelist");
                if (jSONArray2 != null && jSONArray2.size() > 0 && !StringUtils.isEmpty(str2)) {
                    String str4 = f5728a;
                    DecisionLogcat.b(str4, "startCollectClientData 6: " + jSONArray2.toJSONString());
                    if (!jSONArray2.contains(str2)) {
                        return;
                    }
                }
                int intValue = jSONObject2.getIntValue("delay");
                if (intValue > 0) {
                    String str5 = f5728a;
                    DecisionLogcat.b(str5, "need delay:" + intValue);
                    try {
                        Thread.sleep(intValue);
                    } catch (Throwable unused) {
                        DecisionLogcat.b(f5728a, "delay error");
                    }
                }
                final String string2 = jSONObject2.getString("extract_scene");
                if (!this.g.get()) {
                    DecisionLogcat.b(f5728a, "have start collect, so return");
                    return;
                }
                this.g.set(false);
                try {
                    AsyncTaskExecutor.getInstance().execute(new Runnable() { // from class: com.alipay.mobile.intelligentdecision.log.DecisonLogBehavior.3
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public final void run() {
                            long j;
                            int intValue2;
                            JSONObject jSONObject3;
                            String str6;
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                return;
                            }
                            long currentTimeMillis = System.currentTimeMillis();
                            try {
                                intValue2 = jSONObject2.getIntValue("timeout");
                            } catch (Throwable unused2) {
                                j = currentTimeMillis;
                            }
                            if (intValue2 < 0) {
                                DecisonLogBehavior.c(DecisonLogBehavior.this).set(true);
                                long currentTimeMillis2 = System.currentTimeMillis();
                                String b = DecisonLogBehavior.b();
                                DecisionLogcat.b(b, "generateString 1cost:" + (currentTimeMillis2 - currentTimeMillis));
                                DecisonLogBehavior.c(DecisonLogBehavior.this).set(true);
                                return;
                            }
                            String b2 = DecisonLogBehavior.b();
                            DecisionLogcat.b(b2, "start collect:" + intValue2);
                            long currentTimeMillis3 = System.currentTimeMillis();
                            Object a2 = new FutureHelper().a(new Callable<Object>() { // from class: com.alipay.mobile.intelligentdecision.log.DecisonLogBehavior.3.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        return ipChange3.ipc$dispatch("6d249ded", new Object[]{this});
                                    }
                                    try {
                                        return DecisonLogBehavior.a(DecisonLogBehavior.this, str3, string2, str, bundle);
                                    } catch (Exception e) {
                                        return "call exception:" + e.getMessage();
                                    }
                                }
                            }, (long) intValue2);
                            long currentTimeMillis4 = System.currentTimeMillis();
                            String b3 = DecisonLogBehavior.b();
                            DecisionLogcat.b(b3, "generateString 3cost:" + (currentTimeMillis4 - currentTimeMillis));
                            try {
                                if (a2 != null) {
                                    String valueOf = String.valueOf(a2);
                                    long currentTimeMillis5 = System.currentTimeMillis();
                                    SharedPreferences sharedPreferences = IDCacheManager.a(DecisionContext.getInstance().getContext()).f5743a;
                                    j = currentTimeMillis;
                                    if ("TIME_OUT".equalsIgnoreCase(valueOf)) {
                                        jSONObject3 = new JSONObject();
                                        jSONObject3.put("verifyid", (Object) str3);
                                        jSONObject3.put("timeout", (Object) Integer.valueOf(intValue2));
                                        jSONObject3.put(HiAnalyticsConstant.BI_KEY_COST_TIME, (Object) Long.valueOf(currentTimeMillis5 - currentTimeMillis3));
                                        jSONObject3.put("current_time", (Object) Long.valueOf(currentTimeMillis5));
                                        jSONObject3.put("timing", (Object) str);
                                        jSONObject3.put("extract_scene", (Object) string2);
                                        jSONObject3.put("config_version", (Object) Integer.valueOf(sharedPreferences.getInt("extractConfig_version_" + FrameworkUtils.getUserId(), 0)));
                                        jSONObject3.put("idp", (Object) ("a;" + DecisionEngine.a()));
                                        jSONObject3.put("app_name", (Object) IDeviceInfoUtil.e());
                                        jSONObject3.put("app_version", (Object) IDeviceInfoUtil.f());
                                        jSONObject3.put("device_model", (Object) IDeviceInfoUtil.b());
                                    } else {
                                        if (!valueOf.startsWith("EXCEPTION") && !valueOf.startsWith("call exception")) {
                                            str6 = valueOf;
                                            String b4 = DecisonLogBehavior.b();
                                            DecisionLogcat.b(b4, "get client data:" + str6);
                                            LogReportManager.a().a(str6, "feature");
                                            long currentTimeMillis6 = System.currentTimeMillis();
                                            String b5 = DecisonLogBehavior.b();
                                            DecisionLogcat.b(b5, "generateString 4cost:" + (currentTimeMillis6 - j));
                                        }
                                        jSONObject3 = new JSONObject();
                                        jSONObject3.put("verifyid", (Object) str3);
                                        jSONObject3.put("exception", (Object) valueOf);
                                        jSONObject3.put(HiAnalyticsConstant.BI_KEY_COST_TIME, (Object) Long.valueOf(currentTimeMillis5 - currentTimeMillis3));
                                        jSONObject3.put("current_time", (Object) Long.valueOf(currentTimeMillis5));
                                        jSONObject3.put("extract_scene", (Object) string2);
                                        jSONObject3.put("timing", (Object) str);
                                        jSONObject3.put("config_version", (Object) Integer.valueOf(sharedPreferences.getInt("extractConfig_version_" + FrameworkUtils.getUserId(), 0)));
                                        jSONObject3.put("idp", (Object) ("a;" + DecisionEngine.a()));
                                        jSONObject3.put("app_name", (Object) IDeviceInfoUtil.e());
                                        jSONObject3.put("app_version", (Object) IDeviceInfoUtil.f());
                                        jSONObject3.put("device_model", (Object) IDeviceInfoUtil.b());
                                    }
                                    str6 = jSONObject3.toJSONString();
                                    String b42 = DecisonLogBehavior.b();
                                    DecisionLogcat.b(b42, "get client data:" + str6);
                                    LogReportManager.a().a(str6, "feature");
                                    long currentTimeMillis62 = System.currentTimeMillis();
                                    String b52 = DecisonLogBehavior.b();
                                    DecisionLogcat.b(b52, "generateString 4cost:" + (currentTimeMillis62 - j));
                                } else {
                                    j = currentTimeMillis;
                                    LogReportManager.a().a("get client data null!", "feature");
                                    DecisionLogcat.b(DecisonLogBehavior.b(), "get client data null!");
                                }
                                long currentTimeMillis7 = System.currentTimeMillis();
                                String b6 = DecisonLogBehavior.b();
                                DecisionLogcat.b(b6, "generateString 5cost:" + (currentTimeMillis7 - j));
                                DecisonLogBehavior.c(DecisonLogBehavior.this).set(true);
                            } catch (Throwable unused3) {
                                DecisonLogBehavior.c(DecisonLogBehavior.this).set(true);
                                long currentTimeMillis8 = System.currentTimeMillis();
                                String b7 = DecisonLogBehavior.b();
                                DecisionLogcat.b(b7, "generateString 6cost:" + (currentTimeMillis8 - j));
                            }
                            long currentTimeMillis82 = System.currentTimeMillis();
                            String b72 = DecisonLogBehavior.b();
                            DecisionLogcat.b(b72, "generateString 6cost:" + (currentTimeMillis82 - j));
                        }
                    }, "");
                } catch (Throwable th) {
                    String str6 = f5728a;
                    DecisionLogcat.b(str6, "generateString error:" + th.getMessage());
                    this.g.set(true);
                }
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:6|(3:28|29|(12:33|(1:10)(1:27)|11|12|13|14|15|16|17|18|19|20))|8|(0)(0)|11|12|13|14|15|16|17|18|19|20) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0196, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0198, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0199, code lost:
        r19 = r12;
        r18 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x019d, code lost:
        r1 = com.alipay.mobile.intelligentdecision.log.DecisonLogBehavior.f5728a;
        com.alipay.mobile.intelligentdecision.log.DecisionLogcat.b(r1, "runCompute error:" + r0.getMessage());
        r4 = java.lang.System.currentTimeMillis() - r19;
        b("runCompute error:" + r0.getMessage(), r4, r18, r22, r15, r24, r23, r19);
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String a(final java.lang.String r22, final java.lang.String r23, final java.lang.String r24, android.os.Bundle r25) {
        /*
            Method dump skipped, instructions count: 479
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.intelligentdecision.log.DecisonLogBehavior.a(java.lang.String, java.lang.String, java.lang.String, android.os.Bundle):java.lang.String");
    }

    private static void b(String str, long j, JSONObject jSONObject, String str2, SharedPreferences sharedPreferences, String str3, String str4, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88707835", new Object[]{str, new Long(j), jSONObject, str2, sharedPreferences, str3, str4, new Long(j2)});
            return;
        }
        try {
            jSONObject.put("verifyid", (Object) str2);
            jSONObject.put("exception", (Object) str);
            jSONObject.put("config_version", (Object) Integer.valueOf(sharedPreferences.getInt("extractConfig_version_" + FrameworkUtils.getUserId(), 0)));
            jSONObject.put("idp", (Object) ("a;" + DecisionEngine.a()));
            jSONObject.put("timing", (Object) str3);
            jSONObject.put("extract_scene", (Object) str4);
            jSONObject.put("current_time", (Object) Long.valueOf(j2));
            jSONObject.put(HiAnalyticsConstant.BI_KEY_COST_TIME, (Object) Long.valueOf(j));
            jSONObject.put("app_name", (Object) IDeviceInfoUtil.e());
            jSONObject.put("app_version", (Object) IDeviceInfoUtil.f());
            jSONObject.put("device_model", (Object) IDeviceInfoUtil.b());
        } catch (Throwable th) {
            String str5 = f5728a;
            DecisionLogcat.b(str5, "buildErrorMsg error:" + th.getMessage());
        }
    }

    public final void a(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19b0c1eb", new Object[]{this, str, str2, str3, str4, str5, map});
            return;
        }
        try {
            c();
            this.d.offer(new a("behavior", str, str2, str3, str4, str5, map));
        } catch (Throwable th) {
            String str6 = f5728a;
            DecisionLogcat.b(str6, "logCommon error:" + th.getMessage());
        }
    }

    public static /* synthetic */ String a(String str, String str2, String str3, String str4, String str5, String str6, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e117455f", new Object[]{str, str2, str3, str4, str5, str6, map});
        }
        String str7 = str.equalsIgnoreCase("behavior") ? ")]" : riy.BRACKET_END_STR;
        StringBuilder sb = new StringBuilder();
        String str8 = StringUtils.isEmpty(str6) ? "DEFAULT_VERSION" : str6;
        sb.append("[(" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS").format(new Date()) + ";" + DecisionEngine.a() + ";" + IDeviceInfoUtil.a() + ";" + IDeviceInfoUtil.b() + ";" + IDeviceInfoUtil.c() + ";" + IDeviceInfoUtil.d() + ";" + d(FrameworkUtils.getUserId()) + ";" + d(str3) + ";" + d(IDeviceInfoUtil.e()) + ";" + d(IDeviceInfoUtil.f()) + ";" + d(str8) + ";" + str4 + riy.BRACKET_END_STR);
        sb.append(",(");
        sb.append(str2);
        sb.append(";");
        sb.append(d());
        sb.append(";");
        sb.append(a(str5, str6, map));
        sb.append(str7);
        return sb.toString();
    }

    public static /* synthetic */ String a(String str, String str2, String str3, String str4, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9b0684b", new Object[]{str, str2, str3, str4, map});
        }
        String str5 = "endSymbol".equalsIgnoreCase(str) ? ")]" : riy.BRACKET_END_STR;
        return ",(" + str2 + ";" + d() + ";" + a(str3, str4, map) + str5;
    }
}
