package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;

/* loaded from: classes.dex */
public class hut {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{str, str2});
        } else {
            TLog.loge("uikit_navigation_extern", str, str2);
        }
    }
}
