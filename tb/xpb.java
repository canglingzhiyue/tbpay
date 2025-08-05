package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import com.taobao.android.lifecycle.PanguApplication;
import com.taobao.orange.OrangeConfig;
import java.util.HashMap;

/* loaded from: classes8.dex */
public class xpb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2061560088);
    }

    public static void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{application, hashMap});
            return;
        }
        try {
            if (OrangeConfig.getInstance().getConfig("android_share", "UseSecondRefreshHomepage", "false").equals("true")) {
                return;
            }
            nyw nywVar = new nyw();
            nywVar.a(application.getApplicationContext(), LauncherRuntime.d);
            if (hashMap == null) {
                hashMap = new HashMap<>();
            }
            hashMap.put("initShareMode", "ShareFeedback");
            nywVar.a(hashMap);
            PanguApplication panguApplication = (PanguApplication) application;
            panguApplication.registerCrossActivityLifecycleCallback(nywVar);
            panguApplication.registerActivityLifecycleCallbacks(nywVar);
        } catch (Throwable unused) {
        }
    }
}
