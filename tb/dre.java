package tb;

import android.app.Application;
import com.alibaba.poplayer.utils.a;
import com.alibaba.poplayer.utils.c;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes8.dex */
public class dre {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicBoolean f26919a;

    static {
        kge.a(-1147226088);
        f26919a = new AtomicBoolean(false);
    }

    public static void a(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47168dc", new Object[]{application, hashMap});
            return;
        }
        try {
            if (f26919a.getAndSet(true)) {
                return;
            }
            c.c("sdkLifeCycle", "", "TBPopLocalDataInitTask.readAndSetup.start");
            a.a().f();
            c.c("sdkLifeCycle", "", "TBPopLocalDataInitTask.readAndSetup.done");
        } catch (Throwable th) {
            c.a("TBPopLocalDataInitTask.init.error", th);
        }
    }
}
