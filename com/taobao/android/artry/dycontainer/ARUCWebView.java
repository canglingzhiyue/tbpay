package com.taobao.android.artry.dycontainer;

import android.content.Context;
import android.net.Uri;
import android.taobao.windvane.extra.uc.WVUCWebChromeClient;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.extra.uc.WVUCWebViewClient;
import android.taobao.windvane.webview.IWVWebView;
import mtopsdk.common.util.StringUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.FrameLayout;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.artry.utils.d;
import com.taobao.android.nav.Nav;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.uc.webview.export.JsResult;
import com.uc.webview.export.WebSettings;
import com.uc.webview.export.WebView;
import java.util.Map;
import tb.aet;
import tb.aew;
import tb.dqe;
import tb.kge;

/* loaded from: classes4.dex */
public class ARUCWebView extends WVUCWebView implements aew {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int MAX_CACHE_SIZE = 8388608;
    private static final String TAG = "ARUCWebView";
    private Context mContext;
    private Uri mCurrentUri;
    private TUrlImageView mLogoView;
    private FrameLayout mWebWaitingView;

    static {
        kge.a(-1160164993);
        kge.a(-929766110);
    }

    public static /* synthetic */ Object ipc$super(ARUCWebView aRUCWebView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1983604863) {
            super.destroy();
            return null;
        } else if (hashCode != 490249163) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.loadUrl((String) objArr[0], (Map) objArr[1]);
            return null;
        }
    }

    @Override // tb.aew
    public boolean isNeedupdateURLRule(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d8ad454f", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        return false;
    }

    @Override // tb.aew
    public boolean isOpenURLIntercept() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3e6c8dd2", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.aew
    public void updateURLRule() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3db7cb89", new Object[]{this});
        }
    }

    public ARUCWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }

    public ARUCWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public ARUCWebView(Context context) {
        super(context);
        init(context);
    }

    public void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        this.mContext = context.getApplicationContext();
        setScrollBarStyle(0);
        WebSettings settings = getSettings();
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(false);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
        settings.setAppCacheMaxSize(8388608L);
        settings.setDatabaseEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        setInitialScale(0);
        aet.a(this);
        setWebViewClient(new WVUCWebViewClient(context));
        setWebChromeClient(new a());
        initLoadingView(context);
        initLogoView(context);
    }

    private void initLoadingView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e3caff0", new Object[]{this, context});
            return;
        }
        this.mWebWaitingView = new FrameLayout(context);
        addView(this.mWebWaitingView, new FrameLayout.LayoutParams(-1, -1));
        this.mWebWaitingView.setBackgroundColor(-1);
        this.mWebWaitingView.setVisibility(8);
    }

    private void initLogoView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5a97101", new Object[]{this, context});
            return;
        }
        this.mLogoView = new TUrlImageView(context);
        this.mLogoView.setImageUrl("https://gw.alicdn.com/imgextra/i3/O1CN015c5zOm1l8XcoDqJiK_!!6000000004774-2-tps-360-360.png");
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.artry_logo_size);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
        layoutParams.gravity = 17;
        this.mWebWaitingView.addView(this.mLogoView, layoutParams);
    }

    @Override // android.taobao.windvane.extra.uc.WVUCWebView, com.uc.webview.export.WebView
    public void loadUrl(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d389bcb", new Object[]{this, str, map});
            return;
        }
        super.loadUrl(str, map);
        try {
            if (!d.a(str)) {
                return;
            }
            this.mCurrentUri = Uri.parse(str);
        } catch (Throwable unused) {
        }
    }

    public void showLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73936486", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = this.mWebWaitingView;
        if (frameLayout == null) {
            return;
        }
        frameLayout.setVisibility(0);
    }

    public void hideLoading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aee4b521", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = this.mWebWaitingView;
        if (frameLayout == null) {
            return;
        }
        frameLayout.setVisibility(8);
    }

    @Override // tb.aew
    public boolean shouldOverrideUrlLoading(Context context, IWVWebView iWVWebView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8e91d587", new Object[]{this, context, iWVWebView, str})).booleanValue();
        }
        if (d.a(str)) {
            Uri uri = null;
            try {
                uri = Uri.parse(str);
            } catch (Throwable unused) {
            }
            if (uri != null && this.mCurrentUri != null && StringUtils.equals(uri.getHost(), this.mCurrentUri.getHost()) && StringUtils.equals(uri.getPath(), this.mCurrentUri.getPath())) {
                reload();
            } else {
                try {
                    return Nav.from(this.mContext).toUri(str);
                } catch (Throwable unused2) {
                    Log.e(TAG, "failed navigate the url[%s]..." + str);
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
        aet.a(null);
    }

    /* loaded from: classes4.dex */
    public static class a extends WVUCWebChromeClient {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1530314507);
        }

        private a() {
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebChromeClient, com.uc.webview.export.WebChromeClient
        public boolean onJsAlert(final WebView webView, String str, final String str2, JsResult jsResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("16bdf0ae", new Object[]{this, webView, str, str2, jsResult})).booleanValue();
            }
            dqe.a().post(new Runnable() { // from class: com.taobao.android.artry.dycontainer.ARUCWebView.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    Context context;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    WebView webView2 = webView;
                    if (webView2 == null || (context = webView2.getContext()) == null) {
                        return;
                    }
                    Toast.makeText(context, str2, 0).show();
                }
            });
            if (jsResult != null) {
                jsResult.confirm();
            }
            return true;
        }
    }
}
