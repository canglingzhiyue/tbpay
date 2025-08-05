package com.uc.webview.export.multiprocess;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.taobao.android.dinamicx.monitor.DXMonitorConstant;
import com.taobao.android.launcher.bootstrap.tao.ability.dispatch.Dispatchers;
import com.taobao.search.common.util.i;
import com.uc.webview.export.multiprocess.IChildProcessSetup;
import com.uc.webview.export.multiprocess.helper.c;
import com.uc.webview.export.multiprocess.helper.e;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Locale;
import tb.bgy;

/* loaded from: classes9.dex */
public class SandboxedProcessService extends Service {
    private static int l;

    /* renamed from: a  reason: collision with root package name */
    boolean f23843a;
    boolean b;
    Constructor<?> c;
    Method d;
    Method e;
    Method f;
    IBinder g;
    Object h;
    Intent i;
    private long[] j = {0, 0, 0};
    private final IChildProcessSetup.Stub k = new IChildProcessSetup.Stub() { // from class: com.uc.webview.export.multiprocess.SandboxedProcessService.1
        /* JADX WARN: Removed duplicated region for block: B:45:0x0144  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x014a A[Catch: Throwable -> 0x0150, TRY_LEAVE, TryCatch #8 {Throwable -> 0x0299, blocks: (B:38:0x012c, B:40:0x0130, B:55:0x016e, B:56:0x01a4, B:60:0x01c6, B:59:0x01b0, B:36:0x0123, B:46:0x0145, B:47:0x014a), top: B:98:0x0123, inners: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:64:0x01de A[Catch: Throwable -> 0x0297, TRY_LEAVE, TryCatch #7 {Throwable -> 0x0297, blocks: (B:62:0x01d7, B:64:0x01de, B:65:0x01ea, B:68:0x01fe, B:69:0x0220, B:72:0x0258, B:73:0x025d, B:75:0x0272, B:76:0x028e), top: B:96:0x01d7, inners: #1, #5 }] */
        /* JADX WARN: Removed duplicated region for block: B:75:0x0272 A[Catch: Throwable -> 0x0297, TryCatch #7 {Throwable -> 0x0297, blocks: (B:62:0x01d7, B:64:0x01de, B:65:0x01ea, B:68:0x01fe, B:69:0x0220, B:72:0x0258, B:73:0x025d, B:75:0x0272, B:76:0x028e), top: B:96:0x01d7, inners: #1, #5 }] */
        @Override // com.uc.webview.export.multiprocess.IChildProcessSetup
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public android.os.IBinder preSetupConnection(android.os.Bundle r19) {
            /*
                Method dump skipped, instructions count: 685
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.uc.webview.export.multiprocess.SandboxedProcessService.AnonymousClass1.preSetupConnection(android.os.Bundle):android.os.IBinder");
        }
    };

    private static Object a(String str) {
        try {
            Method declaredMethod = Class.forName(str).getDeclaredMethod("getInstance", new Class[0]);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(null, new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    static void a(ParcelFileDescriptor parcelFileDescriptor) {
        if (parcelFileDescriptor == null) {
            c.b(Dispatchers.TYPE_SERVICE, "setCrashSdkHostFd: crashFd is null");
            return;
        }
        String str = "com.uc.crashsdk.export.CrashApi";
        Object a2 = a(str);
        if (a2 == null) {
            str = "com.uc2.crashsdk.export.CrashApi";
            a2 = a(str);
        }
        if (a2 == null) {
            c.b(Dispatchers.TYPE_SERVICE, "setCrashSdkHostFd: api is null");
            return;
        }
        try {
            Class.forName(str).getDeclaredMethod("setHostFd", ParcelFileDescriptor.class).invoke(a2, parcelFileDescriptor);
        } catch (Throwable th) {
            c.a(Dispatchers.TYPE_SERVICE, "setCrashSdkHostFd: init crashsdk failed.", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        Intent intent = this.i;
        if (intent.getExtras() == null) {
            c.a(Dispatchers.TYPE_SERVICE, "tryToHandleIntent - extras is null(maybe in pre startup mode), init delay");
            return;
        }
        c.f23848a = intent.getBooleanExtra("log.enable", false);
        String stringExtra = intent.getStringExtra("org.chromium.base.process_launcher.proc_type");
        if (TextUtils.isEmpty(stringExtra)) {
            stringExtra = DXMonitorConstant.DX_MONITOR_RENDER;
        }
        String stringExtra2 = intent.getStringExtra("org.chromium.base.process_launcher.browser_proc_name");
        if (TextUtils.isEmpty(stringExtra2)) {
            stringExtra2 = "Unknown";
        }
        c.a(stringExtra, intent.getIntExtra("proc.id", 0), intent.getIntExtra("org.chromium.base.process_launcher.browser_proc_pid", 0));
        l++;
        c.b(Dispatchers.TYPE_SERVICE, "tryToHandleIntent - %s, call count %d, %s", stringExtra2, Integer.valueOf(l), intent);
    }

    final long a(int i, long j) {
        long currentTimeMillis = System.currentTimeMillis();
        this.j[i] = currentTimeMillis - j;
        return currentTimeMillis;
    }

    final String a() {
        return String.format(Locale.getDefault(), "i0.%d,i1.%d,i2.%d", Long.valueOf(this.j[0]), Long.valueOf(this.j[1]), Long.valueOf(this.j[2]));
    }

    final Constructor<?> a(Class<?> cls) {
        try {
            Constructor<?> constructor = cls.getConstructor(new Class[0]);
            constructor.setAccessible(true);
            return constructor;
        } catch (Throwable th) {
            a("getConstructor from " + cls + " failure", th);
            return null;
        }
    }

    final Method a(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            return e.a(cls, str, clsArr);
        } catch (Throwable th) {
            a("method " + str + " not found in class " + cls, th);
            return null;
        }
    }

    final void a(String str, Throwable th) {
        c.b(Dispatchers.TYPE_SERVICE, str, th);
        a(true, true);
        throw new Error(str, th);
    }

    final void a(boolean z, boolean z2) {
        String[] stringArrayExtra;
        String stringExtra = this.i.getStringExtra("dex.path");
        String stringExtra2 = this.i.getStringExtra("odex.path");
        String stringExtra3 = this.i.getStringExtra("lib.path");
        String stringExtra4 = this.i.getStringExtra("source.dir");
        String stringExtra5 = this.i.getStringExtra("source.dir.prior");
        c.b(Dispatchers.TYPE_SERVICE, "core info:\n        dexPath: %s\n       odexPath: %s\n        libPath: %s\n      sourceDir: %s\n sourceDirPrior: %s\n     isIsolated: %b", stringExtra, stringExtra2, stringExtra3, stringExtra4, stringExtra5, Boolean.valueOf(this.b));
        if (!z || this.b) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(stringExtra);
        arrayList.add(stringExtra2);
        arrayList.add(stringExtra4);
        arrayList.add(stringExtra5);
        arrayList.add(stringExtra3);
        if (!TextUtils.isEmpty(stringExtra3) && !stringExtra3.equals(getApplicationInfo().nativeLibraryDir) && (stringArrayExtra = this.i.getStringArrayExtra("info.core.libs")) != null) {
            for (String str : stringArrayExtra) {
                if (!TextUtils.isEmpty(str)) {
                    arrayList.add(str.endsWith(bgy.SO_EXTENSION) ? new File(stringExtra3, str).getPath() : new File(stringExtra3, "lib" + str + bgy.SO_EXTENSION).getPath());
                }
            }
        }
        e.a(Dispatchers.TYPE_SERVICE, arrayList, z2);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        c.b(Dispatchers.TYPE_SERVICE, "onBind - intent: %s, extras: %s", intent, e.a(intent.getExtras()));
        this.i = intent;
        stopSelf();
        b();
        return this.k;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        c.a(Dispatchers.TYPE_SERVICE, i.b.MEASURE_ONCREATE);
    }

    @Override // android.app.Service
    public void onDestroy() {
        c.a(Dispatchers.TYPE_SERVICE, "SandboxedProcessService.onDestroy");
        super.onDestroy();
        if (this.g != null) {
            Method method = this.d;
            if (method != null) {
                try {
                    method.invoke(this.h, new Object[0]);
                } catch (Throwable th) {
                    c.b(Dispatchers.TYPE_SERVICE, "onDestroy: onDestroy failed.", th);
                }
            }
            this.h = null;
            this.g = null;
        }
        System.exit(0);
    }
}
