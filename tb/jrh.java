package tb;

import android.os.Build;
import android.os.Process;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;

/* loaded from: classes6.dex */
public class jrh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f29729a;

    static {
        kge.a(851077824);
        f29729a = false;
    }

    public static boolean a(jrj jrjVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("efee477a", new Object[]{jrjVar})).booleanValue() : f29729a || !c() || b() || b(jrjVar);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : f29729a || !c() || b() || Build.VERSION.SDK_INT <= 23;
    }

    private static boolean b(jrj jrjVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("de714dfb", new Object[]{jrjVar})).booleanValue() : Build.VERSION.SDK_INT <= 23 && jrjVar.a("isBelow23", false);
    }

    private static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        if (Build.VERSION.SDK_INT > 28) {
            return false;
        }
        return Build.BRAND.equalsIgnoreCase("HUAWEI") || Build.BRAND.equalsIgnoreCase("HONOR");
    }

    public static boolean c() {
        Object invoke;
        if (Build.VERSION.SDK_INT >= 23) {
            return Process.is64Bit();
        }
        try {
            Class<?> cls = Class.forName("dalvik.system.VMRuntime");
            Method declaredMethod = cls.getDeclaredMethod("is64Bit", new Class[0]);
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = cls.getDeclaredMethod("getRuntime", new Class[0]);
            declaredMethod2.setAccessible(true);
            Object invoke2 = declaredMethod2.invoke(null, new Object[0]);
            if (invoke2 != null && (invoke = declaredMethod.invoke(invoke2, new Object[0])) != null) {
                return ((Boolean) invoke).booleanValue();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return true;
    }
}
