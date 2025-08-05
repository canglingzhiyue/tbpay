package android.taobao.windvane.extra.launch;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes2.dex */
public class WindVaneLaunchTask {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final WindVaneHomeVisibleTask homeVisibleTask;
    private static final WindVaneIdleTask idleTask;
    public static final WindVanePreCreateTask preCreateTask;
    private static final WindVaneWelComeTask welcomeTask;

    static {
        kge.a(1474638779);
        welcomeTask = new WindVaneWelComeTask();
        homeVisibleTask = new WindVaneHomeVisibleTask();
        idleTask = new WindVaneIdleTask();
        preCreateTask = new WindVanePreCreateTask();
    }

    public static void initAtWelcome(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a64178fa", new Object[]{application, hashMap});
        } else {
            welcomeTask.init(application, hashMap);
        }
    }

    public static void initAtHomeVisible(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3596abab", new Object[]{application, hashMap});
        } else {
            homeVisibleTask.init(application, hashMap);
        }
    }

    public static void initAtIdle(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27321852", new Object[]{application, hashMap});
        } else {
            idleTask.init(application, hashMap);
        }
    }

    public static void initPreCreate(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37907aca", new Object[]{application, hashMap});
        } else {
            preCreateTask.init(application, hashMap);
        }
    }
}
