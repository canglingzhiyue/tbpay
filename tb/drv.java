package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* loaded from: classes.dex */
public class drv extends drp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1611589948);
    }

    @Override // tb.drp
    public HashMap<String, Object> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("8adf10c", new Object[]{this});
        }
        return null;
    }
}
