package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTHitBuilders;

/* loaded from: classes6.dex */
public class izl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(350771955);
    }

    public static void a(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dbad4d8", new Object[]{str, str2, new Boolean(z)});
            return;
        }
        UTHitBuilders.UTCustomHitBuilder uTCustomHitBuilder = new UTHitBuilders.UTCustomHitBuilder("startup");
        uTCustomHitBuilder.setEventPage("Tixel");
        uTCustomHitBuilder.setProperty(ios.KEY_BIZ_LINE, str);
        uTCustomHitBuilder.setProperty("biz_scene", str2);
        uTCustomHitBuilder.setProperty("is_remote", z ? "1" : "0");
        UTAnalytics.getInstance().getDefaultTracker().send(uTCustomHitBuilder.build());
    }
}
