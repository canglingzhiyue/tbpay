package com.taobao.android.detail.sdk.utils;

import mtopsdk.common.util.StringUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tlog.adapter.AdapterForTLog;
import tb.kge;
import tb.tpc;

/* loaded from: classes4.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(543189983);
        tpc.a("com.taobao.android.detail.sdk.utils.DetailTLog");
    }

    public static void a(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c430ebf9", new Object[]{str, str2, th});
        } else if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2)) {
        } else {
            AdapterForTLog.loge("detail." + str, str2 + ":" + Log.getStackTraceString(th));
            i.a(str, str2, th);
        }
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2)) {
        } else {
            AdapterForTLog.loge("detail." + str, str2);
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
        } else if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2)) {
        } else {
            AdapterForTLog.logi("detail." + str, str2);
        }
    }

    public static void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f277e37e", new Object[]{str, str2});
        } else if (StringUtils.isEmpty(str) || StringUtils.isEmpty(str2)) {
        } else {
            AdapterForTLog.logd("detail." + str, str2);
        }
    }
}
