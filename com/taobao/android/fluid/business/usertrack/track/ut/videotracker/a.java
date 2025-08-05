package com.taobao.android.fluid.business.usertrack.track.ut.videotracker;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import tb.kge;
import tb.psw;

/* loaded from: classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-468102734);
    }

    public static void a(FluidContext fluidContext, psw pswVar, long j, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88e6cee2", new Object[]{fluidContext, pswVar, new Long(j), str, str2});
        } else if ("2".equals(str)) {
            d.a(fluidContext, "h5_load_time", String.valueOf(j), str, VideoTracker.j(str2), (String) null);
        } else {
            d.a(pswVar, "h5_load_time", String.valueOf(j), str, VideoTracker.j(str2), (String) null);
        }
    }

    public static void a(FluidContext fluidContext, psw pswVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4edb36ca", new Object[]{fluidContext, pswVar, str, str2});
        } else if ("2".equals(str)) {
            d.a(fluidContext, "h5_load", str, (String) null, VideoTracker.j(str2), (String) null);
        } else {
            d.a(pswVar, "h5_load", str, (String) null, VideoTracker.j(str2), (String) null);
        }
    }

    public static void a(FluidContext fluidContext, psw pswVar, int i, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63aabb2b", new Object[]{fluidContext, pswVar, new Integer(i), str, str2, str3});
            return;
        }
        String str4 = i + ":" + VideoTracker.j(str);
        if ("2".equals(str2)) {
            d.a(fluidContext, "h5_load_error", str2, str4, VideoTracker.j(str3), (String) null);
        } else {
            d.a(pswVar, "h5_load_error", str2, str4, VideoTracker.j(str3), (String) null);
        }
    }

    public static void a(FluidContext fluidContext, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7c8d1f8", new Object[]{fluidContext, str, str2, str3});
        } else {
            d.a(fluidContext, "tnodebridge_load", str, str2, str3, (String) null);
        }
    }
}
