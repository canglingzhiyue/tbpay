package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class mkz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private long f31081a;

    public mkz() {
        this.f31081a = 0L;
    }

    public mkz(long j, long j2) {
        this.f31081a = 0L;
        this.f31081a = j2 - j;
    }

    public long a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[]{this})).longValue() : this.f31081a;
    }
}
