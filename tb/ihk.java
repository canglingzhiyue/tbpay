package tb;

import android.view.Window;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes6.dex */
public class ihk implements InvocationHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Window.Callback f29028a;

    public ihk(Window.Callback callback) {
        this.f29028a = callback;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        try {
            return method.invoke(this.f29028a, objArr);
        } catch (InvocationTargetException e) {
            if ("dispatchTouchEvent".equals(method.getName()) && (method.getReturnType().equals(Boolean.TYPE) || method.getReturnType().equals(Boolean.class))) {
                return false;
            }
            throw e.getTargetException();
        }
    }
}
