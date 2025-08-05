package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Set;

/* loaded from: classes4.dex */
public class tcn implements tck {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Set<String> f34026a;

    static {
        kge.a(1178240736);
        kge.a(1447689826);
    }

    public tcn(Set<String> set) {
        this.f34026a = set;
    }

    @Override // tb.tck
    public void a(tci tciVar) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ae8be", new Object[]{this, tciVar});
            return;
        }
        tciVar.a((byte) 6);
        Set<String> set = this.f34026a;
        tciVar.a(set != null ? set.size() : 0);
        Set<String> set2 = this.f34026a;
        if (set2 == null) {
            return;
        }
        for (String str : set2) {
            if (str instanceof String) {
                byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
                tciVar.a(bytes.length);
                tciVar.write(bytes);
            } else {
                tciVar.a(0);
            }
        }
    }
}
