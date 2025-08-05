package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;

/* loaded from: classes7.dex */
public class mta {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1641024188);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else {
            TLog.loge(str, str2);
        }
    }
}
