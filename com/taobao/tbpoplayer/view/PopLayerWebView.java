package com.taobao.tbpoplayer.view;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.SystemClock;
import android.taobao.windvane.extra.uc.WVUCWebChromeClient;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.extra.uc.WVUCWebViewClient;
import android.taobao.windvane.jsbridge.q;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.webkit.ConsoleMessage;
import com.alibaba.poplayer.factory.view.base.PopLayerBaseView;
import com.alibaba.poplayer.layermanager.PopRequest;
import com.alibaba.poplayer.track.module.OnePopModule;
import com.alibaba.poplayer.trigger.BaseConfigItem;
import com.alibaba.poplayer.trigger.d;
import com.alibaba.poplayer.utils.ConsoleLogger;
import com.alibaba.poplayer.utils.f;
import com.alipay.android.phone.mobilesdk.socketcraft.monitor.MonitorItemConstants;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.browser.jsbridge.CommonJsApiManager;
import com.taobao.taobao.R;
import com.taobao.tbpoplayer.view.jsbridge.PopLayerWVNativePlugin;
import com.taobao.tbpoplayer.view.jsbridge.PopLayerWVWindowPlugin;
import com.uc.webview.export.WebView;
import org.json.JSONObject;
import org.json.JSONTokener;
import tb.bzt;
import tb.kge;
import tb.qoa;
import tb.qob;
import tb.sep;

/* loaded from: classes9.dex */
public class PopLayerWebView extends PopLayerBaseView<WVUCWebView, d> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG;
    public static final String VIEW_TYPE = "webview";
    private StringBuilder mJsErrorMessageSb;
    private long mLoadUrlStartTime;
    private sep mScreenTypeListener;
    private String mUrl;
    private boolean mWebViewAddEnable;

    public static /* synthetic */ Object ipc$super(PopLayerWebView popLayerWebView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1896705494:
                super.syncJumpToUrlInfo((String) objArr[0]);
                return null;
            case 406417345:
                super.resetContext((Context) objArr[0]);
                return null;
            case 571929693:
                super.init((Context) objArr[0], (Context) ((PopRequest) objArr[1]));
                return null;
            case 988548963:
                super.onActivityPaused();
                return null;
            case 1889590256:
                super.onActivityResumed();
                return null;
            case 1890078406:
                super.destroyView();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    /* renamed from: lambda$xK5t-5wpmGH_N8QPIW9nZ2AR0tI */
    public static /* synthetic */ void m1464lambda$xK5t5wpmGH_N8QPIW9nZ2AR0tI(PopLayerWebView popLayerWebView) {
        popLayerWebView.removeMeOnMainThread();
    }

    public static /* synthetic */ PopRequest access$000(PopLayerWebView popLayerWebView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PopRequest) ipChange.ipc$dispatch("8fff8739", new Object[]{popLayerWebView}) : popLayerWebView.mPopRequest;
    }

    public static /* synthetic */ PopRequest access$100(PopLayerWebView popLayerWebView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PopRequest) ipChange.ipc$dispatch("70814f18", new Object[]{popLayerWebView}) : popLayerWebView.mPopRequest;
    }

    public static /* synthetic */ long access$200(PopLayerWebView popLayerWebView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1d9fbfbf", new Object[]{popLayerWebView})).longValue() : popLayerWebView.mLoadUrlStartTime;
    }

    public static /* synthetic */ void access$300(PopLayerWebView popLayerWebView, ConsoleMessage consoleMessage, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51c88ddc", new Object[]{popLayerWebView, consoleMessage, new Boolean(z)});
        } else {
            popLayerWebView.sendLog(consoleMessage, z);
        }
    }

    static {
        kge.a(809885629);
        TAG = PopLayerWebView.class.getSimpleName();
    }

    public PopLayerWebView(Context context) {
        super(context);
        this.mWebViewAddEnable = true;
        this.mLoadUrlStartTime = 0L;
        this.mJsErrorMessageSb = new StringBuilder();
    }

    @Override // com.alibaba.poplayer.factory.view.base.PopLayerBaseView
    public void resetContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18396fc1", new Object[]{this, context});
            return;
        }
        super.resetContext(context);
        if (!com.taobao.tbpoplayer.info.a.a().A()) {
            return;
        }
        Context context2 = getContext();
        if (!(context2 instanceof MutableContextWrapper)) {
            return;
        }
        ((MutableContextWrapper) context2).setBaseContext(context);
    }

    private void setWebView(WVUCWebView wVUCWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("766db43f", new Object[]{this, wVUCWebView});
        } else if (wVUCWebView == this.mInnerView) {
        } else {
            q.a(wVUCWebView, "Base", PopLayerWVWindowPlugin.class);
            q.a(wVUCWebView, "WVNative", PopLayerWVNativePlugin.class);
            if (this.mInnerView != 0) {
                removeView((View) this.mInnerView);
            }
            removeCloseButton();
            this.mInnerView = wVUCWebView;
            if (wVUCWebView.getView() != null) {
                wVUCWebView.getView().setTag(R.id.poplayer_view_id, PopLayerBaseView.POPLAYER_VIEW_TAG);
            }
            try {
                qob.a(getContext(), this);
            } catch (Throwable th) {
                com.alibaba.poplayer.utils.c.a("PopLayerWebView.setWebView.initWebViewCompat.error", th);
            }
            try {
                if (this.mWebViewAddEnable) {
                    addInnerView();
                } else {
                    com.alibaba.poplayer.utils.c.a("PopLayerWebView try add webview, WebView had destroyed,url:" + this.mUrl);
                }
            } catch (Throwable th2) {
                com.alibaba.poplayer.utils.c.a("PopLayerWebView.setWebView.error", th2);
            }
            com.alibaba.poplayer.utils.c.a("%s.setWebView.success", TAG);
        }
    }

    public WVUCWebView getWebView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WVUCWebView) ipChange.ipc$dispatch("151ffdcd", new Object[]{this}) : (WVUCWebView) this.mInnerView;
    }

    @Override // com.alibaba.poplayer.factory.view.base.PopLayerBaseView
    public void destroyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70a84ec6", new Object[]{this});
            return;
        }
        super.destroyView();
        f.b(new Runnable() { // from class: com.taobao.tbpoplayer.view.-$$Lambda$PopLayerWebView$xK5t-5wpmGH_N8QPIW9nZ2AR0tI
            {
                PopLayerWebView.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                PopLayerWebView.m1464lambda$xK5t5wpmGH_N8QPIW9nZ2AR0tI(PopLayerWebView.this);
            }
        });
    }

    public void loadUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89757c7a", new Object[]{this, str});
        } else if (getWebView() == null || TextUtils.isEmpty(str)) {
        } else {
            CommonJsApiManager.initCommonJsbridge();
            com.alibaba.poplayer.utils.c.a("Load url : %s.", str);
            try {
                getWebView().loadUrl(str);
                this.mLoadUrlStartTime = SystemClock.elapsedRealtime();
            } catch (Exception e) {
                com.alibaba.poplayer.utils.c.a("loadUrl.error.", e);
            }
        }
    }

    public void removeMeOnMainThread() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1233145", new Object[]{this});
            return;
        }
        try {
            if (this.mInnerView != 0) {
                ((WVUCWebView) this.mInnerView).getSettings().setJavaScriptEnabled(false);
                if (((WVUCWebView) this.mInnerView).getParent() != null) {
                    removeView((View) this.mInnerView);
                }
                WVUCWebView wVUCWebView = (WVUCWebView) this.mInnerView;
                q.a(wVUCWebView);
                wVUCWebView.destroy();
                if (!com.taobao.tbpoplayer.info.a.a().U()) {
                    destroy();
                }
                this.mInnerView = null;
            }
            removeCloseButton();
            c.a().b(((d) this.mPopRequest).z());
            if (this.mScreenTypeListener != null) {
                this.mScreenTypeListener.a();
            }
            this.mPopRequest = null;
            com.alibaba.poplayer.utils.c.a("%s.destroyView.success", TAG);
        } catch (Throwable th) {
            try {
                com.alibaba.poplayer.utils.c.a(TAG + ".removeMeOnMainThread", th);
            } finally {
                this.mWebViewAddEnable = false;
            }
        }
    }

    @Override // com.alibaba.poplayer.factory.view.base.PopLayerBaseView
    public void init(final Context context, final d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef24561", new Object[]{this, context, dVar});
        } else {
            post(new Runnable() { // from class: com.taobao.tbpoplayer.view.-$$Lambda$PopLayerWebView$ObgWJ16m8-X5NVNwW6XyOpX_eAs
                @Override // java.lang.Runnable
                public final void run() {
                    PopLayerWebView.this.lambda$init$62$PopLayerWebView(context, dVar);
                }
            });
        }
    }

    public /* synthetic */ void lambda$init$62$PopLayerWebView(Context context, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0b18a5e", new Object[]{this, context, dVar});
            return;
        }
        try {
            doInit(context, dVar);
            loadUrl(this.mUrl);
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("PopLayerWebview.post.doInit.error", th);
        }
    }

    private void doInit(Context context, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3933a216", new Object[]{this, context, dVar});
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        JSONObject jSONObject = null;
        try {
            super.init(context, (Context) dVar);
            String str = dVar.x().params;
            if (!TextUtils.isEmpty(str)) {
                jSONObject = (JSONObject) new JSONTokener(str).nextValue();
            }
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("PopLayerView init fail.", th);
        }
        if (jSONObject == null) {
            OnePopModule.OnePopLoseReasonCode onePopLoseReasonCode = OnePopModule.OnePopLoseReasonCode.OnViewErrorClose;
            close(onePopLoseReasonCode, "PARAMS_PARSE_ERROR", "params=" + dVar.x().params, "");
            return;
        }
        setVisibility(4);
        setPopRequest(dVar);
        if (com.taobao.tbpoplayer.info.a.a().M()) {
            setUseCacheMark(false);
            setUseTouchPointBitmap(true);
        }
        BaseConfigItem x = dVar.x();
        if (x == null) {
            com.alibaba.poplayer.utils.c.a("PopLayerWebView init error.configItem=null.", new Object[0]);
            close(OnePopModule.OnePopLoseReasonCode.OnViewErrorClose, "CONFIG_NULL", "", "");
            return;
        }
        this.mUrl = jSONObject.optString("url");
        setWebView(buildWebView(context));
        if (!com.taobao.tbpoplayer.info.a.a().I()) {
            setHardwareAcceleration(jSONObject.optBoolean("enableHardwareAcceleration", true));
        }
        setPenetrateAlpha((int) (x.modalThreshold * 255.0d));
        showCloseButton(x.showCloseBtn);
        dVar.t().E = String.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime);
        this.mScreenTypeListener = new sep(context);
        this.mScreenTypeListener.a(this);
    }

    @Override // com.alibaba.poplayer.factory.view.base.PopLayerBaseView
    public void onActivityResumed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70a0dbf0", new Object[]{this});
            return;
        }
        super.onActivityResumed();
        f.b(new Runnable() { // from class: com.taobao.tbpoplayer.view.-$$Lambda$PopLayerWebView$uYhSgFLn95ztiBwXitMTtESqr-I
            {
                PopLayerWebView.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                PopLayerWebView.this.lambda$onActivityResumed$63$PopLayerWebView();
            }
        });
    }

    public /* synthetic */ void lambda$onActivityResumed$63$PopLayerWebView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f33bc1c", new Object[]{this});
            return;
        }
        try {
            WVUCWebView webView = getWebView();
            if (webView == null) {
                return;
            }
            webView.onResume();
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("H5 onActivityResumed error", th);
        }
    }

    @Override // com.alibaba.poplayer.factory.view.base.PopLayerBaseView
    public void onActivityPaused() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3aec0f63", new Object[]{this});
            return;
        }
        super.onActivityPaused();
        f.b(new Runnable() { // from class: com.taobao.tbpoplayer.view.-$$Lambda$PopLayerWebView$dd7EfKtH8gAdaOiadpJ7NbvT4aM
            {
                PopLayerWebView.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                PopLayerWebView.this.lambda$onActivityPaused$64$PopLayerWebView();
            }
        });
    }

    public /* synthetic */ void lambda$onActivityPaused$64$PopLayerWebView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8591cf30", new Object[]{this});
            return;
        }
        try {
            WVUCWebView webView = getWebView();
            if (webView == null) {
                return;
            }
            webView.onPause();
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("H5 onActivityPaused error", th);
        }
    }

    @Override // com.alibaba.poplayer.factory.view.base.PopLayerBaseView
    public void onReceiveEvent(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12978511", new Object[]{this, str, str2});
        } else if (getWebView() == null) {
        } else {
            getWebView().fireEvent(str, str2);
        }
    }

    private WVUCWebView buildWebView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WVUCWebView) ipChange.ipc$dispatch("21184501", new Object[]{this, context});
        }
        WVUCWebView wVUCWebView = new WVUCWebView(context);
        wVUCWebView.setWebViewClient(new WVUCWebViewClient(context) { // from class: com.taobao.tbpoplayer.view.PopLayerWebView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
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

            {
                PopLayerWebView.this = this;
            }

            @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
            public void onReceivedError(WebView webView, int i, String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("51deb74c", new Object[]{this, webView, new Integer(i), str, str2});
                    return;
                }
                super.onReceivedError(webView, i, str, str2);
                try {
                    com.alibaba.poplayer.utils.c.b("containerLifeCycle", d.a(PopLayerWebView.access$000(PopLayerWebView.this)), "WVUCWebView onReceivedError.");
                    PopLayerWebView popLayerWebView = PopLayerWebView.this;
                    OnePopModule.OnePopLoseReasonCode onePopLoseReasonCode = OnePopModule.OnePopLoseReasonCode.OnViewErrorClose;
                    popLayerWebView.close(onePopLoseReasonCode, i + "", str, null);
                } catch (Throwable th) {
                    com.alibaba.poplayer.utils.c.a("PopLayerWebView.WVUCWebView.onReceivedError.error.", th);
                }
            }

            @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ec29cb9d", new Object[]{this, webView, str});
                    return;
                }
                super.onPageFinished(webView, str);
                try {
                    ((d) PopLayerWebView.access$100(PopLayerWebView.this)).t().F = String.valueOf(SystemClock.elapsedRealtime() - PopLayerWebView.access$200(PopLayerWebView.this));
                } catch (Throwable th) {
                    com.alibaba.poplayer.utils.c.a("PopLayerWebView.WVUCWebView.onPageFinished.error.", th);
                }
            }
        });
        wVUCWebView.setWebChromeClient(new WVUCWebChromeClient(context) { // from class: com.taobao.tbpoplayer.view.PopLayerWebView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                PopLayerWebView.this = this;
            }

            public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str, Object... objArr) {
                if (str.hashCode() == -634514222) {
                    return new Boolean(super.onConsoleMessage((ConsoleMessage) objArr[0]));
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.taobao.windvane.extra.uc.WVUCWebChromeClient, com.uc.webview.export.WebChromeClient
            public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("da2e14d2", new Object[]{this, consoleMessage})).booleanValue();
                }
                try {
                    PopLayerWebView.access$300(PopLayerWebView.this, consoleMessage, true);
                } catch (Throwable th) {
                    com.alibaba.poplayer.utils.c.a("H5 WVUCWebChromeClient onConsoleMessage error", th);
                }
                return super.onConsoleMessage(consoleMessage);
            }
        });
        com.alibaba.poplayer.utils.c.a("buildWebView,use default UC webview.", new Object[0]);
        return wVUCWebView;
    }

    @Override // com.alibaba.poplayer.factory.view.base.PopLayerBaseView
    public void syncJumpToUrlInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ef2922a", new Object[]{this, str});
            return;
        }
        super.syncJumpToUrlInfo(str);
        qoa.a((d) this.mPopRequest);
    }

    @Override // com.alibaba.poplayer.factory.view.base.PopLayerBaseView
    public SpannableStringBuilder getInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpannableStringBuilder) ipChange.ipc$dispatch("e6e304e", new Object[]{this});
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        try {
            if (this.mJsErrorMessageSb.length() > 0) {
                com.taobao.tbpoplayer.util.a.a(spannableStringBuilder, "JsError", this.mJsErrorMessageSb.toString(), null, new ForegroundColorSpan(-65536));
            }
            if (getWebView() != null) {
                com.taobao.tbpoplayer.util.a.a(spannableStringBuilder, MonitorItemConstants.KEY_URL, getWebView().getUrl(), null, null);
            }
        } catch (Throwable th) {
            com.taobao.tbpoplayer.util.a.a(spannableStringBuilder, "Error", "getInfo Error.Message:" + th.getMessage(), null, null);
        }
        return spannableStringBuilder;
    }

    @Override // com.alibaba.poplayer.factory.view.base.PopLayerBaseView
    public String getNativeNotifyInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("58e6e2f5", new Object[]{this});
        }
        com.alibaba.fastjson.JSONObject jSONObject = new com.alibaba.fastjson.JSONObject();
        try {
            if (getPopRequest() != null) {
                BaseConfigItem x = getPopRequest().x();
                jSONObject.put("uuid", (Object) x.uuid);
                jSONObject.put("PopTimes", (Object) (bzt.a().a(x.uuid, -1) + ""));
                jSONObject.put("Event", (Object) getPopRequest().y().toString());
            }
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("getNativeNotifyInfo.error.", th);
        }
        return jSONObject.toJSONString();
    }

    private void sendLog(ConsoleMessage consoleMessage, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32993973", new Object[]{this, consoleMessage, new Boolean(z)});
            return;
        }
        String str = consoleMessage.message() + "\n@source-" + consoleMessage.sourceId() + ":lineNumber-" + consoleMessage.lineNumber();
        if (ConsoleMessage.MessageLevel.ERROR == consoleMessage.messageLevel()) {
            StringBuilder sb = this.mJsErrorMessageSb;
            sb.append(str);
            sb.append("\n\n");
        }
        consoleLog(str, ConsoleLogger.Level.find(qob.WEBCONSOLE_LOGCAT_MAP.get(consoleMessage.messageLevel()).charValue()));
    }
}
