package com.alibaba.ability;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import kotlin.collections.ai;
import kotlin.collections.p;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.q;
import kotlin.text.n;
import tb.bfy;
import tb.kge;
import tb.mto;

/* loaded from: classes2.dex */
public final class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final e INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static final kotlin.d f1821a;
    private static final kotlin.d b;
    private static final kotlin.d c;
    private static Context d;

    private final bfy a() {
        IpChange ipChange = $ipChange;
        return (bfy) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("f02bf09", new Object[]{this}) : f1821a.getValue());
    }

    private final bfy b() {
        IpChange ipChange = $ipChange;
        return (bfy) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("16b46468", new Object[]{this}) : b.getValue());
    }

    private final Handler c() {
        IpChange ipChange = $ipChange;
        return (Handler) (ipChange instanceof IpChange ? ipChange.ipc$dispatch("a819f71c", new Object[]{this}) : c.getValue());
    }

    static {
        kge.a(230558105);
        INSTANCE = new e();
        f1821a = kotlin.e.a(MegaUtils$sMegaSchedule$2.INSTANCE);
        b = kotlin.e.a(MegaUtils$sAbilitySchedule$2.INSTANCE);
        c = kotlin.e.a(MegaUtils$sHandler$2.INSTANCE);
    }

    private e() {
    }

    @JvmStatic
    public static final Map<String, Object> a(Map<String, ? extends Object> map, String key) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("85c7b09c", new Object[]{map, key});
        }
        q.d(key, "key");
        if (map == null || (obj = map.get(key)) == null) {
            return null;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.alibaba.ability.AbilityData /* = kotlin.collections.Map<kotlin.String, kotlin.Any?> */");
        }
        return (Map) obj;
    }

    @JvmStatic
    public static final Map<String, Object> c(Map<String, ? extends Object> map, String key) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e178e55a", new Object[]{map, key});
        }
        q.d(key, "key");
        try {
            return a(map, key);
        } catch (Throwable unused) {
            return ai.a();
        }
    }

    @JvmStatic
    public static final List<Object> b(Map<String, ? extends Object> map, String key) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c05eb241", new Object[]{map, key});
        }
        q.d(key, "key");
        if (map == null || (obj = map.get(key)) == null) {
            return null;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        }
        return (List) obj;
    }

    @JvmStatic
    public static final List<Object> d(Map<String, ? extends Object> map, String key) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("dad41543", new Object[]{map, key});
        }
        q.d(key, "key");
        try {
            return b(map, key);
        } catch (Throwable unused) {
            return p.a();
        }
    }

    @JvmStatic
    public static final Boolean a(Map<String, ? extends Object> map, String key, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("b45ba543", new Object[]{map, key, bool});
        }
        q.d(key, "key");
        Boolean a2 = a(map != null ? map.get(key) : null);
        return a2 == null ? bool : a2;
    }

    @JvmStatic
    public static final Boolean b(Map<String, ? extends Object> map, String key, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("e809d004", new Object[]{map, key, bool});
        }
        q.d(key, "key");
        try {
            return a(map, key, bool);
        } catch (Throwable unused) {
            return bool;
        }
    }

    @JvmStatic
    public static final Integer a(Map<String, ? extends Object> map, String key, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("61f74797", new Object[]{map, key, num});
        }
        q.d(key, "key");
        Integer b2 = b(map != null ? map.get(key) : null);
        return b2 == null ? num : b2;
    }

    @JvmStatic
    public static final Integer b(Map<String, ? extends Object> map, String key, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("95a57258", new Object[]{map, key, num});
        }
        q.d(key, "key");
        try {
            return a(map, key, num);
        } catch (Throwable unused) {
            return num;
        }
    }

    @JvmStatic
    public static final Long a(Map<String, ? extends Object> map, String key, Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("9540776f", new Object[]{map, key, l});
        }
        q.d(key, "key");
        Long e = e(map != null ? map.get(key) : null);
        return e == null ? l : e;
    }

    @JvmStatic
    public static final Long b(Map<String, ? extends Object> map, String key, Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("869206f0", new Object[]{map, key, l});
        }
        q.d(key, "key");
        try {
            return a(map, key, l);
        } catch (Throwable unused) {
            return l;
        }
    }

    @JvmStatic
    public static final Float a(Map<String, ? extends Object> map, String key, Float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Float) ipChange.ipc$dispatch("c827c85b", new Object[]{map, key, f});
        }
        q.d(key, "key");
        Float c2 = c(map != null ? map.get(key) : null);
        return c2 == null ? f : c2;
    }

    @JvmStatic
    public static final Double a(Map<String, ? extends Object> map, String key, Double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Double) ipChange.ipc$dispatch("5d4fa80f", new Object[]{map, key, d2});
        }
        q.d(key, "key");
        Double d3 = d(map != null ? map.get(key) : null);
        return d3 == null ? d2 : d3;
    }

    @JvmStatic
    public static final Double b(Map<String, ? extends Object> map, String key, Double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Double) ipChange.ipc$dispatch("245b8f10", new Object[]{map, key, d2});
        }
        q.d(key, "key");
        try {
            return a(map, key, d2);
        } catch (Throwable unused) {
            return d2;
        }
    }

    @JvmStatic
    public static final String a(Map<String, ? extends Object> map, String key, String str) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("696f900f", new Object[]{map, key, str});
        }
        q.d(key, "key");
        return (map == null || (obj = map.get(key)) == null) ? str : obj.toString();
    }

    @JvmStatic
    public static final String b(Map<String, ? extends Object> map, String key, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("307b7710", new Object[]{map, key, str});
        }
        q.d(key, "key");
        return a(map, key, str);
    }

    @JvmStatic
    public static final Boolean a(Object obj) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("cd9f9ac1", new Object[]{obj});
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof Number) {
            if (((Number) obj).intValue() != 0) {
                z = true;
            }
            return Boolean.valueOf(z);
        } else if (obj instanceof String) {
            if ((!q.a((Object) "False", obj)) && (!q.a((Object) "false", obj)) && (!q.a((Object) "0", obj)) && (!q.a((Object) "null", obj)) && (!q.a((Object) a.ATOM_EXT_Null, obj)) && (!q.a((Object) "nil", obj))) {
                z = true;
            }
            return Boolean.valueOf(z);
        } else {
            throw new RuntimeException("parse boolean fail, data = [" + obj + ']');
        }
    }

    @JvmStatic
    public static final Integer b(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("4a8536c", new Object[]{obj});
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof Boolean) {
            return Integer.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
        }
        if (obj instanceof Number) {
            return Integer.valueOf(((Number) obj).intValue());
        }
        if (obj instanceof String) {
            Double a2 = a((String) obj);
            if (a2 != null) {
                return Integer.valueOf((int) a2.doubleValue());
            }
            throw new RuntimeException("parse int fail, data = [" + obj + ']');
        }
        throw new RuntimeException("parse int fail, data = [" + obj + ']');
    }

    @JvmStatic
    public static final Long e(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("4a408cd", new Object[]{obj});
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof Boolean) {
            return 0L;
        }
        if (obj instanceof Number) {
            return Long.valueOf(((Number) obj).longValue());
        }
        if (obj instanceof String) {
            return Long.valueOf(Long.parseLong((String) obj));
        }
        throw new RuntimeException("parse long fail, data = [" + obj + ']');
    }

    @JvmStatic
    public static final Float c(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Float) ipChange.ipc$dispatch("f3742d0f", new Object[]{obj});
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof Boolean) {
            return Float.valueOf(((Boolean) obj).booleanValue() ? 1.0f : 0.0f);
        } else if (obj instanceof Number) {
            return Float.valueOf(((Number) obj).floatValue());
        } else {
            if (obj instanceof String) {
                Double a2 = a((String) obj);
                if (a2 != null) {
                    return Float.valueOf((float) a2.doubleValue());
                }
                throw new RuntimeException("parse int fail, data = [" + obj + ']');
            }
            throw new RuntimeException("parse float fail, data = [" + obj + ']');
        }
    }

    @JvmStatic
    public static final Double d(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Double) ipChange.ipc$dispatch("6dd661b9", new Object[]{obj});
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof Boolean) {
            return Double.valueOf(((Boolean) obj).booleanValue() ? 1.0d : mto.a.GEO_NOT_SUPPORT);
        } else if (obj instanceof Number) {
            return Double.valueOf(((Number) obj).doubleValue());
        } else {
            if (obj instanceof String) {
                Double a2 = a((String) obj);
                if (a2 != null) {
                    return Double.valueOf(a2.doubleValue());
                }
                throw new RuntimeException("parse double fail, data = [" + obj + ']');
            }
            throw new RuntimeException("parse double fail, data = [" + obj + ']');
        }
    }

    @JvmStatic
    private static final Double a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Double) ipChange.ipc$dispatch("e814aeee", new Object[]{str});
        }
        String a2 = n.a(str, ",", "", false, 4, (Object) null);
        if (n.b(a2, "-0x", false, 2, (Object) null) | n.b(a2, "0x", false, 2, (Object) null)) {
            Integer a3 = n.a(n.b(a2, "0x", "", false, 4, (Object) null), 16);
            if (a3 == null) {
                return null;
            }
            return Double.valueOf(a3.intValue());
        }
        return n.c(a2);
    }

    @JvmStatic
    public static final void a(Runnable r) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{r});
            return;
        }
        q.d(r, "r");
        Thread currentThread = Thread.currentThread();
        Looper mainLooper = Looper.getMainLooper();
        q.b(mainLooper, "Looper.getMainLooper()");
        if (currentThread != mainLooper.getThread()) {
            r.run();
        } else {
            b(r);
        }
    }

    @JvmStatic
    public static final void b(Runnable r) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87c15fe7", new Object[]{r});
            return;
        }
        q.d(r, "r");
        bfy.a(INSTANCE.b(), r, 0L, null, 6, null);
    }

    @JvmStatic
    public static final void c(Runnable r) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf1ace8", new Object[]{r});
            return;
        }
        q.d(r, "r");
        Thread currentThread = Thread.currentThread();
        Looper mainLooper = Looper.getMainLooper();
        q.b(mainLooper, "Looper.getMainLooper()");
        if (currentThread != mainLooper.getThread()) {
            r.run();
        } else {
            bfy.a(INSTANCE.a(), r, 0L, null, 6, null);
        }
    }

    public static /* synthetic */ void a(Runnable runnable, long j, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bca556c1", new Object[]{runnable, new Long(j), new Integer(i), obj});
            return;
        }
        if ((i & 2) != 0) {
            j = 0;
        }
        a(runnable, j);
    }

    @JvmStatic
    public static final void a(Runnable run, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e91c09e", new Object[]{run, new Long(j)});
            return;
        }
        q.d(run, "run");
        Thread currentThread = Thread.currentThread();
        Looper mainLooper = Looper.getMainLooper();
        q.b(mainLooper, "Looper.getMainLooper()");
        if (currentThread == mainLooper.getThread() && j == 0) {
            run.run();
        } else {
            INSTANCE.c().postDelayed(run, j);
        }
    }

    @JvmStatic
    public static final void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        q.d(context, "context");
        d = context;
    }

    @JvmStatic
    public static final Context d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("f183c0e3", new Object[0]);
        }
        Context context = d;
        if (context != null) {
            return context;
        }
        Application e = INSTANCE.e();
        if (e != null) {
            d = e;
        } else {
            e = null;
        }
        return e;
    }

    private final Application e() {
        try {
            Class<?> cls = Class.forName(ProcessUtils.ACTIVITY_THREAD);
            Method declaredMethod = cls.getDeclaredMethod(ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]);
            q.b(declaredMethod, "activityThread.getDeclar…(\"currentActivityThread\")");
            Field declaredField = cls.getDeclaredField("mInitialApplication");
            q.b(declaredField, "activityThread.getDeclar…ld(\"mInitialApplication\")");
            declaredField.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, new Object[0]);
            q.b(invoke, "currentActivityThread.invoke(null)");
            Object obj = declaredField.get(invoke);
            q.b(obj, "mInitialApplication.get(current)");
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.app.Application");
            }
            return (Application) obj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
