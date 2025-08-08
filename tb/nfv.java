package tb;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.pha.core.PHAContainerType;
import com.taobao.pha.core.c;
import com.taobao.pha.core.controller.AppController;
import com.taobao.pha.core.controller.DowngradeType;
import com.taobao.pha.core.e;
import com.taobao.pha.core.i;
import com.taobao.pha.core.jsbridge.JSBridge;
import com.taobao.pha.core.m;
import com.taobao.pha.core.model.PageModel;
import com.taobao.pha.core.model.TabBarModel;
import com.taobao.pha.core.model.TabHeaderModel;
import com.taobao.pha.core.o;
import com.taobao.pha.core.p;
import com.taobao.themis.pub_kit.utils.PubPHAInjectJS;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.android.agoo.common.AgooConstants;

/* loaded from: classes7.dex */
public class nfv implements nfz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ngf f31431a;
    private PageModel b;
    private AppController c;
    private boolean d;
    private String e;
    private ngk f;
    private nfw i;
    private nfx j;
    private boolean g = false;
    private boolean h = false;
    private boolean k = false;

    static {
        kge.a(-666873105);
        kge.a(1946069143);
    }

    public static /* synthetic */ ngf a(nfv nfvVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ngf) ipChange.ipc$dispatch("298b28bf", new Object[]{nfvVar}) : nfvVar.f31431a;
    }

    public void a(ngf ngfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f624d5eb", new Object[]{this, ngfVar});
        } else {
            this.f31431a = ngfVar;
        }
    }

    public void a(PageModel pageModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("737dfcbc", new Object[]{this, pageModel});
        } else {
            this.b = pageModel;
        }
    }

    public void a(AppController appController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccef5776", new Object[]{this, appController});
        } else {
            this.c = appController;
        }
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.g;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.d;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.k;
    }

    @Override // tb.nfz
    public void a(final ngk ngkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6271bc6", new Object[]{this, ngkVar});
            return;
        }
        this.f = ngkVar;
        nfx nfxVar = this.j;
        if (nfxVar != null) {
            nfxVar.a(ngkVar);
        }
        nfw nfwVar = this.i;
        if (nfwVar != null) {
            nfwVar.a(ngkVar);
        }
        if (this.f31431a.f() != null) {
            this.f31431a.f().setOnTouchListener(new View.OnTouchListener() { // from class: tb.nfv.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
                    }
                    ngk ngkVar2 = ngkVar;
                    if (ngkVar2 == null) {
                        return false;
                    }
                    return ngkVar2.a(motionEvent);
                }
            });
        }
        this.f31431a.a(new ngi() { // from class: tb.nfv.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ngi
            public void a(View view, int i, int i2, int i3, int i4) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e734472a", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
                    return;
                }
                ngk ngkVar2 = ngkVar;
                if (ngkVar2 == null) {
                    return;
                }
                ngkVar2.a(i, i2, i3, i4);
            }

            @Override // tb.ngi
            public void a(int i, int i2, boolean z, boolean z2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("9d1e1b48", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z), new Boolean(z2)});
                    return;
                }
                ngk ngkVar2 = ngkVar;
                if (ngkVar2 == null) {
                    return;
                }
                ngkVar2.a(i, i2, z, z2);
            }
        });
    }

    @Override // tb.nfz
    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.b.key;
    }

    public PageModel e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PageModel) ipChange.ipc$dispatch("bba9d340", new Object[]{this}) : this.b;
    }

    @Override // tb.nfz
    public String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : this.e;
    }

    @Override // tb.nfz
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        this.h = true;
        this.f31431a.a();
    }

    @Override // tb.nfz
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        HashMap hashMap = null;
        if (this.b.requestHeaders != null) {
            ngo a2 = p.b().a().a(this.c.t(), r(), this.c.u() != null ? this.c.u().customDataSource : null);
            ngv m = this.c.m();
            if (m != null) {
                JSONObject a3 = m.a(this.b.requestHeaders, a2);
                if (this.b.encodeHeaders) {
                    ngn.a(a3);
                    ngr.b("DefaultPageView", "request headers is " + a3.toJSONString());
                }
                hashMap = new HashMap();
                for (Map.Entry<String, Object> entry : a3.entrySet()) {
                    if (entry != null && entry.getKey() != null && entry.getValue() != null) {
                        hashMap.put(entry.getKey(), entry.getValue().toString());
                    }
                }
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (this.k && "main".equals(this.e)) {
            this.c.a(new e.a("loadurl", currentTimeMillis));
        }
        ngr.a("DefaultPageView", "[Performance] WebView.loadUrl: " + str + " currentTime: " + currentTimeMillis);
        if (p.c().A() && this.c.u() != null && this.c.u().enableUrlABTest) {
            str = p.c().b(str);
        }
        this.f31431a.a(str, hashMap);
    }

    public void a(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9b9da5a", new Object[]{this, str, str2, str3, str4, str5});
        } else {
            this.f31431a.a(str, str2, str3, str4, str5);
        }
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else if (StringUtils.isEmpty(str)) {
            if (str2 == null) {
                return;
            }
            a(str2);
        } else {
            AppController appController = this.c;
            if (appController != null) {
                appController.h().b("template");
            }
            a(str2, str, null, "utf-8", str2);
        }
    }

    @Override // tb.nfz
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
        } else {
            this.f31431a.b();
        }
    }

    public ngf i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ngf) ipChange.ipc$dispatch("4c955fe9", new Object[]{this}) : this.f31431a;
    }

    @Override // tb.nfz
    public View j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("b51e1df3", new Object[]{this}) : this.f31431a.f();
    }

    @Override // tb.nfz
    public Bitmap m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bitmap) ipChange.ipc$dispatch("ac32b952", new Object[]{this}) : this.f31431a.h();
    }

    @Override // tb.nfz
    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
        } else {
            this.f31431a.j();
        }
    }

    @Override // tb.nfz
    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
        } else {
            this.f31431a.k();
        }
    }

    @Override // com.taobao.pha.core.jsbridge.c.a
    public void evaluateJavaScript(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e19fb517", new Object[]{this, str});
        } else if (Looper.myLooper() != Looper.getMainLooper()) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: tb.nfv.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        nfv.a(nfv.this).a(str);
                    }
                }
            });
        } else {
            this.f31431a.a(str);
        }
    }

    @Override // tb.nfz
    public int p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("63fccea", new Object[]{this})).intValue() : this.f31431a.l();
    }

    @Override // tb.nfz
    public void a(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79f30285", new Object[]{this, new Integer(i), new Integer(i2), intent});
        } else {
            this.f31431a.a(i, i2, intent);
        }
    }

    @Override // tb.nfz
    public boolean q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[]{this})).booleanValue();
        }
        if (!this.f31431a.c()) {
            return false;
        }
        this.f31431a.d();
        return true;
    }

    @Override // tb.nfz
    public void a(Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("510fd488", new Object[]{this, configuration});
        } else {
            this.f31431a.a(configuration);
        }
    }

    public JSONObject r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("bec48319", new Object[]{this});
        }
        JSONObject a2 = o.a(this.c);
        a2.put("manifestPreset", (Object) Boolean.valueOf(this.b.manifestPreset));
        String d = d();
        if (!StringUtils.isEmpty(d)) {
            a2.put("pageKey", (Object) d);
        }
        a2.put("subPage", (Object) Boolean.valueOf(this.b.isSubPage()));
        a2.put(nfc.PHA_MONITOR_DIMENSION_MANIFEST_URL, (Object) this.c.t().toString());
        return a2;
    }

    public void s() {
        View f;
        String m;
        String m2;
        String m3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
        } else if (this.g || this.h) {
        } else {
            this.g = true;
            ngr.a("DefaultPageView", "[Performance] Create PageView instance for page: " + this.b + "\nCurrent time: " + System.currentTimeMillis());
            this.e = "main";
            PageModel pageModel = this.b;
            if (pageModel instanceof TabHeaderModel) {
                this.e = "header";
            } else if (pageModel instanceof TabBarModel) {
                this.e = "tab";
            }
            if ("main".equals(this.e)) {
                this.k = true;
                this.c.P().c(12);
            } else if ("header".equals(this.e)) {
                PageModel pageModel2 = this.b;
                if ((pageModel2 instanceof TabHeaderModel) && ((TabHeaderModel) pageModel2).firstPage) {
                    this.c.P().c(20);
                }
            } else if ("tab".equals(this.e)) {
                this.c.P().b(22);
            }
            if (this.b.isSubPage() && (m3 = this.f31431a.m()) != null) {
                this.f31431a.c(m3 + " PHASubPage");
            }
            if (AgooConstants.MESSAGE_POPUP.equals(this.b._type) && (m2 = this.f31431a.m()) != null) {
                this.f31431a.c(m2 + " PHAPopUp");
            }
            if (ngu.w() && this.c != null && PHAContainerType.MINIAPP.equals(this.c.p()) && (m = this.f31431a.m()) != null) {
                this.f31431a.c(m + " Themis TinyApp");
            }
            String t = t();
            if (ngu.v()) {
                boolean b = b();
                if (b) {
                    this.f31431a.a(t);
                }
                ngr.d("DefaultPageView", "isPrerenderWebView " + b);
            } else {
                this.f31431a.a(t);
            }
            this.f31431a.b(t);
            this.f31431a.a(new JSBridge(this.c, this), "__pha_bridge_engine__");
            if (!this.f31431a.i()) {
                AppController appController = this.c;
                appController.a(appController.t(), DowngradeType.UC_NOT_READY, (Boolean) false);
            }
            this.j = new nfx(this.c, this);
            this.f31431a.a(this.j);
            this.i = new nfw();
            this.f31431a.a(this.i);
            a(this.f);
            if (!ngu.i() && (f = this.f31431a.f()) != null) {
                f.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            }
            i G = this.c.G();
            if (G != null) {
                G.a(this.f31431a);
            }
            if (this.d) {
                return;
            }
            boolean z = this.k;
            if (ngu.d() && z) {
                try {
                    this.c.E().a("beforepageload", JSONObject.toJSONString(this.b), "native", "AppWorker");
                } catch (Exception unused) {
                }
            }
            a(this.b.html, a(this.b.getUrl(), this.c.m(), this.b.urlQueryParams));
        }
    }

    private String a(String str, ngv ngvVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3b657615", new Object[]{this, str, ngvVar, jSONObject});
        }
        if (str == null || jSONObject == null || ngvVar == null) {
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (Map.Entry<String, Object> entry : ngvVar.a(jSONObject).entrySet()) {
            if (entry.getValue() instanceof String) {
                String str2 = (String) entry.getValue();
                if (!StringUtils.isEmpty(str2)) {
                    buildUpon.appendQueryParameter(entry.getKey(), str2);
                }
            }
        }
        return buildUpon.build().toString();
    }

    private String t() {
        String c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("abe3bf05", new Object[]{this});
        }
        JSONObject r = r();
        String jSONString = r.toJSONString();
        StringBuilder sb = new StringBuilder("window.__pha_environment__=");
        sb.append(jSONString);
        sb.append(";");
        sb.append(m.a());
        if (p.c().i()) {
            sb.append("document.documentElement.style.setProperty('--safe-area-inset-top', '");
            sb.append(ngn.c(this.c.R()));
            sb.append("px');");
            sb.append("document.documentElement.style.setProperty('--safe-area-inset-left', '0px');");
            sb.append("document.documentElement.style.setProperty('--safe-area-inset-right', '0px');");
            sb.append("document.documentElement.style.setProperty('--safe-area-inset-bottom', '");
            sb.append(r.get("safeAreaInsetBottom"));
            sb.append("px');");
        }
        c j = p.b().j();
        if (j != null) {
            sb.append(j.a());
        }
        sb.append(u());
        if (p.c().h()) {
            nex x = p.b().x();
            if (x != null && x.f() && (c = x.c()) != null) {
                sb.append(c);
            }
            if (x != null && x.h()) {
                String i = x.i();
                if (!StringUtils.isEmpty(i)) {
                    sb.append(i);
                }
            }
        }
        if (ngu.c()) {
            String a2 = qgo.a();
            if (!StringUtils.isEmpty(a2)) {
                sb.append(a2);
            }
        }
        if (ngu.w() && this.c != null && this.f31431a != null && PHAContainerType.MINIAPP.equals(this.c.p())) {
            sb.append(PubPHAInjectJS.INSTANCE.getPHAInjectJS(this.f31431a.g()));
        }
        return sb.toString();
    }

    private String u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("326979a4", new Object[]{this}) : String.format(Locale.getDefault(), "document.documentElement.style.setProperty('--navigation-bar-height', '%.5fvw');", Float.valueOf(ngn.b(this.c.D().getNavigationBarHeight())));
    }
}
