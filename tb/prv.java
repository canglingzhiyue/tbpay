package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.UUID;

/* loaded from: classes8.dex */
public class prv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(936685436);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : UUID.randomUUID().toString().replace("-", "").toUpperCase();
    }
}
