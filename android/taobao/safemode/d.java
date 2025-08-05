package android.taobao.safemode;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final long f1519a = SystemClock.uptimeMillis();

    public boolean a(long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a8219760", new Object[]{this, new Long(j)})).booleanValue() : SystemClock.uptimeMillis() - this.f1519a <= j;
    }
}
