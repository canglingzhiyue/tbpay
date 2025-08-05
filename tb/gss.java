package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* loaded from: classes5.dex */
public class gss {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1807109258);
    }

    public static void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{application, hashMap});
            return;
        }
        gst.a();
        if (!guc.a(application, "turbotBootIdle")) {
            return;
        }
        gst.a(application, hashMap, "idle");
    }
}
