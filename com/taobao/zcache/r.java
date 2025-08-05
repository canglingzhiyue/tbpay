package com.taobao.zcache;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.orange.OConstant;

/* loaded from: classes9.dex */
public class r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final q f23659a = new q();

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            a(false);
        }
    }

    public static void a(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
            return;
        }
        n.a(f23659a);
        int intValue = ((Integer) com.taobao.android.launcher.common.c.a(OConstant.LAUNCH_ENVINDEX, 0)).intValue();
        if (intValue == 1) {
            n.a(Environment.Debug);
            str = (String) com.taobao.android.launcher.common.c.a(OConstant.LAUNCH_PREAPPKEY, "");
        } else if (intValue == 2) {
            n.a(Environment.Daily);
            str = (String) com.taobao.android.launcher.common.c.a(OConstant.LAUNCH_TESTAPPKEY, "");
        } else {
            n.a(Environment.Release);
            str = (String) com.taobao.android.launcher.common.c.a(OConstant.LAUNCH_ONLINEAPPKEY, "");
        }
        n.a(LauncherRuntime.g, str, (String) com.taobao.android.launcher.common.c.a("appVersion", ""), z ? 1 : 0);
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        } else {
            n.i();
        }
    }
}
