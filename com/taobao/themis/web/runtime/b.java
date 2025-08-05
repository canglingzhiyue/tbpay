package com.taobao.themis.web.runtime;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.taobao.windvane.export.network.g;
import android.taobao.windvane.extra.core.WVCore;
import android.taobao.windvane.extra.uc.WVUCWebChromeClient;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ValueCallback;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.k;
import com.taobao.themis.kernel.TMSBackPressedType;
import com.taobao.themis.kernel.TMSContainerType;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.entity.InstanceStartParams;
import com.taobao.themis.kernel.extension.page.f;
import com.taobao.themis.kernel.extension.page.s;
import com.taobao.themis.kernel.extension.page.u;
import com.taobao.themis.kernel.i;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import com.taobao.themis.kernel.utils.j;
import com.taobao.themis.kernel.utils.n;
import com.taobao.themis.kernel.utils.t;
import com.taobao.themis.kernel.utils.v;
import com.taobao.themis.utils.o;
import com.taobao.themis.web.runtime.b;
import com.uc.webview.export.WebView;
import kotlin.Pair;
import tb.dqm;
import tb.kge;
import tb.qgo;
import tb.qpm;
import tb.qpt;
import tb.qqc;
import tb.qqn;
import tb.qqo;
import tb.qqp;
import tb.tei;
import tb.thk;
import tb.tle;
import tb.tmj;

/* loaded from: classes9.dex */
public class b extends qqn {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private WVUCWebView c;
    private String d;
    private boolean e;

    /* renamed from: com.taobao.themis.web.runtime.b$4  reason: invalid class name */
    /* loaded from: classes9.dex */
    public class AnonymousClass4 implements f.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ qqo f22895a;
        public final /* synthetic */ com.taobao.themis.kernel.f b;
        public final /* synthetic */ f d;
        public final /* synthetic */ String e;
        public final /* synthetic */ Activity f;

        public AnonymousClass4(f fVar, String str, Activity activity, com.taobao.themis.kernel.f fVar2, qqo qqoVar) {
            this.d = fVar;
            this.e = str;
            this.f = activity;
            this.b = fVar2;
            this.f22895a = qqoVar;
        }

        @Override // com.taobao.themis.kernel.extension.page.f.b
        public void a(final com.taobao.themis.kernel.preload.c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f61bb256", new Object[]{this, cVar});
            } else {
                com.taobao.themis.kernel.utils.a.a(new Runnable() { // from class: com.taobao.themis.web.runtime.TMSWebRender$4$1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else if (b.a(b.this) == null || b.a(b.this).isDestroied()) {
                            b.AnonymousClass4.this.d.a();
                        } else {
                            b bVar = b.this;
                            String a2 = com.taobao.themis.kernel.logger.b.a(b.$ipChange);
                            b bVar2 = b.this;
                            com.taobao.themis.kernel.logger.a.a(com.taobao.themis.kernel.logger.a.MODULE_LAUNCH_PAGE, "ON_FINISH_MAINDOCUMENT_EXTENSION", a2, com.taobao.themis.kernel.logger.b.a(b.$ipChange), new JSONObject());
                            Integer a3 = cVar.a();
                            if (a3 != null) {
                                b.a(b.this).setPrefetchInfo(new g(b.AnonymousClass4.this.e, a3.intValue()));
                            }
                            b.a(b.this, b.AnonymousClass4.this.f, b.AnonymousClass4.this.b, b.AnonymousClass4.this.e, b.AnonymousClass4.this.f22895a);
                        }
                    }
                });
            }
        }
    }

    static {
        kge.a(-704183304);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -69967319:
                super.a((qqo) objArr[0]);
                return null;
            case 90991720:
                super.a();
                return null;
            case 94685804:
                super.e();
                return null;
            case 95609325:
                super.f();
                return null;
            case 105768056:
                super.q();
                return null;
            case 108538619:
                super.t();
                return null;
            case 109462140:
                super.u();
                return null;
            case 2045969029:
                super.a(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            default:
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }
    }

    @Override // tb.qqq
    public void a(byte[] bArr, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba3ac339", new Object[]{this, bArr, str});
        }
    }

    @Override // tb.qqq
    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : "WEB";
    }

    public static /* synthetic */ WVUCWebView a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WVUCWebView) ipChange.ipc$dispatch("d3314058", new Object[]{bVar}) : bVar.c;
    }

    public static /* synthetic */ void a(b bVar, Activity activity, com.taobao.themis.kernel.f fVar, String str, qqo qqoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f64a4e1", new Object[]{bVar, activity, fVar, str, qqoVar});
        } else {
            bVar.a(activity, fVar, str, qqoVar);
        }
    }

    public static /* synthetic */ ITMSPage d(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ITMSPage) ipChange.ipc$dispatch("83cfc8a5", new Object[]{bVar}) : bVar.b;
    }

    public static /* synthetic */ ITMSPage e(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ITMSPage) ipChange.ipc$dispatch("849e4726", new Object[]{bVar}) : bVar.b;
    }

    public static /* synthetic */ ITMSPage f(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ITMSPage) ipChange.ipc$dispatch("856cc5a7", new Object[]{bVar}) : bVar.b;
    }

    public static /* synthetic */ ITMSPage g(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ITMSPage) ipChange.ipc$dispatch("863b4428", new Object[]{bVar}) : bVar.b;
    }

    public static /* synthetic */ ITMSPage h(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ITMSPage) ipChange.ipc$dispatch("8709c2a9", new Object[]{bVar}) : bVar.b;
    }

    public static /* synthetic */ ITMSPage i(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ITMSPage) ipChange.ipc$dispatch("87d8412a", new Object[]{bVar}) : bVar.b;
    }

    public b(final ITMSPage iTMSPage) {
        super(iTMSPage);
        int i;
        com.taobao.monitor.procedure.g b;
        boolean z = false;
        this.e = false;
        com.taobao.themis.kernel.extension.page.d dVar = (com.taobao.themis.kernel.extension.page.d) iTMSPage.a(com.taobao.themis.kernel.extension.page.d.class);
        if (dVar != null && (b = dVar.b()) != null) {
            b.a("h5InitCompleted", Boolean.valueOf(WVCore.getInstance().isUCSupport()));
        }
        Activity o = this.f33035a.o();
        if (o == null) {
            return;
        }
        iTMSPage.a(new d(iTMSPage));
        IWebAdapter iWebAdapter = (IWebAdapter) qpt.b(IWebAdapter.class);
        if (iWebAdapter != null) {
            iWebAdapter.registerPlugins();
        }
        this.d = iTMSPage.e();
        s sVar = (s) iTMSPage.a(s.class);
        if (sVar != null) {
            sVar.a(new s.c() { // from class: com.taobao.themis.web.runtime.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.themis.kernel.extension.page.s.c
                public int b() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
                    }
                    return 9;
                }

                @Override // com.taobao.themis.kernel.extension.page.s.c
                public boolean a(ITMSPage iTMSPage2, TMSBackPressedType tMSBackPressedType) {
                    IpChange ipChange = $ipChange;
                    boolean z2 = true;
                    if (ipChange instanceof IpChange) {
                        return ((Boolean) ipChange.ipc$dispatch("19000c3b", new Object[]{this, iTMSPage2, tMSBackPressedType})).booleanValue();
                    }
                    WVUCWebView a2 = b.a(b.this);
                    if (a2 == null) {
                        return false;
                    }
                    String url = a2.getUrl();
                    if (!TextUtils.isEmpty(url)) {
                        try {
                            Uri b2 = o.b(url);
                            if (b2 != null) {
                                if ("true".equals(b2.getQueryParameter("disallowback"))) {
                                    return false;
                                }
                            }
                        } catch (Exception unused) {
                        }
                    }
                    boolean back = a2.back();
                    String url2 = a2.getUrl();
                    if (!back || TextUtils.equals(url2, "about:blank")) {
                        z2 = false;
                    }
                    TMSLogger.d("Themis/WebRenderer", "interceptBack ret=" + z2 + ", currentUrl=" + url2);
                    return z2;
                }
            });
        }
        String str = this.d;
        if (!n.bu() || TextUtils.isEmpty(str)) {
            i = 3;
        } else {
            if (str.contains("webview_strategy=system")) {
                TMSLogger.a("Themis/WebRenderer", "use system core, reason: query param");
                i = 2;
            } else {
                i = 3;
            }
            if (i == 3 && n.j(str)) {
                tei D = this.f33035a.D();
                v b2 = t.b(o, "systemWebViewABV2");
                if (b2.b()) {
                    if (!WVCore.getInstance().isUCSupport() && e.a(o)) {
                        i = 2;
                    }
                    z = i == 3 ? true : z;
                    TMSLogger.a("Themis/WebRenderer", "use system core, reason: config, isU4=" + z);
                } else {
                    TMSLogger.a("Themis/WebRenderer", "don't use system core, reason: not enabled");
                }
                D.a("systemWebViewABV2", b2.a());
            }
        }
        WVUCWebView.Builder realUrl = new WVUCWebView.Builder().setCoreType(i).setContext(o).setEnablePreCreate(true).setEnablePrerender(true).setRealUrl(this.d);
        if (this.f33035a.i() == TMSContainerType.EMBEDDED) {
            realUrl.setTouchEventHandler(new WVUCWebView.TouchEventHandler() { // from class: com.taobao.themis.web.runtime.b.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str2, Object... objArr) {
                    int hashCode = str2.hashCode();
                    if (hashCode == -1253202544) {
                        super.coreDispatchTouchEvent((MotionEvent) objArr[0]);
                        return null;
                    } else if (hashCode != 143825878) {
                        throw new InstantReloadException(String.format("String switch could not find '%s'", str2));
                    } else {
                        super.coreOverScrollBy(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue(), ((Number) objArr[5]).intValue(), ((Number) objArr[6]).intValue(), ((Number) objArr[7]).intValue(), ((Boolean) objArr[8]).booleanValue());
                        return null;
                    }
                }

                @Override // android.taobao.windvane.extra.uc.WVUCWebView.TouchEventHandler
                public void coreOverScrollBy(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z2) {
                    tmj b3;
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("8929bd6", new Object[]{this, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8), new Integer(i9), new Boolean(z2)});
                        return;
                    }
                    super.coreOverScrollBy(i2, i3, i4, i5, i6, i7, i8, i9, z2);
                    if (iTMSPage.a(a.class) != null && (b3 = ((a) iTMSPage.a(a.class)).b()) != null) {
                        b3.a(i2, i3, i4, i5, i6, i7, i8, i9, z2);
                    } else if (b.a(b.this) == null || b.a(b.this).getParent() == null) {
                    } else {
                        b.a(b.this).getParent().requestDisallowInterceptTouchEvent(false);
                    }
                }

                @Override // android.taobao.windvane.extra.uc.WVUCWebView.TouchEventHandler
                public void coreDispatchTouchEvent(MotionEvent motionEvent) {
                    tmj b3;
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("b54da590", new Object[]{this, motionEvent});
                        return;
                    }
                    super.coreDispatchTouchEvent(motionEvent);
                    if (iTMSPage.a(a.class) != null && (b3 = ((a) iTMSPage.a(a.class)).b()) != null) {
                        b3.a(motionEvent);
                    } else if (motionEvent.getAction() != 0 || b.a(b.this) == null || b.a(b.this).getParent() == null) {
                    } else {
                        b.a(b.this).getParent().requestDisallowInterceptTouchEvent(true);
                    }
                }
            });
        }
        a(realUrl);
        this.c = realUrl.build();
        if (iTMSPage.a(a.class) != null) {
            ((a) iTMSPage.a(a.class)).a(this.c);
        }
        this.c.putExternalContext(i.MEGA_BRIDGE_PAGE_KEY, iTMSPage);
        String userAgentString = this.c.getUserAgentString();
        if (n.aw()) {
            WVUCWebView wVUCWebView = this.c;
            wVUCWebView.setUserAgentString(userAgentString + " " + com.taobao.themis.kernel.utils.o.g(this.f33035a));
        } else {
            WVUCWebView wVUCWebView2 = this.c;
            wVUCWebView2.setUserAgentString(userAgentString + " Themis");
        }
        Integer j = qqc.j(this.b);
        if (j != null) {
            this.c.setBackgroundColor(j.intValue());
        }
        thk a2 = com.taobao.themis.kernel.utils.a.a(this.b.b());
        if (this.c.getCurrentViewCoreType() == 3) {
            TMSLogger.d("Themis/WebRenderer", "use u4 core");
            if (t.a()) {
                this.c.openAsyncAPIChannel();
                if (this.b != null && this.b.a(com.taobao.themis.kernel.extension.page.d.class) != null) {
                    ((com.taobao.themis.kernel.extension.page.d) this.b.a(com.taobao.themis.kernel.extension.page.d.class)).b().a("openAsyncAPIChannel", "true");
                }
                com.taobao.monitor.procedure.s.f18233a.d().a("openAsyncAPIChannel", "true");
            }
            if (a2 != null) {
                a2.a("kernelType", "UC");
            }
        } else {
            TMSLogger.d("Themis/WebRenderer", "use system core");
            if (a2 != null) {
                a2.a("kernelType", "native");
            }
        }
        this.e = com.taobao.themis.utils.f.b(o);
        TMSLogger.d("Themis/WebRenderer", "pauseWebViewOnStop=" + this.e);
        this.f33035a.D().a("wvWriteChunkAsyncAB", t.h(this.f33035a.o()).a());
    }

    private void a(WVUCWebView.Builder builder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae377992", new Object[]{this, builder});
            return;
        }
        final thk a2 = com.taobao.themis.kernel.utils.a.a(this.b.b());
        builder.setWebViewPageModel(new dqm() { // from class: com.taobao.themis.web.runtime.b.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass3 anonymousClass3, String str, Object... objArr) {
                int hashCode = str.hashCode();
                if (hashCode == 428975361) {
                    super.onProperty((String) objArr[0], objArr[1]);
                    return null;
                } else if (hashCode != 1805974292) {
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str));
                } else {
                    super.onStage((String) objArr[0], ((Number) objArr[1]).longValue());
                    return null;
                }
            }

            @Override // tb.dqm, tb.dqn
            public void onStage(String str, long j) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6ba4fb14", new Object[]{this, str, new Long(j)});
                    return;
                }
                super.onStage(str, j);
                thk thkVar = a2;
                if (thkVar == null) {
                    return;
                }
                thkVar.a(str, j);
            }

            @Override // tb.dqm, tb.dqn
            public void onProperty(String str, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1991a501", new Object[]{this, str, obj});
                    return;
                }
                super.onProperty(str, obj);
                thk thkVar = a2;
                if (thkVar == null) {
                    return;
                }
                thkVar.a(str, obj.toString());
            }
        });
    }

    @Override // tb.qqn, tb.qqq
    public void a(qqo qqoVar) {
        Activity o;
        Intent intent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbd46229", new Object[]{this, qqoVar});
            return;
        }
        super.a(qqoVar);
        if (n.I() && this.f33035a.b(tle.class) != null && (o = this.f33035a.o()) != null && (intent = o.getIntent()) != null) {
            String dataString = intent.getDataString();
            if (!TextUtils.isEmpty(dataString) && !TextUtils.equals(dataString, this.d)) {
                TMSLogger.d("极简链路", "use latest url " + dataString);
                this.f33035a.c(dataString);
                this.d = dataString;
            }
        }
        qqp qqpVar = new qqp();
        qqpVar.f33036a = this.d;
        a(qqpVar, qqoVar);
    }

    @Override // tb.qqn, tb.qqq
    public void b(qqp qqpVar, qqo qqoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f559a1ca", new Object[]{this, qqpVar, qqoVar});
            return;
        }
        if (qqpVar == null) {
            qqpVar = new qqp();
            qqpVar.f33036a = this.d;
        }
        if (n.aM()) {
            try {
                String a2 = o.a(qqpVar.f33036a, InstanceStartParams.KEY_PAGE_BG_COLOR, true);
                if (!TextUtils.isEmpty(a2)) {
                    this.c.setBackgroundColor(Color.parseColor(a2));
                }
            } catch (Throwable th) {
                TMSLogger.a("Themis/WebRenderer", th);
            }
        }
        a(qqpVar, qqoVar);
    }

    public void a(qqp qqpVar, qqo qqoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8c0ac49", new Object[]{this, qqpVar, qqoVar});
        } else if (qqpVar == null) {
            TMSLogger.d("Themis/WebRenderer", "renderOptions is null");
        } else if (TextUtils.isEmpty(qqpVar.f33036a)) {
            TMSLogger.d("Themis/WebRenderer", "fail to render because of empty url");
        } else if (this.c == null) {
            TMSLogger.d("Themis/WebRenderer", "fail to render because of null webView.");
        } else {
            com.taobao.themis.kernel.f fVar = this.f33035a;
            if (fVar == null) {
                TMSLogger.d("Themis/WebRenderer", "fail to render because of null TMSInstance.");
                return;
            }
            Activity o = fVar.o();
            if (o == null) {
                TMSLogger.d("Themis/WebRenderer", "failed to loadUrl because of null activity.");
                return;
            }
            a(o);
            if (this.c.getWebViewContext().isClientPrerender()) {
                TMSLogger.d("Themis/WebRenderer", "fail to render because of prerender success.");
                this.c.getWebViewContext().setRealUrl(qqpVar.f33036a);
                return;
            }
            f fVar2 = (f) this.b.a(f.class);
            String str = qqpVar.f33036a;
            if (fVar2 != null && fVar2.d()) {
                com.taobao.themis.kernel.logger.a.a(com.taobao.themis.kernel.logger.a.MODULE_LAUNCH_PAGE, "ON_BIND_MAINDOCUMENT_EXTENSION", com.taobao.themis.kernel.logger.b.a(this.f33035a), com.taobao.themis.kernel.logger.b.a(this.b), new JSONObject());
                fVar2.a(new AnonymousClass4(fVar2, str, o, fVar, qqoVar));
                return;
            }
            a(o, fVar, str, qqoVar);
        }
    }

    private void a(Activity activity, final com.taobao.themis.kernel.f fVar, String str, final qqo qqoVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1e14a", new Object[]{this, activity, fVar, str, qqoVar});
            return;
        }
        this.c.setWebViewClient(new c(activity, qqoVar, this.b, this.c.getPrefetchInfo()) { // from class: com.taobao.themis.web.runtime.b.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass5 anonymousClass5, String str2, Object... objArr) {
                int hashCode = str2.hashCode();
                if (hashCode == -332805219) {
                    super.onPageFinished((WebView) objArr[0], (String) objArr[1]);
                    return null;
                } else if (hashCode != 534767588) {
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str2));
                } else {
                    super.onPageStarted((WebView) objArr[0], (String) objArr[1], (Bitmap) objArr[2]);
                    return null;
                }
            }

            @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
            public void onPageStarted(WebView webView, String str2, Bitmap bitmap) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("1fdfe7e4", new Object[]{this, webView, str2, bitmap});
                } else {
                    super.onPageStarted(webView, str2, bitmap);
                }
            }

            @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
            public void onPageFinished(WebView webView, String str2) {
                ITMSPage d;
                final u uVar;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ec29cb9d", new Object[]{this, webView, str2});
                    return;
                }
                super.onPageFinished(webView, str2);
                qqo qqoVar2 = qqoVar;
                if (qqoVar2 != null) {
                    qqoVar2.b();
                }
                WVUCWebView a2 = b.a(b.this);
                if (a2 == null) {
                    return;
                }
                if (n.bh()) {
                    a2.evaluateJavascript("!function(){\"use strict\";function t(e){return t=\"function\"==typeof Symbol&&\"symbol\"==typeof Symbol.iterator?function(t){return typeof t}:function(t){return t&&\"function\"==typeof Symbol&&t.constructor===Symbol&&t!==Symbol.prototype?\"symbol\":typeof t},t(e)}var e=\"complete\"===document.readyState,o=!1,n=function(){if(!o&&(o=!0,\"object\"===t(window.__sync_mega__))){var e,n,a,c,i={totalRequests:0,cacheHits:0,typeStats:{}},r=performance.getEntriesByType(\"navigation\").concat(performance.getEntriesByType(\"resource\")).reduce((function(t,e){var o=e.initiatorType,n=e.transferSize;return t.totalRequests+=1,0===n&&(t.cacheHits+=1),t.typeStats[o]||(t.typeStats[o]={totalRequests:0,cacheHits:0}),t.typeStats[o].totalRequests+=1,0===n&&(t.typeStats[o].cacheHits+=1),t}),i),s=Object.keys(r.typeStats).reduce((function(t,e){var o=r.typeStats[e],n=o.totalRequests,a=o.cacheHits;return t[e]=a/n,t}),{});e=\"Themis\",n=\"CacheHitRate\",a={cacheHitRate:r.cacheHits/r.totalRequests,typedCacheHitRate:s,webAppUrl:location.href},null===(c=window.__megability_bridge__)||void 0===c||c.asyncCall(\"appMonitor\",\"alarmSuccess\",{module:e,monitorPoint:n,args:a},(function(t){return console.log(t)}))}};e?n():window.addEventListener(\"load\",(function(){n()}))}();\n");
                }
                if (!n.bo() || fVar.j() != TMSSolutionType.WEB_SINGLE_PAGE || (d = b.d(b.this)) == null || (uVar = (u) d.a(u.class)) == null) {
                    return;
                }
                a2.evaluateJavascript(u.Companion.a(), new ValueCallback<String>() { // from class: com.taobao.themis.web.runtime.TMSWebRender$5$1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.webkit.ValueCallback
                    public void onReceiveValue(String str3) {
                        IpChange ipChange3 = $ipChange;
                        if (ipChange3 instanceof IpChange) {
                            ipChange3.ipc$dispatch("138ac29e", new Object[]{this, str3});
                        } else {
                            uVar.a(str3);
                        }
                    }
                });
            }
        });
        this.c.setWebChromeClient(new WVUCWebChromeClient() { // from class: com.taobao.themis.web.runtime.b.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass6 anonymousClass6, String str2, Object... objArr) {
                if (str2.hashCode() == -2015964955) {
                    super.onReceivedTitle((WebView) objArr[0], (String) objArr[1]);
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str2));
            }

            @Override // android.taobao.windvane.extra.uc.WVUCWebChromeClient, com.uc.webview.export.WebChromeClient
            public void onReceivedTitle(WebView webView, String str2) {
                qpm f;
                com.taobao.themis.kernel.container.ui.titlebar.b titleBar;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("87d6d0e5", new Object[]{this, webView, str2});
                    return;
                }
                super.onReceivedTitle(webView, str2);
                if (b.e(b.this).a(a.class) != null && ((a) b.f(b.this).a(a.class)).d() != null) {
                    ((a) b.g(b.this).a(a.class)).d();
                }
                if (!n.W()) {
                    return;
                }
                if ((str2 != null && (str2.startsWith(k.HTTPS_PREFIX) || str2.startsWith(k.HTTP_PREFIX))) || !qqc.e(b.h(b.this)) || (f = b.i(b.this).f()) == null || (titleBar = f.getTitleBar()) == null) {
                    return;
                }
                titleBar.setTitle(str2, "");
            }
        });
        TMSLogger.d("Themis/WebRenderer", "loadUrl " + str);
        if (qqoVar != null) {
            qqoVar.a();
        }
        if (n.aR()) {
            com.taobao.themis.kernel.extension.page.o oVar = (com.taobao.themis.kernel.extension.page.o) this.b.a(com.taobao.themis.kernel.extension.page.o.class);
            boolean a2 = oVar != null ? oVar.a() : false;
            if (TMSSolutionType.UNIAPP == fVar.j() && !a2 && !this.b.c().l()) {
                z = false;
            }
            if (!z) {
                android.taobao.windvane.jsbridge.t.a(this.c, false);
            }
        }
        this.c.getWebViewContext().setCustomMegaBizId(qqc.w(this.b));
        thk a3 = com.taobao.themis.kernel.utils.a.a(fVar);
        if (a3 != null) {
            a3.a("engineInitEnd");
        }
        this.c.loadUrl(str);
    }

    @Override // tb.qqq
    public View b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("639153eb", new Object[]{this}) : this.c;
    }

    @Override // tb.qqq
    public void a(String str, JSON json) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8072587d", new Object[]{this, str, json});
            return;
        }
        WVUCWebView wVUCWebView = this.c;
        if (wVUCWebView != null) {
            wVUCWebView.fireEvent(str, json == null ? "{}" : json.toJSONString());
        }
        WVUCWebView wVUCWebView2 = this.c;
        if (wVUCWebView2 == null) {
            return;
        }
        if (json == null) {
            json = new JSONObject();
        }
        wVUCWebView2.evaluateJavascript(j.a(str, json));
    }

    @Override // tb.qqn, tb.qqq
    public void b(String str, JSON json) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("721bfe9c", new Object[]{this, str, json});
            return;
        }
        WVUCWebView wVUCWebView = this.c;
        if (wVUCWebView == null) {
            return;
        }
        wVUCWebView.fireEvent(str, json == null ? "{}" : json.toJSONString());
    }

    @Override // tb.qqn, tb.qqq
    public void a(String str, String str2, JSON json) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("578c98f3", new Object[]{this, str, str2, json});
            return;
        }
        WVUCWebView wVUCWebView = this.c;
        if (wVUCWebView == null) {
            return;
        }
        if (json == null) {
            json = new JSONObject();
        }
        wVUCWebView.evaluateJavascript(j.a(str, str2, json));
    }

    @Override // tb.qqq
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        WVUCWebView wVUCWebView = this.c;
        if (wVUCWebView == null || wVUCWebView.isDestroied()) {
            return;
        }
        this.c.evaluateJavascript(str, null);
    }

    @Override // tb.qqq
    public Bitmap di_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("db94d7df", new Object[]{this});
        }
        if (com.taobao.themis.utils.f.a(this.c, SurfaceView.class) != null) {
            TMSLogger.d("Themis/WebRenderer", "can't get page snapshot due to SurfaceView");
            return null;
        } else if (com.taobao.themis.utils.f.a(this.c, TextureView.class) != null) {
            TMSLogger.d("Themis/WebRenderer", "can't get page snapshot due to TextureView");
            return null;
        } else {
            WVUCWebView wVUCWebView = this.c;
            return com.taobao.themis.utils.d.a(wVUCWebView, wVUCWebView.getWidth(), this.c.getHeight(), 0, 0);
        }
    }

    @Override // tb.qqn, tb.qqq
    public void a(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79f30285", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.a(i, i2, intent);
        WVUCWebView wVUCWebView = this.c;
        if (wVUCWebView == null) {
            return;
        }
        wVUCWebView.onActivityResult(i, i2, intent);
    }

    @Override // tb.qqn, tb.qqq
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        super.e();
        WVUCWebView wVUCWebView = this.c;
        if (wVUCWebView != null) {
            wVUCWebView.onResume();
        }
        com.taobao.themis.kernel.logger.a.a(com.taobao.themis.kernel.logger.a.MODULE_LAUNCH_PAGE, com.taobao.themis.kernel.logger.a.EVENT_LIFECYCLE, com.taobao.themis.kernel.logger.b.a(this.b), com.taobao.themis.kernel.logger.a.a(com.taobao.themis.kernel.logger.b.a(this.b)), com.taobao.themis.kernel.utils.f.a(new Pair("name", "WebView.onResume")));
    }

    @Override // tb.qqn, tb.qqq
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        super.a();
        WVUCWebView wVUCWebView = this.c;
        if (wVUCWebView == null || this.e) {
            return;
        }
        wVUCWebView.onPause();
        com.taobao.themis.kernel.logger.a.a(com.taobao.themis.kernel.logger.a.MODULE_LAUNCH_PAGE, com.taobao.themis.kernel.logger.a.EVENT_LIFECYCLE, com.taobao.themis.kernel.logger.b.a(this.b), com.taobao.themis.kernel.logger.a.a(com.taobao.themis.kernel.logger.b.a(this.b)), com.taobao.themis.kernel.utils.f.a(new Pair("name", "WebView.onPause")));
    }

    @Override // tb.qqn, tb.qqq
    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
            return;
        }
        super.q();
        WVUCWebView wVUCWebView = this.c;
        if (wVUCWebView == null || !this.e) {
            return;
        }
        wVUCWebView.onPause();
        com.taobao.themis.kernel.logger.a.a(com.taobao.themis.kernel.logger.a.MODULE_LAUNCH_PAGE, com.taobao.themis.kernel.logger.a.EVENT_LIFECYCLE, com.taobao.themis.kernel.logger.b.a(this.b), com.taobao.themis.kernel.logger.a.a(com.taobao.themis.kernel.logger.b.a(this.b)), com.taobao.themis.kernel.utils.f.a(new Pair("name", "WebView.onPause")));
    }

    @Override // tb.qqn, tb.qqq
    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6782afb", new Object[]{this});
            return;
        }
        super.t();
        e();
    }

    @Override // tb.qqn, tb.qqq
    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686427c", new Object[]{this});
            return;
        }
        super.u();
        a();
    }

    @Override // tb.qqn, tb.qqq
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        super.f();
        WVUCWebView wVUCWebView = this.c;
        if (wVUCWebView == null) {
            return;
        }
        try {
            ViewParent parent = wVUCWebView.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.c);
            }
            this.c.destroy();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.c = null;
    }

    @Override // tb.qqn, tb.qqq
    public void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{this, str, obj});
            return;
        }
        WVUCWebView wVUCWebView = this.c;
        if (wVUCWebView == null) {
            return;
        }
        wVUCWebView.evaluateJavascript("document.documentElement.style.setProperty('" + str + "', '" + obj + "');", null);
    }

    private void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
            return;
        }
        String a2 = qgo.a();
        if (!TextUtils.isEmpty(a2)) {
            a(a2);
        }
        a(j.b(this.b));
        if (!n.az()) {
            return;
        }
        a(qqc.a(this.b, false));
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        WVUCWebView wVUCWebView = this.c;
        if (wVUCWebView == null) {
            return;
        }
        try {
            if (wVUCWebView.getWebViewContext().isClientPrerender()) {
                this.c.evaluateJavascript(str, null);
            } else {
                this.c.injectJsEarly(str);
            }
        } catch (Exception unused) {
            TMSLogger.d("Themis/WebRenderer", "injectOrEvaluateJS error");
        }
    }
}
