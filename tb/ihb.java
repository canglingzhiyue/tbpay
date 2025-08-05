package tb;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.view.inputmethod.InputMethodManager;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* loaded from: classes6.dex */
public class ihb implements igy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ihh f29018a;
    private final nof b;

    /* loaded from: classes6.dex */
    public static class a implements InvocationHandler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final Object f29019a;

        public a(Object obj) {
            this.f29019a = obj;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            try {
                return method.invoke(this.f29019a, objArr);
            } catch (InvocationTargetException e) {
                if (!"removeImeSurfaceFromWindowAsync".equals(method.getName())) {
                    throw e.getTargetException();
                }
                return null;
            }
        }
    }

    public ihb(ihh ihhVar, nof nofVar) {
        this.f29018a = ihhVar;
        this.b = nofVar;
    }

    @Override // tb.igy
    public void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75c56f77", new Object[]{this, application});
            return;
        }
        if (Build.VERSION.SDK_INT == 31 || Build.VERSION.SDK_INT == 32) {
            try {
                a((Context) application);
                ihc.a("hook input succ", new Object[0]);
            } catch (Exception e) {
                ihc.a(e);
                ihc.a("hook input failed", new Object[0]);
            }
        }
        ihc.a("ImmCommand.execute()", new Object[0]);
    }

    private void a(Context context) throws Exception {
        Class<?> cls = Class.forName("com.android.internal.view.IInputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService(InputMethodManager.class);
        Field a2 = a(InputMethodManager.class, "mService");
        a2.set(inputMethodManager, Proxy.newProxyInstance(getClass().getClassLoader(), new Class[]{cls}, new a(a2.get(inputMethodManager))));
    }

    private static Field a(Class cls, String str) throws Exception {
        Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredField", String.class);
        declaredMethod.setAccessible(true);
        Field field = (Field) declaredMethod.invoke(cls, str);
        field.setAccessible(true);
        return field;
    }
}
