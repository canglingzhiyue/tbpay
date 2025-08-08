package tb;

import android.net.http.SslError;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.taobao.windvane.extra.uc.WVUCWebViewClient;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.usertrack.track.ut.videotracker.a;
import com.taobao.android.fluid.common.view.DWPenetrateFrameLayout;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.card.ICardService;
import com.taobao.android.fluid.framework.deprecated.message.IMessageService;
import com.taobao.taobao.R;
import com.uc.webview.export.SslErrorHandler;
import com.uc.webview.export.WebView;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class qqd extends ptk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final FluidContext f33032a;
    private final ViewGroup b;
    private boolean c;
    private WVUCWebView d;
    private String e;
    private long k = -1;
    private int l = -1;

    static {
        kge.a(1107095982);
    }

    public static /* synthetic */ Object ipc$super(qqd qqdVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -207205326) {
            super.a((String) objArr[0]);
            return null;
        } else if (hashCode != -152376096) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.cI_();
            return null;
        }
    }

    public static /* synthetic */ int a(qqd qqdVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7e1d5362", new Object[]{qqdVar, new Integer(i)})).intValue();
        }
        qqdVar.l = i;
        return i;
    }

    public static /* synthetic */ long a(qqd qqdVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fbcf6208", new Object[]{qqdVar})).longValue() : qqdVar.k;
    }

    public static /* synthetic */ boolean a(qqd qqdVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7e1d9344", new Object[]{qqdVar, new Boolean(z)})).booleanValue();
        }
        qqdVar.c = z;
        return z;
    }

    public static /* synthetic */ void b(qqd qqdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea526895", new Object[]{qqdVar});
        } else {
            qqdVar.c();
        }
    }

    public static /* synthetic */ boolean c(qqd qqdVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d8d56f1a", new Object[]{qqdVar})).booleanValue() : qqdVar.b();
    }

    public static /* synthetic */ FluidContext d(qqd qqdVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FluidContext) ipChange.ipc$dispatch("657f0851", new Object[]{qqdVar}) : qqdVar.f33032a;
    }

    public static /* synthetic */ int e(qqd qqdVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b5db7c0b", new Object[]{qqdVar})).intValue() : qqdVar.l;
    }

    public qqd(FluidContext fluidContext, ViewGroup viewGroup, String str) {
        this.f33032a = fluidContext;
        this.b = viewGroup;
        this.e = str;
    }

    @Override // tb.ptk, tb.spx
    public void a(spy spyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff34879c", new Object[]{this, spyVar});
        } else if (spy.BIZ_GOODS_LIST.equals(spyVar.f33836a) && spyVar.c.equals("VSMSG_registerFilter")) {
            List c = c(spyVar);
            if (c == null) {
                return;
            }
            a(c);
        } else {
            boolean equals = spyVar.c.equals("VSMSG_updateGoodsListData");
            if (this.d == null && equals) {
                b(spyVar);
                HashMap hashMap = new HashMap();
                Map a2 = smb.a(this.f33032a, spyVar);
                a2.put("TTMC", Long.valueOf(this.k));
                hashMap.put("options", a2);
                hashMap.put("data", spyVar.i);
                hashMap.put("startTime", Long.valueOf(System.currentTimeMillis()));
                this.f.add(new spy("VSMSG_initWebView", spyVar.d, hashMap));
            } else if (this.i == 2) {
                WVStandardEventCenter.postNotificationToJS(this.d, "onShortVideoMessage", JSON.toJSONString(spyVar.a(), SerializerFeature.DisableCircularReferenceDetect));
            } else if (this.i == 3 || this.i == 4) {
            } else {
                if (this.f.size() < 200) {
                    this.f.add(spyVar);
                } else {
                    spz.c("GoodsH5MessageHandler", "pendingMsg reach 200");
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
        if (spyVar.c.equals("VSMSG_registerFilter") && (!spy.BIZ_GOODS_LIST.equals(spyVar.f33836a) || !b(spyVar.d))) {
            return false;
        }
        if (this.j.isEmpty()) {
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
            c();
            b();
        }
    }

    private boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        if (this.i != 2 || this.f.isEmpty()) {
            return false;
        }
        for (spy spyVar : this.f) {
            if (this.j.contains(spyVar.c) && b(spyVar.d)) {
                WVStandardEventCenter.postNotificationToJS(this.d, "onShortVideoMessage", JSON.toJSONString(spyVar.a()));
            } else if (spyVar.c.equals("VSMSG_initWebView")) {
                spz.c("GoodsH5MessageHandler", "initWebView lost:" + spyVar.d + "  current:" + this.g);
                Log.e("GoodsH5MessageHandler", "initWebView lost:" + spyVar.d + "  current:" + this.g);
            }
        }
        this.f.clear();
        return true;
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (!this.c || this.i == 3 || this.j.isEmpty()) {
        } else {
            this.i = 2;
        }
    }

    private void b(spy spyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edb78e1d", new Object[]{this, spyVar});
        } else if (StringUtils.isEmpty(this.e)) {
            this.i = 3;
        } else {
            if (this.e.contains("?")) {
                this.e += "&sessionId=" + spyVar.d;
            } else {
                this.e += "?sessionId=" + spyVar.d;
            }
            this.k = System.currentTimeMillis();
            final DWPenetrateFrameLayout dWPenetrateFrameLayout = new DWPenetrateFrameLayout(this.b.getContext());
            this.d = new WVUCWebView(this.b.getContext());
            this.d.setContentDescription(null);
            this.d.setTag(((IMessageService) this.f33032a.getService(IMessageService.class)).getMessageCenter());
            final String str = this.e;
            this.d.setWebViewClient(new WVUCWebViewClient(this.b.getContext()) { // from class: tb.qqd.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str2, Object... objArr) {
                    int hashCode = str2.hashCode();
                    if (hashCode == -1262473342) {
                        super.onReceivedSslError((WebView) objArr[0], (SslErrorHandler) objArr[1], (SslError) objArr[2]);
                        return null;
                    } else if (hashCode == -332805219) {
                        super.onPageFinished((WebView) objArr[0], (String) objArr[1]);
                        return null;
                    } else if (hashCode != 1373550412) {
                        throw new InstantReloadException(String.format("String switch could not find '%s'", str2));
                    } else {
                        super.onReceivedError((WebView) objArr[0], ((Number) objArr[1]).intValue(), (String) objArr[2], (String) objArr[3]);
                        return null;
                    }
                }

                @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
                public void onPageFinished(WebView webView, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ec29cb9d", new Object[]{this, webView, str2});
                        return;
                    }
                    super.onPageFinished(webView, str2);
                    qqd.a(qqd.this, (int) (System.currentTimeMillis() - qqd.a(qqd.this)));
                    qqd.a(qqd.this, true);
                    qqd.b(qqd.this);
                    qqd.c(qqd.this);
                    a.a(qqd.d(qqd.this), ((ICardService) qqd.d(qqd.this).getService(ICardService.class)).getActiveCard(), qqd.e(qqd.this), "3", str);
                }

                @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
                public void onReceivedError(WebView webView, int i, String str2, String str3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("51deb74c", new Object[]{this, webView, new Integer(i), str2, str3});
                        return;
                    }
                    super.onReceivedError(webView, i, str2, str3);
                    qqd.this.i = 3;
                    spz.c("GoodsH5MessageHandler", "webview error:" + i + "  " + str2);
                    dWPenetrateFrameLayout.setVisibility(8);
                    a.a(qqd.d(qqd.this), ((ICardService) qqd.d(qqd.this).getService(ICardService.class)).getActiveCard(), i, str2, "3", str);
                }

                @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
                public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b4c02f82", new Object[]{this, webView, sslErrorHandler, sslError});
                        return;
                    }
                    super.onReceivedSslError(webView, sslErrorHandler, sslError);
                    qqd.this.i = 3;
                    spz.c("GoodsH5MessageHandler", "webview ssl error");
                    dWPenetrateFrameLayout.setVisibility(8);
                }
            });
            this.d.setBackgroundColor(0);
            a(dWPenetrateFrameLayout);
            this.h.setTag(((IMessageService) this.f33032a.getService(IMessageService.class)).getMessageCenter());
            this.h.setBackgroundResource(R.drawable.fluid_sdk_video_goods_list_bg);
            this.d.getSettings().setJavaScriptEnabled(true);
            this.d.loadUrl(this.e);
            a.a(this.f33032a, ((ICardService) this.f33032a.getService(ICardService.class)).getActiveCard(), "3", str);
            dWPenetrateFrameLayout.addView(this.d, new ViewGroup.LayoutParams(-1, -1));
            d();
        }
    }

    @Override // tb.ptk
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        super.a(str);
        d();
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.h == null) {
        } else {
            ViewParent parent = this.h.getParent();
            ViewGroup viewGroup = this.b;
            if (parent == viewGroup) {
                return;
            }
            viewGroup.removeAllViews();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, obx.a(this.b.getContext(), 427.0f));
            layoutParams.gravity = 80;
            this.b.addView(this.h, layoutParams);
        }
    }

    @Override // tb.ptk, tb.spx, tb.snd
    public void cI_() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6eaece0", new Object[]{this});
            return;
        }
        super.cI_();
        WVUCWebView wVUCWebView = this.d;
        if (wVUCWebView == null) {
            return;
        }
        wVUCWebView.destroy();
        this.d = null;
    }
}
