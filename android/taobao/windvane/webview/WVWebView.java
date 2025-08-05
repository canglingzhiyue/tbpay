package android.taobao.windvane.webview;

import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.taobao.windvane.config.s;
import android.taobao.windvane.export.adapter.ILocalizationService;
import android.taobao.windvane.jsbridge.WVAppEvent;
import android.taobao.windvane.jsbridge.WVBridgeEngine;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.l;
import android.taobao.windvane.jsbridge.p;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.adi;
import tb.ado;
import tb.adr;
import tb.aem;
import tb.hux;
import tb.kge;
import tb.riy;

/* loaded from: classes2.dex */
public class WVWebView extends WebView implements Handler.Callback, IWVWebView, g {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "WVWebView";
    private static boolean evaluateJavascriptSupported;
    private final String WVURL_SUFFIX;
    public String bizCode;
    public Context context;
    private String currentUrl;
    private String dataOnActive;
    public float dx;
    public float dy;
    public p entryManager;
    public boolean isAlive;
    public boolean isUser;
    private adr jsPatchListener;
    private boolean longPressSaveImage;
    private boolean mAllowAllOpen;
    public SparseArray<MotionEvent> mEventSparseArray;
    public Handler mHandler;
    private String mImageUrl;
    private View.OnLongClickListener mLongClickListener;
    private int mPageLoadedCount;
    private View.OnClickListener mPopupClickListener;
    private android.taobao.windvane.view.a mPopupController;
    private String[] mPopupMenuTags;
    private boolean mUseGlobalUrlConfig;
    private int mWvNativeCallbackId;
    private long onErrorTime;
    public boolean supportDownload;
    public List<Runnable> taskQueue;
    private boolean useUrlConfig;
    public WVWebChromeClient webChromeClient;
    public WVWebViewClient webViewClient;
    private adi wvSecurityFilter;
    private boolean wvSupportFileSchema;
    private boolean wvSupportNativeJs;
    private m wvUIModel;

    public static /* synthetic */ Object ipc$super(WVWebView wVWebView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1988789126:
                super.loadUrl((String) objArr[0]);
                return null;
            case -1983604863:
                super.destroy();
                return null;
            case -1888728565:
                return new Float(super.getScale());
            case -1512649357:
                super.onResume();
                return null;
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -1384276246:
                return new Boolean(super.canGoBack());
            case -1312899459:
                super.evaluateJavascript((String) objArr[0], (ValueCallback) objArr[1]);
                return null;
            case -1247571552:
                super.reload();
                return null;
            case -1185152872:
                super.addJavascriptInterface(objArr[0], (String) objArr[1]);
                return null;
            case -788773096:
                super.clearCache(((Boolean) objArr[0]).booleanValue());
                return null;
            case -597752619:
                super.loadData((String) objArr[0], (String) objArr[1], (String) objArr[2]);
                return null;
            case -561052064:
                return super.getUrl();
            case -188459541:
                super.pauseTimers();
                return null;
            case -148357436:
                return new Integer(super.getContentHeight());
            case 490249163:
                super.loadUrl((String) objArr[0], (Map) objArr[1]);
                return null;
            case 522121505:
                super.loadDataWithBaseURL((String) objArr[0], (String) objArr[1], (String) objArr[2], (String) objArr[3], (String) objArr[4]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            case 1004220751:
                super.onScrollChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
                return null;
            case 1052368738:
                super.resumeTimers();
                return null;
            case 1144012385:
                super.setWebViewClient((WebViewClient) objArr[0]);
                return null;
            case 1248879303:
                super.postUrl((String) objArr[0], (byte[]) objArr[1]);
                return null;
            case 1626033557:
                super.onAttachedToWindow();
                return null;
            case 1991633153:
                super.setWebChromeClient((WebChromeClient) objArr[0]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // android.taobao.windvane.webview.IWVWebView
    public View getView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this}) : this;
    }

    public static /* synthetic */ boolean access$000(WVWebView wVWebView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d435824e", new Object[]{wVWebView})).booleanValue() : wVWebView.longPressSaveImage;
    }

    public static /* synthetic */ String access$100(WVWebView wVWebView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("88658b57", new Object[]{wVWebView}) : wVWebView.mImageUrl;
    }

    public static /* synthetic */ String access$102(WVWebView wVWebView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("94de028f", new Object[]{wVWebView, str});
        }
        wVWebView.mImageUrl = str;
        return str;
    }

    public static /* synthetic */ android.taobao.windvane.view.a access$200(WVWebView wVWebView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (android.taobao.windvane.view.a) ipChange.ipc$dispatch("86f2f922", new Object[]{wVWebView}) : wVWebView.mPopupController;
    }

    public static /* synthetic */ android.taobao.windvane.view.a access$202(WVWebView wVWebView, android.taobao.windvane.view.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (android.taobao.windvane.view.a) ipChange.ipc$dispatch("35ad5690", new Object[]{wVWebView, aVar});
        }
        wVWebView.mPopupController = aVar;
        return aVar;
    }

    public static /* synthetic */ String[] access$300(WVWebView wVWebView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("35b30cb6", new Object[]{wVWebView}) : wVWebView.mPopupMenuTags;
    }

    public static /* synthetic */ View.OnClickListener access$400(WVWebView wVWebView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View.OnClickListener) ipChange.ipc$dispatch("c23c9caf", new Object[]{wVWebView}) : wVWebView.mPopupClickListener;
    }

    public WVWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.bizCode = "";
        this.mWvNativeCallbackId = 1000;
        this.longPressSaveImage = true;
        this.mHandler = null;
        this.wvUIModel = null;
        this.supportDownload = true;
        this.wvSupportNativeJs = false;
        this.wvSupportFileSchema = android.taobao.windvane.util.e.a();
        this.currentUrl = null;
        this.dataOnActive = null;
        this.WVURL_SUFFIX = "?wvFackUrlState=";
        this.wvSecurityFilter = null;
        this.jsPatchListener = null;
        this.mLongClickListener = null;
        this.taskQueue = new ArrayList();
        this.useUrlConfig = false;
        this.mUseGlobalUrlConfig = android.taobao.windvane.config.a.a().u();
        this.mAllowAllOpen = false;
        this.mPageLoadedCount = 0;
        this.onErrorTime = 0L;
        this.mPopupController = null;
        this.mPopupMenuTags = new String[]{hux.a(ILocalizationService.SAVE_TO_ALBUM)};
        this.mPopupClickListener = new View.OnClickListener() { // from class: android.taobao.windvane.webview.WVWebView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                if (WVWebView.access$300(WVWebView.this) != null && WVWebView.access$300(WVWebView.this).length > 0 && WVWebView.access$300(WVWebView.this)[0].equals(view.getTag())) {
                    try {
                        if (Build.VERSION.SDK_INT < 30) {
                            android.taobao.windvane.runtimepermission.b.a(WVWebView.this.context, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}).a(new Runnable() { // from class: android.taobao.windvane.webview.WVWebView.2.2
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    } else {
                                        android.taobao.windvane.util.h.a(WVWebView.this.context.getApplicationContext(), WVWebView.access$100(WVWebView.this), WVWebView.this.mHandler);
                                    }
                                }
                            }).b(new Runnable() { // from class: android.taobao.windvane.webview.WVWebView.2.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    } else {
                                        WVWebView.this.mHandler.sendEmptyMessage(405);
                                    }
                                }
                            }).b();
                        } else {
                            android.taobao.windvane.util.h.a(WVWebView.this.context.getApplicationContext(), WVWebView.access$100(WVWebView.this), WVWebView.this.mHandler);
                        }
                    } catch (Exception unused) {
                    }
                }
                if (WVWebView.access$200(WVWebView.this) == null) {
                    return;
                }
                WVWebView.access$200(WVWebView.this).b();
            }
        };
        this.isUser = true;
        this.mEventSparseArray = new SparseArray<>();
        this.context = context;
        init();
    }

    public WVWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.bizCode = "";
        this.mWvNativeCallbackId = 1000;
        this.longPressSaveImage = true;
        this.mHandler = null;
        this.wvUIModel = null;
        this.supportDownload = true;
        this.wvSupportNativeJs = false;
        this.wvSupportFileSchema = android.taobao.windvane.util.e.a();
        this.currentUrl = null;
        this.dataOnActive = null;
        this.WVURL_SUFFIX = "?wvFackUrlState=";
        this.wvSecurityFilter = null;
        this.jsPatchListener = null;
        this.mLongClickListener = null;
        this.taskQueue = new ArrayList();
        this.useUrlConfig = false;
        this.mUseGlobalUrlConfig = android.taobao.windvane.config.a.a().u();
        this.mAllowAllOpen = false;
        this.mPageLoadedCount = 0;
        this.onErrorTime = 0L;
        this.mPopupController = null;
        this.mPopupMenuTags = new String[]{hux.a(ILocalizationService.SAVE_TO_ALBUM)};
        this.mPopupClickListener = new View.OnClickListener() { // from class: android.taobao.windvane.webview.WVWebView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                if (WVWebView.access$300(WVWebView.this) != null && WVWebView.access$300(WVWebView.this).length > 0 && WVWebView.access$300(WVWebView.this)[0].equals(view.getTag())) {
                    try {
                        if (Build.VERSION.SDK_INT < 30) {
                            android.taobao.windvane.runtimepermission.b.a(WVWebView.this.context, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}).a(new Runnable() { // from class: android.taobao.windvane.webview.WVWebView.2.2
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    } else {
                                        android.taobao.windvane.util.h.a(WVWebView.this.context.getApplicationContext(), WVWebView.access$100(WVWebView.this), WVWebView.this.mHandler);
                                    }
                                }
                            }).b(new Runnable() { // from class: android.taobao.windvane.webview.WVWebView.2.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    } else {
                                        WVWebView.this.mHandler.sendEmptyMessage(405);
                                    }
                                }
                            }).b();
                        } else {
                            android.taobao.windvane.util.h.a(WVWebView.this.context.getApplicationContext(), WVWebView.access$100(WVWebView.this), WVWebView.this.mHandler);
                        }
                    } catch (Exception unused) {
                    }
                }
                if (WVWebView.access$200(WVWebView.this) == null) {
                    return;
                }
                WVWebView.access$200(WVWebView.this).b();
            }
        };
        this.isUser = true;
        this.mEventSparseArray = new SparseArray<>();
        this.context = context;
        init();
    }

    public WVWebView(Context context) {
        super(context);
        this.bizCode = "";
        this.mWvNativeCallbackId = 1000;
        this.longPressSaveImage = true;
        this.mHandler = null;
        this.wvUIModel = null;
        this.supportDownload = true;
        this.wvSupportNativeJs = false;
        this.wvSupportFileSchema = android.taobao.windvane.util.e.a();
        this.currentUrl = null;
        this.dataOnActive = null;
        this.WVURL_SUFFIX = "?wvFackUrlState=";
        this.wvSecurityFilter = null;
        this.jsPatchListener = null;
        this.mLongClickListener = null;
        this.taskQueue = new ArrayList();
        this.useUrlConfig = false;
        this.mUseGlobalUrlConfig = android.taobao.windvane.config.a.a().u();
        this.mAllowAllOpen = false;
        this.mPageLoadedCount = 0;
        this.onErrorTime = 0L;
        this.mPopupController = null;
        this.mPopupMenuTags = new String[]{hux.a(ILocalizationService.SAVE_TO_ALBUM)};
        this.mPopupClickListener = new View.OnClickListener() { // from class: android.taobao.windvane.webview.WVWebView.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                if (WVWebView.access$300(WVWebView.this) != null && WVWebView.access$300(WVWebView.this).length > 0 && WVWebView.access$300(WVWebView.this)[0].equals(view.getTag())) {
                    try {
                        if (Build.VERSION.SDK_INT < 30) {
                            android.taobao.windvane.runtimepermission.b.a(WVWebView.this.context, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}).a(new Runnable() { // from class: android.taobao.windvane.webview.WVWebView.2.2
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    } else {
                                        android.taobao.windvane.util.h.a(WVWebView.this.context.getApplicationContext(), WVWebView.access$100(WVWebView.this), WVWebView.this.mHandler);
                                    }
                                }
                            }).b(new Runnable() { // from class: android.taobao.windvane.webview.WVWebView.2.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    } else {
                                        WVWebView.this.mHandler.sendEmptyMessage(405);
                                    }
                                }
                            }).b();
                        } else {
                            android.taobao.windvane.util.h.a(WVWebView.this.context.getApplicationContext(), WVWebView.access$100(WVWebView.this), WVWebView.this.mHandler);
                        }
                    } catch (Exception unused) {
                    }
                }
                if (WVWebView.access$200(WVWebView.this) == null) {
                    return;
                }
                WVWebView.access$200(WVWebView.this).b();
            }
        };
        this.isUser = true;
        this.mEventSparseArray = new SparseArray<>();
        this.context = context;
        init();
    }

    @Override // android.webkit.WebView
    public int getContentHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f7283ec4", new Object[]{this})).intValue() : (int) (super.getContentHeight() * super.getScale());
    }

    @Override // android.webkit.WebView
    public void loadData(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc5f04d5", new Object[]{this, str, str2, str3});
        } else if (!this.isAlive) {
        } else {
            super.loadData(str, str2, str3);
        }
    }

    @Override // android.webkit.WebView
    public void reload() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5a391a0", new Object[]{this});
        } else {
            super.reload();
        }
    }

    @Override // android.webkit.WebView
    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f1ef121", new Object[]{this, str, str2, str3, str4, str5});
        } else if (!this.isAlive) {
        } else {
            if (android.taobao.windvane.util.m.a()) {
                android.taobao.windvane.util.m.b(TAG, "loadDataWithBaseURL: baseUrl=" + str);
            }
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        }
    }

    @Override // android.webkit.WebView, android.taobao.windvane.webview.IWVWebView
    public void loadUrl(String str) {
        k a2;
        k a3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89757c7a", new Object[]{this, str});
        } else if (!this.isAlive || str == null) {
        } else {
            if (android.taobao.windvane.config.j.commonConfig.aL && (a3 = j.a()) != null) {
                str = a3.dealUrlScheme(str);
            }
            if (android.taobao.windvane.util.p.b(str) && android.taobao.windvane.config.p.c(str, this)) {
                String b = s.a().b();
                if (TextUtils.isEmpty(b)) {
                    HashMap hashMap = new HashMap(2);
                    hashMap.put("cause", "GET_ACCESS_FORBIDDEN");
                    hashMap.put("url", str);
                    onMessage(402, hashMap);
                    return;
                }
                try {
                    super.loadUrl(b);
                } catch (Exception e) {
                    android.taobao.windvane.util.m.e(TAG, e.getMessage());
                }
            } else if (n.a(str, this.context, this)) {
                android.taobao.windvane.util.m.e(TAG, "loadUrl filter url=" + str);
            } else {
                aem.a().a(3010);
                if (android.taobao.windvane.util.m.a()) {
                    android.taobao.windvane.util.m.b(TAG, "loadUrl: url=" + str);
                }
                if (!android.taobao.windvane.config.j.commonConfig.aL && (a2 = j.a()) != null) {
                    str = a2.dealUrlScheme(str);
                }
                k a4 = j.a();
                if (a4 != null) {
                    str = a4.dealUrlScheme(str);
                }
                try {
                    if (android.taobao.windvane.config.j.commonConfig.bG) {
                        this.currentUrl = str;
                    }
                    commitLoadUrl(str, 1);
                    super.loadUrl(str);
                } catch (Exception e2) {
                    android.taobao.windvane.util.m.e(TAG, e2.getMessage());
                }
            }
        }
    }

    private void commitLoadUrl(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb980e0", new Object[]{this, str, new Integer(i)});
            return;
        }
        if (android.taobao.windvane.config.j.commonConfig.ce && str != null && (str.startsWith(ado.URL_SEPARATOR) || str.startsWith(com.taobao.search.common.util.k.HTTP_PREFIX))) {
            android.taobao.windvane.monitor.a.commitFail("loadHttpUrl", i, getContextName(), str);
        }
        if (!android.taobao.windvane.config.j.commonConfig.cf || str == null) {
            return;
        }
        android.taobao.windvane.monitor.a.commitFail("loadUrl", i, getContextName(), str);
    }

    private String getContextName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("17dfa1d5", new Object[]{this});
        }
        Context _getContext = _getContext();
        return _getContext != null ? _getContext.getClass().getName() : "";
    }

    @Override // android.taobao.windvane.webview.IWVWebView
    public void refresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad3d31e2", new Object[]{this});
        } else {
            reload();
        }
    }

    public void superLoadUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a2e52bf", new Object[]{this, str});
        } else if (!this.isAlive) {
        } else {
            super.loadUrl(str);
        }
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d389bcb", new Object[]{this, str, map});
        } else if (!this.isAlive || str == null) {
        } else {
            if (android.taobao.windvane.util.p.b(str) && android.taobao.windvane.config.p.c(str, this)) {
                String b = s.a().b();
                if (TextUtils.isEmpty(b)) {
                    HashMap hashMap = new HashMap(2);
                    hashMap.put("cause", "GET_ACCESS_FORBIDDEN");
                    hashMap.put("url", str);
                    onMessage(402, hashMap);
                    return;
                }
                try {
                    super.loadUrl(b);
                } catch (Exception e) {
                    android.taobao.windvane.util.m.e(TAG, e.getMessage());
                }
            } else if (n.a(str, this.context, this)) {
                android.taobao.windvane.util.m.e(TAG, "loadUrl filter url=" + str);
            } else {
                if (android.taobao.windvane.util.m.a()) {
                    android.taobao.windvane.util.m.b(TAG, "loadUrl with headers: url=" + str);
                }
                commitLoadUrl(str, 2);
                super.loadUrl(str, map);
            }
        }
    }

    @Override // android.webkit.WebView
    public void postUrl(String str, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a7062c7", new Object[]{this, str, bArr});
        } else if (!this.isAlive || str == null) {
        } else {
            if (android.taobao.windvane.util.p.b(str) && android.taobao.windvane.config.p.c(str, this)) {
                String b = s.a().b();
                if (TextUtils.isEmpty(b)) {
                    HashMap hashMap = new HashMap(2);
                    hashMap.put("cause", "POST_ACCESS_FORBIDDEN");
                    hashMap.put("url", str);
                    onMessage(402, hashMap);
                    return;
                }
                try {
                    loadUrl(b);
                } catch (Exception e) {
                    android.taobao.windvane.util.m.e(TAG, e.getMessage());
                }
            } else if (n.a(str, this.context, this)) {
                android.taobao.windvane.util.m.e(TAG, "loadUrl filter url=" + str);
            } else {
                if (android.taobao.windvane.util.m.a()) {
                    android.taobao.windvane.util.m.b(TAG, "postUrl: url=" + str);
                }
                commitLoadUrl(str, 3);
                super.postUrl(str, bArr);
            }
        }
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        if (android.taobao.windvane.util.e.a()) {
            aem.a().a(3008);
        }
        this.mHandler = new Handler(Looper.getMainLooper(), this);
        this.webViewClient = new WVWebViewClient(this.context);
        super.setWebViewClient(this.webViewClient);
        this.webChromeClient = new WVWebChromeClient(this.context);
        super.setWebChromeClient(this.webChromeClient);
        this.webChromeClient.mWebView = this;
        setVerticalScrollBarEnabled(false);
        requestFocus();
        CookieManager.getInstance().setAcceptCookie(true);
        if (Build.VERSION.SDK_INT >= 21) {
            CookieManager.getInstance().setAcceptThirdPartyCookies(this, true);
        }
        i.a(this.context);
        configSettings();
        if (android.taobao.windvane.util.m.a() && Build.VERSION.SDK_INT >= 19) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        l.b().c();
        this.entryManager = new p(this.context, this);
        WVAppEvent wVAppEvent = new WVAppEvent();
        wVAppEvent.initialize(this.context, this);
        addJsObject("AppEvent", wVAppEvent);
        if (Build.VERSION.SDK_INT > 10 && Build.VERSION.SDK_INT < 17) {
            try {
                removeJavascriptInterface("searchBoxJavaBridge_");
                removeJavascriptInterface("accessibility");
                removeJavascriptInterface("accessibilityTraversal");
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        this.wvSecurityFilter = new adi();
        aem.a().a(this.wvSecurityFilter, aem.f25291a);
        this.jsPatchListener = new adr(this);
        aem.a().a(this.jsPatchListener, aem.c);
        if (Build.VERSION.SDK_INT > 15) {
            try {
                ClipboardManager clipboardManager = (ClipboardManager) this.context.getSystemService("clipboard");
                if (clipboardManager != null) {
                    ClipData primaryClip = clipboardManager.getPrimaryClip();
                    if (primaryClip == null) {
                        clipboardManager.setPrimaryClip(ClipData.newPlainText("初始化", ""));
                    } else if ("intent:#Intent;S.K_1171477665=;end".equals(primaryClip.getItemAt(0).coerceToText(this.context).toString())) {
                        clipboardManager.setPrimaryClip(ClipData.newPlainText("初始化", ""));
                    }
                }
            } catch (Exception unused) {
            }
        }
        this.wvUIModel = new m(this.context, this);
        this.mLongClickListener = new View.OnLongClickListener() { // from class: android.taobao.windvane.webview.WVWebView.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
                }
                WebView.HitTestResult hitTestResult = null;
                try {
                    hitTestResult = WVWebView.this.getHitTestResult();
                } catch (Exception unused2) {
                }
                if (hitTestResult == null || !WVWebView.access$000(WVWebView.this)) {
                    return false;
                }
                if (android.taobao.windvane.util.m.a()) {
                    android.taobao.windvane.util.m.b(WVWebView.TAG, "Long click on WebView, " + hitTestResult.getExtra());
                }
                if (hitTestResult.getType() != 8 && hitTestResult.getType() != 5) {
                    return false;
                }
                WVWebView.access$102(WVWebView.this, hitTestResult.getExtra());
                WVWebView wVWebView = WVWebView.this;
                Context context = wVWebView.context;
                WVWebView wVWebView2 = WVWebView.this;
                WVWebView.access$202(wVWebView, new android.taobao.windvane.view.a(context, wVWebView2, WVWebView.access$300(wVWebView2), WVWebView.access$400(WVWebView.this)));
                WVWebView.access$200(WVWebView.this).a();
                return true;
            }
        };
        setOnLongClickListener(this.mLongClickListener);
        setDownloadListener(new WVDownLoadListener());
        this.isAlive = true;
        if (android.taobao.windvane.monitor.o.getPackageMonitorInterface() != null) {
            android.taobao.windvane.monitor.o.getPerformanceMonitor().didWebViewInitAtTime(System.currentTimeMillis());
        }
        if (Build.VERSION.SDK_INT >= 11 && i.a()) {
            try {
                setLayerType(1, null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        addJavascriptInterface(new WVBridgeEngine(this), "__windvane__");
    }

    private void configSettings() {
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(true);
        settings.setJavaScriptEnabled(true);
        String h = android.taobao.windvane.config.a.a().h();
        String i = android.taobao.windvane.config.a.a().i();
        String userAgentString = settings.getUserAgentString();
        if (userAgentString != null) {
            if (!TextUtils.isEmpty(h) && !TextUtils.isEmpty(i)) {
                userAgentString = userAgentString + " AliApp(" + h + "/" + i + riy.BRACKET_END_STR;
            }
            if (!userAgentString.contains("TTID/") && !TextUtils.isEmpty(android.taobao.windvane.config.a.a().b())) {
                userAgentString = userAgentString + " TTID/" + android.taobao.windvane.config.a.a().b();
            }
        }
        settings.setUserAgentString(userAgentString + android.taobao.windvane.config.a.DEFAULT_UA);
        settings.setCacheMode(-1);
        if (Build.VERSION.SDK_INT >= 5) {
            settings.setDatabaseEnabled(false);
            String str = "/data/data/" + this.context.getPackageName() + "/databases";
            settings.setDatabasePath(str);
            settings.setGeolocationEnabled(true);
            settings.setGeolocationDatabasePath(str);
        }
        if (Build.VERSION.SDK_INT >= 7) {
            settings.setDomStorageEnabled(true);
        }
        if (Build.VERSION.SDK_INT < 33) {
            try {
                settings.getClass().getMethod("setAppCacheEnabled", Boolean.TYPE).invoke(settings, true);
                if (this.context != null && this.context.getCacheDir() != null) {
                    settings.getClass().getMethod("setAppCachePath", String.class).invoke(settings, this.context.getCacheDir().getAbsolutePath());
                }
            } catch (Throwable unused) {
            }
        }
        if (Build.VERSION.SDK_INT < 18) {
            settings.setSavePassword(false);
        }
        if (Build.VERSION.SDK_INT >= 14) {
            settings.setTextZoom(100);
        } else {
            settings.setTextSize(WebSettings.TextSize.NORMAL);
        }
        android.taobao.windvane.config.j.a();
        if (android.taobao.windvane.config.j.commonConfig.bu && Build.VERSION.SDK_INT <= 18) {
            settings.setAllowFileAccessFromFileURLs(false);
            settings.setAllowUniversalAccessFromFileURLs(false);
        }
        android.taobao.windvane.config.j.a();
        if (android.taobao.windvane.config.j.commonConfig.bv) {
            settings.setAllowFileAccess(false);
        }
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44303e61", new Object[]{this, webViewClient});
        } else if (webViewClient instanceof WVWebViewClient) {
            this.webViewClient = (WVWebViewClient) webViewClient;
            super.setWebViewClient(webViewClient);
        } else {
            WVWebViewClient wVWebViewClient = this.webViewClient;
            if (wVWebViewClient == null) {
                return;
            }
            wVWebViewClient.extraWebViewClient = webViewClient;
        }
    }

    @Override // android.webkit.WebView
    public void setWebChromeClient(WebChromeClient webChromeClient) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76b5e901", new Object[]{this, webChromeClient});
        } else if (webChromeClient instanceof WVWebChromeClient) {
            this.webChromeClient = (WVWebChromeClient) webChromeClient;
            this.webChromeClient.mWebView = this;
            super.setWebChromeClient(webChromeClient);
        } else {
            WVWebChromeClient wVWebChromeClient = this.webChromeClient;
            if (wVWebChromeClient == null) {
                return;
            }
            wVWebChromeClient.extraWebChromeClient = webChromeClient;
        }
    }

    @Override // android.taobao.windvane.webview.IWVWebView
    public boolean _post(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("32066a08", new Object[]{this, runnable})).booleanValue();
        }
        if (!isAttachedToWindow() && Build.VERSION.SDK_INT < 24) {
            android.taobao.windvane.util.m.b(TAG, " webview has not attach to window");
            this.taskQueue.add(runnable);
            return true;
        }
        return post(runnable);
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        for (Runnable runnable : this.taskQueue) {
            runnable.run();
        }
        this.taskQueue.clear();
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        if (this.taskQueue.size() == 0) {
            return;
        }
        this.taskQueue.clear();
    }

    @Override // android.webkit.WebView
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else if (!this.isAlive) {
        } else {
            this.isAlive = false;
            this.mPageLoadedCount = 0;
            InputMethodManager inputMethodManager = (InputMethodManager) this.context.getSystemService("input_method");
            if (inputMethodManager.isActive()) {
                inputMethodManager.hideSoftInputFromWindow(getApplicationWindowToken(), 0);
            }
            super.setWebViewClient(null);
            super.setWebChromeClient(null);
            this.webViewClient = null;
            this.webChromeClient = null;
            l.b().a();
            this.entryManager.a();
            Handler handler = this.mHandler;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                this.mHandler = null;
            }
            aem.a().a(3003);
            aem.a().b(this.wvSecurityFilter);
            aem.a().b(this.jsPatchListener);
            removeAllViews();
            this.mPopupController = null;
            this.mPopupClickListener = null;
            this.mLongClickListener = null;
            setOnLongClickListener(null);
            if (JsbridgeHis != null) {
                JsbridgeHis.clear();
            }
            try {
                super.destroy();
            } catch (Exception unused) {
            }
        }
    }

    public boolean isAlive() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c89930ce", new Object[]{this})).booleanValue() : this.isAlive;
    }

    public m getWvUIModel() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (m) ipChange.ipc$dispatch("742f11c5", new Object[]{this}) : this.wvUIModel;
    }

    public void onMessage(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cf50210", new Object[]{this, new Integer(i), obj});
        } else if (this.mHandler == null) {
        } else {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.obj = obj;
            this.mHandler.sendMessage(obtain);
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        switch (message.what) {
            case 400:
                if (this.wvUIModel != null) {
                    z = true;
                }
                if (this.wvUIModel.isShowLoading() & z) {
                    this.wvUIModel.showLoadingView();
                    this.wvUIModel.switchNaviBar(1);
                }
                this.mPageLoadedCount++;
                return true;
            case 401:
                if (this.wvUIModel != null) {
                    z = true;
                }
                if (this.wvUIModel.isShowLoading() & z) {
                    this.wvUIModel.hideLoadingView();
                    this.wvUIModel.resetNaviBar();
                }
                if (this.onErrorTime != 0 && System.currentTimeMillis() - this.onErrorTime > 3000) {
                    this.wvUIModel.hideErrorPage();
                }
                return true;
            case 402:
                this.wvUIModel.loadErrorPage();
                this.onErrorTime = System.currentTimeMillis();
                if (this.wvUIModel != null) {
                    z = true;
                }
                if (this.wvUIModel.isShowLoading() & z) {
                    this.wvUIModel.hideLoadingView();
                }
                return true;
            case 403:
                if (this.wvUIModel != null) {
                    z = true;
                }
                if (this.wvUIModel.isShowLoading() & z) {
                    this.wvUIModel.hideLoadingView();
                }
                return true;
            case 404:
                Toast.makeText(this.context, android.taobao.windvane.util.e.c() ? ILocalizationService.IMAGE_SAVED_SUCCESS : "Success to save picture", 1).show();
                return true;
            case 405:
                Toast.makeText(this.context, android.taobao.windvane.util.e.c() ? ILocalizationService.IMAGE_SAVED_FAIL : "Failed to save picture", 1).show();
                return true;
            default:
                return false;
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bdb314f", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        p pVar = this.entryManager;
        if (pVar != null) {
            pVar.a(i, i2, i3, i4);
        }
        try {
            super.onScrollChanged(i, i2, i3, i4);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    @Override // android.webkit.WebView
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        p pVar = this.entryManager;
        if (pVar != null) {
            pVar.b();
        }
        if (Build.VERSION.SDK_INT >= 11) {
            super.onPause();
        }
        aem.a().a(3001);
        if (Build.VERSION.SDK_INT < 21 || !android.taobao.windvane.config.j.commonConfig.aK) {
            return;
        }
        CookieManager.getInstance().flush();
    }

    @Override // android.webkit.WebView
    public void pauseTimers() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4c455eb", new Object[]{this});
            return;
        }
        super.pauseTimers();
        if (!android.taobao.windvane.util.m.a()) {
            return;
        }
        android.taobao.windvane.util.m.e(TAG, "You  must be careful  to Call pauseTimers ,It's Global");
    }

    @Override // android.webkit.WebView
    public void resumeTimers() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eb9df62", new Object[]{this});
            return;
        }
        super.resumeTimers();
        if (!android.taobao.windvane.util.m.a()) {
            return;
        }
        android.taobao.windvane.util.m.e(TAG, "You  must be careful  to Call resumeTimers ,It's Global");
    }

    @Override // android.webkit.WebView
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        p pVar = this.entryManager;
        if (pVar != null) {
            pVar.c();
        }
        if (Build.VERSION.SDK_INT >= 11) {
            super.onResume();
        }
        aem.a().a(3002, this, getUrl(), new Object[0]);
    }

    public Handler getWVHandler() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("e3580a6a", new Object[]{this}) : this.mHandler;
    }

    /* loaded from: classes2.dex */
    public class WVDownLoadListener implements DownloadListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(322717503);
            kge.a(-2124823223);
        }

        public WVDownLoadListener() {
        }

        @Override // android.webkit.DownloadListener
        public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("84e41dba", new Object[]{this, str, str2, str3, str4, new Long(j)});
                return;
            }
            if (android.taobao.windvane.util.m.a()) {
                android.taobao.windvane.util.m.b(WVWebView.TAG, "Download start, url: " + str + " contentDisposition: " + str3 + " mimetype: " + str4 + " contentLength: " + j);
            }
            if (!WVWebView.this.supportDownload) {
                android.taobao.windvane.util.m.d(WVWebView.TAG, "DownloadListener is not support for webview.");
                return;
            }
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.setFlags(268435456);
            try {
                WVWebView.this.context.startActivity(intent);
            } catch (ActivityNotFoundException unused) {
                Toast.makeText(WVWebView.this.context, "对不起，您的设备找不到相应的程序", 1).show();
                android.taobao.windvane.util.m.e(WVWebView.TAG, "DownloadListener not found activity to open this url.");
            }
        }
    }

    public void setSupportDownload(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7f90f98", new Object[]{this, new Boolean(z)});
        } else {
            this.supportDownload = z;
        }
    }

    public void setSupportFileSchema(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d116643", new Object[]{this, new Boolean(z)});
        } else {
            this.wvSupportFileSchema = z;
        }
    }

    public boolean isSupportFileSchema() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("dcf11eed", new Object[]{this})).booleanValue() : this.wvSupportFileSchema;
    }

    @Override // android.webkit.WebView
    public void addJavascriptInterface(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b95c0098", new Object[]{this, obj, str});
        } else if ("accessibility".equals(str) || "accessibilityTraversal".equals(str)) {
        } else {
            if (!this.wvSupportNativeJs && Build.VERSION.SDK_INT < 17) {
                android.taobao.windvane.util.m.e(TAG, "addJavascriptInterface is disabled before API level 17 for security reason.");
            } else {
                super.addJavascriptInterface(obj, str);
            }
        }
    }

    public void supportJavascriptInterface(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("898fb750", new Object[]{this, new Boolean(z)});
        } else {
            this.wvSupportNativeJs = z;
        }
    }

    @Override // android.taobao.windvane.webview.IWVWebView
    public void addJsObject(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b80dd8d6", new Object[]{this, str, obj});
            return;
        }
        p pVar = this.entryManager;
        if (pVar == null) {
            return;
        }
        pVar.a(str, obj);
    }

    @Override // android.taobao.windvane.webview.IWVWebView
    public Object getJsObject(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a0dcc3a3", new Object[]{this, str});
        }
        p pVar = this.entryManager;
        if (pVar != null) {
            return pVar.a(str);
        }
        return null;
    }

    @Override // android.taobao.windvane.webview.IWVWebView
    public Context _getContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("78ce3197", new Object[]{this}) : getContext();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        p pVar = this.entryManager;
        if (pVar == null) {
            return;
        }
        pVar.a(i, i2, intent);
    }

    public void script2NativeCallback(String str, ValueCallback<String> valueCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5868cd3a", new Object[]{this, str, valueCallback});
            return;
        }
        int i = this.mWvNativeCallbackId + 1;
        this.mWvNativeCallbackId = i;
        android.taobao.windvane.util.o.a(String.valueOf(i), valueCallback);
        loadUrl("javascript:console.log('wvNativeCallback/" + i + "/'+function(){var s = " + str + "; return (typeof s === 'object' ? JSON.stringify(s) : typeof s === 'string' ? '\"' + s + '\"' : s);}())");
    }

    @Override // android.taobao.windvane.webview.IWVWebView
    public void evaluateJavascript(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbc0a0f7", new Object[]{this, str});
        } else {
            evaluateJavascript(str, null);
        }
    }

    static {
        kge.a(2050132576);
        kge.a(-1043440182);
        kge.a(-1113217877);
        kge.a(338107928);
        evaluateJavascriptSupported = Build.VERSION.SDK_INT >= 19;
    }

    @Override // android.webkit.WebView, android.taobao.windvane.webview.IWVWebView
    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1bebe7d", new Object[]{this, str, valueCallback});
            return;
        }
        if (str != null && str.length() > 10 && "javascript:".equals(str.substring(0, 11).toLowerCase())) {
            str = str.substring(11);
        }
        if (evaluateJavascriptSupported) {
            try {
                super.evaluateJavascript(str, valueCallback);
            } catch (IllegalStateException unused) {
                evaluateJavascriptSupported = false;
                evaluateJavascript(str, valueCallback);
            } catch (NoSuchMethodError unused2) {
                evaluateJavascriptSupported = false;
                evaluateJavascript(str, valueCallback);
            }
        } else if (valueCallback == null) {
            loadUrl("javascript:" + str);
        } else {
            script2NativeCallback(str, valueCallback);
        }
    }

    public void openLongPressSaveImage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d988e68", new Object[]{this});
        } else {
            this.longPressSaveImage = true;
        }
    }

    public void closeLongPressSaveImage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a8d2f96", new Object[]{this});
        } else {
            this.longPressSaveImage = false;
        }
    }

    @Override // android.webkit.WebView, android.taobao.windvane.webview.IWVWebView
    public String getUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this}) : getCurrentUrl();
    }

    public String getCurrentUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dad2b94d", new Object[]{this});
        }
        String url = super.getUrl();
        if (url == null) {
            android.taobao.windvane.util.m.a(TAG, "getUrl by currentUrl: " + this.currentUrl);
            return this.currentUrl;
        }
        android.taobao.windvane.util.m.a(TAG, "getUrl by webview: " + url);
        return url;
    }

    public void setCurrentUrl(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770a2153", new Object[]{this, str, str2});
            return;
        }
        this.currentUrl = str;
        android.taobao.windvane.util.m.a(TAG, "setCurrentUrl: " + str + " state : " + str2);
    }

    @Override // android.webkit.WebView
    public boolean canGoBack() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad7d9eea", new Object[]{this})).booleanValue();
        }
        if (!aem.a().a(3004).f25290a) {
            return super.canGoBack();
        }
        return false;
    }

    @Override // android.taobao.windvane.webview.IWVWebView
    public boolean back() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e58bdf2", new Object[]{this})).booleanValue();
        }
        if (!canGoBack()) {
            return false;
        }
        goBack();
        int i = this.mPageLoadedCount;
        if (i > 0) {
            this.mPageLoadedCount = i - 1;
        } else {
            android.taobao.windvane.util.m.e(TAG, "back pressed, mPageLoadedCount=" + this.mPageLoadedCount);
        }
        return true;
    }

    @Override // android.taobao.windvane.webview.IWVWebView
    public void setDataOnActive(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("714294e2", new Object[]{this, str});
        } else {
            this.dataOnActive = str;
        }
    }

    @Override // android.taobao.windvane.webview.IWVWebView
    public String getDataOnActive() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8b602214", new Object[]{this}) : this.dataOnActive;
    }

    public void fireEvent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35b21d95", new Object[]{this, str});
        } else {
            fireEvent(str, "{}");
        }
    }

    @Override // android.taobao.windvane.webview.IWVWebView
    public void fireEvent(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7134ec1f", new Object[]{this, str, str2});
        } else {
            getWVCallBackContext().fireEvent(str, str2);
        }
    }

    @Deprecated
    public WVCallBackContext getWVCallBackContext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WVCallBackContext) ipChange.ipc$dispatch("587cc277", new Object[]{this}) : new WVCallBackContext(this);
    }

    @Override // android.taobao.windvane.webview.IWVWebView
    public void showLoadingView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8f114b", new Object[]{this});
            return;
        }
        m mVar = this.wvUIModel;
        if (mVar == null) {
            return;
        }
        mVar.showLoadingView();
    }

    @Override // android.taobao.windvane.webview.IWVWebView
    public void hideLoadingView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7409c66", new Object[]{this});
            return;
        }
        m mVar = this.wvUIModel;
        if (mVar == null) {
            return;
        }
        mVar.hideLoadingView();
    }

    @Override // android.taobao.windvane.webview.IWVWebView
    public void clearCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8aded33c", new Object[]{this});
        } else {
            super.clearCache(true);
        }
    }

    @Override // android.taobao.windvane.webview.IWVWebView
    public String getUserAgentString() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a06231a4", new Object[]{this}) : getSettings().getUserAgentString();
    }

    @Override // android.taobao.windvane.webview.IWVWebView
    public void setUserAgentString(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("260bd7ba", new Object[]{this, str});
        } else {
            getSettings().setUserAgentString(str);
        }
    }

    @Override // android.taobao.windvane.webview.g
    public boolean canUseUrlConfig() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("240f7b45", new Object[]{this})).booleanValue() : this.useUrlConfig;
    }

    public void setUrlConfigSwitch(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d99261aa", new Object[]{this, new Boolean(z)});
        } else {
            this.useUrlConfig = z;
        }
    }

    @Override // android.taobao.windvane.webview.g
    public boolean canUseGlobalUrlConfig() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("eaf245a2", new Object[]{this})).booleanValue() : this.mUseGlobalUrlConfig;
    }

    public void setGlobalUrlConfigSwitch(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83d3406d", new Object[]{this, new Boolean(z)});
        } else {
            this.mUseGlobalUrlConfig = z;
        }
    }

    @Override // android.taobao.windvane.webview.g
    public int getPageLoadedCount() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("311abdbf", new Object[]{this})).intValue() : this.mPageLoadedCount;
    }

    @Override // android.taobao.windvane.webview.g
    public boolean allowAllOpen() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f86a6f8d", new Object[]{this})).booleanValue() : this.mAllowAllOpen;
    }

    @Override // android.taobao.windvane.webview.g
    public void setAllowAllOpen(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43aec829", new Object[]{this, new Boolean(z)});
        } else {
            this.mAllowAllOpen = z;
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        int action = motionEvent.getAction();
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        if (action == 0) {
            this.dx = motionEvent.getX();
            this.dy = motionEvent.getY();
            if (!this.isUser) {
                this.mEventSparseArray.put(pointerId, MotionEvent.obtain(motionEvent));
                return true;
            }
        } else if (action == 2) {
            if (!this.isUser && Math.abs(motionEvent.getY() - this.dy) > 5.0f) {
                return true;
            }
        } else if (action == 1) {
            if (!this.isUser && Math.abs(motionEvent.getY() - this.dy) > 5.0f) {
                this.isUser = true;
                return true;
            }
            MotionEvent motionEvent2 = this.mEventSparseArray.get(pointerId);
            if (motionEvent2 != null) {
                super.onTouchEvent(motionEvent2);
                motionEvent2.recycle();
                this.mEventSparseArray.remove(pointerId);
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
