package com.taobao.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.MenuItemCompat;
import android.taobao.windvane.extra.uc.WVUCWebViewClient;
import android.taobao.windvane.extra.uc.WVUCWebViewFragment;
import android.taobao.windvane.fragment.WVWebViewFragment;
import mtopsdk.common.util.StringUtils;
import android.view.Menu;
import android.view.MenuItem;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.BaseActivity;
import com.taobao.taobao.R;
import com.uc.webview.export.WebView;
import tb.kge;

/* loaded from: classes4.dex */
public class SimpleBrowserActivity extends BaseActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f8604a;
    private static String c;
    private WVUCWebViewFragment b;

    public static /* synthetic */ Object ipc$super(SimpleBrowserActivity simpleBrowserActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1635453101:
                return new Boolean(super.onCreateOptionsMenu((Menu) objArr[0]));
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        com.alibaba.android.split.core.splitcompat.j.b(context);
    }

    public static /* synthetic */ WVUCWebViewFragment a(SimpleBrowserActivity simpleBrowserActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WVUCWebViewFragment) ipChange.ipc$dispatch("6aac4742", new Object[]{simpleBrowserActivity}) : simpleBrowserActivity.b;
    }

    public static /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[0]) : c;
    }

    static {
        kge.a(196010290);
        c = "maliprod.alipay.com";
        f8604a = false;
    }

    @Override // com.taobao.tao.BaseActivity, android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        setTheme(R.style.Theme_NoBackgroundAndTitle);
        super.onCreate(bundle);
        setContentView(R.layout.wvfragementcontainer);
        Bundle bundle2 = new Bundle();
        Intent intent = getIntent();
        if (intent != null && !StringUtils.isEmpty(intent.getDataString())) {
            bundle2.putString(WVWebViewFragment.URL, intent.getDataString());
        } else if (intent != null) {
            bundle2 = intent.getExtras();
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
        this.b = new WVUCWebViewFragment(this);
        this.b.setWebViewClient(new a(this));
        this.b.setArguments(bundle2);
        beginTransaction.add(R.id.browser_fragment_layout, this.b);
        beginTransaction.commit();
        supportFragmentManager.executePendingTransactions();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
            return;
        }
        WVUCWebViewFragment wVUCWebViewFragment = this.b;
        if (wVUCWebViewFragment == null || wVUCWebViewFragment.onBackPressed()) {
            return;
        }
        finish();
    }

    @Override // com.taobao.tao.BaseActivity, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e84f753", new Object[]{this, menu})).booleanValue();
        }
        MenuItem icon = menu.add("刷新").setIcon(R.drawable.wv_icon_actionbar_refresh_48);
        MenuItemCompat.setShowAsAction(icon, 1);
        icon.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: com.taobao.android.SimpleBrowserActivity.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.MenuItem.OnMenuItemClickListener
            public boolean onMenuItemClick(MenuItem menuItem) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("f2df3d0b", new Object[]{this, menuItem})).booleanValue();
                }
                if (SimpleBrowserActivity.a(SimpleBrowserActivity.this).getWebView() != null) {
                    SimpleBrowserActivity.a(SimpleBrowserActivity.this).getWebView().reload();
                }
                return true;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        WVUCWebViewFragment wVUCWebViewFragment = this.b;
        if (wVUCWebViewFragment != null) {
            wVUCWebViewFragment.onActivityResult(i, i2, intent);
        }
        super.onActivityResult(i, i2, intent);
    }

    /* loaded from: classes4.dex */
    public static class a extends WVUCWebViewClient {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(-920155629);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == -1171743094) {
                super.onLoadResource((WebView) objArr[0], (String) objArr[1]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public a(Activity activity) {
            super(activity);
        }

        @Override // com.uc.webview.export.WebViewClient
        public void onLoadResource(WebView webView, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ba289e8a", new Object[]{this, webView, str});
                return;
            }
            if (str.contains(SimpleBrowserActivity.a())) {
                SimpleBrowserActivity.f8604a = true;
            }
            super.onLoadResource(webView, str);
        }
    }
}
