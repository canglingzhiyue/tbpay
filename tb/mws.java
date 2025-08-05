package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tcrash.TCrashSDK;

/* loaded from: classes2.dex */
public class mws implements qfu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-842408282);
        kge.a(548979558);
    }

    @Override // tb.qfu
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            TCrashSDK.instance().getCrashCaughtHeader().addHeaderInfo(str, str2);
        }
    }
}
