package tb;

import android.os.IBinder;
import android.os.IInterface;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.utl.ALog;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Map;

/* loaded from: classes.dex */
public class ezp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private final String f27694a;
    private final String b;
    private final a c;
    private IBinder d;
    private IBinder e;

    /* loaded from: classes.dex */
    public interface a {
        void beforeMethodInvoke(Method method, Object[] objArr);
    }

    static {
        kge.a(-2125012119);
    }

    public static /* synthetic */ Object lambda$1iLGABcfpGJzx8cnnkWzrohIHHw(ezp ezpVar, Object obj, Object obj2, Method method, Object[] objArr) {
        return ezpVar.a(obj, obj2, method, objArr);
    }

    /* renamed from: lambda$bhNa-inEpAmKVINmfrJaZoDLKiY */
    public static /* synthetic */ Object m2442lambda$bhNainEpAmKVINmfrJaZoDLKiY(ezp ezpVar, Object obj, Method method, Object[] objArr) {
        return ezpVar.a(obj, method, objArr);
    }

    public ezp(String str, String str2, a aVar) {
        this.f27694a = str;
        this.b = str2;
        this.c = aVar;
    }

    public boolean a() {
        try {
            IBinder b = b();
            Field declaredField = Class.forName("android.os.ServiceManager").getDeclaredField("sCache");
            declaredField.setAccessible(true);
            ((Map) declaredField.get(null)).put(this.f27694a, b);
            this.e = b;
            return true;
        } catch (Throwable th) {
            ALog.e("APower.BHooker", "hook fail", th, new Object[0]);
            return false;
        }
    }

    private IBinder b() throws Exception {
        Class<?> cls = Class.forName("android.os.ServiceManager");
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader != null) {
            this.d = (IBinder) cls.getDeclaredMethod("getService", String.class).invoke(null, this.f27694a);
            return (IBinder) Proxy.newProxyInstance(classLoader, new Class[]{IBinder.class}, new InvocationHandler() { // from class: tb.-$$Lambda$ezp$bhNa-inEpAmKVINmfrJaZoDLKiY
                @Override // java.lang.reflect.InvocationHandler
                public final Object invoke(Object obj, Method method, Object[] objArr) {
                    return ezp.m2442lambda$bhNainEpAmKVINmfrJaZoDLKiY(ezp.this, obj, method, objArr);
                }
            });
        }
        throw new IllegalStateException("serviceManagerCls.getClassLoader null!");
    }

    public /* synthetic */ Object a(Object obj, Method method, Object[] objArr) throws Throwable {
        Object c;
        return (!"queryLocalInterface".equals(method.getName()) || (c = c()) == null) ? method.invoke(this.d, objArr) : c;
    }

    private Object c() {
        try {
            Class<?> cls = Class.forName(this.b);
            Class<?> cls2 = Class.forName(this.b + "$Stub");
            ClassLoader classLoader = cls2.getClassLoader();
            if (classLoader == null) {
                throw new IllegalStateException("get service manager ClassLoader fail!");
            }
            final Object invoke = cls2.getDeclaredMethod("asInterface", IBinder.class).invoke(null, this.d);
            return Proxy.newProxyInstance(classLoader, new Class[]{IBinder.class, IInterface.class, cls}, new InvocationHandler() { // from class: tb.-$$Lambda$ezp$1iLGABcfpGJzx8cnnkWzrohIHHw
                @Override // java.lang.reflect.InvocationHandler
                public final Object invoke(Object obj, Method method, Object[] objArr) {
                    return ezp.lambda$1iLGABcfpGJzx8cnnkWzrohIHHw(ezp.this, invoke, obj, method, objArr);
                }
            });
        } catch (Throwable th) {
            ALog.e("APower.BHooker", "newProxyServiceMgr", th, new Object[0]);
            return null;
        }
    }

    public /* synthetic */ Object a(Object obj, Object obj2, Method method, Object[] objArr) throws Throwable {
        a aVar = this.c;
        if (aVar != null) {
            aVar.beforeMethodInvoke(method, objArr);
        }
        return method.invoke(obj, objArr);
    }
}
