package com.taobao.android.address;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.extra.uc.WVUCWebViewClient;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import android.text.TextUtils;
import android.widget.ProgressBar;
import com.alibaba.android.split.core.splitcompat.j;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.tlog.adapter.AdapterForTLog;
import com.uc.webview.export.WebView;
import tb.dof;
import tb.efe;
import tb.mqt;
import tb.riu;

/* loaded from: classes4.dex */
public class H5PopActivity extends AppCompatActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PAGE_NAME = "Page_AddressH5";
    public static final String TAG = "addressH5";
    public static boolean f = false;

    /* renamed from: a  reason: collision with root package name */
    public WVUCWebView f8959a;
    public ProgressBar b;
    private long c;
    private long d;
    private long e;

    public static /* synthetic */ Object ipc$super(H5PopActivity h5PopActivity, String str, Object... objArr) {
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
            case 143326307:
                super.onBackPressed();
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1150324634:
                super.finish();
                return null;
            case 1264052993:
                super.onNewIntent((Intent) objArr[0]);
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
        j.b(context);
    }

    public static /* synthetic */ long a(H5PopActivity h5PopActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6b98c4a6", new Object[]{h5PopActivity})).longValue() : h5PopActivity.e;
    }

    public static /* synthetic */ long b(H5PopActivity h5PopActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e112eae7", new Object[]{h5PopActivity})).longValue() : h5PopActivity.c;
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.support.v4.app.SupportActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        this.c = System.currentTimeMillis();
        dof.a("createH5Act", "" + this.c, "", null);
        setContentView(R.layout.aliuser_h5_pop_container);
        a();
        mqt.a(0);
    }

    @Override // android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        super.finish();
        this.d = System.currentTimeMillis();
        dof.a("finishH5Act", "" + this.d, String.valueOf(this.d - this.c), null);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        super.onNewIntent(intent);
        b();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        if (getSupportActionBar() != null) {
            getSupportActionBar().e();
        }
        efe.a((Activity) this);
        this.b = (ProgressBar) findViewById(R.id.address_progress);
        this.b.setVisibility(efe.c("address_show_h5_loading") ? 0 : 8);
        this.e = System.currentTimeMillis();
        dof.a("create_h5", "" + this.e, String.valueOf(this.e - this.c), null);
        this.f8959a = (WVUCWebView) findViewById(R.id.address_h5_webview);
        this.f8959a.setBackgroundColor(0);
        this.f8959a.getSettings().setJavaScriptEnabled(efe.c("h5_containter_use_js"));
        this.f8959a.setWebViewClient(new WVUCWebViewClient(this) { // from class: com.taobao.android.address.H5PopActivity.1
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public long b = 0;
            public long c = 0;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
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
                H5PopActivity.this.b.setVisibility(8);
                this.b = System.currentTimeMillis();
                dof.a("start_h5_render", "" + this.b, String.valueOf(this.b - H5PopActivity.a(H5PopActivity.this)), null);
            }

            @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ec29cb9d", new Object[]{this, webView, str});
                    return;
                }
                super.onPageFinished(webView, str);
                this.c = System.currentTimeMillis();
                dof.a("finish_h5_page", "" + this.c, String.valueOf(this.c - this.b), null);
                dof.a("success_h5_page", "" + this.c, String.valueOf(this.c - H5PopActivity.b(H5PopActivity.this)), null);
            }
        });
        b();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        String stringExtra = getIntent().getStringExtra(riu.e);
        AdapterForTLog.logd(TAG, "load url=" + stringExtra);
        if (TextUtils.isEmpty(stringExtra)) {
            return;
        }
        this.f8959a.loadUrl(stringExtra);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        this.f8959a.onResume();
        WVStandardEventCenter.postNotificationToJS(this.f8959a, "address_h5_web_resume", "");
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        this.f8959a.onPause();
        WVStandardEventCenter.postNotificationToJS(this.f8959a, "address_h5_web_pause", "");
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        WVStandardEventCenter.postNotificationToJS(this.f8959a, "address_h5_web_stop", "");
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
        } else if (f) {
            WVStandardEventCenter.postNotificationToJS(this.f8959a, "address_h5_web_back", "");
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.support.v7.app.AppCompatActivity, android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        this.f8959a.destroy();
        f = false;
        WVStandardEventCenter.postNotificationToJS(this.f8959a, "address_h5_web_destory", "");
    }
}
