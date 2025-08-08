package tb;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes6.dex */
public class kap {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f29919a;
    private static Boolean b;
    private static String c;
    private static Boolean d;
    private static String e;

    static {
        kge.a(807838049);
        f29919a = null;
        b = null;
        d = null;
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        Boolean bool = f29919a;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            f29919a = Boolean.valueOf((kaq.a().getApplicationInfo().flags & 2) != 0 && !b());
            kau kauVar = kau.instance;
            kauVar.d("AUtil", "debug = " + f29919a, new Object[0]);
            return f29919a.booleanValue();
        } catch (Throwable th) {
            kau.instance.b("AUtil", "enable debug err", th, new Object[0]);
            return false;
        }
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue();
        }
        Boolean bool = b;
        if (bool != null) {
            return bool.booleanValue();
        }
        String c2 = c();
        if (!StringUtils.isEmpty(c2) && c2.split("\\.").length <= 3) {
            z = true;
        }
        Boolean valueOf = Boolean.valueOf(z);
        b = valueOf;
        return valueOf.booleanValue();
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[0]);
        }
        if (StringUtils.isEmpty(c)) {
            try {
                Context a2 = kaq.a();
                c = a2.getPackageManager().getPackageInfo(a2.getPackageName(), 0).versionName;
            } catch (Exception e2) {
                kau.instance.b("AUtil", "getAppVersionName err", e2, new Object[0]);
            }
        }
        return c;
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[0])).booleanValue();
        }
        try {
            String packageName = kaq.a().getPackageName();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) kaq.a().getSystemService("activity")).getRunningAppProcesses()) {
                if (runningAppProcessInfo.importance == 100 && runningAppProcessInfo.processName.startsWith(packageName)) {
                    kau.instance.d("AUtil", "appForeGround", "process", runningAppProcessInfo.processName);
                    return true;
                }
            }
        } catch (Exception e2) {
            kau.instance.b("AUtil", "isAppForeGround error ", e2, new Object[0]);
        }
        return false;
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[0])).booleanValue();
        }
        if (d == null) {
            try {
                try {
                    d = Boolean.valueOf(new File(kaq.a().getFilesDir().getAbsolutePath() + File.separator + ".." + File.separator + "..").canRead());
                    kau kauVar = kau.instance;
                    kauVar.d("AUtil", "isDualApp: " + d, new Object[0]);
                } catch (Throwable unused) {
                    d = false;
                    kau kauVar2 = kau.instance;
                    kauVar2.d("AUtil", "isDualApp: " + d, new Object[0]);
                }
            } catch (Throwable th) {
                kau kauVar3 = kau.instance;
                kauVar3.d("AUtil", "isDualApp: " + d, new Object[0]);
                throw th;
            }
        }
        return d.booleanValue();
    }

    public static String a(StackTraceElement[] stackTraceElementArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("935bc097", new Object[]{stackTraceElementArr});
        }
        StringBuffer stringBuffer = new StringBuffer();
        if (stackTraceElementArr != null) {
            try {
                if (stackTraceElementArr.length > 0) {
                    for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                        stringBuffer.append(stackTraceElement.toString());
                        stringBuffer.append("\n");
                    }
                }
            } catch (Exception unused) {
            }
        }
        return stringBuffer.toString();
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        boolean[] a2 = a(context, context.getPackageName(), context.getPackageName() + ":channel");
        if (a2 != null && a2.length == 2) {
            return a2[1] ^ a2[0];
        }
        return false;
    }

    public static boolean[] a(Context context, String... strArr) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (boolean[]) ipChange.ipc$dispatch("9c58d416", new Object[]{context, strArr});
        }
        if (strArr != null) {
            try {
                if (strArr.length != 0 && (runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) != null && !runningAppProcesses.isEmpty()) {
                    HashSet hashSet = new HashSet();
                    for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                        hashSet.add(runningAppProcessInfo.processName);
                    }
                    boolean[] zArr = new boolean[strArr.length];
                    for (int i = 0; i < zArr.length; i++) {
                        zArr[i] = hashSet.contains(strArr[i]);
                    }
                    return zArr;
                }
                return null;
            } catch (Throwable th) {
                kau.instance.b("AUtil", "isProcessArrAlive err", th, new Object[0]);
            }
        }
        return null;
    }

    public static String b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31400281", new Object[]{context});
        }
        if (!StringUtils.isEmpty(e)) {
            return e;
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null && !runningAppProcesses.isEmpty()) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo != null && runningAppProcessInfo.pid == Process.myPid()) {
                    String str = runningAppProcessInfo.processName;
                    e = str;
                    return str;
                }
            }
        }
        BufferedReader bufferedReader = null;
        try {
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader("/proc/" + Process.myPid() + "/cmdline"));
                try {
                    String readLine = bufferedReader2.readLine();
                    if (!StringUtils.isEmpty(readLine)) {
                        readLine = readLine.trim();
                    }
                    e = readLine;
                    try {
                        bufferedReader2.close();
                    } catch (IOException e2) {
                        kau.instance.b("AUtil", "getProcessName close is fail. exception=", e2, new Object[0]);
                    }
                    return readLine;
                } catch (Exception e3) {
                    e = e3;
                    bufferedReader = bufferedReader2;
                    kau.instance.b("AUtil", "getProcessName read is fail. exception=", e, new Object[0]);
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e4) {
                            kau.instance.b("AUtil", "getProcessName close is fail. exception=", e4, new Object[0]);
                        }
                    }
                    return "";
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e5) {
                            kau.instance.b("AUtil", "getProcessName close is fail. exception=", e5, new Object[0]);
                        }
                    }
                    throw th;
                }
            } catch (Exception e6) {
                e = e6;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
