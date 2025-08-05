package com.android.taobao.aop;

import android.content.res.Resources;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.taobao.aop.report.ReportType;
import com.android.taobao.aop.report.ResModel;
import com.taobao.tao.Globals;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.kge;

/* loaded from: classes3.dex */
public class ANDROID_CONTENT_RES_RESOURCES_PROXY {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "TB_RESOURCES_PROXY_getIdentifier";
    private static Map<String, Integer> resMap;
    private static com.android.taobao.aop.report.a sUsageReporter;

    static {
        kge.a(-277652097);
        resMap = new ConcurrentHashMap();
        sUsageReporter = com.android.taobao.aop.report.a.a();
    }

    public static int proxy_getIdentifier(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b7a2f626", new Object[]{str, str2, str3})).intValue();
        }
        String str4 = str3 + ":" + str2 + "/" + str;
        if (!resMap.containsKey(str4)) {
            int identifier = Globals.getApplication().getResources().getIdentifier(str, str2, str3);
            sUsageReporter.a(ReportType.RESOURCE, new ResModel(str3, str2, str), identifier);
            resMap.put(str3 + ":" + str2 + "/" + str, Integer.valueOf(identifier));
            return identifier;
        }
        return resMap.get(str4).intValue();
    }

    public static int proxy_getIdentifier(Resources resources, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7488bd7d", new Object[]{resources, str, str2, str3})).intValue();
        }
        String str4 = str3 + ":" + str2 + "/" + str;
        if (!resMap.containsKey(str4)) {
            int identifier = resources.getIdentifier(str, str2, str3);
            sUsageReporter.a(ReportType.RESOURCE, new ResModel(str3, str2, str), identifier);
            resMap.put(str3 + ":" + str2 + "/" + str, Integer.valueOf(identifier));
            return identifier;
        }
        return resMap.get(str4).intValue();
    }
}
