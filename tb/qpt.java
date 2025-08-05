package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.DefaultAdapterImpl;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.basic.a;
import com.taobao.themis.kernel.basic.b;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes9.dex */
public class qpt {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "TMSAdapterManager";

    /* renamed from: a  reason: collision with root package name */
    private static final Map<Class<?>, Object> f33025a;
    private static final Map<Class<?>, b<?>> b;
    private static TMSLogger.Adapter c;

    static {
        kge.a(1190595290);
        f33025a = new ConcurrentHashMap();
        b = new ConcurrentHashMap();
    }

    public static void a(TMSLogger.Adapter adapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b848d7f", new Object[]{adapter});
        } else {
            c = adapter;
        }
    }

    public static TMSLogger.Adapter a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TMSLogger.Adapter) ipChange.ipc$dispatch("1d3e09c5", new Object[0]) : c;
    }

    public static <T> void a(Class<? super T> cls, T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b9dcc71", new Object[]{cls, t});
        } else if (!cls.isInterface() || !a.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException(cls.getSimpleName() + " must be interface and extend TMSAdapter!");
        } else {
            TMSLogger.b(TAG, "register Adapter " + cls.getSimpleName());
            f33025a.put(cls, t);
        }
    }

    public static <T> void a(Class<T> cls, b<T> bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5478cddf", new Object[]{cls, bVar});
        } else if (!cls.isInterface() || !a.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException(cls.getSimpleName() + "must be interface and extend TMSAdapter!");
        } else {
            TMSLogger.b(TAG, "register adapterFactory " + cls.getSimpleName());
            b.put(cls, bVar);
        }
    }

    public static <T> T a(Class<? super T> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("bd4d3fd", new Object[]{cls}) : (T) a((Class<? super Object>) cls, false);
    }

    public static <T> T b(Class<? super T> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("d4d5cb3e", new Object[]{cls}) : (T) a((Class<? super Object>) cls, true);
    }

    private static <T> T a(Class<? super T> cls, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("84d9c373", new Object[]{cls, new Boolean(z)});
        }
        T t = (T) f33025a.get(cls);
        if (t != null) {
            return t;
        }
        T t2 = (T) c(cls);
        if (t2 != null) {
            return t2;
        }
        T t3 = (T) d(cls);
        if (t3 != null) {
            return t3;
        }
        if (z) {
            return null;
        }
        TMSLogger.d(TAG, "get unimplemented adapter with notNull mode! return with mock dynamic proxy");
        return (T) e(cls);
    }

    private static synchronized <T> T c(Class<? super T> cls) {
        synchronized (qpt.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ipChange.ipc$dispatch("9dd6c27f", new Object[]{cls});
            }
            T t = (T) f33025a.get(cls);
            if (t != null) {
                return t;
            }
            b<?> bVar = b.get(cls);
            if (bVar == null) {
                return null;
            }
            T t2 = (T) bVar.b();
            f33025a.put(cls, t2);
            return t2;
        }
    }

    private static <T> T d(Class<? super T> cls) {
        DefaultAdapterImpl defaultAdapterImpl = (DefaultAdapterImpl) cls.getAnnotation(DefaultAdapterImpl.class);
        if (defaultAdapterImpl != null) {
            try {
                Class<?> cls2 = Class.forName(defaultAdapterImpl.value());
                if (cls.isAssignableFrom(cls2)) {
                    T t = (T) cls2.newInstance();
                    f33025a.put(cls, t);
                    return t;
                }
                TMSLogger.d(TAG, "Default impl " + defaultAdapterImpl.value() + " is not instance of " + cls);
            } catch (Throwable th) {
                TMSLogger.d(TAG, "DefaultImpl instantiate exception!" + th);
            }
        }
        return null;
    }

    private static <T> T e(final Class<? super T> cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("2fd8b101", new Object[]{cls}) : (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() { // from class: tb.qpt.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.reflect.InvocationHandler
            public Object invoke(Object obj, Method method, Object[] objArr) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ipChange2.ipc$dispatch("8a05e524", new Object[]{this, obj, method, objArr});
                }
                Class<?> returnType = method.getReturnType();
                TMSLogger.d(qpt.TAG, "unimplemented proxy:" + cls.getSimpleName() + "." + method.getName());
                if (!returnType.isPrimitive()) {
                    return null;
                }
                return (returnType == Boolean.TYPE || returnType == Boolean.TYPE) ? false : 0;
            }
        });
    }
}
