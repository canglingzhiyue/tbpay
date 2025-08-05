package com.taobao.android.tbuprofen.adapter.anr;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f15473a;
    private static TBAnrConfig b;

    public static /* synthetic */ boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : f15473a;
    }

    static {
        kge.a(-825799300);
        f15473a = false;
        b = null;
    }

    public static void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{new Integer(i)});
        } else {
            a(String.format("type:0;l1:%d", Integer.valueOf(i)));
        }
    }

    public static void a(long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c11c727", new Object[]{new Long(j), new Integer(i)});
        } else {
            a(String.format("type:1;l1:%d;l2:%d", Long.valueOf(j), Integer.valueOf(i)));
        }
    }

    public static void a(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d8a2226", new Object[]{new Long(j), str});
        } else {
            a(String.format("type:2;l1:%d;l2:%d", Long.valueOf(j), Integer.valueOf((str == null || "null".equals(str)) ? 0 : 1)));
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            a("type:3");
        }
    }

    public static void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
        } else {
            a(String.format("type:4;l1:%d", Integer.valueOf(z ? 1 : 0)));
        }
    }

    public static void a(boolean z, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1910d8", new Object[]{new Boolean(z), new Long(j)});
        } else {
            a(String.format("type:5;l1:%d;l2:%d", Integer.valueOf(z ? 1 : 0), Long.valueOf(j)));
        }
    }

    public static void a(long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1206f8", new Object[]{new Long(j), new Boolean(z)});
            return;
        }
        TBAnrConfig tBAnrConfig = b;
        if (tBAnrConfig == null || !f15473a || !com.taobao.android.tbuprofen.common.a.d(tBAnrConfig.traceStatisticSample)) {
            return;
        }
        a(String.format("type:6;l1:%d;l2:%d", Long.valueOf(j), Integer.valueOf(z ? 1 : 0)));
    }

    public static void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{new Integer(i)});
        } else {
            a(String.format("type:7;l1:%d", Integer.valueOf(i)));
        }
    }

    public static void a(TBAnrConfig tBAnrConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fda01381", new Object[]{tBAnrConfig});
            return;
        }
        b = tBAnrConfig;
        if (tBAnrConfig == null || !com.taobao.android.tbuprofen.common.a.d(b.dumpStatisticSample)) {
            com.taobao.android.tbuprofen.log.c.a("TBAnrStatistic", "Can't start anr statistic. sample: %d", Long.valueOf(b.dumpStatisticSample));
        } else {
            f15473a = true;
        }
    }

    private static void a(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        } else {
            com.taobao.android.tbuprofen.common.e.a().a(new Runnable() { // from class: com.taobao.android.tbuprofen.adapter.anr.j.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (!j.b() || TextUtils.isEmpty(str)) {
                    } else {
                        AppMonitor.Alarm.commitSuccess(com.taobao.android.tbuprofen.adapter.e.MONITOR_MODULE, "anr_dump", String.format("event:ANR_DUMP;%s", str));
                        Log.e("TBAnrStatistic", str);
                    }
                }
            });
        }
    }
}
