package android.taobao.windvane.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.taobao.windvane.util.m;
import android.taobao.windvane.webview.WVWebChromeClient;
import android.taobao.windvane.webview.WVWebView;
import android.taobao.windvane.webview.WVWebViewClient;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class WVWebViewFragment extends Fragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static String TAG;
    public static String URL;
    private Activity activity;
    private WVWebView mWebView = null;
    private WVWebViewClient mWebclient = null;
    private WVWebChromeClient mChromeClient = null;
    private String url = null;

    public static /* synthetic */ Object ipc$super(WVWebViewFragment wVWebViewFragment, String str, Object... objArr) {
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
            case 1270686685:
                super.onLowMemory();
                return null;
            case 1330549917:
                super.onAttach((Activity) objArr[0]);
                return null;
            case 2127624665:
                super.onDetach();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    static {
        kge.a(2056433007);
        TAG = WVWebViewFragment.class.getSimpleName();
        URL = "url";
    }

    @Override // android.support.v4.app.Fragment
    public void onAttach(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f4e949d", new Object[]{this, activity});
            return;
        }
        super.onAttach(activity);
        this.activity = activity;
    }

    @Deprecated
    public WVWebViewFragment() {
    }

    public WVWebViewFragment(Activity activity) {
        this.activity = activity;
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
        WVWebView wVWebView = this.mWebView;
        if (wVWebView != null) {
            wVWebView.setVisibility(8);
            this.mWebView.removeAllViews();
            if (this.mWebView.getParent() != null) {
                ((ViewGroup) this.mWebView.getParent()).removeView(this.mWebView);
            }
            this.mWebView.loadUrl("about:blank");
            this.mWebView.destroy();
            this.mWebView = null;
        }
        this.activity = null;
        try {
            super.onDestroy();
        } catch (Exception unused) {
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onDetach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ed0f9d9", new Object[]{this});
        } else {
            super.onDetach();
        }
    }

    @Override // android.support.v4.app.Fragment, android.content.ComponentCallbacks
    public void onLowMemory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bbd23dd", new Object[]{this});
        } else {
            super.onLowMemory();
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        WVWebView wVWebView = this.mWebView;
        if (wVWebView != null) {
            wVWebView.onPause();
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
        WVWebView wVWebView = this.mWebView;
        if (wVWebView != null) {
            wVWebView.onResume();
        }
        super.onResume();
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        WVWebView wVWebView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        getWebView();
        String str = this.url;
        if (str == null || (wVWebView = this.mWebView) == null) {
            m.b(TAG, "image urls is null");
        } else {
            wVWebView.loadUrl(str);
        }
        return this.mWebView;
    }

    public void setWebViewClient(WVWebViewClient wVWebViewClient) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf31732d", new Object[]{this, wVWebViewClient});
        } else if (wVWebViewClient == null) {
        } else {
            this.mWebclient = wVWebViewClient;
            WVWebView wVWebView = this.mWebView;
            if (wVWebView == null) {
                return;
            }
            wVWebView.setWebViewClient(this.mWebclient);
        }
    }

    public void setWebchormeClient(WVWebChromeClient wVWebChromeClient) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc69ba3d", new Object[]{this, wVWebChromeClient});
        } else if (wVWebChromeClient == null) {
        } else {
            this.mChromeClient = wVWebChromeClient;
            WVWebView wVWebView = this.mWebView;
            if (wVWebView == null) {
                return;
            }
            wVWebView.setWebChromeClient(this.mChromeClient);
        }
    }

    public WebView getWebView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WebView) ipChange.ipc$dispatch("fb78e94f", new Object[]{this});
        }
        if (this.mWebView == null) {
            Context context = this.activity;
            if (context == null) {
                context = getActivity();
            }
            if (context == null) {
                return null;
            }
            this.mWebView = new WVWebView(context);
            setWebViewClient(this.mWebclient);
            setWebchormeClient(this.mChromeClient);
            this.mWebView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        }
        return this.mWebView;
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
        WVWebView wVWebView = this.mWebView;
        if (wVWebView == null) {
            return;
        }
        wVWebView.onActivityResult(i, i2, intent);
    }
}
