package android.taobao.windvane.extra.jsbridge;

import android.os.Handler;
import android.os.HandlerThread;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.jsbridge.s;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u00012\u00020\u0002:\u0001\u0011B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\f\u001a\u00020\tH\u0016J\b\u0010\r\u001a\u00020\tH\u0016J\u0012\u0010\u000e\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Landroid/taobao/windvane/extra/jsbridge/DefaultAsyncApiProxy;", "Landroid/taobao/windvane/jsbridge/AsyncApiProxy;", "Ljava/io/Serializable;", "()V", "asyncApiHandler", "Landroid/os/Handler;", "ucWebView", "Landroid/taobao/windvane/extra/uc/WVUCWebView;", "apiCall", "", "call", "Ljava/lang/Runnable;", "injectAsyncApiEvn", "releaseProxy", "setUCWebView", "webViewObject", "", "Companion", "windvane_core_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public final class DefaultAsyncApiProxy implements s, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Companion Companion;
    private static final Handler apiHandler;
    private static final HandlerThread apiThread;
    private Handler asyncApiHandler = apiHandler;
    private WVUCWebView ucWebView;

    @Override // android.taobao.windvane.jsbridge.s
    public void releaseProxy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2ce77ae", new Object[]{this});
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Landroid/taobao/windvane/extra/jsbridge/DefaultAsyncApiProxy$Companion;", "", "()V", "apiHandler", "Landroid/os/Handler;", "apiThread", "Landroid/os/HandlerThread;", "windvane_core_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes2.dex */
    public static final class Companion {
        static {
            kge.a(1826981457);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    static {
        kge.a(1872831049);
        kge.a(-179467657);
        kge.a(1028243835);
        Companion = new Companion(null);
        HandlerThread handlerThread = new HandlerThread("defaultAsyncApiThread");
        handlerThread.start();
        apiThread = handlerThread;
        apiHandler = new Handler(apiThread.getLooper());
    }

    @Override // android.taobao.windvane.jsbridge.s
    public void apiCall(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6143691d", new Object[]{this, runnable});
            return;
        }
        Handler handler = this.asyncApiHandler;
        if (runnable == null) {
            return;
        }
        handler.post(runnable);
    }

    @Override // android.taobao.windvane.jsbridge.s
    public void injectAsyncApiEvn() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47b5d235", new Object[]{this});
            return;
        }
        Log.e("DefaultAsyncApiProxy", "enable async api");
        WVUCWebView wVUCWebView = this.ucWebView;
        if (wVUCWebView != null) {
            q.a(wVUCWebView);
            wVUCWebView.addJavascriptInterface(new CommonAsyncJSAPIBridge(wVUCWebView), "__windvane_async__");
        }
        WVUCWebView wVUCWebView2 = this.ucWebView;
        if (wVUCWebView2 == null) {
            return;
        }
        wVUCWebView2.injectJsEarly(AsyncApiListManager.INSTANCE.getApiListInjectionCode());
    }

    @Override // android.taobao.windvane.jsbridge.s
    public void setUCWebView(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3738b76c", new Object[]{this, obj});
        } else if (!(obj instanceof WVUCWebView)) {
        } else {
            this.ucWebView = (WVUCWebView) obj;
        }
    }
}
