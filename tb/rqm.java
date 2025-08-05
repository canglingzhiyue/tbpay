package tb;

import android.taobao.windvane.jsbridge.e;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTTracker;

/* loaded from: classes.dex */
public abstract class rqm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1433320684);
    }

    public rqq getSubProcessUTSceneTracker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rqq) ipChange.ipc$dispatch("c7ce85bd", new Object[]{this});
        }
        return null;
    }

    public abstract Class<? extends UTTracker> getSubProcessUTTrackerClass();

    public abstract Class<? extends e> getSubProcessWVApiPluginClass();

    public abstract void initProxy();

    public abstract boolean isUiSubProcess();

    public abstract void registerActivityLifecycleCallbacks();
}
