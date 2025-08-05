package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/* loaded from: classes4.dex */
public class tcm implements tck {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f34025a;

    static {
        kge.a(1490612770);
        kge.a(1447689826);
    }

    public tcm(String str) {
        this.f34025a = str;
    }

    @Override // tb.tck
    public void a(tci tciVar) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ae8be", new Object[]{this, tciVar});
            return;
        }
        byte[] bytes = this.f34025a.getBytes(StandardCharsets.UTF_8);
        tciVar.a((byte) 1, bytes.length);
        tciVar.write(bytes);
    }
}
