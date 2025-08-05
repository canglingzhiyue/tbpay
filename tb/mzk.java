package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class mzk implements myp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final mzl f31331a;
    private final myr b;
    private final mzk c;

    static {
        kge.a(-1462330070);
        kge.a(-1948733547);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else if (this.f31331a.f31332a.get() != this) {
        } else {
            this.f31331a.f31332a.set(this.c);
        }
    }

    public myr a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (myr) ipChange.ipc$dispatch("f080598", new Object[]{this}) : this.b;
    }
}
