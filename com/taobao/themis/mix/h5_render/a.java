package com.taobao.themis.mix.h5_render;

import android.content.Intent;
import android.graphics.Bitmap;
import android.taobao.windvane.extra.uc.WVUCWebChromeClient;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.URLUtil;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.android.weex_framework.adapter.e;
import com.taobao.themis.kernel.adapter.IEnvironmentService;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.extension.page.af;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.utils.j;
import com.taobao.themis.kernel.utils.n;
import com.taobao.themis.kernel.utils.o;
import com.taobao.themis.kernel.utils.t;
import com.taobao.themis.utils.f;
import com.uc.webview.export.WebSettings;
import com.uc.webview.export.WebView;
import com.uc.webview.export.media.MessageID;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.dqm;
import tb.ecg;
import tb.hvw;
import tb.kge;
import tb.qpm;
import tb.qpt;
import tb.qqc;
import tb.qqn;
import tb.qqo;
import tb.tei;
import tb.thk;

@Deprecated(message = "replace with TMSWebRender")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 02\u00020\u0001:\u00010B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0016J\u001a\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u0016J\u001a\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u0016J\u001a\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u001a\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\"\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\n\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0005H\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\fH\u0002J\"\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\b\u0010'\u001a\u00020\u000eH\u0016J\b\u0010(\u001a\u00020\u000eH\u0016J\b\u0010)\u001a\u00020\u000eH\u0016J\u0010\u0010*\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020,H\u0016J\u0010\u0010-\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020/H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lcom/taobao/themis/mix/h5_render/TMSTinyH5Render;", "Lcom/taobao/themis/kernel/runtime/TMSBaseRender;", "page", "Lcom/taobao/themis/kernel/page/ITMSPage;", "mRenderUrl", "", "(Lcom/taobao/themis/kernel/page/ITMSPage;Ljava/lang/String;)V", "mPauseWebViewOnStop", "", "mRootView", "Landroid/view/ViewGroup;", "mWebView", "Landroid/taobao/windvane/extra/uc/WVUCWebView;", "destroy", "", "execJSToRender", "script", "", "name", e.RECORD_FIREEVENT, "event", "params", "Lcom/alibaba/fastjson/JSON;", "fireEventOld", "fireTargetEvent", "target", "getCurrentPageSnapshot", "Landroid/graphics/Bitmap;", "getRenderType", "getView", "Landroid/view/View;", "initUA", ecg.UMB_FEATURE_WEB_VIEW, "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onPause", "onResume", MessageID.onStop, "render", DataReceiveMonitor.CB_LISTENER, "Lcom/taobao/themis/kernel/runtime/TMSRenderListener;", "reportRumData", "builder", "Landroid/taobao/windvane/extra/uc/WVUCWebView$Builder;", "Companion", "themis_mix_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public final class a extends qqn {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final C0948a Companion;
    private final ViewGroup c;
    private WVUCWebView d;
    private final String e;
    private final boolean f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b¸\u0006\u0000"}, d2 = {"com/taobao/themis/mix/h5_render/TMSTinyH5Render$render$4$2", "Landroid/taobao/windvane/extra/uc/WVUCWebChromeClient;", "onReceivedTitle", "", "view", "Lcom/uc/webview/export/WebView;", "title", "", "themis_mix_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class c extends WVUCWebChromeClient {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ qqo b;

        public c(qqo qqoVar) {
            this.b = qqoVar;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            if (str.hashCode() == -2015964955) {
                super.onReceivedTitle((WebView) objArr[0], (String) objArr[1]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebChromeClient, com.uc.webview.export.WebChromeClient
        public void onReceivedTitle(WebView webView, String str) {
            qpm f;
            com.taobao.themis.kernel.container.ui.titlebar.b titleBar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("87d6d0e5", new Object[]{this, webView, str});
                return;
            }
            super.onReceivedTitle(webView, str);
            if (!n.W()) {
                return;
            }
            if (str != null && kotlin.text.n.b(str, "http", false, 2, (Object) null)) {
                return;
            }
            ITMSPage b = a.b(a.this);
            if (!qqc.e(b) || b.c().c() || (f = b.f()) == null || (titleBar = f.getTitleBar()) == null) {
                return;
            }
            titleBar.setTitle(str, "");
        }
    }

    static {
        kge.a(-1244525075);
        Companion = new C0948a(null);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -69967319:
                super.a((qqo) objArr[0]);
                return null;
            case 90991720:
                super.a();
                return null;
            case 94685804:
                super.e();
                return null;
            case 95609325:
                super.f();
                return null;
            case 105768056:
                super.q();
                return null;
            case 1468831987:
                super.a((String) objArr[0], (String) objArr[1], (JSON) objArr[2]);
                return null;
            case 1914437276:
                super.b((String) objArr[0], (JSON) objArr[1]);
                return null;
            case 2045969029:
                super.a(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // tb.qqq
    public void a(String script, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, script, str});
        } else {
            q.d(script, "script");
        }
    }

    @Override // tb.qqq
    public void a(byte[] script, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba3ac339", new Object[]{this, script, str});
        } else {
            q.d(script, "script");
        }
    }

    @Override // tb.qqq
    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : "WEB";
    }

    public static final /* synthetic */ WVUCWebView a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WVUCWebView) ipChange.ipc$dispatch("58f8a34f", new Object[]{aVar}) : aVar.d;
    }

    public static final /* synthetic */ ITMSPage b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ITMSPage) ipChange.ipc$dispatch("c47bd79a", new Object[]{aVar}) : aVar.b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ITMSPage page, String str) {
        super(page);
        q.d(page, "page");
        this.e = str;
        this.f = f.b(this.f33035a.o());
        this.c = new FrameLayout(page.b().o());
        ((FrameLayout) this.c).setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        try {
            tei D = this.f33035a.D();
            q.b(D, "mInstance.performanceMonitor");
            D.a("wvWriteChunkAsyncAB", t.h(this.f33035a.o()).a());
        } catch (Exception e) {
            TMSLogger.b("TMSTinyH5Render", "performanceMonitor.onProperty", e);
        }
    }

    private final void a(WVUCWebView.Builder builder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae377992", new Object[]{this, builder});
        } else {
            builder.setWebViewPageModel(new d(com.taobao.themis.kernel.utils.a.a(this.b.b())));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"com/taobao/themis/mix/h5_render/TMSTinyH5Render$reportRumData$1", "Landroid/taobao/windvane/export/webview/AbstractWebViewPageModel;", "onProperty", "", "name", "", "value", "", "onStage", "upTime", "", "themis_mix_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class d extends dqm {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ thk f22583a;

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == 428975361) {
                super.onProperty((String) objArr[0], objArr[1]);
                return null;
            } else if (hashCode != 1805974292) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                super.onStage((String) objArr[0], ((Number) objArr[1]).longValue());
                return null;
            }
        }

        public d(thk thkVar) {
            this.f22583a = thkVar;
        }

        @Override // tb.dqm, tb.dqn
        public void onStage(String name, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6ba4fb14", new Object[]{this, name, new Long(j)});
                return;
            }
            q.d(name, "name");
            super.onStage(name, j);
            thk thkVar = this.f22583a;
            if (thkVar == null) {
                return;
            }
            thkVar.a(name, j);
        }

        @Override // tb.dqm, tb.dqn
        public void onProperty(String name, Object value) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1991a501", new Object[]{this, name, value});
                return;
            }
            q.d(name, "name");
            q.d(value, "value");
            super.onProperty(name, value);
            thk thkVar = this.f22583a;
            if (thkVar == null) {
                return;
            }
            thkVar.a(name, value.toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0320  */
    @Override // tb.qqn, tb.qqq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(tb.qqo r15) {
        /*
            Method dump skipped, instructions count: 852
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.mix.h5_render.a.a(tb.qqo):void");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J.\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\r¸\u0006\u0000"}, d2 = {"com/taobao/themis/mix/h5_render/TMSTinyH5Render$render$4$1", "Lcom/taobao/themis/mix/h5_render/TMSTinyWebviewClient;", "onPageFinished", "", "view", "Lcom/uc/webview/export/WebView;", "url", "", "onReceivedError", "errorCode", "", "description", "failingUrl", "themis_mix_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes9.dex */
    public static final class b extends com.taobao.themis.mix.h5_render.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f22581a;
        public final /* synthetic */ qqo b;

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -332805219) {
                super.onPageFinished((WebView) objArr[0], (String) objArr[1]);
                return null;
            } else if (hashCode != 1373550412) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                super.onReceivedError((WebView) objArr[0], ((Number) objArr[1]).intValue(), (String) objArr[2], (String) objArr[3]);
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ITMSPage iTMSPage, qqo qqoVar, String str, a aVar, qqo qqoVar2) {
            super(iTMSPage, qqoVar, str);
            this.f22581a = aVar;
            this.b = qqoVar2;
        }

        @Override // com.taobao.themis.mix.h5_render.b, android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            WVUCWebView a2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ec29cb9d", new Object[]{this, webView, str});
                return;
            }
            super.onPageFinished(webView, str);
            if (!n.bh() || (a2 = a.a(this.f22581a)) == null) {
                return;
            }
            a2.evaluateJavascript("!function(){\"use strict\";function t(e){return t=\"function\"==typeof Symbol&&\"symbol\"==typeof Symbol.iterator?function(t){return typeof t}:function(t){return t&&\"function\"==typeof Symbol&&t.constructor===Symbol&&t!==Symbol.prototype?\"symbol\":typeof t},t(e)}var e=\"complete\"===document.readyState,o=!1,n=function(){if(!o&&(o=!0,\"object\"===t(window.__sync_mega__))){var e,n,a,c,i={totalRequests:0,cacheHits:0,typeStats:{}},r=performance.getEntriesByType(\"navigation\").concat(performance.getEntriesByType(\"resource\")).reduce((function(t,e){var o=e.initiatorType,n=e.transferSize;return t.totalRequests+=1,0===n&&(t.cacheHits+=1),t.typeStats[o]||(t.typeStats[o]={totalRequests:0,cacheHits:0}),t.typeStats[o].totalRequests+=1,0===n&&(t.typeStats[o].cacheHits+=1),t}),i),s=Object.keys(r.typeStats).reduce((function(t,e){var o=r.typeStats[e],n=o.totalRequests,a=o.cacheHits;return t[e]=a/n,t}),{});e=\"Themis\",n=\"CacheHitRate\",a={cacheHitRate:r.cacheHits/r.totalRequests,typedCacheHitRate:s,webAppUrl:location.href},null===(c=window.__megability_bridge__)||void 0===c||c.asyncCall(\"appMonitor\",\"alarmSuccess\",{module:e,monitorPoint:n,args:a},(function(t){return console.log(t)}))}};e?n():window.addEventListener(\"load\",(function(){n()}))}();\n");
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("51deb74c", new Object[]{this, webView, new Integer(i), str, str2});
                return;
            }
            TMSLogger.a("TMSTinyH5Render", "onReceivedError " + i + ' ' + str2);
            if (n.ch()) {
                if (i == -205) {
                    af.Companion.a().add(Integer.valueOf(i));
                }
                if (((!URLUtil.isHttpsUrl(str2) && !URLUtil.isHttpUrl(str2)) || !android.taobao.windvane.util.a.b(str2)) && ((i > -16 && i < 0) || i == -80 || i == -50)) {
                    String url = webView != null ? webView.getUrl() : null;
                    if (url == null || q.a((Object) url, (Object) str2)) {
                        if (this.b == null) {
                            return;
                        }
                        if (webView instanceof WVUCWebView) {
                            hvw webViewContext = ((WVUCWebView) webView).getWebViewContext();
                            q.b(webViewContext, "view.webViewContext");
                            if (webViewContext.isHitSnapshot()) {
                                this.b.a("TMS_ERR_WEB_WIDGET", str + " [" + i + ']');
                                return;
                            }
                        }
                        if (webView != null) {
                            webView.loadUrl("about:blank", null);
                        }
                        if (webView != null) {
                            webView.setVisibility(4);
                        }
                        this.b.a("TMS_ERR_WEB_" + i, str + " [" + i + ']');
                        return;
                    }
                }
            }
            super.onReceivedError(webView, i, str, str2);
        }
    }

    private final void a(WVUCWebView wVUCWebView) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6d1e4c9", new Object[]{this, wVUCWebView});
            return;
        }
        IEnvironmentService iEnvironmentService = (IEnvironmentService) qpt.b(IEnvironmentService.class);
        String appVersion = iEnvironmentService != null ? iEnvironmentService.getAppVersion() : null;
        if (appVersion != null && appVersion.length() != 0) {
            z = false;
        }
        if (z) {
            return;
        }
        WebSettings settings = wVUCWebView.getSettings();
        q.b(settings, "webView.settings");
        StringBuilder sb = new StringBuilder(settings.getUserAgentString());
        if (n.aw()) {
            sb.append(" ");
            sb.append(o.g(this.f33035a));
            q.b(sb, "userAgentBuilder.append(…nce.getThemisUserAgent())");
        } else {
            sb.append(" Themis");
            sb.append(" TinyApp");
        }
        WebSettings settings2 = wVUCWebView.getSettings();
        q.b(settings2, "webView.settings");
        settings2.setUserAgentString(sb.toString());
    }

    @Override // tb.qqq
    public View b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("639153eb", new Object[]{this}) : this.c;
    }

    @Override // tb.qqn, tb.qqq
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        super.e();
        WVUCWebView wVUCWebView = this.d;
        if (wVUCWebView == null) {
            return;
        }
        q.a(wVUCWebView);
        wVUCWebView.onResume();
    }

    @Override // tb.qqn, tb.qqq
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        super.a();
        WVUCWebView wVUCWebView = this.d;
        if (wVUCWebView == null || this.f) {
            return;
        }
        wVUCWebView.onPause();
    }

    @Override // tb.qqn, tb.qqq
    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
            return;
        }
        super.q();
        WVUCWebView wVUCWebView = this.d;
        if (wVUCWebView == null || !this.f) {
            return;
        }
        wVUCWebView.onPause();
    }

    @Override // tb.qqn, tb.qqq
    public void a(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79f30285", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.a(i, i2, intent);
        WVUCWebView wVUCWebView = this.d;
        if (wVUCWebView == null) {
            return;
        }
        q.a(wVUCWebView);
        wVUCWebView.onActivityResult(i, i2, intent);
    }

    @Override // tb.qqq
    public void a(String event, JSON json) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8072587d", new Object[]{this, event, json});
            return;
        }
        q.d(event, "event");
        if (json == null) {
            json = new JSONObject();
        }
        if (this.d == null) {
            return;
        }
        String str = "\n                (function() {\n                   var customEvent = new CustomEvent('message', { detail: " + json.toJSONString() + " });\n                   customEvent.origin = 'Triver';\n                   customEvent.data = {\"event\": \"" + event + "\"};\n                   dispatchEvent(customEvent);\n                })()\n            ";
        WVUCWebView wVUCWebView = this.d;
        q.a(wVUCWebView);
        wVUCWebView.evaluateJavascript(str);
    }

    @Override // tb.qqn, tb.qqq
    public void b(String event, JSON json) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("721bfe9c", new Object[]{this, event, json});
            return;
        }
        q.d(event, "event");
        super.b(event, json);
        if (json == null) {
            json = new JSONObject();
        }
        if (this.d == null) {
            return;
        }
        String str = "\n                (function() {\n                   dispatchEvent(new CustomEvent('" + event + "', { detail: " + json.toJSONString() + " }));\n                })()\n            ";
        WVUCWebView wVUCWebView = this.d;
        q.a(wVUCWebView);
        wVUCWebView.evaluateJavascript(str);
    }

    @Override // tb.qqn, tb.qqq
    public void a(String target, String event, JSON json) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("578c98f3", new Object[]{this, target, event, json});
            return;
        }
        q.d(target, "target");
        q.d(event, "event");
        super.a(target, event, json);
        if (json == null) {
            json = new JSONObject();
        }
        WVUCWebView wVUCWebView = this.d;
        if (wVUCWebView == null) {
            return;
        }
        wVUCWebView.evaluateJavascript(j.a(target, event, json));
    }

    @Override // tb.qqq
    public Bitmap di_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("db94d7df", new Object[]{this});
        }
        if (f.a(this.c, SurfaceView.class) != null) {
            TMSLogger.d("TMSTinyH5Render", "can't get page snapshot due to SurfaceView");
            return null;
        } else if (f.a(this.c, TextureView.class) != null) {
            TMSLogger.d("TMSTinyH5Render", "can't get page snapshot due to TextureView");
            return null;
        } else {
            ViewGroup viewGroup = this.c;
            return com.taobao.themis.utils.d.a(viewGroup, viewGroup.getWidth(), this.c.getHeight(), 0, 0);
        }
    }

    @Override // tb.qqn, tb.qqq
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        super.f();
        WVUCWebView wVUCWebView = this.d;
        if (wVUCWebView == null) {
            return;
        }
        try {
            q.a(wVUCWebView);
            ViewParent parent = wVUCWebView.getParent();
            if (!(parent instanceof ViewGroup)) {
                parent = null;
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup != null) {
                viewGroup.removeView(this.d);
            }
            WVUCWebView wVUCWebView2 = this.d;
            q.a(wVUCWebView2);
            wVUCWebView2.destroy();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.d = null;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/taobao/themis/mix/h5_render/TMSTinyH5Render$Companion;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "themis_mix_release"}, k = 1, mv = {1, 4, 1})
    /* renamed from: com.taobao.themis.mix.h5_render.a$a  reason: collision with other inner class name */
    /* loaded from: classes9.dex */
    public static final class C0948a {
        static {
            kge.a(162477301);
        }

        private C0948a() {
        }

        public /* synthetic */ C0948a(kotlin.jvm.internal.o oVar) {
            this();
        }
    }
}
