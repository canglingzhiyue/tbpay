package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class qgm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final qgm f32914a;
    private final ConcurrentHashMap<Class<?>, Object> b = new ConcurrentHashMap<>();

    static {
        kge.a(-889722220);
        f32914a = new qgm();
    }

    private qgm() {
    }

    public static qgm a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (qgm) ipChange.ipc$dispatch("f0992e7", new Object[0]) : f32914a;
    }

    public void a(Class<?> cls, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b9dcc71", new Object[]{this, cls, obj});
        } else if (cls == null || obj == null || this.b.containsKey(cls)) {
        } else {
            this.b.put(cls, obj);
        }
    }

    public <T> T a(Class<T> cls) {
        T t;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("bd4d3fd", new Object[]{this, cls});
        }
        if (cls != null && (t = (T) this.b.get(cls)) != null && cls.isInstance(t)) {
            return t;
        }
        return null;
    }

    public <T> T b(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("d4d5cb3e", new Object[]{this, cls});
        }
        T t = (T) a(cls);
        if (t != null) {
            return t;
        }
        throw new RuntimeException("didn't find the necessary adapter for " + cls.getName());
    }
}
