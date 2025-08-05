package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class jfp implements jfq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.jfq
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            jfr.a().a("TCrashExit", str, str2);
        }
    }
}
