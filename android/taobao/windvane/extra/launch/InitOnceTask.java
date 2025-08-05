package android.taobao.windvane.extra.launch;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;

/* loaded from: classes2.dex */
public abstract class InitOnceTask implements ILaunchInitTask {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final AtomicBoolean mInitialized = new AtomicBoolean(false);

    static {
        kge.a(2068429327);
        kge.a(991720568);
    }

    public abstract void initImpl(Application application, HashMap<String, Object> hashMap);

    @Override // android.taobao.windvane.extra.launch.ILaunchInitTask
    public final void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
        } else if (!this.mInitialized.compareAndSet(false, true)) {
        } else {
            initImpl(application, hashMap);
        }
    }
}
