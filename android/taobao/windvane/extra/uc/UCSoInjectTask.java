package android.taobao.windvane.extra.uc;

import android.app.Application;
import android.taobao.windvane.jsbridge.api.c;
import android.taobao.windvane.util.m;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.utils.t;
import java.io.Serializable;
import java.util.HashMap;
import tb.aed;
import tb.aem;
import tb.kge;
import tb.mte;

/* loaded from: classes.dex */
public class UCSoInjectTask implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "UCSoInjectTask";

    static {
        kge.a(-958424834);
        kge.a(1028243835);
    }

    public void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
        } else if (t.b(application.getApplicationContext())) {
            TMSLogger.d("TMSEarlyInitializer", "skip UCSoInjectTask");
        } else {
            m.e(TAG, "init");
            c.a();
            mte.a();
            aem.a().a(aed.getInstance(), aem.f25291a);
        }
    }
}
