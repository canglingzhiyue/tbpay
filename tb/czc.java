package tb;

import android.content.Context;
import android.util.Log;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
public class czc {

    /* renamed from: a  reason: collision with root package name */
    private static Object f26608a;
    private static Class<?> b;
    private static Method c;
    private static Method d;
    private static Method e;
    private static Method f;

    static {
        kge.a(-801850953);
        c = null;
        d = null;
        e = null;
        f = null;
        try {
            Class<?> cls = Class.forName("com.android.id.impl.IdProviderImpl");
            b = cls;
            f26608a = cls.newInstance();
            c = b.getMethod("getUDID", Context.class);
            d = b.getMethod("getOAID", Context.class);
            e = b.getMethod("getVAID", Context.class);
            f = b.getMethod("getAAID", Context.class);
        } catch (Exception e2) {
            Log.e("IdentifierManager", "reflect exception!", e2);
        }
    }

    public static String a(Context context) {
        return a(context, d);
    }

    private static String a(Context context, Method method) {
        Object obj = f26608a;
        if (obj == null || method == null) {
            return null;
        }
        try {
            Object invoke = method.invoke(obj, context);
            if (invoke == null) {
                return null;
            }
            return (String) invoke;
        } catch (Exception e2) {
            Log.e("IdentifierManager", "invoke exception!", e2);
            return null;
        }
    }

    public static boolean a() {
        return (b == null || f26608a == null) ? false : true;
    }
}
