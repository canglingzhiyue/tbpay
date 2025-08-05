package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public class clj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile clj f26350a;
    private Object b;
    private Method c;

    private clj() {
        this.b = null;
        this.c = null;
        try {
            Class<?> cls = Class.forName("com.taobao.orange.OrangeConfig");
            Method method = cls.getMethod("getInstance", new Class[0]);
            this.c = cls.getMethod(kxd.GET_CONFIG_PREFIX, String.class, String.class, String.class);
            this.b = method.invoke(null, new Object[0]);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public static clj a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (clj) ipChange.ipc$dispatch("f03481d", new Object[0]);
        }
        if (f26350a == null) {
            synchronized (clj.class) {
                if (f26350a == null) {
                    f26350a = new clj();
                }
            }
        }
        return f26350a;
    }

    public final String a(String str, String str2) {
        Method method;
        Object obj = this.b;
        if (obj == null || (method = this.c) == null) {
            return str2;
        }
        try {
            return (String) method.invoke(obj, "AliSecSecuritySDK", str, str2);
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
            return str2;
        }
    }
}
