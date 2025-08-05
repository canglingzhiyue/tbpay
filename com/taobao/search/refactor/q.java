package com.taobao.search.refactor;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.mto;

/* loaded from: classes7.dex */
public class q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f19324a;

    static {
        kge.a(1364775326);
        f19324a = false;
    }

    private static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
        } else if (f19324a) {
        } else {
            f19324a = true;
            AppMonitor.register("IpGuide", "count", MeasureSet.create(), DimensionSet.create());
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        c();
        AppMonitor.Counter.commit("IpGuide", "count", "total", mto.a.GEO_NOT_SUPPORT);
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
            return;
        }
        c();
        AppMonitor.Counter.commit("IpGuide", "count", "redirect", mto.a.GEO_NOT_SUPPORT);
    }
}
