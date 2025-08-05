package tb;

import com.android.alibaba.ip.runtime.IpChange;

@Deprecated
/* loaded from: classes6.dex */
public class joq {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String STAGE_BEFORE_NETWORK = "beforeRequestTime";
    public static final String STAGE_NETWORK = "requestTime";
    public static final String STAGE_PROCESS_DATA = "dataParseTime";
    public static final String STAGE_PROCESS_DATA_ULTRON = "processData_ultron";
    public static final String STAGE_RENDER = "renderTime";
    public static final String STAGE_TOTAL = "containerTotalTime";

    /* renamed from: a  reason: collision with root package name */
    public static boolean f29663a;

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{str});
        }
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{str});
        }
    }

    static {
        kge.a(78578531);
        f29663a = true;
    }
}
