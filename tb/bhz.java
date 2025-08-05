package tb;

import android.util.Log;
import com.alibaba.android.split.k;
import com.alibaba.android.split.manager.b;
import com.alibaba.android.split.p;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class bhz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(229675046);
    }

    public static String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{str, str2});
        }
        if (p.a().a().contains(str2)) {
            return ((b) k.a()).b(str2).b();
        }
        Log.e("FeatureUpdateUtils", str2 + " is not installed , getFeatureUpdatedVersion currentVersionName:" + str);
        return str;
    }
}
