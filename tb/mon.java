package tb;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.Window;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.impl.util.h;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class mon implements InvocationHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Window.Callback b;

    /* renamed from: a  reason: collision with root package name */
    public final List<a> f31170a = new ArrayList(2);
    public final List<b> c = new ArrayList(2);

    /* loaded from: classes.dex */
    public interface a {
        void a(int i, float f, float f2, long j);

        void a(KeyEvent keyEvent);
    }

    /* loaded from: classes7.dex */
    public interface b {
        void a(boolean z);
    }

    public mon(Window.Callback callback) {
        this.b = callback;
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
                    float b2 = b(motionEvent);
                    long a3 = h.a();
                    for (a aVar : this.f31170a) {
                        if (a2 > 0.0f && b2 > 0.0f) {
                            aVar.a(action, a2, b2, a3);
                        }
                    }
                }
            }
        } else if ("dispatchKeyEvent".equals(name)) {
            if (objArr != null && objArr.length > 0) {
                Object obj3 = objArr[0];
                if (obj3 instanceof KeyEvent) {
                    for (a aVar2 : this.f31170a) {
                        aVar2.a((KeyEvent) obj3);
                    }
                }
            }
        } else if ("onWindowFocusChanged".equals(name) && objArr != null && objArr.length > 0) {
            Object obj4 = objArr[0];
            if (obj4 instanceof Boolean) {
                for (b bVar : this.c) {
                    bVar.a(((Boolean) obj4).booleanValue());
                }
            }
        }
        try {
        } catch (InvocationTargetException e) {
            e = e;
        }
        try {
            return method.invoke(this.b, objArr);
        } catch (InvocationTargetException e2) {
            e = e2;
            if ("dispatchTouchEvent".equals(name) && (method.getReturnType().equals(Boolean.TYPE) || method.getReturnType().equals(Boolean.class))) {
                return false;
            }
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
        } catch (IllegalArgumentException e) {
            mpi.c("WindowCallbackProxy", e);
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
        } catch (IllegalArgumentException e) {
            mpi.c("WindowCallbackProxy", e);
            return -1.0f;
        }
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c13716f", new Object[]{this, aVar});
        } else if (this.f31170a.contains(aVar)) {
        } else {
            this.f31170a.add(aVar);
        }
    }

    public void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5eedbb0", new Object[]{this, aVar});
        } else {
            this.f31170a.remove(aVar);
        }
    }

    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c13e5ce", new Object[]{this, bVar});
        } else if (this.c.contains(bVar)) {
        } else {
            this.c.add(bVar);
        }
    }
}
