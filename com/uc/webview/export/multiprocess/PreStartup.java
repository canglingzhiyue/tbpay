package com.uc.webview.export.multiprocess;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.text.TextUtils;
import com.alipay.mobile.common.transportext.biz.diagnose.network.Configuration;
import com.uc.webview.export.multiprocess.b;
import com.uc.webview.export.multiprocess.helper.e;
import java.util.concurrent.Executor;
import tb.riy;

/* loaded from: classes9.dex */
public class PreStartup implements com.uc.webview.export.multiprocess.b {
    private static final String TAG = "PreStartup";
    private static a[] sChildSvcConnections;
    private static b[] sLauncherThreads;
    private static c sServiceConfig;
    private static boolean sU4CoreIsRunning;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes9.dex */
    public static class a implements ServiceConnection {
        private static Handler m;

        /* renamed from: a  reason: collision with root package name */
        Context f23832a;
        d b;
        Handler c;
        boolean d;
        ComponentName f;
        IBinder g;
        ServiceConnection h;
        long i;
        long j;
        final String k;
        int e = 0;
        final Executor l = new Executor() { // from class: com.uc.webview.export.multiprocess.PreStartup.a.1
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                a.this.c.post(runnable);
            }
        };

        a(Context context, d dVar) {
            this.k = "PreStartup." + b.a.a(dVar.f23842a);
            this.f23832a = context;
            this.b = dVar;
            this.c = PreStartup.getLauncherHandlerImpl(dVar.f23842a);
        }

        private static String a(int i) {
            return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "UnknownState_".concat(String.valueOf(i)) : "DIS_CONNECTED" : "CONNECTED" : "BIND_FAILED" : "BINDING" : "BIND" : Configuration.IDLE;
        }

        static /* synthetic */ void a(a aVar) {
            if (aVar.e != 0) {
                com.uc.webview.export.multiprocess.helper.c.b(aVar.k, "startOnLauncherThread: call ChildServiceConnection.start() again!");
                return;
            }
            aVar.f = new ComponentName(aVar.f23832a.getPackageName(), aVar.b.b);
            Intent intent = new Intent();
            intent.setComponent(aVar.f);
            aVar.b(1);
            com.uc.webview.export.multiprocess.helper.c.b(aVar.k, "startOnLauncherThread: %s...", aVar.f);
            aVar.i = System.currentTimeMillis();
            Context context = aVar.f23832a;
            Handler handler = aVar.c;
            if (Build.VERSION.SDK_INT >= 24) {
                if (m == null) {
                    HandlerThread handlerThread = new HandlerThread("U4SvcBindHandler");
                    handlerThread.start();
                    m = new Handler(handlerThread.getLooper());
                }
                handler = m;
            }
            aVar.d = com.uc.webview.export.multiprocess.helper.a.a(context, intent, aVar, handler);
            if (aVar.d) {
                aVar.b(2);
            } else {
                aVar.b(3);
            }
        }

        static /* synthetic */ void a(a aVar, IBinder iBinder) {
            com.uc.webview.export.multiprocess.helper.c.a(aVar.k, "onServiceConnectedOnLauncherThread");
            aVar.g = iBinder;
            aVar.b(4);
            ServiceConnection serviceConnection = aVar.h;
            if (serviceConnection != null) {
                serviceConnection.onServiceConnected(aVar.f, aVar.g);
            }
        }

        private void b(int i) {
            com.uc.webview.export.multiprocess.helper.c.b(this.k, "state changed: %s -> %s", a(this.e), a(i));
            this.e = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c() {
            if (!this.d) {
                return;
            }
            com.uc.webview.export.multiprocess.helper.c.b(this.k, "unbindService %s", this.f);
            this.f23832a.unbindService(this);
            this.d = false;
        }

        static /* synthetic */ void c(a aVar) {
            com.uc.webview.export.multiprocess.helper.c.a(aVar.k, "onServiceDisconnectedOnLauncherThread");
            aVar.b(5);
            ServiceConnection serviceConnection = aVar.h;
            if (serviceConnection != null) {
                serviceConnection.onServiceDisconnected(aVar.f);
            }
            aVar.b();
        }

        final boolean a() {
            int i = this.e;
            return (i == 3 || i == 5) ? false : true;
        }

        final void b() {
            if (Looper.myLooper() != this.c.getLooper()) {
                this.c.post(new Runnable() { // from class: com.uc.webview.export.multiprocess.PreStartup.a.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        a.this.c();
                    }
                });
            } else {
                c();
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
            com.uc.webview.export.multiprocess.helper.c.a(this.k, "onServiceConnected");
            this.j = System.currentTimeMillis();
            this.c.post(new Runnable() { // from class: com.uc.webview.export.multiprocess.PreStartup.a.5
                @Override // java.lang.Runnable
                public final void run() {
                    a.a(a.this, iBinder);
                }
            });
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            com.uc.webview.export.multiprocess.helper.c.a(this.k, "onServiceDisconnected");
            this.c.post(new Runnable() { // from class: com.uc.webview.export.multiprocess.PreStartup.a.6
                @Override // java.lang.Runnable
                public final void run() {
                    a.c(a.this);
                }
            });
        }

        public final String toString() {
            return riy.ARRAY_START_STR + this.b + ", " + a(this.e) + ", " + a() + riy.ARRAY_END_STR;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes9.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        final Object f23839a = new Object();
        final HandlerThread b;
        final Handler c;

        b(String str) {
            this.b = new HandlerThread(str) { // from class: com.uc.webview.export.multiprocess.PreStartup.b.1
                @Override // android.os.HandlerThread
                protected final void onLooperPrepared() {
                    synchronized (b.this.f23839a) {
                        b.this.f23839a.notify();
                    }
                }
            };
            this.b.start();
            if (this.b.getLooper() == null) {
                try {
                    synchronized (this.f23839a) {
                        if (this.b.getLooper() == null) {
                            this.f23839a.wait(10000L);
                        }
                    }
                } catch (Throwable th) {
                    com.uc.webview.export.multiprocess.helper.c.b(PreStartup.TAG, "mThread.getLooper() failed", th);
                }
            }
            this.c = new Handler(this.b.getLooper());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes9.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        boolean f23841a = e.a("ALT");

        c() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:42:0x00c2, code lost:
            com.uc.webview.export.multiprocess.helper.c.c(com.uc.webview.export.multiprocess.PreStartup.TAG, "No. %d svc cls name is empty", java.lang.Integer.valueOf(r7));
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00d0, code lost:
            com.uc.webview.export.multiprocess.helper.c.c(com.uc.webview.export.multiprocess.PreStartup.TAG, "No. %d proc id(%d) is invalid", java.lang.Integer.valueOf(r7), java.lang.Integer.valueOf(r9));
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        final com.uc.webview.export.multiprocess.PreStartup.d[] a() {
            /*
                Method dump skipped, instructions count: 258
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.uc.webview.export.multiprocess.PreStartup.c.a():com.uc.webview.export.multiprocess.PreStartup$d[]");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes9.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        int f23842a;
        String b;

        d(int i, String str) {
            this.f23842a = i;
            this.b = str;
        }

        public final String toString() {
            return riy.ARRAY_START_STR + b.a.a(this.f23842a) + ", " + this.b + riy.ARRAY_END_STR;
        }
    }

    public static int bind(int i, ServiceConnection serviceConnection) {
        final a aVar;
        synchronized (PreStartup.class) {
            if (sChildSvcConnections == null || i < 0 || i >= sChildSvcConnections.length || (aVar = sChildSvcConnections[i]) == null || !aVar.a()) {
                return -1;
            }
            if (Looper.myLooper() != aVar.c.getLooper()) {
                throw new RuntimeException("bindService must be called in the launcher thread");
            }
            int i2 = 1;
            com.uc.webview.export.multiprocess.helper.c.b(aVar.k, "bindService %s...", aVar.f);
            aVar.h = serviceConnection;
            if (aVar.e == 3) {
                i2 = 0;
            } else if (aVar.e == 4) {
                aVar.c.post(new Runnable() { // from class: com.uc.webview.export.multiprocess.PreStartup.a.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (a.this.h != null) {
                            a.this.h.onServiceConnected(a.this.f, a.this.g);
                        }
                    }
                });
            }
            return i2;
        }
    }

    public static boolean connectionValid(int i) {
        synchronized (PreStartup.class) {
            sU4CoreIsRunning = true;
            if (sChildSvcConnections != null && i >= 0 && i < sChildSvcConnections.length) {
                a aVar = sChildSvcConnections[i];
                if (aVar != null) {
                    com.uc.webview.export.multiprocess.helper.c.b(TAG, "check connection: %s", aVar);
                    return aVar.a();
                }
                com.uc.webview.export.multiprocess.helper.c.b(TAG, "Can't find connection for proc id %d", Integer.valueOf(i));
            }
            return false;
        }
    }

    public static long getBindTime(int i) {
        a aVar;
        synchronized (PreStartup.class) {
            if (sChildSvcConnections == null || i < 0 || i >= sChildSvcConnections.length || (aVar = sChildSvcConnections[i]) == null) {
                return 0L;
            }
            return aVar.j - aVar.i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Handler getLauncherHandlerImpl(int i) {
        b orCreateLauncherThreadImpl = getOrCreateLauncherThreadImpl(i);
        if (orCreateLauncherThreadImpl == null) {
            return null;
        }
        return orCreateLauncherThreadImpl.c;
    }

    public static HandlerThread getLauncherHandlerThread(int i) {
        HandlerThread handlerThread;
        synchronized (PreStartup.class) {
            sU4CoreIsRunning = true;
            b orCreateLauncherThreadImpl = getOrCreateLauncherThreadImpl(i);
            handlerThread = orCreateLauncherThreadImpl == null ? null : orCreateLauncherThreadImpl.b;
        }
        return handlerThread;
    }

    private static b getOrCreateLauncherThreadImpl(int i) {
        if (sLauncherThreads == null) {
            return null;
        }
        if (!sServiceConfig.f23841a) {
            i = 0;
        }
        if (sLauncherThreads[i] == null) {
            sLauncherThreads[i] = new b(sServiceConfig.f23841a ? i == 0 ? "U4_NRProcLauncherThread" : i == 1 ? "U4_IRProcLauncherThread" : "U4_GProcLauncherThread" : "U4_ProLauncherThread");
        }
        return sLauncherThreads[i];
    }

    public static void setContext(Context context) {
        e.a(context);
    }

    public static void setEnable(boolean z) {
        if (e.a() == null) {
            return;
        }
        com.uc.webview.export.multiprocess.helper.c.b(TAG, "setEnable(%b)", Boolean.valueOf(z));
        e.a("enable", z);
    }

    public static void startup() {
        startup(e.a());
    }

    public static void startup(Context context) {
        if (context == null) {
            return;
        }
        String b2 = e.b(context);
        if (TextUtils.isEmpty(b2) || b2.contains(":")) {
            return;
        }
        synchronized (PreStartup.class) {
            startupSync(context);
        }
    }

    private static void startupSync(Context context) {
        if (sU4CoreIsRunning) {
            com.uc.webview.export.multiprocess.helper.c.b(TAG, "U4 core is running, ignore startup");
        } else if (sServiceConfig == null) {
            e.a(context);
            try {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
            } catch (Throwable unused) {
            }
            c cVar = new c();
            sServiceConfig = cVar;
            d[] a2 = cVar.a();
            if (a2 == null) {
                return;
            }
            sLauncherThreads = new b[3];
            sChildSvcConnections = new a[3];
            int[] iArr = {1, 0, 2};
            for (int i = 0; i < 3; i++) {
                int i2 = iArr[i];
                int length = a2.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        break;
                    }
                    d dVar = a2[i3];
                    if (dVar != null && dVar.f23842a == i2) {
                        final a aVar = new a(context, dVar);
                        sChildSvcConnections[dVar.f23842a] = aVar;
                        com.uc.webview.export.multiprocess.helper.c.a(aVar.k, "start(launcher: %s)...", aVar.c);
                        aVar.c.post(new Runnable() { // from class: com.uc.webview.export.multiprocess.PreStartup.a.2
                            @Override // java.lang.Runnable
                            public final void run() {
                                a.a(a.this);
                            }
                        });
                        break;
                    }
                    i3++;
                }
            }
        }
    }

    private static void stopUnwantedService(int i, int[] iArr, String[] strArr) {
        boolean z;
        if (e.a() == null) {
            return;
        }
        com.uc.webview.export.multiprocess.helper.c.a(TAG, "stopUnwantedService");
        synchronized (PreStartup.class) {
            if (i <= 0) {
                if (sChildSvcConnections != null) {
                    for (int i2 = 0; i2 < sChildSvcConnections.length; i2++) {
                        a aVar = sChildSvcConnections[i2];
                        if (aVar != null) {
                            aVar.b();
                            sChildSvcConnections[i2] = null;
                        }
                    }
                    sChildSvcConnections = null;
                }
            } else if (sChildSvcConnections != null) {
                for (int i3 = 0; i3 < sChildSvcConnections.length; i3++) {
                    a aVar2 = sChildSvcConnections[i3];
                    if (aVar2 != null) {
                        int length = iArr.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 >= length) {
                                z = true;
                                break;
                            } else if (iArr[i4] == aVar2.b.f23842a) {
                                z = false;
                                break;
                            } else {
                                i4++;
                            }
                        }
                        if (z) {
                            com.uc.webview.export.multiprocess.helper.c.b(aVar2.k, "no need anymore - %s", aVar2.b);
                            aVar2.b();
                            sChildSvcConnections[i3] = null;
                        }
                    }
                }
            }
        }
    }

    public static void unbind(int i) {
        a aVar;
        synchronized (PreStartup.class) {
            if (sChildSvcConnections != null && i >= 0 && i < sChildSvcConnections.length && (aVar = sChildSvcConnections[i]) != null) {
                aVar.b();
                sChildSvcConnections[i] = null;
            }
        }
    }

    public static void updateSetting(int i, int[] iArr, String[] strArr, boolean z) {
        if (e.a() == null) {
            return;
        }
        e.a("enable", i > 0);
        synchronized (PreStartup.class) {
            e.a("ALT", z);
            if (i <= 0) {
                com.uc.webview.export.multiprocess.helper.c.b(TAG, "updateSetting: disable");
                e.b("proc_ids", "");
                e.b("svc_names", "");
            } else {
                StringBuilder sb = new StringBuilder();
                for (int i2 = 0; i2 < i; i2++) {
                    sb.append(iArr[i2]);
                    sb.append(',');
                }
                sb.setLength(sb.length() - 1);
                String sb2 = sb.toString();
                e.b("proc_ids", sb2);
                sb.setLength(0);
                for (int i3 = 0; i3 < i; i3++) {
                    sb.append(strArr[i3]);
                    sb.append(',');
                }
                sb.setLength(sb.length() - 1);
                String sb3 = sb.toString();
                e.b("svc_names", sb3);
                com.uc.webview.export.multiprocess.helper.c.b(TAG, "updateSetting: [%s] [%s]", sb2, sb3);
            }
        }
    }

    public static void updateSettingAndStopUnwantedService(int i, int[] iArr, String[] strArr, boolean z) {
        if (e.a() == null) {
            return;
        }
        updateSetting(i, iArr, strArr, z);
        stopUnwantedService(i, iArr, strArr);
    }
}
