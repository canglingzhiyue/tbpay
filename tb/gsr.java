package tb;

import android.app.Application;
import com.alipay.mobile.common.logging.strategy.LogStrategyManager;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* loaded from: classes.dex */
public class gsr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(182034797);
    }

    public static void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{application, hashMap});
            return;
        }
        gst.a();
        if (!guc.a(application, "turbotBootEarly")) {
            return;
        }
        gst.a(application, hashMap, LogStrategyManager.ACTION_TYPE_BOOT);
    }
}
