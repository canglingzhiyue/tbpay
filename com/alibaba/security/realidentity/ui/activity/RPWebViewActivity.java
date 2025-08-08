package com.alibaba.security.realidentity.ui.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import mtopsdk.common.util.StringUtils;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.ValueCallback;
import android.widget.FrameLayout;
import com.alibaba.android.split.core.splitcompat.j;
import com.alibaba.security.realidentity.RPEventListener;
import com.alibaba.security.realidentity.RPResult;
import com.alibaba.security.realidentity.c4;
import com.alibaba.security.realidentity.c5;
import com.alibaba.security.realidentity.e;
import com.alibaba.security.realidentity.e2;
import com.alibaba.security.realidentity.f2;
import com.alibaba.security.realidentity.g1;
import com.alibaba.security.realidentity.g2;
import com.alibaba.security.realidentity.service.track.RPTrack;
import com.alibaba.security.realidentity.service.track.model.LastExitTrackMsg;
import com.alibaba.security.realidentity.service.track.model.LastExitTrackMsgPage;
import com.alibaba.security.realidentity.service.track.model.TrackLog;
import com.alibaba.security.realidentity.ui.webview.adapter.BaseWebViewProxy;
import com.alibaba.security.realidentity.ui.webview.adapter.DnsHelper;
import com.alibaba.security.realidentity.ui.webview.adapter.IWebViewClientCallback;
import com.alibaba.security.realidentity.ui.webview.adapter.IdentityWebAdapterWrapper;
import com.alibaba.security.realidentity.ui.widgets.RPTopBar;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.framework.dns.storage.DnsPreference;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Map;
import tb.riy;

/* loaded from: classes3.dex */
public class RPWebViewActivity extends Activity implements c4 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String i = "RPWebViewActivity";
    public static final String j = "(function() {if(typeof(_windvane_backControl)!=='undefined') return _windvane_backControl(); else return 'false';})()";
    public static final String k = "(function() {if(typeof(window.WebViewJavaScriptBridge)!=='undefined') return 'true'; else return 'false';})()";
    public static final String l = "wvBackClickEvent";
    public static final String m = "rpOnBack";

    /* renamed from: a  reason: collision with root package name */
    public BaseWebViewProxy f3554a;
    public boolean d;
    public String e;
    public String f;
    public boolean g;
    public String b = "";
    public boolean c = false;
    public ValueCallback<String> h = new c();

    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                RPWebViewActivity.b(RPWebViewActivity.this).evaluateJavascript(RPWebViewActivity.a(RPWebViewActivity.this) ? RPWebViewActivity.j : RPWebViewActivity.k, RPWebViewActivity.this.h);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class b implements IWebViewClientCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* loaded from: classes3.dex */
        public class a implements DnsHelper.DnsWatcher {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f3557a;
            public final /* synthetic */ String b;
            public final /* synthetic */ int c;

            public a(String str, String str2, int i) {
                this.f3557a = str;
                this.b = str2;
                this.c = i;
            }

            @Override // com.alibaba.security.realidentity.ui.webview.adapter.DnsHelper.DnsWatcher
            public void onDnsResolved(Map<String, Boolean> map) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3a2fa3fc", new Object[]{this, map});
                    return;
                }
                RPWebViewActivity rPWebViewActivity = RPWebViewActivity.this;
                RPWebViewActivity.a(rPWebViewActivity, "onReceivedError: " + this.f3557a, this.b, this.c, this.f3557a, map);
            }
        }

        public b() {
        }

        @Override // com.alibaba.security.realidentity.ui.webview.adapter.IWebViewClientCallback
        public void onPageFinished(View view, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eff82655", new Object[]{this, view, str});
            } else if (RPWebViewActivity.c(RPWebViewActivity.this) || RPWebViewActivity.b(RPWebViewActivity.this).getProgress() != 100) {
            } else {
                RPWebViewActivity.a(RPWebViewActivity.this, "onPageFinished", str, "", "", true);
            }
        }

        @Override // com.alibaba.security.realidentity.ui.webview.adapter.IWebViewClientCallback
        public void onPageStarted(View view, String str, Bitmap bitmap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("91b8c0ac", new Object[]{this, view, str, bitmap});
            } else {
                RPWebViewActivity.a(RPWebViewActivity.this, str);
            }
        }

        @Override // com.alibaba.security.realidentity.ui.webview.adapter.IWebViewClientCallback
        public void onReceivedError(View view, int i, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7a7f0d94", new Object[]{this, view, new Integer(i), str, str2});
                return;
            }
            RPWebViewActivity.a(RPWebViewActivity.this, true);
            a aVar = new a(str, str2, i);
            RPWebViewActivity rPWebViewActivity = RPWebViewActivity.this;
            new DnsHelper(aVar, rPWebViewActivity, RPWebViewActivity.d(rPWebViewActivity)).execute(str2);
        }

        @Override // com.alibaba.security.realidentity.ui.webview.adapter.IWebViewClientCallback
        public void onReceivedHttpError(View view, Object obj, Object obj2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4504aec3", new Object[]{this, view, obj, obj2});
                return;
            }
            RPWebViewActivity rPWebViewActivity = RPWebViewActivity.this;
            RPWebViewActivity.a(rPWebViewActivity, "onReceivedHttpError", RPWebViewActivity.b(rPWebViewActivity).getOriginalUrl(), com.alibaba.security.realidentity.b.a(obj), com.alibaba.security.realidentity.b.a(obj2), false);
        }

        @Override // com.alibaba.security.realidentity.ui.webview.adapter.IWebViewClientCallback
        public void onReceivedSslError(View view, Object obj, Object obj2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c6650247", new Object[]{this, view, obj, obj2});
                return;
            }
            RPWebViewActivity rPWebViewActivity = RPWebViewActivity.this;
            RPWebViewActivity.a(rPWebViewActivity, "onReceivedSslError", RPWebViewActivity.b(rPWebViewActivity).getOriginalUrl(), (String) null, (String) null, false);
        }
    }

    /* loaded from: classes3.dex */
    public class c implements ValueCallback<String> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
                return;
            }
            if (RPTrack.a() == null) {
                RPTrack.a(RPWebViewActivity.e(RPWebViewActivity.this));
            }
            if (str != null && "true".equals(str.replace("\"", "").replace("'", ""))) {
                RPWebViewActivity.b(RPWebViewActivity.this).fireEvent(RPWebViewActivity.a(RPWebViewActivity.this) ? RPWebViewActivity.l : RPWebViewActivity.m, null);
            } else if (!RPWebViewActivity.b(RPWebViewActivity.this).canBack()) {
                RPEventListener h = g1.f().h();
                if (h != null) {
                    h.onFinish(RPResult.AUDIT_NOT, String.valueOf((int) e2.W), "执行H5方法失败");
                }
                RPWebViewActivity.this.finish();
            } else {
                RPWebViewActivity.b(RPWebViewActivity.this).goBack();
            }
        }

        @Override // android.webkit.ValueCallback
        public /* synthetic */ void onReceiveValue(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c60988b0", new Object[]{this, str});
            } else {
                a(str);
            }
        }
    }

    public static /* synthetic */ boolean a(RPWebViewActivity rPWebViewActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cd34eddd", new Object[]{rPWebViewActivity})).booleanValue() : rPWebViewActivity.g;
    }

    public static /* synthetic */ BaseWebViewProxy b(RPWebViewActivity rPWebViewActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BaseWebViewProxy) ipChange.ipc$dispatch("a61f1217", new Object[]{rPWebViewActivity}) : rPWebViewActivity.f3554a;
    }

    public static /* synthetic */ boolean c(RPWebViewActivity rPWebViewActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3ef5af1b", new Object[]{rPWebViewActivity})).booleanValue() : rPWebViewActivity.d;
    }

    public static /* synthetic */ String d(RPWebViewActivity rPWebViewActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("41a87aa", new Object[]{rPWebViewActivity}) : rPWebViewActivity.f;
    }

    public static /* synthetic */ LastExitTrackMsg e(RPWebViewActivity rPWebViewActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LastExitTrackMsg) ipChange.ipc$dispatch("1c69f17d", new Object[]{rPWebViewActivity}) : rPWebViewActivity.a();
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("windvane", Boolean.valueOf(this.g));
        TrackLog createSdkExceptionLog = TrackLog.createSdkExceptionLog("WebView UserAgent is NULL", com.alibaba.security.realidentity.b.a((Object) hashMap), "WebView UserAgent is NULL");
        createSdkExceptionLog.setCode(-1);
        a(this.f, createSdkExceptionLog);
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("windvane", Boolean.valueOf(this.g));
        hashMap.put(MspGlobalDefine.UA, this.f3554a.getUserAgentString());
        a(this.f, TrackLog.createSdkWebViewEnterLog(com.alibaba.security.realidentity.b.a((Object) hashMap)));
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("windvane", Boolean.valueOf(this.g));
        hashMap.put(MspGlobalDefine.UA, this.f3554a.getUserAgentString());
        TrackLog createSdkWebViewExitLog = TrackLog.createSdkWebViewExitLog();
        createSdkWebViewExitLog.setParams(com.alibaba.security.realidentity.b.a((Object) hashMap));
        a(this.f, createSdkWebViewExitLog);
    }

    public static /* synthetic */ Object ipc$super(RPWebViewActivity rPWebViewActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -884160602:
                return new Boolean(super.onKeyDown(((Number) objArr[0]).intValue(), (KeyEvent) objArr[1]));
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    private void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else {
            RPTrack.c();
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

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        requestWindowFeature(1);
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT != 26) {
            setRequestedOrientation(1);
        }
        setContentView(R.layout.rp_alrealidentity_activity_rph5);
        RPTopBar rPTopBar = (RPTopBar) findViewById(R.id.topBar);
        rPTopBar.setTitle(getString(R.string.title_rp_h5));
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("url");
        this.f = intent.getStringExtra("token");
        this.g = intent.getBooleanExtra(f2.d, true);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.browser_fragment_layout);
        BaseWebViewProxy webViewType = IdentityWebAdapterWrapper.getInstance().getWebViewType(this, this.f);
        this.f3554a = webViewType;
        View webView = webViewType.getWebView();
        if (webView == null) {
            finish();
            return;
        }
        this.f3554a.setUseWideViewPort(true);
        this.f3554a.showLoadingView();
        rPTopBar.getIvLeftParent().setOnClickListener(new a());
        frameLayout.addView(webView);
        String userAgentString = this.f3554a.getUserAgentString();
        if (StringUtils.isEmpty(userAgentString)) {
            f();
        }
        this.b = userAgentString;
        String str = g2.f3421a;
        this.f3554a.setUserAgentString(userAgentString + " " + f2.f3401a + "/" + str);
        this.d = false;
        c();
        this.f3554a.loadUrl(stringExtra);
        g();
        e.a(getWindow().getDecorView(), false);
        RPTrack.a((LastExitTrackMsg) null);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        try {
            if (this.f3554a != null) {
                this.f3554a.setUserAgentString(this.b);
                this.f3554a.destroy();
            }
            i();
            k();
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i2), keyEvent})).booleanValue();
        }
        if (i2 == 4) {
            this.f3554a.evaluateJavascript(this.g ? j : k, this.h);
            return true;
        }
        return super.onKeyDown(i2, keyEvent);
    }

    @Override // android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        BaseWebViewProxy baseWebViewProxy = this.f3554a;
        if (baseWebViewProxy != null) {
            baseWebViewProxy.resumeTimers();
        }
        c5.b(this, -1);
    }

    @Override // android.app.Activity
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        if (this.c) {
            return;
        }
        RPEventListener h = g1.f().h();
        if (h != null) {
            h.onStart();
        }
        this.c = true;
    }

    public static /* synthetic */ boolean a(RPWebViewActivity rPWebViewActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d969801f", new Object[]{rPWebViewActivity, new Boolean(z)})).booleanValue();
        }
        rPWebViewActivity.d = z;
        return z;
    }

    private RPTrack.LastExitTrackParams b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RPTrack.LastExitTrackParams) ipChange.ipc$dispatch("7b1a4d77", new Object[]{this});
        }
        RPTrack.LastExitTrackParams lastExitTrackParams = new RPTrack.LastExitTrackParams();
        lastExitTrackParams.url = this.f3554a.getUrl();
        return lastExitTrackParams;
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.f3554a.setWebViewClient(new b());
        }
    }

    public static /* synthetic */ void a(RPWebViewActivity rPWebViewActivity, String str, String str2, int i2, String str3, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("647eed05", new Object[]{rPWebViewActivity, str, str2, new Integer(i2), str3, map});
        } else {
            rPWebViewActivity.a(str, str2, i2, str3, map);
        }
    }

    public static /* synthetic */ String a(RPWebViewActivity rPWebViewActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("187b139d", new Object[]{rPWebViewActivity, str});
        }
        rPWebViewActivity.e = str;
        return str;
    }

    public static /* synthetic */ void a(RPWebViewActivity rPWebViewActivity, String str, String str2, String str3, String str4, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("201325f3", new Object[]{rPWebViewActivity, str, str2, str3, str4, new Boolean(z)});
        } else {
            rPWebViewActivity.a(str, str2, str3, str4, z);
        }
    }

    private void a(String str, String str2, String str3, String str4, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd749044", new Object[]{this, str, str2, str3, str4, new Boolean(z)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("windvane", Boolean.valueOf(this.g));
        hashMap.put("url", str2);
        hashMap.put(MspGlobalDefine.UA, this.f3554a.getUserAgentString());
        hashMap.put("request", str3);
        hashMap.put("error", str4);
        String a2 = com.alibaba.security.realidentity.b.a((Object) hashMap);
        a(this.f, TrackLog.createSdkWebViewLoadLog(str, a2, "{\"success\": " + z + riy.BLOCK_END_STR));
    }

    private void a(String str, String str2, int i2, String str3, Map<String, Boolean> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87190c54", new Object[]{this, str, str2, new Integer(i2), str3, map});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("windvane", Boolean.valueOf(this.g));
        hashMap.put("url", str2);
        hashMap.put(DnsPreference.KEY_IPS, map);
        hashMap.put("errorCode", String.valueOf(i2));
        hashMap.put(MspGlobalDefine.UA, this.f3554a.getUserAgentString());
        hashMap.put("description", str3);
        TrackLog createSdkWebViewErrorLog = TrackLog.createSdkWebViewErrorLog(str, com.alibaba.security.realidentity.b.a((Object) hashMap), "{\"success\": false}");
        createSdkWebViewErrorLog.setCode(-1);
        a(this.f, createSdkWebViewErrorLog);
    }

    @Override // com.alibaba.security.realidentity.c4
    public void a(String str, TrackLog trackLog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2970415f", new Object[]{this, str, trackLog});
            return;
        }
        trackLog.setVerifyToken(str);
        trackLog.addTag9(g2.f3421a + "/" + g2.b);
        trackLog.addTag10("Android");
        RPTrack.a(trackLog);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            ((RPTopBar) findViewById(R.id.topBar)).setTitle(str);
        }
    }

    private LastExitTrackMsg a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LastExitTrackMsg) ipChange.ipc$dispatch("5fabe20a", new Object[]{this});
        }
        LastExitTrackMsg lastExitTrackMsg = new LastExitTrackMsg();
        lastExitTrackMsg.page = LastExitTrackMsgPage.H5.getMsg();
        lastExitTrackMsg.view = "";
        lastExitTrackMsg.params = com.alibaba.security.realidentity.b.a(b());
        return lastExitTrackMsg;
    }
}
