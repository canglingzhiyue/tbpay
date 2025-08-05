package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.log.RSoLog;

/* loaded from: classes6.dex */
public final class ikc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static long a(String str, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a352e026", new Object[]{str, new Long(j), new Long(j2)})).longValue();
        }
        RSoLog.c("TaobaoStorageCleaner-clean, path = " + str + ", targetSize=" + j + ", realSize=" + j2);
        return 0L;
    }
}
