package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mrt.utils.a;
import com.tmall.android.dai.adapter.DAIUserAdapter;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public class rkr {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int USER_ADAPTER = 1;

    /* renamed from: a  reason: collision with root package name */
    private static Map<Integer, Class> f33211a;
    private static Map<Integer, Object> b;

    static {
        kge.a(-1882850721);
        f33211a = new HashMap();
        b = new HashMap();
    }

    public static void a(Class<? extends DAIUserAdapter> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20fa47d5", new Object[]{cls});
        } else {
            a(1, (Class) cls);
        }
    }

    public static void a(DAIUserAdapter dAIUserAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59d2a4e7", new Object[]{dAIUserAdapter});
        } else {
            a(1, dAIUserAdapter);
        }
    }

    public static void a(int i, Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1680d02", new Object[]{new Integer(i), cls});
        } else {
            f33211a.put(Integer.valueOf(i), cls);
        }
    }

    public static void a(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d36ff2b7", new Object[]{new Integer(i), obj});
            return;
        }
        b.put(Integer.valueOf(i), obj);
        f33211a.put(Integer.valueOf(i), obj.getClass());
    }

    public static DAIUserAdapter a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DAIUserAdapter) ipChange.ipc$dispatch("48e25cad", new Object[0]) : (DAIUserAdapter) a(1);
    }

    public static <T> T a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("9da1ccf7", new Object[]{new Integer(i)}) : (T) b(i);
    }

    public static Object b(int i) {
        Object obj = b.get(Integer.valueOf(i));
        if (obj != null) {
            return obj;
        }
        Class cls = f33211a.get(Integer.valueOf(i));
        if (cls == null) {
            return null;
        }
        try {
            Object newInstance = cls.getConstructor(new Class[0]).newInstance(new Object[0]);
            b.put(Integer.valueOf(i), newInstance);
            return newInstance;
        } catch (Exception e) {
            a.b("AdapterBinder", "getInstance", e);
            return null;
        }
    }
}
