package com.taobao.adaemon;

import android.app.ActivityManager;
import android.app.ActivityThread;
import android.app.Application;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.service.notification.StatusBarNotification;
import android.system.Os;
import android.system.OsConstants;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.Choreographer;
import android.view.Display;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.connection.state.a;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.atools.StaticHook;
import com.ut.mini.UTAnalytics;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import mtopsdk.common.util.SymbolExpUtil;
import tb.akt;
import tb.jgw;
import tb.kaq;
import tb.kat;
import tb.kav;
import tb.kge;

/* loaded from: classes.dex */
public class l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private static String f8375a;
    private static String b;
    private static ActivityManager c;
    private static boolean d;
    private static File e;
    private static String f;
    public static long g;
    private static Boolean h;
    private static Field i;
    private static volatile Choreographer j;

    public static /* synthetic */ void lambda$rYbf_xQ0NIAXI5s0Xpnqe112aJc(kav kavVar) {
        b(kavVar);
    }

    static {
        kge.a(-2065426220);
        b = null;
        d = false;
    }

    public static String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context});
        }
        if (TextUtils.isEmpty(f8375a)) {
            if (Build.VERSION.SDK_INT >= 28) {
                f8375a = Application.getProcessName();
            } else {
                f8375a = ActivityThread.currentProcessName();
            }
            if (TextUtils.isEmpty(f8375a)) {
                f8375a = b(context, Process.myPid());
            }
        }
        return f8375a;
    }

    public static boolean a(Context context, int i2) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("258f9aa7", new Object[]{context, new Integer(i2)})).booleanValue();
        }
        try {
            if (i2 < 0) {
                e.b("Utils", "get pid fail!", new Object[0]);
                return false;
            }
            if (c == null) {
                c = (ActivityManager) context.getSystemService("activity");
            }
            List<ActivityManager.RunningServiceInfo> runningServices = c.getRunningServices(100);
            if (runningServices != null && runningServices.size() != 0) {
                for (ActivityManager.RunningServiceInfo runningServiceInfo : runningServices) {
                    if (runningServiceInfo.pid == i2 && !runningServiceInfo.service.getClassName().equals(TriggerService.class.getName()) && runningServiceInfo.foreground) {
                        try {
                            e.b("Utils", "has foreground service:" + runningServiceInfo.service.getClassName(), new Object[0]);
                            return true;
                        } catch (Throwable th) {
                            th = th;
                            z = true;
                            e.a("Utils", "hasForegroundService error", null, th);
                            return z;
                        }
                    }
                }
                return false;
            }
            e.b("Utils", "get service info fail", new Object[0]);
            return true;
        } catch (Throwable th2) {
            th = th2;
            z = false;
        }
    }

    public static int b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9eca0ff2", new Object[]{context})).intValue();
        }
        try {
            if (!a.a().a(context)) {
                return -1;
            }
            if (c == null) {
                c = (ActivityManager) context.getSystemService("activity");
            }
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = c.getRunningAppProcesses();
            if (runningAppProcesses != null && runningAppProcesses.size() != 0) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.uid == Process.myUid() && context.getPackageName().equals(runningAppProcessInfo.processName)) {
                        int i2 = runningAppProcessInfo.pid;
                        e.a("Utils", "get main pid:" + i2, new Object[0]);
                        return i2;
                    }
                }
                return -1;
            }
            e.a("Utils", "get main pid fail", new Object[0]);
            return -1;
        } catch (Throwable th) {
            e.a("Utils", "getMainPId error", null, th);
            return -1;
        }
    }

    public static List<Integer> c(Context context) {
        ArrayList arrayList;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("cb68a6e9", new Object[]{context});
        }
        try {
            if (c == null) {
                c = (ActivityManager) context.getSystemService("activity");
            }
            runningAppProcesses = c.getRunningAppProcesses();
        } catch (Throwable th) {
            th = th;
            arrayList = null;
        }
        if (runningAppProcesses != null && runningAppProcesses.size() != 0) {
            arrayList = null;
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                try {
                    if (runningAppProcessInfo.uid == Process.myUid() && runningAppProcessInfo.processName != null && !runningAppProcessInfo.processName.endsWith(":channel")) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(Integer.valueOf(runningAppProcessInfo.pid));
                    }
                } catch (Throwable th2) {
                    th = th2;
                    e.a("Utils", "getMainPId error", null, th);
                    return arrayList;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("get app pids:");
            sb.append(arrayList == null ? "" : arrayList.toString());
            e.a("Utils", sb.toString(), new Object[0]);
            return arrayList;
        }
        e.a("Utils", "get main pid fail", new Object[0]);
        return null;
    }

    public static boolean d(Context context) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        z = true;
        z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0236741", new Object[]{context})).booleanValue();
        }
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                StatusBarNotification[] activeNotifications = ((NotificationManager) context.getSystemService(RemoteMessageConst.NOTIFICATION)).getActiveNotifications();
                if (activeNotifications != null && activeNotifications.length != 0) {
                    e.a("Utils", "hasNotifications num:" + activeNotifications.length, new Object[0]);
                }
                z = false;
            } else {
                e.a("Utils", "hasNotifications android version:" + Build.VERSION.SDK_INT, new Object[0]);
            }
        } catch (Throwable th) {
            Object[] objArr = new Object[2];
            objArr[0] = null;
            byte b2 = z ? 1 : 0;
            byte b3 = z ? 1 : 0;
            byte b4 = z ? 1 : 0;
            byte b5 = z ? 1 : 0;
            byte b6 = z ? 1 : 0;
            objArr[b2] = th;
            e.a("Utils", "hasNotifications", objArr);
        }
        return z;
    }

    public static boolean e(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a0d012e0", new Object[]{context})).booleanValue() : UtilityImpl.isForeground(context);
    }

    public static SharedPreferences f(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SharedPreferences) ipChange.ipc$dispatch("e6a3108f", new Object[]{context}) : context.getSharedPreferences(k.MODULE_NAME, 4);
    }

    public static boolean g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a2296a1e", new Object[]{context})).booleanValue();
        }
        if (!TextUtils.isEmpty(a(context))) {
            return a(context).equals(j(context));
        }
        return false;
    }

    public static boolean l(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a588c439", new Object[]{context})).booleanValue() : context.getPackageName().equals(a(context));
    }

    public static void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
        } else {
            d = z;
        }
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : d;
    }

    public static int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[0])).intValue();
        }
        return (int) ((Runtime.getRuntime().totalMemory() * 100) / Runtime.getRuntime().maxMemory());
    }

    public static Debug.MemoryInfo h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Debug.MemoryInfo) ipChange.ipc$dispatch("2ef3091f", new Object[]{context});
        }
        long currentTimeMillis = System.currentTimeMillis();
        Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
        Debug.getMemoryInfo(memoryInfo);
        Log.e("Utils", "getMemoryInfo time:" + (System.currentTimeMillis() - currentTimeMillis));
        return memoryInfo;
    }

    public static Debug.MemoryInfo m(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Debug.MemoryInfo) ipChange.ipc$dispatch("ef947cba", new Object[]{context});
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (c == null) {
            c = (ActivityManager) context.getSystemService("activity");
        }
        Debug.MemoryInfo[] processMemoryInfo = c.getProcessMemoryInfo(new int[]{Process.myPid()});
        if (processMemoryInfo == null || processMemoryInfo.length != 1) {
            return null;
        }
        Debug.MemoryInfo memoryInfo = processMemoryInfo[0];
        Log.e("Utils", "getMemoryInfoAM time:" + (System.currentTimeMillis() - currentTimeMillis));
        return memoryInfo;
    }

    public static boolean i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a382c15c", new Object[]{context})).booleanValue();
        }
        String j2 = j(context);
        if (TextUtils.isEmpty(j2)) {
            return false;
        }
        if (c == null) {
            c = (ActivityManager) context.getSystemService("activity");
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = c.getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.processName.equals(j2)) {
                return true;
            }
        }
        return false;
    }

    private static String b(Context context, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("383f363c", new Object[]{context, new Integer(i2)});
        }
        try {
            if (c == null) {
                c = (ActivityManager) context.getSystemService("activity");
            }
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = c.getRunningAppProcesses();
            if (runningAppProcesses != null && runningAppProcesses.size() > 0) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.pid == i2) {
                        return runningAppProcessInfo.processName;
                    }
                }
            }
        } catch (Exception e2) {
            e.a("Utils", "[getProcessName]error.", null, e2);
        }
        return "";
    }

    public static String j(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dd113489", new Object[]{context});
        }
        String str = b;
        if (str != null) {
            return str;
        }
        try {
            ComponentName componentName = new ComponentName(context, "com.taobao.accs.AccsIPCProvider");
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            return packageManager.getProviderInfo(componentName, 0).processName;
        } catch (Exception e2) {
            e.a("Utils", "[getCoreProviderProcess]error", e2, new Object[0]);
            return null;
        }
    }

    public static boolean k(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a4dc189a", new Object[]{context})).booleanValue();
        }
        try {
            if (e == null) {
                e = new File(context.getFilesDir().getAbsolutePath() + File.separator + ".." + File.separator + "..");
            }
            return e.canRead();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue() : UtilityImpl.isAppKeepAlive();
    }

    public static String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[0]);
        }
        if (TextUtils.isEmpty(f)) {
            Context context = GlobalClientInfo.getContext();
            try {
                f = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return f;
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[0])).booleanValue();
        }
        Boolean bool = h;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Context e2 = e();
            int identifier = e2.getResources().getIdentifier("publish_type", "string", e2.getPackageName());
            if (identifier < 0) {
                h = false;
                e.b("Utils", "[isGrayVersion]error", new Object[0]);
            } else {
                h = Boolean.valueOf("0".equals(e2.getString(identifier)));
                e.b("Utils", "isGrayVersion = " + h, new Object[0]);
            }
        } catch (Throwable th) {
            e.a("Utils", jgw.IS_GRAY_VERSION, th, new Object[0]);
        }
        return h.booleanValue();
    }

    public static Context e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("1ad3a564", new Object[0]) : kaq.a();
    }

    public static int i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5dd2863", new Object[0])).intValue();
        }
        try {
            return akt.a();
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static float n(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a6e21b63", new Object[]{context})).floatValue();
        }
        try {
            if (Build.VERSION.SDK_INT >= 30) {
                return context.getDisplay().getRefreshRate();
            }
            Display display = ((DisplayManager) context.getSystemService("display")).getDisplay(0);
            if (display == null) {
                return 0.0f;
            }
            return display.getRefreshRate();
        } catch (Throwable th) {
            e.a("Utils", "getRefreshRate err", th, new Object[0]);
            return 0.0f;
        }
    }

    public static int a(Context context, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c6fc747b", new Object[]{context, str, str2, str3, str4})).intValue();
        }
        int i2 = Calendar.getInstance().get(6);
        SharedPreferences sharedPreferences = context.getSharedPreferences(h.SP_NAME, 4);
        int i3 = sharedPreferences.getInt(str2, -1);
        int i4 = sharedPreferences.getInt(str3, 0);
        if (i2 == i3) {
            return i4;
        }
        if (str4 != null) {
            int i5 = sharedPreferences.getInt(str4, 0);
            e.b("Utils", "getStartTimesToday", "type", str, "lastDay", Integer.valueOf(i3), "lastStartTimes", Integer.valueOf(i4), "hh", Double.valueOf(i5 / 60.0d));
            String str5 = k.b;
            kat.a(k.MODULE_NAME, str5, str + "|" + i5, i4);
        }
        return 0;
    }

    public static void a(Context context, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f3f1e3e", new Object[]{context, str, str2, str3});
            return;
        }
        int i2 = Calendar.getInstance().get(6);
        SharedPreferences sharedPreferences = context.getSharedPreferences(h.SP_NAME, 4);
        int i3 = sharedPreferences.getInt(str, -1);
        int i4 = sharedPreferences.getInt(str2, 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (i2 != i3) {
            edit.putInt(str, i2).putInt(str2, 1);
        } else {
            edit.putInt(str2, i4 + 1);
        }
        if (str3 != null) {
            edit.putInt(str3, (Calendar.getInstance().get(11) * 60) + Calendar.getInstance().get(12));
        }
        edit.commit();
    }

    public static Pair<Long, Long> h() {
        BufferedReader bufferedReader;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("e4aa4579", new Object[0]);
        }
        int myPid = Process.myPid();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            bufferedReader = new BufferedReader(new FileReader("/proc/" + myPid + "/stat"));
        } catch (Throwable th) {
            th = th;
            bufferedReader = null;
        }
        try {
            String[] split = bufferedReader.readLine().split(" ");
            Pair<Long, Long> create = Pair.create(Long.valueOf(a(Long.parseLong(split[13]))), Long.valueOf(a(Long.parseLong(split[14]))));
            e.a("Utils", "getCpuTime", "uTime", create.first, "sTime", create.second, MspDBHelper.BizEntry.COLUMN_NAME_PID, Integer.valueOf(myPid), "spent", Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
            return create;
        } catch (Throwable th2) {
            th = th2;
            try {
                e.a("Utils", "getCpuTime err", th, new Object[0]);
                return null;
            } finally {
                com.taobao.accs.utl.h.a(bufferedReader);
            }
        }
    }

    public static long a(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a8219750", new Object[]{new Long(j2)})).longValue();
        }
        if (g == 0) {
            g = 1000 / Os.sysconf(OsConstants._SC_CLK_TCK);
            e.b("Utils", "cpuJiffToMs", "jiff", Long.valueOf(g));
        }
        return j2 * g;
    }

    public static boolean g() {
        try {
            if (i == null) {
                i = Class.forName("com.taobao.linkmanager.AfcLifeCycleCenter").getDeclaredField("isLauncherStart");
            }
            return !((Boolean) i.get(null)).booleanValue();
        } catch (Throwable th) {
            e.a("Utils", "isLinkLaunch err", th, new Object[0]);
            return false;
        }
    }

    public static void a(final kav<Choreographer> kavVar) {
        if (j != null) {
            if (kavVar == null) {
                return;
            }
            kavVar.accept(j);
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            j = Choreographer.getInstance();
        }
        if (j == null) {
            try {
                Method a2 = StaticHook.a(Choreographer.class, "getMainThreadInstance", new Class[0]);
                if (a2 != null) {
                    j = (Choreographer) a2.invoke(null, new Object[0]);
                }
            } catch (Throwable th) {
                e.a("Utils", "postMainLooper, get choreographer err: ", th, new Object[0]);
            }
        }
        if (j == null) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.taobao.adaemon.-$$Lambda$l$rYbf_xQ0NIAXI5s0Xpnqe112aJc
                @Override // java.lang.Runnable
                public final void run() {
                    l.lambda$rYbf_xQ0NIAXI5s0Xpnqe112aJc(kav.this);
                }
            });
        } else if (kavVar == null) {
        } else {
            kavVar.accept(j);
        }
    }

    public static /* synthetic */ void b(kav kavVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df3c0b79", new Object[]{kavVar});
            return;
        }
        j = Choreographer.getInstance();
        if (kavVar == null) {
            return;
        }
        kavVar.accept(j);
    }

    public static String o(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2873f3ce", new Object[]{context});
        }
        if (!l(context)) {
            return "";
        }
        try {
            String globalProperty = UTAnalytics.getInstance().getDefaultTracker().getGlobalProperty("_afc_id");
            return !TextUtils.isEmpty(globalProperty) ? globalProperty.replaceAll(SymbolExpUtil.SYMBOL_VERTICALBAR, Constants.WAVE_SEPARATOR) : "";
        } catch (Throwable unused) {
            return "";
        }
    }
}
