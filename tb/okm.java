package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;

/* loaded from: classes.dex */
public class okm implements okn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-533623831);
        kge.a(951349994);
    }

    @Override // tb.okn
    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
        } else {
            TLog.loge("TLOG_MONITOR", str, c(str, str2, str3));
        }
    }

    @Override // tb.okn
    public void b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3509d07", new Object[]{this, str, str2, str3});
        } else {
            TLog.loge("TLOG_MONITOR", str, c(str, str2, str3));
        }
    }

    @Override // tb.okn
    public void a(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c430ebf9", new Object[]{this, str, str2, th});
        } else {
            TLog.loge("TLOG_MONITOR", "", c(str, str2, ""), th);
        }
    }

    private String c(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c9ab53d8", new Object[]{this, str, str2, str3}) : String.format("%s:%s:%s", str, str2, str3);
    }
}
