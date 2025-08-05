package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.tmall.android.dai.f;

/* loaded from: classes8.dex */
public class osi {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MODEL_VERSION_KEY = "version";
    public static final String MODEL_VERSION_P_KEY = "postbuy_rerank.alinn";

    static {
        kge.a(1035999691);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        try {
            return f.a(MODEL_VERSION_P_KEY, "version");
        } catch (Exception unused) {
            return "";
        }
    }
}
