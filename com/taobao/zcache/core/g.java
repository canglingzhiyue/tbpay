package com.taobao.zcache.core;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.res.AssetManager;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.zcache.Environment;
import com.taobao.zcache.Error;
import com.taobao.zcache.ZCacheConfig;
import com.taobao.zcache.n;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import tb.kge;

/* loaded from: classes9.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final Lock f23644a;
    private static boolean b;
    private static boolean c;
    private static AssetManager d;
    private static String e;
    private static IZCacheCore f;
    private static Error g;
    private static int h;
    private static Environment i;
    private static String j;
    private static ZCacheConfig k;
    private static final ConcurrentLinkedQueue<h> l;

    static {
        kge.a(273328522);
        f23644a = new ReentrantLock();
        b = false;
        c = false;
        l = new ConcurrentLinkedQueue<>();
        g = new Error(9994, "context is null");
        h = 0;
    }

    public static void a(Environment environment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55535f1a", new Object[]{environment});
            return;
        }
        IZCacheCore iZCacheCore = f;
        if (iZCacheCore == null) {
            i = environment;
        } else {
            iZCacheCore.setEnv(environment);
        }
    }

    public static void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
            return;
        }
        IZCacheCore iZCacheCore = f;
        if (iZCacheCore == null) {
            l.add(new h(str, str2, str3));
        } else {
            iZCacheCore.registerAccept(str, str2, str3);
        }
    }

    public static synchronized void a(Context context) {
        synchronized (g.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
                return;
            }
            if (context != null && !b) {
                String b2 = b(context);
                String packageName = context.getPackageName();
                boolean equals = TextUtils.equals(b2, packageName);
                c = equals;
                if (!equals) {
                    com.taobao.android.riverlogger.e.a(RVLLevel.Warn, "ZCache/Setup").a("setContext").a(-1, "Current process name \"%s\" is not equal to packageName \"%s\"", b2, packageName).a();
                }
                d = context.getAssets();
                String absolutePath = context.getDir("zcache", 0).getAbsolutePath();
                e = absolutePath;
                if (!absolutePath.endsWith("/")) {
                    e += "/";
                }
                b = true;
                g = new Error(9994, "ZCache is initializing");
                b();
            }
        }
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : c;
    }

    private static String b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31400281", new Object[]{context});
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return Application.getProcessName();
        }
        try {
            int myPid = Process.myPid();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
                if (runningAppProcessInfo.pid == myPid) {
                    return runningAppProcessInfo.processName;
                }
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static IZCacheCore b() {
        IZCacheCore iZCacheCore;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (IZCacheCore) ipChange.ipc$dispatch("b1a40c88", new Object[0]);
        }
        if (f == null && b && h <= 5) {
            if (f23644a.tryLock()) {
                String a2 = n.c().a("zcachecore");
                if (a2 == null) {
                    ZCacheCoreProxy zCacheCoreProxy = new ZCacheCoreProxy(d);
                    if (ZCacheCoreProxy.setProxyNative(zCacheCoreProxy, d, e)) {
                        f = zCacheCoreProxy;
                        z = true;
                    } else {
                        g = new Error(9995, "JNI failed: proxy is null");
                    }
                } else {
                    g = new Error(9993, a2);
                }
                f23644a.unlock();
                h++;
            }
            Error error = g;
            if (f == null && error != null) {
                com.taobao.android.riverlogger.e.a(RVLLevel.Error, "ZCache/Setup").a("loadSO").a(error.getCode(), error.getMessage()).a();
                HashMap hashMap = new HashMap();
                hashMap.put("errorCode", Integer.toString(error.getCode()));
                hashMap.put("errorMsg", error.getMessage());
                b.a("ZCache.Init", hashMap, new HashMap());
            }
            if (z && (iZCacheCore = f) != null) {
                Environment environment = i;
                if (environment != null) {
                    iZCacheCore.setEnv(environment);
                }
                String str = j;
                if (str != null) {
                    f.setLocale(str);
                }
                ZCacheConfig zCacheConfig = k;
                if (zCacheConfig != null) {
                    f.setDefaultConfig(zCacheConfig);
                }
                Iterator<h> it = l.iterator();
                while (it.hasNext()) {
                    h next = it.next();
                    f.registerAccept(next.f23645a, next.b, next.c);
                }
            }
        }
        return f;
    }

    public static Error c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Error) ipChange.ipc$dispatch("cc07a407", new Object[0]) : g;
    }

    public static com.taobao.android.riverlogger.b a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.riverlogger.b) ipChange.ipc$dispatch("44f222d7", new Object[]{str}) : com.taobao.android.riverlogger.e.a(RVLLevel.Error, str).a(g.getCode(), g.getMessage());
    }
}
