package com.taobao.android.lightvane.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.lightvane.webview.LVWebChromeClient;
import com.taobao.android.lightvane.webview.LVWebView;
import com.taobao.android.lightvane.webview.LVWebViewClient;
import tb.gwo;
import tb.kge;

/* loaded from: classes5.dex */
public class LVWebViewFragment extends Fragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String TAG;
    public static String URL;
    private LVWebView webView = null;
    private LVWebViewClient webclient = null;
    private LVWebChromeClient chromeClient = null;
    private View errorView = null;
    private String url = null;

    public static /* synthetic */ Object ipc$super(LVWebViewFragment lVWebViewFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public View onWebViewCreateFail(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("a772dafc", new Object[]{this, th});
        }
        return null;
    }

    static {
        kge.a(329280170);
        TAG = LVWebViewFragment.class.getSimpleName();
        URL = "url";
    }

    @Override // android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            return;
        }
        this.url = arguments.getString(URL);
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        LVWebView lVWebView = this.webView;
        if (lVWebView != null) {
            lVWebView.setVisibility(8);
            this.webView.removeAllViews();
            if (this.webView.getParent() != null) {
                ((ViewGroup) this.webView.getParent()).removeView(this.webView);
            }
            this.webView.loadUrl("about:blank");
            this.webView.destroy();
            this.webView = null;
        }
        try {
            super.onDestroy();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        LVWebView lVWebView = this.webView;
        if (lVWebView != null) {
            lVWebView.onPause();
        }
        super.onPause();
    }

    @Override // android.support.v4.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        LVWebView lVWebView = this.webView;
        if (lVWebView != null) {
            lVWebView.onResume();
        }
        super.onResume();
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LVWebView lVWebView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        try {
            this.webView = onCreateWebView(requireContext());
        } catch (Throwable th) {
            th.printStackTrace();
            this.errorView = onWebViewCreateFail(th);
        }
        LVWebViewClient lVWebViewClient = this.webclient;
        if (lVWebViewClient != null) {
            setWebViewClient(lVWebViewClient);
        }
        LVWebChromeClient lVWebChromeClient = this.chromeClient;
        if (lVWebChromeClient != null) {
            setWebChromeClient(lVWebChromeClient);
        }
        if (this.webView != null) {
            this.webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        }
        String str = this.url;
        if (str == null || (lVWebView = this.webView) == null) {
            gwo.a(6, TAG, "image urls is null");
            if (this.webView == null) {
                View view = this.errorView;
                if (view != null) {
                    return view;
                }
                this.errorView = createDefaultErrorView();
                return this.errorView;
            }
        } else {
            lVWebView.loadUrl(str);
        }
        return this.webView;
    }

    private View createDefaultErrorView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("1702a7b1", new Object[]{this});
        }
        TextView textView = new TextView(getContext());
        textView.setText("未找到系统浏览器");
        textView.setGravity(17);
        return textView;
    }

    public LVWebView onCreateWebView(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LVWebView) ipChange.ipc$dispatch("118c4bb3", new Object[]{this, context}) : new LVWebView(context);
    }

    public void setWebViewClient(LVWebViewClient lVWebViewClient) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc6367fe", new Object[]{this, lVWebViewClient});
        } else if (lVWebViewClient == null) {
        } else {
            this.webclient = lVWebViewClient;
            LVWebView lVWebView = this.webView;
            if (lVWebView == null) {
                return;
            }
            lVWebView.setWebViewClient(this.webclient);
        }
    }

    public void setWebChromeClient(LVWebChromeClient lVWebChromeClient) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a60705e", new Object[]{this, lVWebChromeClient});
        } else if (lVWebChromeClient == null) {
        } else {
            this.chromeClient = lVWebChromeClient;
            LVWebView lVWebView = this.webView;
            if (lVWebView == null) {
                return;
            }
            lVWebView.setWebChromeClient(this.chromeClient);
        }
    }

    public WebView getWebView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WebView) ipChange.ipc$dispatch("fb78e94f", new Object[]{this}) : this.webView;
    }

    public boolean onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88afc67", new Object[]{this})).booleanValue();
        }
        if (getWebView() == null || !getWebView().canGoBack()) {
            return false;
        }
        getWebView().goBack();
        return true;
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        LVWebView lVWebView = this.webView;
        if (lVWebView == null) {
            return;
        }
        lVWebView.onActivityResult(i, i2, intent);
    }
}
