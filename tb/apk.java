package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

@Deprecated
/* loaded from: classes2.dex */
public class apk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(991532288);
    }

    public static Map<String, String> a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("4d84e95", new Object[]{context}) : aqf.b(context);
    }
}
