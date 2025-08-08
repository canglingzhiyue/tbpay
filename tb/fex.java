package tb;

import android.app.Activity;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.SystemClock;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.widget.container.NestedScrollContainer;
import com.taobao.android.detail.core.detail.widget.container.a;
import com.taobao.android.detail.core.detail.widget.container.c;
import com.taobao.android.detail.core.event.basic.b;
import com.taobao.android.detail.core.performance.p;
import com.taobao.android.detail.core.utils.e;
import com.taobao.android.detail.core.utils.h;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.sdk.utils.NetworkUtils;
import com.taobao.android.detail.wrapper.activity.DetailActivity;
import com.taobao.android.detail.wrapper.ext.windvane.webview.DetailHybridWebView;
import com.taobao.android.trade.event.d;
import com.taobao.android.trade.event.f;
import com.taobao.orange.OrangeConfig;
import com.taobao.taobao.R;
import com.uc.webview.export.WebView;
import java.util.HashMap;

/* loaded from: classes5.dex */
public class fex extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Activity f27875a;
    private RelativeLayout b;
    private DetailHybridWebView c;
    private View d;
    private egy e;
    private String f;
    private NestedScrollContainer.a g;
    private c h;
    private enp i;
    private b j;
    private boolean k;
    private boolean l;
    private boolean m;
    private MessageQueue.IdleHandler n;
    private int o;
    private boolean p;

    static {
        kge.a(1855560586);
    }

    public static /* synthetic */ Object ipc$super(fex fexVar, String str, Object... objArr) {
        if (str.hashCode() == -414738562) {
            super.a((epe) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, com.taobao.android.trade.locator.callback.d
    public com.taobao.android.trade.locator.callback.a a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.trade.locator.callback.a) ipChange.ipc$dispatch("29902195", new Object[]{this, str});
        }
        return null;
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, com.taobao.android.trade.locator.callback.d
    public void a(Object obj, com.taobao.android.trade.locator.callback.a aVar, com.taobao.android.trade.locator.callback.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2928883", new Object[]{this, obj, aVar, bVar});
        }
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, tb.dxy
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        }
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, com.taobao.android.detail.core.detail.widget.container.c
    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50938a53", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, com.taobao.android.detail.core.detail.widget.container.c
    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5eb3ff5", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public static /* synthetic */ void a(fex fexVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("479df0a9", new Object[]{fexVar, str});
        } else {
            fexVar.b(str);
        }
    }

    public static /* synthetic */ boolean a(fex fexVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e86a10a3", new Object[]{fexVar})).booleanValue() : fexVar.l;
    }

    public static /* synthetic */ String b(fex fexVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("377a0180", new Object[]{fexVar}) : fexVar.f;
    }

    public static /* synthetic */ egy c(fex fexVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (egy) ipChange.ipc$dispatch("a6ca4c8e", new Object[]{fexVar}) : fexVar.e;
    }

    public static /* synthetic */ Activity d(fex fexVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("382dffc6", new Object[]{fexVar}) : fexVar.f27875a;
    }

    public fex(Activity activity) {
        super(activity);
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = new MessageQueue.IdleHandler() { // from class: tb.fex.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.os.MessageQueue.IdleHandler
            public boolean queueIdle() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("b5e69690", new Object[]{this})).booleanValue();
                }
                fex.a(fex.this, "idle");
                return false;
            }
        };
        this.f27875a = activity;
        if (god.f && Looper.myLooper() == Looper.getMainLooper()) {
            this.b = (RelativeLayout) View.inflate(this.f27875a, R.layout.x_detail_desc_h5_opt, null);
            this.b.setDescendantFocusability(393216);
            Looper.myQueue().addIdleHandler(this.n);
        } else {
            this.b = (RelativeLayout) View.inflate(this.f27875a, R.layout.x_detail_desc_h5, null);
            this.b.setDescendantFocusability(393216);
            this.c = (DetailHybridWebView) this.b.findViewById(R.id.detail_main_bottompage_webview);
            this.c.setVerticalScrollBarEnabled(false);
            Activity activity2 = this.f27875a;
            if (activity2 instanceof DetailActivity) {
                ((DetailActivity) activity2).a((WebView) this.c);
            }
        }
        this.d = this.b.findViewById(R.id.detail_main_bottompage_empty);
        emu.a("com.taobao.android.detail.wrapper.ext.windvane.DescH5Controller");
    }

    private void b(String str) {
        Activity activity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (this.c != null || this.b == null || (activity = this.f27875a) == null || activity.isFinishing()) {
        } else {
            String a2 = p.a("DescH5Controller");
            i.d(a2, "闲时初始化webview, source=" + str);
            ecg.m(this.f27875a, str);
            this.c = new DetailHybridWebView(this.f27875a);
            this.c.setOverScrollMode(2);
            this.c.setVerticalScrollBarEnabled(false);
            this.b.addView(this.c, 0, new ViewGroup.LayoutParams(-1, -1));
            Activity activity2 = this.f27875a;
            if (!(activity2 instanceof DetailActivity)) {
                return;
            }
            ((DetailActivity) activity2).a((WebView) this.c);
        }
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a
    public void a(epe epeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e747977e", new Object[]{this, epeVar});
            return;
        }
        super.a(epeVar);
        if (!(epeVar instanceof egy)) {
            return;
        }
        this.e = (egy) epeVar;
        e();
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a
    public void a(NestedScrollContainer.a aVar, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a701729", new Object[]{this, aVar, cVar});
        } else if (aVar == null || cVar == null) {
        } else {
            this.g = aVar;
            this.h = cVar;
        }
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, com.taobao.android.detail.core.detail.widget.container.c
    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        try {
            return this.c.getCoreView().getScrollY() == 0;
        } catch (Exception unused) {
            return true;
        }
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, com.taobao.android.detail.core.detail.widget.container.c
    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue();
        }
        DetailHybridWebView detailHybridWebView = this.c;
        if (detailHybridWebView != null && detailHybridWebView.getReachBottom()) {
            return true;
        }
        return p();
    }

    private boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[]{this})).booleanValue();
        }
        try {
            return Math.abs((this.c.getCoreView().getScrollY() + this.c.getHeight()) - this.c.getContentHeight()) <= 3;
        } catch (Exception unused) {
            return true;
        }
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, com.taobao.android.detail.core.detail.widget.container.c
    public float i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5dd2860", new Object[]{this})).floatValue() : this.b.getMeasuredHeight();
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, com.taobao.android.detail.core.detail.widget.container.c
    public void a(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c119299", new Object[]{this, new Integer(i), new Boolean(z)});
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

    @Override // com.taobao.android.detail.core.detail.widget.container.a, com.taobao.android.detail.core.detail.widget.container.c
    public View k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("ff4fb734", new Object[]{this}) : this.b;
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, com.taobao.android.detail.core.detail.widget.container.c
    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        try {
            this.c.getCoreView().scrollBy(i, i2);
        } catch (Exception unused) {
        }
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, com.taobao.android.detail.core.detail.widget.container.c
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (i >= 0) {
        } else {
            if (this.o < i) {
                this.p = true;
            } else {
                this.p = false;
            }
            this.o = i;
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.l = z;
        }
    }

    private void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        i.d("DescH5Controller", "desc loadUrl start");
        final long uptimeMillis = SystemClock.uptimeMillis();
        b("loadUrl");
        if (this.c == null) {
            String a2 = p.a("DescH5Controller");
            StringBuilder sb = new StringBuilder();
            sb.append("loadUrl after lazyInitWebView, mWebview is null: mContainer=");
            sb.append(this.b);
            sb.append(", mActivity=");
            sb.append(this.f27875a);
            sb.append(", mActivity.isFinishing()");
            Activity activity = this.f27875a;
            sb.append(activity != null ? Boolean.valueOf(activity.isFinishing()) : "activity is null");
            i.d(a2, sb.toString());
        } else if (StringUtils.isEmpty(this.f) || this.k) {
        } else {
            this.k = true;
            this.d.setVisibility(8);
            NestedScrollContainer.a aVar = this.g;
            if (aVar != null) {
                aVar.a(false, this.h);
            }
            this.f = eqf.a(this.f, "network", String.valueOf(NetworkUtils.a(epo.a())));
            this.c.setDescLoadErrorListener(new DetailHybridWebView.b() { // from class: tb.fex.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.detail.wrapper.ext.windvane.webview.DetailHybridWebView.b
                public void a(WebView webView, int i, String str, String str2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a7ba25a5", new Object[]{this, webView, new Integer(i), str, str2});
                    } else if (fex.a(fex.this)) {
                        i.a("DescNativeDegradeH5", "from native degrade, descUrl:" + fex.b(fex.this) + ", url:" + str2 + ", errorCode:" + i + ", errorMsg:" + str);
                        ecg.a(webView.getContext(), fex.c(fex.this).c, str2, fex.b(fex.this), i, str);
                    } else {
                        i.a("DescNativeDegradeH5", "don't from native degrade, descUrl:" + fex.b(fex.this) + ", url:" + str2 + ", errorCode:" + i + ", errorMsg:" + str);
                        ecg.a(webView.getContext(), fex.c(fex.this).c, str2, i, str);
                    }
                }
            });
            this.c.setDescLoadFinishListener(new DetailHybridWebView.e() { // from class: tb.fex.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.detail.wrapper.ext.windvane.webview.DetailHybridWebView.e
                public void a(WebView webView, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("eda1d57c", new Object[]{this, webView, str});
                    } else if (webView.getProgress() != 100) {
                    } else {
                        h.q(fex.d(fex.this), SystemClock.uptimeMillis() - uptimeMillis);
                    }
                }
            });
            String c = c(this.f);
            this.c.loadUrl(c);
            i.d("DescH5Controller", "descUrl=" + c);
            if (this.p) {
                o();
            }
            ecg.h(this.c.getContext(), this.e.c);
        }
    }

    private void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        d a2 = f.a(this.f27875a);
        if (a2 == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("locatorId", (Object) "divisionDesc");
        a2.a(new com.taobao.android.detail.core.event.basic.a(jSONObject));
    }

    private String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str) || !str.startsWith(ado.URL_SEPARATOR) || !n()) {
            return str;
        }
        return com.taobao.vessel.utils.b.HTTPS_SCHEMA + str;
    }

    private boolean n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[]{this})).booleanValue() : "true".equalsIgnoreCase(OrangeConfig.getInstance().getConfig("android_detail", "open_client_append_https_scheme", "true"));
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, tb.dxy
    public void a() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        if (e.i() && this.k) {
            z = true;
        }
        if (z) {
            return;
        }
        l();
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, tb.dxy
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        if (!this.k) {
            a();
        }
        DetailHybridWebView detailHybridWebView = this.c;
        if (detailHybridWebView != null) {
            detailHybridWebView.onResume();
        }
        if (this.i == null) {
            this.i = new enp(null);
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("trackPage", "Page_Detail_Show_ProductDetail");
            hashMap.put("spm", "a2141.7631564.1999077549");
            this.i.f27473a = hashMap;
        }
        f.a(this.f27875a, this.i);
        elz.a(this.f27875a, true);
        this.m = true;
        i.d("DescH5Controller", "commitUserMotionForDesc:appear");
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, tb.dxy
    public void a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        DetailHybridWebView detailHybridWebView = this.c;
        if (detailHybridWebView != null) {
            detailHybridWebView.onPause();
        }
        if (this.i != null && this.j == null) {
            this.j = new b(null);
            this.j.f9696a = this.i.f27473a;
        }
        b bVar = this.j;
        if (bVar != null) {
            f.a(this.f27875a, bVar);
        }
        if (!this.m) {
            return;
        }
        elz.a(this.f27875a, false);
        this.m = false;
        i.d("DescH5Controller", "commitUserMotionForDesc:disappear");
    }

    @Override // com.taobao.android.detail.core.detail.widget.container.a, tb.dxy
    public void d() {
        LinearLayout linearLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        if (this.n != null && Looper.myLooper() == Looper.getMainLooper()) {
            Looper.myQueue().removeIdleHandler(this.n);
            this.n = null;
            i.d(p.a("DescH5Controller"), "销毁webViewIdleHandler");
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
        DetailHybridWebView detailHybridWebView = this.c;
        if (detailHybridWebView == null) {
            return;
        }
        try {
            detailHybridWebView.destroy();
            if (!(this.f27875a instanceof DetailActivity)) {
                return;
            }
            ((DetailActivity) this.f27875a).b(this.c);
        } catch (Throwable th) {
            i.a("[WebView-Destroy]DescH5Controller", "WebView-Destroy error", th);
            ecg.d(this.f27875a, Log.getStackTraceString(th));
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        egy egyVar = this.e;
        if (egyVar == null || StringUtils.isEmpty(egyVar.e)) {
            return;
        }
        this.f = eqf.a(this.e.e, "newdetail", "1");
        this.f = eqf.a(this.f, "fromdetail", "1");
        this.f = eqf.a(this.f, "shopRec", "false");
        this.f = eqf.a(this.f, "relatedRec", "false");
        this.f = eqf.a(this.f, "hideFullBtn", "true");
        this.f = eqf.a(this.f, "hideBtmLine", "true");
    }
}
