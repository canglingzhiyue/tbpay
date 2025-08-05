package com.android.taobao.safeclean;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.TimeUnit;
import tb.cjb;
import tb.kge;

/* loaded from: classes3.dex */
public class k {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MONITOR_POINT = "clean_result";
    public static final String MOUDLE = "safe_clean";

    static {
        kge.a(2123544772);
    }

    public static /* synthetic */ void lambda$353h73l1oG2pWAL5uCPVL0y3OkE(String str) {
        b(str);
    }

    public static /* synthetic */ void lambda$amE4Y8KoZKgYPHDecO6f_VWb9jk(String str, String str2, String str3) {
        b(str, str2, str3);
    }

    public static void a(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            cjb.a(new Runnable() { // from class: com.android.taobao.safeclean.-$$Lambda$k$353h73l1oG2pWAL5uCPVL0y3OkE
                @Override // java.lang.Runnable
                public final void run() {
                    k.lambda$353h73l1oG2pWAL5uCPVL0y3OkE(str);
                }
            }, 5L, TimeUnit.SECONDS);
        }
    }

    public static /* synthetic */ void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
        } else {
            AppMonitor.Alarm.commitSuccess(MOUDLE, MONITOR_POINT, str);
        }
    }

    public static void a(final String str, final String str2, final String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
        } else {
            cjb.a(new Runnable() { // from class: com.android.taobao.safeclean.-$$Lambda$k$amE4Y8KoZKgYPHDecO6f_VWb9jk
                @Override // java.lang.Runnable
                public final void run() {
                    k.lambda$amE4Y8KoZKgYPHDecO6f_VWb9jk(str, str2, str3);
                }
            }, 5L, TimeUnit.SECONDS);
        }
    }

    public static /* synthetic */ void b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3509d07", new Object[]{str, str2, str3});
        } else {
            AppMonitor.Alarm.commitFail(MOUDLE, MONITOR_POINT, str, str2, str3);
        }
    }
}
