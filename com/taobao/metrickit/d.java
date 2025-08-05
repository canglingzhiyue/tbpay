package com.taobao.metrickit;

import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.b;
import com.taobao.metrickit.context.MetricContext;
import com.taobao.tao.log.TLog;
import tb.bhe;
import tb.cak;

/* loaded from: classes7.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f18076a = true;
    private static boolean b = false;

    public static void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c56f77", new Object[]{application});
        } else if (!a()) {
        } else {
            try {
                String j = b.a().j("com.taobao.metrickit.honor.FlexaLauncher");
                com.alibaba.android.split.k.a().a(application, false, j);
                b = com.alibaba.android.split.core.splitinstall.h.a(application).a().contains(j);
            } catch (Exception e) {
                e.printStackTrace();
                TLog.loge("MetricKit.FlexaMetricLauncher", "install fail.", e);
            }
            TLog.loge("MetricKit.FlexaMetricLauncher", "install: " + b);
        }
    }

    public static void a(Application application, MetricContext metricContext, long j, int i) {
        if (!b) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putSerializable("context", metricContext);
            bundle.putLong("lastLaunchSession", j);
            bundle.putInt("lastPid", i);
            ((cak) Class.forName("com.taobao.metrickit.honor.FlexaLauncher").newInstance()).init(application, bundle);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            TLog.loge("MetricKit.FlexaMetricLauncher", "init fail.", e);
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
            TLog.loge("MetricKit.FlexaMetricLauncher", "init fail.", e2);
        } catch (InstantiationException e3) {
            e3.printStackTrace();
            TLog.loge("MetricKit.FlexaMetricLauncher", "init fail.", e3);
        }
        TLog.loge("MetricKit.FlexaMetricLauncher", "inited");
    }

    public static void b(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76721b16", new Object[]{application});
        } else if (!a() && !b) {
        } else {
            com.alibaba.android.split.core.splitinstall.g c = com.taobao.appbundle.c.Companion.a().c();
            com.alibaba.android.split.core.splitinstall.j a2 = com.alibaba.android.split.core.splitinstall.j.a().a(bhe.a(application, "com.taobao.metrickit.honor.FlexaLauncher").a()).a();
            if (c != null) {
                c.a(a2);
            }
            TLog.loge("MetricKit.FlexaMetricLauncher", "download");
        }
    }

    private static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : f18076a && "HONOR".equalsIgnoreCase(Build.BRAND) && Build.VERSION.SDK_INT > 18;
    }
}
