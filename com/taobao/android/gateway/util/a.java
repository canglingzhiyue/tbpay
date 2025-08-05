package com.taobao.android.gateway.util;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import tb.gjv;
import tb.jqm;
import tb.kge;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String GLOG_TAG = "home.gateway";

    /* renamed from: a  reason: collision with root package name */
    private static boolean f12706a;

    static {
        kge.a(140190444);
        f12706a = b();
    }

    public static void a(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b26fb7", new Object[]{strArr});
        } else if (f12706a) {
            TLog.logd(GLOG_TAG, strArr);
        } else if (!a()) {
        } else {
            c(strArr);
        }
    }

    public static void a(Throwable th, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93987f72", new Object[]{th, strArr});
        } else if (f12706a) {
            TLog.logw(GLOG_TAG, c(strArr), th);
        } else if (!a()) {
        } else {
            c(strArr);
        }
    }

    public static void b(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffb3fe96", new Object[]{strArr});
        } else if (f12706a) {
            TLog.loge(GLOG_TAG, strArr);
        } else if (!a()) {
        } else {
            Log.e(GLOG_TAG, c(strArr));
        }
    }

    public static void a(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe179b03", new Object[]{str, th});
        } else if (f12706a) {
            TLog.loge(GLOG_TAG, str, th);
        } else if (!a()) {
        } else {
            Log.e(GLOG_TAG, str, th);
        }
    }

    public static void b(Throwable th, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e3941f3", new Object[]{th, strArr});
        } else if (f12706a) {
            TLog.loge(GLOG_TAG, c(strArr), th);
        } else if (!a()) {
        } else {
            Log.e(GLOG_TAG, c(strArr), th);
        }
    }

    private static String c(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("be5c5fcb", new Object[]{strArr});
        }
        if (strArr == null || strArr.length == 0) {
            return "";
        }
        if (strArr.length == 1) {
            return strArr[0];
        }
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            sb.append(str);
        }
        return sb.toString();
    }

    private static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : jqm.a();
    }

    private static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : c.a(gjv.f28356a, "enable_gateway_tlog", false);
    }
}
