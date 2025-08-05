package android.taobao.windvane.extra.uc;

import android.taobao.windvane.config.j;
import android.taobao.windvane.export.prerender.a;
import android.taobao.windvane.export.prerender.b;
import android.taobao.windvane.extra.performance.BuiltinWebViewPageModel;
import android.taobao.windvane.extra.performance.WVWebViewPageModel;
import android.taobao.windvane.extra.uc.pool.PreCreateInfo;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.android.riverlogger.e;
import com.uc.webview.export.extension.UCExtension;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.dqn;
import tb.hvw;
import tb.kge;

/* loaded from: classes2.dex */
public class WebViewContext implements hvw {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String customMegaBizId;
    private PreCreateInfo mPreCreateInfo;
    private String mRealUrl;
    private final WVUCWebView mWebView;
    private final List<a> prerenderAttachEventListeners = new CopyOnWriteArrayList();
    private final List<b> prerenderSuccessEventListeners = new CopyOnWriteArrayList();
    private boolean mIsClientPrerender = false;
    private boolean mHitSnapshot = false;
    private final WVWebViewPageModel webViewPageModel = new WVWebViewPageModel();

    static {
        kge.a(-940892012);
        kge.a(985377106);
    }

    public static /* synthetic */ boolean access$000(WebViewContext webViewContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("635d5e1a", new Object[]{webViewContext})).booleanValue() : webViewContext.mIsClientPrerender;
    }

    public static /* synthetic */ List access$100(WebViewContext webViewContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("ecb578b2", new Object[]{webViewContext}) : webViewContext.prerenderAttachEventListeners;
    }

    public WebViewContext(final WVUCWebView wVUCWebView) {
        this.mWebView = wVUCWebView;
        if (j.commonConfig.cT) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            wVUCWebView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: android.taobao.windvane.extra.uc.WebViewContext.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("7f64d55b", new Object[]{this, view});
                    }
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("3d337638", new Object[]{this, view});
                    } else if (atomicBoolean.compareAndSet(false, true)) {
                        e.a(RVLLevel.Info, "WindVane/Page").a("addBuiltinPageModel").a();
                        WebViewContext.this.addWebViewPageModel(new BuiltinWebViewPageModel(wVUCWebView));
                        if (WebViewContext.access$000(WebViewContext.this)) {
                            UCExtension uCExtension = wVUCWebView.getUCExtension();
                            if (uCExtension != null) {
                                uCExtension.setIsPreRender(false);
                                WebViewContext.this.getWebViewPageModel().onProperty("H5_PreRender", true);
                                WebViewContext.this.getWebViewPageModel().onProperty("H5_URL", wVUCWebView.getUrl());
                            }
                            for (a aVar : WebViewContext.access$100(WebViewContext.this)) {
                                if (aVar != null) {
                                    aVar.a(wVUCWebView.getWebViewContext().getRealUrl());
                                }
                            }
                        }
                        wVUCWebView.removeOnAttachStateChangeListener(this);
                    }
                }
            });
            return;
        }
        addWebViewPageModel(new BuiltinWebViewPageModel(wVUCWebView));
    }

    @Override // tb.hvw
    public PreCreateInfo getPreCreateInfo() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PreCreateInfo) ipChange.ipc$dispatch("c7ffbd37", new Object[]{this}) : this.mPreCreateInfo;
    }

    @Override // tb.hvw
    public void setPreCreateInfo(PreCreateInfo preCreateInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d09c0d7", new Object[]{this, preCreateInfo});
        } else {
            this.mPreCreateInfo = preCreateInfo;
        }
    }

    @Override // tb.hvw
    public boolean isHitSnapshot() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("39726cf8", new Object[]{this})).booleanValue() : this.mHitSnapshot;
    }

    @Override // tb.hvw
    public void setHitSnapshot(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96c82398", new Object[]{this, new Boolean(z)});
        } else {
            this.mHitSnapshot = z;
        }
    }

    @Override // tb.hvw
    public void setRealUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9ba0d80", new Object[]{this, str});
        } else {
            this.mRealUrl = str;
        }
    }

    @Override // tb.hvw
    public String getRealUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cbf55f1e", new Object[]{this}) : this.mRealUrl;
    }

    @Override // tb.hvw
    public dqn getWebViewPageModel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dqn) ipChange.ipc$dispatch("460dc127", new Object[]{this}) : this.webViewPageModel;
    }

    @Override // tb.hvw
    public void addWebViewPageModel(dqn dqnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cb98458", new Object[]{this, dqnVar});
        } else {
            this.webViewPageModel.addWebViewPageModel(dqnVar);
        }
    }

    @Override // tb.hvw
    public void addPrerenderAttachEventListener(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a322ab3", new Object[]{this, aVar});
        } else {
            this.prerenderAttachEventListeners.add(aVar);
        }
    }

    @Override // tb.hvw
    public void removePrerenderAttachEventListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea49719b", new Object[]{this});
        } else {
            this.prerenderAttachEventListeners.clear();
        }
    }

    @Override // tb.hvw
    public void addPrerenderSuccessEventListener(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("475a7a04", new Object[]{this, bVar});
        } else {
            this.prerenderSuccessEventListeners.add(bVar);
        }
    }

    @Override // tb.hvw
    public void notifyPrerenderSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e9c8c3a", new Object[]{this});
            return;
        }
        for (b bVar : this.prerenderSuccessEventListeners) {
            if (bVar != null) {
                bVar.a();
            }
        }
        this.prerenderSuccessEventListeners.clear();
    }

    @Override // tb.hvw
    public void setIsClientPrerender(boolean z) {
        UCExtension uCExtension;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cb840cb", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mIsClientPrerender = z;
        if (!z || (uCExtension = this.mWebView.getUCExtension()) == null) {
            return;
        }
        uCExtension.setIsPreRender(true);
    }

    @Override // tb.hvw
    public boolean isClientPrerender() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fdf4d26f", new Object[]{this})).booleanValue() : this.mIsClientPrerender;
    }

    @Override // tb.hvw
    public String getCustomMegaBizId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5c39b884", new Object[]{this}) : this.customMegaBizId;
    }

    @Override // tb.hvw
    public void setCustomMegaBizId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5252cda", new Object[]{this, str});
        } else {
            this.customMegaBizId = str;
        }
    }
}
