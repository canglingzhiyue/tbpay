package tb;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.taobao.android.boutique.reflection.h;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes5.dex */
public class jzk {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int BIND_SERVICE = 121;
    public static final int CREATE_SERVICE = 114;
    public static final int INSTALL_PROVIDER = 145;
    public static final int LAUNCH_ACTIVITY_P_BELOW = 100;
    public static final int LAUNCH_ACTIVITY_P_OR_ABOVE = 159;
    public static final int RECEIVER = 113;
    public static final int SERVICE_ARGS = 115;
    public static final int SERVICE_DONE_EXECUTING_ANON = 0;
    public static final int SERVICE_DONE_EXECUTING_START = 1;
    public static final int SERVICE_DONE_EXECUTING_STOP = 2;
    public static final int STOP_SERVICE = 116;
    public static final int UNBIND_SERVICE = 122;

    /* renamed from: a  reason: collision with root package name */
    private static Method f29884a;
    private static Field b;
    private static Method c;

    /* loaded from: classes5.dex */
    public interface a {
        Handler.Callback a(Handler.Callback callback);
    }

    static {
        try {
            Class<?> cls = Class.forName("android.app.IActivityManager");
            if (e()) {
                f29884a = cls.getDeclaredMethod("serviceDoneExecuting", IBinder.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Intent.class);
            } else {
                f29884a = cls.getDeclaredMethod("serviceDoneExecuting", IBinder.class, Integer.TYPE, Integer.TYPE, Integer.TYPE);
            }
            if (f29884a != null) {
                f29884a.setAccessible(true);
            }
            Field declaredField = BroadcastReceiver.PendingResult.class.getDeclaredField("mFinished");
            b = declaredField;
            if (declaredField != null) {
                b.setAccessible(true);
            }
            Method a2 = h.a(BroadcastReceiver.PendingResult.class, "sendFinished", cls);
            c = a2;
            a2.setAccessible(true);
        } catch (Throwable th) {
            com.taobao.android.launcher.bootstrap.tao.h.a("AMSService", "error occurred when getDeclaredMethod of serviceDoneExecuting", th);
        }
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue() : Build.VERSION.SDK_INT > 34 || "VanillaIceCream".equals(Build.VERSION.CODENAME);
    }

    public static void a(Object obj, Object obj2, IBinder iBinder, int i, int i2, int i3) throws InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Intent intent;
        if (f29884a == null) {
            com.taobao.android.launcher.bootstrap.tao.h.b("AMSService", "serviceDoneExecuting is null");
        } else if (!e()) {
            f29884a.invoke(obj, iBinder, Integer.valueOf(i), Integer.valueOf(i2), 0);
        } else {
            if (i3 == 121 || i3 == 122) {
                Field declaredField = obj2.getClass().getDeclaredField(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
                declaredField.setAccessible(true);
                intent = (Intent) declaredField.get(obj2);
            } else {
                intent = null;
            }
            f29884a.invoke(obj, iBinder, Integer.valueOf(i), Integer.valueOf(i2), 0, intent);
        }
    }

    public static void a(BroadcastReceiver.PendingResult pendingResult) throws Throwable {
        Method method = c;
        if (method == null) {
            com.taobao.android.launcher.bootstrap.tao.h.b("AMSService", "sendReceiverFinished failed due to sSendReceiverFinishMethod is null");
            return;
        }
        try {
            method.invoke(pendingResult, a());
        } catch (IllegalStateException e) {
            com.taobao.android.launcher.bootstrap.tao.h.a("AMSService", "error occurred when sendReceiverFinished", e);
        }
        synchronized (pendingResult) {
            if (b.getBoolean(pendingResult)) {
                com.taobao.android.launcher.bootstrap.tao.h.b("AMSService", "the receiver has already been finished, do some trick here");
                b.set(pendingResult, false);
            }
        }
    }

    public static Object a() throws Throwable {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("bd3407ca", new Object[0]) : Build.VERSION.SDK_INT >= 26 ? d() : c();
    }

    private static Object c() throws Throwable {
        Field declaredField = Class.forName("android.app.ActivityManagerNative").getDeclaredField("gDefault");
        declaredField.setAccessible(true);
        Object obj = declaredField.get(null);
        Field declaredField2 = Class.forName("android.util.Singleton").getDeclaredField("mInstance");
        declaredField2.setAccessible(true);
        return declaredField2.get(obj);
    }

    private static Object d() throws Throwable {
        Field declaredField = Class.forName("android.app.ActivityManager").getDeclaredField("IActivityManagerSingleton");
        declaredField.setAccessible(true);
        Object obj = declaredField.get(null);
        Field declaredField2 = Class.forName("android.util.Singleton").getDeclaredField("mInstance");
        declaredField2.setAccessible(true);
        return declaredField2.get(obj);
    }

    public static Object b() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        return Class.forName(ProcessUtils.ACTIVITY_THREAD).getDeclaredMethod(ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]).invoke(null, new Object[0]);
    }

    public static boolean a(a aVar) {
        try {
            Object b2 = b();
            Field declaredField = Class.forName(ProcessUtils.ACTIVITY_THREAD).getDeclaredField("mH");
            declaredField.setAccessible(true);
            Handler handler = (Handler) declaredField.get(b2);
            Field declaredField2 = Handler.class.getDeclaredField("mCallback");
            declaredField2.setAccessible(true);
            declaredField2.set(handler, aVar.a((Handler.Callback) declaredField2.get(handler)));
            declaredField2.setAccessible(false);
            declaredField.setAccessible(false);
            com.taobao.android.launcher.bootstrap.tao.h.a("AMSService", "delegate successfully");
            return true;
        } catch (Throwable th) {
            com.taobao.android.launcher.bootstrap.tao.h.a("AMSService", "error occurred when delegating", th);
            return false;
        }
    }
}
