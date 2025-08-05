package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;

/* loaded from: classes4.dex */
public class tcf implements tck {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final float f34019a;

    static {
        kge.a(1559857707);
        kge.a(1447689826);
    }

    public tcf(float f) {
        this.f34019a = f;
    }

    @Override // tb.tck
    public void a(tci tciVar) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ae8be", new Object[]{this, tciVar});
            return;
        }
        tciVar.a((byte) 5);
        tciVar.a(Float.floatToIntBits(this.f34019a));
    }
}
