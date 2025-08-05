package com.taobao.alimama.utils;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.api.ConnectionResult;
import com.taobao.muniontaobaosdk.util.b;
import com.taobao.statistic.TBS;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.Map;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;
import tb.mto;

/* loaded from: classes.dex */
public class UserTrackLogs {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String UT_PAGE_NAME = "Munion";
    private static AtomicBoolean allowDirectReport;
    private static Random randGenerator;
    private static final Queue<a> sCachedQueue;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f8467a;
        public String b;
        public String c;
        public String d;
        public String e;

        static {
            kge.a(-1533101491);
        }

        public a(int i, String str, String str2, String str3, String str4) {
            this.f8467a = i;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
        }
    }

    static {
        kge.a(66368565);
        sCachedQueue = new ConcurrentLinkedQueue();
        allowDirectReport = new AtomicBoolean(false);
        randGenerator = new Random();
    }

    public static void trackClick(int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8cfc13", new Object[]{new Integer(i), str, str2});
            return;
        }
        TBS.Ext.commitEvent(i, "", "", "", "sdkversion=5.15.6", "clickid=" + str2, "localinfo=", "bucket=" + TextUtils.join(";", c.l()), str);
    }

    public static void trackClick(int i, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df30671d", new Object[]{new Integer(i), str, str2, str3});
            return;
        }
        TBS.Ext.commitEvent(i, "", "", "", "sdkversion=5.15.6", "clickid=" + str2, "localinfo=", "bucket=" + TextUtils.join(";", c.l()), str, "epid=" + str3);
    }

    public static void trackClick(int i, String str, String str2, String str3, String str4, String str5, String str6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fff913b", new Object[]{new Integer(i), str, str2, str3, str4, str5, str6});
            return;
        }
        TBS.Ext.commitEvent(i, "", "", "", "sdkversion=5.15.6", "clickid=" + str2, "localinfo=", "bucket=" + TextUtils.join(";", c.l()), str, "epid=" + str3, "host=" + str4, "path=" + str5, "mmAdArgs=" + str6);
    }

    public static void trackAdLog(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f813a18", new Object[]{str, strArr});
        } else {
            trackLog(ConnectionResult.SERVICE_UPDATING, str, "", "", (strArr == null || strArr.length <= 0) ? "" : TextUtils.join(",", strArr));
        }
    }

    public static void trackDebugLog(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b2a2412", new Object[]{str, strArr});
        } else {
            trackLog(ConnectionResult.SIGN_IN_FAILED, str, "", "", (strArr == null || strArr.length <= 0) ? "" : TextUtils.join(",", strArr));
        }
    }

    public static void trackCustomLog(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91c56ee6", new Object[]{str, strArr});
        } else {
            trackLog(19999, str, "", "", (strArr == null || strArr.length <= 0) ? "" : TextUtils.join(",", strArr));
        }
    }

    public static void trackExceptionLog(Exception exc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b571aeff", new Object[]{exc});
            return;
        }
        trackLog(19999, "Munion_Exception_Trace", "", "", "message=" + exc.getMessage() + ",className=" + exc.getClass().getName() + "," + b.a(exc, 0, 4));
    }

    public static void traceInvokeLog(double d, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f56060f", new Object[]{new Double(d), strArr});
        } else if (randGenerator.nextDouble() >= Math.min(1.0d, Math.max((double) mto.a.GEO_NOT_SUPPORT, d))) {
        } else {
            traceInvokeLog(strArr);
        }
    }

    public static void traceInvokeLog(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6489971", new Object[]{strArr});
            return;
        }
        String a2 = b.a(new Throwable(), 1, 5);
        if (strArr != null && strArr.length > 0) {
            a2 = a2 + "," + TextUtils.join(",", strArr);
        }
        trackLog(19999, "Munion_Invoke_Trace", "", "", a2);
    }

    public static void commitJavaUTEvent(String str, int i, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e6bb0b7", new Object[]{str, new Integer(i), str2, str3, str4, map});
            return;
        }
        try {
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(str, i, str2, str3, str4, map).build());
        } catch (Throwable unused) {
        }
    }

    public static void trackLog(int i, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf46462b", new Object[]{new Integer(i), str, str2, str3, str4});
            return;
        }
        if (i != 9004 && i != 9005 && i != 19999) {
            z = false;
        }
        if (!z || allowDirectReport.get()) {
            trackLogDirect(i, str, str2, str3, str4);
        } else {
            sCachedQueue.offer(new a(i, str, str2, str3, str4));
        }
    }

    private static void trackLogDirect(int i, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e613c382", new Object[]{new Integer(i), str, str2, str3, str4});
        } else {
            TBS.Ext.commitEvent(UT_PAGE_NAME, i, str, str2, str3, String.format("sdkversion=%s,bucket=%s", "5.15.6", TextUtils.join(";", c.l())), str4);
        }
    }

    public static void emptyCacheAndAllowDirectReport() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5f187ab", new Object[0]);
            return;
        }
        e.a("empty_ut_cache", "size=" + sCachedQueue.size());
        if (!allowDirectReport.compareAndSet(false, true)) {
            return;
        }
        for (a poll = sCachedQueue.poll(); poll != null; poll = sCachedQueue.poll()) {
            trackLogDirect(poll.f8467a, poll.b, poll.c, poll.d, poll.e);
        }
    }
}
