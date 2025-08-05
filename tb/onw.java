package tb;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public class onw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PAGE_HOME = "Page_Home";

    static {
        kge.a(-1941004721);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
            return;
        }
        try {
            AppMonitor.Counter.commit(str, "guessYouLikeHot", 1.0d);
        } catch (Throwable th) {
            ooa.a("App Monitor Exception.", th);
        }
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
            return;
        }
        try {
            AppMonitor.Counter.commit(str, "recommendAD", 1.0d);
        } catch (Throwable th) {
            ooa.a("App Monitor Exception.", th);
        }
    }
}
