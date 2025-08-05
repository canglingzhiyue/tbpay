package com.taobao.analysis.abtest;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.util.ALog;
import anet.channel.util.AppLifecycle;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.dit;
import tb.nrh;

/* loaded from: classes.dex */
public class ABTestCenter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String SPEED_BUCKET_DEFAULT = "";
    private static final String SP_UTABTEST_PRE = "nw_abtest_";
    private static final String TAG = "falco.ABTestManager";
    private static final String UTABTEST_NAMESPACE = "middleware_yixiu";
    private static Method getExperimentBucketIdMethod;
    private static Method getValueMethod;
    private static Method getVariationMethod;
    private static Method isSpeedEditionMethod;
    private static boolean isTbSpeedSdkValid;
    private static boolean isUTABTestValid;
    private static volatile String tbSpeedBucket;
    private static Class tbSpeedClazz;
    private static Class utABTestClazz;
    private static Method utABTestMethod;
    private static Map<String, a> utabTestInfos = new ConcurrentHashMap();
    private static Class variationClazz;
    private static Class variationSetClazz;

    public static /* synthetic */ void access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcd60777", new Object[0]);
        } else {
            updateUTABTestInfo();
        }
    }

    static {
        try {
            Class<?> cls = Class.forName("com.alibaba.ut.abtest.UTABTest");
            utABTestClazz = cls;
            utABTestMethod = cls.getMethod(nrh.TYPE_ACTIVATE, String.class, String.class);
            Class<?> cls2 = Class.forName("com.alibaba.ut.abtest.VariationSet");
            variationSetClazz = cls2;
            getVariationMethod = cls2.getMethod("getVariation", String.class);
            getExperimentBucketIdMethod = variationSetClazz.getMethod("getExperimentBucketId", new Class[0]);
            Class<?> cls3 = Class.forName("com.alibaba.ut.abtest.Variation");
            variationClazz = cls3;
            getValueMethod = cls3.getMethod("getValueAsString", String.class);
            isUTABTestValid = true;
        } catch (Exception e) {
            isUTABTestValid = false;
            ALog.e(TAG, "UTABTest not support.", null, e, new Object[0]);
        }
        try {
            Class<?> cls4 = Class.forName("com.taobao.android.speed.TBSpeed");
            tbSpeedClazz = cls4;
            isSpeedEditionMethod = cls4.getDeclaredMethod("isSpeedEdition", Context.class, String.class);
            isTbSpeedSdkValid = true;
        } catch (Exception e2) {
            isTbSpeedSdkValid = false;
            ALog.e(TAG, "TBSpeed not support.", null, e2, new Object[0]);
        }
        AppLifecycle.registerLifecycleListener(new AppLifecycle.AppLifecycleListener() { // from class: com.taobao.analysis.abtest.ABTestCenter.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // anet.channel.util.AppLifecycle.AppLifecycleListener
            public void forground() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f5402817", new Object[]{this});
                }
            }

            @Override // anet.channel.util.AppLifecycle.AppLifecycleListener
            public void background() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("550392b5", new Object[]{this});
                } else {
                    dit.a(new Runnable() { // from class: com.taobao.analysis.abtest.ABTestCenter.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // java.lang.Runnable
                        public void run() {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            } else {
                                ABTestCenter.access$000();
                            }
                        }
                    });
                }
            }
        });
    }

    public static boolean isTBSpeedEdition(String str) {
        Context context;
        if (isTbSpeedSdkValid) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    context = GlobalAppRuntimeInfo.getContext();
                    if (context == null || isSpeedEditionMethod == null) {
                        return false;
                    }
                } catch (Exception unused) {
                    return false;
                }
            }
            return ((Boolean) isSpeedEditionMethod.invoke(tbSpeedClazz, context, str)).booleanValue();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
        if (r1 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
        r0 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
        if (r1 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
        com.taobao.analysis.abtest.ABTestCenter.tbSpeedBucket = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String getTBSpeedBucket() {
        /*
            java.lang.String r0 = ""
            boolean r1 = com.taobao.analysis.abtest.ABTestCenter.isTbSpeedSdkValid
            r2 = 0
            if (r1 != 0) goto L8
            return r2
        L8:
            java.lang.String r1 = com.taobao.analysis.abtest.ABTestCenter.tbSpeedBucket
            if (r1 == 0) goto Ld
            return r1
        Ld:
            r3 = 0
            java.lang.Class r4 = com.taobao.analysis.abtest.ABTestCenter.tbSpeedClazz     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            java.lang.String r5 = "getSubEdition"
            java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            java.lang.reflect.Method r4 = r4.getDeclaredMethod(r5, r6)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            if (r4 == 0) goto L26
            java.lang.Class r5 = com.taobao.analysis.abtest.ABTestCenter.tbSpeedClazz     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            java.lang.Object r4 = r4.invoke(r5, r6)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
            r1 = r4
        L26:
            if (r1 != 0) goto L29
            goto L3b
        L29:
            r0 = r1
            goto L3b
        L2b:
            r0 = move-exception
            goto L3e
        L2d:
            r4 = move-exception
            java.lang.String r5 = "falco.ABTestManager"
            java.lang.String r6 = "getTbSpeedInfo fail."
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L2b
            anet.channel.util.ALog.e(r5, r6, r2, r4, r3)     // Catch: java.lang.Throwable -> L2b
            if (r1 != 0) goto L29
        L3b:
            com.taobao.analysis.abtest.ABTestCenter.tbSpeedBucket = r0
            return r0
        L3e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.analysis.abtest.ABTestCenter.getTBSpeedBucket():java.lang.String");
    }

    public static String getUTABTestBucketId(String str) {
        String valueOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cf26fbc2", new Object[]{str});
        }
        if (!isUTABTestValid || TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (ABTestCenter.class) {
            Map<String, a> map = utabTestInfos;
            a aVar = map.get(str);
            if (aVar == null) {
                a aVar2 = new a(str, getString(SP_UTABTEST_PRE + str));
                map.put(str, aVar2);
                utabTestInfos = map;
                aVar = aVar2;
            }
            valueOf = String.valueOf(aVar.c);
        }
        return valueOf;
    }

    public static String getUTABTestValue(String str, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de9f6bc", new Object[]{str, str2});
        }
        if (!isUTABTestValid || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        synchronized (ABTestCenter.class) {
            Map<String, a> map = utabTestInfos;
            a aVar = map.get(str);
            if (aVar == null) {
                aVar = new a(str, getString(SP_UTABTEST_PRE + str));
            }
            if (!aVar.b.containsKey(str2)) {
                aVar.b.put(str2, null);
            }
            map.put(str, aVar);
            utabTestInfos = map;
            str3 = aVar.b.get(str2);
        }
        return str3;
    }

    private static void updateUTABTestInfo() {
        a value;
        if (!isUTABTestValid) {
            return;
        }
        try {
            for (Map.Entry<String, a> entry : utabTestInfos.entrySet()) {
                String key = entry.getKey();
                boolean z = true;
                Object invoke = utABTestMethod.invoke(utABTestClazz, UTABTEST_NAMESPACE, key);
                if (invoke != null && (value = entry.getValue()) != null) {
                    a aVar = new a(key);
                    boolean z2 = false;
                    for (Map.Entry<String, String> entry2 : value.b.entrySet()) {
                        String key2 = entry2.getKey();
                        Object invoke2 = getVariationMethod.invoke(invoke, key2);
                        if (invoke2 == null) {
                            break;
                        }
                        String str = (String) getValueMethod.invoke(invoke2, "");
                        aVar.b.put(key2, str);
                        if (!TextUtils.isEmpty(str) && !str.equals(entry2.getValue())) {
                            z2 = true;
                        }
                    }
                    long longValue = ((Long) getExperimentBucketIdMethod.invoke(invoke, new Object[0])).longValue();
                    aVar.c = longValue;
                    if (longValue == value.c) {
                        z = z2;
                    }
                    if (z) {
                        putString(SP_UTABTEST_PRE + key, aVar.toString());
                    }
                }
                return;
            }
        } catch (Throwable th) {
            ALog.e(TAG, "updateUTABTestInfo error.", null, th, new Object[0]);
        }
    }

    private static void putString(String str, String str2) {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb567a1b", new Object[]{str, str2});
        } else if (TextUtils.isEmpty(str) || (context = GlobalAppRuntimeInfo.getContext()) == null) {
        } else {
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(context).edit();
            edit.putString(str, str2);
            edit.apply();
        }
    }

    private static String getString(String str) {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ba42c148", new Object[]{str});
        }
        if (TextUtils.isEmpty(str) || (context = GlobalAppRuntimeInfo.getContext()) == null) {
            return null;
        }
        return PreferenceManager.getDefaultSharedPreferences(context).getString(str, null);
    }
}
