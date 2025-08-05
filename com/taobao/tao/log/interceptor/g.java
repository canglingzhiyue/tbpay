package com.taobao.tao.log.interceptor;

import android.content.Context;
import android.os.Process;
import android.preference.PreferenceManager;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.LogCategory;
import com.taobao.tao.log.LogLevel;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.kge;
import tb.myr;

/* loaded from: classes.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private static final long f20697a;
    private static List<c> b;
    private static List<a> c;
    private static ThreadPoolExecutor d;

    /* renamed from: lambda$1lM3kXlPu7uUBEk_3APbj6STp-U */
    public static /* synthetic */ void m1273lambda$1lM3kXlPu7uUBEk_3APbj6STpU(a aVar, myr myrVar) {
        a(aVar, myrVar);
    }

    /* renamed from: lambda$jVmWQP9Z7FVUy-4E5KTdduFduk0 */
    public static /* synthetic */ void m1275lambda$jVmWQP9Z7FVUy4E5KTdduFduk0(c cVar, long j, long j2, LogLevel logLevel, LogCategory logCategory, String str, String str2, String str3) {
        a(cVar, j, j2, logLevel, logCategory, str, str2, str3);
    }

    static {
        kge.a(-1270234227);
        f20697a = Process.myPid();
        b = null;
        c = null;
        d = null;
    }

    public static synchronized void a(Context context, c cVar) {
        synchronized (g.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3d1658a1", new Object[]{context, cVar});
            } else if (!a(context)) {
            } else {
                if (cVar != null) {
                    if (b == null) {
                        b = new CopyOnWriteArrayList();
                        a();
                    }
                    b.add(cVar);
                }
            }
        }
    }

    public static synchronized void a(c cVar) {
        synchronized (g.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d695ea9", new Object[]{cVar});
                return;
            }
            if (cVar != null && b != null) {
                b.remove(cVar);
                if (b.isEmpty()) {
                    b = null;
                    b();
                }
            }
        }
    }

    public static synchronized void a(Context context, a aVar) {
        synchronized (g.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3d156fe3", new Object[]{context, aVar});
            } else if (!a(context)) {
            } else {
                if (aVar != null) {
                    if (c == null) {
                        c = new CopyOnWriteArrayList();
                        a();
                    }
                    c.add(aVar);
                }
            }
        }
    }

    public static void a(LogLevel logLevel, LogCategory logCategory, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33724684", new Object[]{logLevel, logCategory, str, str2, str3});
        } else {
            a(-1L, -1L, logLevel, logCategory, str, str2, str3);
        }
    }

    public static void a(long j, long j2, final LogLevel logLevel, final LogCategory logCategory, final String str, final String str2, final String str3) {
        final long myTid;
        long j3 = j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("705d5804", new Object[]{new Long(j3), new Long(j2), logLevel, logCategory, str, str2, str3});
            return;
        }
        try {
            if (b == null) {
                return;
            }
            for (final c cVar : b) {
                if (cVar != null) {
                    if (j3 == -1) {
                        try {
                            myTid = Process.myTid();
                        } catch (Exception e) {
                            Log.e("TLogInterceptorManager", "notify callback exception", e);
                        }
                    } else {
                        myTid = j3;
                    }
                    final long currentTimeMillis = j2 == -1 ? System.currentTimeMillis() : j2;
                    d.execute(new Runnable() { // from class: com.taobao.tao.log.interceptor.-$$Lambda$g$jVmWQP9Z7FVUy-4E5KTdduFduk0
                        @Override // java.lang.Runnable
                        public final void run() {
                            g.m1275lambda$jVmWQP9Z7FVUy4E5KTdduFduk0(c.this, currentTimeMillis, myTid, logLevel, logCategory, str, str2, str3);
                        }
                    });
                }
                j3 = j;
            }
        } catch (Exception e2) {
            Log.e("TLogInterceptorManager", "onWriteRawLog` exception", e2);
        }
    }

    public static /* synthetic */ void a(c cVar, long j, long j2, LogLevel logLevel, LogCategory logCategory, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0fc5463", new Object[]{cVar, new Long(j), new Long(j2), logLevel, logCategory, str, str2, str3});
            return;
        }
        try {
            cVar.a(j, f20697a, j2, logLevel, logCategory, str, str2, str3);
        } catch (Exception e) {
            Log.e("TLogInterceptorManager", "interceptLogWrite exception", e);
        }
    }

    public static void a(LogLevel logLevel, String str, String str2, String str3, String str4, String str5, long j, String str6, String str7, String str8, int i, String str9, String str10) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4fb3af5", new Object[]{logLevel, str, str2, str3, str4, str5, new Long(j), str6, str7, str8, new Integer(i), str9, str10});
        } else if (b == null) {
        } else {
            a(-1L, -1L, logLevel, LogCategory.TraceEventLog, str2, str, str6 + (char) 31 + i + (char) 31 + str10 + (char) 31 + str7 + (char) 31 + str8 + (char) 31 + j + (char) 31 + str9 + (char) 31 + str3 + (char) 31 + str4 + (char) 31);
        }
    }

    public static void a(final myr myrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f57318d2", new Object[]{myrVar});
            return;
        }
        List<a> list = c;
        if (list == null) {
            return;
        }
        for (final a aVar : list) {
            if (aVar != null) {
                d.execute(new Runnable() { // from class: com.taobao.tao.log.interceptor.-$$Lambda$g$1lM3kXlPu7uUBEk_3APbj6STp-U
                    @Override // java.lang.Runnable
                    public final void run() {
                        g.m1273lambda$1lM3kXlPu7uUBEk_3APbj6STpU(a.this, myrVar);
                    }
                });
            }
        }
    }

    public static /* synthetic */ void a(a aVar, myr myrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("885aef55", new Object[]{aVar, myrVar});
            return;
        }
        try {
            aVar.onSpanFinish(myrVar);
        } catch (Exception e) {
            Log.e("TLogInterceptorManager", "interceptSpanLog exception", e);
        }
    }

    private static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        try {
            if (d != null && !d.isShutdown()) {
                return;
            }
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), $$Lambda$g$YPQhfSiBfov1bAu396f1RJpEm4.INSTANCE);
            d = threadPoolExecutor;
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        } catch (Exception e) {
            Log.e("TLogInterceptorManager", "initExecutor exception", e);
        }
    }

    public static /* synthetic */ Thread a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Thread) ipChange.ipc$dispatch("b72a5ba1", new Object[]{runnable});
        }
        Thread thread = new Thread(runnable, "tlog-interceptor");
        thread.setPriority(1);
        return thread;
    }

    private static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
            return;
        }
        try {
            if (d == null || d.isShutdown()) {
                return;
            }
            d.shutdown();
        } catch (Exception e) {
            Log.e("TLogInterceptorManager", "destroyExecutor exception", e);
        }
    }

    private static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue() : PreferenceManager.getDefaultSharedPreferences(context).getBoolean("tlog_intercept", com.taobao.tao.log.d.g());
    }
}
