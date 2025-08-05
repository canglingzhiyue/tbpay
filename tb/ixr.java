package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class ixr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-90981333);
    }

    public static void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{application, hashMap});
            return;
        }
        kgm kgmVar = new kgm(kgn.a().a(new File(application.getFilesDir(), "fastsp.db")));
        kgl.a(application).a();
        ixs.a(application).a(kgmVar);
        tco.c("FastSpIdleLauncher", "init");
    }
}
