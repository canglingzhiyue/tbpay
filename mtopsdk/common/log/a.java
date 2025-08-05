package mtopsdk.common.log;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tlog.adapter.AdapterForTLog;
import tb.kge;

/* loaded from: classes.dex */
public class a implements LogAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2112696685);
        kge.a(-1162536195);
    }

    @Override // mtopsdk.common.log.LogAdapter
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : AdapterForTLog.getLogLevel();
    }

    @Override // mtopsdk.common.log.LogAdapter
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            AdapterForTLog.traceLog(str, str2);
        }
    }

    @Override // mtopsdk.common.log.LogAdapter
    public void a(int i, String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecdd4026", new Object[]{this, new Integer(i), str, str2, th});
        } else if (i == 1) {
            AdapterForTLog.logv(str, str2);
        } else if (i == 2) {
            AdapterForTLog.logd(str, str2);
        } else if (i == 4) {
            AdapterForTLog.logi(str, str2);
        } else if (i == 8) {
            AdapterForTLog.logw(str, str2, th);
        } else if (i != 16) {
        } else {
            a(str, str2, th);
        }
    }

    private void a(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c430ebf9", new Object[]{this, str, str2, th});
        } else if (th == null) {
            AdapterForTLog.loge(str, str2);
        } else {
            AdapterForTLog.loge(str, str2, th);
        }
    }
}
