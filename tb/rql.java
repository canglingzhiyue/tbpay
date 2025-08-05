package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class rql {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(73281303);
    }

    public static void registerAppStatusCallbacks(rqi rqiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b2d554b", new Object[]{rqiVar});
        } else if (rqiVar == null) {
        } else {
            rqk.getInstance().registerAppStatusCallbacks(rqiVar);
        }
    }

    public static void unRegisterAppStatusCallbacks(rqi rqiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ff31544", new Object[]{rqiVar});
        } else if (rqiVar == null) {
        } else {
            rqk.getInstance().unregisterAppStatusCallbacks(rqiVar);
        }
    }

    public static void registeActivityLifecycleCallbacks(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce71c676", new Object[]{application});
        } else if (application == null) {
        } else {
            application.registerActivityLifecycleCallbacks(rqg.getInstance());
        }
    }

    public static void unregisterActivityLifecycleCallbacks(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24701f49", new Object[]{application});
        } else if (application == null) {
        } else {
            application.unregisterActivityLifecycleCallbacks(rqg.getInstance());
        }
    }
}
