package com.taobao.android.detail.ttdetail.widget.webview;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.extra.uc.WVUCWebViewClient;
import android.taobao.windvane.jsbridge.q;
import android.taobao.windvane.webview.m;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.i;
import com.taobao.android.detail.ttdetail.utils.j;
import com.taobao.android.detail.ttdetail.utils.y;
import com.taobao.android.detail.ttdetail.widget.webview.plugin.OpenWindowPlugin;
import com.taobao.android.detail.ttdetail.widget.webview.plugin.PageDetailPlugin;
import com.taobao.android.t;
import com.taobao.taobao.R;
import com.uc.webview.export.WebSettings;
import com.uc.webview.export.WebView;
import java.util.HashMap;
import tb.kge;
import tb.odg;

/* loaded from: classes5.dex */
public class DetailHybridWebView extends WVUCWebView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "DetailHybridWebView";
    private static boolean isPluginInit;
    private static HashMap<String, Class<? extends android.taobao.windvane.jsbridge.e>> sPluginMap;
    private final String TOKEN;
    private d heightChangedListener;
    private b mDescLoadErrorListener;
    private c mDescLoadFinishListener;
    private f mDescStartLoadListener;
    private boolean mIsPaused;
    private boolean mReachBottom;
    public boolean mStrictNav;

    /* loaded from: classes5.dex */
    public interface b {
        void a(WebView webView, int i, String str, String str2);
    }

    /* loaded from: classes5.dex */
    public interface c {
        void a(WebView webView, String str);
    }

    /* loaded from: classes5.dex */
    public interface d {
    }

    /* loaded from: classes5.dex */
    public interface f {
        void a(WebView webView, String str);
    }

    public static /* synthetic */ Object ipc$super(DetailHybridWebView detailHybridWebView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1983604863:
                super.destroy();
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case -610146718:
                super.coreDestroy();
                return null;
            case -407533570:
                return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
            case 143825882:
                return new Boolean(super.coreOverScrollBy(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue(), ((Number) objArr[5]).intValue(), ((Number) objArr[6]).intValue(), ((Number) objArr[7]).intValue(), ((Boolean) objArr[8]).booleanValue()));
            case 797441118:
                super.onPause();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ f access$000(DetailHybridWebView detailHybridWebView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("88c130dd", new Object[]{detailHybridWebView}) : detailHybridWebView.mDescStartLoadListener;
    }

    public static /* synthetic */ c access$100(DetailHybridWebView detailHybridWebView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("ed3dfb1f", new Object[]{detailHybridWebView}) : detailHybridWebView.mDescLoadFinishListener;
    }

    public static /* synthetic */ b access$200(DetailHybridWebView detailHybridWebView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("51bac59f", new Object[]{detailHybridWebView}) : detailHybridWebView.mDescLoadErrorListener;
    }

    static {
        kge.a(1034395774);
        sPluginMap = new HashMap<>(4);
        isPluginInit = false;
    }

    private static void initPlugins() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d268a4f7", new Object[0]);
            return;
        }
        sPluginMap.put("Page_Detail", PageDetailPlugin.class);
        sPluginMap.put("DetailBase", OpenWindowPlugin.class);
    }

    public static void registerPlugins() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3583184", new Object[0]);
            return;
        }
        if (!isPluginInit) {
            initPlugins();
            isPluginInit = true;
        }
        for (String str : sPluginMap.keySet()) {
            q.a(str, sPluginMap.get(str), true);
        }
    }

    public static void unregisterPlugins() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cca824b", new Object[0]);
            return;
        }
        for (String str : sPluginMap.keySet()) {
            q.b(str);
        }
    }

    public DetailHybridWebView(Context context) {
        super(getActivity(context));
        this.mIsPaused = false;
        this.mStrictNav = false;
        this.TOKEN = "hash: " + hashCode();
        initDetailWebview(getActivity(context));
    }

    public DetailHybridWebView(Context context, AttributeSet attributeSet) {
        super(getActivity(context), attributeSet);
        this.mIsPaused = false;
        this.mStrictNav = false;
        this.TOKEN = "hash: " + hashCode();
        initDetailWebview(getActivity(context));
    }

    public DetailHybridWebView(Context context, AttributeSet attributeSet, int i) {
        super(getActivity(context), attributeSet, i);
        this.mIsPaused = false;
        this.mStrictNav = false;
        this.TOKEN = "hash: " + hashCode();
        initDetailWebview(getActivity(context));
    }

    public boolean getReachBottom() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ed4ea4d3", new Object[]{this})).booleanValue() : this.mReachBottom;
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebView, com.uc.webview.export.WebView, com.uc.webview.internal.interfaces.IWebViewOverride
    public boolean coreOverScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8929bda", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8), new Boolean(z)})).booleanValue();
        }
        if (i2 <= 0 || i4 != i6) {
            z2 = false;
        }
        this.mReachBottom = z2;
        return super.coreOverScrollBy(i, i2, i3, i4, i5, i6, i7, i8, z);
    }

    @Override // com.uc.webview.export.WebView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue() : super.onInterceptTouchEvent(motionEvent);
    }

    public void enableLoadingAnim() {
        RelativeLayout relativeLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36199b71", new Object[]{this});
            return;
        }
        m wvUIModel = getWvUIModel();
        if (wvUIModel == null) {
            return;
        }
        com.taobao.android.detail.ttdetail.performance.d a2 = com.taobao.android.detail.ttdetail.performance.d.a(this.context);
        if (a2 != null) {
            relativeLayout = (RelativeLayout) a2.a(this.context, R.layout.tt_taodetail_loading_mask, null, true);
        } else {
            relativeLayout = (RelativeLayout) LayoutInflater.from(this.context).inflate(R.layout.tt_taodetail_loading_mask, (ViewGroup) null);
        }
        wvUIModel.setLoadingView(relativeLayout);
        wvUIModel.enableShowLoading();
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebView, com.uc.webview.export.WebView
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else if (!this.mIsPaused) {
        } else {
            this.mIsPaused = false;
            super.onResume();
        }
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebView, com.uc.webview.export.WebView
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else if (this.mIsPaused) {
        } else {
            this.mIsPaused = true;
            super.onPause();
        }
    }

    public void resizeHeight(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c24d6141", new Object[]{this, new Integer(i)});
            return;
        }
        getLayoutParams().height = i;
        requestLayout();
    }

    private static Context getActivity(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("cd9041b4", new Object[]{context}) : context == null ? odg.b().a() : context;
    }

    private void initDetailWebview(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e79a54e9", new Object[]{this, context});
            return;
        }
        initSettings();
        setOverScrollMode(2);
        setWebViewClient(new a(context));
        if (!j.C()) {
            return;
        }
        setWvUIModel(new com.taobao.android.detail.ttdetail.widget.desc.a(context, this));
    }

    private void initSettings() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("205185a", new Object[]{this});
            return;
        }
        setInitialScale(100);
        WebSettings settings = getSettings();
        settings.setUseWideViewPort(true);
        settings.setBuiltInZoomControls(true);
        settings.setSupportZoom(true);
        settings.setLoadWithOverviewMode(true);
        if (Build.VERSION.SDK_INT >= 11) {
            settings.setDisplayZoomControls(false);
        }
        settings.setSavePassword(false);
        if (!needDegrade()) {
            return;
        }
        i.a(TAG, "need degrade.");
        setLayerType(1, null);
    }

    public void setHeightChangedListener(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a18a19dd", new Object[]{this, dVar});
        } else {
            this.heightChangedListener = dVar;
        }
    }

    public void setDescLoadErrorListener(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("210a6dfb", new Object[]{this, bVar});
        } else {
            this.mDescLoadErrorListener = bVar;
        }
    }

    public void setDescStartLoadListener(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cec51391", new Object[]{this, fVar});
        } else {
            this.mDescStartLoadListener = fVar;
        }
    }

    public void setDescLoadFinishListener(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5778aadd", new Object[]{this, cVar});
        } else {
            this.mDescLoadFinishListener = cVar;
        }
    }

    private boolean needDegrade() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("66ebfb0b", new Object[]{this})).booleanValue() : j.P();
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebView, com.uc.webview.export.WebView
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            super.destroy();
        }
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebView, com.uc.webview.export.WebView, com.uc.webview.internal.interfaces.IWebViewOverride
    public void coreDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dba1e662", new Object[]{this});
            return;
        }
        clearHistory();
        super.coreDestroy();
    }

    /* loaded from: classes5.dex */
    public static class e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1593187008);
        }

        public static boolean a(WebView webView, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("eda1d580", new Object[]{webView, str})).booleanValue();
            }
            if (TextUtils.isEmpty(str) || str.contains("innerWebview")) {
                return false;
            }
            t.a().a(y.a(webView).getApplicationContext()).a(str);
            return true;
        }

        public static boolean b(WebView webView, String str) {
            String[] strArr;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7bd541f", new Object[]{webView, str})).booleanValue();
            }
            if (TextUtils.isEmpty(str)) {
                return true;
            }
            String trim = str.trim();
            if (TextUtils.isEmpty(trim)) {
                return true;
            }
            if (!trim.startsWith("tel:") && !trim.startsWith("mailto:")) {
                for (String str2 : com.taobao.android.detail.ttdetail.skeleton.desc.web.b.NAV_URL_DETAIL) {
                    if (!TextUtils.isEmpty(str2) && trim.startsWith(str2)) {
                        t.a().a(y.a(webView).getApplicationContext()).a(trim);
                        return true;
                    }
                }
                if (!TextUtils.isEmpty("https://shop.m.taobao.com/shop/shop_index.htm") && trim.startsWith("https://shop.m.taobao.com/shop/shop_index.htm")) {
                    t.a().a(y.a(webView).getApplicationContext()).a(trim);
                    return true;
                }
            }
            return false;
        }
    }

    /* loaded from: classes5.dex */
    public class a extends WVUCWebViewClient {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1059566545);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -332805219) {
                super.onPageFinished((WebView) objArr[0], (String) objArr[1]);
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

        public a(Context context) {
            super(context);
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("dacf25f5", new Object[]{this, webView, str})).booleanValue();
            }
            i.a(DetailHybridWebView.TAG, "nav url in hybrid webview mode: " + DetailHybridWebView.this.mStrictNav + " url: " + str);
            if (DetailHybridWebView.this.mStrictNav) {
                return e.b(webView, str);
            }
            return e.a(webView, str);
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1fdfe7e4", new Object[]{this, webView, str, bitmap});
                return;
            }
            i.a(DetailHybridWebView.TAG, "url load started : " + str);
            super.onPageStarted(webView, str, bitmap);
            if (DetailHybridWebView.access$000(DetailHybridWebView.this) == null) {
                return;
            }
            DetailHybridWebView.access$000(DetailHybridWebView.this).a(webView, str);
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ec29cb9d", new Object[]{this, webView, str});
                return;
            }
            i.a(DetailHybridWebView.TAG, "url load finished : " + str + "，progress: " + webView.getProgress());
            super.onPageFinished(webView, str);
            if (DetailHybridWebView.access$100(DetailHybridWebView.this) == null) {
                return;
            }
            DetailHybridWebView.access$100(DetailHybridWebView.this).a(webView, str);
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("51deb74c", new Object[]{this, webView, new Integer(i), str, str2});
                return;
            }
            i.a(DetailHybridWebView.TAG, "url load on error : " + str2 + "error info : " + i + ", " + str);
            super.onReceivedError(webView, i, str, str2);
            if (DetailHybridWebView.access$200(DetailHybridWebView.this) == null) {
                return;
            }
            DetailHybridWebView.access$200(DetailHybridWebView.this).a(webView, i, str, str2);
        }
    }
}
