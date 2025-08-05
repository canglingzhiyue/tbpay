package com.taobao.tab2interact.core.layer.h5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.taobao.windvane.extra.uc.WVUCWebViewClient;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import android.view.View;
import android.webkit.ValueCallback;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.sdk.app.statistic.StatisticRecord;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.l;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.tab2interact.core.data.baseinfo.PageBaseInfo;
import com.taobao.tab2interact.core.data.baseinfo.TabBaseInfo;
import com.taobao.tab2interact.core.layer.h5.view.H5InteractLayerWebView;
import com.taobao.tao.Globals;
import com.taobao.taobao.R;
import com.uc.webview.export.SslErrorHandler;
import com.uc.webview.export.WebSettings;
import com.uc.webview.export.WebView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import tb.iqw;
import tb.kge;
import tb.ohd;
import tb.skq;
import tb.smt;
import tb.smu;
import tb.sup;
import tb.suq;
import tb.sur;
import tb.sus;
import tb.sut;
import tb.suu;
import tb.suw;

/* loaded from: classes8.dex */
public final class a extends smt implements smu.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final C0822a Companion;

    /* renamed from: a */
    private FrameLayout f19767a;
    private H5InteractLayerWebView b;
    private JSONObject c;
    private smu d;
    private final Handler e;
    private boolean f;
    private boolean g;
    private Boolean h;
    private long i;
    private long j;
    private long k;
    private e l;
    private Boolean m;
    private BroadcastReceiver n;
    private boolean o;
    private boolean p;

    /* loaded from: classes8.dex */
    public static final class b extends suu {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
            a.this = r1;
        }

        @Override // tb.suu
        public void a(sur message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ff77ce88", new Object[]{this, message});
                return;
            }
            q.d(message, "message");
            if (sup.Companion.a(message.c())) {
                return;
            }
            com.taobao.tab2interact.core.utils.a.b(this, "H5InteractLayer", "发消息给前端，message=" + message);
            WVStandardEventCenter.postNotificationToJS(a.a(a.this), "GGBizMessage", message.b());
        }
    }

    /* loaded from: classes8.dex */
    public static final class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
            a.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                a.this.z();
            }
        }
    }

    /* loaded from: classes8.dex */
    public interface e {
        void a(H5InteractLayerWebView h5InteractLayerWebView);
    }

    static {
        kge.a(306051921);
        kge.a(126427911);
        Companion = new C0822a(null);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2012643660:
                super.c((String) objArr[0]);
                return null;
            case -955963047:
                super.a((List) objArr[0]);
                return null;
            case -740468243:
                super.c_((String) objArr[0]);
                return null;
            case -667700814:
                super.bV_();
                return null;
            case -650670724:
                super.a((String) objArr[0], (String) objArr[1]);
                return null;
            case -227024002:
                super.c((String) objArr[0], (String) objArr[1]);
                return null;
            case 95609325:
                super.f();
                return null;
            case 96532846:
                super.g();
                return null;
            case 97456367:
                super.h();
                return null;
            case 104844535:
                super.p();
                return null;
            case 541549843:
                super.a((String) objArr[0], (Map) objArr[1]);
                return null;
            case 1037559155:
                super.b((String) objArr[0]);
                return null;
            case 1213942688:
                return super.y();
            case 1514279453:
                super.a((Map) objArr[0]);
                return null;
            case 1708636285:
                super.b((String) objArr[0], (String) objArr[1]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    public static final /* synthetic */ H5InteractLayerWebView a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (H5InteractLayerWebView) ipChange.ipc$dispatch("c75c550e", new Object[]{aVar}) : aVar.b;
    }

    public static final /* synthetic */ void a(a aVar, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32b36878", new Object[]{aVar, bool});
        } else {
            aVar.h = bool;
        }
    }

    public static final /* synthetic */ void a(a aVar, String str, long j, long j2, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cf8b2a5", new Object[]{aVar, str, new Long(j), new Long(j2), new Long(j3)});
        } else {
            aVar.a(str, j, j2, j3);
        }
    }

    public static final /* synthetic */ void a(a aVar, String str, String str2, String str3, long j, long j2, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21bb9891", new Object[]{aVar, str, str2, str3, new Long(j), new Long(j2), new Long(j3)});
        } else {
            aVar.a(str, str2, str3, j, j2, j3);
        }
    }

    public static final /* synthetic */ void a(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf59d0bf", new Object[]{aVar, new Boolean(z)});
        } else {
            aVar.g = z;
        }
    }

    public static final /* synthetic */ void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96dd8654", new Object[]{aVar});
        } else {
            aVar.F();
        }
    }

    public static final /* synthetic */ void b(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44d3f700", new Object[]{aVar, new Boolean(z)});
        } else {
            aVar.a(z);
        }
    }

    public static final /* synthetic */ boolean c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("505513f7", new Object[]{aVar})).booleanValue() : aVar.g;
    }

    public static final /* synthetic */ sus d(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sus) ipChange.ipc$dispatch("7e63883", new Object[]{aVar}) : aVar.n();
    }

    public static final /* synthetic */ Boolean e(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Boolean) ipChange.ipc$dispatch("8a6c366e", new Object[]{aVar}) : aVar.h;
    }

    public static final /* synthetic */ long f(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("7cbbbcc4", new Object[]{aVar})).longValue() : aVar.k;
    }

    public static final /* synthetic */ long g(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("36334a63", new Object[]{aVar})).longValue() : aVar.i;
    }

    public static final /* synthetic */ long h(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("efaad802", new Object[]{aVar})).longValue() : aVar.j;
    }

    public static final /* synthetic */ void i(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a92265ad", new Object[]{aVar});
        } else {
            aVar.I();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, FrameLayout interactHostView, sus messageCenter, com.taobao.tab2interact.core.data.baseinfo.a baseInfoManager) {
        super(context, interactHostView, messageCenter, baseInfoManager);
        q.d(context, "context");
        q.d(interactHostView, "interactHostView");
        q.d(messageCenter, "messageCenter");
        q.d(baseInfoManager, "baseInfoManager");
        this.e = new Handler(Looper.getMainLooper());
        this.i = -1L;
    }

    /* renamed from: com.taobao.tab2interact.core.layer.h5.a$a */
    /* loaded from: classes8.dex */
    public static final class C0822a {
        static {
            kge.a(-13847207);
        }

        private C0822a() {
        }

        public /* synthetic */ C0822a(o oVar) {
            this();
        }
    }

    @Override // com.taobao.tab2interact.core.AInteractLifeCycle
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        D();
        if (skq.o()) {
            A();
        }
        this.d = new smu(this);
        smu smuVar = this.d;
        if (smuVar == null) {
            return;
        }
        smuVar.a();
    }

    @Override // com.taobao.tab2interact.core.AInteractLifeCycle
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.f19767a = new FrameLayout(m());
        a(false);
    }

    @Override // com.taobao.tab2interact.core.AInteractLifeCycle
    public View d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("f7f4866d", new Object[]{this}) : this.f19767a;
    }

    @Override // com.taobao.tab2interact.core.AInteractLifeCycle
    public FrameLayout.LayoutParams e() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return (FrameLayout.LayoutParams) ipChange.ipc$dispatch("856eb1b5", new Object[]{this});
        }
        if (l.d(Globals.getApplication()) || l.b(Globals.getApplication())) {
            z = true;
        }
        if (z) {
            return new FrameLayout.LayoutParams(-1, -1);
        }
        return new FrameLayout.LayoutParams(-1, ohd.g(m()));
    }

    @Override // com.taobao.tab2interact.core.AInteractLifeCycle
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        super.f();
        this.o = true;
        a(true);
    }

    @Override // com.taobao.tab2interact.core.AInteractLifeCycle
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        super.g();
        this.o = false;
        a(false);
    }

    @Override // tb.suv
    public void bV_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d833b1b2", new Object[]{this});
            return;
        }
        super.bV_();
        G();
    }

    @Override // tb.smt, tb.suv
    public void c_(String changeType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3dd59ed", new Object[]{this, changeType});
            return;
        }
        q.d(changeType, "changeType");
        super.c_(changeType);
        f(changeType);
    }

    @Override // tb.smt, tb.suv
    public void b(String changeType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, changeType});
            return;
        }
        q.d(changeType, "changeType");
        super.b(changeType);
        g(changeType);
    }

    @Override // tb.smt, tb.suv
    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        super.p();
        H();
    }

    @Override // tb.suv
    public void c(String tabId, String tabType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f277e37e", new Object[]{this, tabId, tabType});
            return;
        }
        q.d(tabId, "tabId");
        q.d(tabType, "tabType");
        super.c(tabId, tabType);
        e(tabId, tabType);
    }

    @Override // tb.suv
    public void a(String tabId, String changeType) {
        smu smuVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, tabId, changeType});
            return;
        }
        q.d(tabId, "tabId");
        q.d(changeType, "changeType");
        super.a(tabId, changeType);
        Boolean bool = this.m;
        if (bool != null && q.a((Object) bool, (Object) false) && (smuVar = this.d) != null) {
            smuVar.a();
        }
        List<String> j = skq.j();
        if (j != null && j.contains(tabId)) {
            long j2 = 0;
            if (this.i < 0) {
                this.i = SystemClock.elapsedRealtime();
            }
            if (this.f) {
                Boolean bool2 = this.h;
                if (bool2 != null && q.a((Object) bool2, (Object) false)) {
                    com.taobao.tab2interact.core.utils.a.b(this, "H5InteractLayer", "Tab开启的时机，WebView重新加载");
                    H5InteractLayerWebView h5InteractLayerWebView = this.b;
                    if (h5InteractLayerWebView != null) {
                        h5InteractLayerWebView.reload();
                    }
                }
            } else {
                JSONObject k = skq.k();
                Object obj = k != null ? k.get(tabId) : null;
                Handler handler = this.e;
                d dVar = new d();
                if (!(obj instanceof Number)) {
                    obj = null;
                }
                Number number = (Number) obj;
                if (number != null) {
                    j2 = number.longValue();
                }
                handler.postDelayed(dVar, j2);
            }
        }
        f(tabId, changeType);
    }

    @Override // tb.suv
    public void b(String tabId, String changeType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, tabId, changeType});
            return;
        }
        q.d(tabId, "tabId");
        q.d(changeType, "changeType");
        super.b(tabId, changeType);
        g(tabId, changeType);
    }

    @Override // tb.suv
    public void c(String tabId) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, tabId});
            return;
        }
        q.d(tabId, "tabId");
        super.c(tabId);
        h(tabId);
    }

    @Override // tb.suv
    public void a(Map<String, String> pageURLQuery) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, pageURLQuery});
            return;
        }
        q.d(pageURLQuery, "pageURLQuery");
        super.a(pageURLQuery);
        b(pageURLQuery);
    }

    @Override // tb.suv
    public void a(String tabId, Map<String, String> tabURLQuery) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, tabId, tabURLQuery});
            return;
        }
        q.d(tabId, "tabId");
        q.d(tabURLQuery, "tabURLQuery");
        super.a(tabId, tabURLQuery);
        b(tabId, tabURLQuery);
    }

    @Override // tb.suw
    public JSONObject y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("485b4ba0", new Object[]{this});
        }
        JSONObject y = super.y();
        Boolean bool = this.m;
        if (bool != null) {
            if (q.a((Object) bool, (Object) true)) {
                JSONObject jSONObject = y;
                jSONObject.put((JSONObject) "success", (String) true);
                jSONObject.put((JSONObject) "data", (String) this.c);
            } else {
                y.put((JSONObject) "success", (String) false);
            }
        }
        return y;
    }

    @Override // tb.suw
    public void a(List<suw.b> areaList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, areaList});
            return;
        }
        q.d(areaList, "areaList");
        super.a(areaList);
        H5InteractLayerWebView h5InteractLayerWebView = this.b;
        if (h5InteractLayerWebView == null) {
            return;
        }
        h5InteractLayerWebView.setDelegateH5Areas(areaList);
    }

    public final void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ccb801", new Object[]{this});
            return;
        }
        com.taobao.tab2interact.core.utils.a.b(this, "H5InteractLayer", "初始化WebView");
        if (this.f) {
            com.taobao.tab2interact.core.utils.a.b(this, "H5InteractLayer", "初始化WebView，WebView已经被初始化");
            return;
        }
        this.j = SystemClock.elapsedRealtime();
        this.b = new H5InteractLayerWebView(m());
        FrameLayout frameLayout = this.f19767a;
        if (frameLayout != null) {
            frameLayout.addView(this.b);
        }
        H5InteractLayerWebView h5InteractLayerWebView = this.b;
        if (h5InteractLayerWebView == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.taobao.tab2interact.core.layer.h5.view.H5InteractLayerWebView");
        }
        h5InteractLayerWebView.setBackgroundColor(0);
        h5InteractLayerWebView.setTag(R.id.h5_interact_layer_message_center_tag, n());
        h5InteractLayerWebView.setTag(R.id.h5_interact_layer_base_info_manager_tag, o());
        h5InteractLayerWebView.setTag(R.id.h5_interact_layer_message_observer_tag, new b());
        WebSettings settings = h5InteractLayerWebView.getSettings();
        q.b(settings, "webView.settings");
        settings.setJavaScriptEnabled(true);
        h5InteractLayerWebView.setWebViewClient(new c(m()));
        C();
        e eVar = this.l;
        if (eVar != null) {
            eVar.a(h5InteractLayerWebView);
        }
        this.f = true;
    }

    /* loaded from: classes8.dex */
    public static final class c extends WVUCWebViewClient {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            switch (str.hashCode()) {
                case -1262473342:
                    super.onReceivedSslError((WebView) objArr[0], (SslErrorHandler) objArr[1], (SslError) objArr[2]);
                    return null;
                case -332805219:
                    super.onPageFinished((WebView) objArr[0], (String) objArr[1]);
                    return null;
                case 534767588:
                    super.onPageStarted((WebView) objArr[0], (String) objArr[1], (Bitmap) objArr[2]);
                    return null;
                case 1373550412:
                    super.onReceivedError((WebView) objArr[0], ((Number) objArr[1]).intValue(), (String) objArr[2], (String) objArr[3]);
                    return null;
                default:
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context) {
            super(context);
            a.this = r1;
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1fdfe7e4", new Object[]{this, webView, str, bitmap});
                return;
            }
            super.onPageStarted(webView, str, bitmap);
            com.taobao.tab2interact.core.utils.a.b(this, "H5InteractLayer", "加载URL开始的回调，url=" + str + "，webView=" + webView);
            if (a.c(a.this)) {
                sut.INSTANCE.a(a.d(a.this), suq.WEB_VIEW_RELOAD_NAME, null, null);
            }
            a.a(a.this, true);
            a.a(a.this, (Boolean) null);
            a.b(a.this);
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ec29cb9d", new Object[]{this, webView, str});
                return;
            }
            super.onPageFinished(webView, str);
            com.taobao.tab2interact.core.utils.a.b(this, "H5InteractLayer", "加载URL完成的回调，url=" + str + "，webView=" + webView);
            if (a.e(a.this) != null) {
                return;
            }
            com.taobao.tab2interact.core.utils.a.b(this, "H5InteractLayer", "加载URL完成的回调，加载URL成功");
            com.taobao.tab2interact.core.utils.b.a("H5LoadURL", "url=" + str);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            a aVar = a.this;
            a.a(aVar, str, elapsedRealtime - a.f(aVar), elapsedRealtime - a.g(a.this), elapsedRealtime - a.h(a.this));
            a.a(a.this, (Boolean) true);
            a.b(a.this, true);
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("51deb74c", new Object[]{this, webView, new Integer(i), str, str2});
                return;
            }
            super.onReceivedError(webView, i, str, str2);
            com.taobao.tab2interact.core.utils.a.b(this, "H5InteractLayer", "加载URL错误的回调，url=" + str2 + "，webView=" + webView + "，errorCode=" + i + "，errorDescription=" + str);
            StringBuilder sb = new StringBuilder();
            sb.append("Error");
            sb.append(i);
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("错误描述：");
            sb3.append(str);
            String sb4 = sb3.toString();
            com.taobao.tab2interact.core.utils.b.a("H5LoadURL", sb2, sb4, "url=" + str2);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            a.a(a.this, String.valueOf(i), str, str2, elapsedRealtime - a.f(a.this), elapsedRealtime - a.g(a.this), elapsedRealtime - a.h(a.this));
            a.a(a.this, (Boolean) false);
            a.b(a.this, false);
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4c02f82", new Object[]{this, webView, sslErrorHandler, sslError});
                return;
            }
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            com.taobao.tab2interact.core.utils.a.b(this, "H5InteractLayer", "加载URL SSL错误的回调，webView=" + webView + "，sslError=" + sslError);
            StringBuilder sb = new StringBuilder();
            sb.append(StatisticRecord.EC_SSL_PAY);
            String str = null;
            sb.append(sslError != null ? Integer.valueOf(sslError.getPrimaryError()) : null);
            String sb2 = sb.toString();
            com.taobao.tab2interact.core.utils.b.a("H5LoadURL", sb2, "SSL错误描述：" + sslError, null);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            a aVar = a.this;
            String valueOf = String.valueOf(sslError != null ? Integer.valueOf(sslError.getPrimaryError()) : null);
            if (sslError != null) {
                str = sslError.toString();
            }
            a.a(aVar, valueOf, str, null, elapsedRealtime - a.f(a.this), elapsedRealtime - a.g(a.this), elapsedRealtime - a.h(a.this));
            a.a(a.this, (Boolean) false);
            a.b(a.this, false);
        }
    }

    private final void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c5ab4a", new Object[]{this});
            return;
        }
        this.k = SystemClock.elapsedRealtime();
        String h = skq.h();
        com.taobao.tab2interact.core.utils.a.b(this, "H5InteractLayer", "加载URL，url=" + h);
        H5InteractLayerWebView h5InteractLayerWebView = this.b;
        if (h5InteractLayerWebView == null) {
            return;
        }
        h5InteractLayerWebView.loadUrl(h);
    }

    private final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("设置H5互动层根View的可见性，");
        sb.append("当前可见性为");
        FrameLayout frameLayout = this.f19767a;
        sb.append(frameLayout != null ? Integer.valueOf(frameLayout.getVisibility()) : null);
        sb.append("，isVisible=");
        sb.append(z);
        com.taobao.tab2interact.core.utils.a.b(this, "H5InteractLayer", sb.toString());
        if (z) {
            if (!q.a((Object) this.h, (Object) true) || !this.o) {
                return;
            }
            com.taobao.tab2interact.core.utils.a.b(this, "H5InteractLayer", "设置H5互动层根View的可见性，设置为可见");
            FrameLayout frameLayout2 = this.f19767a;
            if (frameLayout2 == null) {
                return;
            }
            frameLayout2.setVisibility(0);
            return;
        }
        com.taobao.tab2interact.core.utils.a.b(this, "H5InteractLayer", "设置H5互动层根View的可见性，设置为不可见");
        FrameLayout frameLayout3 = this.f19767a;
        if (frameLayout3 == null) {
            return;
        }
        frameLayout3.setVisibility(8);
    }

    @Override // tb.smu.b
    public void a(JSONObject dataJSONObject, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a78ec3c", new Object[]{this, dataJSONObject, new Long(j)});
            return;
        }
        q.d(dataJSONObject, "dataJSONObject");
        com.taobao.tab2interact.core.utils.a.b(this, "H5InteractLayer", "数据请求成功回调，dataJSONObject=" + dataJSONObject + "，costTime=" + j);
        this.m = true;
        b(j);
        this.c = dataJSONObject;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put((JSONObject) "success", (String) true);
        jSONObject2.put((JSONObject) "data", (String) dataJSONObject);
        sut.INSTANCE.a(n(), suq.INTERACT_REMOTE_CONFIG_CHANGE_NAME, jSONObject, null);
    }

    @Override // tb.smu.b
    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
            return;
        }
        com.taobao.tab2interact.core.utils.a.b(this, "H5InteractLayer", "数据请求失败回调，costTime=" + j);
        this.m = false;
        c(j);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "success", (String) false);
        sut.INSTANCE.a(n(), suq.INTERACT_REMOTE_CONFIG_CHANGE_NAME, jSONObject, null);
    }

    public final void a(e h5InteractLayerEventListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1aa16914", new Object[]{this, h5InteractLayerEventListener});
            return;
        }
        q.d(h5InteractLayerEventListener, "h5InteractLayerEventListener");
        this.l = h5InteractLayerEventListener;
    }

    private final void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d3c2cb", new Object[]{this});
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(suq.GET_INTERACT_REMOTE_CONFIG_NAME);
        arrayList.add(suq.SET_DELEGATE_H5_AREAS_NAME);
        sut.INSTANCE.a(n(), arrayList, this);
    }

    private final void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e1da4c", new Object[]{this});
        } else {
            sut.INSTANCE.a(n(), this);
        }
    }

    private final void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a97c48", new Object[]{this});
            return;
        }
        this.n = new BroadcastReceiver() { // from class: com.taobao.tab2interact.core.layer.h5.H5InteractLayer$registerLoginBroadcastReceiver$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    return;
                }
                String action = intent != null ? intent.getAction() : null;
                com.taobao.tab2interact.core.utils.a.b(this, "H5InteractLayer", "收到登录广播，action=" + action);
                if (!q.a((Object) action, (Object) LoginAction.NOTIFY_LOGOUT.toString()) && !q.a((Object) action, (Object) LoginAction.NOTIFY_LOGIN_SUCCESS.toString())) {
                    return;
                }
                a.i(a.this);
            }
        };
        LoginBroadcastHelper.registerLoginReceiver(m(), this.n);
    }

    private final void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41a3850", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = this.f19767a;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        if (!this.f) {
            return;
        }
        com.taobao.tab2interact.core.utils.a.b(this, "H5InteractLayer", "处理登录或退出登录，WebView重新加载");
        H5InteractLayerWebView h5InteractLayerWebView = this.b;
        if (h5InteractLayerWebView == null) {
            return;
        }
        h5InteractLayerWebView.reload();
    }

    private final void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4284fd1", new Object[]{this});
        } else {
            LoginBroadcastHelper.unregisterLoginReceiver(m(), this.n);
        }
    }

    private final void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eff1cd", new Object[]{this});
            return;
        }
        StringBuilder sb = new StringBuilder();
        PageBaseInfo.State a2 = o().a();
        String jSONString = JSON.toJSONString(o().b());
        sb.append("window.pageBaseInfo = {state: '" + a2 + "', urlQuery: " + jSONString + "};");
        sb.append("window.tabBaseInfo = {};");
        for (String str : o().c()) {
            String a3 = o().a(str);
            TabBaseInfo.State b2 = o().b(str);
            String jSONString2 = JSON.toJSONString(o().c(str));
            sb.append("window.tabBaseInfo['" + str + "'] = {type: '" + a3 + "', state: '" + b2 + "', urlQuery: " + jSONString2 + "};");
        }
        a(sb);
    }

    private final void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fe094e", new Object[]{this});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("window.pageBaseInfo = {state: 'create'};");
        sb.append("window.postMessage({name: 'PageStateChange', data: {state: 'create'}});");
        a(sb);
    }

    private final void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669e4a77", new Object[]{this, str});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("if (!window.pageBaseInfo) window.pageBaseInfo = {};");
        sb.append("window.pageBaseInfo.state = 'start';");
        sb.append("window.postMessage({name: 'PageStateChange', data: {state: 'start', changeType: '" + str + "'}});");
        a(sb);
    }

    private final void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0cfe3b8", new Object[]{this, str});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("if (!window.pageBaseInfo) window.pageBaseInfo = {};");
        sb.append("window.pageBaseInfo.state = 'stop';");
        sb.append("window.postMessage({name: 'PageStateChange', data: {state: 'stop', changeType: '" + str + "'}});");
        a(sb);
    }

    private final void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40c20cf", new Object[]{this});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("if (!window.pageBaseInfo) window.pageBaseInfo = {};");
        sb.append("window.pageBaseInfo.state = 'destroy';");
        sb.append("window.postMessage({name: 'PageStateChange', data: {state: 'destroy'}});");
        a(sb);
    }

    private final void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb83980", new Object[]{this, str, str2});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("if (!window.tabBaseInfo) window.tabBaseInfo = {};");
        sb.append("window.tabBaseInfo['" + str + "'] = {type: '" + str2 + "', state: 'create'};");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("window.postMessage({name: 'TabStateChange', data: {tabId: '");
        sb2.append(str);
        sb2.append("', state: 'create'}});");
        sb.append(sb2.toString());
        a(sb);
    }

    private final void f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98586481", new Object[]{this, str, str2});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("if (!window.tabBaseInfo) window.tabBaseInfo = {};");
        sb.append("if (!window.tabBaseInfo['" + str + "']) window.tabBaseInfo['" + str + "'] = {};");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("window.tabBaseInfo['");
        sb2.append(str);
        sb2.append("'].state = 'start';");
        sb.append(sb2.toString());
        sb.append("window.postMessage({name: 'TabStateChange', data: {tabId: '" + str + "', state: 'start', changeType: '" + str2 + "'}});");
        a(sb);
    }

    private final void g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24f88f82", new Object[]{this, str, str2});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("if (!window.tabBaseInfo) window.tabBaseInfo = {};");
        sb.append("if (!window.tabBaseInfo['" + str + "']) window.tabBaseInfo['" + str + "'] = {};");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("window.tabBaseInfo['");
        sb2.append(str);
        sb2.append("'].state = 'stop';");
        sb.append(sb2.toString());
        sb.append("window.postMessage({name: 'TabStateChange', data: {tabId: '" + str + "', state: 'stop', changeType: '" + str2 + "'}});");
        a(sb);
    }

    private final void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb017cf9", new Object[]{this, str});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("if (!window.tabBaseInfo) window.tabBaseInfo = {};");
        sb.append("if (!window.tabBaseInfo['" + str + "']) window.tabBaseInfo['" + str + "'] = {};");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("window.tabBaseInfo['");
        sb2.append(str);
        sb2.append("'].state = 'destroy';");
        sb.append(sb2.toString());
        sb.append("window.postMessage({name: 'TabStateChange', data: {tabId: '" + str + "', state: 'destroy'}});");
        a(sb);
    }

    private final void b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e3e87c", new Object[]{this, map});
            return;
        }
        StringBuilder sb = new StringBuilder();
        String jSONString = JSON.toJSONString(map);
        sb.append("if (!window.pageBaseInfo) window.pageBaseInfo = {};");
        sb.append("window.pageBaseInfo.urlQuery = " + jSONString + ';');
        sb.append("window.postMessage({name: 'PageURLQueryChange', data: {urlQuery: " + jSONString + "}});");
        a(sb);
    }

    private final void b(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("819a01b2", new Object[]{this, str, map});
            return;
        }
        StringBuilder sb = new StringBuilder();
        String jSONString = JSON.toJSONString(map);
        sb.append("if (!window.tabBaseInfo) window.tabBaseInfo = {};");
        sb.append("if (!window.tabBaseInfo['" + str + "']) window.tabBaseInfo['" + str + "'] = {};");
        sb.append("window.tabBaseInfo['" + str + "'].urlQuery = " + jSONString + ';');
        sb.append("window.postMessage({name: 'TabURLQueryChange', data: {tabId: '" + str + "', urlQuery: " + jSONString + "}});");
        a(sb);
    }

    private final void a(StringBuilder sb) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5279f0c3", new Object[]{this, sb});
            return;
        }
        sb.append("JSON.stringify({pageBaseInfo: window.pageBaseInfo, tabBaseInfo: window.tabBaseInfo});");
        com.taobao.tab2interact.core.utils.a.b(this, "H5InteractLayer", "执行JS，script=" + ((Object) sb));
        H5InteractLayerWebView h5InteractLayerWebView = this.b;
        if (h5InteractLayerWebView == null) {
            return;
        }
        h5InteractLayerWebView.evaluateJavascript(sb.toString(), new ValueCallback<String>() { // from class: com.taobao.tab2interact.core.layer.h5.H5InteractLayer$evaluateJavascript$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.webkit.ValueCallback
            public void onReceiveValue(String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("138ac29e", new Object[]{this, str});
                    return;
                }
                com.taobao.tab2interact.core.utils.a.b(this, "H5InteractLayer", "执行JS结果回调，value=" + str);
            }
        });
    }

    private final void b(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66ffb", new Object[]{this, new Long(j)});
            return;
        }
        Map<String, String> q = q();
        q.put("costTime", String.valueOf(j));
        com.taobao.tab2interact.core.utils.a.b(this, "H5InteractLayer", "请求数据成功埋点，properties=" + q);
        com.taobao.tab2interact.core.utils.d.c("Page_VideoCash_H5RequestDataSucceed", q);
    }

    private final void c(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b489a", new Object[]{this, new Long(j)});
            return;
        }
        Map<String, String> q = q();
        q.put("costTime", String.valueOf(j));
        com.taobao.tab2interact.core.utils.a.b(this, "H5InteractLayer", "请求数据失败埋点，properties=" + q);
        com.taobao.tab2interact.core.utils.d.c("Page_VideoCash_H5RequestDataFail", q);
    }

    private final void a(String str, long j, long j2, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7099cd2", new Object[]{this, str, new Long(j), new Long(j2), new Long(j3)});
            return;
        }
        Map<String, String> c2 = c(str, j, j2, j3);
        com.taobao.tab2interact.core.utils.a.b(this, "H5InteractLayer", "加载URL成功埋点，properties=" + c2);
        com.taobao.tab2interact.core.utils.d.c(iqw.UT_VC_H5_LOAD_URL_SUCCEED_EVENT_NAME, c2);
        this.p = true;
    }

    private final void a(String str, String str2, String str3, long j, long j2, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f9fb03e", new Object[]{this, str, str2, str3, new Long(j), new Long(j2), new Long(j3)});
            return;
        }
        Map<String, String> c2 = c(str3, j, j2, j3);
        String str4 = "";
        c2.put("errorCode", str == null ? str4 : str);
        if (str2 != null) {
            str4 = str2;
        }
        c2.put("errorMsg", str4);
        com.taobao.tab2interact.core.utils.a.b(this, "H5InteractLayer", "加载URL失败埋点，properties=" + c2);
        com.taobao.tab2interact.core.utils.d.c("Page_VideoCash_H5LoadURLFail", c2);
        this.p = true;
    }

    private final Map<String, String> c(String str, long j, long j2, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d1f3b945", new Object[]{this, str, new Long(j), new Long(j2), new Long(j3)});
        }
        Map<String, String> q = q();
        if (str == null) {
            str = "";
        }
        q.put("url", str);
        q.put("costTime", String.valueOf(j));
        q.put("fromTargetTabStartTime", String.valueOf(j2));
        q.put("fromInitWebViewStartTime", String.valueOf(j3));
        q.put("isLoadURLTrackedOnce", String.valueOf(this.p));
        return q;
    }

    private final Map<String, String> q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7abac4ad", new Object[]{this});
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enableTab2GlobalInteract", "true");
        linkedHashMap.put("tab2GlobalInteractVersion", "2.0");
        return linkedHashMap;
    }

    @Override // com.taobao.tab2interact.core.AInteractLifeCycle
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        super.h();
        H5InteractLayerWebView h5InteractLayerWebView = this.b;
        if (h5InteractLayerWebView != null) {
            h5InteractLayerWebView.destroy();
        }
        this.e.removeCallbacksAndMessages(null);
        if (skq.o()) {
            J();
        }
        E();
    }
}
