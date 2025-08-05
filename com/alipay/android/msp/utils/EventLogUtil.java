package com.alipay.android.msp.utils;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class EventLogUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String BIZ_TYPE = "pay";
    private static final String BIZ_TYPE_PAYIMP = "payimp";

    /* loaded from: classes3.dex */
    public static final class SpecificEvent {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static void wearableUsage(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("52e35459", new Object[]{str});
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("value", str);
            EventLogUtil.logPayEvent("1010970", hashMap);
        }
    }

    public static Map<String, String> buildEventParams(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("21a00f3b", new Object[]{strArr});
        }
        if (strArr == null || strArr.length <= 0) {
            return new HashMap();
        }
        if (strArr.length % 2 != 0) {
            throw new RuntimeException("params 必须为双数");
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < strArr.length; i += 2) {
            hashMap.put(strArr[i], strArr[i + 1]);
        }
        return hashMap;
    }

    public static void logPayEvent(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6109585e", new Object[]{str, map});
        } else {
            PhoneCashierMspEngine.getMspLog().walletEventLog(str, "pay", map);
        }
    }

    public static void logPayImpEvent(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d98c702", new Object[]{str, map});
        } else {
            PhoneCashierMspEngine.getMspLog().walletEventLog(str, BIZ_TYPE_PAYIMP, map);
        }
    }

    public static void logPayEvent(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cfaad78", new Object[]{str, strArr});
        } else {
            logPayEvent(str, buildEventParams(strArr));
        }
    }

    public static void logPayEvent(String str, Pair<String, String>... pairArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbaa2ec", new Object[]{str, pairArr});
            return;
        }
        HashMap hashMap = new HashMap();
        if (pairArr != null && pairArr.length > 0) {
            for (Pair<String, String> pair : pairArr) {
                hashMap.put((String) pair.first, (String) pair.second);
            }
        }
        logPayEvent(str, hashMap);
    }

    public static Map<String, String> getLocalInvokeInfoForAppInvoke(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d8431f97", new Object[]{bundle});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("ts_scheme_invoked", String.valueOf(SystemClock.elapsedRealtime()));
        try {
            String string = bundle.getString("mqpLoc");
            if (!TextUtils.isEmpty(string)) {
                JSONObject parseObject = JSON.parseObject(string);
                for (String str : parseObject.keySet()) {
                    hashMap.put(str, parseObject.getString(str));
                }
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
        return hashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void walletSpmTrack(java.lang.Object r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.util.Map<java.lang.String, java.lang.String> r11, java.lang.String r12) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = com.alipay.android.msp.utils.EventLogUtil.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 3
            r4 = 1
            r5 = 2
            if (r1 == 0) goto L24
            r1 = 7
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r6
            r1[r4] = r7
            r1[r5] = r8
            r1[r3] = r9
            r6 = 4
            r1[r6] = r10
            r6 = 5
            r1[r6] = r11
            r6 = 6
            r1[r6] = r12
            java.lang.String r6 = "368a90"
            r0.ipc$dispatch(r6, r1)
            return
        L24:
            boolean r9 = android.text.TextUtils.isEmpty(r8)
            if (r9 != 0) goto L33
            int r8 = java.lang.Integer.parseInt(r8)     // Catch: java.lang.NumberFormatException -> L2f
            goto L34
        L2f:
            r8 = move-exception
            com.alipay.android.msp.utils.LogUtil.printExceptionStackTrace(r8)
        L33:
            r8 = 2
        L34:
            r9 = -1
            int r0 = r12.hashCode()
            switch(r0) {
                case -1926005497: goto L5b;
                case -1352294148: goto L51;
                case 94750088: goto L47;
                case 1557372922: goto L3d;
                default: goto L3c;
            }
        L3c:
            goto L64
        L3d:
            java.lang.String r0 = "destroy"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L64
            r9 = 1
            goto L64
        L47:
            java.lang.String r0 = "click"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L64
            r9 = 2
            goto L64
        L51:
            java.lang.String r0 = "create"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L64
            r9 = 0
            goto L64
        L5b:
            java.lang.String r0 = "exposure"
            boolean r12 = r12.equals(r0)
            if (r12 == 0) goto L64
            r9 = 3
        L64:
            if (r9 == 0) goto L7c
            if (r9 == r4) goto L75
            if (r9 == r5) goto L71
            if (r9 == r3) goto L6d
            goto L70
        L6d:
            com.alipay.android.phone.wallet.spmtracker.SpmTracker.expose(r6, r10, r7, r8, r11)
        L70:
            return
        L71:
            com.alipay.android.phone.wallet.spmtracker.SpmTracker.click(r6, r10, r7, r8, r11)
            return
        L75:
            com.alipay.android.phone.wallet.spmtracker.SpmTracker.onPagePause(r6, r10, r7, r11)
            com.alipay.android.phone.wallet.spmtracker.SpmTracker.onPageDestroy(r6)
            return
        L7c:
            com.alipay.android.phone.wallet.spmtracker.SpmTracker.onPageCreate(r6, r10)
            com.alipay.android.phone.wallet.spmtracker.SpmTracker.onPageResume(r6, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.utils.EventLogUtil.walletSpmTrack(java.lang.Object, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map, java.lang.String):void");
    }
}
