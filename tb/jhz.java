package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.UUID;

/* loaded from: classes6.dex */
public class jhz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(803253770);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[0]);
        }
        try {
            return UUID.randomUUID().toString().replace("-", "");
        } catch (Exception unused) {
            return null;
        }
    }
}
