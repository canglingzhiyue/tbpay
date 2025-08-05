package kotlin.jvm.internal;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import tb.ruk;
import tb.rul;
import tb.rum;
import tb.run;
import tb.ruo;
import tb.rup;
import tb.ruq;
import tb.rur;
import tb.rus;
import tb.rut;
import tb.ruu;
import tb.ruv;
import tb.ruw;
import tb.rux;
import tb.ruy;
import tb.ruz;
import tb.rva;
import tb.rvb;
import tb.rvc;
import tb.rvd;
import tb.rve;
import tb.rvf;
import tb.rvg;
import tb.rvh;
import tb.rvi;
import tb.rvj;
import tb.rvk;
import tb.rvl;

/* loaded from: classes9.dex */
public class x {
    public static ClassCastException a(ClassCastException classCastException) {
        throw ((ClassCastException) a(classCastException));
    }

    public static Iterable a(Object obj) {
        if ((obj instanceof rvh) && !(obj instanceof rvj)) {
            a(obj, "kotlin.collections.MutableIterable");
        }
        return b(obj);
    }

    private static <T extends Throwable> T a(T t) {
        return (T) q.a((Throwable) t, x.class.getName());
    }

    public static void a(Object obj, String str) {
        String name = obj == null ? "null" : obj.getClass().getName();
        a(name + " cannot be cast to " + str);
    }

    public static void a(String str) {
        throw a(new ClassCastException(str));
    }

    public static boolean a(Object obj, int i) {
        return (obj instanceof kotlin.c) && k(obj) == i;
    }

    public static Iterable b(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e) {
            throw a(e);
        }
    }

    public static Object b(Object obj, int i) {
        if (obj != null && !a(obj, i)) {
            a(obj, "kotlin.jvm.functions.Function" + i);
        }
        return obj;
    }

    public static Collection c(Object obj) {
        if ((obj instanceof rvh) && !(obj instanceof rvi)) {
            a(obj, "kotlin.collections.MutableCollection");
        }
        return d(obj);
    }

    public static Collection d(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e) {
            throw a(e);
        }
    }

    public static boolean e(Object obj) {
        if (obj instanceof List) {
            return !(obj instanceof rvh) || (obj instanceof rvk);
        }
        return false;
    }

    public static List f(Object obj) {
        if ((obj instanceof rvh) && !(obj instanceof rvk)) {
            a(obj, "kotlin.collections.MutableList");
        }
        return g(obj);
    }

    public static List g(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e) {
            throw a(e);
        }
    }

    public static boolean h(Object obj) {
        if (obj instanceof Map) {
            return !(obj instanceof rvh) || (obj instanceof rvl);
        }
        return false;
    }

    public static Map i(Object obj) {
        if ((obj instanceof rvh) && !(obj instanceof rvl)) {
            a(obj, "kotlin.collections.MutableMap");
        }
        return j(obj);
    }

    public static Map j(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e) {
            throw a(e);
        }
    }

    public static int k(Object obj) {
        if (obj instanceof p) {
            return ((p) obj).getArity();
        }
        if (obj instanceof ruk) {
            return 0;
        }
        if (obj instanceof rul) {
            return 1;
        }
        if (obj instanceof ruw) {
            return 2;
        }
        if (obj instanceof rva) {
            return 3;
        }
        if (obj instanceof rvb) {
            return 4;
        }
        if (obj instanceof rvc) {
            return 5;
        }
        if (obj instanceof rvd) {
            return 6;
        }
        if (obj instanceof rve) {
            return 7;
        }
        if (obj instanceof rvf) {
            return 8;
        }
        if (obj instanceof rvg) {
            return 9;
        }
        if (obj instanceof rum) {
            return 10;
        }
        if (obj instanceof run) {
            return 11;
        }
        if (obj instanceof ruo) {
            return 12;
        }
        if (obj instanceof rup) {
            return 13;
        }
        if (obj instanceof ruq) {
            return 14;
        }
        if (obj instanceof rur) {
            return 15;
        }
        if (obj instanceof rus) {
            return 16;
        }
        if (obj instanceof rut) {
            return 17;
        }
        if (obj instanceof ruu) {
            return 18;
        }
        if (obj instanceof ruv) {
            return 19;
        }
        if (obj instanceof rux) {
            return 20;
        }
        if (obj instanceof ruy) {
            return 21;
        }
        return obj instanceof ruz ? 22 : -1;
    }
}
