package com.taobao.android.detail.wrapper.ext.windvane.webview;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.extra.uc.WVUCWebViewClient;
import android.taobao.windvane.jsbridge.q;
import android.taobao.windvane.webview.m;
import mtopsdk.common.util.StringUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.core.utils.l;
import com.taobao.android.detail.wrapper.ext.windvane.wvplugin.OpenWindowPlugin;
import com.taobao.android.detail.wrapper.ext.windvane.wvplugin.pagedetail.PageDetailPlugin;
import com.taobao.browser.jsbridge.CommonJsApiManager;
import com.taobao.taobao.R;
import com.uc.webview.export.WebSettings;
import com.uc.webview.export.WebView;
import java.util.HashMap;
import java.util.Locale;
import tb.ecc;
import tb.ecg;
import tb.egn;
import tb.emu;
import tb.epj;
import tb.epo;
import tb.epq;
import tb.fpz;
import tb.kge;

/* loaded from: classes5.dex */
public class DetailHybridWebView extends WVUCWebView {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "DetailHybridWebView";
    private static boolean pluginInited;
    private static HashMap<String, Class<? extends android.taobao.windvane.jsbridge.e>> pluginMap;
    private final String TOKEN;
    private c heightChangedListener;
    private b mDescLoadErrorListener;
    private e mDescLoadFinishListener;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private boolean mIsPaused;
    private float mLastMotionX;
    private float mLastMotionY;
    private boolean reachBottom;
    public boolean strictNav;

    /* loaded from: classes5.dex */
    public interface b {
        void a(WebView webView, int i, String str, String str2);
    }

    /* loaded from: classes5.dex */
    public interface c {
        void a();
    }

    /* loaded from: classes5.dex */
    public interface e {
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

    public static /* synthetic */ e access$000(DetailHybridWebView detailHybridWebView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("212eee3e", new Object[]{detailHybridWebView}) : detailHybridWebView.mDescLoadFinishListener;
    }

    public static /* synthetic */ Context access$100(DetailHybridWebView detailHybridWebView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("50abae99", new Object[]{detailHybridWebView}) : detailHybridWebView.context;
    }

    public static /* synthetic */ b access$200(DetailHybridWebView detailHybridWebView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("f2558d9f", new Object[]{detailHybridWebView}) : detailHybridWebView.mDescLoadErrorListener;
    }

    static {
        kge.a(696615558);
        pluginMap = new HashMap<>(4);
        pluginInited = false;
    }

    private static void initPlugins() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d268a4f7", new Object[0]);
            return;
        }
        pluginMap.put("Page_Detail", PageDetailPlugin.class);
        pluginMap.put("DetailBase", OpenWindowPlugin.class);
    }

    public static void registerPlugins() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3583184", new Object[0]);
            return;
        }
        if (!pluginInited) {
            initPlugins();
            pluginInited = true;
        }
        for (String str : pluginMap.keySet()) {
            q.a(str, pluginMap.get(str), true);
        }
        CommonJsApiManager.initCommonJsbridge();
    }

    public static void unregisterPlugins() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cca824b", new Object[0]);
            return;
        }
        for (String str : pluginMap.keySet()) {
            q.b(str);
        }
    }

    public DetailHybridWebView(Context context) {
        super(getActivity(context));
        this.mIsPaused = false;
        this.strictNav = false;
        this.TOKEN = "hash: " + hashCode();
        initDetailWebview(getActivity(context));
    }

    public DetailHybridWebView(Context context, AttributeSet attributeSet) {
        super(getActivity(context), attributeSet);
        this.mIsPaused = false;
        this.strictNav = false;
        this.TOKEN = "hash: " + hashCode();
        initDetailWebview(getActivity(context));
    }

    public DetailHybridWebView(Context context, AttributeSet attributeSet, int i) {
        super(getActivity(context), attributeSet, i);
        this.mIsPaused = false;
        this.strictNav = false;
        this.TOKEN = "hash: " + hashCode();
        initDetailWebview(getActivity(context));
    }

    public boolean getReachBottom() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ed4ea4d3", new Object[]{this})).booleanValue() : this.reachBottom;
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
        this.reachBottom = z2;
        return super.coreOverScrollBy(i, i2, i3, i4, i5, i6, i7, i8, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
        if (r0 != 3) goto L28;
     */
    @Override // com.uc.webview.export.WebView, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.detail.wrapper.ext.windvane.webview.DetailHybridWebView.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1c
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r2] = r8
            r1[r4] = r9
            java.lang.String r9 = "e7b587fe"
            java.lang.Object r9 = r0.ipc$dispatch(r9, r1)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            return r9
        L1c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            android.content.Context r1 = r8.getContext()
            int r1 = r1.hashCode()
            r0.append(r1)
            java.lang.String r1 = ""
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Object r0 = tb.ehj.a(r0)
            boolean r1 = r0 instanceof java.lang.Boolean
            if (r1 == 0) goto Lae
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lae
            int r0 = r9.getActionMasked()
            if (r0 == 0) goto L9e
            if (r0 == r4) goto L94
            if (r0 == r3) goto L53
            r1 = 3
            if (r0 == r1) goto L94
            goto Lae
        L53:
            float r0 = r9.getY()
            float r1 = r9.getX()
            float r3 = r8.mLastMotionX
            float r3 = r1 - r3
            float r5 = r8.mLastMotionY
            float r5 = r0 - r5
            float r6 = r8.mInitialMotionX
            float r6 = r1 - r6
            float r6 = java.lang.Math.abs(r6)
            float r7 = r8.mInitialMotionY
            float r7 = r0 - r7
            float r7 = java.lang.Math.abs(r7)
            float r3 = java.lang.Math.abs(r3)
            float r5 = java.lang.Math.abs(r5)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 < 0) goto L83
            int r3 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r3 >= 0) goto L84
        L83:
            r2 = 1
        L84:
            if (r2 == 0) goto L8f
            android.view.ViewParent r2 = r8.getParent()
            if (r2 == 0) goto L8f
            r2.requestDisallowInterceptTouchEvent(r4)
        L8f:
            r8.mLastMotionY = r0
            r8.mLastMotionX = r1
            goto Lae
        L94:
            r0 = 0
            r8.mInitialMotionY = r0
            r8.mLastMotionY = r0
            r8.mInitialMotionX = r0
            r8.mLastMotionX = r0
            goto Lae
        L9e:
            float r0 = r9.getY()
            r8.mInitialMotionY = r0
            r8.mLastMotionY = r0
            float r0 = r9.getX()
            r8.mInitialMotionX = r0
            r8.mLastMotionX = r0
        Lae:
            boolean r9 = super.onInterceptTouchEvent(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.detail.wrapper.ext.windvane.webview.DetailHybridWebView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public void enableLoadingAnim() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36199b71", new Object[]{this});
            return;
        }
        m wvUIModel = getWvUIModel();
        if (wvUIModel == null) {
            return;
        }
        wvUIModel.setLoadingView((RelativeLayout) LayoutInflater.from(this.context).inflate(R.layout.x_taodetail_loading_mask, (ViewGroup) null));
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
        c cVar = this.heightChangedListener;
        if (cVar == null) {
            return;
        }
        cVar.a();
    }

    private static Context getActivity(Context context) {
        DetailCoreActivity detailCoreActivity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("cd9041b4", new Object[]{context});
        }
        if (context == null) {
            context = com.taobao.android.detail.core.detail.activity.a.b().f9418a;
        }
        if (context == null) {
            return epo.a();
        }
        return (!(context instanceof Activity) && (detailCoreActivity = com.taobao.android.detail.core.detail.activity.a.b().f9418a) != null) ? detailCoreActivity : context;
    }

    private void initDetailWebview(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e79a54e9", new Object[]{this, context});
            return;
        }
        emu.a("com.taobao.android.detail.wrapper.ext.windvane.webview.DetailHybridWebView");
        initSettings();
        setOverScrollMode(2);
        setWebViewClient(new a(context));
        if (!l.a()) {
            return;
        }
        i.a(TAG, "Constructor " + this.TOKEN, new Throwable());
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
        i.b(TAG, "need degrade.");
        setLayerType(1, null);
    }

    public void setHeightChangedListener(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92a66130", new Object[]{this, cVar});
        } else {
            this.heightChangedListener = cVar;
        }
    }

    public void setDescLoadErrorListener(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75f45975", new Object[]{this, bVar});
        } else {
            this.mDescLoadErrorListener = bVar;
        }
    }

    public void setDescLoadFinishListener(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("646fc7ef", new Object[]{this, eVar});
        } else {
            this.mDescLoadFinishListener = eVar;
        }
    }

    private boolean needDegrade() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66ebfb0b", new Object[]{this})).booleanValue();
        }
        String str = Build.MODEL;
        if (!StringUtils.isEmpty(str)) {
            String a2 = epj.h().a("android_detail", "close_wvhw_list", "");
            if (!StringUtils.isEmpty(a2)) {
                if (a2.contains("," + str.toLowerCase(Locale.getDefault()) + ",")) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebView, com.uc.webview.export.WebView
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        super.destroy();
        if (!l.a()) {
            return;
        }
        i.a(TAG, "Destroy " + this.TOKEN, new Throwable());
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
    public static class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1753490360);
        }

        public static boolean a(WebView webView, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("eda1d580", new Object[]{webView, str})).booleanValue();
            }
            if (StringUtils.isEmpty(str) || str.contains("innerWebview")) {
                return false;
            }
            epq.a(webView.getContext().getApplicationContext(), str);
            return true;
        }

        public static boolean b(WebView webView, String str) {
            String[] strArr;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7bd541f", new Object[]{webView, str})).booleanValue();
            }
            if (StringUtils.isEmpty(str)) {
                return true;
            }
            String trim = str.trim();
            if (StringUtils.isEmpty(trim)) {
                return true;
            }
            if (!trim.startsWith("tel:") && !trim.startsWith("mailto:")) {
                for (String str2 : egn.NAV_URL_DETAIL) {
                    if (!StringUtils.isEmpty(str2) && trim.startsWith(str2)) {
                        epq.a(webView.getContext().getApplicationContext(), trim);
                        return true;
                    }
                }
                if (!StringUtils.isEmpty("https://shop.m.taobao.com/shop/shop_index.htm") && trim.startsWith("https://shop.m.taobao.com/shop/shop_index.htm")) {
                    epq.a(webView.getContext().getApplicationContext(), trim);
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
            kge.a(1008180185);
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
            i.a(DetailHybridWebView.TAG, "nav url in hybrid webview mode: " + DetailHybridWebView.this.strictNav + " url: " + str);
            if (DetailHybridWebView.this.strictNav) {
                return d.b(webView, str);
            }
            return d.a(webView, str);
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1fdfe7e4", new Object[]{this, webView, str, bitmap});
                return;
            }
            i.d(DetailHybridWebView.TAG, "url load started : " + str);
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ec29cb9d", new Object[]{this, webView, str});
                return;
            }
            i.d(DetailHybridWebView.TAG, "url load finished : " + str + "，progress: " + webView.getProgress());
            super.onPageFinished(webView, str);
            if (DetailHybridWebView.access$000(DetailHybridWebView.this) == null) {
                return;
            }
            DetailHybridWebView.access$000(DetailHybridWebView.this).a(webView, str);
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("51deb74c", new Object[]{this, webView, new Integer(i), str, str2});
                return;
            }
            i.d(DetailHybridWebView.TAG, "url load on error : " + str2);
            i.d(DetailHybridWebView.TAG, "url load error info : " + i + ", " + str);
            ecc.a(DetailHybridWebView.this.getContext(), str, str2);
            ecg.e(fpz.c(DetailHybridWebView.access$100(DetailHybridWebView.this)), "", str2, i + "", "url load on error : " + str);
            super.onReceivedError(webView, i, str, str2);
            if (DetailHybridWebView.access$200(DetailHybridWebView.this) == null) {
                return;
            }
            DetailHybridWebView.access$200(DetailHybridWebView.this).a(webView, i, str, str2);
        }
    }
}
