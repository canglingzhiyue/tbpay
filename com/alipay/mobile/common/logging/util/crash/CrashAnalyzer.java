package com.alipay.mobile.common.logging.util.crash;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class CrashAnalyzer {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static List<CrashInfoDO> f5470a;

    public static void analyzeJavaCrash(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34154d2", new Object[]{context, str});
        }
    }

    public static synchronized List<CrashInfoDO> getHistoryCrashTypes(Context context) {
        synchronized (CrashAnalyzer.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("8ebb6b16", new Object[]{context});
            }
            ArrayList arrayList = new ArrayList();
            if (context == null) {
                return arrayList;
            }
            if (f5470a != null) {
                arrayList.addAll(f5470a);
                return arrayList;
            }
            f5470a = new ArrayList();
            SharedPreferences a2 = a(context);
            if (a2 == null) {
                throw new RuntimeException("SP is null");
            }
            String string = a2.getString(CrashConstants.SP_KEY_CRASH_TYPES, "");
            if (!TextUtils.isEmpty(string)) {
                JSONArray jSONArray = new JSONArray(string);
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    CrashInfoDO crashInfoDO = new CrashInfoDO();
                    crashInfoDO.parse(jSONObject);
                    f5470a.add(crashInfoDO);
                }
            }
            arrayList.addAll(f5470a);
            return arrayList;
        }
    }

    private static synchronized void a(Context context, List<CrashInfoDO> list) {
        synchronized (CrashAnalyzer.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9773151", new Object[]{context, list});
            } else if (context != null && list != null) {
                if (f5470a == null) {
                    f5470a = new ArrayList();
                }
                f5470a.clear();
                f5470a.addAll(list);
                SharedPreferences a2 = a(context);
                if (a2 == null) {
                    throw new RuntimeException("SP is null");
                }
                JSONArray jSONArray = new JSONArray();
                for (CrashInfoDO crashInfoDO : f5470a) {
                    jSONArray.put(crashInfoDO.toJsonObject());
                }
                a2.edit().putString(CrashConstants.SP_KEY_CRASH_TYPES, jSONArray.toString()).commit();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0243 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:172:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0092 A[Catch: Throwable -> 0x01b7, TryCatch #7 {Throwable -> 0x01b7, blocks: (B:21:0x006a, B:24:0x0074, B:26:0x0088, B:28:0x0092, B:29:0x0099, B:31:0x00a1, B:32:0x00aa, B:34:0x00b0, B:35:0x00b9, B:37:0x00bf, B:38:0x00ca, B:41:0x00d2, B:43:0x00d8, B:45:0x00de, B:47:0x00e4, B:50:0x00f0, B:56:0x010d, B:59:0x0119, B:66:0x0138, B:68:0x0140, B:70:0x0149, B:72:0x0151, B:74:0x015a, B:77:0x0164, B:79:0x016d, B:81:0x0175, B:83:0x017f, B:84:0x018a, B:86:0x0192, B:88:0x019a, B:61:0x0124, B:52:0x00fb), top: B:160:0x006a }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a1 A[Catch: Throwable -> 0x01b7, TryCatch #7 {Throwable -> 0x01b7, blocks: (B:21:0x006a, B:24:0x0074, B:26:0x0088, B:28:0x0092, B:29:0x0099, B:31:0x00a1, B:32:0x00aa, B:34:0x00b0, B:35:0x00b9, B:37:0x00bf, B:38:0x00ca, B:41:0x00d2, B:43:0x00d8, B:45:0x00de, B:47:0x00e4, B:50:0x00f0, B:56:0x010d, B:59:0x0119, B:66:0x0138, B:68:0x0140, B:70:0x0149, B:72:0x0151, B:74:0x015a, B:77:0x0164, B:79:0x016d, B:81:0x0175, B:83:0x017f, B:84:0x018a, B:86:0x0192, B:88:0x019a, B:61:0x0124, B:52:0x00fb), top: B:160:0x006a }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b0 A[Catch: Throwable -> 0x01b7, TryCatch #7 {Throwable -> 0x01b7, blocks: (B:21:0x006a, B:24:0x0074, B:26:0x0088, B:28:0x0092, B:29:0x0099, B:31:0x00a1, B:32:0x00aa, B:34:0x00b0, B:35:0x00b9, B:37:0x00bf, B:38:0x00ca, B:41:0x00d2, B:43:0x00d8, B:45:0x00de, B:47:0x00e4, B:50:0x00f0, B:56:0x010d, B:59:0x0119, B:66:0x0138, B:68:0x0140, B:70:0x0149, B:72:0x0151, B:74:0x015a, B:77:0x0164, B:79:0x016d, B:81:0x0175, B:83:0x017f, B:84:0x018a, B:86:0x0192, B:88:0x019a, B:61:0x0124, B:52:0x00fb), top: B:160:0x006a }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bf A[Catch: Throwable -> 0x01b7, TryCatch #7 {Throwable -> 0x01b7, blocks: (B:21:0x006a, B:24:0x0074, B:26:0x0088, B:28:0x0092, B:29:0x0099, B:31:0x00a1, B:32:0x00aa, B:34:0x00b0, B:35:0x00b9, B:37:0x00bf, B:38:0x00ca, B:41:0x00d2, B:43:0x00d8, B:45:0x00de, B:47:0x00e4, B:50:0x00f0, B:56:0x010d, B:59:0x0119, B:66:0x0138, B:68:0x0140, B:70:0x0149, B:72:0x0151, B:74:0x015a, B:77:0x0164, B:79:0x016d, B:81:0x0175, B:83:0x017f, B:84:0x018a, B:86:0x0192, B:88:0x019a, B:61:0x0124, B:52:0x00fb), top: B:160:0x006a }] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void analyzeNativeCrash(android.content.Context r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 651
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.common.logging.util.crash.CrashAnalyzer.analyzeNativeCrash(android.content.Context, java.lang.String):void");
    }

    private static SharedPreferences a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("6ebdfd34", new Object[]{context});
        }
        try {
            return context.getSharedPreferences(CrashConstants.SP_NAME, 4);
        } catch (Throwable th) {
            LoggerFactory.getTraceLogger().error("CrashAnalyzer", "readAndParseStrategy", th);
            return null;
        }
    }
}
