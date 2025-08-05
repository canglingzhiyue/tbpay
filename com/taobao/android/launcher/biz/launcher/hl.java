package com.taobao.android.launcher.biz.launcher;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.android.task.Coordinator;
import com.taobao.login4android.api.Login;
import com.taobao.orange.OConstant;
import com.taobao.tao.Globals;
import com.taobao.tao.log.LogLevel;
import com.taobao.taobao.R;
import com.taobao.tlog.adapter.JSLogBridge;
import com.taobao.tlog.adapter.TLogJSBridage;
import com.ut.device.UTDevice;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import mtopsdk.common.util.TBSdkLog;
import tb.jgz;
import tb.jha;
import tb.jib;

/* loaded from: classes.dex */
public class hl extends com.taobao.android.launcher.biz.task.j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ String a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context}) : b(context);
    }

    public static /* synthetic */ String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[0]) : d();
    }

    public hl(String str) {
        super(str);
    }

    @Override // com.taobao.android.launcher.biz.task.i
    public void a(final Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{this, application, hashMap});
            return;
        }
        if (!LauncherRuntime.l) {
            android.taobao.util.k.a(false);
            android.taobao.util.i.a(false);
            TBSdkLog.setLogEnable(TBSdkLog.LogEnable.ErrorEnable);
        } else {
            android.taobao.util.k.a(true);
            android.taobao.util.i.a(true);
        }
        if (application == null) {
            return;
        }
        final String str = (String) com.taobao.android.launcher.common.c.a(OConstant.LAUNCH_ONLINEAPPKEY, null);
        Coordinator.execute(new Runnable() { // from class: com.taobao.android.launcher.biz.launcher.hl.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                com.taobao.tao.log.e.a().a(com.taobao.tao.log.g.a(application.getResources().getString(R.string.tlog_module)));
                String str2 = (String) com.taobao.android.launcher.common.c.a("process", null);
                if (TextUtils.isEmpty(str2)) {
                    str2 = hl.a(application);
                }
                String str3 = (String) com.taobao.android.launcher.common.c.a("packageName", null);
                if (TextUtils.isEmpty(str3)) {
                    str3 = application.getPackageName();
                }
                String str4 = TextUtils.isEmpty(str2) ? "DEFAULT" : str2;
                LogLevel b = com.taobao.tao.log.g.b(application.getResources().getString(R.string.tlog_level));
                if (!application.getResources().getBoolean(R.bool.tlog_switch)) {
                    b = LogLevel.N;
                }
                LogLevel logLevel = b;
                String c = hl.c();
                if (c == null) {
                    c = "8951ae070be6560f4fc1401e90a83a4e";
                }
                try {
                    String str5 = (String) com.taobao.android.launcher.common.c.a("appVersion", null);
                    if (TextUtils.isEmpty(str5)) {
                        str5 = Globals.getVersionName();
                    }
                    String str6 = str5;
                    String str7 = (String) com.taobao.android.launcher.common.c.a("deviceId", null);
                    if (TextUtils.isEmpty(str7)) {
                        str7 = UTDevice.getUtdid(application);
                    }
                    com.taobao.tao.log.f h = com.taobao.tao.log.f.a().a(application, logLevel, "logs", str4, str, str6).a(application).e(c).g(Login.getNick()).d(str7).a("12278902@android").b(str2).c(str3).a(new com.taobao.tlog.adapter.c(application)).b(new jgz()).h(com.android.taobao.zstd.d.b());
                    if (TextUtils.equals(str2, "com.taobao.taobao:channel")) {
                        h.a(200);
                        h.b(300);
                    }
                    h.b();
                    com.taobao.tao.log.f.a().c = "ha-remote-debug";
                    com.taobao.tao.log.f.a().f20688a = "motu-debug-log";
                    com.taobao.tao.log.f.a().f("MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCkljG92+Yqz66N05ou24ZUleqTJspB72jc2jJ2jIAhoXcOVYbc2NR/6lsoAb+LEMP5hYyp8DkVlZOarfDKL3btQdGx/MJP58HRLkwDVeOnqWQ26VLfAgQPN9/isZ1535OqcM9uUJM/P1hk/mtMuAQm0oz6LyOAGTglZFVCuuF9jwIDAQAB\n");
                } catch (Exception e) {
                    Log.e("TLog.InitTaoLog", "param is unlegal, tlog plugin start failure ", e);
                }
                try {
                    JSLogBridge.init();
                    TLogJSBridage.init();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                try {
                    com.taobao.tao.log.f.a().a(new jib());
                    com.taobao.tao.log.f.a().a(new jha());
                    com.taobao.tlog.adapter.e.a(application);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        });
    }

    private static String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[0]);
        }
        try {
            return UUID.randomUUID().toString().replace("-", "");
        } catch (Exception unused) {
            return null;
        }
    }

    private static String b(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31400281", new Object[]{context});
        }
        if (context == null) {
            return null;
        }
        try {
            int myPid = Process.myPid();
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null && runningAppProcesses.size() != 0) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.pid == myPid) {
                        return runningAppProcessInfo.processName;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }
}
