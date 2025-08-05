package com.taobao.android.diagnose.snapshot;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.content.IntentFilter;
import android.icu.text.SimpleDateFormat;
import android.os.Build;
import android.support.v4.content.LocalBroadcastManager;
import com.alibaba.security.realidentity.ui.webview.jsbridge.exec.TakePhotoApi;
import com.alipay.mobile.common.logging.util.avail.ExceptionData;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.diagnose.common.DiagnoseType;
import com.taobao.android.diagnose.snapshot.d;
import com.taobao.android.diagnose.v;
import com.taobao.android.tcrash.JvmUncaughtCrashListener;
import com.taobao.android.tcrash.TCrashSDK;
import com.taobao.search.sf.util.tlog.TLogTracker;
import com.taobao.tao.log.TLog;
import com.taobao.tao.log.logger.EventLogger;
import java.io.File;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import tb.kge;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private final Context f11725a;
    private final com.taobao.android.diagnose.model.a b;
    private e c;
    private d d;
    private com.taobao.android.diagnose.scene.a e;

    static {
        kge.a(-218025365);
    }

    private static String a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9064aa65", new Object[]{new Integer(i)});
        }
        switch (i) {
            case 1:
                return "EXIT_SELF";
            case 2:
                return "SIGNALED";
            case 3:
                return TakePhotoApi.LOW_MEMORY;
            case 4:
                return "APP CRASH(EXCEPTION)";
            case 5:
                return "APP CRASH(NATIVE)";
            case 6:
                return ExceptionData.TYPE_ANR;
            case 7:
                return "INITIALIZATION FAILURE";
            case 8:
                return "PERMISSION CHANGE";
            case 9:
                return "EXCESSIVE RESOURCE USAGE";
            case 10:
                return "USER REQUESTED";
            case 11:
                return "USER STOPPED";
            case 12:
                return "DEPENDENCY DIED";
            case 13:
                return "OTHER KILLS BY SYSTEM";
            default:
                return "UNKNOWN";
        }
    }

    public static /* synthetic */ void lambda$do7hZwW5wvSHMC6_GjO7BYSkCa8(a aVar) {
        aVar.g();
    }

    public static /* synthetic */ com.taobao.android.diagnose.model.a a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.diagnose.model.a) ipChange.ipc$dispatch("632b2857", new Object[]{aVar}) : aVar.b;
    }

    public static /* synthetic */ String a(Throwable th) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1003a7b3", new Object[]{th}) : b(th);
    }

    public static /* synthetic */ void a(a aVar, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70964b21", new Object[]{aVar, str, str2, str3});
        } else {
            aVar.a(str, str2, str3);
        }
    }

    public static /* synthetic */ e b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("baacebe9", new Object[]{aVar}) : aVar.c;
    }

    public a(Context context, com.taobao.android.diagnose.model.a aVar) {
        this.f11725a = context;
        this.b = aVar;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        v.a("ExceptionManager", "init");
        try {
            if (!com.taobao.android.diagnose.config.a.g()) {
                v.d("ExceptionManager", "ExceptionManager is disable!");
                return;
            }
            this.c = new e(this.f11725a);
            b();
            com.taobao.android.diagnose.common.c.a().a(new Runnable() { // from class: com.taobao.android.diagnose.snapshot.-$$Lambda$a$do7hZwW5wvSHMC6_GjO7BYSkCa8
                {
                    a.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    a.lambda$do7hZwW5wvSHMC6_GjO7BYSkCa8(a.this);
                }
            }, 15L, TimeUnit.SECONDS);
        } catch (Exception e) {
            v.a("ExceptionManager", "ExceptionManager init exception: ", e);
        }
    }

    public /* synthetic */ void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        try {
            String[] f = f();
            if (this.c.a(f)) {
                v.a("ExceptionManager", "Need re-generate the snapshot file");
                this.c.a(f[1], DiagnoseType.NativeCrash, this.b, null);
            }
            this.c.b();
        } catch (Exception e) {
            v.a("ExceptionManager", "init in runnable", e);
        }
    }

    public void a(com.taobao.android.diagnose.scene.a aVar, com.taobao.android.diagnose.collector.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("677db223", new Object[]{this, aVar, eVar});
            return;
        }
        this.e = aVar;
        e eVar2 = this.c;
        if (eVar2 == null) {
            return;
        }
        eVar2.f11729a = eVar;
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        e();
        d();
        c();
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            LocalBroadcastManager.getInstance(this.f11725a).registerReceiver(new ExceptionManager$1(this), new IntentFilter("com.taobao.android.diagnose.action.feedback"));
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.d = new d(new File(new File(this.f11725a.getDir("tombstone", 0), com.taobao.android.diagnose.c.a().d().i().process), "crashsdk/logs").getAbsolutePath(), new d.a() { // from class: com.taobao.android.diagnose.snapshot.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                a.this = this;
            }

            @Override // com.taobao.android.diagnose.snapshot.d.a
            public void a() {
                String str;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                try {
                    str = e.a();
                    try {
                        v.a("ExceptionManager", String.format("Native Crashed!! snapshotID: %s", str));
                        a.a(a.this, "scene_native_crash", str, null);
                        com.taobao.android.diagnose.common.b.a(str, DiagnoseType.NativeCrash.getIndex(), 1);
                        a.b(a.this).a(str, DiagnoseType.NativeCrash, a.a(a.this), null);
                        EventLogger.builder(5).setData("type", String.valueOf(DiagnoseType.NativeCrash.getIndex())).setData("snapshotID", str).log();
                    } catch (Exception e) {
                        e = e;
                        String format = String.format("%s-%s", e.getClass().getName(), e.getMessage());
                        com.taobao.android.diagnose.common.b.a(str, DiagnoseType.NativeCrash.getIndex(), format);
                        TLog.loge("Diagnose", "ExceptionManager", "Handle native exception: " + format);
                    }
                } catch (Exception e2) {
                    e = e2;
                    str = "";
                }
            }

            @Override // com.taobao.android.diagnose.snapshot.d.a
            public void b() {
                String str;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                    return;
                }
                try {
                    str = e.a();
                    try {
                        v.a("ExceptionManager", String.format("ANR happend!! snapshotID: %s", str));
                        com.taobao.android.diagnose.common.b.a(str, DiagnoseType.ANR.getIndex(), 1);
                        a.b(a.this).a(str, DiagnoseType.ANR, a.a(a.this), null);
                        EventLogger.builder(5).setData("type", String.valueOf(DiagnoseType.ANR.getIndex())).setData("snapshotID", str).log();
                        a.a(a.this, "scene_anr", str, null);
                    } catch (Exception e) {
                        e = e;
                        String format = String.format("%s-%s", e.getClass().getName(), e.getMessage());
                        com.taobao.android.diagnose.common.b.a(str, DiagnoseType.ANR.getIndex(), format);
                        TLog.loge("Diagnose", "ExceptionManager", "Handle anr exception: " + format);
                    }
                } catch (Exception e2) {
                    e = e2;
                    str = "";
                }
            }
        });
        this.d.startWatching();
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            TCrashSDK.instance().addJvmUncaughtCrashListener(new JvmUncaughtCrashListener() { // from class: com.taobao.android.diagnose.snapshot.a.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    a.this = this;
                }

                @Override // com.taobao.android.tcrash.JvmUncaughtCrashListener
                public Map<String, Object> onJvmUncaughtCrash(Thread thread, Throwable th) {
                    String str;
                    String str2;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (Map) ipChange2.ipc$dispatch("d9b5b942", new Object[]{this, thread, th});
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("diagnoseSDK", "taobao_diagnose_1.0.0.2");
                    hashMap.put("os", a.a(a.this).i().os);
                    hashMap.put("osDisplay", Build.DISPLAY);
                    try {
                        str2 = e.a();
                        try {
                            v.a("ExceptionManager", String.format("Java Crashed!! snapshotID：%s", str2));
                            com.taobao.android.diagnose.common.b.a(str2, DiagnoseType.JavaCrash.getIndex(), 1);
                            String name = thread.getName();
                            String name2 = th.getClass().getName();
                            String message = th.getMessage();
                            String a2 = a.a(th);
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put("thread", name);
                            hashMap2.put("cause", name2);
                            hashMap2.put("msg", message);
                            hashMap2.put(com.taobao.android.weex_framework.util.a.ATOM_stack, a2);
                            str = "ExceptionManager";
                            try {
                                a.b(a.this).a(str2, DiagnoseType.JavaCrash, a.a(a.this), hashMap2);
                                a.a(a.this, "scene_java_crash", str2, String.format("%s%s%s%s%s", name2, "\u001f", message, "\u001f", a2));
                                hashMap.put("snapshotID", str2);
                                EventLogger.builder(5).setData("type", String.valueOf(DiagnoseType.JavaCrash.getIndex())).setData("snapshotID", str2).setData("thread", name).setData("msg", message).setData("cause", name2).setData(com.taobao.android.weex_framework.util.a.ATOM_stack, a2).log();
                            } catch (Exception e) {
                                e = e;
                                String format = String.format("%s-%s", e.getClass().getName(), e.getMessage());
                                com.taobao.android.diagnose.common.b.a(str2, DiagnoseType.JavaCrash.getIndex(), format);
                                TLog.loge("Diagnose", str, "Handle java crash exception: " + format);
                                return hashMap;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            str = "ExceptionManager";
                        }
                    } catch (Exception e3) {
                        e = e3;
                        str = "ExceptionManager";
                        str2 = "";
                    }
                    return hashMap;
                }
            });
        }
    }

    public static String a(Context context, String str) {
        ActivityManager activityManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cfe597b6", new Object[]{context, str});
        }
        if (Build.VERSION.SDK_INT < 30) {
            return "Unsupported";
        }
        try {
            activityManager = (ActivityManager) context.getSystemService("activity");
        } catch (Exception e) {
            v.a("ExceptionManager", TLogTracker.SCENE_EXCEPTION, e);
        }
        if (activityManager == null) {
            return "Unknown";
        }
        for (ApplicationExitInfo applicationExitInfo : activityManager.getHistoricalProcessExitReasons(context.getPackageName(), 0, 0)) {
            v.a("ExceptionManager", applicationExitInfo.toString());
            if (applicationExitInfo.getProcessName().equals(str)) {
                return "time=" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(applicationExitInfo.getTimestamp())) + ";pid=" + applicationExitInfo.getPid() + ";reason=" + a(applicationExitInfo.getReason()) + ";status=" + applicationExitInfo.getStatus() + ";desc=" + applicationExitInfo.getDescription() + ";pss=" + com.taobao.android.diagnose.common.d.a(applicationExitInfo.getPss() << 10) + ";rss=" + com.taobao.android.diagnose.common.d.a(applicationExitInfo.getRss() << 10);
            }
        }
        return "Unknown";
    }

    private static String b(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f5451674", new Object[]{th});
        }
        if (th == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        StackTraceElement[] stackTrace = th.getStackTrace();
        int min = Math.min(stackTrace.length, 5);
        for (int i = 0; i < min; i++) {
            sb.append(stackTrace[i]);
            sb.append("\r\n");
        }
        return sb.toString();
    }

    private void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("\u001f");
        sb.append(str2);
        sb.append("\u001f");
        sb.append(System.currentTimeMillis());
        sb.append("\u001f");
        if (str3 != null) {
            sb.append(str3);
        }
        v.a("ExceptionManager", "saveCrashSceneInfo for " + str);
        com.taobao.android.diagnose.config.a.b(this.f11725a, sb.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x0097, code lost:
        if (r7 == 1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0099, code lost:
        if (r7 == 2) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x009c, code lost:
        r2 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x009e, code lost:
        r2 = 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String[] f() {
        /*
            Method dump skipped, instructions count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.diagnose.snapshot.a.f():java.lang.String[]");
    }
}
