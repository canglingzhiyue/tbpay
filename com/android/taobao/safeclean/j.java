package com.android.taobao.safeclean;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.TimeUnit;
import tb.cjb;
import tb.kge;

/* loaded from: classes3.dex */
public class j {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MONITOR_POINT = "addition_result";
    public static final String MOUDLE = "safe_addition";

    static {
        kge.a(1680723947);
    }

    public static /* synthetic */ void lambda$Fed2tayHiZYsJ4QQ4jjXHoDqgmU(String str, int i, String str2) {
        b(str, i, str2);
    }

    /* renamed from: lambda$blSTYsFGX5Lj-69L0wb9WiEzUkw */
    public static /* synthetic */ void m617lambda$blSTYsFGX5Lj69L0wb9WiEzUkw(String str) {
        b(str);
    }

    public static void a(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            cjb.a(new Runnable() { // from class: com.android.taobao.safeclean.-$$Lambda$j$blSTYsFGX5Lj-69L0wb9WiEzUkw
                @Override // java.lang.Runnable
                public final void run() {
                    j.m617lambda$blSTYsFGX5Lj69L0wb9WiEzUkw(str);
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

    public static void a(final String str, final int i, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed88149b", new Object[]{str, new Integer(i), str2});
        } else {
            cjb.a(new Runnable() { // from class: com.android.taobao.safeclean.-$$Lambda$j$Fed2tayHiZYsJ4QQ4jjXHoDqgmU
                @Override // java.lang.Runnable
                public final void run() {
                    j.lambda$Fed2tayHiZYsJ4QQ4jjXHoDqgmU(str, i, str2);
                }
            }, 5L, TimeUnit.SECONDS);
        }
    }

    public static /* synthetic */ void b(String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4ed49ba", new Object[]{str, new Integer(i), str2});
        } else {
            AppMonitor.Alarm.commitFail(MOUDLE, MONITOR_POINT, str, String.valueOf(i), str2);
        }
    }
}
