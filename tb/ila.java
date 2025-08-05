package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* loaded from: classes6.dex */
public class ila {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1837916070);
    }

    public static void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{application, hashMap});
        } else if (application == null) {
            ilt.a("ResourceGuardianInitializer", "init failed");
        } else {
            ilt.a("ResourceGuardianInitializer", "start init");
            ikz.a().a(application);
            ikz.a().b();
        }
    }
}
