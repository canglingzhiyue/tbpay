package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;

/* loaded from: classes6.dex */
public class ilt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-866117676);
    }

    public static void a(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d04957ad", new Object[]{str, strArr});
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : strArr) {
            sb.append(str2);
            sb.append("\t");
        }
        TLog.loge("TBResourceGuardian", str, sb.toString());
    }
}
