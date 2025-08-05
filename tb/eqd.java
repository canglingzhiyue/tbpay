package tb;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public class eqd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static long f27515a;

    static {
        kge.a(1591059964);
        f27515a = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        emu.a("com.taobao.android.detail.datasdk.utils.TimeUtils");
    }

    public static long a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[0])).longValue() : SystemClock.elapsedRealtime() + f27515a;
    }
}
