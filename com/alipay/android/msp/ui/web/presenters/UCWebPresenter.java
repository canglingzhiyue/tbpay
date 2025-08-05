package com.alipay.android.msp.ui.web.presenters;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.webkit.ConsoleMessage;
import android.webkit.CookieSyncManager;
import android.webkit.ValueCallback;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.core.AlertIntelligenceEngine;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.drivers.actions.ActionsCreator;
import com.alipay.android.msp.framework.exception.NetErrorException;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.framework.statisticsv2.StatisticInfo;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.language.LanguageHelper;
import com.alipay.android.msp.pay.GlobalSdkConstant;
import com.alipay.android.msp.pay.results.H5PayResult;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.ui.contracts.MspWebContract;
import com.alipay.android.msp.ui.presenters.MspBasePresenter;
import com.alipay.android.msp.ui.views.MspWebActivity;
import com.alipay.android.msp.ui.web.UCWebViewWindow;
import com.alipay.android.msp.ui.web.WebViewWindowStack;
import com.alipay.android.msp.ui.widget.SystemDefaultDialog;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.Utils;
import com.alipay.sdk.m.c.a;
import com.alipay.sdk.m.f.c;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.k;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.ag;
import com.uc.webview.export.CookieManager;
import com.uc.webview.export.JsPromptResult;
import com.uc.webview.export.SslErrorHandler;
import com.uc.webview.export.WebChromeClient;
import com.uc.webview.export.WebView;
import com.uc.webview.export.WebViewClient;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.nfc;
import tb.riy;

/* loaded from: classes3.dex */
public class UCWebPresenter extends MspBasePresenter<MspWebContract.IView> implements MspWebContract.IPresenter<MspWebActivity> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ResultReceiver d;
    private String f;
    private MspWebActivity g;
    private int h;
    private String j;
    private boolean k;
    private String o;
    private boolean p;
    private String q;
    private String r;
    private UCWebViewWindow b = null;
    private WebViewWindowStack c = null;
    private WebView e = null;
    private boolean i = false;
    private boolean l = false;
    private String m = null;
    private final String n = String.format(MspWebActivity.JS_CALL_NATIVE_LISTENER, "h5BackAction", "", "back");
    private Map<String, MspWebActivity.WebStatsEvent> s = new ConcurrentHashMap();

    public static /* synthetic */ Object ipc$super(UCWebPresenter uCWebPresenter, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ int a(UCWebPresenter uCWebPresenter) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("acd04440", new Object[]{uCWebPresenter})).intValue() : uCWebPresenter.h;
    }

    public static /* synthetic */ UCWebViewWindow a(UCWebPresenter uCWebPresenter, UCWebViewWindow uCWebViewWindow) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UCWebViewWindow) ipChange.ipc$dispatch("69782243", new Object[]{uCWebPresenter, uCWebViewWindow});
        }
        uCWebPresenter.b = uCWebViewWindow;
        return uCWebViewWindow;
    }

    public static /* synthetic */ void a(UCWebPresenter uCWebPresenter, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52dc16e1", new Object[]{uCWebPresenter, str, str2});
        } else {
            uCWebPresenter.a(str, str2);
        }
    }

    public static /* synthetic */ void a(UCWebPresenter uCWebPresenter, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed38f827", new Object[]{uCWebPresenter, new Boolean(z)});
        } else {
            uCWebPresenter.a(z);
        }
    }

    public static /* synthetic */ UCWebViewWindow b(UCWebPresenter uCWebPresenter) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UCWebViewWindow) ipChange.ipc$dispatch("2153d95c", new Object[]{uCWebPresenter}) : uCWebPresenter.b;
    }

    public static /* synthetic */ String b(UCWebPresenter uCWebPresenter, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("144cbcaa", new Object[]{uCWebPresenter, str}) : b(str);
    }

    public static /* synthetic */ boolean b(UCWebPresenter uCWebPresenter, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e0c87c6c", new Object[]{uCWebPresenter, new Boolean(z)})).booleanValue();
        }
        uCWebPresenter.i = z;
        return z;
    }

    public static /* synthetic */ WebView c(UCWebPresenter uCWebPresenter) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WebView) ipChange.ipc$dispatch("2f0b49d5", new Object[]{uCWebPresenter}) : uCWebPresenter.e;
    }

    public static /* synthetic */ WebViewWindowStack d(UCWebPresenter uCWebPresenter) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WebViewWindowStack) ipChange.ipc$dispatch("4f2b8d22", new Object[]{uCWebPresenter}) : uCWebPresenter.c;
    }

    public static /* synthetic */ MspWebActivity f(UCWebPresenter uCWebPresenter) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspWebActivity) ipChange.ipc$dispatch("3641b944", new Object[]{uCWebPresenter}) : uCWebPresenter.g;
    }

    public static /* synthetic */ String g(UCWebPresenter uCWebPresenter) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e1508179", new Object[]{uCWebPresenter}) : uCWebPresenter.o;
    }

    public static /* synthetic */ Map h(UCWebPresenter uCWebPresenter) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("945c895b", new Object[]{uCWebPresenter}) : uCWebPresenter.s;
    }

    public static /* synthetic */ String i(UCWebPresenter uCWebPresenter) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("efa245fb", new Object[]{uCWebPresenter}) : uCWebPresenter.q;
    }

    public static /* synthetic */ String j(UCWebPresenter uCWebPresenter) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f6cb283c", new Object[]{uCWebPresenter}) : uCWebPresenter.f;
    }

    public static /* synthetic */ boolean k(UCWebPresenter uCWebPresenter) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7740a087", new Object[]{uCWebPresenter})).booleanValue() : uCWebPresenter.i;
    }

    public static /* synthetic */ boolean l(UCWebPresenter uCWebPresenter) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b7f1026", new Object[]{uCWebPresenter})).booleanValue() : uCWebPresenter.p;
    }

    public static /* synthetic */ void m(UCWebPresenter uCWebPresenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fbd7fc1", new Object[]{uCWebPresenter});
        } else {
            uCWebPresenter.c();
        }
    }

    public static /* synthetic */ String n(UCWebPresenter uCWebPresenter) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("136eb140", new Object[]{uCWebPresenter}) : uCWebPresenter.n;
    }

    public static /* synthetic */ void o(UCWebPresenter uCWebPresenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c83a5eff", new Object[]{uCWebPresenter});
        } else {
            uCWebPresenter.b();
        }
    }

    public UCWebPresenter(int i, boolean z, String str, String str2, boolean z2, String str3, ResultReceiver resultReceiver, String str4, Context context) {
        this.h = i;
        this.k = z;
        this.j = str3;
        this.o = str2;
        this.d = resultReceiver;
        this.p = z2;
        this.q = str4;
    }

    @Override // com.alipay.android.msp.ui.contracts.MspWebContract.IPresenter
    public void attachIView(MspWebContract.IView iView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf38116c", new Object[]{this, iView});
        } else {
            this.g = (MspWebActivity) iView;
        }
    }

    @Override // com.alipay.android.msp.ui.presenters.MspBasePresenter, com.alipay.android.msp.ui.contracts.MspBaseContract.IPresenter
    /* renamed from: getIView */
    public MspWebActivity mo545getIView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MspWebActivity) ipChange.ipc$dispatch("d134954d", new Object[]{this}) : this.g;
    }

    @Override // com.alipay.android.msp.ui.presenters.MspBasePresenter, com.alipay.android.msp.ui.contracts.MspBaseContract.IPresenter
    public Activity getActivity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("81223f9c", new Object[]{this});
        }
        if (mo545getIView() == null) {
            return null;
        }
        return mo545getIView();
    }

    @Override // com.alipay.android.msp.ui.presenters.MspBasePresenter, com.alipay.android.msp.ui.contracts.MspBaseContract.IPresenter
    public void detachIView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98beade2", new Object[]{this});
        } else if (this.g == null) {
        } else {
            this.g = null;
        }
    }

    @Override // com.alipay.android.msp.ui.contracts.MspWebContract.IPresenter
    /* renamed from: getJsWebViewWindow  reason: collision with other method in class */
    public UCWebViewWindow mo546getJsWebViewWindow() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UCWebViewWindow) ipChange.ipc$dispatch("80f2f8a1", new Object[]{this}) : this.b;
    }

    @Override // com.alipay.android.msp.ui.contracts.MspWebContract.IPresenter
    public boolean init(boolean z, String str, String str2, final int i, String str3, JSONObject jSONObject, final JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56448ac0", new Object[]{this, new Boolean(z), str, str2, new Integer(i), str3, jSONObject, jSONObject2})).booleanValue();
        }
        LogUtil.record(2, "UCWebPresenter:init", "url=".concat(String.valueOf(str)));
        try {
            this.f = a();
            this.r = str3;
            this.b = new UCWebViewWindow(getActivity());
            this.b.init(z, str2, str3);
            final Activity activity = getActivity();
            final MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(this.h);
            if (jSONObject2 != null && activity != null) {
                this.b.showTip(jSONObject2.getString("icon"), jSONObject2.getString("text"), new View.OnClickListener() { // from class: com.alipay.android.msp.ui.web.presenters.UCWebPresenter.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                            return;
                        }
                        Utils.postNotification(activity, "MQP_LOC_H5_TIP_ACTION_NOTIFY", new JSONObject(), UCWebPresenter.a(UCWebPresenter.this));
                        if (mspContextByBizId == null || !jSONObject2.containsKey("action")) {
                            return;
                        }
                        ActionsCreator.get(mspContextByBizId).createDialogEventAction(jSONObject2.getJSONObject("action").toJSONString());
                    }
                });
            }
            this.b.setBackAction(jSONObject);
            if (!TextUtils.isEmpty(this.j)) {
                CookieSyncManager.createInstance(getActivity()).sync();
                CookieManager.getInstance().setCookie(str, this.j);
                CookieSyncManager.getInstance().sync();
            }
            TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.ui.web.presenters.UCWebPresenter.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    MspBasePresenter mspBasePresenter;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        LogUtil.record(2, "UCWebPresenter:showWebview", "bizid=" + UCWebPresenter.a(UCWebPresenter.this));
                        if (UCWebPresenter.this.mo545getIView() == null || UCWebPresenter.this.getActivity().isFinishing()) {
                            return;
                        }
                        MspContext mspContextByBizId2 = MspContextManager.getInstance().getMspContextByBizId(UCWebPresenter.a(UCWebPresenter.this));
                        if (mspContextByBizId2 != null && i > 0 && (mspBasePresenter = mspContextByBizId2.getMspBasePresenter()) != null && mspBasePresenter.mo545getIView() != null) {
                            LogUtil.record(2, "UCWebPresenter:showWebview", "stopLoadingView");
                            mspBasePresenter.mo545getIView().stopLoadingView();
                        }
                        UCWebPresenter.this.mo545getIView().addViewToMainLayout(UCWebPresenter.b(UCWebPresenter.this));
                    } catch (Throwable th) {
                        LogUtil.printExceptionStackTrace(th);
                    }
                }
            }, i);
            return true;
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return false;
        }
    }

    private String a() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this});
        }
        InputStream inputStream = null;
        try {
            inputStream = getActivity().getAssets().open("mspjs_v2.js");
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (inputStream == null) {
            LogUtil.record(2, "UCWebPresenter:getDefaultJs", "failed to open js file, see previous stack trace");
            return "";
        }
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            try {
                i = inputStream.read(bArr);
            } catch (IOException e2) {
                e2.printStackTrace();
                i = 0;
            }
            if (i > 0) {
                byteArrayOutputStream.write(bArr, 0, i);
            } else {
                try {
                    break;
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
            }
        }
        inputStream.close();
        return byteArrayOutputStream.toString();
    }

    @Override // com.alipay.android.msp.ui.contracts.MspWebContract.IPresenter
    public void initWebUI(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e87cadd", new Object[]{this, str, str2, str3});
            return;
        }
        LogUtil.record(2, "UCWebPresenter:initWebUI", "url=" + str3 + ", method=" + str);
        b();
        setWebViewUA();
        MspWebActivity.WebStatsEvent webStatsEvent = new MspWebActivity.WebStatsEvent();
        webStatsEvent.stEvent = newStEvent("webonload", b(str3));
        if (str3 != null) {
            this.s.put(str3, webStatsEvent);
        }
        if (TextUtils.isEmpty(str)) {
            this.e.loadUrl(str3);
            return;
        }
        if (str.equals("GET")) {
            this.e.loadUrl(str3);
        }
        if (!str.equals("POST")) {
            return;
        }
        try {
            this.e.postUrl(str3, str2.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            LogUtil.printExceptionStackTrace(e);
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.e = this.b.getWebView();
        LogUtil.record(2, "UCWebPresenter:initView", "webview=" + this.e);
        if (this.e == null) {
            return;
        }
        if (mo545getIView() != null) {
            mo545getIView().initUI(this.b);
        }
        this.e.setWebChromeClient(new WebChromeClient() { // from class: com.alipay.android.msp.ui.web.presenters.UCWebPresenter.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass3 anonymousClass3, String str, Object... objArr) {
                int hashCode = str.hashCode();
                if (hashCode == -1540056808) {
                    super.onProgressChanged((WebView) objArr[0], ((Number) objArr[1]).intValue());
                    return null;
                } else if (hashCode != -634514222) {
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                } else {
                    return new Boolean(super.onConsoleMessage((ConsoleMessage) objArr[0]));
                }
            }

            @Override // com.uc.webview.export.WebChromeClient
            public void onProgressChanged(WebView webView, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a4349918", new Object[]{this, webView, new Integer(i)});
                    return;
                }
                if (UCWebPresenter.this.mo545getIView() != null) {
                    UCWebPresenter.this.mo545getIView().setProgressVisibility(i);
                }
                super.onProgressChanged(webView, i);
            }

            @Override // com.uc.webview.export.WebChromeClient
            public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("d21149c", new Object[]{this, webView, str, str2, str3, jsPromptResult})).booleanValue();
                }
                LogUtil.record(2, "UCWebPresenter:onJsPrompt", "url=" + str + ", message=" + str2);
                if (str2.startsWith("<head>") && str2.contains("sdk_result_code:")) {
                    str2.indexOf("-->", str2.indexOf("sdk_result_code:"));
                    UCWebPresenter.this.getActivity().finish();
                }
                jsPromptResult.cancel();
                return true;
            }

            @Override // com.uc.webview.export.WebChromeClient
            public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("da2e14d2", new Object[]{this, consoleMessage})).booleanValue();
                }
                if (Build.VERSION.SDK_INT < 19) {
                    String message = consoleMessage.message();
                    LogUtil.record(2, "UCWebPresenter:onConsoleMessage", "conStr=".concat(String.valueOf(message)));
                    if (message.contains("Uncaught ReferenceError") && message.contains("alipayjsbridgeH5BackAction")) {
                        if (UCWebPresenter.c(UCWebPresenter.this).canGoBack()) {
                            UCWebPresenter.a(UCWebPresenter.this, "click", "webgoback");
                            UCWebPresenter.c(UCWebPresenter.this).goBack();
                        } else if (UCWebPresenter.d(UCWebPresenter.this) != null && !UCWebPresenter.d(UCWebPresenter.this).isEmpty()) {
                            UCWebPresenter.e(UCWebPresenter.this);
                        } else {
                            UCWebPresenter.a(UCWebPresenter.this, "click", "webonexit");
                            UCWebPresenter.a(UCWebPresenter.this, false);
                        }
                    }
                }
                return super.onConsoleMessage(consoleMessage);
            }

            @Override // com.uc.webview.export.WebChromeClient
            public void onReceivedTitle(WebView webView, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("87d6d0e5", new Object[]{this, webView, str});
                    return;
                }
                try {
                    if (UCWebPresenter.f(UCWebPresenter.this) == null || webView == null || webView.getUrl() == null || webView.getUrl().endsWith(str) || !TextUtils.isEmpty(UCWebPresenter.g(UCWebPresenter.this))) {
                        return;
                    }
                    LogUtil.record(2, "UCWebPresenter#onReceivedTitle", str);
                    UCWebPresenter.b(UCWebPresenter.this).getTitleView().setText(str);
                } catch (Exception e) {
                    LogUtil.printExceptionStackTrace(e);
                }
            }
        });
        this.e.setWebViewClient(new AnonymousClass4());
    }

    /* renamed from: com.alipay.android.msp.ui.web.presenters.UCWebPresenter$4  reason: invalid class name */
    /* loaded from: classes3.dex */
    public class AnonymousClass4 extends WebViewClient {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass4 anonymousClass4, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1171743094) {
                super.onLoadResource((WebView) objArr[0], (String) objArr[1]);
                return null;
            } else if (hashCode == 534767588) {
                super.onPageStarted((WebView) objArr[0], (String) objArr[1], (Bitmap) objArr[2]);
                return null;
            } else if (hashCode != 1373550412) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                super.onReceivedError((WebView) objArr[0], ((Number) objArr[1]).intValue(), (String) objArr[2], (String) objArr[3]);
                return null;
            }
        }

        public AnonymousClass4() {
        }

        @Override // com.uc.webview.export.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1fdfe7e4", new Object[]{this, webView, str, bitmap});
                return;
            }
            LogUtil.record(2, "UCWebPresenter:onPageStarted", "url=".concat(String.valueOf(str)));
            long elapsedRealtime = SystemClock.elapsedRealtime();
            MspWebActivity.WebStatsEvent webStatsEvent = (MspWebActivity.WebStatsEvent) UCWebPresenter.h(UCWebPresenter.this).get(str);
            if (webStatsEvent != null) {
                webStatsEvent.startLoadUrlTime = elapsedRealtime;
            }
            UCWebPresenter.b(UCWebPresenter.this, false);
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // com.uc.webview.export.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("dacf25f5", new Object[]{this, webView, str})).booleanValue();
            }
            LogUtil.record(2, "UCWebPresenter:shouldOverrideUrlLoading", "url=" + str + ", mExitUrl=" + UCWebPresenter.i(UCWebPresenter.this) + " , mbizid=" + UCWebPresenter.a(UCWebPresenter.this));
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            if (!TextUtils.isEmpty(UCWebPresenter.i(UCWebPresenter.this)) && str.startsWith(UCWebPresenter.i(UCWebPresenter.this))) {
                UCWebPresenter.a(UCWebPresenter.this, true);
            } else if (!TextUtils.isEmpty(UCWebPresenter.i(UCWebPresenter.this)) && str.contains(UCWebPresenter.i(UCWebPresenter.this))) {
                MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(UCWebPresenter.a(UCWebPresenter.this));
                if (mspContextByBizId != null) {
                    mspContextByBizId.setCallbackUrlForOpenWeb(str);
                }
                UCWebPresenter.a(UCWebPresenter.this, true);
            } else if (str.startsWith(c.l)) {
                String str2 = null;
                try {
                    str2 = URLDecoder.decode(str, "utf-8");
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
                if (!TextUtils.isEmpty(str2)) {
                    UCWebPresenter.a(UCWebPresenter.this, nfc.PHA_MONITOR_MODULE_POINT_JS_API, str2.substring(17));
                }
                UCWebPresenter.a(UCWebPresenter.this, str);
            } else if (TextUtils.equals(str, a.d)) {
                UCWebPresenter.a(UCWebPresenter.this, false);
            } else if (str.startsWith(k.HTTP_PREFIX) || str.startsWith(k.HTTPS_PREFIX)) {
                if (!TextUtils.isEmpty(str)) {
                    MspWebActivity.WebStatsEvent webStatsEvent = new MspWebActivity.WebStatsEvent();
                    webStatsEvent.stEvent = UCWebPresenter.newStEvent("webonload", UCWebPresenter.b(UCWebPresenter.this, str));
                    UCWebPresenter.h(UCWebPresenter.this).put(str, webStatsEvent);
                    MspContext mspContextByBizId2 = MspContextManager.getInstance().getMspContextByBizId(UCWebPresenter.a(UCWebPresenter.this));
                    if (mspContextByBizId2 != null) {
                        try {
                            str = URI.create(str).getHost();
                        } catch (Throwable th) {
                            LogUtil.printExceptionStackTrace(th);
                        }
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("host", (Object) str);
                        AlertIntelligenceEngine.startAction(mspContextByBizId2, AlertIntelligenceEngine.ACTION_OPEN_WEB, "start", jSONObject.toJSONString(), "", "");
                    }
                }
                return false;
            } else {
                try {
                    Intent intent = new Intent();
                    intent.setAction("android.intent.action.VIEW");
                    intent.setData(Uri.parse(str));
                    UCWebPresenter.this.getActivity().startActivity(intent);
                } catch (Exception e2) {
                    LogUtil.printExceptionStackTrace(e2);
                }
            }
            return true;
        }

        @Override // com.uc.webview.export.WebViewClient
        public void onLoadResource(WebView webView, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ba289e8a", new Object[]{this, webView, str});
            } else {
                super.onLoadResource(webView, str);
            }
        }

        @Override // com.uc.webview.export.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ec29cb9d", new Object[]{this, webView, str});
                return;
            }
            try {
                LogUtil.record(2, "UCWebPresenter:onPageFinished", "url=".concat(String.valueOf(str)));
                webView.loadUrl("javascript:window.prompt('<head>'+document.getElementsByTagName('html')[0].innerHTML+'</head>');javascript:" + UCWebPresenter.j(UCWebPresenter.this) + String.format(MspWebActivity.JS_CALL_NATIVE_LISTENER, "h5PageFinished", "", ""));
                long elapsedRealtime = SystemClock.elapsedRealtime();
                MspWebActivity.WebStatsEvent webStatsEvent = (MspWebActivity.WebStatsEvent) UCWebPresenter.h(UCWebPresenter.this).get(str);
                if (webStatsEvent != null) {
                    long j = elapsedRealtime - webStatsEvent.startLoadUrlTime;
                    if (webStatsEvent.stEvent != null) {
                        webStatsEvent.stEvent.updateEventTime();
                        webStatsEvent.stEvent.onStatistic(StEvent.FILL_DATE_TIME, String.valueOf(j));
                    }
                    MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(UCWebPresenter.a(UCWebPresenter.this));
                    if (UCWebPresenter.a(UCWebPresenter.this) != -1 && mspContextByBizId != null) {
                        mspContextByBizId.getStatisticInfo().addEvent(webStatsEvent.stEvent);
                        UCWebPresenter.h(UCWebPresenter.this).remove(str);
                        String host = URI.create(str).getHost();
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("host", (Object) host);
                        jSONObject.put(ag.KEY_LOAD_TIME, (Object) Long.valueOf(j));
                        AlertIntelligenceEngine.startAction(mspContextByBizId, AlertIntelligenceEngine.ACTION_OPEN_WEB, "end", jSONObject.toJSONString(), "", "");
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("url", (Object) str);
                        jSONObject2.put(ag.KEY_LOAD_TIME, (Object) Long.valueOf(j));
                        Utils.postNotification(mspContextByBizId.getContext(), "MQP_WEBVIEW_FIRST_LOADED", jSONObject2, UCWebPresenter.a(UCWebPresenter.this));
                    }
                }
                if (UCWebPresenter.k(UCWebPresenter.this)) {
                    UCWebPresenter.c(UCWebPresenter.this).setVisibility(4);
                    UCWebPresenter.b(UCWebPresenter.this).showReFreshView(false);
                    return;
                }
                UCWebPresenter.c(UCWebPresenter.this).setVisibility(0);
                UCWebPresenter.b(UCWebPresenter.this).showReFreshView(true);
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
        }

        @Override // com.uc.webview.export.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("51deb74c", new Object[]{this, webView, new Integer(i), str, str2});
                return;
            }
            LogUtil.record(2, "UCWebPresenter:onReceivedError", "failingUrl=" + str2 + "， description=" + str);
            MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(UCWebPresenter.a(UCWebPresenter.this));
            UCWebPresenter.b(UCWebPresenter.this, true);
            if (mspContextByBizId != null) {
                StatisticInfo statisticInfo = mspContextByBizId.getStatisticInfo();
                statisticInfo.addError(ErrorType.DEFAULT, String.valueOf(NetErrorException.Channel.WEB) + "_" + i, str2);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("failingUrl", (Object) str2);
                jSONObject.put("description", (Object) str);
                AlertIntelligenceEngine.startAction(mspContextByBizId, AlertIntelligenceEngine.ACTION_WEB_EXCEPTION, NetErrorException.Channel.WEB + "_" + i, jSONObject.toJSONString(), null, null);
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("errorCode", (Object) Integer.valueOf(i));
                    jSONObject2.put("failingUrl", (Object) str2);
                    jSONObject2.put("description", (Object) str);
                    Utils.postNotification(mspContextByBizId.getContext(), "MQPWebErr", jSONObject2, UCWebPresenter.a(UCWebPresenter.this));
                } catch (Throwable th) {
                    LogUtil.printExceptionStackTrace(th);
                }
            }
            super.onReceivedError(webView, i, str, str2);
        }

        @Override // com.uc.webview.export.WebViewClient
        public void onReceivedSslError(WebView webView, final SslErrorHandler sslErrorHandler, SslError sslError) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4c02f82", new Object[]{this, webView, sslErrorHandler, sslError});
                return;
            }
            LogUtil.record(2, "UCWebPresenter:onReceivedSslError", String.valueOf(sslError));
            MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(UCWebPresenter.a(UCWebPresenter.this));
            TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.ui.web.presenters.UCWebPresenter.4.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Activity activity = UCWebPresenter.this.getActivity();
                    if (activity == null) {
                        return;
                    }
                    SystemDefaultDialog.showDialog(activity, LanguageHelper.localizedStringForKey("msp_ssl_error", activity.getString(R.string.msp_ssl_error), new Object[0]), LanguageHelper.localizedStringForKey("flybird_exit", activity.getString(R.string.flybird_exit), new Object[0]), new DialogInterface.OnClickListener() { // from class: com.alipay.android.msp.ui.web.presenters.UCWebPresenter.4.1.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                                return;
                            }
                            sslErrorHandler.cancel();
                            dialogInterface.dismiss();
                            UCWebPresenter.this.getActivity().finish();
                        }
                    }, "", (DialogInterface.OnClickListener) null);
                }
            });
            if (mspContextByBizId == null) {
                return;
            }
            StatisticInfo statisticInfo = mspContextByBizId.getStatisticInfo();
            statisticInfo.addError(ErrorType.NETWORK, NetErrorException.Channel.WEB + "_sslerr", String.valueOf(sslError));
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.e == null) {
        } else {
            if (Build.VERSION.SDK_INT < 19) {
                a("click", "webonback");
                this.e.loadUrl("javascript:alipayjsbridgeH5BackAction()");
                return;
            }
            this.e.evaluateJavascript("javascript:alipayjsbridgeH5BackAction()", new ValueCallback<String>() { // from class: com.alipay.android.msp.ui.web.presenters.UCWebPresenter.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.webkit.ValueCallback
                public void onReceiveValue(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("138ac29e", new Object[]{this, str});
                    } else if (!"true".equals(str)) {
                        if (UCWebPresenter.this.mo545getIView() == null || UCWebPresenter.this.getActivity() == null || UCWebPresenter.this.getActivity().isFinishing()) {
                            return;
                        }
                        if (UCWebPresenter.d(UCWebPresenter.this) != null && !UCWebPresenter.d(UCWebPresenter.this).isEmpty()) {
                            UCWebPresenter.e(UCWebPresenter.this);
                        } else if (UCWebPresenter.l(UCWebPresenter.this)) {
                            if (UCWebPresenter.this.getActivity() != null && !UCWebPresenter.this.getActivity().isFinishing()) {
                                UCWebPresenter.a(UCWebPresenter.this, "click", "webgoback");
                                UCWebPresenter.this.getActivity().finish();
                                return;
                            }
                            LogUtil.record(8, "UCWebPresenter:doJsOnBack", "unexpected point 2");
                        } else if (UCWebPresenter.c(UCWebPresenter.this) != null && UCWebPresenter.c(UCWebPresenter.this).canGoBack()) {
                            UCWebPresenter.a(UCWebPresenter.this, "click", "webgoback");
                            UCWebPresenter.c(UCWebPresenter.this).goBack();
                        } else {
                            UCWebPresenter.a(UCWebPresenter.this, "click", "webonexit");
                            UCWebPresenter.a(UCWebPresenter.this, false);
                        }
                    } else {
                        UCWebPresenter.a(UCWebPresenter.this, "click", "webonback");
                    }
                }
            });
        }
    }

    @Override // com.alipay.android.msp.ui.contracts.MspWebContract.IPresenter
    public void setWebViewUA() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4010052a", new Object[]{this});
            return;
        }
        String str = this.e.getSettings().getUserAgentString() + " AlipaySDK(" + getActivity().getPackageName() + "/" + GlobalHelper.getInstance().getPackageVersion() + "/" + GlobalSdkConstant.getMspVersion() + riy.BRACKET_END_STR;
        if (!str.contains("Language/")) {
            str = str + " Language/" + Utils.getLocaleDesByFlag(PhoneCashierMspEngine.getMspBase().getMspLocale(PhoneCashierMspEngine.getMspWallet().getAlipayLocaleDes()));
        }
        this.e.getSettings().setUserAgentString(str);
    }

    @Override // com.alipay.android.msp.ui.contracts.MspWebContract.IPresenter
    public void notifyCaller() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73e9dabb", new Object[]{this});
        } else if (this.d == null) {
        } else {
            this.d.send(0, H5PayResult.toBundle(this.l, this.m));
        }
    }

    @Override // com.alipay.android.msp.ui.contracts.MspWebContract.IPresenter
    public void onBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2372e0ed", new Object[]{this});
            return;
        }
        LogUtil.record(2, "UCwebPresenter:onBack", "mbizId=" + this.h + " ,webview=" + this.e);
        if (this.e == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 19) {
            this.e.loadUrl(this.n);
        } else {
            this.e.evaluateJavascript("javascript:window.AlipayJSBridge.hasListener('h5BackAction')", new ValueCallback<String>() { // from class: com.alipay.android.msp.ui.web.presenters.UCWebPresenter.8
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.webkit.ValueCallback
                public void onReceiveValue(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("138ac29e", new Object[]{this, str});
                    } else if (!"true".equals(str)) {
                        if (UCWebPresenter.c(UCWebPresenter.this) == null) {
                            return;
                        }
                        UCWebPresenter.m(UCWebPresenter.this);
                    } else if (UCWebPresenter.c(UCWebPresenter.this) == null) {
                    } else {
                        UCWebPresenter.a(UCWebPresenter.this, "click", "webonback");
                        UCWebPresenter.c(UCWebPresenter.this).evaluateJavascript(UCWebPresenter.n(UCWebPresenter.this), null);
                    }
                }
            });
        }
    }

    @Override // com.alipay.android.msp.ui.presenters.MspBasePresenter, com.alipay.android.msp.ui.contracts.MspBaseContract.IPresenter
    public int getBizId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("14dc0c52", new Object[]{this})).intValue() : this.h;
    }

    @Override // com.alipay.android.msp.ui.contracts.MspWebContract.IPresenter
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        LogUtil.record(2, "UCWebview:onDestroy", "webview=" + this.e);
        WebView webView = this.e;
        if (webView != null) {
            webView.setDownloadListener(null);
            this.e.removeAllViews();
            if (this.e.getParent() != null) {
                ((ViewGroup) this.e.getParent()).removeView(this.e);
            }
            this.e.destroy();
            this.e = null;
        }
        WebViewWindowStack webViewWindowStack = this.c;
        if (webViewWindowStack != null && !webViewWindowStack.isEmpty()) {
            this.c.destroy();
            this.c = null;
        }
        if (this.k) {
            notifyCaller();
        }
        this.s.clear();
    }

    @Override // com.alipay.android.msp.ui.contracts.MspWebContract.IPresenter
    public void pushWebviewWindow(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e3d476a", new Object[]{this, str, str2});
        } else {
            b(str, str2);
        }
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.l = z;
        getActivity().finish();
    }

    private void b(final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
            return;
        }
        try {
            final UCWebViewWindow uCWebViewWindow = new UCWebViewWindow(getActivity());
            uCWebViewWindow.init(this.k, "", this.r);
            if (this.c == null) {
                this.c = new WebViewWindowStack();
            }
            this.c.pushJsWebViewWindow(this.b);
            Animation loadAnimation = AnimationUtils.loadAnimation(getActivity(), R.anim.alipay_right_in);
            loadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.alipay.android.msp.ui.web.presenters.UCWebPresenter.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8f2883e7", new Object[]{this, animation});
                    }
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f2d146c4", new Object[]{this, animation});
                    }
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("724c33d", new Object[]{this, animation});
                        return;
                    }
                    if (UCWebPresenter.this.mo545getIView() != null) {
                        UCWebPresenter.this.mo545getIView().removeViewFromMainLayout(UCWebPresenter.b(UCWebPresenter.this));
                    }
                    UCWebPresenter.a(UCWebPresenter.this, uCWebViewWindow);
                    UCWebPresenter.o(UCWebPresenter.this);
                    LogUtil.record(2, "UCWebPresenter:doJsPushWindow", "newurl=" + str);
                    if (!TextUtils.isEmpty(str)) {
                        MspWebActivity.WebStatsEvent webStatsEvent = new MspWebActivity.WebStatsEvent();
                        webStatsEvent.stEvent = UCWebPresenter.newStEvent("webonload", UCWebPresenter.b(UCWebPresenter.this, str));
                        UCWebPresenter.h(UCWebPresenter.this).put(str, webStatsEvent);
                    }
                    UCWebPresenter.c(UCWebPresenter.this).loadUrl(str);
                    if (TextUtils.isEmpty(str2) || UCWebPresenter.this.mo545getIView() == null) {
                        return;
                    }
                    UCWebPresenter.this.mo545getIView().setTitleText(str2);
                }
            });
            uCWebViewWindow.setAnimation(loadAnimation);
            if (mo545getIView() == null) {
                return;
            }
            mo545getIView().addViewToMainLayout(uCWebViewWindow);
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }

    public static StEvent newStEvent(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (StEvent) ipChange.ipc$dispatch("12c27a75", new Object[]{str, str2}) : new StEvent("webview", str, Utils.truncateString(str2, 30));
    }

    private void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            addStEventForBizId(this.h, str, str2);
        }
    }

    public static void addStEventForBizId(int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44f2ebd3", new Object[]{new Integer(i), str, str2});
            return;
        }
        MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(i);
        if (i == -1 || mspContextByBizId == null) {
            return;
        }
        mspContextByBizId.getStatisticInfo().addEvent(newStEvent(str, str2));
    }

    private static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String substring = str.length() > 20 ? str.substring(0, 19) : str;
        try {
            Uri parse = Uri.parse(str);
            return parse != null ? parse.getPath() : substring;
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
            return substring;
        }
    }

    public static /* synthetic */ void e(UCWebPresenter uCWebPresenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdca02c9", new Object[]{uCWebPresenter});
        } else if (uCWebPresenter.c == null) {
        } else {
            LogUtil.record(2, "UCwebPresenter:doJsPopWindow", "mbizId=" + uCWebPresenter.h + " ,webview=" + uCWebPresenter.e);
            UCWebViewWindow uCWebViewWindow = (UCWebViewWindow) uCWebPresenter.c.popJsWebViewWindow();
            uCWebPresenter.b.setAnimation(AnimationUtils.loadAnimation(uCWebPresenter.getActivity(), R.anim.alipay_right_out));
            if (uCWebPresenter.mo545getIView() != null) {
                uCWebPresenter.mo545getIView().removeViewFromMainLayout(uCWebPresenter.b);
            }
            uCWebPresenter.b.destroy();
            if (uCWebPresenter.mo545getIView() != null) {
                uCWebPresenter.mo545getIView().addViewToMainLayout(uCWebViewWindow);
            }
            uCWebPresenter.b = uCWebViewWindow;
            uCWebPresenter.b();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x016f, code lost:
        if (r0.equals("back") != false) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void a(com.alipay.android.msp.ui.web.presenters.UCWebPresenter r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 648
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.ui.web.presenters.UCWebPresenter.a(com.alipay.android.msp.ui.web.presenters.UCWebPresenter, java.lang.String):void");
    }

    public static /* synthetic */ void a(UCWebPresenter uCWebPresenter, final String str, final ValueCallback valueCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("361dea5d", new Object[]{uCWebPresenter, str, valueCallback});
        } else if (TextUtils.isEmpty(str) || uCWebPresenter.getActivity() == null || uCWebPresenter.getActivity().isFinishing()) {
        } else {
            TaskHelper.runOnUIThread(new Runnable() { // from class: com.alipay.android.msp.ui.web.presenters.UCWebPresenter.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        if (UCWebPresenter.c(UCWebPresenter.this) == null) {
                            return;
                        }
                        if (Build.VERSION.SDK_INT < 19) {
                            UCWebPresenter.c(UCWebPresenter.this).loadUrl(str);
                        } else {
                            UCWebPresenter.c(UCWebPresenter.this).evaluateJavascript(str, valueCallback);
                        }
                    } catch (Throwable th) {
                        MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(UCWebPresenter.a(UCWebPresenter.this));
                        if (mspContextByBizId == null) {
                            return;
                        }
                        mspContextByBizId.getStatisticInfo().addError(ErrorType.DEFAULT, ErrorCode.MSP_WEB_JS_ERROR, th.getClass().getSimpleName());
                    }
                }
            });
        }
    }
}
