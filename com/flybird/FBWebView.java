package com.flybird;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.alipay.birdnest.api.BirdNestEngine;
import com.alipay.birdnest.util.FBLogger;
import com.alipay.birdnest.view.WebViewWrapper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.util.a;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class FBWebView extends FBView implements BirdNestEngine.UiWidgetProvider.LoadUrlListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public WebViewWrapper A;
    public Handler B;
    public View C;
    public HashMap<String, String> D;
    public HashMap<String, String> E;

    /* renamed from: com.flybird.FBWebView$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public class AnonymousClass1 implements BirdNestEngine.UiWidgetProvider.CreateCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public AnonymousClass1() {
        }

        @Override // com.alipay.birdnest.api.BirdNestEngine.UiWidgetProvider.CreateCallback
        public void onError(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ac367d3a", new Object[]{this, str});
                return;
            }
            FBLogger.e(FBView.TAG, "WebView 异步创建失败，reason: " + str);
        }

        @Override // com.alipay.birdnest.api.BirdNestEngine.UiWidgetProvider.CreateCallback
        public void onSuccess(View view, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("66be022d", new Object[]{this, view, bundle});
                return;
            }
            FBWebView fBWebView = FBWebView.this;
            fBWebView.C = view;
            if (view == null) {
                return;
            }
            if (fBWebView.B == null) {
                fBWebView.B = new Handler(Looper.getMainLooper());
            }
            FBWebView.this.B.post(new Runnable() { // from class: com.flybird.FBWebView.1.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    int i = 0;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    FBWebView fBWebView2 = FBWebView.this;
                    View view2 = fBWebView2.C;
                    try {
                        View view3 = fBWebView2.mView;
                        if (view3 != null && view2.equals(view3)) {
                            FBLogger.d(FBView.TAG, "WebView 已经同步回调返回过了，忽略此次 reattach");
                            return;
                        }
                        ViewParent parent = fBWebView2.mView.getParent();
                        if (parent instanceof ViewGroup) {
                            ViewGroup viewGroup = (ViewGroup) parent;
                            while (true) {
                                if (i >= viewGroup.getChildCount()) {
                                    i = -1;
                                    break;
                                } else if (fBWebView2.mView.equals(viewGroup.getChildAt(i))) {
                                    break;
                                } else {
                                    i++;
                                }
                            }
                            if (i != -1) {
                                viewGroup.removeView(fBWebView2.mView);
                                fBWebView2.mView.setTag(fBWebView2.getInnerViewTag(), null);
                                fBWebView2.setInnerView(view2);
                                viewGroup.addView(view2, i);
                            }
                        }
                        for (String str : fBWebView2.D.keySet()) {
                            fBWebView2.updateAttr(str, fBWebView2.D.get(str));
                        }
                        for (String str2 : fBWebView2.E.keySet()) {
                            fBWebView2.updateCSS(str2, fBWebView2.E.get(str2));
                        }
                    } catch (Throwable th) {
                        FBLogger.e(FBView.TAG, th);
                    }
                }
            });
        }
    }

    public FBWebView(Context context, FBDocument fBDocument, Map<String, String> map) {
        super(fBDocument);
        this.D = new HashMap<>();
        this.E = new HashMap<>();
        WebViewWrapper webViewWrapper = new WebViewWrapper(this.mDoc.getEngine().getConfig().getUiWidgetProvider(), map);
        this.A = webViewWrapper;
        FrameLayout.LayoutParams layoutParams = this.v;
        layoutParams.width = -1;
        layoutParams.height = -2;
        webViewWrapper.a(context, this, new AnonymousClass1());
        View view = this.C;
        setInnerView(view == null ? new View(context) : view);
    }

    public static /* synthetic */ Object ipc$super(FBWebView fBWebView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1022301035) {
            super.updateCSS((String) objArr[0], (String) objArr[1]);
            return null;
        } else if (hashCode == 1244158581) {
            super.updateAttr((String) objArr[0], (String) objArr[1]);
            return null;
        } else if (hashCode != 1852014070) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.doDestroy();
            return null;
        }
    }

    @Override // com.flybird.FBView
    public void doDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e637df6", new Object[]{this});
            return;
        }
        WebViewWrapper webViewWrapper = this.A;
        getInnerView();
        webViewWrapper.getClass();
        webViewWrapper.f5276a = null;
        this.A = null;
        super.doDestroy();
    }

    @Override // com.alipay.birdnest.api.BirdNestEngine.UiWidgetProvider.LoadUrlListener
    public boolean onLoadUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ba997edf", new Object[]{this, str})).booleanValue();
        }
        if (isDestroyed() || str == null || !str.startsWith(this.A.c)) {
            return false;
        }
        FBView.nativePlatformOnNativeScheme(getNode(), str);
        return true;
    }

    @Override // com.alipay.birdnest.api.BirdNestEngine.UiWidgetProvider.LoadUrlListener
    public void onPageEvent(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1044447", new Object[]{this, str, str2});
            return;
        }
        if (!isDestroyed() && !StringUtils.isEmpty(str)) {
            try {
                this.mDoc.B = true;
                FBView.nativePlatformOnCallback(getNode(), str, str2);
            } finally {
                try {
                    return;
                } finally {
                }
            }
            return;
        }
        FBLogger.e(FBView.TAG, "isDestroyed or name is NULL, ignore onPageEvent()");
    }

    @Override // com.flybird.FBView
    public void updateAttr(String str, String str2) {
        View view;
        View view2;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a285a75", new Object[]{this, str, str2});
            return;
        }
        this.D.put(str, str2);
        WebViewWrapper webViewWrapper = this.A;
        webViewWrapper.getClass();
        if ("src".equals(str)) {
            WebView webView = webViewWrapper.f5276a;
            if (webView != null) {
                webView.loadUrl(str2);
            } else {
                BirdNestEngine.UiWidgetProvider uiWidgetProvider = webViewWrapper.d;
                if (uiWidgetProvider != null && (view2 = webViewWrapper.b) != null) {
                    try {
                        uiWidgetProvider.loadUrlWithWebView(view2, str2);
                    } catch (ClassCastException e) {
                        FBLogger.e("FBWebView", "exception: ", e);
                    }
                }
            }
        } else if ("html".equals(str)) {
            WebView webView2 = webViewWrapper.f5276a;
            if (webView2 != null) {
                webView2.loadData(str2, "text/html", "UTF-8");
            } else {
                BirdNestEngine.UiWidgetProvider uiWidgetProvider2 = webViewWrapper.d;
                if (uiWidgetProvider2 != null && (view = webViewWrapper.b) != null) {
                    try {
                        uiWidgetProvider2.loadData(view, str2, "text/html", "UTF-8");
                    } catch (Throwable th) {
                        FBLogger.e("FBWebView", "exception: ", th);
                    }
                }
            }
        } else if ("nativescheme".equals(str)) {
            webViewWrapper.c = str2;
        } else {
            z = false;
        }
        if (z) {
            return;
        }
        super.updateAttr(str, str2);
    }

    @Override // com.flybird.FBView
    public void updateCSS(String str, String str2) {
        BirdNestEngine.UiWidgetProvider uiWidgetProvider;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c310ec95", new Object[]{this, str, str2});
            return;
        }
        this.E.put(str, str2);
        WebViewWrapper webViewWrapper = this.A;
        View view = this.mView;
        webViewWrapper.getClass();
        if (str.equals(a.ATOM_EXT_UDL_font_size)) {
            try {
                WebView webView = webViewWrapper.f5276a;
                if (webView != null) {
                    WebSettings settings = webView.getSettings();
                    if (Build.VERSION.SDK_INT >= 14) {
                        settings.setTextZoom(Integer.parseInt(str2));
                    }
                } else if (view != null && (uiWidgetProvider = webViewWrapper.d) != null) {
                    try {
                        if (Build.VERSION.SDK_INT >= 14) {
                            uiWidgetProvider.updateWebViewProperties(webViewWrapper.b, str, str2);
                        }
                    } catch (ClassCastException e) {
                        FBLogger.e("FBWebView", "exception: ", e);
                    }
                }
            } catch (NumberFormatException e2) {
                FBLogger.e("FBWebView", "exception: ", e2);
            }
        } else {
            z = false;
        }
        if (z) {
            return;
        }
        super.updateCSS(str, str2);
    }
}
