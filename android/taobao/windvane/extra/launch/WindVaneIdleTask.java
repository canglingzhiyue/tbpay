package android.taobao.windvane.extra.launch;

import android.app.Application;
import android.taobao.windvane.export.prerender.f;
import android.taobao.windvane.extra.jsbridge.JSAPIManager;
import android.taobao.windvane.util.m;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes2.dex */
public class WindVaneIdleTask extends InitOnceTask {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1137898524);
    }

    @Override // android.taobao.windvane.extra.launch.InitOnceTask
    public void initImpl(Application application, HashMap<String, Object> hashMap) {
        try {
            JSAPIManager.getInstance().register();
            f.INSTANCE.a();
            Method declaredMethod = Class.forName("com.taobao.browser.b").getDeclaredMethod("initImpl", Application.class, HashMap.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(null, application, hashMap);
            m.c("WindVaneIdleTask", "init finished");
        } catch (Throwable unused) {
            m.c("WindVaneIdleTask", "init failed");
        }
    }
}
