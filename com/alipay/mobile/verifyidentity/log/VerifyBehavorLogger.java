package com.alipay.mobile.verifyidentity.log;

import com.alipay.mobile.verifyidentity.info.AppInfo;
import com.alipay.mobile.verifyidentity.log.behavior.VerifyLogger;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.p;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class VerifyBehavorLogger {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LOG_BIZ_TYPE = "VerifyIdentity";

    public static void logBehavor(BehaviourIdEnum behaviourIdEnum, String str, String str2, String str3, String str4, String str5, String str6, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a7c3ce6", new Object[]{behaviourIdEnum, str, str2, str3, str4, str5, str6, map});
        } else {
            logBehavor(behaviourIdEnum, str, str2, str3, str4, str5, str6, map, 2);
        }
    }

    public static void logBehavor(BehaviourIdEnum behaviourIdEnum, String str, String str2, String str3, String str4, String str5, String str6, Map<String, String> map, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("250bd2dd", new Object[]{behaviourIdEnum, str, str2, str3, str4, str5, str6, map, new Integer(i)});
        } else {
            logBehavor(behaviourIdEnum, str, str2, str3, str4, str5, str6, map, i, LOG_BIZ_TYPE);
        }
    }

    public static void logBehavor(BehaviourIdEnum behaviourIdEnum, String str, String str2, String str3, String str4, String str5, String str6, Map<String, String> map, int i, String str7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb56df67", new Object[]{behaviourIdEnum, str, str2, str3, str4, str5, str6, map, new Integer(i), str7});
        } else {
            VerifyLogger.getInstance().verifyBehavior(str, str4, str5, str6, map);
        }
    }

    public static void logBehavor(BehaviourIdEnum behaviourIdEnum, VerifyBehavor verifyBehavor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c0225b", new Object[]{behaviourIdEnum, verifyBehavor});
        } else if (verifyBehavor == null) {
            VerifyLogCat.w("VerifyBehavorLogger", "verifyBehavor is null");
        } else {
            VerifyLogger.getInstance().verifyBehavior(verifyBehavor.getUserCaseID(), verifyBehavor.getParam1(), verifyBehavor.getParam2(), verifyBehavor.getParam3(), verifyBehavor.getExtParams());
        }
    }

    public static void logBehavorRightAway(BehaviourIdEnum behaviourIdEnum, String str, String str2, String str3, String str4, String str5, String str6, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f49a2ae", new Object[]{behaviourIdEnum, str, str2, str3, str4, str5, str6, map});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.putAll(map);
        hashMap.put("behaviourId", behaviourIdEnum == null ? "" : behaviourIdEnum.getDes());
        hashMap.put("userCaseID", str);
        hashMap.put("appId", str2);
        hashMap.put("seedId", str3);
        String appName = AppInfo.getInstance().getAppName();
        if (!"com.eg.android.AlipayGphone".equalsIgnoreCase(appName) && !"com.eg.android.AlipayGphoneRC".equalsIgnoreCase(appName)) {
            z = false;
        }
        if (!z) {
            hashMap.put("appName", AppInfo.getInstance().getAppName());
            hashMap.put("appVersion", AppInfo.getInstance().getAppVersion());
            hashMap.put(p.KEY_DEVICE_TYPE, AppInfo.getInstance().getDeviceType());
        }
        VerifyLogger.getInstance().verifyBehavior(str, str4, str5, str6, hashMap);
    }
}
