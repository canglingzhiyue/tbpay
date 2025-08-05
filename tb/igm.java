package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* loaded from: classes6.dex */
public class igm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(799491135);
    }

    public static void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{application, hashMap});
        } else if (application == null) {
            igo.a("qualityInitializer", "quality init failed");
        } else {
            igo.a("qualityInitializer", "quality start init");
            igl.a().a(application);
            igl.a().b();
        }
    }
}
