package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliConfigInterface;
import com.taobao.android.e;

/* loaded from: classes6.dex */
public class jpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_CONFIG_NAME_SPACE = "newUltron_container";
    public static final String KEY_MTOP_CALLBACK_IN_WORKERTHREAD = "mtopCallbackInWorkerThread";
    public static final String KEY_NEW_FEATURE = "newFeature";
    public static final String KEY_STAGE_PERFORMANCE_CONFIG = "stagePerformanceConfig";
    public static final String KEY_TRACE_MTOP = "traceMtop";
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    public static AliConfigInterface f29686a;

    static {
        kge.a(-1908263287);
        f29686a = e.a();
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : spk.a("newUltron_container", "newFeature", true);
    }

    public static float a(String str, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8123a1be", new Object[]{str, new Float(f)})).floatValue() : spk.a("newUltron_container", str, f);
    }

    public static long a(String str, long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8123b0c6", new Object[]{str, new Long(j)})).longValue() : spk.a("newUltron_container", str, j);
    }

    public static int a(String str, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("8123ad04", new Object[]{str, new Integer(i)})).intValue() : spk.a("newUltron_container", str, i);
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2}) : spk.a("newUltron_container", str, str2);
    }

    public static boolean a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8123ece6", new Object[]{str, new Boolean(z)})).booleanValue() : spk.a("newUltron_container", str, z);
    }
}
