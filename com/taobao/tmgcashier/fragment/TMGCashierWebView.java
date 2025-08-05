package com.taobao.tmgcashier.fragment;

import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.tmgcashier.TMGCashierActivity;
import com.uc.webview.export.WebSettings;
import java.lang.reflect.Method;
import tb.kge;

/* loaded from: classes9.dex */
public class TMGCashierWebView extends Fragment {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CONTENT_HAS_NAV_BAR = "content_has_nav_bar";
    public static final String CONTENT_URL = "content_url";
    public static final String TAG = "TMGCashierWebView";
    public static String Tag;
    public boolean isWebviewAlive = true;
    public RelativeLayout mAPRelativeLayout;
    public ViewGroup mContentView;
    private int mHasNavBar;
    public Toolbar mToolbar;
    private String mUrl;
    public ViewGroup mViewGroup;
    private WVUCWebView mWebView;

    public static /* synthetic */ Object ipc$super(TMGCashierWebView tMGCashierWebView, String str, Object... objArr) {
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
            case 1860817453:
                super.onViewCreated((View) objArr[0], (Bundle) objArr[1]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    static {
        kge.a(1315421292);
        Tag = TAG;
    }

    public TMGCashierWebView(String str) {
        this.mUrl = str;
    }

    public TMGCashierWebView() {
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
        this.mHasNavBar = arguments.getInt(CONTENT_HAS_NAV_BAR, 0);
        this.mUrl = arguments.getString(CONTENT_URL);
    }

    @Override // android.support.v4.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee9d22d", new Object[]{this, view, bundle});
            return;
        }
        super.onViewCreated(view, bundle);
        try {
            if (this.mHasNavBar == 1) {
                initToolBar();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        initViews();
    }

    public void initViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffd024c5", new Object[]{this});
            return;
        }
        createWebView();
        init();
    }

    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.mAPRelativeLayout.addView(this.mWebView);
        setWebView(this.mWebView);
        webViewLoadUrl(this.mUrl);
    }

    public static void setWebView(WVUCWebView wVUCWebView) {
        wVUCWebView.setVerticalScrollbarOverlay(true);
        WebSettings settings = wVUCWebView.getSettings();
        settings.setSupportMultipleWindows(false);
        settings.setJavaScriptEnabled(true);
        settings.setSavePassword(false);
        settings.setJavaScriptCanOpenWindowsAutomatically(false);
        settings.setDomStorageEnabled(true);
        settings.setAppCachePath(wVUCWebView.getCurrentContext().getApplicationContext().getDir("cache", 0).getPath());
        settings.setAllowFileAccess(true);
        settings.setAppCacheEnabled(true);
        settings.setCacheMode(-1);
        settings.setBuiltInZoomControls(false);
        String str = "user agent=" + settings.getUserAgentString();
        if (Build.VERSION.SDK_INT >= 8) {
            try {
                Method method = wVUCWebView.getSettings().getClass().getMethod("setDomStorageEnabled", Boolean.TYPE);
                if (method != null) {
                    method.invoke(wVUCWebView.getSettings(), true);
                }
            } catch (Exception unused) {
            }
        }
        try {
            wVUCWebView.removeJavascriptInterface("searchBoxJavaBridge_");
            wVUCWebView.removeJavascriptInterface("accessibility");
            wVUCWebView.removeJavascriptInterface("accessibilityTraversal");
        } catch (Exception e) {
            e.printStackTrace();
        }
        wVUCWebView.setBackgroundColor(0);
        wVUCWebView.getBackground().setAlpha(0);
    }

    public void webViewLoadUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14e6fee1", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.mWebView.loadUrl(str);
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        if (this.isWebviewAlive) {
            try {
                this.mAPRelativeLayout.removeView(this.mWebView);
                this.mWebView.removeAllViews();
                this.mWebView.setVisibility(8);
                this.mWebView.destroy();
            } finally {
                try {
                } finally {
                }
            }
        }
        super.onDestroy();
    }

    @Override // android.support.v4.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        WVUCWebView wVUCWebView = this.mWebView;
        if (wVUCWebView != null) {
            wVUCWebView.onPause();
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
        WVUCWebView wVUCWebView = this.mWebView;
        if (wVUCWebView != null) {
            wVUCWebView.onResume();
        }
        super.onResume();
    }

    public void createWebView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1a95184", new Object[]{this});
            return;
        }
        try {
            this.mWebView = new WVUCWebView(getActivity());
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.mWebView.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
    }

    @Override // android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        View inflate = layoutInflater.inflate(R.layout.tmg_cashier_container, viewGroup, false);
        this.mViewGroup = (ViewGroup) inflate.findViewById(R.id.aliuser_main_content);
        this.mContentView = (ViewGroup) inflate.findViewById(R.id.aliuser_content);
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.tmg_cashier_webview, this.mViewGroup, false);
        this.mAPRelativeLayout = (RelativeLayout) viewGroup2.findViewById(R.id.cash_webview_contain);
        this.mContentView.addView(viewGroup2);
        return inflate;
    }

    public void initToolBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b52eb32", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(getContext()).inflate(R.layout.tmg_cashier_toolbar, this.mViewGroup, false);
        this.mToolbar = (Toolbar) viewGroup.findViewById(R.id.aliuser_toolbar);
        if (!(this.mViewGroup.getChildAt(0) instanceof AppBarLayout)) {
            this.mViewGroup.addView(viewGroup, 0);
        }
        ((TMGCashierActivity) getActivity()).setSupportActionBar(this.mToolbar);
        setNavigationBackIcon();
        this.mToolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: com.taobao.tmgcashier.fragment.-$$Lambda$TMGCashierWebView$enaxew9IDgBtro58YMWjkdsDano
            {
                TMGCashierWebView.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TMGCashierWebView.this.lambda$initToolBar$0$TMGCashierWebView(view);
            }
        });
        this.mToolbar.setNavigationContentDescription(R.string.cash_title_back);
    }

    public /* synthetic */ void lambda$initToolBar$0$TMGCashierWebView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6f66bd1", new Object[]{this, view});
        } else {
            getActivity().finish();
        }
    }

    public void setNavigationBackIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21d761bd", new Object[]{this});
            return;
        }
        Toolbar toolbar = this.mToolbar;
        if (toolbar == null) {
            return;
        }
        toolbar.setNavigationIcon(R.drawable.tmg_cashier_actionbar_back);
    }

    public String getBundleUrl() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("dee20482", new Object[]{this}) : this.mUrl;
    }
}
