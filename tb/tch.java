package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;

/* loaded from: classes4.dex */
public class tch implements tck {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final long f34021a;

    static {
        kge.a(-1889163059);
        kge.a(1447689826);
    }

    public tch(long j) {
        this.f34021a = j;
    }

    @Override // tb.tck
    public void a(tci tciVar) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ae8be", new Object[]{this, tciVar});
            return;
        }
        tciVar.a((byte) 4);
        tciVar.a(this.f34021a);
    }
}
