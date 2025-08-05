package com.tmall.android.dai.internal.util;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTTracker;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.Map;
import tb.kge;

/* loaded from: classes9.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f23710a;

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else {
            AppMonitor.Alarm.commitSuccess("DAI", str, str2);
        }
    }

    public static void a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2b490", new Object[]{str, str2, str3, str4});
        } else {
            AppMonitor.Alarm.commitFail("DAI", str, str2, str3, str4);
        }
    }

    public static void a(String str, String str2, MeasureSet measureSet, DimensionSet dimensionSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14fb7e04", new Object[]{str, str2, measureSet, dimensionSet});
        } else {
            AppMonitor.register(str, str2, measureSet, dimensionSet);
        }
    }

    public static void a(String str, String str2, DimensionValueSet dimensionValueSet, MeasureValueSet measureValueSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b92d996", new Object[]{str, str2, dimensionValueSet, measureValueSet});
        } else {
            AppMonitor.Stat.commit(str, str2, dimensionValueSet, measureValueSet);
        }
    }

    static {
        kge.a(232411379);
        f23710a = false;
    }

    public static void a(String str, int i, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b903f76", new Object[]{str, new Integer(i), str2, str3, str4, map});
            return;
        }
        try {
            UTTracker defaultTracker = UTAnalytics.getInstance().getDefaultTracker();
            if (defaultTracker == null) {
                return;
            }
            defaultTracker.send(new UTOriginalCustomHitBuilder(str, i, str2, str3, str4, map).build());
            com.taobao.mrt.utils.a.b("Analytics", "pageName=" + str + " eventId=" + i + " arg1=" + str2 + " arg2=" + str3 + " arg3=" + str4 + " args=" + map);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
