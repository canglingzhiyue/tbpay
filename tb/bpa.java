package tb;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes2.dex */
public final class bpa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static int f26030a;
    private static boolean b;
    private static int c;
    public static final int sMaxCheckCount;

    static {
        kge.a(-312327877);
        sMaxCheckCount = jqi.a("iCart", "maxCheckCountOfImageTracker", 3);
        f26030a = 0;
        c = 0;
        b = false;
    }

    public static void b(Context context, String str) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b80d809", new Object[]{context, str});
        } else if (context == null || str == null || (i = c) >= sMaxCheckCount) {
        } else {
            c = i + 1;
        }
    }

    public static void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{context, str});
        } else if (context == null || str == null) {
        } else {
            if (context instanceof fpz) {
                context = ((fpz) context).a();
            }
            if (context == null) {
                return;
            }
            b = true;
            try {
                if (b()) {
                    akg.a(akg.b());
                    jpo.b(context).a(ieu.sStageLoadImage, false, (Map<String, String>) null);
                } else {
                    f26030a++;
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(Context context, RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33b8058e", new Object[]{context, recyclerView});
        } else if (b(context, recyclerView)) {
        } else {
            akg.a(akg.b());
        }
    }

    private static boolean b(Context context, RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c986631", new Object[]{context, recyclerView})).booleanValue();
        }
        if (!b || !jqi.a("iCart", "enableImagePerformanceTracker", true) || context == null || recyclerView == null || b()) {
            return false;
        }
        jpo.b(context).a(ieu.sStageLoadImage, "apmClientContainerRender");
        return true;
    }

    private static boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[0])).booleanValue() : f26030a >= Math.min(sMaxCheckCount, c);
    }
}
