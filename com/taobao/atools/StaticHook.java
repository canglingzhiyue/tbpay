package com.taobao.atools;

import android.os.Build;
import mtopsdk.common.util.StringUtils;
import com.alibaba.analytics.core.sync.q;
import com.alipay.android.msp.framework.dynfun.TplMsg;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandleInfo;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import sun.misc.Unsafe;
import tb.isq;
import tb.kau;

/* loaded from: classes6.dex */
public class StaticHook {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Method f16399a;
    private static Method b;
    private static Method c;
    private static Object d;
    private static long e;
    private static long f;
    private static long g;
    private static long h;
    private static long i;
    private static long j;
    private static boolean k;
    private static AtomicBoolean l = new AtomicBoolean();
    private static long m;
    private static long n;
    private static long o;
    private static long p;

    /* loaded from: classes6.dex */
    public static class Helper {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f16400a;
        public int b;

        /* loaded from: classes6.dex */
        public static final class A {

            /* renamed from: a  reason: collision with root package name */
            private transient Object f16401a;
            private transient int ac;
            private transient Object b;
            private transient Object c;
            private transient Object d;
            private transient Object[] e;
            private transient String f;
            private transient Object g;
            private transient Object h;
            private transient long i;
            private transient long m;
            private transient long s;
        }

        /* loaded from: classes6.dex */
        public static class B {

            /* renamed from: a  reason: collision with root package name */
            private Object f16402a;
            public long ar;
            public Object b;
            private Object c;
            public int h;
        }

        /* loaded from: classes6.dex */
        public static class C extends B {

            /* renamed from: a  reason: collision with root package name */
            private Object f16403a;
        }

        /* loaded from: classes6.dex */
        public static class D {
            private Object h;
            private Object m;
        }

        public static void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[0]);
            }
        }

        public static void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[0]);
            }
        }
    }

    static {
        try {
            f16399a = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
        } catch (Exception e2) {
            kau.instance.b("StaticHook", "reflect utils init error", e2, new Object[0]);
        }
        try {
            b = Class.class.getMethod("getMethod", String.class, Class[].class);
        } catch (Exception e3) {
            kau.instance.b("StaticHook", "reflect utils init error", e3, new Object[0]);
        }
        try {
            c = Class.class.getMethod("getDeclaredField", String.class);
        } catch (Exception e4) {
            kau.instance.b("StaticHook", "reflect utils init error", e4, new Object[0]);
        }
    }

    public static Method a(Object obj, String str, Class<?>... clsArr) {
        try {
            try {
                return (Method) f16399a.invoke(obj, str, clsArr);
            } catch (Throwable th) {
                kau.instance.b("StaticHook", "getDeclaredMethodByAddress err", th, new Object[0]);
                return null;
            }
        } catch (Throwable unused) {
            return (Method) c(obj, str, clsArr);
        }
    }

    public static Constructor a(Class cls, Class<?>... clsArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Constructor) ipChange.ipc$dispatch("dddee01a", new Object[]{cls, clsArr});
        }
        try {
            try {
                return cls.getConstructor(clsArr);
            } catch (Throwable th) {
                kau.instance.b("StaticHook", "getConstructor err", th, new Object[0]);
                return null;
            }
        } catch (Throwable unused) {
            return (Constructor) c(cls, cls.getName(), clsArr);
        }
    }

    public static Method b(Object obj, String str, Class<?>... clsArr) throws InvocationTargetException, IllegalAccessException {
        return (Method) b.invoke(obj, str, clsArr);
    }

    public static Field a(Class<?> cls, String str) throws InvocationTargetException, IllegalAccessException {
        return (Field) c.invoke(cls, str);
    }

    public static Field b(Class<?> cls, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Field) ipChange.ipc$dispatch("ca16283b", new Object[]{cls, str});
        }
        try {
            try {
                return a(cls, str);
            } catch (Throwable th) {
                kau.instance.b("StaticHook", "getStaticField err", th, new Object[0]);
                return null;
            }
        } catch (Throwable unused) {
            return a(cls, str, $$Lambda$StaticHook$yrspNycPR5Wp4wwWQAM7vSI4MkM.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Long) ipChange.ipc$dispatch("809bb2ca", new Object[0]) : Long.valueOf(n);
    }

    public static Field c(Class<?> cls, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Field) ipChange.ipc$dispatch("48772c1a", new Object[]{cls, str});
        }
        try {
            try {
                return a(cls, str);
            } catch (Throwable th) {
                kau.instance.b("StaticHook", "getInstanceField err", th, new Object[0]);
                return null;
            }
        } catch (Throwable unused) {
            return a(cls, str, $$Lambda$StaticHook$eLU_MOe77e05DYTfdLRHcvQfze4.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Long) ipChange.ipc$dispatch("98f9dc6b", new Object[0]) : Long.valueOf(m);
    }

    private static void a() {
        String str;
        Unsafe unsafe;
        MethodHandle unreflectGetter;
        MethodHandle unreflectGetter2;
        long j2;
        if (!l.getAndSet(true) && Build.VERSION.SDK_INT >= 26 && Build.VERSION.SDK_INT <= 34) {
            try {
                d = Unsafe.class.getDeclaredMethod("getUnsafe", new Class[0]).invoke(null, new Object[0]);
                kau.instance.d("StaticHook", "getUnsafe", a.ATOM_EXT_unsafe, d);
                unsafe = (Unsafe) d;
                e = unsafe.objectFieldOffset(Helper.A.class.getDeclaredField("m"));
                m = unsafe.objectFieldOffset(Helper.A.class.getDeclaredField(q.MSGTYPE_INTERVAL));
                n = unsafe.objectFieldOffset(Helper.A.class.getDeclaredField("s"));
                f = unsafe.objectFieldOffset(Helper.B.class.getDeclaredField("ar"));
                i = unsafe.objectFieldOffset(Helper.C.class.getDeclaredField("a"));
                j = unsafe.objectFieldOffset(Helper.D.class.getDeclaredField("m"));
                MethodHandle unreflect = MethodHandles.lookup().unreflect(Helper.class.getDeclaredMethod("a", new Class[0]));
                MethodHandle unreflect2 = MethodHandles.lookup().unreflect(Helper.class.getDeclaredMethod(TplMsg.VALUE_T_NATIVE_RETURN, new Class[0]));
                long j3 = unsafe.getLong(Helper.class, e);
                long j4 = unsafe.getLong(unreflect, f);
                long j5 = unsafe.getLong(unreflect2, f);
                g = j5 - j4;
                h = (j4 - j3) - g;
                kau.instance.d("StaticHook", "unsafeInit method", "startAddress", Long.valueOf(j3), "aAddress", Long.valueOf(j4), "bAddress", Long.valueOf(j5), "mtdSize", Long.valueOf(g), "mtdBias", Long.valueOf(h));
                unreflectGetter = MethodHandles.lookup().unreflectGetter(Helper.class.getDeclaredField("a"));
                unreflectGetter2 = MethodHandles.lookup().unreflectGetter(Helper.class.getDeclaredField(TplMsg.VALUE_T_NATIVE_RETURN));
                j2 = unsafe.getLong(Helper.class, m);
                str = "StaticHook";
            } catch (Throwable th) {
                th = th;
                str = "StaticHook";
            }
            try {
                long j6 = unsafe.getLong(unreflectGetter, f);
                long j7 = unsafe.getLong(unreflectGetter2, f);
                o = j7 - j6;
                p = j6 - j2;
                kau.instance.d(str, "unsafeInit field", "startAddress", Long.valueOf(j2), "aAddress", Long.valueOf(j6), "bAddress", Long.valueOf(j7), "fieldSize", Long.valueOf(o), "fieldBias", Long.valueOf(p));
                if (g > 0 && o > 0) {
                    k = true;
                }
                kau.instance.d(str, "unsafeInit", "unsafeAvailable", Boolean.valueOf(k));
            } catch (Throwable th2) {
                th = th2;
                kau.instance.b(str, "unsafeInit err", th, new Object[0]);
            }
        }
    }

    private static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        a();
        return Build.VERSION.SDK_INT >= 26 && k;
    }

    private static Field a(Class<?> cls, String str, isq<Long> isqVar) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Field) ipChange.ipc$dispatch("6df7bae5", new Object[]{cls, str, isqVar});
        }
        if (b() && !StringUtils.isEmpty(str)) {
            Unsafe unsafe = (Unsafe) d;
            long j2 = unsafe.getLong(cls, isqVar.get().longValue());
            int i2 = unsafe.getInt(j2);
            String str2 = "StaticHook";
            kau.instance.d(str2, "get field by address", "clazz", cls, "fields", Long.valueOf(j2), "numFields", Integer.valueOf(i2));
            if (j2 > 0 && i2 > 0) {
                MethodHandle unreflectGetter = MethodHandles.lookup().unreflectGetter(Helper.class.getDeclaredField("a"));
                int i3 = 0;
                while (i3 < i2) {
                    int i4 = i3;
                    String str3 = str2;
                    MethodHandle methodHandle = unreflectGetter;
                    int i5 = i2;
                    unsafe.putLong(unreflectGetter, f, (i3 * o) + j2 + p);
                    unsafe.putObject(methodHandle, i, (Object) null);
                    try {
                        MethodHandles.lookup().revealDirect(methodHandle);
                    } catch (Throwable unused) {
                    }
                    Field field = (Field) unsafe.getObject((MethodHandleInfo) unsafe.getObject(methodHandle, i), j);
                    kau.instance.d(str3, "getDeclaredFieldByAddress", "clazz", cls, "name", field.getName(), "index", Integer.valueOf(i4));
                    if (str.equals(field.getName())) {
                        kau.instance.d(str3, "get sFields by address success!", "field", field);
                        return field;
                    }
                    i3 = i4 + 1;
                    str2 = str3;
                    i2 = i5;
                    unreflectGetter = methodHandle;
                }
            }
        }
        return null;
    }

    private static Member c(Object obj, String str, Class<?>... clsArr) throws Throwable {
        Class<?>[] parameterTypes;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Member) ipChange.ipc$dispatch("3ba73c8d", new Object[]{obj, str, clsArr});
        }
        if (b() && !StringUtils.isEmpty(str)) {
            Unsafe unsafe = (Unsafe) d;
            long j2 = unsafe.getLong(obj, e);
            int i2 = unsafe.getInt(j2);
            String str2 = "getMemberByAddress";
            kau.instance.d("StaticHook", str2, "clazz", obj, "methods", Long.valueOf(j2), "mtdCount", Integer.valueOf(i2));
            if (j2 > 0 && i2 > 0) {
                MethodHandle unreflect = MethodHandles.lookup().unreflect(Helper.class.getDeclaredMethod("a", new Class[0]));
                int i3 = 0;
                while (i3 < i2) {
                    int i4 = i3;
                    String str3 = str2;
                    long j3 = j2;
                    unsafe.putLong(unreflect, f, (i3 * g) + h + j2);
                    unsafe.putObject(unreflect, i, (Object) null);
                    try {
                        MethodHandles.lookup().revealDirect(unreflect);
                    } catch (Throwable unused) {
                    }
                    Member member = (Member) unsafe.getObject((MethodHandleInfo) unsafe.getObject(unreflect, i), j);
                    kau.instance.d("StaticHook", str3, "clazz", obj, "name", member.getName(), "index", Integer.valueOf(i4));
                    if (member.getName().equals(str)) {
                        if (member instanceof Method) {
                            parameterTypes = ((Method) member).getParameterTypes();
                        } else {
                            parameterTypes = member instanceof Constructor ? ((Constructor) member).getParameterTypes() : null;
                        }
                        if (parameterTypes != null && clsArr.length == parameterTypes.length) {
                            int i5 = 0;
                            while (true) {
                                if (i5 >= clsArr.length) {
                                    z = true;
                                    break;
                                } else if (clsArr[i5] != parameterTypes[i5]) {
                                    z = false;
                                    break;
                                } else {
                                    i5++;
                                }
                            }
                            if (z) {
                                kau.instance.d("StaticHook", "getMemberByAddress success!", "member", member);
                                return member;
                            }
                        }
                    }
                    str2 = str3;
                    j2 = j3;
                    i3 = i4 + 1;
                }
            }
        }
        return null;
    }
}
