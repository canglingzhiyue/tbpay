package android.taobao.windvane.extra.jsbridge;

import android.taobao.windvane.extra.performance2.WVPageTrackerAPI;
import android.taobao.windvane.jsbridge.api.WVCamera;
import android.taobao.windvane.jsbridge.e;
import android.taobao.windvane.jsbridge.q;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class TBJsApiManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1211665220);
    }

    public static void initJsApi() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e8784e8", new Object[0]);
            return;
        }
        WVCamera.registerUploadService(TBUploadService.class);
        q.a("WVApplication", (Class<? extends e>) WVApplication.class);
        q.a("WVReporter", (Class<? extends e>) WVReporterExtra.class);
        q.a("WVPageTracker", (Class<? extends e>) WVPageTrackerAPI.class);
    }
}
