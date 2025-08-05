package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;

/* loaded from: classes4.dex */
public class tcg implements tck {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final int f34020a;

    static {
        kge.a(1185982334);
        kge.a(1447689826);
    }

    public tcg(int i) {
        this.f34020a = i;
    }

    @Override // tb.tck
    public void a(tci tciVar) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ae8be", new Object[]{this, tciVar});
            return;
        }
        tciVar.a((byte) 3);
        tciVar.a(this.f34020a);
    }
}
