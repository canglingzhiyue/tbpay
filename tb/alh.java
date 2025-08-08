package tb;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Process;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class alh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static String f25420a;

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue();
        }
        if (alf.f25418a == null) {
            return false;
        }
        String b = b();
        return !StringUtils.isEmpty(b) && b.equals(alf.f25418a.getPackageName());
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]);
        }
        Application application = alf.f25418a;
        if (StringUtils.isEmpty(f25420a)) {
            String c = c();
            if (StringUtils.isEmpty(c) && application != null) {
                c = a(application);
            }
            f25420a = c;
        }
        return f25420a;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String c() {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.alh.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            if (r1 == 0) goto L12
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r2 = "bd025a76"
            java.lang.Object r0 = r0.ipc$dispatch(r2, r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L12:
            int r0 = android.os.Process.myPid()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "/proc/"
            r1.append(r3)
            r1.append(r0)
            java.lang.String r0 = "/cmdline"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = 1024(0x400, float:1.435E-42)
            byte[] r1 = new byte[r1]
            r3 = 0
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L41 java.lang.Exception -> L48
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L41 java.lang.Exception -> L48
            int r0 = r4.read(r1)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L49
            r4.close()     // Catch: java.lang.Exception -> L4f
            goto L4f
        L3e:
            r0 = move-exception
            r3 = r4
            goto L42
        L41:
            r0 = move-exception
        L42:
            if (r3 == 0) goto L47
            r3.close()     // Catch: java.lang.Exception -> L47
        L47:
            throw r0
        L48:
            r4 = r3
        L49:
            if (r4 == 0) goto L4e
            r4.close()     // Catch: java.lang.Exception -> L4e
        L4e:
            r0 = 0
        L4f:
            if (r0 <= 0) goto L5a
            java.lang.String r3 = new java.lang.String
            r3.<init>(r1, r2, r0)
            java.lang.String r3 = r3.trim()
        L5a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.alh.c():java.lang.String");
    }

    private static String a(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{context});
        }
        if (context == null) {
            return null;
        }
        String str = f25420a;
        if (str != null) {
            return str;
        }
        int myPid = Process.myPid();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            return null;
        }
        Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
        while (true) {
            if (it.hasNext()) {
                ActivityManager.RunningAppProcessInfo next = it.next();
                if (next != null && next.pid == myPid) {
                    f25420a = next.processName;
                    break;
                }
            } else {
                break;
            }
        }
        return f25420a;
    }
}
