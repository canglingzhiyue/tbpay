package tb;

import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import com.heytap.mspsdk.proxy.b;
import com.heytap.mspsdk.receiver.a;
import java.lang.reflect.Proxy;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.cwe;

/* loaded from: classes4.dex */
public class cwd {
    public static final String TAG = "MspSdk";

    /* renamed from: a  reason: collision with root package name */
    public static AtomicBoolean f26562a;

    static {
        kge.a(-1531976267);
        f26562a = new AtomicBoolean(false);
    }

    public static <T, R extends T> T a(R r) {
        b bVar = b.a.f7251a;
        if (bVar != null) {
            if (r == null) {
                throw new RuntimeException("The instance of 'target' is null");
            }
            Class<?>[] interfaces = r.getClass().getInterfaces();
            if (interfaces == null || interfaces.length <= 0) {
                throw new RuntimeException("The instance of 'target' doesn't implement an interface, please add 'makeInterface=true' at your moudle's BridgeTarget annotation");
            }
            cwn.b("ApiProxy", "interfaces length " + interfaces.length);
            for (Class<?> cls : interfaces) {
                cwn.b("ApiProxy", "interfaces clazz name is " + cls.getSimpleName());
            }
            return (T) Proxy.newProxyInstance(r.getClass().getClassLoader(), new Class[]{r.getClass().getInterfaces()[0]}, new b.C0261b(r));
        }
        throw null;
    }

    public static synchronized void a(Context context) {
        synchronized (cwd.class) {
            if (f26562a.get()) {
                cwn.b(TAG, "initing");
                return;
            }
            cwn.b(TAG, "init start");
            cwg a2 = cwg.a();
            Context applicationContext = context.getApplicationContext();
            if (a2 == null) {
                throw null;
            }
            Context applicationContext2 = applicationContext.getApplicationContext();
            cwg.f26565a = applicationContext2;
            ((Application) applicationContext2).registerActivityLifecycleCallbacks(cwe.a.f26564a);
            cwg.b = new a();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.heytap.mspsdk.start_intent");
            cwg.f26565a.registerReceiver(cwg.b, intentFilter);
            cwg.c.set(true);
            f26562a.set(true);
            cwn.b(TAG, "init finish, version:2.0.101.7");
        }
    }
}
