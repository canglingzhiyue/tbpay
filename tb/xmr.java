package tb;

import android.app.ActivityManager;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.aranger.utils.b;
import com.taobao.atools.StaticHook;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes6.dex */
public class xmr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private static xmr f34376a;
    private final Set<Integer> b = new CopyOnWriteArraySet();
    private final AtomicBoolean c = new AtomicBoolean();

    static {
        kge.a(2085078593);
    }

    /* renamed from: lambda$6DL4fm_zgR6UB1RW6nw-h1tYV8E */
    public static /* synthetic */ void m2501lambda$6DL4fm_zgR6UB1RW6nwh1tYV8E(xmr xmrVar) {
        xmrVar.d();
    }

    public static /* synthetic */ Object lambda$i2KwhqzIoGQh_nWGM92xMIY6Y48(xmr xmrVar, Object obj, Object obj2, Method method, Object[] objArr) {
        return xmrVar.a(obj, obj2, method, objArr);
    }

    public static xmr a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xmr) ipChange.ipc$dispatch("f0cd8a1", new Object[0]);
        }
        if (f34376a == null) {
            synchronized (xmr.class) {
                if (f34376a == null) {
                    f34376a = new xmr();
                }
            }
        }
        return f34376a;
    }

    private xmr() {
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (Build.VERSION.SDK_INT < 26) {
        } else {
            b.a(false, false, new Runnable() { // from class: tb.-$$Lambda$xmr$6DL4fm_zgR6UB1RW6nw-h1tYV8E
                @Override // java.lang.Runnable
                public final void run() {
                    xmr.m2501lambda$6DL4fm_zgR6UB1RW6nwh1tYV8E(xmr.this);
                }
            });
        }
    }

    public /* synthetic */ void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (!xkf.b() || !xkf.c()) {
            kak.b("ServiceHooker", "hook closed", new Object[0]);
        } else if (kam.b().isEmpty()) {
            kak.b("ServiceHooker", "hook empty service list", new Object[0]);
        } else if (this.c.getAndSet(true)) {
        } else {
            c();
        }
    }

    private void c() {
        try {
            Field b = StaticHook.b(ActivityManager.class, "IActivityManagerSingleton");
            b.setAccessible(true);
            Object obj = b.get(null);
            Class<?> cls = Class.forName("android.util.Singleton");
            final Object invoke = StaticHook.a(cls, "get", new Class[0]).invoke(obj, new Object[0]);
            Class<?> cls2 = Class.forName("android.app.IActivityManager");
            Field c = StaticHook.c(cls, "mInstance");
            c.setAccessible(true);
            c.set(obj, Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{cls2}, new InvocationHandler() { // from class: tb.-$$Lambda$xmr$i2KwhqzIoGQh_nWGM92xMIY6Y48
                @Override // java.lang.reflect.InvocationHandler
                public final Object invoke(Object obj2, Method method, Object[] objArr) {
                    return xmr.lambda$i2KwhqzIoGQh_nWGM92xMIY6Y48(xmr.this, invoke, obj2, method, objArr);
                }
            }));
            kak.b("ServiceHooker", "hookImpl success", new Object[0]);
        } catch (Throwable th) {
            kak.a("ServiceHooker", "hookImpl err", th, new Object[0]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:199:0x010d A[Catch: Throwable -> 0x0135, TryCatch #4 {Throwable -> 0x0135, blocks: (B:174:0x00b8, B:176:0x00be, B:197:0x0107, B:199:0x010d, B:201:0x0113, B:205:0x0121, B:209:0x012a), top: B:249:0x00b8 }] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0083 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ java.lang.Object a(java.lang.Object r20, java.lang.Object r21, java.lang.reflect.Method r22, java.lang.Object[] r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 428
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.xmr.a(java.lang.Object, java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
    }
}
