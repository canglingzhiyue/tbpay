package tb;

import android.os.Build;
import com.ali.user.mobile.ability.excutor.BaseExecutor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.VirtualThreadPoolExecutor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public class jqv implements jrc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final jrj f29717a;
    private final jqp b;

    static {
        kge.a(-1364175979);
        kge.a(1352893937);
    }

    public jqv(jrj jrjVar, jqp jqpVar) {
        this.f29717a = jrjVar;
        this.b = jqpVar;
    }

    @Override // tb.jrc
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!this.f29717a.a("useOkHttpVirtualThread", true)) {
            jrk.b("OkHttpTask", "failed");
        } else {
            if (Build.VERSION.SDK_INT > 23) {
                b();
            }
            c();
            jrk.b("OkHttpTask", "succ");
        }
    }

    private void b() {
        try {
            Method declaredMethod = Class.class.getDeclaredMethod("forName", String.class);
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = Class.class.getDeclaredMethod("getDeclaredField", String.class);
            declaredMethod2.setAccessible(true);
            Field field = (Field) declaredMethod2.invoke((Class) declaredMethod.invoke(null, "com.android.okhttp.internal.framed.FramedConnection"), BaseExecutor.EXECUTOR_SUFFIX);
            field.setAccessible(true);
            ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) field.get(null);
            field.set(null, new VirtualThreadPoolExecutor(threadPoolExecutor.getCorePoolSize(), threadPoolExecutor.getMaximumPoolSize(), threadPoolExecutor.getKeepAliveTime(TimeUnit.SECONDS), TimeUnit.SECONDS, threadPoolExecutor.getQueue(), threadPoolExecutor.getThreadFactory()));
            jrk.b("OkHttpTask", "Okhttp FramedConnection", "in virtual thread");
        } catch (Throwable th) {
            jrk.b("replaceFramedConnectionThread", "exception");
            jrk.a(th);
        }
    }

    private void c() {
        try {
            Method declaredMethod = Class.class.getDeclaredMethod("forName", String.class);
            declaredMethod.setAccessible(true);
            Class cls = (Class) declaredMethod.invoke(null, "com.android.okhttp.ConnectionPool");
            Method declaredMethod2 = Class.class.getDeclaredMethod("getDeclaredField", String.class);
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
            declaredMethod2.setAccessible(true);
            Method method = (Method) declaredMethod3.invoke(cls, "getDefault", new Class[0]);
            method.setAccessible(true);
            Object invoke = method.invoke(null, new Object[0]);
            Field field = (Field) declaredMethod2.invoke(cls, BaseExecutor.EXECUTOR_SUFFIX);
            field.setAccessible(true);
            ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) field.get(invoke);
            field.set(invoke, new VirtualThreadPoolExecutor(threadPoolExecutor.getCorePoolSize(), threadPoolExecutor.getMaximumPoolSize(), threadPoolExecutor.getKeepAliveTime(TimeUnit.SECONDS), TimeUnit.SECONDS, threadPoolExecutor.getQueue(), threadPoolExecutor.getThreadFactory()));
            jrk.b("OkHttpTask", "Okhttp ConnectionPool", "in virtual thread");
        } catch (Throwable th) {
            jrk.b("replaceConnectionPoolThread", "exception");
            jrk.a(th);
        }
    }
}
