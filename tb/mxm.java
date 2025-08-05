package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;

/* loaded from: classes7.dex */
public class mxm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-992361655);
    }

    public static void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{str, str2, str3});
            return;
        }
        TLog.loge("Page_MyTaobao", str, str2 + " " + str3);
    }
}
