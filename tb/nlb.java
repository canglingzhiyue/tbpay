package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.statistic.TBS;

/* loaded from: classes5.dex */
public class nlb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(455650454);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
        } else if (str != null) {
            TBS.Ext.commitEvent("Page_NewDetail", 19999, "nd_custom_err_et", str, str2);
        } else {
            fjt.a("new_detail异常", "commitCustomErrorEvent errorArg2 is null");
        }
    }
}
