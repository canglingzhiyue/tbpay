package android.taobao.windvane.packageapp.adaptive;

import android.app.Application;
import android.taobao.windvane.util.m;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.utils.t;
import com.taobao.zcache.p;
import java.io.Serializable;
import java.util.HashMap;
import tb.kge;
import tb.rko;

/* loaded from: classes2.dex */
public class InitZCacheTask implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1903254618);
        kge.a(1028243835);
    }

    public void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
        } else if (t.b(application.getApplicationContext())) {
            TMSLogger.d("TMSEarlyInitializer", "skip InitZCacheTask");
        } else {
            rko.a().a(new b());
            p.a();
            m.c("ZCache", "zcache 3.0 startQueue");
        }
    }
}
