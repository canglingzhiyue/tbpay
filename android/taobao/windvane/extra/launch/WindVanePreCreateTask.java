package android.taobao.windvane.extra.launch;

import android.app.Application;
import android.taobao.windvane.extra.uc.pool.WebViewPool;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes2.dex */
public class WindVanePreCreateTask extends InitOnceTask {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1486641951);
    }

    @Override // android.taobao.windvane.extra.launch.InitOnceTask
    public void initImpl(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73f761cb", new Object[]{this, application, hashMap});
        } else {
            WebViewPool.setUp(application);
        }
    }
}
