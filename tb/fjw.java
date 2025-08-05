package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class fjw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(144248666);
    }

    public static long a(Object obj, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1e7dacf4", new Object[]{obj, new Long(j)})).longValue();
        }
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        if (!(obj instanceof String)) {
            return j;
        }
        try {
            return Long.parseLong((String) obj);
        } catch (Exception e) {
            fjt.a("new_detail异常", "ParseUtils.parseLong异常", e);
            return -1L;
        }
    }
}
