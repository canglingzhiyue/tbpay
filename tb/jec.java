package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tcrash.UncaughtCrashHeader;

/* loaded from: classes6.dex */
public class jec implements UncaughtCrashHeader {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final UncaughtCrashHeader[] f29493a;

    public jec(UncaughtCrashHeader... uncaughtCrashHeaderArr) {
        this.f29493a = uncaughtCrashHeaderArr;
    }

    @Override // com.taobao.android.tcrash.UncaughtCrashHeader
    public void addHeaderInfo(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc462277", new Object[]{this, str, str2});
            return;
        }
        UncaughtCrashHeader[] uncaughtCrashHeaderArr = this.f29493a;
        if (uncaughtCrashHeaderArr == null) {
            return;
        }
        for (UncaughtCrashHeader uncaughtCrashHeader : uncaughtCrashHeaderArr) {
            if (uncaughtCrashHeader != null) {
                uncaughtCrashHeader.addHeaderInfo(str, str2);
            }
        }
    }
}
