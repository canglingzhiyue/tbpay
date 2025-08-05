package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.dinamic.h;
import java.lang.reflect.Method;
import java.util.Arrays;

/* loaded from: classes7.dex */
public final class lnl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final a f30745a;
    private static final a b;
    private static Method c;
    private static Method d;

    static {
        kge.a(-68177137);
        f30745a = new a("com.taobao.android.dinamic.DinamicViewHelper", "registerReplaceViewConstructor", new Class[]{String.class, h.class});
        b = new a("com.taobao.android.dinamic.DinamicViewHelper", "registerReplaceEventHandler", new Class[]{String.class, com.taobao.android.dinamic.dinamic.a.class});
    }

    public static void a(String str, h hVar) {
        if (c == null) {
            c = a(f30745a);
        }
        Method method = c;
        if (method != null) {
            try {
                method.invoke(null, str, hVar);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static void a(String str, com.taobao.android.dinamic.dinamic.a aVar) {
        if (d == null) {
            d = a(b);
        }
        Method method = d;
        if (method != null) {
            try {
                method.invoke(null, str, aVar);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private static Method a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Method) ipChange.ipc$dispatch("23efb8d", new Object[]{aVar});
        }
        Method method = null;
        try {
            method = Class.forName(aVar.f30746a).getDeclaredMethod(aVar.b, aVar.c);
            method.setAccessible(true);
            return method;
        } catch (Throwable th) {
            ldf.d("Dx2ReplaceRegister", "parseMethod error " + aVar.toString());
            th.printStackTrace();
            return method;
        }
    }

    /* loaded from: classes7.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f30746a;
        public String b;
        public Class[] c;

        static {
            kge.a(-2131495646);
        }

        public a(String str, String str2, Class[] clsArr) {
            this.f30746a = str;
            this.b = str2;
            this.c = clsArr;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "MethodSignature{className='" + this.f30746a + "', methodName='" + this.b + "', params=" + Arrays.toString(this.c) + '}';
        }
    }
}
