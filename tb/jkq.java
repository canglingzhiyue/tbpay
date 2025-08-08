package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;

/* loaded from: classes6.dex */
public class jkq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1226331802);
    }

    public static void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{str, str2});
            return;
        }
        if (StringUtils.isEmpty(str)) {
            str = "TSchedule_no_tag";
        }
        TLog.loge(str, str2);
    }

    public static void a(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c430ebf9", new Object[]{str, str2, th});
            return;
        }
        if (StringUtils.isEmpty(str)) {
            str = "TSchedule_no_tag";
        }
        TLog.loge(str, str2, th);
    }
}
