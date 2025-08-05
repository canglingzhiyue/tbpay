package com.taobao.android.detail.ttdetail.skeleton.desc.web;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.bizmessage.h;
import com.taobao.android.detail.ttdetail.communication.ThreadMode;
import com.taobao.android.detail.ttdetail.communication.g;
import com.taobao.android.detail.ttdetail.component.module.v;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.i;
import com.taobao.android.detail.ttdetail.utils.ae;
import com.taobao.android.detail.ttdetail.utils.e;
import com.taobao.android.detail.ttdetail.utils.f;
import com.taobao.android.detail.ttdetail.utils.j;
import com.taobao.android.detail.ttdetail.widget.webview.DetailHybridWebView;
import com.taobao.taobao.R;
import com.uc.webview.export.WebView;
import java.util.HashMap;
import tb.ado;
import tb.eyx;
import tb.kge;
import tb.odg;
import tb.ojv;
import tb.spl;

/* loaded from: classes5.dex */
public class a implements g, v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f10899a;
    private RelativeLayout b;
    private DetailHybridWebView c;
    private View d;
    private String e;
    private spl i;
    private i j;
    private h k;
    private h l;
    private int m;
    private boolean n;
    private boolean o;
    private ojv p;
    private eyx t;
    private boolean u;
    private boolean f = false;
    private boolean g = false;
    private boolean h = false;
    private boolean q = true;
    private float r = j.D();
    private boolean s = j.G();
    private boolean v = true;

    static {
        kge.a(1346996725);
        kge.a(-36377025);
        kge.a(-767194759);
    }

    private boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public static /* synthetic */ boolean a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("c7a6b344", new Object[]{aVar})).booleanValue() : aVar.g;
    }

    public static /* synthetic */ boolean a(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2d306798", new Object[]{aVar, new Boolean(z)})).booleanValue();
        }
        aVar.o = z;
        return z;
    }

    public static /* synthetic */ String b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("40e97aff", new Object[]{aVar}) : aVar.e;
    }

    public static /* synthetic */ spl c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (spl) ipChange.ipc$dispatch("a8af6c35", new Object[]{aVar}) : aVar.i;
    }

    public static /* synthetic */ DetailHybridWebView d(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DetailHybridWebView) ipChange.ipc$dispatch("83498d76", new Object[]{aVar}) : aVar.c;
    }

    public a(Context context, spl splVar) {
        this.f10899a = context;
        DetailHybridWebView.registerPlugins();
        com.taobao.android.detail.ttdetail.performance.d a2 = com.taobao.android.detail.ttdetail.performance.d.a(this.f10899a);
        if (a2 != null) {
            this.b = (RelativeLayout) a2.a(this.f10899a, R.layout.tt_detail_desc_web, null, true);
        } else {
            this.b = (RelativeLayout) LayoutInflater.from(this.f10899a).inflate(R.layout.tt_detail_desc_web, (ViewGroup) null);
        }
        this.b.setDescendantFocusability(393216);
        this.c = (DetailHybridWebView) this.b.findViewById(R.id.detail_main_bottompage_webview);
        this.c.setVerticalScrollBarEnabled(false);
        this.d = this.b.findViewById(R.id.detail_main_bottompage_empty);
        this.c.setHeightChangedListener(new DetailHybridWebView.d() { // from class: com.taobao.android.detail.ttdetail.skeleton.desc.web.a.1
        });
        if (splVar != null) {
            this.i = splVar;
            a(splVar.e);
        }
        a(this.f10899a);
    }

    public void a(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e04a050", new Object[]{this, iVar});
        } else {
            this.j = iVar;
        }
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.v
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        try {
            if (i == Integer.MAX_VALUE) {
                this.c.getCoreView().scrollTo(0, this.c.getContentHeight());
            } else if (i != 0) {
            } else {
                this.c.getCoreView().scrollTo(0, 0);
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.v
    public View getComponentView(View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("f5308061", new Object[]{this, view}) : this.b;
    }

    public void a(ojv ojvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f80b3afd", new Object[]{this, ojvVar});
        } else {
            this.p = ojvVar;
        }
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        e();
        if (i >= 0) {
            return;
        }
        if (this.m < i) {
            this.n = true;
        } else {
            this.n = false;
        }
        this.m = i;
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        DetailHybridWebView detailHybridWebView = this.c;
        if (detailHybridWebView == null || !this.s || !this.u || this.v) {
            return;
        }
        try {
            int scrollY = detailHybridWebView.getCoreView().getScrollY();
            int contentHeight = this.c.getContentHeight();
            int b = f.b(this.f10899a);
            if (!this.q) {
                return;
            }
            float f = b;
            if (contentHeight <= this.r * f || contentHeight - scrollY > this.r * f || this.p == null) {
                return;
            }
            this.p.a();
            this.q = false;
            com.taobao.android.detail.ttdetail.utils.i.a("DescH5Controller", "H5图文详情提前发推荐请求");
        } catch (Exception e) {
            com.taobao.android.detail.ttdetail.utils.i.a("DescH5Controller", "preloadRecommend error: " + e);
        }
    }

    public void a(eyx eyxVar) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7cf0e14", new Object[]{this, eyxVar});
            return;
        }
        this.t = eyxVar;
        this.u = com.taobao.android.detail.ttdetail.utils.d.a(this.t);
        if (!e.b() || j.F()) {
            z = false;
        }
        this.v = z;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        com.taobao.android.detail.ttdetail.utils.i.a("DescH5Controller", "desc loadUrl start");
        SystemClock.uptimeMillis();
        if (this.c == null || TextUtils.isEmpty(this.e) || this.f) {
            return;
        }
        this.f = true;
        this.d.setVisibility(8);
        i iVar = this.j;
        if (iVar != null) {
            iVar.c();
        }
        this.e = d.a(this.e, "network", String.valueOf(NetworkUtils.a(odg.b().a())));
        this.c.setDescLoadErrorListener(new DetailHybridWebView.b() { // from class: com.taobao.android.detail.ttdetail.skeleton.desc.web.a.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.ttdetail.widget.webview.DetailHybridWebView.b
            public void a(WebView webView, int i, String str, String str2) {
                StringBuilder sb;
                String str3;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("a7ba25a5", new Object[]{this, webView, new Integer(i), str, str2});
                    return;
                }
                HashMap hashMap = new HashMap();
                if (a.a(a.this)) {
                    sb = new StringBuilder();
                    str3 = "from native degrade, descUrl:";
                } else {
                    sb = new StringBuilder();
                    str3 = "don't from native degrade, descUrl:";
                }
                sb.append(str3);
                sb.append(a.b(a.this));
                sb.append(", url:");
                sb.append(str2);
                sb.append(", errorCode:");
                sb.append(i);
                sb.append(", errorMsg:");
                sb.append(str);
                com.taobao.android.detail.ttdetail.utils.i.a("DescNativeDegradeH5", sb.toString());
                hashMap.put("itemId", a.c(a.this).c);
                hashMap.put("errorCode", String.valueOf(i));
                hashMap.put("errorMsg", str);
                hashMap.put("url", str2);
                hashMap.put("isFromNativeDegrade", String.valueOf(a.a(a.this)));
                ae.a(hashMap, -900004, "H5图文详情加载失败");
                a.a(a.this, true);
            }
        });
        this.c.setDescLoadFinishListener(new DetailHybridWebView.c() { // from class: com.taobao.android.detail.ttdetail.skeleton.desc.web.a.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.ttdetail.widget.webview.DetailHybridWebView.c
            public void a(WebView webView, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("eda1d57c", new Object[]{this, webView, str});
                } else if (webView.getProgress() != 100) {
                } else {
                    com.taobao.android.detail.ttdetail.utils.i.a("wsnbb", "view.getProgress:" + webView.getProgress() + "|" + a.d(a.this).getContentHeight());
                }
            }
        });
        this.c.setDescStartLoadListener(new DetailHybridWebView.f() { // from class: com.taobao.android.detail.ttdetail.skeleton.desc.web.a.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.detail.ttdetail.widget.webview.DetailHybridWebView.f
            public void a(WebView webView, String str) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("eda1d57c", new Object[]{this, webView, str});
                } else {
                    a.a(a.this, false);
                }
            }
        });
        this.c.loadUrl(b(this.e));
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        i iVar = this.j;
        if (iVar == null) {
            return;
        }
        iVar.c();
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        i iVar = this.j;
        if (iVar == null) {
            return;
        }
        iVar.b();
    }

    private String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str) || !str.startsWith(ado.URL_SEPARATOR) || !d()) {
            return str;
        }
        return com.taobao.vessel.utils.b.HTTPS_SCHEMA + str;
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.v
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.f) {
        } else {
            c();
        }
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.v
    public View b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("639153eb", new Object[]{this});
        }
        try {
            return this.c.getCoreView();
        } catch (Exception e) {
            com.taobao.android.detail.ttdetail.utils.i.a("DescH5Controller", "getScrollItemView  error", e);
            return this.c;
        }
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.v
    public void destroy() {
        LinearLayout linearLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        if (this.b != null) {
            int i = 0;
            while (true) {
                if (i >= this.b.getChildCount()) {
                    linearLayout = null;
                    break;
                } else if (this.b.getChildAt(i) instanceof LinearLayout) {
                    linearLayout = (LinearLayout) this.b.getChildAt(i);
                    break;
                } else {
                    i++;
                }
            }
            if (linearLayout != null) {
                for (int i2 = 0; i2 < linearLayout.getChildCount(); i2++) {
                    linearLayout.getChildAt(i2).setOnClickListener(null);
                }
                linearLayout.removeAllViews();
            }
            this.b.removeAllViews();
            this.b = null;
        }
        if (this.c != null) {
            com.taobao.android.detail.ttdetail.behavior.b.b(this.f10899a, "detail_desc_max_scroll", String.valueOf(h()));
            try {
                DetailHybridWebView.unregisterPlugins();
                this.c.destroy();
            } catch (Throwable th) {
                com.taobao.android.detail.ttdetail.utils.i.a("[WebView-Destroy]DescH5Controller", "WebView-Destroy error", th);
            }
        }
        b(this.f10899a);
    }

    public int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5cf10e2", new Object[]{this})).intValue();
        }
        try {
            return this.c.getCoreView().getScrollY();
        } catch (Throwable unused) {
            return 0;
        }
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.v
    public void a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        try {
            if (this.c != null) {
                this.c.onPause();
            }
        } catch (Exception e) {
            com.taobao.android.detail.ttdetail.utils.i.a("DescH5Controller", "mWebView.onPause error", e);
        }
        h hVar = this.k;
        if (hVar != null && this.l == null) {
            this.l = new h("disappear", hVar.c(), new RuntimeAbilityParam[0]);
        }
        h hVar2 = this.l;
        if (hVar2 != null) {
            com.taobao.android.detail.ttdetail.communication.c.a(this.f10899a, hVar2);
        }
        if (!this.h) {
            return;
        }
        this.h = false;
        com.taobao.android.detail.ttdetail.utils.i.a("DescH5Controller", "commitUserMotionForDesc:disappear");
    }

    @Override // com.taobao.android.detail.ttdetail.component.module.v
    public void didAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e328d7b", new Object[]{this});
            return;
        }
        if (!this.f) {
            a();
        }
        try {
            if (this.c != null) {
                this.c.onResume();
            }
        } catch (Exception e) {
            com.taobao.android.detail.ttdetail.utils.i.a("DescH5Controller", "mWebView.onResume error", e);
        }
        if (this.k == null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("trackPage", (Object) "Page_Detail_Show_ProductDetail");
            jSONObject.put("spm", (Object) "a2141.7631564.1999077549");
            this.k = new h("ut_exposure", jSONObject, new RuntimeAbilityParam[0]);
        }
        com.taobao.android.detail.ttdetail.communication.c.a(this.f10899a, this.k);
        this.h = true;
        com.taobao.android.detail.ttdetail.utils.i.a("DescH5Controller", "commitUserMotionForDesc:appear");
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (this.i == null || TextUtils.isEmpty(str)) {
        } else {
            boolean z = this.i.h;
            this.e = d.a(str, "newdetail", "1");
            this.e = d.a(this.e, "fromdetail", "1");
            this.e = d.a(this.e, "shopRec", "false");
            this.e = d.a(this.e, "relatedRec", "false");
            this.e = d.a(this.e, "hideFullBtn", "true");
            this.e = d.a(this.e, "hideBtmLine", "true");
            this.e = d.a(this.e, "hidPriceDesc", String.valueOf(z));
        }
    }

    private void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else {
            com.taobao.android.detail.ttdetail.communication.c.a(context, C0430a.class, this);
        }
    }

    private void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{this, context});
        } else {
            com.taobao.android.detail.ttdetail.communication.c.a(context, C0430a.class);
        }
    }

    @Override // com.taobao.android.detail.ttdetail.communication.g
    public boolean receiveMessage(com.taobao.android.detail.ttdetail.communication.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("318750e6", new Object[]{this, dVar})).booleanValue();
        }
        if (!(dVar instanceof C0430a)) {
            return false;
        }
        String a2 = ((C0430a) dVar).a();
        if (C0430a.SHOW_ERROR.equals(a2)) {
            g();
        } else if (C0430a.HIDE_ERROR.equals(a2)) {
            f();
        }
        return true;
    }

    @Override // com.taobao.android.detail.ttdetail.communication.g
    public ThreadMode onRunThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("e1b5ec98", new Object[]{this}) : ThreadMode.MainThread;
    }

    /* renamed from: com.taobao.android.detail.ttdetail.skeleton.desc.web.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C0430a extends com.taobao.android.detail.ttdetail.communication.a {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String HIDE_ERROR = "hideError";
        public static final String SHOW_ERROR = "showError";

        /* renamed from: a  reason: collision with root package name */
        public String f10904a;

        static {
            kge.a(-858743245);
        }

        public C0430a(String str) {
            this.f10904a = str;
        }

        public String a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f10904a;
        }
    }
}
