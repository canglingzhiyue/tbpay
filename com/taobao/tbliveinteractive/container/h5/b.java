package com.taobao.tbliveinteractive.container.h5;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.taobao.util.k;
import android.taobao.windvane.extra.core.WVCore;
import android.taobao.windvane.extra.uc.WVUCWebViewClient;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.alibaba.android.bindingx.core.internal.BindingXConstants;
import com.alibaba.fastjson.JSON;
import com.alilive.adapter.uikit.AliUrlImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.aw;
import com.taobao.taolivecontainer.TBLiveH5Container;
import com.taobao.taolivecontainer.TBLiveWebView;
import com.taobao.tbliveinteractive.view.DWPenetrateFrameLayout;
import com.uc.webview.export.SslErrorHandler;
import com.uc.webview.export.WebView;
import java.util.HashMap;
import java.util.Map;
import tb.kge;
import tb.pmd;
import tb.pqi;
import tb.pqj;
import tb.psn;
import tb.pso;
import tb.qmr;
import tb.qnc;
import tb.qne;
import tb.qng;
import tb.qnh;
import tb.svb;

/* loaded from: classes8.dex */
public class b extends qmr {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final String o;
    public TBLiveWebView n;
    private AliUrlImageView p;
    private com.taobao.tbliveinteractive.c q;
    private svb r;
    private int s;
    private long t;
    private Runnable u;
    private boolean v;
    private com.taobao.tbliveinteractive.e w;
    private com.taobao.taolivecontainer.b x;
    private TBLiveH5Container y;

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1474178196:
                super.a(((Boolean) objArr[0]).booleanValue());
                return null;
            case 100226930:
                super.k();
                return null;
            case 101150451:
                super.l();
                return null;
            case 102073972:
                super.m();
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // tb.qmr
    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public static /* synthetic */ Context a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("39a72889", new Object[]{bVar}) : bVar.f;
    }

    public static /* synthetic */ boolean a(b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7a631867", new Object[]{bVar, new Boolean(z)})).booleanValue();
        }
        bVar.v = z;
        return z;
    }

    public static /* synthetic */ TBLiveWebView b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBLiveWebView) ipChange.ipc$dispatch("3c01b94b", new Object[]{bVar}) : bVar.r();
    }

    public static /* synthetic */ Context c(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("6e891ac7", new Object[]{bVar}) : bVar.f;
    }

    public static /* synthetic */ Context d(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("88fa13e6", new Object[]{bVar}) : bVar.f;
    }

    public static /* synthetic */ long e(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ca9c501", new Object[]{bVar})).longValue() : bVar.t;
    }

    public static /* synthetic */ void f(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe536b2c", new Object[]{bVar});
        } else {
            bVar.p();
        }
    }

    public static /* synthetic */ svb g(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (svb) ipChange.ipc$dispatch("7fe4585c", new Object[]{bVar}) : bVar.r;
    }

    public static /* synthetic */ ViewGroup h(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("fbd5ab6b", new Object[]{bVar}) : bVar.f32942a;
    }

    public static /* synthetic */ Runnable i(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Runnable) ipChange.ipc$dispatch("f58ee16b", new Object[]{bVar}) : bVar.u;
    }

    public static /* synthetic */ ViewGroup j(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("89ed796d", new Object[]{bVar}) : bVar.f32942a;
    }

    public static /* synthetic */ com.taobao.tbliveinteractive.e k(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tbliveinteractive.e) ipChange.ipc$dispatch("4ffe36f3", new Object[]{bVar}) : bVar.w;
    }

    public static /* synthetic */ qmr.a l(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (qmr.a) ipChange.ipc$dispatch("67db27ed", new Object[]{bVar}) : bVar.d;
    }

    public static /* synthetic */ qmr.a m(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (qmr.a) ipChange.ipc$dispatch("7890f4ae", new Object[]{bVar}) : bVar.d;
    }

    public static /* synthetic */ com.taobao.tbliveinteractive.c n(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.tbliveinteractive.c) ipChange.ipc$dispatch("f16a38b8", new Object[]{bVar}) : bVar.q;
    }

    public static /* synthetic */ String o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b4719ea", new Object[0]) : o;
    }

    public static /* synthetic */ qmr.a o(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (qmr.a) ipChange.ipc$dispatch("99fc8e30", new Object[]{bVar}) : bVar.d;
    }

    public static /* synthetic */ qmr.a p(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (qmr.a) ipChange.ipc$dispatch("aab25af1", new Object[]{bVar}) : bVar.d;
    }

    public static /* synthetic */ qmr.a q(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (qmr.a) ipChange.ipc$dispatch("bb6827b2", new Object[]{bVar}) : bVar.d;
    }

    public static /* synthetic */ qmr.a r(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (qmr.a) ipChange.ipc$dispatch("cc1df473", new Object[]{bVar}) : bVar.d;
    }

    public static /* synthetic */ AliUrlImageView s(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AliUrlImageView) ipChange.ipc$dispatch("7f05a0e1", new Object[]{bVar}) : bVar.p;
    }

    static {
        kge.a(1108495226);
        o = b.class.getSimpleName();
    }

    public b(Context context, com.taobao.tbliveinteractive.e eVar, ViewGroup viewGroup, svb svbVar, Map<String, String> map) {
        super(context, viewGroup, map, "openWebViewLayer", false);
        this.v = false;
        this.u = new Runnable() { // from class: com.taobao.tbliveinteractive.container.h5.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                qnh.a(b.o(), "onUCCorePrepared start");
                if (b.a(b.this) != null) {
                    b.f(b.this);
                    TBLiveWebView b = b.b(b.this);
                    if (com.taobao.taolive.sdk.utils.b.d(b.c(b.this))) {
                        Context d = b.d(b.this);
                        qng.a(d, "WebView " + b.getCurrentViewCoreType());
                    }
                    if (!TextUtils.isEmpty(b.this.h) && !qnc.a(b.getUrl(), b.this.h)) {
                        b bVar = b.this;
                        bVar.c(bVar.h);
                    }
                    String o2 = b.o();
                    qnh.a(o2, "onUCCorePrepared " + (System.currentTimeMillis() - currentTimeMillis) + " " + (System.currentTimeMillis() - b.e(b.this)));
                }
                if (b.g(b.this) == null) {
                    return;
                }
                b.g(b.this).a();
            }
        };
        this.w = eVar;
        this.r = svbVar;
    }

    public b(Context context, com.taobao.tbliveinteractive.e eVar, ViewGroup viewGroup, svb svbVar, String str, com.taobao.tbliveinteractive.c cVar, boolean z) {
        super(context, viewGroup, new HashMap(), str, z);
        this.v = false;
        this.u = new Runnable() { // from class: com.taobao.tbliveinteractive.container.h5.b.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                qnh.a(b.o(), "onUCCorePrepared start");
                if (b.a(b.this) != null) {
                    b.f(b.this);
                    TBLiveWebView b = b.b(b.this);
                    if (com.taobao.taolive.sdk.utils.b.d(b.c(b.this))) {
                        Context d = b.d(b.this);
                        qng.a(d, "WebView " + b.getCurrentViewCoreType());
                    }
                    if (!TextUtils.isEmpty(b.this.h) && !qnc.a(b.getUrl(), b.this.h)) {
                        b bVar = b.this;
                        bVar.c(bVar.h);
                    }
                    String o2 = b.o();
                    qnh.a(o2, "onUCCorePrepared " + (System.currentTimeMillis() - currentTimeMillis) + " " + (System.currentTimeMillis() - b.e(b.this)));
                }
                if (b.g(b.this) == null) {
                    return;
                }
                b.g(b.this).a();
            }
        };
        this.w = eVar;
        this.r = svbVar;
        this.q = cVar;
        com.taobao.tbliveinteractive.c cVar2 = this.q;
        if (cVar2 != null) {
            cVar2.c();
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.s = i;
        }
    }

    @Override // tb.qmr
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.t = System.currentTimeMillis();
        if (this.r == null || WVCore.getInstance().isUCSupport() || !qne.E()) {
            p();
        } else {
            svb svbVar = this.r;
            if (svbVar != null) {
                this.v = true;
                svbVar.a();
                this.r.a(this.f, new svb.a() { // from class: com.taobao.tbliveinteractive.container.h5.b.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.svb.a
                    public void onUCCorePrepared() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("6e1aa650", new Object[]{this});
                            return;
                        }
                        if (b.h(b.this) != null) {
                            b.j(b.this).post(b.i(b.this));
                        }
                        b.a(b.this, false);
                    }

                    @Override // tb.svb.a
                    public void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        } else {
                            onUCCorePrepared();
                        }
                    }
                });
            } else {
                p();
            }
        }
        String str = o;
        qnh.a(str, "onCreateView " + (System.currentTimeMillis() - this.t));
    }

    private TBLiveWebView q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLiveWebView) ipChange.ipc$dispatch("a4dc1113", new Object[]{this});
        }
        this.x = new com.taobao.taolivecontainer.b(this.f, "LiveRoomAlive", new pso() { // from class: com.taobao.tbliveinteractive.container.h5.b.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.pso
            public void a(String str, String str2, HashMap<String, String> hashMap) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a507bab7", new Object[]{this, str, str2, hashMap});
                } else {
                    qnh.a(b.k(b.this), str, str2, hashMap);
                }
            }

            @Override // tb.pso
            public void b(String str, String str2, HashMap<String, String> hashMap) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ab0b8616", new Object[]{this, str, str2, hashMap});
                } else {
                    qnh.b(b.k(b.this), str, str2, hashMap);
                }
            }

            @Override // tb.pso
            public void a(String str, String str2, String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
                    return;
                }
                k.a(str + "_" + str2, str3);
            }
        }, new psn() { // from class: com.taobao.tbliveinteractive.container.h5.b.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.psn
            public String a(String str, String str2, String str3) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (String) ipChange2.ipc$dispatch("457cf91a", new Object[]{this, str, str2, str3}) : pmd.a().d().a(str, str2, str3);
            }
        }, null);
        this.x.d();
        this.y = this.x.b();
        this.x.a(this);
        return this.y;
    }

    private void p() {
        TBLiveWebView tBLiveWebView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        String str = o;
        qnh.a(str, "initWebView start " + System.currentTimeMillis());
        this.v = false;
        if (qne.s()) {
            tBLiveWebView = q();
        } else {
            tBLiveWebView = new TBLiveWebView(this.f);
            tBLiveWebView.setWebViewToken(this);
        }
        com.taobao.tbliveinteractive.c cVar = this.q;
        if (cVar != null) {
            cVar.a();
        }
        tBLiveWebView.setWebViewClient(new a(this.f));
        tBLiveWebView.setVisibility(8);
        tBLiveWebView.setFocusable(false);
        if (Build.VERSION.SDK_INT >= 16) {
            tBLiveWebView.setImportantForAccessibility(2);
        }
        tBLiveWebView.setContentDescription("");
        a(tBLiveWebView);
        String str2 = o;
        qnh.a(str2, "initWebView end " + tBLiveWebView.getCurrentViewCoreType());
    }

    @Override // tb.qmr
    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        super.k();
        TBLiveWebView tBLiveWebView = this.n;
        if (tBLiveWebView != null) {
            tBLiveWebView.onResume();
            WVStandardEventCenter.postNotificationToJS(this.n, "TBLiveWVPlugin.Event.live.active", null);
            return;
        }
        TBLiveH5Container tBLiveH5Container = this.y;
        if (tBLiveH5Container == null) {
            return;
        }
        tBLiveH5Container.onResume();
    }

    @Override // tb.qmr
    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        super.l();
        TBLiveWebView tBLiveWebView = this.n;
        if (tBLiveWebView != null) {
            tBLiveWebView.onPause();
            WVStandardEventCenter.postNotificationToJS(this.n, "TBLiveWVPlugin.Event.live.inactive", null);
            return;
        }
        TBLiveH5Container tBLiveH5Container = this.y;
        if (tBLiveH5Container == null) {
            return;
        }
        tBLiveH5Container.onPause();
    }

    @Override // tb.qmr
    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        if (this.f32942a != null) {
            this.f32942a.removeCallbacks(this.u);
        }
        super.m();
        TBLiveWebView tBLiveWebView = this.n;
        if (tBLiveWebView != null) {
            tBLiveWebView.destroy();
            this.n = null;
        }
        TBLiveH5Container tBLiveH5Container = this.y;
        if (tBLiveH5Container != null) {
            tBLiveH5Container.destroy();
            this.y = null;
        }
        com.taobao.taolivecontainer.b bVar = this.x;
        if (bVar != null) {
            bVar.e();
            this.x = null;
        }
        this.q = null;
        svb svbVar = this.r;
        if (svbVar == null) {
            return;
        }
        svbVar.a();
    }

    @Override // tb.qmr
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (this.n != null) {
            String str2 = o;
            qnh.a(str2, "H5Container: render---" + str);
            com.taobao.tbliveinteractive.c cVar = this.q;
            if (cVar != null) {
                cVar.b();
            }
            if (qnc.a(this.n.getUrl(), str)) {
                this.n.refresh();
                return;
            }
            String str3 = o;
            qnh.a(str3, "renderByUrl: " + this.n.getCurrentViewCoreType() + "render---" + str);
            TBLiveWebView tBLiveWebView = this.n;
            if (this.l) {
                str = qnc.a(str, "codeLaunchOptimization", "true");
            }
            tBLiveWebView.loadUrl(str);
        } else if (this.x == null) {
        } else {
            String str4 = o;
            qnh.a(str4, "WebViewBuilder: render---" + str);
            com.taobao.taolivecontainer.b bVar = this.x;
            if (this.l) {
                str = qnc.a(str, "codeLaunchOptimization", "true");
            }
            bVar.b(str);
        }
    }

    @Override // tb.qmr
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        String str = o;
        qnh.a(str, "onRenderSuccess " + (System.currentTimeMillis() - this.t));
        TBLiveWebView r = r();
        if (r != null) {
            r.setVisibility(0);
        }
        com.taobao.tbliveinteractive.c cVar = this.q;
        if (cVar == null) {
            return;
        }
        cVar.e();
    }

    @Override // tb.qmr
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        String str = o;
        qnh.a(str, "H5Container: render timeout---" + this.h);
        if (this.v && this.f32942a != null) {
            this.f32942a.post(this.u);
        }
        if (this.d == null) {
            return;
        }
        this.d.a("renderTimeout", "renderTimeout");
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        TBLiveWebView r = r();
        if (r == null) {
            return;
        }
        if (!TextUtils.isEmpty(str) && str.contains("TBLiveWeex")) {
            str = str.replace("TBLiveWeex", "TBLiveWVPlugin");
        }
        WVStandardEventCenter.postNotificationToJS(r, str, str2);
        String str3 = o;
        qnh.a(str3, "onMessageReceived:" + str + " eventData:" + str2);
    }

    public void a(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
            return;
        }
        TBLiveWebView r = r();
        if (r == null) {
            return;
        }
        if (!TextUtils.isEmpty(str) && str.contains("TBLiveWeex")) {
            str = str.replace("TBLiveWeex", "TBLiveWVPlugin");
        }
        String a2 = pqj.a(map);
        WVStandardEventCenter.postNotificationToJS(r, str, a2);
        String str2 = o;
        qnh.a(str2, "fireEvent:" + str + " eventData:" + a2);
    }

    @Override // tb.qmr
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        super.a(z);
        TBLiveWebView r = r();
        if (r == null) {
            return;
        }
        WVStandardEventCenter.postNotificationToJS(r, z ? "TBLiveWVPlugin.Event.container.show" : "TBLiveWVPlugin.Event.container.hide", null);
    }

    /* loaded from: classes8.dex */
    public class a extends WVUCWebViewClient {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(954313595);
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1fdfe7e4", new Object[]{this, webView, str, bitmap});
            }
        }

        public a(Context context) {
            super(context);
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ec29cb9d", new Object[]{this, webView, str});
                return;
            }
            Map<String, String> b = pqi.a().b();
            b.put(BindingXConstants.KEY_SCENE_TYPE, aw.MODULE_H5_CONTAINER);
            b.put("url", b.this.h);
            pqi.a().a("liveroomH5Render", JSON.toJSONString(b));
            if (b.l(b.this) != null) {
                b.m(b.this).a(webView);
            }
            if (b.n(b.this) != null) {
                b.n(b.this).d();
            }
            String o = b.o();
            qnh.a(o, "initWebView onPageFinished " + (System.currentTimeMillis() - b.e(b.this)));
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4c02f82", new Object[]{this, webView, sslErrorHandler, sslError});
                return;
            }
            String sslError2 = sslError != null ? sslError.toString() : "";
            Map<String, String> b = pqi.a().b();
            b.put(BindingXConstants.KEY_SCENE_TYPE, aw.MODULE_H5_CONTAINER);
            b.put("url", b.this.h);
            pqi.a().a("liveroomH5Render", JSON.toJSONString(b), "SslError", sslError2);
            if (b.o(b.this) == null) {
                return;
            }
            b.p(b.this).a("sslError", sslError2);
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("51deb74c", new Object[]{this, webView, new Integer(i), str, str2});
                return;
            }
            Map<String, String> b = pqi.a().b();
            b.put(BindingXConstants.KEY_SCENE_TYPE, aw.MODULE_H5_CONTAINER);
            b.put("url", b.this.h);
            pqi.a().a("liveroomH5Render", JSON.toJSONString(b), str, String.valueOf(i));
            if (b.q(b.this) == null) {
                return;
            }
            b.r(b.this).a(String.valueOf(i), str);
        }
    }

    private TBLiveWebView r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLiveWebView) ipChange.ipc$dispatch("1a563754", new Object[]{this});
        }
        TBLiveWebView tBLiveWebView = this.n;
        if (tBLiveWebView != null) {
            return tBLiveWebView;
        }
        TBLiveH5Container tBLiveH5Container = this.y;
        if (tBLiveH5Container == null) {
            return null;
        }
        return tBLiveH5Container;
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        TBLiveWebView r = r();
        if (r == null) {
            return;
        }
        r.setVisibility(0);
    }

    public void a(boolean z, String str, float f, float f2, float f3) {
        int b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f6741ca", new Object[]{this, new Boolean(z), str, new Float(f), new Float(f2), new Float(f3)});
            return;
        }
        pmd.a().m().a(o, "showInteractiveCloseBtn " + z + " " + str + " " + f + " " + f2 + " " + f3);
        if (z && this.f32942a != null) {
            if (this.p == null) {
                this.p = new AliUrlImageView(this.f);
                this.p.setScaleType(ImageView.ScaleType.CENTER_CROP);
                this.f32942a.addView(this.p);
            }
            if (TextUtils.isEmpty(str)) {
                this.p.setImageDrawable(this.f.getResources().getDrawable(R.drawable.taolive_interactive_close));
            } else {
                this.p.setImageUrl(str);
            }
            this.p.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.tbliveinteractive.container.h5.b.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    pmd.a().m().a(b.o(), "TBLiveWVPlugin.event.closeInteractiveComponent");
                    b.this.a("TBLiveWVPlugin.event.closeInteractiveComponent", "");
                    b.s(b.this).setVisibility(8);
                    View j = b.this.j();
                    if (!(j instanceof DWPenetrateFrameLayout)) {
                        return;
                    }
                    ((DWPenetrateFrameLayout) j).setHasShowingComponent(false);
                }
            });
            int min = Math.min(com.taobao.taolive.sdk.utils.b.b(this.f), com.taobao.taolive.sdk.utils.b.c(this.f));
            int a2 = f > 0.0f ? (int) ((min * f) / 750.0f) : com.taobao.taolive.sdk.utils.b.a(this.f, 39.0f);
            float f4 = min;
            int i = (int) ((f2 * f4) / 750.0f);
            int i2 = (int) (((f4 * f3) + this.s) / 750.0f);
            ViewGroup.LayoutParams layoutParams = this.p.getLayoutParams();
            if (layoutParams == null) {
                new ViewGroup.LayoutParams(a2, a2);
            }
            layoutParams.width = a2;
            layoutParams.height = a2;
            this.p.setX((b - a2) - i);
            this.p.setY(i2);
            this.p.setLayoutParams(layoutParams);
            this.p.setVisibility(0);
            return;
        }
        AliUrlImageView aliUrlImageView = this.p;
        if (aliUrlImageView == null) {
            return;
        }
        aliUrlImageView.setVisibility(8);
    }
}
