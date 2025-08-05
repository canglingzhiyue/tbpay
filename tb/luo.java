package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes.dex */
public class luo extends lua implements lkh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-254500584);
        kge.a(1363350809);
    }

    public luo(lud ludVar) {
        super(ludVar);
    }

    @Override // tb.lkh
    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else {
            e().a(map);
        }
    }
}
