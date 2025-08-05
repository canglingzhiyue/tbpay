package tb;

import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.view.WindowManager;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* loaded from: classes.dex */
public class gtp {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static volatile boolean f28445a = false;

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        if (!f28445a && (Build.VERSION.SDK_INT == 25 || Build.VERSION.SDK_INT == 24)) {
            b();
        }
        f28445a = true;
    }

    private void b() {
        try {
            Class<?> cls = Class.forName("android.app.INotificationManager");
            Method declaredMethod = Toast.class.getDeclaredMethod("getService", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, new Object[0]);
            Field declaredField = Toast.class.getDeclaredField("sService");
            declaredField.setAccessible(true);
            declaredField.set(Toast.class, Proxy.newProxyInstance(Toast.class.getClassLoader(), new Class[]{cls}, new a(invoke)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* loaded from: classes5.dex */
    public static final class a implements InvocationHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final Object f28446a;

        /* renamed from: tb.gtp$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static class RunnableC1130a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final Runnable f28447a;

            public RunnableC1130a(Runnable runnable) {
                this.f28447a = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    this.f28447a.run();
                } catch (WindowManager.BadTokenException unused) {
                }
            }
        }

        /* loaded from: classes5.dex */
        public static class b extends Handler {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final Handler f28448a;

            public b(Handler handler) {
                this.f28448a = handler;
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                    return;
                }
                try {
                    this.f28448a.handleMessage(message);
                } catch (WindowManager.BadTokenException unused) {
                }
            }
        }

        private a(Object obj) {
            this.f28446a = obj;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            Object obj2;
            if ("enqueueToast".equals(method.getName()) && objArr.length == 3 && (obj2 = objArr[1]) != null) {
                a(obj2);
            }
            try {
                return method.invoke(this.f28446a, objArr);
            } catch (InvocationTargetException e) {
                throw e.getTargetException();
            }
        }

        private void a(Object obj) {
            Class<?> cls = obj.getClass();
            if ("android.widget.Toast$TN".equals(cls.getName())) {
                try {
                    if (Build.VERSION.SDK_INT == 25) {
                        Field declaredField = cls.getDeclaredField("mHandler");
                        declaredField.setAccessible(true);
                        declaredField.set(obj, a((Handler) declaredField.get(obj)));
                    } else if (Build.VERSION.SDK_INT != 24) {
                    } else {
                        Field declaredField2 = cls.getDeclaredField("mShow");
                        declaredField2.setAccessible(true);
                        declaredField2.set(obj, a((Runnable) declaredField2.get(obj)));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        private Handler a(Handler handler) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("89f9002e", new Object[]{this, handler}) : new b(handler);
        }

        private Runnable a(Runnable runnable) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("efaaecee", new Object[]{this, runnable}) : new RunnableC1130a(runnable);
        }
    }
}
