package com.uploader.export;

import android.content.Context;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class UploaderGlobal {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final int DEFAULT_INSTANCE_TYPE = 0;

    /* renamed from: a  reason: collision with root package name */
    private static volatile Context f24055a;
    private static final ConcurrentHashMap<Integer, b> b = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<Integer, b> c = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<Integer, b> d = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<Integer, f> e = new ConcurrentHashMap<>();

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes9.dex */
    public @interface Definition {
    }

    static {
        b.put(0, new b(0, "21646297", "arup.m.taobao.com", "59.82.31.182"));
        c.put(0, new b(1, "21646297", "pre-arup.m.taobao.com", "59.82.17.132"));
        d.put(0, new b(2, "4272", "daily.arup.m.alibaba.net", "100.69.167.214"));
    }

    public static f a(Integer num) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("18f72902", new Object[]{num}) : e.get(num);
    }

    public static f a(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("3515c98e", new Object[]{fVar}) : e.put(Integer.valueOf(fVar.c().getInstanceType()), fVar);
    }

    public static b a(int i, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("1421b9c", new Object[]{new Integer(i), str}) : a(i, 0, str);
    }

    public static b a(int i, int i2, String str) {
        ConcurrentHashMap<Integer, b> concurrentHashMap;
        b put;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("126e69c9", new Object[]{new Integer(i), new Integer(i2), str});
        }
        if (i == 1) {
            concurrentHashMap = c;
        } else if (i == 2) {
            concurrentHashMap = d;
        } else {
            concurrentHashMap = b;
        }
        synchronized (concurrentHashMap) {
            b bVar = concurrentHashMap.get(Integer.valueOf(i2));
            put = concurrentHashMap.put(Integer.valueOf(i2), new b(i, str, bVar.c, bVar.d, bVar.e));
        }
        return put;
    }

    public static b a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("a5e9b57f", new Object[]{new Integer(i), new Integer(i2)});
        }
        if (i == 1) {
            return c.get(Integer.valueOf(i2));
        }
        if (i == 2) {
            return d.get(Integer.valueOf(i2));
        }
        return b.get(Integer.valueOf(i2));
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
        } else if (context == null) {
        } else {
            f24055a = context.getApplicationContext();
        }
    }

    public static Context a() {
        if (f24055a != null) {
            return f24055a;
        }
        synchronized (UploaderGlobal.class) {
            if (f24055a != null) {
                return f24055a;
            }
            try {
                Class<?> cls = Class.forName(ProcessUtils.ACTIVITY_THREAD);
                Object invoke = cls.getMethod(ProcessUtils.CURRENT_ACTIVITY_THREAD, new Class[0]).invoke(cls, new Object[0]);
                f24055a = (Context) invoke.getClass().getMethod("getApplication", new Class[0]).invoke(invoke, new Object[0]);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            return f24055a;
        }
    }
}
