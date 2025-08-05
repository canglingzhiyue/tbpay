package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* loaded from: classes.dex */
public class gsq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1546497165);
    }

    public static void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{application, hashMap});
        } else if (!guc.a(application, "turbotBootChannel")) {
        } else {
            gst.a(application, hashMap, "channel");
        }
    }
}
