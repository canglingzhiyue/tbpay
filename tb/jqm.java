package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class jqm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f29711a;

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : f29711a;
    }

    public static void a(Application application) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c56f77", new Object[]{application});
            return;
        }
        try {
            if ((application.getApplicationInfo().flags & 2) != 0) {
                z = true;
            }
            f29711a = z;
        } catch (Exception unused) {
        }
    }

    static {
        kge.a(1238688991);
        f29711a = false;
    }
}
