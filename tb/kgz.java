package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;

/* loaded from: classes.dex */
public class kgz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f30064a;

    static {
        kge.a(350300034);
        f30064a = true;
    }

    public static void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
        } else {
            f30064a = z;
        }
    }

    public static void a(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82c81dbf", new Object[]{str, objArr});
            return;
        }
        try {
            if (!f30064a || objArr.length == 0) {
                return;
            }
            String.format(str, objArr);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void b(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a2d52de", new Object[]{str, objArr});
            return;
        }
        try {
            if (objArr.length != 0) {
                str = String.format(str, objArr);
            }
            TLog.logi("DesktopService", str);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        try {
            if (!f30064a) {
                return;
            }
            Log.e("DesktopService", str);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void a(String str, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe179b03", new Object[]{str, th});
            return;
        }
        try {
            if (!f30064a) {
                return;
            }
            Log.e("DesktopService", str + "\nstack:" + Log.getStackTraceString(th));
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }
}
