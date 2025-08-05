package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes2.dex */
public final class awv extends aqm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1626835696);
    }

    @Override // tb.aqn
    public boolean a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a421221", new Object[]{this, map})).booleanValue() : baw.a();
    }
}
