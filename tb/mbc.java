package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes.dex */
public class mbc implements knw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(996795130);
        kge.a(-194461814);
    }

    @Override // tb.knw
    public void a(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
        } else {
            mbl.a().a(str, map);
        }
    }

    @Override // tb.knw
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            mbl.a().a(str);
        }
    }
}
