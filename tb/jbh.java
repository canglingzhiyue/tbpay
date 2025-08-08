package tb;

import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.extra.uc.WVUCWebViewClient;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import mtopsdk.common.util.StringUtils;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.globalinteraction.IInteractionService;
import com.taobao.android.fluid.business.usertrack.track.ut.videotracker.a;
import com.taobao.android.fluid.common.view.DWPenetrateFrameLayout;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.core.exception.FluidException;
import com.taobao.android.fluid.framework.card.ICardService;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.deprecated.message.IMessageService;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import com.taobao.orange.OrangeConfig;
import com.uc.webview.export.SslErrorHandler;
import com.uc.webview.export.WebView;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class jbh extends ptg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public WVUCWebView f29446a;
    private boolean b;
    private DWPenetrateFrameLayout c;
    private long k;
    private int l;
    private String m;
    private final Handler n;
    private spy o;
    private boolean p;
    public long q;
    public long r;

    static {
        kge.a(1831560365);
    }

    public static /* synthetic */ Object ipc$super(jbh jbhVar, String str, Object... objArr) {
        if (str.hashCode() == -152376096) {
            super.cI_();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public Map d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("913cde0", new Object[]{this});
        }
        return null;
    }

    public static /* synthetic */ int a(jbh jbhVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f271614e", new Object[]{jbhVar, new Integer(i)})).intValue();
        }
        jbhVar.i = i;
        return i;
    }

    public static /* synthetic */ DWPenetrateFrameLayout a(jbh jbhVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DWPenetrateFrameLayout) ipChange.ipc$dispatch("2d4adc79", new Object[]{jbhVar}) : jbhVar.c;
    }

    public static /* synthetic */ int b(jbh jbhVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d44f2aed", new Object[]{jbhVar, new Integer(i)})).intValue();
        }
        jbhVar.i = i;
        return i;
    }

    public static /* synthetic */ ViewGroup b(jbh jbhVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("72ab6ecc", new Object[]{jbhVar}) : jbhVar.d;
    }

    public static /* synthetic */ ViewGroup c(jbh jbhVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("e6eaa72b", new Object[]{jbhVar}) : jbhVar.d;
    }

    public static /* synthetic */ FluidContext d(jbh jbhVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FluidContext) ipChange.ipc$dispatch("dbc4ef3d", new Object[]{jbhVar}) : jbhVar.e;
    }

    public static /* synthetic */ FluidContext e(jbh jbhVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FluidContext) ipChange.ipc$dispatch("dcfb421c", new Object[]{jbhVar}) : jbhVar.e;
    }

    public static /* synthetic */ ViewGroup f(jbh jbhVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("43a85048", new Object[]{jbhVar}) : jbhVar.d;
    }

    public static /* synthetic */ ViewGroup g(jbh jbhVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("b7e788a7", new Object[]{jbhVar}) : jbhVar.d;
    }

    public static /* synthetic */ FluidContext h(jbh jbhVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FluidContext) ipChange.ipc$dispatch("e09e3ab9", new Object[]{jbhVar}) : jbhVar.e;
    }

    public jbh(FluidContext fluidContext, ViewGroup viewGroup) {
        super(fluidContext, viewGroup);
        this.k = -1L;
        this.l = -1;
        this.n = new Handler(Looper.getMainLooper());
        this.p = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00cb A[Catch: Exception -> 0x00e1, TRY_LEAVE, TryCatch #0 {Exception -> 0x00e1, blocks: (B:26:0x0070, B:28:0x0076, B:30:0x0080, B:32:0x0084, B:34:0x0098, B:44:0x00cb, B:35:0x009b, B:37:0x00a5, B:39:0x00b2, B:41:0x00bc), top: B:57:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    @Override // tb.ptk, tb.spx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(tb.spy r8) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.jbh.a(tb.spy):void");
    }

    @Override // tb.ptk, tb.spx
    public boolean d(spy spyVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cabd9b23", new Object[]{this, spyVar})).booleanValue();
        }
        if (iqw.a() && spyVar.c.equals(spy.MSG_DATA_CHANGE)) {
            if (spyVar.i == null || !oec.a(spyVar.i.get(obw.UPDATE_DATA_MSG_FOR_GLOBAL_H5), false)) {
                z = false;
            }
            spz.a("GlobalH5MessageHandler", "MSG_DATA_CHANGE ifForGlobalH5=" + z);
            return z;
        } else if (spyVar.c.equals("VSMSG_registerFilter")) {
            return b(spyVar);
        } else {
            if (!this.j.isEmpty()) {
                return this.j.contains(spyVar.c);
            }
            return true;
        }
    }

    private void a(List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (!this.j.isEmpty()) {
        } else {
            this.j.addAll(list);
            l();
            g();
        }
    }

    private boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        if (this.i != 2 || this.f.isEmpty()) {
            return false;
        }
        for (spy spyVar : this.f) {
            if (this.j.contains(spyVar.c)) {
                try {
                    spz.c("GlobalH5MessageHandler", "state is ready, send pending message to h5, message: " + spyVar.toString() + ", message.args: " + spyVar.i);
                    WVStandardEventCenter.postNotificationToJS(this.f29446a, "onShortVideoMessage", JSON.toJSONString(spyVar.a()));
                } catch (Exception e) {
                    spz.a("GlobalH5MessageHandler", "", e);
                }
            } else if (spyVar.c.equals("VSMSG_initWebView")) {
                spz.c("GlobalH5MessageHandler", "initWebView lost:" + spyVar.d + "  current:" + this.g);
            }
        }
        this.f.clear();
        return true;
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
        } else if (!this.b || this.i == 3 || this.j.isEmpty()) {
        } else {
            this.i = 2;
        }
    }

    private void e(spy spyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b940a1a0", new Object[]{this, spyVar});
            return;
        }
        this.i = 1;
        StringBuilder sb = new StringBuilder();
        sb.append("init web view, message: ");
        sb.append(spyVar != null ? spyVar.toString() : null);
        spz.c("GlobalH5MessageHandler", sb.toString());
        String j = spj.j(this.e);
        if (this.d != null) {
            pil.a(this.d.getContext(), j, "gg_interactive_render_h5");
        }
        String a2 = a(this.e);
        if (StringUtils.isEmpty(a2)) {
            spz.c("GlobalH5MessageHandler", "init web view, url is empty");
            this.i = 3;
            if (this.d != null) {
                pil.a(this.d.getContext(), j, "gg_interactive_render_h5", "webUrlEmpty", null);
            }
            a.a(this.e, ((ICardService) this.e.getService(ICardService.class)).getActiveCard(), 0, "url empty", "2", null);
            return;
        }
        spz.c("GlobalH5MessageHandler", "init web view, url: " + a2);
        this.q = SystemClock.elapsedRealtime();
        this.k = System.currentTimeMillis();
        this.c = new DWPenetrateFrameLayout(this.d.getContext());
        this.c.setBackgroundColor(0);
        a(null, j, a2, spyVar);
    }

    private void a(WVUCWebView wVUCWebView, final String str, final String str2, spy spyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa27f91", new Object[]{this, wVUCWebView, str, str2, spyVar});
            return;
        }
        if (wVUCWebView == null) {
            wVUCWebView = new WVUCWebView(this.d.getContext());
        }
        this.f29446a = wVUCWebView;
        this.f29446a.setTag(((IMessageService) this.e.getService(IMessageService.class)).getMessageCenter());
        this.f29446a.setWebViewClient(new WVUCWebViewClient(this.d.getContext()) { // from class: tb.jbh.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str3, Object... objArr) {
                int hashCode = str3.hashCode();
                if (hashCode == -1262473342) {
                    super.onReceivedSslError((WebView) objArr[0], (SslErrorHandler) objArr[1], (SslError) objArr[2]);
                    return null;
                } else if (hashCode == -332805219) {
                    super.onPageFinished((WebView) objArr[0], (String) objArr[1]);
                    return null;
                } else if (hashCode != 1373550412) {
                    throw new InstantReloadException(String.format("String switch could not find '%s'", str3));
                } else {
                    super.onReceivedError((WebView) objArr[0], ((Number) objArr[1]).intValue(), (String) objArr[2], (String) objArr[3]);
                    return null;
                }
            }

            @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
            public void onPageFinished(WebView webView, String str3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("ec29cb9d", new Object[]{this, webView, str3});
                    return;
                }
                super.onPageFinished(webView, str3);
                spz.c("GlobalH5MessageHandler", "web view load finish, webView: " + webView + ", url: " + str3);
                jbh.this.a(webView, str, str2);
            }

            @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
            public void onReceivedError(WebView webView, int i, String str3, String str4) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("51deb74c", new Object[]{this, webView, new Integer(i), str3, str4});
                    return;
                }
                super.onReceivedError(webView, i, str3, str4);
                jbh.a(jbh.this, 3);
                spz.c("GlobalH5MessageHandler", "web view receive error, webView: " + webView + ", url: " + str4 + ", errorCode: " + i + ", description: " + str3);
                jbh.a(jbh.this).setVisibility(8);
                if (jbh.c(jbh.this) != null) {
                    pil.a(jbh.b(jbh.this).getContext(), str, "gg_interactive_render_h5", "webError", null);
                }
                a.a(jbh.d(jbh.this), ((ICardService) jbh.e(jbh.this).getService(ICardService.class)).getActiveCard(), i, str3, "2", str2);
            }

            @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
            public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b4c02f82", new Object[]{this, webView, sslErrorHandler, sslError});
                    return;
                }
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
                jbh.b(jbh.this, 3);
                spz.c("GlobalH5MessageHandler", "web view receive ssl error");
                if (jbh.g(jbh.this) != null) {
                    pil.a(jbh.f(jbh.this).getContext(), str, "gg_interactive_render_h5", "webSSLError", null);
                }
                jbh.a(jbh.this).setVisibility(8);
            }
        });
        this.f29446a.setBackgroundColor(0);
        a(this.f29446a);
        this.f29446a.getSettings().setJavaScriptEnabled(true);
        this.r = SystemClock.elapsedRealtime();
        this.f29446a.loadUrl(str2);
        a.a(this.e, ((ICardService) this.e.getService(ICardService.class)).getActiveCard(), "2", str2);
        this.c.addView(this.f29446a, new ViewGroup.LayoutParams(-1, -1));
        this.d.addView(this.c, new ViewGroup.LayoutParams(-1, -1));
        this.f29446a.setContentDescription(null);
        HashMap hashMap = new HashMap();
        Map a2 = smb.a(this.e, spyVar);
        a2.put("TTMC", Long.valueOf(this.k));
        a2.put("isUseDXPop", Boolean.valueOf(com.taobao.android.fluid.business.videocollection.poplayer.a.a(this.e)));
        if (d() != null) {
            a2.put("isRealtime", true);
            a2.put("configs", d());
        }
        a2.put("globalInteractMultiTabEnabled", "false");
        hashMap.put("options", a2);
        if (spyVar != null && spyVar.i != null) {
            hashMap.put("data", spyVar.i);
        }
        hashMap.put("startTime", Long.valueOf(System.currentTimeMillis()));
        this.o = new spy("VSMSG_initWebView", "-1", hashMap);
        this.f.add(this.o);
        spz.c("GlobalH5MessageHandler", "init web view end");
    }

    public void a(WebView webView, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c031846", new Object[]{this, webView, str, str2});
            return;
        }
        this.l = (int) (System.currentTimeMillis() - this.k);
        this.b = true;
        l();
        g();
        if (this.d != null) {
            pil.a(this.d.getContext(), str, "gg_interactive_render_h5", null);
        }
        a.a(this.e, ((ICardService) this.e.getService(ICardService.class)).getActiveCard(), this.l, "2", str2);
    }

    @Override // tb.ptk, tb.spx, tb.snd
    public void cI_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6eaece0", new Object[]{this});
            return;
        }
        super.cI_();
        if (this.f29446a == null) {
            return;
        }
        s();
        this.f29446a.destroy();
        this.f29446a = null;
    }

    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
            return;
        }
        WVUCWebView wVUCWebView = this.f29446a;
        if (wVUCWebView == null || !(wVUCWebView.getParent() instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) this.f29446a.getParent()).removeView(this.f29446a);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.f29446a == null) {
        } else {
            if (r() && this.i == 3) {
                spz.c("GlobalH5MessageHandler", "state is error on page appear");
                this.f29446a.reload();
            }
            spz.c("GlobalH5MessageHandler", "H5全局互动层显示 webView=" + this.f29446a);
            boolean z = this instanceof jbi;
            if (z) {
                this.n.postDelayed(new Runnable() { // from class: tb.jbh.2
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        spz.c("GlobalH5MessageHandler", "H5全局互动层显示恢复");
                        if (jbh.this.f29446a != null) {
                            jbh.this.f29446a.setVisibility(0);
                        } else {
                            FluidException.throwException(jbh.h(jbh.this), IInteractionService.ERROR_CODE_WEB_VIEW_NULL);
                        }
                    }
                }, n());
            } else {
                this.f29446a.setVisibility(0);
            }
            if (z && m()) {
                return;
            }
            this.f29446a.onResume();
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.f29446a == null) {
        } else {
            String a2 = ((ILifecycleService) this.e.getService(ILifecycleService.class)).getConfig().a();
            spz.c("GlobalH5MessageHandler", "H5全局互动层隐藏 disappear的type为:" + a2 + "，webView=" + this.f29446a);
            this.n.removeCallbacksAndMessages(null);
            if (iqw.r() || "tab".equals(a2)) {
                this.f29446a.setVisibility(8);
            }
            if ((this instanceof jbi) && m()) {
                return;
            }
            this.f29446a.onPause();
        }
    }

    public void a(com.taobao.android.fluid.framework.data.datamodel.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e800264", new Object[]{this, aVar});
            return;
        }
        spz.c("GlobalH5MessageHandler", "init, isGlobalVCH5: " + (this instanceof jbi));
        spy spyVar = null;
        if (aVar != null && aVar.a() != null) {
            spyVar = new spy("VSMSG_initWebView", "-1", aVar.a().a(this.e));
        }
        e(spyVar);
    }

    public String a(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f6e6d446", new Object[]{this, fluidContext});
        }
        skl j = ((IDataService) this.e.getService(IDataService.class)).getConfig().j();
        if (j == null) {
            return null;
        }
        return j.m;
    }

    public boolean b(spy spyVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("edb78e21", new Object[]{this, spyVar})).booleanValue() : spy.BIZ_SHORTVIDEO_GLOBAL_H5.equals(spyVar.f33836a);
    }

    private boolean m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6158678", new Object[]{this})).booleanValue() : StringUtils.equals("true", OrangeConfig.getInstance().getConfig("ShortVideo", "disableOnResume", "true"));
    }

    private long n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6239de9", new Object[]{this})).longValue() : Long.valueOf(OrangeConfig.getInstance().getConfig("ShortVideo", "webViewShowDelay", "600")).longValue();
    }

    private void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        spz.c("GlobalH5MessageHandler", "handle if reload");
        if (r() && !this.p && !this.j.isEmpty()) {
            spz.c("GlobalH5MessageHandler", "handle if reload, check web view is reloaded");
            this.i = 2;
            DWPenetrateFrameLayout dWPenetrateFrameLayout = this.c;
            if (dWPenetrateFrameLayout != null) {
                dWPenetrateFrameLayout.setVisibility(0);
            }
            IMessageService iMessageService = (IMessageService) this.e.getService(IMessageService.class);
            if (iMessageService != null) {
                spy spyVar = this.o;
                if (spyVar != null) {
                    iMessageService.sendMessage(spyVar);
                    spz.c("GlobalH5MessageHandler", "handle if reload, send init web view message to message center");
                }
                a.c p = p();
                if (p != null) {
                    Map a2 = p.a(this.e);
                    a2.put(obw.UPDATE_DATA_MSG_FOR_GLOBAL_H5, true);
                    iMessageService.sendMessage(new spy(spy.MSG_DATA_CHANGE, p.c, a2));
                    spz.c("GlobalH5MessageHandler", "handle if reload, send update media data message to message center");
                }
            }
        }
        this.p = false;
    }

    private spy f(spy spyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (spy) ipChange.ipc$dispatch("63e47109", new Object[]{this, spyVar});
        }
        a.c p = p();
        if (p != null) {
            return new spy(spy.MSG_DATA_CHANGE, spyVar.d, p.a(this.e));
        }
        return new spy(spy.MSG_DATA_CHANGE, spyVar.d, new HashMap());
    }

    private a.c p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a.c) ipChange.ipc$dispatch("aa8bc914", new Object[]{this});
        }
        com.taobao.android.fluid.framework.data.datamodel.a currentMediaSetData = ((IDataService) this.e.getService(IDataService.class)).getCurrentMediaSetData();
        if (currentMediaSetData == null) {
            return null;
        }
        return currentMediaSetData.a();
    }

    private spy g(spy spyVar) {
        a.c a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (spy) ipChange.ipc$dispatch("4b864768", new Object[]{this, spyVar});
        }
        if (spyVar.i != null) {
            Object obj = spyVar.i.get("scene");
            if (obj instanceof String) {
                String valueOf = String.valueOf(obj);
                char c = 65535;
                if (valueOf.hashCode() == -974362802 && valueOf.equals("curMediaData")) {
                    c = 0;
                }
                if (c == 0) {
                    com.taobao.android.fluid.framework.data.datamodel.a currentMediaSetData = ((IDataService) this.e.getService(IDataService.class)).getCurrentMediaSetData();
                    Map<String, Object> map = (Map) spyVar.i.get("targetData");
                    if (map != null && !map.isEmpty() && currentMediaSetData != null && (a2 = currentMediaSetData.a()) != null) {
                        Map<String, Object> a3 = a2.a(this.e);
                        if (!a3.isEmpty()) {
                            a(map, a3, "getTargetDataInScene");
                            return spyVar;
                        }
                    }
                }
            }
        }
        return new spy("VSMSG_getTargetDataInScene", spyVar.d, new HashMap());
    }

    private void a(Map<String, Object> map, Map<String, Object> map2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e25c7392", new Object[]{this, map, map2, str});
        } else if (map != null && map2 != null) {
            try {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    if (entry.getValue() instanceof Map) {
                        a((Map) entry.getValue(), (Map) map2.get(entry.getKey()), entry.getKey());
                    } else {
                        entry.setValue(map2.get(entry.getKey()));
                    }
                }
            } catch (Throwable th) {
                spz.c("GlobalH5MessageHandler", "copyMapValue error: " + str);
                th.printStackTrace();
            }
        }
    }

    private boolean q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[]{this})).booleanValue() : oeb.a("ShortVideo.enableFilterPageStateMsg", true);
    }

    private boolean r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("65bfbfd", new Object[]{this})).booleanValue() : oeb.a("ShortVideo.enableFixGlobalH5Reload", true);
    }
}
