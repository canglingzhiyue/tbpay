package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;

/* loaded from: classes8.dex */
public class prs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1653037310);
    }

    public static void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{str, obj});
        } else {
            TLog.loge("HomePageTab", str, String.valueOf(obj));
        }
    }
}
