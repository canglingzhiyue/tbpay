package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* loaded from: classes.dex */
public class rkg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f33203a;
    private static boolean b;

    static {
        kge.a(-1816896491);
        f33203a = true;
        try {
            if (!f33203a) {
                return;
            }
            b = new File("/data/local/tmp/", "tao_link_log_open").exists();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{new Boolean(z)});
        } else {
            f33203a = z;
        }
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else if (!f33203a || !b) {
        } else {
            Log.e(str, str2);
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
        } else if (!f33203a) {
        } else {
            Log.e(str, str2);
        }
    }

    public static void a(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c430ebf9", new Object[]{str, str2, th});
        } else if (!f33203a) {
        } else {
            Log.e(str, str2, th);
        }
    }
}
