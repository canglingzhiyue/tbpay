package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;

/* loaded from: classes9.dex */
public class rgi implements reo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1731639212);
        kge.a(1883531153);
    }

    @Override // tb.reo
    public void debug(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9757c96e", new Object[]{this, str, str2});
        } else {
            TLog.logd(str, str2);
        }
    }

    @Override // tb.reo
    public void error(String str, String str2, Throwable... thArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ebcfc63", new Object[]{this, str, str2, thArr});
        } else if (thArr != null && thArr.length > 0) {
            TLog.loge(str, str2, thArr[0]);
        } else {
            TLog.loge(str, str2);
        }
    }
}
