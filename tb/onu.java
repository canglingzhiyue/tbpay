package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders;
import java.util.HashMap;

/* loaded from: classes8.dex */
public class onu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1854390494);
    }

    public void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{this, context, str});
            return;
        }
        UTAnalytics.getInstance().getDefaultTracker().pageAppear(context, str);
        UTAnalytics.getInstance().getDefaultTracker().updatePageName(context, str);
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(context);
        }
    }

    public static void a(String str, String str2, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a507bab7", new Object[]{str, str2, hashMap});
            return;
        }
        UTHitBuilders.UTCustomHitBuilder uTCustomHitBuilder = new UTHitBuilders.UTCustomHitBuilder(str + "_" + str2);
        uTCustomHitBuilder.setEventPage(str);
        uTCustomHitBuilder.setProperties(hashMap);
        UTAnalytics.getInstance().getDefaultTracker().send(uTCustomHitBuilder.build());
    }
}
