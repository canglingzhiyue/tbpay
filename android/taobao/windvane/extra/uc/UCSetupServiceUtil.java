package android.taobao.windvane.extra.uc;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class UCSetupServiceUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1817329254);
    }

    public static void configUCSettingsBeforeInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa393aa9", new Object[0]);
        } else {
            UCSetupService.configUCSettingsBeforeInit();
        }
    }
}
