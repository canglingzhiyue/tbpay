package android.taobao.windvane.extra.uc;

import android.content.Context;
import android.taobao.windvane.extra.core.WVCore;
import android.taobao.windvane.webview.b;
import android.taobao.windvane.webview.c;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class WVUCCoreProvider {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int UC_CORE_FAILED_HAS_CALLED = 1001;
    private b coreCallback;
    private boolean hasCalled = false;

    /* loaded from: classes2.dex */
    public interface WVUCCoreProviderCallback {
        void onUCCoreFailed(c cVar);

        void onUCCorePrepared();
    }

    static {
        kge.a(-642112869);
    }

    public void request(Context context, final WVUCCoreProviderCallback wVUCCoreProviderCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be30e7f6", new Object[]{this, context, wVUCCoreProviderCallback});
        } else if (context == null) {
            if (wVUCCoreProviderCallback == null) {
                return;
            }
            wVUCCoreProviderCallback.onUCCoreFailed(c.a(1, "context is null"));
        } else if (this.hasCalled) {
            if (wVUCCoreProviderCallback == null) {
                return;
            }
            wVUCCoreProviderCallback.onUCCoreFailed(c.a(1001, "already has called"));
        } else {
            if (this.coreCallback == null) {
                this.coreCallback = new b() { // from class: android.taobao.windvane.extra.uc.WVUCCoreProvider.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.taobao.windvane.webview.a
                    public void onUCCorePrepared() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("6e1aa650", new Object[]{this});
                            return;
                        }
                        WVUCCoreProviderCallback wVUCCoreProviderCallback2 = wVUCCoreProviderCallback;
                        if (wVUCCoreProviderCallback2 == null) {
                            return;
                        }
                        wVUCCoreProviderCallback2.onUCCorePrepared();
                    }

                    @Override // android.taobao.windvane.webview.b
                    public void onUCCoreInitFailed(c cVar) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("61c7d7d8", new Object[]{this, cVar});
                            return;
                        }
                        WVUCCoreProviderCallback wVUCCoreProviderCallback2 = wVUCCoreProviderCallback;
                        if (wVUCCoreProviderCallback2 == null) {
                            return;
                        }
                        wVUCCoreProviderCallback2.onUCCoreFailed(cVar);
                    }
                };
            }
            this.hasCalled = true;
            WVCore.getInstance().initUCCore2(context, this.coreCallback);
        }
    }

    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
        } else if (this.coreCallback == null) {
        } else {
            WVCoreSettings.getInstance().removeEventCallback2(this.coreCallback);
            this.coreCallback = null;
        }
    }
}
