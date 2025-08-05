package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes.dex */
public class myz extends mzb implements myy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-352540830);
        kge.a(907384621);
    }

    public myz(Map<String, String> map) {
        super(map);
    }

    @Override // tb.mzc
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            this.f31329a.put(str, str2);
        }
    }
}
