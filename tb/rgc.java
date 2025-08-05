package tb;

import android.net.http.SslError;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.extra.uc.WVUCWebViewClient;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.usertrack.track.ut.videotracker.a;
import com.taobao.android.fluid.common.view.DWPenetrateFrameLayout;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.deprecated.message.IMessageService;
import com.uc.webview.export.SslErrorHandler;
import com.uc.webview.export.WebView;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class rgc extends ptk implements qqf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ViewGroup f33140a;
    private boolean b;
    private WVUCWebView c;
    private boolean d;
    private final boolean e;
    private Runnable k;
    private boolean l;
    private long m = -1;
    private int n = -1;
    private final psw o;

    static {
        kge.a(-112925782);
        kge.a(-667311474);
    }

    public static /* synthetic */ Object ipc$super(rgc rgcVar, String str, Object... objArr) {
        if (str.hashCode() == -152376096) {
            super.cI_();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ int a(rgc rgcVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a1e500ec", new Object[]{rgcVar, new Integer(i)})).intValue();
        }
        rgcVar.n = i;
        return i;
    }

    public static /* synthetic */ WVUCWebView a(rgc rgcVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WVUCWebView) ipChange.ipc$dispatch("362f856d", new Object[]{rgcVar}) : rgcVar.c;
    }

    public static /* synthetic */ void a(rgc rgcVar, spy spyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18daf47e", new Object[]{rgcVar, spyVar});
        } else {
            rgcVar.b(spyVar);
        }
    }

    public static /* synthetic */ boolean a(rgc rgcVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a1e540ce", new Object[]{rgcVar, new Boolean(z)})).booleanValue();
        }
        rgcVar.b = z;
        return z;
    }

    public static /* synthetic */ int b(rgc rgcVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("83c2ca8b", new Object[]{rgcVar, new Integer(i)})).intValue();
        }
        rgcVar.i = i;
        return i;
    }

    public static /* synthetic */ long b(rgc rgcVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("eb79e1bf", new Object[]{rgcVar})).longValue() : rgcVar.m;
    }

    public static /* synthetic */ int c(rgc rgcVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65a0942a", new Object[]{rgcVar, new Integer(i)})).intValue();
        }
        rgcVar.i = i;
        return i;
    }

    public static /* synthetic */ void c(rgc rgcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9fce84c", new Object[]{rgcVar});
        } else {
            rgcVar.m();
        }
    }

    public static /* synthetic */ boolean d(rgc rgcVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c87feed1", new Object[]{rgcVar})).booleanValue() : rgcVar.l();
    }

    public static /* synthetic */ psw e(rgc rgcVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (psw) ipChange.ipc$dispatch("7cd81524", new Object[]{rgcVar}) : rgcVar.o;
    }

    public static /* synthetic */ int f(rgc rgcVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a585fbc2", new Object[]{rgcVar})).intValue() : rgcVar.n;
    }

    public rgc(ViewGroup viewGroup, psw pswVar) {
        this.f33140a = viewGroup;
        this.o = pswVar;
        this.e = a(this.o.z());
        spz.c("CardH5MessageHandler", "fullpage，initWebView配置-enableDelayInitWebView：" + this.e);
    }

    @Override // tb.qqf
    public View b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("639153eb", new Object[]{this}) : this.h;
    }

    @Override // tb.ptk, tb.spx
    public void a(final spy spyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff34879c", new Object[]{this, spyVar});
        } else if (spy.BIZ_OPEN_INTERACT.equals(spyVar.f33836a) && spyVar.c.equals("VSMSG_registerFilter")) {
            List c = c(spyVar);
            if (c == null) {
                return;
            }
            a(c);
        } else {
            boolean equals = spyVar.c.equals(spy.MSG_DATA_CHANGE);
            if ((!this.e && this.c == null && equals) || (this.e && this.c == null && equals && this.k == null)) {
                if (this.e) {
                    if (this.d) {
                        spz.c("CardH5MessageHandler", "fullpage，initWebView,active时");
                        b(spyVar);
                    } else {
                        this.k = new Runnable() { // from class: tb.rgc.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // java.lang.Runnable
                            public void run() {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                                    return;
                                }
                                spz.c("CardH5MessageHandler", "fullpage，initWebViewRunnable webview==" + rgc.a(rgc.this));
                                rgc.a(rgc.this, spyVar);
                            }
                        };
                    }
                } else {
                    spz.c("CardH5MessageHandler", "initWebView,直接创建");
                    b(spyVar);
                }
                HashMap hashMap = new HashMap();
                Map a2 = smb.a(this.o.z(), spyVar);
                a2.put("TTMC", Long.valueOf(this.m));
                hashMap.put("options", a2);
                hashMap.put("data", spyVar.i);
                hashMap.put("startTime", Long.valueOf(System.currentTimeMillis()));
                this.f.add(new spy("VSMSG_initWebView", spyVar.d, hashMap));
            } else if (this.i == 2) {
                try {
                    WVStandardEventCenter.postNotificationToJS(this.c, "onShortVideoMessage", JSON.toJSONString(spyVar.a(), SerializerFeature.DisableCircularReferenceDetect));
                } catch (Exception e) {
                    spz.a("CardH5MessageHandler", "", e);
                }
            } else if (this.i == 3 || this.i == 4) {
            } else {
                if (this.f.size() < 200) {
                    this.f.add(spyVar);
                } else {
                    spz.c("CardH5MessageHandler", "pendingMsg reach 200");
                }
            }
        }
    }

    @Override // tb.ptk, tb.spx
    public boolean d(spy spyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cabd9b23", new Object[]{this, spyVar})).booleanValue();
        }
        if (spyVar.c.equals("VSMSG_registerFilter") && (!spy.BIZ_OPEN_INTERACT.equals(spyVar.f33836a) || !b(spyVar.d))) {
            return false;
        }
        if ((this.j.isEmpty() && b(spyVar.d)) || "VSMSG_syncPageMap".equals(spyVar.c) || "VSMSG_syncProcessMap".equals(spyVar.c)) {
            return true;
        }
        return this.j.contains(spyVar.c) && (b(spyVar.d) || "VSMSG_syncPageMap".equals(spyVar.c) || "VSMSG_syncProcessMap".equals(spyVar.c));
    }

    private void a(List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else if (!this.j.isEmpty()) {
        } else {
            this.j.addAll(list);
            m();
            l();
        }
    }

    private boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue();
        }
        if (this.i != 2 || this.f.isEmpty()) {
            return false;
        }
        for (spy spyVar : this.f) {
            if (this.j.contains(spyVar.c) && b(spyVar.d)) {
                try {
                    WVStandardEventCenter.postNotificationToJS(this.c, "onShortVideoMessage", JSON.toJSONString(spyVar.a()));
                } catch (Exception e) {
                    spz.a("CardH5MessageHandler", "", e);
                }
            } else if (spyVar.c.equals("VSMSG_initWebView")) {
                spz.c("CardH5MessageHandler", "initWebView lost:" + spyVar.d + "  current:" + this.g);
                Log.e("CardH5MessageHandler", "initWebView lost:" + spyVar.d + "  current:" + this.g);
            }
        }
        this.f.clear();
        return true;
    }

    private void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
        } else if (!this.b || this.i == 3 || this.j.isEmpty()) {
        } else {
            this.i = 2;
        }
    }

    private void b(spy spyVar) {
        String str;
        final String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edb78e1d", new Object[]{this, spyVar});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("init web view, message: ");
        sb.append(spyVar != null ? spyVar.toString() : null);
        spz.c("CardH5MessageHandler", sb.toString());
        skl j = ((IDataService) this.o.z().getService(IDataService.class)).getConfig().j();
        if (j != null) {
            str = iqw.b(this.o.z()) ? j.l : j.k;
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            spz.c("CardH5MessageHandler", "init web view, url is empty");
            this.i = 3;
            return;
        }
        if (str.contains("?")) {
            str2 = str + "&sessionId=" + spyVar.d;
        } else {
            str2 = str + "?sessionId=" + spyVar.d;
        }
        spz.c("CardH5MessageHandler", "init web view, url: " + str2);
        this.m = System.currentTimeMillis();
        final DWPenetrateFrameLayout dWPenetrateFrameLayout = new DWPenetrateFrameLayout(this.f33140a.getContext());
        dWPenetrateFrameLayout.setBackgroundColor(0);
        this.c = new WVUCWebView(this.f33140a.getContext());
        this.c.setContentDescription(null);
        this.c.setTag(((IMessageService) this.o.z().getService(IMessageService.class)).getMessageCenter());
        this.c.setWebViewClient(new WVUCWebViewClient(this.f33140a.getContext()) { // from class: tb.rgc.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 anonymousClass2, String str3, Object... objArr) {
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
                rgc.a(rgc.this, (int) (System.currentTimeMillis() - rgc.b(rgc.this)));
                rgc.a(rgc.this, true);
                rgc.c(rgc.this);
                rgc.d(rgc.this);
                a.a(rgc.e(rgc.this).z(), rgc.e(rgc.this), rgc.f(rgc.this), "1", str2);
            }

            @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
            public void onReceivedError(WebView webView, int i, String str3, String str4) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("51deb74c", new Object[]{this, webView, new Integer(i), str3, str4});
                    return;
                }
                super.onReceivedError(webView, i, str3, str4);
                rgc.b(rgc.this, 3);
                spz.c("CardH5MessageHandler", "webview error:" + i + "  " + str3);
                dWPenetrateFrameLayout.setVisibility(8);
                a.a(rgc.e(rgc.this).z(), rgc.e(rgc.this), i, str3, "1", str2);
            }

            @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
            public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("b4c02f82", new Object[]{this, webView, sslErrorHandler, sslError});
                    return;
                }
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
                rgc.c(rgc.this, 3);
                spz.c("CardH5MessageHandler", "webview ssl error");
                dWPenetrateFrameLayout.setVisibility(8);
            }
        });
        this.c.setBackgroundColor(0);
        a(this.c);
        this.c.getSettings().setJavaScriptEnabled(true);
        this.c.loadUrl(str2);
        a.a(this.o.z(), this.o, "1", str2);
        dWPenetrateFrameLayout.addView(this.c, new ViewGroup.LayoutParams(-1, -1));
        this.f33140a.addView(dWPenetrateFrameLayout, new ViewGroup.LayoutParams(-1, -1));
    }

    @Override // tb.ptk, tb.spx, tb.snd
    public void cI_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6eaece0", new Object[]{this});
            return;
        }
        super.cI_();
        if (this.c == null) {
            return;
        }
        o();
        this.c.destroy();
        this.c = null;
    }

    private void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        WVUCWebView wVUCWebView = this.c;
        if (wVUCWebView == null || !(wVUCWebView.getParent() instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) this.c.getParent()).removeView(this.c);
    }

    public void c() {
        Runnable runnable;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (!this.e) {
        } else {
            this.d = true;
            if (this.c != null || (runnable = this.k) == null || this.l) {
                return;
            }
            this.l = true;
            runnable.run();
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (!this.e) {
        } else {
            this.d = false;
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        WVUCWebView wVUCWebView = this.c;
        if (wVUCWebView == null) {
            return;
        }
        wVUCWebView.onResume();
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        WVUCWebView wVUCWebView = this.c;
        if (wVUCWebView == null) {
            return;
        }
        wVUCWebView.onPause();
    }

    private boolean a(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8fc4079e", new Object[]{this, fluidContext})).booleanValue();
        }
        if (snf.c()) {
            return spj.a(fluidContext);
        }
        return false;
    }
}
