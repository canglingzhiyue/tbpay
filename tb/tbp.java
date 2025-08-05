package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;

/* loaded from: classes4.dex */
public class tbp implements tck {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f34014a;

    static {
        kge.a(910826551);
        kge.a(1447689826);
    }

    public tbp(boolean z) {
        this.f34014a = z;
    }

    @Override // tb.tck
    public void a(tci tciVar) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ae8be", new Object[]{this, tciVar});
            return;
        }
        tciVar.a((byte) 2);
        tciVar.a(this.f34014a ? (byte) 1 : (byte) 0);
    }
}
