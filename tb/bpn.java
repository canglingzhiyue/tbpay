package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class bpn<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private volatile T f26036a;
    private volatile Class<T> b;

    /* loaded from: classes.dex */
    interface a<V> {
        V a();
    }

    public bpn(Class<T> cls) {
        this.b = cls;
    }

    public T a(a<T> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("40c31177", new Object[]{this, aVar});
        }
        if (this.f26036a == null) {
            synchronized (bpn.class) {
                if (this.f26036a == null) {
                    this.f26036a = (T) a(this.b);
                    if (this.f26036a == null) {
                        this.f26036a = aVar.a();
                    }
                }
            }
        }
        return this.f26036a;
    }

    private static <T> T a(Class<T> cls) {
        String str;
        String name = cls.getName();
        if (name.endsWith("Interface")) {
            str = name.replace("Interface", "Imp");
        } else {
            str = name + "Imp";
        }
        try {
            Class<?> cls2 = Class.forName(str);
            try {
                Method declaredMethod = cls2.getDeclaredMethod("getInstance", new Class[0]);
                if (declaredMethod == null) {
                    return null;
                }
                return (T) declaredMethod.invoke(null, new Object[0]);
            } catch (Exception unused) {
                System.out.println("UmbrellaServiceFetcher, error when use getInstance() -> " + str + "interface name = " + name);
                try {
                    return (T) cls2.newInstance();
                } catch (Exception unused2) {
                    System.out.println("UmbrellaServiceFetcher, error when use constructor -> " + str + "interface name = " + name);
                    return null;
                }
            }
        } catch (Exception unused3) {
            System.out.println("UmbrellaServiceFetcher, error when Class.forName(" + str + "), interface name = " + name);
            return null;
        }
    }
}
