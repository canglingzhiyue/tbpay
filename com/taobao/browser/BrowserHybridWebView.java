package com.taobao.browser;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.support.v4.content.LocalBroadcastManager;
import android.taobao.util.k;
import android.taobao.windvane.config.j;
import android.taobao.windvane.config.n;
import android.taobao.windvane.extra.core.WVCore;
import android.taobao.windvane.extra.performance2.WVFSPManager;
import android.taobao.windvane.extra.uc.WVUCWebChromeClient;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.extra.uc.preRender.PreRenderWebView;
import android.taobao.windvane.jsbridge.l;
import android.taobao.windvane.util.m;
import mtopsdk.common.util.StringUtils;
import android.util.AttributeSet;
import android.webkit.ValueCallback;
import anet.channel.util.HttpConstant;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.nn.NetConfig;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.browser.urlFilter.UrlFilter;
import com.taobao.browser.urlFilter.UrlResourceFilter;
import com.taobao.browser.utils.BrowserUtil;
import com.taobao.browser.view.BrowserUIModel;
import com.taobao.orange.OrangeConfig;
import com.taobao.pha.core.p;
import com.taobao.statistic.TBS;
import com.taobao.tao.TaoPackageInfo;
import com.taobao.tao.log.TLog;
import com.taobao.tao.util.Constants;
import com.taobao.tao.util.SystemUtils;
import com.taobao.tao.util.TaoHelper;
import com.taobao.taobao.R;
import com.uc.webview.export.WebBackForwardList;
import com.uc.webview.export.WebChromeClient;
import com.uc.webview.export.WebResourceResponse;
import com.uc.webview.export.WebSettings;
import com.uc.webview.export.WebView;
import com.uc.webview.export.extension.UCExtension;
import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import tb.keu;
import tb.kez;
import tb.kfc;
import tb.kge;
import tb.qgo;
import tb.riy;

/* loaded from: classes6.dex */
public class BrowserHybridWebView extends PreRenderWebView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "BrowserHybridWebView";
    private String allowOpenClient;
    public boolean allowThirdMiddlePageJump;
    public c client;
    public Map<String, Object> coreMultiType;
    private String data2H5;
    public UrlFilter filter;
    private boolean isProgessLoaded;
    @Deprecated
    private int jaeState;
    public BrowserUIModel mBrowserUIModel;
    private Handler mOutHandler;
    public int mPageLoadCount;
    private String mUTPageName;
    public Map<String, String> mUTParamMap;
    public ValueCallback<Uri> mUploadMsg;
    public ValueCallback<Uri[]> mUploadMsgAboveL;
    public Uri mUploadUriAboveL;
    public boolean needNotiSafe;
    private String thirdMiddleJumpRegex;
    private int webviewMode;

    static {
        kge.a(-2082483057);
    }

    public static /* synthetic */ Object ipc$super(BrowserHybridWebView browserHybridWebView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1988789126:
                super.loadUrl((String) objArr[0]);
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case -610146718:
                super.coreDestroy();
                return null;
            case 673877021:
                return new Boolean(super.handleMessage((Message) objArr[0]));
            case 797441118:
                super.onPause();
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 2119745010:
                return new Boolean(super.back());
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ void access$000(BrowserHybridWebView browserHybridWebView, ValueCallback valueCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1da9f4c1", new Object[]{browserHybridWebView, valueCallback});
        } else {
            browserHybridWebView.setUploadMsg(valueCallback);
        }
    }

    public static /* synthetic */ boolean access$300(BrowserHybridWebView browserHybridWebView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("461d4bdc", new Object[]{browserHybridWebView})).booleanValue() : browserHybridWebView.isProgessLoaded;
    }

    public static /* synthetic */ boolean access$302(BrowserHybridWebView browserHybridWebView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("68812e82", new Object[]{browserHybridWebView, new Boolean(z)})).booleanValue();
        }
        browserHybridWebView.isProgessLoaded = z;
        return z;
    }

    public static /* synthetic */ Handler access$400(BrowserHybridWebView browserHybridWebView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("fdb2dfaf", new Object[]{browserHybridWebView}) : browserHybridWebView.mOutHandler;
    }

    @Deprecated
    public BrowserHybridWebView(Context context, boolean z) {
        super(context);
        this.jaeState = 2;
        this.webviewMode = -2;
        this.data2H5 = null;
        this.needNotiSafe = true;
        this.allowThirdMiddlePageJump = false;
        this.mPageLoadCount = 0;
        this.thirdMiddleJumpRegex = "";
        this.allowOpenClient = "0";
        this.coreMultiType = new HashMap();
        this.client = null;
        if (j.commonConfig.ac) {
            setUrlConfigSwitch(true);
        }
    }

    public BrowserHybridWebView(Context context, Map<String, String> map) {
        super(context, map);
        this.jaeState = 2;
        this.webviewMode = -2;
        this.data2H5 = null;
        this.needNotiSafe = true;
        this.allowThirdMiddlePageJump = false;
        this.mPageLoadCount = 0;
        this.thirdMiddleJumpRegex = "";
        this.allowOpenClient = "0";
        this.coreMultiType = new HashMap();
        this.client = null;
        if (j.commonConfig.ac) {
            setUrlConfigSwitch(true);
        }
        init();
    }

    public BrowserHybridWebView(Context context) {
        super(context);
        this.jaeState = 2;
        this.webviewMode = -2;
        this.data2H5 = null;
        this.needNotiSafe = true;
        this.allowThirdMiddlePageJump = false;
        this.mPageLoadCount = 0;
        this.thirdMiddleJumpRegex = "";
        this.allowOpenClient = "0";
        this.coreMultiType = new HashMap();
        this.client = null;
        if (j.commonConfig.ac) {
            setUrlConfigSwitch(true);
        }
        init();
    }

    public BrowserHybridWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.jaeState = 2;
        this.webviewMode = -2;
        this.data2H5 = null;
        this.needNotiSafe = true;
        this.allowThirdMiddlePageJump = false;
        this.mPageLoadCount = 0;
        this.thirdMiddleJumpRegex = "";
        this.allowOpenClient = "0";
        this.coreMultiType = new HashMap();
        this.client = null;
        if (j.commonConfig.ac) {
            setUrlConfigSwitch(true);
        }
        init();
    }

    public BrowserHybridWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.jaeState = 2;
        this.webviewMode = -2;
        this.data2H5 = null;
        this.needNotiSafe = true;
        this.allowThirdMiddlePageJump = false;
        this.mPageLoadCount = 0;
        this.thirdMiddleJumpRegex = "";
        this.allowOpenClient = "0";
        this.coreMultiType = new HashMap();
        this.client = null;
        if (j.commonConfig.ac) {
            setUrlConfigSwitch(true);
        }
        init();
    }

    public BrowserHybridWebView(WVUCWebView.Builder builder) {
        super(builder);
        this.jaeState = 2;
        this.webviewMode = -2;
        this.data2H5 = null;
        this.needNotiSafe = true;
        this.allowThirdMiddlePageJump = false;
        this.mPageLoadCount = 0;
        this.thirdMiddleJumpRegex = "";
        this.allowOpenClient = "0";
        this.coreMultiType = new HashMap();
        this.client = null;
        if (j.commonConfig.ac) {
            setUrlConfigSwitch(true);
        }
        init();
    }

    public void setOutHandler(Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cba8255", new Object[]{this, handler});
        } else {
            this.mOutHandler = handler;
        }
    }

    public Handler getOutHandler() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("a8b37e8d", new Object[]{this}) : this.mOutHandler;
    }

    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        setImportantForAccessibility(2);
        this.mBrowserUIModel = new BrowserUIModel(_getContext(), this);
        setWvUIModel(this.mBrowserUIModel);
        WebSettings settings = getSettings();
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setBuiltInZoomControls(true);
        settings.setSupportZoom(true);
        if (Build.VERSION.SDK_INT < 18) {
            settings.setSavePassword(false);
        }
        String format = String.format(" %dX%d", Integer.valueOf(SystemUtils.getScreenWidth(_getContext())), Integer.valueOf(SystemUtils.getScreenHeight(_getContext())));
        settings.setUserAgentString(settings.getUserAgentString() + format);
        settings.setNeedInitialFocus(true);
        setVerticalScrollbarOverlay(true);
        setOverScrollMode(2);
        setWebChromeClient(new a(_getContext()) { // from class: com.taobao.browser.BrowserHybridWebView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                if (str.hashCode() == 2060440615) {
                    return new Boolean(super.onShowFileChooser((WebView) objArr[0], (ValueCallback) objArr[1], (WebChromeClient.FileChooserParams) objArr[2]));
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            public static /* synthetic */ Context a(AnonymousClass1 anonymousClass1) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (Context) ipChange2.ipc$dispatch("a384f035", new Object[]{anonymousClass1}) : anonymousClass1.mContext;
            }

            public static /* synthetic */ Context b(AnonymousClass1 anonymousClass1) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (Context) ipChange2.ipc$dispatch("25cfa514", new Object[]{anonymousClass1}) : anonymousClass1.mContext;
            }

            public void a(ValueCallback<Uri> valueCallback, String str, String str2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8381e442", new Object[]{this, valueCallback, str, str2});
                    return;
                }
                Context _getContext = BrowserHybridWebView.this._getContext();
                if (_getContext == null || !(_getContext instanceof Activity)) {
                    return;
                }
                BrowserHybridWebView.access$000(BrowserHybridWebView.this, valueCallback);
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.addCategory("android.intent.category.OPENABLE");
                intent.setType("image/*");
                ((Activity) _getContext).startActivityForResult(Intent.createChooser(intent, _getContext.getString(R.string.browser_webview_file_chooser_title)), Constants.FILECHOOSER_REQ_CODE);
            }

            @Override // android.taobao.windvane.extra.uc.WVUCWebChromeClient, com.uc.webview.export.WebChromeClient
            public void openFileChooser(ValueCallback<Uri> valueCallback) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9f178442", new Object[]{this, valueCallback});
                } else {
                    a(valueCallback, null, null);
                }
            }

            @Override // android.taobao.windvane.extra.uc.WVUCWebChromeClient, com.uc.webview.export.WebChromeClient
            public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("7acfd427", new Object[]{this, webView, valueCallback, fileChooserParams})).booleanValue();
                }
                if (!com.taobao.browser.config.a.commonConfig.t) {
                    return super.onShowFileChooser(webView, valueCallback, fileChooserParams);
                }
                String arrays = Arrays.toString(fileChooserParams.getAcceptTypes());
                com.taobao.android.riverlogger.e.a(RVLLevel.Info, "onShowFileChooser", "AcceptTypes:" + arrays + ", Mode:" + fileChooserParams.getMode() + ", Hint:" + fileChooserParams.getFilenameHint());
                BrowserHybridWebView browserHybridWebView = BrowserHybridWebView.this;
                browserHybridWebView.mUploadMsgAboveL = valueCallback;
                final Context _getContext = browserHybridWebView._getContext();
                if (_getContext != null && (_getContext instanceof Activity)) {
                    try {
                        final String a2 = android.taobao.windvane.cache.a.a().a(true);
                        if (a2 == null) {
                            return true;
                        }
                        File file = new File(a2);
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        final boolean contains = arrays.contains("image/");
                        final boolean contains2 = arrays.contains("video/");
                        if (fileChooserParams.isCaptureEnabled() && (contains || contains2)) {
                            android.taobao.windvane.runtimepermission.b.a(_getContext, new String[]{com.taobao.speech.util.e.CAMERA}).a(new Runnable() { // from class: com.taobao.browser.BrowserHybridWebView.1.2
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    } else if (contains) {
                                        BrowserHybridWebView.this.mUploadUriAboveL = android.taobao.windvane.file.c.a(AnonymousClass1.a(AnonymousClass1.this), new File(a2 + File.separator + "IMAGE_" + System.currentTimeMillis() + ".jpg"));
                                        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                                        if (Build.VERSION.SDK_INT >= 24) {
                                            intent.addFlags(1);
                                        }
                                        intent.putExtra(NetConfig.OUPUT_KEY, BrowserHybridWebView.this.mUploadUriAboveL);
                                        ((Activity) _getContext).startActivityForResult(intent, Constants.FILECHOOSER_REQ_CODE);
                                    } else if (!contains2) {
                                    } else {
                                        BrowserHybridWebView.this.mUploadUriAboveL = android.taobao.windvane.file.c.a(AnonymousClass1.b(AnonymousClass1.this), new File(a2 + File.separator + "VIDEO_" + System.currentTimeMillis() + keu.SUFFIX_MP4));
                                        Intent intent2 = new Intent("android.media.action.VIDEO_CAPTURE");
                                        if (Build.VERSION.SDK_INT >= 24) {
                                            intent2.addFlags(1);
                                        }
                                        intent2.putExtra(NetConfig.OUPUT_KEY, BrowserHybridWebView.this.mUploadUriAboveL);
                                        ((Activity) _getContext).startActivityForResult(intent2, Constants.FILECHOOSER_REQ_CODE);
                                    }
                                }
                            }).b(new Runnable() { // from class: com.taobao.browser.BrowserHybridWebView.1.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    } else {
                                        kfc.b(BrowserHybridWebView.TAG, "Permission Denied");
                                    }
                                }
                            }).b();
                        } else {
                            return super.onShowFileChooser(webView, valueCallback, fileChooserParams);
                        }
                    } catch (Throwable th) {
                        k.a(BrowserHybridWebView.TAG, th.getMessage());
                    }
                }
                return true;
            }
        });
        UCExtension uCExtension = getUCExtension();
        if (uCExtension != null) {
            uCExtension.setClient(new i(this));
        }
        String userAgentString = getUserAgentString();
        setUserAgentString(userAgentString + " " + com.alibaba.ut.e.USER_AGENT);
        setFspCallback(new WVFSPManager.FSPCallback() { // from class: com.taobao.browser.BrowserHybridWebView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.taobao.windvane.extra.performance2.WVFSPManager.FSPCallback
            public void onFSPBack(long j) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e7555412", new Object[]{this, new Long(j)});
                    return;
                }
                com.taobao.browser.prefetch.a.a().c(j);
                com.taobao.browser.prefetch.a.a().b();
            }
        });
        if (!getSettings().getUserAgentString().contains(" AliApp(")) {
            WebSettings settings2 = getSettings();
            settings2.setUserAgentString(getSettings().getUserAgentString() + " AliApp(TB/" + TaoPackageInfo.getVersion() + riy.BRACKET_END_STR);
        }
        if (com.taobao.browser.config.a.commonConfig.q && p.b() != null && p.b().x() != null) {
            String c = p.b().x().c();
            if (!StringUtils.isEmpty(c)) {
                evaluateJavascript(c);
                injectJsEarly(c);
            }
            String i = p.b().x().i();
            if (p.b().x().h() && !StringUtils.isEmpty(i)) {
                injectJsEarly(i);
            }
        }
        if (ABGlobal.isFeatureOpened(this.context, "wvInjectMetricScript")) {
            return;
        }
        String a2 = qgo.a();
        if (StringUtils.isEmpty(a2)) {
            return;
        }
        injectJsEarly(a2);
    }

    private void setUploadMsg(ValueCallback<Uri> valueCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("621dae0b", new Object[]{this, valueCallback});
        } else {
            this.mUploadMsg = valueCallback;
        }
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebView
    public void onActivityResult(int i, int i2, Intent intent) {
        Uri uri;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (i != 2688) {
            if (i != 7000 || intent == null) {
                return;
            }
            try {
                setDataOnActive(intent.getStringExtra("data"));
                return;
            } catch (Exception e) {
                k.a(TAG, e.getMessage());
                return;
            }
        }
        ValueCallback<Uri[]> valueCallback = this.mUploadMsgAboveL;
        if (valueCallback != null) {
            if (i2 != -1 || (uri = this.mUploadUriAboveL) == null) {
                this.mUploadMsgAboveL.onReceiveValue(null);
            } else {
                valueCallback.onReceiveValue(new Uri[]{uri});
            }
            this.mUploadMsgAboveL = null;
            this.mUploadUriAboveL = null;
        } else if (this.mUploadMsg == null) {
        } else {
            this.mUploadMsg.onReceiveValue((intent == null || i2 != -1) ? null : intent.getData());
            this.mUploadMsg = null;
        }
    }

    public int getPageLoadCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1dc968be", new Object[]{this})).intValue() : this.mPageLoadCount;
    }

    public void setWebviewMode(String str, android.taobao.windvane.webview.g gVar) {
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("254ed369", new Object[]{this, str, gVar});
            return;
        }
        if (android.taobao.windvane.config.p.a(str, gVar)) {
            i = 0;
        } else if (e.a(str)) {
            BrowserUtil.a(TAG, "setWebviewMode", "isJaeUrl", null, null);
        } else if (android.taobao.windvane.config.p.b(str, gVar)) {
            BrowserUtil.a(TAG, "setWebviewMode", "isThirdPartyUrl", null, null);
            i = 2;
        } else {
            BrowserUtil.a(TAG, "setWebviewMode", "isUnsafeUrl", null, null);
            i = -1;
        }
        if (i != this.webviewMode) {
            setWebviewMode(i, str);
        }
        if (k.a()) {
            String str2 = "set webview mode " + i + " url: " + str;
        }
        if (i != 2) {
            return;
        }
        android.taobao.windvane.monitor.a.commitFail("SecurityBlock", 4, "setWebviewMode third", str);
    }

    private void setWebviewMode(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c02e416c", new Object[]{this, new Integer(i), str});
            return;
        }
        this.webviewMode = i;
        l.b().a(true);
        switchResourceControl(false);
        setSupportDownload(true);
        if (i == -1) {
            l.b().a(false);
            setSupportDownload(false);
        } else if (i == 1) {
            switchResourceControl(true);
        } else if (i != 2) {
        } else {
            l.b().a(false);
            if (android.taobao.windvane.config.p.g(str)) {
                setSupportDownload(true);
            } else {
                setSupportDownload(false);
            }
        }
    }

    public int getWebviewMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("dd599d80", new Object[]{this})).intValue() : this.webviewMode;
    }

    @Deprecated
    private void switchResourceControl(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("375ae872", new Object[]{this, new Boolean(z)});
            return;
        }
        c cVar = null;
        if (this.webViewClient instanceof c) {
            cVar = (c) this.webViewClient;
        }
        if (cVar == null) {
            return;
        }
        cVar.a(z);
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebView, android.taobao.windvane.webview.IWVWebView
    public boolean back() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e58bdf2", new Object[]{this})).booleanValue();
        }
        if (!nativeBack()) {
            Message obtain = Message.obtain();
            obtain.what = 1102;
            UrlFilter urlFilter = this.filter;
            if (urlFilter != null) {
                urlFilter.notifyParent(obtain);
            }
        }
        return true;
    }

    public void setSafeFormatData(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2089207d", new Object[]{this, new Boolean(z)});
        } else {
            getSettings().setSaveFormData(z);
        }
    }

    private boolean nativeBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("964b6b29", new Object[]{this})).booleanValue();
        }
        if (canGoBack()) {
            WebBackForwardList copyBackForwardList = copyBackForwardList();
            if (copyBackForwardList.getCurrentIndex() > 0 && copyBackForwardList.getItemAtIndex(copyBackForwardList.getCurrentIndex() - 1).getUrl() != null) {
                super.back();
                return true;
            }
        }
        return false;
    }

    public void setFilter(UrlFilter urlFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a57b6ab", new Object[]{this, urlFilter});
            return;
        }
        this.filter = urlFilter;
        this.client = new c(_getContext(), urlFilter);
        this.client.a(new UrlResourceFilter() { // from class: com.taobao.browser.BrowserHybridWebView.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.browser.urlFilter.UrlResourceFilter
            public WebResourceResponse doFilter(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (WebResourceResponse) ipChange2.ipc$dispatch("baf08034", new Object[]{this, str});
                }
                return null;
            }

            @Override // com.taobao.browser.urlFilter.UrlResourceFilter
            public boolean match(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("705b429a", new Object[]{this, str})).booleanValue();
                }
                return false;
            }
        });
        setWebViewClient(this.client);
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebView, com.uc.webview.export.WebView, android.taobao.windvane.webview.IWVWebView
    public void loadUrl(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89757c7a", new Object[]{this, str});
            return;
        }
        kez.a();
        final Context _getContext = _getContext();
        long currentTimeMillis = System.currentTimeMillis();
        this.allowOpenClient = OrangeConfig.getInstance().getConfig("WindVane", com.taobao.browser.utils.i.TB_ALLOW_OPEN_CLIENT, "0");
        this.thirdMiddleJumpRegex = OrangeConfig.getInstance().getConfig("WindVane", com.taobao.browser.utils.i.TB_THIRD_MIDDLE_JUMP_REGEX, "");
        TBS.setH5Url(str);
        if (str == null) {
            k.a(TAG, "Error  load  url is null");
            return;
        }
        if (TaoHelper.isSpecialManuFacturer("xiaomi") || TaoHelper.isSpecialManuFacturer("meizu") || TaoHelper.isSpecialManuFacturer("lenovo")) {
            int indexOf = str.indexOf(35);
            if ((indexOf > 0 ? str.substring(0, indexOf) : str).equals(getUrl())) {
                reload();
                return;
            }
        }
        if (str.startsWith("taobao://")) {
            str = str.replace("taobao://", com.taobao.search.common.util.k.HTTP_PREFIX);
        }
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        String host = parse.getHost();
        if (!isPreRender() && (("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) && host != null)) {
            if (com.taobao.browser.utils.k.b(this.thirdMiddleJumpRegex, str)) {
                this.allowThirdMiddlePageJump = true;
                this.needNotiSafe = false;
            }
            if (android.taobao.windvane.util.e.b() && isIPAddress(host)) {
                TLog.logd(TAG, "is debug: " + android.taobao.windvane.util.e.b());
                super.loadUrl(addTTID(str));
                return;
            } else if (!j.commonConfig.ac && android.taobao.windvane.config.p.c(str, this)) {
                String b = n.a().b();
                if (StringUtils.isEmpty(b)) {
                    onMessage(402, str);
                } else {
                    try {
                        super.loadUrl(b);
                    } catch (Exception e) {
                        m.e(TAG, e.getMessage());
                    }
                }
                kfc.a("exchain.FullTrace", "BrowserActivity.loadUrl cost time: " + (System.currentTimeMillis() - currentTimeMillis));
                android.taobao.windvane.monitor.a.commitFail("SecurityBlock", 2, "loadUrl Black", str);
                return;
            } else {
                this.jaeState = BrowserUtil.a(this, str);
                if (this.jaeState == 0 && k.a()) {
                    String str2 = "jae self url: " + str;
                }
                if (!j.commonConfig.ac && isUnSafeUrl(str) && "1".equals(this.allowOpenClient) && !this.allowThirdMiddlePageJump) {
                    if (!(_getContext instanceof Activity)) {
                        return;
                    }
                    Intent intent = new Intent("NON_WHITELIST_URL_VISIT");
                    intent.putExtra("url", str);
                    intent.putExtra("whitelistAvailable", !StringUtils.isEmpty(android.taobao.windvane.config.p.e) ? 1 : 0);
                    intent.putExtra("from", "windvane");
                    if (_getContext() != null) {
                        LocalBroadcastManager.getInstance(_getContext().getApplicationContext()).sendBroadcast(intent);
                    }
                    new AlertDialog.Builder(_getContext).setTitle(R.string.browser_warning).setMessage(_getContext.getString(R.string.browser_tips) + scheme + HttpConstant.SCHEME_SPLIT + host).setPositiveButton(R.string.browser_open_url, new DialogInterface.OnClickListener() { // from class: com.taobao.browser.BrowserHybridWebView.5
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                                return;
                            }
                            try {
                                _getContext.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                                if (BrowserHybridWebView.this.mPageLoadCount > 0) {
                                    return;
                                }
                                BrowserHybridWebView.this.back();
                            } catch (Throwable unused) {
                            }
                        }
                    }).setNegativeButton(R.string.browser_cancel, new DialogInterface.OnClickListener() { // from class: com.taobao.browser.BrowserHybridWebView.4
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(DialogInterface dialogInterface, int i) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                            } else if (BrowserHybridWebView.this.mPageLoadCount > 0) {
                                BrowserHybridWebView.this.refresh();
                            } else {
                                BrowserHybridWebView.this.back();
                            }
                        }
                    }).setCancelable(false).create().show();
                    StringBuilder sb = new StringBuilder();
                    sb.append("BrowserActivity.loadUrl cost time: ");
                    sb.append(System.currentTimeMillis() - currentTimeMillis);
                    kfc.a("exchain.FullTrace", sb.toString());
                    android.taobao.windvane.monitor.a.commitFail("SecurityBlock", 1, "loadUrl block", str);
                    return;
                }
                kfc.a("exchain.FullTrace", "BrowserActivity.loadUrl.before cost time: " + (System.currentTimeMillis() - currentTimeMillis) + " url=" + str);
                long currentTimeMillis2 = System.currentTimeMillis();
                super.loadUrl(addTTID(str));
                commitLoadUrl(str);
                kfc.a("exchain.FullTrace", "BrowserActivity.loadUrl cost time: " + (System.currentTimeMillis() - currentTimeMillis2));
            }
        } else {
            super.loadUrl(addTTID(str));
            commitLoadUrl(str);
            kfc.a("exchain.FullTrace", "BrowserActivity.loadUrl cost time: " + (System.currentTimeMillis() - currentTimeMillis));
        }
        kez.a();
    }

    private void commitLoadUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("192f4283", new Object[]{this, str});
            return;
        }
        try {
            AppMonitor.Counter.commit(com.taobao.browser.utils.i.KEY_MONITOR_MODULE, "LoadUrl", str, 1.0d);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Deprecated
    public static String addTTID(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd5adef3", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        Uri parse = Uri.parse(str);
        String host = parse.getHost();
        String scheme = parse.getScheme();
        if (host == null) {
            return str;
        }
        if (!host.endsWith("m.taobao.com") && !host.endsWith("wapa.taobao.com") && !host.endsWith("waptest.taobao.com")) {
            return str;
        }
        if ((!"http".equals(scheme) && !"https".equals(scheme)) || parse.getQueryParameter("ttid") != null) {
            return str;
        }
        Uri.Builder buildUpon = parse.buildUpon();
        buildUpon.appendQueryParameter("ttid", android.taobao.windvane.config.a.a().b());
        return buildUpon.toString();
    }

    /* loaded from: classes6.dex */
    public class a extends WVUCWebChromeClient {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(269597670);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -2015964955) {
                super.onReceivedTitle((WebView) objArr[0], (String) objArr[1]);
                return null;
            } else if (hashCode != -1540056808) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            } else {
                super.onProgressChanged((WebView) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            }
        }

        public a(Context context) {
            super(context);
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebChromeClient, com.uc.webview.export.WebChromeClient
        public void onProgressChanged(WebView webView, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4349918", new Object[]{this, webView, new Integer(i)});
                return;
            }
            if (i == 100) {
                if (webView.getUCExtension() == null) {
                    BrowserActivity.hideLoadingDialog();
                }
                BrowserHybridWebView.this.ObtainRenderType();
            }
            if (i >= 70 && !BrowserHybridWebView.access$300(BrowserHybridWebView.this)) {
                if (BrowserHybridWebView.this.filter != null) {
                    Message obtain = Message.obtain();
                    obtain.what = 1103;
                    BrowserHybridWebView.this.filter.notifyParent(obtain);
                    BrowserHybridWebView.access$302(BrowserHybridWebView.this, true);
                }
            } else {
                BrowserHybridWebView.access$302(BrowserHybridWebView.this, false);
            }
            if (BrowserHybridWebView.this.filter != null) {
                Message obtain2 = Message.obtain();
                obtain2.what = com.taobao.browser.utils.i.WEBVIEW_PROGRESS_CHANGE;
                obtain2.arg1 = i;
                BrowserHybridWebView.this.filter.notifyParent(obtain2);
            }
            super.onProgressChanged(webView, i);
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebChromeClient, com.uc.webview.export.WebChromeClient
        public void onReceivedTitle(WebView webView, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("87d6d0e5", new Object[]{this, webView, str});
                return;
            }
            super.onReceivedTitle(webView, str);
            if (BrowserHybridWebView.access$400(BrowserHybridWebView.this) == null) {
                return;
            }
            if (com.taobao.browser.utils.i.e != null) {
                str = com.taobao.browser.utils.i.e;
            } else {
                String title = webView.getTitle();
                if (title != null && !StringUtils.isEmpty(title) && !title.equals("0")) {
                    str = title;
                }
            }
            if (android.taobao.windvane.util.p.b(str)) {
                return;
            }
            Message obtain = Message.obtain();
            obtain.obj = str;
            obtain.what = 1104;
            BrowserHybridWebView.access$400(BrowserHybridWebView.this).sendMessage(obtain);
        }
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebView
    public void onLowMemory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bbd23dd", new Object[]{this});
        } else if (Build.VERSION.SDK_INT < 7 || Build.VERSION.SDK_INT >= 19) {
        } else {
            TBS.Ext.commitEvent("Page_Webview", Constants.EventID_VIP_EVENT, "onLowMemory", getUrl());
            try {
                onLowMemory();
            } catch (Throwable unused) {
            }
        }
    }

    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        String str = "Activity call pause " + toString();
        l.b().a(true);
        super.onPause();
    }

    public void resume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
            return;
        }
        String str = "Activity call resume " + toString();
        try {
            setWebviewMode(this.webviewMode, getUrl());
        } catch (Exception unused) {
        }
        super.onResume();
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebView, com.uc.webview.export.WebView, com.uc.webview.internal.interfaces.IWebViewOverride
    public void coreDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dba1e662", new Object[]{this});
            return;
        }
        this.mPageLoadCount = 0;
        kez.a();
        super.coreDestroy();
    }

    public void setData2H5(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85413844", new Object[]{this, str});
        } else {
            this.data2H5 = str;
        }
    }

    public String getData2H5() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a93bcbda", new Object[]{this}) : this.data2H5;
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebView, android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        if (message.what == 402) {
            if (message.obj != null && (message.obj instanceof Map)) {
                Map map = (Map) message.obj;
                android.taobao.windvane.webview.m wvUIModel = getWvUIModel();
                if ((wvUIModel instanceof BrowserUIModel) && map.containsKey("cause")) {
                    ((BrowserUIModel) wvUIModel).loadErrorPage((String) map.get("cause"));
                    setOnErrorTime(System.currentTimeMillis());
                    if (wvUIModel.isShowLoading()) {
                        wvUIModel.hideLoadingView();
                    }
                    return true;
                }
            }
        } else if (message.what == 400) {
            this.mPageLoadCount++;
        }
        return super.handleMessage(message);
    }

    private boolean isUnSafeUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7c4d7514", new Object[]{this, str})).booleanValue();
        }
        setWebviewMode(str, this);
        return getWebviewMode() == -1;
    }

    private boolean isIPAddress(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("43c5a138", new Object[]{this, str})).booleanValue() : Pattern.matches("^(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|[1-9])\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\.(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)$", str);
    }

    public void ObtainRenderType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2710329c", new Object[]{this});
        } else if (getUCExtension() == null) {
        } else {
            getUCExtension().getCoreStatus(2, new ValueCallback<Object>() { // from class: com.taobao.browser.BrowserHybridWebView.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.webkit.ValueCallback
                public void onReceiveValue(Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c60988b0", new Object[]{this, obj});
                    } else if (!(obj instanceof Map)) {
                    } else {
                        Map map = (Map) obj;
                        String str = (String) map.get("rt");
                        String str2 = (String) map.get("rtWhy");
                        String str3 = (String) map.get("gt");
                        String str4 = (String) map.get("gtWhy");
                        BrowserHybridWebView.this.coreMultiType.put("stage", "WhitePage");
                        BrowserHybridWebView.this.coreMultiType.put("requireRenderType", Integer.valueOf(WVCore.getInstance().getUsedWebMulti()));
                        Map<String, Object> map2 = BrowserHybridWebView.this.coreMultiType;
                        if (str == null) {
                            str = "";
                        }
                        map2.put("realRenderType", str);
                        Map<String, Object> map3 = BrowserHybridWebView.this.coreMultiType;
                        if (str2 == null) {
                            str2 = "";
                        }
                        map3.put("renderTypeReason", str2);
                        BrowserHybridWebView.this.coreMultiType.put("requireGpuType", Integer.valueOf(WVCore.getInstance().getUsedGpuMulti()));
                        Map<String, Object> map4 = BrowserHybridWebView.this.coreMultiType;
                        if (str3 == null) {
                            str3 = "";
                        }
                        map4.put("realGpuType", str3);
                        Map<String, Object> map5 = BrowserHybridWebView.this.coreMultiType;
                        if (str4 == null) {
                            str4 = "";
                        }
                        map5.put("gpuTypeReason", str4);
                    }
                }
            });
        }
    }

    public String getUTPageName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("34b6390a", new Object[]{this}) : this.mUTPageName;
    }

    public Map<String, String> getUTParamMap() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("ac0586a0", new Object[]{this}) : this.mUTParamMap;
    }

    public void setUTPageNameAndParamMap(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b03c189", new Object[]{this, str, map});
            return;
        }
        this.mUTPageName = str;
        this.mUTParamMap = map;
    }

    public void hideErrorPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ada4239c", new Object[]{this});
            return;
        }
        BrowserUIModel browserUIModel = this.mBrowserUIModel;
        if (browserUIModel == null) {
            return;
        }
        browserUIModel.hideErrorPage();
    }
}
