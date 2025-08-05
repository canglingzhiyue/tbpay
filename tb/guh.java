package tb;

import android.util.Log;
import android.view.Choreographer;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.application.common.c;

/* loaded from: classes5.dex */
public class guh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void a(String str, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9d729b0", new Object[]{str, runnable});
        } else {
            a(str, runnable, c.a().a("isFullNewInstall", false) ? 10000 : 4000);
        }
    }

    public static void a(final String str, final Runnable runnable, final long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("710e8314", new Object[]{str, runnable, new Long(j)});
            return;
        }
        Log.e("IdleChecker", "setup for " + str + " with timeout " + j + "ms");
        LauncherRuntime.a(new Runnable() { // from class: tb.guh.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                Log.e("IdleChecker", "kickoff " + str);
                Choreographer.getInstance().postFrameCallback(new gui(str, System.nanoTime(), runnable, j));
            }
        });
    }
}
