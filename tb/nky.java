package tb;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.Window;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public class nky implements InvocationHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Window.Callback f31543a;
    private final List<a> b = new ArrayList(2);

    /* loaded from: classes7.dex */
    public interface a {
        void a(int i, float f, float f2, long j);

        void a(KeyEvent keyEvent);
    }

    public nky(Window.Callback callback) {
        this.f31543a = callback;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        String name = method.getName();
        if ("dispatchTouchEvent".equals(name)) {
            if (objArr != null && objArr.length > 0) {
                Object obj2 = objArr[0];
                if (obj2 instanceof MotionEvent) {
                    MotionEvent motionEvent = (MotionEvent) obj2;
                    int action = motionEvent.getAction();
                    float a2 = a(motionEvent);
                    float b = b(motionEvent);
                    long currentTimeMillis = System.currentTimeMillis();
                    for (a aVar : this.b) {
                        if (a2 > 0.0f && b > 0.0f) {
                            aVar.a(action, a2, b, currentTimeMillis);
                        }
                    }
                }
            }
        } else if ("dispatchKeyEvent".equals(name) && objArr != null && objArr.length > 0) {
            Object obj3 = objArr[0];
            if (obj3 instanceof KeyEvent) {
                for (a aVar2 : this.b) {
                    aVar2.a((KeyEvent) obj3);
                }
            }
        }
        try {
            return method.invoke(this.f31543a, objArr);
        } catch (InvocationTargetException e) {
            throw e.getTargetException();
        }
    }

    private float a(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5f37b46d", new Object[]{this, motionEvent})).floatValue();
        }
        try {
            return motionEvent.getX();
        } catch (IllegalArgumentException unused) {
            return -1.0f;
        }
    }

    private float b(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("74207cae", new Object[]{this, motionEvent})).floatValue();
        }
        try {
            return motionEvent.getY();
        } catch (IllegalArgumentException unused) {
            return -1.0f;
        }
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f321001f", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            this.b.add(aVar);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.b.clear();
        }
    }
}
