package tb;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import mtopsdk.common.util.StringUtils;
import java.io.BufferedReader;
import java.io.FileReader;

/* loaded from: classes4.dex */
public class dbn {

    /* renamed from: a  reason: collision with root package name */
    public static volatile String f26663a = "";
    public static ActivityManager b;

    static {
        kge.a(-1833965428);
    }

    public static String a() {
        String str = null;
        if (StringUtils.isEmpty(null)) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/" + Process.myPid() + "/cmdline"));
                str = bufferedReader.readLine();
                if (!StringUtils.isEmpty(str)) {
                    str = str.trim();
                }
                bufferedReader.close();
            } catch (Exception unused) {
            }
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004d A[Catch: all -> 0x0062, TryCatch #0 {all -> 0x0062, blocks: (B:2:0x0000, B:10:0x0015, B:20:0x0043, B:21:0x0045, B:23:0x004d, B:24:0x0053, B:26:0x005b), top: B:36:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005b A[Catch: all -> 0x0062, TRY_LEAVE, TryCatch #0 {all -> 0x0062, blocks: (B:2:0x0000, B:10:0x0015, B:20:0x0043, B:21:0x0045, B:23:0x004d, B:24:0x0053, B:26:0x005b), top: B:36:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(android.content.Context r5) {
        /*
            java.lang.String r0 = tb.dbn.f26663a     // Catch: java.lang.Throwable -> L62
            boolean r0 = android.text.StringUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L62
            if (r0 == 0) goto L63
            r0 = 0
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L14
            r2 = 28
            if (r1 < r2) goto L14
            java.lang.String r1 = android.app.Application.getProcessName()     // Catch: java.lang.Throwable -> L14
            goto L15
        L14:
            r1 = r0
        L15:
            tb.dbn.f26663a = r1     // Catch: java.lang.Throwable -> L62
            boolean r1 = android.text.StringUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L62
            if (r1 == 0) goto L45
            java.lang.String r1 = "android.app.ActivityThread"
            java.lang.Class<android.app.Application> r2 = android.app.Application.class
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch: java.lang.Throwable -> L43
            r3 = 0
            java.lang.Class r1 = java.lang.Class.forName(r1, r3, r2)     // Catch: java.lang.Throwable -> L43
            java.lang.String r2 = "currentProcessName"
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L43
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r4)     // Catch: java.lang.Throwable -> L43
            r2 = 1
            r1.setAccessible(r2)     // Catch: java.lang.Throwable -> L43
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L43
            java.lang.Object r1 = r1.invoke(r0, r2)     // Catch: java.lang.Throwable -> L43
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto L43
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L43
            r0 = r1
        L43:
            tb.dbn.f26663a = r0     // Catch: java.lang.Throwable -> L62
        L45:
            java.lang.String r0 = tb.dbn.f26663a     // Catch: java.lang.Throwable -> L62
            boolean r0 = android.text.StringUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L62
            if (r0 == 0) goto L53
            java.lang.String r0 = a()     // Catch: java.lang.Throwable -> L62
            tb.dbn.f26663a = r0     // Catch: java.lang.Throwable -> L62
        L53:
            java.lang.String r0 = tb.dbn.f26663a     // Catch: java.lang.Throwable -> L62
            boolean r0 = android.text.StringUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L62
            if (r0 == 0) goto L63
            java.lang.String r5 = b(r5)     // Catch: java.lang.Throwable -> L62
            tb.dbn.f26663a = r5     // Catch: java.lang.Throwable -> L62
            goto L63
        L62:
        L63:
            java.lang.String r5 = tb.dbn.f26663a
            if (r5 != 0) goto L6b
            java.lang.String r5 = ""
            tb.dbn.f26663a = r5
        L6b:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "getMyProName = "
            r5.append(r0)
            java.lang.String r0 = tb.dbn.f26663a
            r5.append(r0)
            r5.toString()
            java.lang.String r5 = tb.dbn.f26663a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.dbn.a(android.content.Context):java.lang.String");
    }

    public static String b(Context context) {
        String str;
        try {
            if (b == null && context != null) {
                b = (ActivityManager) context.getApplicationContext().getSystemService("activity");
            }
            ActivityManager activityManager = b;
            if (activityManager != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
                    int i = runningAppProcessInfo.pid;
                    int i2 = -1;
                    try {
                        i2 = Process.myPid();
                    } catch (Exception unused) {
                    }
                    String str2 = "getMyPid pid=" + i2;
                    if (i == i2) {
                        str = runningAppProcessInfo.processName;
                        break;
                    }
                }
            }
        } catch (Exception unused2) {
        }
        str = "";
        StringBuilder sb = new StringBuilder();
        sb.append("getProcessNameByAms = ");
        sb.append(str != null ? str : " null ");
        sb.toString();
        return str;
    }
}
