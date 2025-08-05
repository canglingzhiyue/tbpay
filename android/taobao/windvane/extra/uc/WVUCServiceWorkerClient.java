package android.taobao.windvane.extra.uc;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.uc.webview.export.ServiceWorkerClient;
import com.uc.webview.export.WebResourceRequest;
import tb.kge;

/* loaded from: classes2.dex */
public class WVUCServiceWorkerClient extends ServiceWorkerClient {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "WVUCServiceWorkerClient";

    static {
        kge.a(-196343309);
    }

    public static /* synthetic */ Object ipc$super(WVUCServiceWorkerClient wVUCServiceWorkerClient, String str, Object... objArr) {
        if (str.hashCode() == -2035867177) {
            return super.shouldInterceptRequest((WebResourceRequest) objArr[0]);
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0164  */
    @Override // com.uc.webview.export.ServiceWorkerClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.uc.webview.export.WebResourceResponse shouldInterceptRequest(com.uc.webview.export.WebResourceRequest r15) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: android.taobao.windvane.extra.uc.WVUCServiceWorkerClient.shouldInterceptRequest(com.uc.webview.export.WebResourceRequest):com.uc.webview.export.WebResourceResponse");
    }
}
