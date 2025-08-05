package com.alipay.mobile.common.logging.api.utils;

import android.text.TextUtils;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

@MpaasClassInfo(BundleName = "android-phone-mobilesdk-logging", ExportJarName = "unknown", Level = "lib", Product = ":android-phone-mobilesdk-logging")
/* loaded from: classes3.dex */
public class LoggingUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f5425a = false;
    public static boolean sMainProcStartupStubRecorded = false;

    public static boolean isMainProcStartupFinishOrTimeout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("27cc9ad2", new Object[0])).booleanValue();
        }
        boolean z = true;
        if (f5425a) {
            return true;
        }
        if (LoggerFactory.getProcessInfo().isMainProcess() && LoggerFactory.getProcessInfo().isStartupByAnyActivity() && !sMainProcStartupStubRecorded && Math.abs(System.currentTimeMillis() - LoggerFactory.getProcessInfo().getProcessStartTime()) <= 5000) {
            z = false;
        }
        f5425a = z;
        return z;
    }

    public static String convertExtParams2String(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("60f03323", new Object[]{hashMap});
        }
        if (hashMap == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (!TextUtils.isEmpty(key)) {
                if (sb.length() != 0) {
                    sb.append("&");
                }
                sb.append(key);
                sb.append(":");
                sb.append(value);
            }
        }
        return sb.toString();
    }

    public static StringBuilder convertExtParams2StringBuilder(StringBuilder sb, String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StringBuilder) ipChange.ipc$dispatch("d01fb523", new Object[]{sb, str, str2, new Boolean(z)});
        }
        if (sb == null || TextUtils.isEmpty(str)) {
            return sb;
        }
        if (z) {
            sb.append("&");
        }
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb;
    }
}
