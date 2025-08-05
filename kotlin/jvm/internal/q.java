package kotlin.jvm.internal;

import java.util.Arrays;
import kotlin.KotlinNullPointerException;
import kotlin.UninitializedPropertyAccessException;

/* loaded from: classes.dex */
public class q {

    /* loaded from: classes9.dex */
    public static class a {
        private a() {
        }
    }

    private q() {
    }

    public static int a(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    public static int a(long j, long j2) {
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        return i == 0 ? 0 : 1;
    }

    public static String a(String str, Object obj) {
        return str + obj;
    }

    private static <T extends Throwable> T a(T t) {
        return (T) a((Throwable) t, q.class.getName());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T extends Throwable> T a(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        t.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
        return t;
    }

    public static void a() {
        throw ((KotlinNullPointerException) a(new KotlinNullPointerException()));
    }

    public static void a(int i, String str) {
        c();
    }

    public static void a(Object obj) {
        if (obj == null) {
            b();
        }
    }

    public static void a(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((IllegalStateException) a(new IllegalStateException(str + " must not be null")));
    }

    public static void a(String str) {
        throw ((UninitializedPropertyAccessException) a(new UninitializedPropertyAccessException(str)));
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static void b() {
        throw ((NullPointerException) a(new NullPointerException()));
    }

    public static void b(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((NullPointerException) a(new NullPointerException(str + " must not be null")));
    }

    public static void b(String str) {
        a("lateinit property " + str + " has not been initialized");
    }

    public static void c() {
        c("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static void c(Object obj, String str) {
        if (obj == null) {
            d(str);
        }
    }

    public static void c(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static void d(Object obj, String str) {
        if (obj == null) {
            e(str);
        }
    }

    private static void d(String str) {
        throw ((IllegalArgumentException) a(new IllegalArgumentException(f(str))));
    }

    public static void e(Object obj, String str) {
        if (obj == null) {
            g(str);
        }
    }

    private static void e(String str) {
        throw ((NullPointerException) a(new NullPointerException(f(str))));
    }

    private static String f(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = q.class.getName();
        int i = 0;
        while (!stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        while (stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        StackTraceElement stackTraceElement = stackTrace[i];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        return "Parameter specified as non-null is null: method " + className + "." + methodName + ", parameter " + str;
    }

    public static void g(String str) {
        throw ((NullPointerException) a(new NullPointerException(str)));
    }
}
