package tb;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.Window;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
public class dsl implements InvocationHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Window.Callback f26945a;
    private GestureDetector b;
    private ScaleGestureDetector c;

    static {
        kge.a(-68591851);
        kge.a(16938580);
    }

    public dsl(Window.Callback callback, GestureDetector gestureDetector, ScaleGestureDetector scaleGestureDetector) {
        this.f26945a = callback;
        this.b = gestureDetector;
        this.c = scaleGestureDetector;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        if ("dispatchTouchEvent".equals(method.getName())) {
            GestureDetector gestureDetector = this.b;
            if (gestureDetector != null && objArr != null && objArr.length > 0) {
                Object obj2 = objArr[0];
                if (obj2 instanceof MotionEvent) {
                    gestureDetector.onTouchEvent((MotionEvent) obj2);
                }
            }
            ScaleGestureDetector scaleGestureDetector = this.c;
            if (scaleGestureDetector != null && objArr != null && objArr.length > 0) {
                Object obj3 = objArr[0];
                if (obj3 instanceof MotionEvent) {
                    scaleGestureDetector.onTouchEvent((MotionEvent) obj3);
                }
            }
        }
        return method.invoke(this.f26945a, objArr);
    }
}
