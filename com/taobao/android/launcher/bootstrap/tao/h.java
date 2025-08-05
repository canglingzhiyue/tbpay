package com.taobao.android.launcher.bootstrap.tao;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import tb.gve;

/* loaded from: classes.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else {
            TLog.loge(gve.MODULE, str, str2);
        }
    }

    public static int b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65d7b870", new Object[]{str, str2})).intValue();
        }
        TLog.loge(gve.MODULE, str, str2);
        return Log.e(str, str2);
    }

    public static int a(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c430ebec", new Object[]{str, str2, th})).intValue();
        }
        TLog.loge(gve.MODULE, str, str2, th);
        return Log.e(str, str2, th);
    }
}
