package com.taobao.taobaoavsdk;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tlog.adapter.AdapterForTLog;
import tb.kge;

/* loaded from: classes8.dex */
public class AVSDKLog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(3360650);
    }

    public static int e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb83973", new Object[]{str, str2})).intValue();
        }
        Log.e(str, str2);
        AdapterForTLog.loge(str, str2);
        return 0;
    }

    public static void e(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("152aaa75", new Object[]{str, str2, th});
            return;
        }
        Log.e(str, str2, th);
        AdapterForTLog.loge(str, str2, th);
    }

    public static int d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7f180e72", new Object[]{str, str2})).intValue();
        }
        AdapterForTLog.logd(str, str2);
        return 0;
    }

    public static int w(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eefb3f85", new Object[]{str, str2})).intValue();
        }
        AdapterForTLog.logw(str, str2);
        return 0;
    }

    public static int v(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("625b1484", new Object[]{str, str2})).intValue();
        }
        AdapterForTLog.logv(str, str2);
        return 0;
    }

    public static int i(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3e38e577", new Object[]{str, str2})).intValue();
        }
        AdapterForTLog.logi(str, str2);
        return 0;
    }
}
