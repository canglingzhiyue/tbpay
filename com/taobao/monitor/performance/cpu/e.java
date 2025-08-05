package com.taobao.monitor.performance.cpu;

import android.os.Build;
import android.os.Process;
import android.system.OsConstants;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import tb.mqe;

/* loaded from: classes.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DEFAULT_JIFFY_HZ = 100;
    private static long b;
    private final String d;
    private final String e = "/proc/" + f18215a + "/stat";
    private final String f = "/proc/" + f18215a + "/task/";

    /* renamed from: a  reason: collision with root package name */
    private static final int f18215a = Process.myPid();
    private static final ThreadLocal<byte[]> c = new ThreadLocal<>();

    static {
        b = 100L;
        try {
            if (Build.VERSION.SDK_INT < 23) {
                return;
            }
            Class<?> cls = Class.forName("libcore.io.Libcore");
            Class<?> cls2 = Class.forName("libcore.io.Os");
            Field declaredField = cls.getDeclaredField("os");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(cls);
            Method method = cls2.getMethod("sysconf", Integer.TYPE);
            method.setAccessible(true);
            Object invoke = method.invoke(obj, Integer.valueOf(OsConstants._SC_CLK_TCK));
            if (invoke == null) {
                return;
            }
            b = ((Long) invoke).longValue();
        } catch (Exception e) {
            e.printStackTrace();
            f.a("ProcessCpuTracker", "sJiffyHz fail to get.");
        }
    }

    private static byte[] d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("ad3fab52", new Object[0]);
        }
        if (c.get() == null) {
            c.set(new byte[128]);
        }
        return c.get();
    }

    public e(String str) {
        this.d = str;
    }

    public static long a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[0])).longValue() : b;
    }

    public g b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("19661c03", new Object[]{this});
        }
        g a2 = a(f18215a, this.e, d());
        if (a2 != null) {
            a2.d = this.d;
        }
        return a2;
    }

    public g a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("bcdb4470", new Object[]{this, new Long(j)});
        }
        return a(j, this.f + j + "/stat", d());
    }

    public List<g> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("31b9b59d", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        String[] strArr = null;
        try {
            strArr = new File(this.f).list();
        } catch (Exception e) {
            f.a("ProcessCpuTracker", e.toString());
        }
        if (strArr != null) {
            for (String str : strArr) {
                int a2 = mqe.a(str, -1);
                if (a2 >= 0) {
                    long j = a2;
                    g a3 = a(j, this.f + a2 + "/stat", d());
                    if (a3 != null) {
                        a3.c = j;
                        arrayList.add(a3);
                    }
                }
            }
        }
        return arrayList;
    }

    private static g a(long j, String str, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("ffc95cff", new Object[]{new Long(j), str, bArr});
        }
        d dVar = new d(str, bArr);
        try {
            int a2 = dVar.a();
            g gVar = new g();
            gVar.c = j;
            g a3 = a(gVar, bArr, a2);
            try {
                dVar.b();
            } catch (Exception unused) {
            }
            return a3;
        } catch (Throwable unused2) {
            try {
                dVar.b();
            } catch (Exception unused3) {
            }
            return null;
        }
    }

    public static g a(g gVar, byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("f461e10e", new Object[]{gVar, bArr, new Integer(i)});
        }
        try {
            c cVar = new c(bArr, i);
            cVar.a();
            cVar.e();
            CharBuffer a2 = cVar.a(')', CharBuffer.allocate(16));
            cVar.d();
            CharBuffer a3 = cVar.a(CharBuffer.allocate(1));
            for (int i2 = 0; i2 < 11; i2++) {
                cVar.d();
            }
            gVar.d = String.valueOf(a2);
            gVar.e = String.valueOf(a3);
            gVar.f = a(cVar);
            gVar.g = a(cVar);
            gVar.h = a(cVar);
            gVar.i = a(cVar);
            return gVar;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static long a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("59528d6", new Object[]{cVar})).longValue();
        }
        long c2 = cVar.c();
        cVar.d();
        return c2;
    }

    public static g a(g gVar, g gVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("8195e6f8", new Object[]{gVar, gVar2});
        }
        if (gVar == null) {
            gVar2.j = true;
            gVar2.k = gVar2.a();
            return gVar2;
        }
        gVar2.j = false;
        gVar2.k = gVar2.a() - gVar.a();
        return gVar2;
    }

    public static List<g> a(List<g> list, List<g> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("66db90bd", new Object[]{list, list2});
        }
        if (list == null) {
            for (g gVar : list2) {
                gVar.j = true;
                gVar.k = gVar.a();
            }
            return list2;
        }
        HashMap hashMap = new HashMap();
        for (g gVar2 : list) {
            hashMap.put(Long.valueOf(gVar2.c), gVar2);
        }
        for (g gVar3 : list2) {
            g gVar4 = (g) hashMap.get(Long.valueOf(gVar3.c));
            if (gVar4 == null) {
                gVar3.j = true;
                gVar3.k = gVar3.a();
            } else {
                gVar3.j = false;
                gVar3.k = gVar3.a() - gVar4.a();
            }
        }
        return list2;
    }
}
