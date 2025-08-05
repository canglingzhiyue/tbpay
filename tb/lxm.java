package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;

/* loaded from: classes.dex */
public class lxm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LEVEL_HIGH = "h";
    public static final String LEVEL_LOW = "l";
    public static final String LEVEL_MED = "m";

    /* renamed from: a  reason: collision with root package name */
    private static boolean f30971a;
    private static Application b;

    static {
        kge.a(-1291501298);
        f30971a = true;
        try {
            Class.forName("com.taobao.tao.Globals");
        } catch (Throwable unused) {
            f30971a = false;
        }
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        if (f30971a) {
            return jqm.a();
        }
        return true;
    }

    public static void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c56f77", new Object[]{application});
        } else {
            b = application;
        }
    }

    public static Application c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Application) ipChange.ipc$dispatch("4bc1c139", new Object[0]);
        }
        if (!f30971a) {
            return b;
        }
        return Globals.getApplication();
    }
}
