package com.taobao.mrt;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.alinnpython.AliNNPython;
import com.taobao.android.alinnpython.b;
import com.taobao.mrt.service.LogService;
import com.taobao.mrt.utils.a;
import java.io.File;
import java.util.Map;
import tb.ihq;
import tb.kge;
import tb.msk;
import tb.msl;

/* loaded from: classes7.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_MRT_STATE = "com.taobao.mrt.mrtstate";

    /* renamed from: a  reason: collision with root package name */
    public static String f18243a;
    public static boolean b;
    private static Context c;
    private static boolean d;
    private static boolean e;
    private static volatile boolean f;

    public static /* synthetic */ boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{new Boolean(z)})).booleanValue();
        }
        d = z;
        return z;
    }

    public static /* synthetic */ boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue() : d;
    }

    public static /* synthetic */ void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[0]);
        } else {
            h();
        }
    }

    public static /* synthetic */ void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[0]);
        } else {
            i();
        }
    }

    static {
        kge.a(-787628260);
        c = null;
        d = false;
        e = false;
        f = false;
        b = false;
    }

    public static synchronized boolean a(final Context context) {
        synchronized (c.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
            } else if (f) {
                return true;
            } else {
                if (context == null) {
                    return false;
                }
                if (!j()) {
                    a.c("MRT", "MRT.init() need some necessary configuration");
                    return false;
                }
                f = true;
                com.taobao.mrt.utils.c.a();
                c = context.getApplicationContext();
                boolean a2 = com.taobao.mrt.utils.f.a(context);
                e = a2;
                if (a2) {
                    a.a(LogService.LogReceiver.Console);
                } else {
                    a.a(LogService.LogReceiver.None);
                }
                b(context);
                AliNNPython.registerPythonInitCallback(new b() { // from class: com.taobao.mrt.c.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.alinnpython.b
                    public void a(Map map) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5a42121d", new Object[]{this, map});
                        } else if (c.d()) {
                        } else {
                            com.taobao.mrt.task.e.a();
                            c.e();
                            c.f();
                            c.a(ihq.a().c("mrt").g());
                            a.a("MRT", "Load Lib With RemoteSo -" + c.d());
                            if (!com.taobao.mrt.utils.f.a(context)) {
                                return;
                            }
                            AliNNPython.nativeRedirectStdioToLogCat();
                        }
                    }

                    @Override // com.taobao.android.alinnpython.b
                    public void a(Exception exc) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("dd91d31e", new Object[]{this, exc});
                            return;
                        }
                        a.d("MRT", "AliNNPython init failed");
                        c.a(false);
                    }
                });
                AliNNPython.initialize(context);
                d.b();
                com.taobao.mrt.thread.a.a().a(new Runnable() { // from class: com.taobao.mrt.c.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            d.a();
                        }
                    }
                }, 1000);
                g();
                return AliNNPython.nativeAvailable();
            }
        }
    }

    private static void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[0]);
            return;
        }
        a.b("MRT", "sendMRTInitState!!! + " + d);
        Intent intent = new Intent(ACTION_MRT_STATE);
        intent.putExtra("result", d);
        LocalBroadcastManager.getInstance(c).sendBroadcast(intent);
    }

    private static void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[0]);
            return;
        }
        a(com.taobao.mrt.task.e.f);
        a(com.taobao.mrt.task.e.e);
        a(com.taobao.mrt.task.e.b);
    }

    private static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        try {
            a.b("MRT", "add python path:" + str);
            AliNNPython.addPythonPath(str);
        } catch (Exception e2) {
            a.b("MRT", "addPythonPath", e2);
        }
    }

    private static void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[0]);
            return;
        }
        f.a().a("Log", new msk());
        f.a().a("Resource", new msl());
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : d;
    }

    private static boolean j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[0])).booleanValue() : f.a().b() != null;
    }

    public static Context b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("9ee3f7e1", new Object[0]) : c;
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : e;
    }

    private static void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{context});
        } else if (context == null) {
        } else {
            try {
                LocalBroadcastManager.getInstance(context).registerReceiver(new BroadcastReceiver() { // from class: com.taobao.mrt.MRT$3
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.content.BroadcastReceiver
                    public void onReceive(Context context2, Intent intent) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context2, intent});
                            return;
                        }
                        c.b = true;
                        a.b("MRT", "config arrived");
                    }
                }, new IntentFilter("com.taobao.mrt.cv_task_ready"));
            } catch (Throwable th) {
                a.a("MRT", "", th);
            }
        }
    }
}
