package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public class idz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicBoolean f28956a = new AtomicBoolean(false);
    public static final Object b = new Object();

    public static void a() {
        if (f28956a.get()) {
            return;
        }
        try {
            cun.c("LIB", "Birdnest version: a1c03ca4-clean");
        } catch (Throwable th) {
            cun.c("LIB", "Birdnest cannot print version info", th);
        }
        try {
            cun.c("LIB", "Before load so flybird");
            synchronized (b) {
                AtomicBoolean atomicBoolean = f28956a;
                if (atomicBoolean.get()) {
                    return;
                }
                System.loadLibrary("flybird");
                atomicBoolean.set(true);
                cun.c("LIB", "After load so flybird");
            }
        } catch (Throwable th2) {
            try {
                cun.c("LIB", "Before load so w utils flybird");
                Method method = Class.forName("com.alipay.mobile.common.utils.load.LibraryLoadUtils").getMethod("loadLibrary", String.class, Boolean.TYPE);
                synchronized (b) {
                    AtomicBoolean atomicBoolean2 = f28956a;
                    if (atomicBoolean2.get()) {
                        return;
                    }
                    method.invoke(null, "flybird", Boolean.FALSE);
                    atomicBoolean2.set(true);
                    cun.c("LIB", "After load so w utils flybird");
                }
            } catch (Throwable th3) {
                cun.c("LIB", "Failed to load flybird so: ", th3);
                cun.c("LIB", "Failed to load flybird so, caused by: ", th2);
                cun.a(th3, "failed to load so flybird");
            }
        }
    }
}
