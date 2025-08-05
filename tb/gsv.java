package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.h;
import com.taobao.tao.log.TLog;

/* loaded from: classes.dex */
public class gsv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f28431a;

    static {
        kge.a(857517274);
        f28431a = h.a(".launch_turbo_log_switch");
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else if (f28431a) {
            Log.e("LaunchTurbo", String.format("[%s] E %s", str, str2));
        } else {
            TLog.loge("LaunchTurbo", str, str2);
        }
    }

    public static void a(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c430ebf9", new Object[]{str, str2, th});
        } else if (f28431a) {
            Log.e("LaunchTurbo", String.format("[%s] E %s", str, str2), th);
        } else {
            TLog.loge("LaunchTurbo", str, String.format("%s, exception: %s", str2, th.getMessage()));
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
        } else if (f28431a) {
            Log.e("LaunchTurbo", String.format("[%s] W %s", str, str2));
        } else {
            TLog.logw("LaunchTurbo", str, str2);
        }
    }
}
