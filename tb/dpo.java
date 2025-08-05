package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public class dpo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1287892192);
    }

    public static boolean a(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d18de978", new Object[]{context, str, str2})).booleanValue();
        }
        return true;
    }

    public static Boolean a(Context context, String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("75e428f2", new Object[]{context, str, strArr});
        }
        return true;
    }
}
