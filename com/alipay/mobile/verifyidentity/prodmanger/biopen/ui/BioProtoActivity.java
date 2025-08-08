package com.alipay.mobile.verifyidentity.prodmanger.biopen.ui;

import android.content.Context;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.alibaba.android.split.core.splitcompat.j;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.prodmanager.TitleBarAdapter;
import com.alipay.mobile.verifyidentity.ui.BaseVerifyActivity;
import com.alipay.mobile.verifyidentity.utils.CommonConstant;
import com.alipay.mobile.verifyidentity.utils.VIUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.k;
import com.taobao.taobao.R;
import java.lang.reflect.Method;
import tb.rrv;

/* loaded from: classes3.dex */
public class BioProtoActivity extends BaseVerifyActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    private static final String f6038a = "BioProtoActivity";
    private static String h = "https://d.alipay.com/agreement/zw.htm";
    private static String i = "https://render.alipay.com/p/f/fd-jgvlcrr0/index.html";
    private WebView b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;

    public static /* synthetic */ Object ipc$super(BioProtoActivity bioProtoActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode != 514894248) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.attachBaseContext((Context) objArr[0]);
            return null;
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

    public static /* synthetic */ String a(BioProtoActivity bioProtoActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("12221011", new Object[]{bioProtoActivity}) : bioProtoActivity.f;
    }

    public static /* synthetic */ void a(BioProtoActivity bioProtoActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6e07c79", new Object[]{bioProtoActivity, str});
        } else {
            bioProtoActivity.a(str);
        }
    }

    public static /* synthetic */ String b(BioProtoActivity bioProtoActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e1e243b0", new Object[]{bioProtoActivity}) : bioProtoActivity.c;
    }

    @Override // com.alipay.mobile.verifyidentity.ui.BaseVerifyActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Bundle extras;
        super.onCreate(bundle);
        setContentView(R.layout.bio_proto_webview);
        this.b = (WebView) findViewById(R.id.finger_agree_web);
        if (getIntent() != null && (extras = getIntent().getExtras()) != null) {
            this.c = extras.getString(rrv.PRODUCT_ID);
            this.e = extras.getString("protoUrl");
            this.f = extras.getString("bicListUrl");
            this.g = extras.getString("protocol_url");
        }
        WebView webView = this.b;
        if (!VIUtils.isInExport()) {
            VerifyLogCat.i(f6038a, "非输出，不处理");
        } else {
            try {
                Method method = webView.getClass().getMethod("removeJavascriptInterface", String.class);
                if (method != null) {
                    method.invoke(webView, "searchBoxJavaBridge_");
                    method.invoke(webView, "accessibility");
                    method.invoke(webView, "accessibilityTraversal");
                }
            } catch (Throwable unused) {
            }
            WebSettings settings = webView.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setJavaScriptCanOpenWindowsAutomatically(false);
            settings.setDomStorageEnabled(true);
            settings.setAllowFileAccess(false);
            settings.setSavePassword(false);
            settings.setSupportZoom(false);
            settings.setBuiltInZoomControls(false);
            settings.setLoadWithOverviewMode(true);
            settings.setUseWideViewPort(true);
        }
        if (!StringUtils.isEmpty(this.f)) {
            this.d = this.f;
        } else if (CommonConstant.FINGERPRINT_PAY.equalsIgnoreCase(this.c)) {
            a(getString(R.string.finger_proto));
            this.d = h;
        } else if (CommonConstant.FACEID_PAY.equalsIgnoreCase(this.c)) {
            a(getString(R.string.face_proto));
            this.d = i;
        } else if (CommonConstant.FACELOGIN.equalsIgnoreCase(this.c)) {
            this.d = this.e;
        } else if (CommonConstant.FACE_PAY.equalsIgnoreCase(this.c)) {
            this.d = this.g;
        }
        this.b.setWebViewClient(new WebViewClient() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioProtoActivity.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                if (str.hashCode() == 1835642644) {
                    super.onPageFinished((WebView) objArr[0], (String) objArr[1]);
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.webkit.WebViewClient
            public final boolean shouldOverrideUrlLoading(WebView webView2, String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("c6488b44", new Object[]{this, webView2, str})).booleanValue();
                }
                return true;
            }

            @Override // android.webkit.WebViewClient
            public final void onPageFinished(WebView webView2, String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("6d69af14", new Object[]{this, webView2, str});
                    return;
                }
                super.onPageFinished(webView2, str);
                String title = webView2.getTitle();
                if (StringUtils.isEmpty(title)) {
                    return;
                }
                if (!StringUtils.isEmpty(BioProtoActivity.a(BioProtoActivity.this))) {
                    BioProtoActivity.a(BioProtoActivity.this, title);
                }
                if (!CommonConstant.FACELOGIN.equalsIgnoreCase(BioProtoActivity.b(BioProtoActivity.this))) {
                    return;
                }
                BioProtoActivity.a(BioProtoActivity.this, title);
            }
        });
        this.b.loadUrl(this.d);
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        if (!StringUtils.isEmpty(str) && (str.contains(k.HTTPS_PREFIX) || str.contains(k.HTTP_PREFIX))) {
            VerifyLogCat.i(f6038a, "标题含有http url，不显示");
            str = "";
        }
        TitleBarAdapter titleBarAdapter = new TitleBarAdapter();
        titleBarAdapter.a(this, str, false);
        titleBarAdapter.f5944a = new TitleBarAdapter.OnLeftButtonClickListener() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioProtoActivity.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.mobile.verifyidentity.prodmanager.TitleBarAdapter.OnLeftButtonClickListener
            public final void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else {
                    BioProtoActivity.this.finish();
                }
            }
        };
    }
}
