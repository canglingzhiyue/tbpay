package com.taobao.android.trade.cart;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v4.widget.SwipeRefreshLayout;
import android.taobao.windvane.extra.uc.WVUCWebChromeClient;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.extra.uc.WVUCWebViewClient;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.trade.cart.constant.CartFrom;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.tao.TBBaseFragment;
import com.taobao.tao.TBMainHost;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.TBActionView;
import com.taobao.uikit.actionbar.TBPublicMenu;
import com.taobao.uikit.extend.component.TBProgressBar;
import com.uc.webview.export.WebView;
import tb.jjn;
import tb.jjq;
import tb.kge;

/* loaded from: classes6.dex */
public class CartWebFragment extends TBBaseFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_CART_REFRESH_DATA = "cartRefreshData";
    private static final String ARG_DEGRADE_H5 = "Page_ShoppingCart_DegradeH5";
    private static final int REFRESH_ICON_DISMISS_KEY = 1;
    private static final String TEXT_URL_PARAMS_WITHOUT_BACK_BUTTON = "hasback=false";
    private static final String TEXT_URL_PARAMS_WITHOUT_NATIVE_BAR = "disableNav=YES";
    private static final String TEXT_URL_PARAMS_WITH_BACK_BUTTON = "hasback=true";
    private TBActionView btnActionBack;
    private TBActionView btnActionMenu;
    private TBActionView btnActionRefreshCart;
    private final Handler handler = new Handler(new Handler.Callback() { // from class: com.taobao.android.trade.cart.CartWebFragment.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
            }
            if (message.what != 1) {
                return false;
            }
            CartWebFragment.access$000(CartWebFragment.this).setRefreshing(false);
            return true;
        }
    });
    private final BroadcastReceiver mReceiver = new BroadcastReceiver() { // from class: com.taobao.android.trade.cart.CartWebFragment.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (CartWebFragment.access$100(CartWebFragment.this) == null) {
            } else {
                CartWebFragment.access$100(CartWebFragment.this).reload();
            }
        }
    };
    private String mUrl;
    private WVUCWebView mWebView;
    private TBProgressBar progressBar;
    private int scrollY;
    private SwipeRefreshLayout swipeRefreshLayout;
    private View tbInsetToolbar;
    private TBPublicMenu tbPublicMenu;

    static {
        kge.a(1973527123);
    }

    public static /* synthetic */ Object ipc$super(CartWebFragment cartWebFragment, String str, Object... objArr) {
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
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static /* synthetic */ SwipeRefreshLayout access$000(CartWebFragment cartWebFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SwipeRefreshLayout) ipChange.ipc$dispatch("ca8bf169", new Object[]{cartWebFragment}) : cartWebFragment.swipeRefreshLayout;
    }

    public static /* synthetic */ WVUCWebView access$100(CartWebFragment cartWebFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WVUCWebView) ipChange.ipc$dispatch("4644dd21", new Object[]{cartWebFragment}) : cartWebFragment.mWebView;
    }

    public static /* synthetic */ Handler access$200(CartWebFragment cartWebFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("213e62f1", new Object[]{cartWebFragment}) : cartWebFragment.handler;
    }

    public static /* synthetic */ int access$300(CartWebFragment cartWebFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("34a23c47", new Object[]{cartWebFragment})).intValue() : cartWebFragment.scrollY;
    }

    public static /* synthetic */ int access$302(CartWebFragment cartWebFragment, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7a1b2424", new Object[]{cartWebFragment, new Integer(i)})).intValue();
        }
        cartWebFragment.scrollY = i;
        return i;
    }

    public static /* synthetic */ TBProgressBar access$400(CartWebFragment cartWebFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBProgressBar) ipChange.ipc$dispatch("12ee38d3", new Object[]{cartWebFragment}) : cartWebFragment.progressBar;
    }

    public static /* synthetic */ TBPublicMenu access$500(CartWebFragment cartWebFragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBPublicMenu) ipChange.ipc$dispatch("76472efb", new Object[]{cartWebFragment}) : cartWebFragment.tbPublicMenu;
    }

    @Override // com.taobao.tao.TBBaseFragment
    public void handleLoginAction(LoginAction loginAction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e52feba", new Object[]{this, loginAction});
            return;
        }
        WVUCWebView wVUCWebView = this.mWebView;
        if (wVUCWebView == null) {
            return;
        }
        wVUCWebView.reload();
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        getActivity().getWindow().setSoftInputMode(32);
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        if (this.mRootView == null) {
            this.mRootView = layoutInflater.inflate(R.layout.cart_degrade_h5_fragment, viewGroup, false);
            this.mWebView = (WVUCWebView) this.mRootView.findViewById(R.id.webview_h5_container);
            initData();
            selectAndInitTopView();
            initWebView();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("url", (Object) this.mUrl);
            jjq.a(ARG_DEGRADE_H5, jSONObject.toJSONString());
        }
        return this.mRootView;
    }

    private void initData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1ae4861", new Object[]{this});
            return;
        }
        this.swipeRefreshLayout = (SwipeRefreshLayout) this.mRootView.findViewById(R.id.cart_h5_refresh);
        this.btnActionMenu = (TBActionView) this.mRootView.findViewById(R.id.btn_action_menu);
        this.btnActionBack = (TBActionView) this.mRootView.findViewById(R.id.btn_action_back);
        this.btnActionRefreshCart = (TBActionView) this.mRootView.findViewById(R.id.btn_action_refresh_cart);
        this.tbInsetToolbar = this.mRootView.findViewById(R.id.top_bar);
        this.progressBar = (TBProgressBar) this.mRootView.findViewById(R.id.load_progress);
        this.tbPublicMenu = new TBPublicMenu(getActivity());
        this.swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() { // from class: com.taobao.android.trade.cart.CartWebFragment.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener
            public void onRefresh() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("c9cbba83", new Object[]{this});
                    return;
                }
                CartWebFragment.access$200(CartWebFragment.this).sendEmptyMessageDelayed(1, 500L);
                CartWebFragment.access$100(CartWebFragment.this).reload();
            }
        });
        this.swipeRefreshLayout.setOnChildScrollUpCallback(new SwipeRefreshLayout.OnChildScrollUpCallback() { // from class: com.taobao.android.trade.cart.CartWebFragment.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.support.v4.widget.SwipeRefreshLayout.OnChildScrollUpCallback
            public boolean canChildScrollUp(SwipeRefreshLayout swipeRefreshLayout, View view) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("896677b1", new Object[]{this, swipeRefreshLayout, view})).booleanValue() : Build.VERSION.SDK_INT >= 23 ? CartWebFragment.access$300(CartWebFragment.this) > 0 : CartWebFragment.access$100(CartWebFragment.this).getChildAt(0).getScrollY() > 0;
            }
        });
        if (Build.VERSION.SDK_INT >= 23) {
            this.mWebView.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.taobao.android.trade.cart.CartWebFragment.6
                @Override // android.view.View.OnScrollChangeListener
                public void onScrollChange(View view, int i, int i2, int i3, int i4) {
                    CartWebFragment.access$302(CartWebFragment.this, i2);
                }
            });
        }
        this.progressBar.setProgress(0);
        this.mUrl = extractCustomParamsInfo(getContext(), "downGradeUrl");
        if (TextUtils.isEmpty(this.mUrl)) {
            this.mUrl = jjn.b(getActivity().getIntent());
            if (CartFrom.TAOBAO_CLIENT.equals(jjn.a(getActivity().getIntent()))) {
                addParams(TEXT_URL_PARAMS_WITHOUT_NATIVE_BAR);
                addParams(TBMainHost.fromActivity(getActivity()) != null ? TEXT_URL_PARAMS_WITHOUT_BACK_BUTTON : TEXT_URL_PARAMS_WITH_BACK_BUTTON);
            }
        }
        registerReceiver();
    }

    private void addParams(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acc6ecd8", new Object[]{this, str});
        } else if (TextUtils.isEmpty(this.mUrl)) {
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(this.mUrl);
            String str2 = "?";
            if (this.mUrl.contains(str2)) {
                str2 = "&";
            }
            sb.append(str2);
            this.mUrl = sb.toString();
            this.mUrl += str;
        }
    }

    private void selectAndInitTopView() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93d1fd36", new Object[]{this});
            return;
        }
        RelativeLayout relativeLayout = (RelativeLayout) this.mRootView.findViewById(R.id.action_bar);
        boolean contains = this.mUrl.contains(TEXT_URL_PARAMS_WITHOUT_NATIVE_BAR);
        if (contains) {
            i = 8;
        }
        relativeLayout.setVisibility(i);
        ((LinearLayout.LayoutParams) this.tbInsetToolbar.getLayoutParams()).height = SystemBarDecorator.SystemBarConfig.getStatusBarHeight(getContext());
        if (contains) {
            this.tbInsetToolbar.setBackgroundResource(R.drawable.cart_h5_topbar_orange_background);
            this.tbInsetToolbar.setAlpha(1.0f);
        } else {
            this.tbInsetToolbar.setBackgroundColor(-16777216);
            this.tbInsetToolbar.setAlpha(0.5f);
            setOnClick();
        }
        this.swipeRefreshLayout.setEnabled(contains);
    }

    private void initWebView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("407bf8f0", new Object[]{this});
            return;
        }
        this.mWebView.setWebViewClient(new WVUCWebViewClient(getContext()) { // from class: com.taobao.android.trade.cart.CartWebFragment.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass7 anonymousClass7, String str, Object... objArr) {
                int hashCode = str.hashCode();
                if (hashCode == -332805219) {
                    super.onPageFinished((WebView) objArr[0], (String) objArr[1]);
                    return null;
                } else if (hashCode != 534767588) {
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                } else {
                    super.onPageStarted((WebView) objArr[0], (String) objArr[1], (Bitmap) objArr[2]);
                    return null;
                }
            }

            @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
            public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1fdfe7e4", new Object[]{this, webView, str, bitmap});
                    return;
                }
                super.onPageStarted(webView, str, bitmap);
                CartWebFragment.access$400(CartWebFragment.this).setProgress(0);
                CartWebFragment.access$400(CartWebFragment.this).setVisibility(0);
            }

            @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ec29cb9d", new Object[]{this, webView, str});
                    return;
                }
                super.onPageFinished(webView, str);
                CartWebFragment.access$400(CartWebFragment.this).setProgress(100);
                CartWebFragment.access$400(CartWebFragment.this).setVisibility(8);
            }
        });
        this.mWebView.setWebChromeClient(new WVUCWebChromeClient() { // from class: com.taobao.android.trade.cart.CartWebFragment.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass8 anonymousClass8, String str, Object... objArr) {
                if (str.hashCode() == -1540056808) {
                    super.onProgressChanged((WebView) objArr[0], ((Number) objArr[1]).intValue());
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.taobao.windvane.extra.uc.WVUCWebChromeClient, com.uc.webview.export.WebChromeClient
            public void onProgressChanged(WebView webView, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a4349918", new Object[]{this, webView, new Integer(i)});
                    return;
                }
                super.onProgressChanged(webView, i);
                if (i == 100) {
                    CartWebFragment.access$400(CartWebFragment.this).setProgress(0);
                } else {
                    CartWebFragment.access$400(CartWebFragment.this).setProgress(i);
                }
            }
        });
        this.mWebView.loadUrl(this.mUrl);
    }

    private void setOnClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9333d2e", new Object[]{this});
            return;
        }
        this.btnActionMenu.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.trade.cart.CartWebFragment.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (!(CartWebFragment.this.getActivity() instanceof CartActivity) || CartWebFragment.this.getActivity().isFinishing()) {
                } else {
                    CartWebFragment.access$500(CartWebFragment.this).show();
                }
            }
        });
        this.btnActionBack.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.trade.cart.CartWebFragment.10
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    CartWebFragment.this.getActivity().finish();
                }
            }
        });
        this.btnActionRefreshCart.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.trade.cart.CartWebFragment.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    CartWebFragment.access$100(CartWebFragment.this).refresh();
                }
            }
        });
    }

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
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

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
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

    @Override // com.taobao.tao.TBBaseFragment, com.taobao.tao.tbmainfragment.SupportFragment, android.support.v4.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        WVUCWebView wVUCWebView = this.mWebView;
        if (wVUCWebView != null) {
            wVUCWebView.destroy();
        }
        unregisterReceiver();
        super.onDestroy();
    }

    @Override // android.support.v4.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        WVUCWebView wVUCWebView = this.mWebView;
        if (wVUCWebView != null) {
            wVUCWebView.onActivityResult(i, i2, intent);
        }
        super.onActivityResult(i, i2, intent);
    }

    private void registerReceiver() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b22c8539", new Object[]{this});
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("cartRefreshData");
        intentFilter.addCategory("android.intent.category.DEFAULT");
        LocalBroadcastManager.getInstance(getActivity()).registerReceiver(this.mReceiver, intentFilter);
    }

    private void unregisterReceiver() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97044d52", new Object[]{this});
        } else {
            LocalBroadcastManager.getInstance(getActivity()).unregisterReceiver(this.mReceiver);
        }
    }

    private String extractCustomParamsInfo(Context context, String str) {
        Uri data;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4e9f1b9b", new Object[]{this, context, str});
        }
        Intent intent = context instanceof Activity ? ((Activity) context).getIntent() : null;
        if (intent == null || TextUtils.isEmpty(str) || (data = intent.getData()) == null) {
            return null;
        }
        try {
            return JSON.parseObject(data.getQueryParameter("customParams")).getString(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
