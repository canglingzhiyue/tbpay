package com.taobao.taolivecontainer;

import android.content.Context;
import android.net.Uri;
import android.taobao.windvane.export.network.Request;
import android.taobao.windvane.export.network.f;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import android.text.TextUtils;
import android.widget.Toast;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.zcache.n;
import java.util.Arrays;
import java.util.HashMap;
import java.util.UUID;
import tb.akt;
import tb.kge;
import tb.psn;
import tb.pso;
import tb.psp;
import tb.psq;
import tb.riy;
import tb.seg;
import tb.seh;

/* loaded from: classes8.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String Flag_TaobaoLiveContainer = "TaobaoLiveContainer";
    public static final String PAGE_TAOBAOLIVECONTAINER = "Page_TaobaoLiveContainer";
    public static final String TBLive_Container = "1.1.0";
    private static final String b;

    /* renamed from: a  reason: collision with root package name */
    public psp f22051a;
    private Context c;
    private String d;
    private pso e;
    private psn f;
    private String[] g;
    private final String h;
    private c i;
    private TBLiveH5Container j;
    private String k;
    private seg l;
    private Object m;
    private boolean n;
    private boolean o;
    private boolean p;

    static {
        kge.a(-1784892950);
        b = b.class.getSimpleName();
    }

    public b(Context context, String str, pso psoVar, psn psnVar) {
        this(context, str, psoVar, psnVar, null);
    }

    public b(Context context, String str, pso psoVar, psn psnVar, String[] strArr) {
        this(context, str, psoVar, psnVar, null, strArr);
    }

    public b(Context context, String str, pso psoVar, psn psnVar, seg segVar, String[] strArr) {
        this.f22051a = new psp();
        this.n = false;
        this.o = false;
        this.p = true;
        this.h = UUID.randomUUID().toString();
        this.c = context;
        this.d = str;
        this.e = psoVar;
        this.f = psnVar;
        this.l = segVar;
        this.g = strArr;
        this.i = new c(psnVar);
    }

    public c f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("ce4bd4a4", new Object[]{this}) : this.i;
    }

    public void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
            return;
        }
        this.m = obj;
        TBLiveH5Container tBLiveH5Container = this.j;
        if (tBLiveH5Container == null) {
            return;
        }
        tBLiveH5Container.setWebViewToken(this.m);
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        psp pspVar = this.f22051a;
        if (pspVar != null) {
            pspVar.a(this.j);
        }
        TBLiveH5Container tBLiveH5Container = this.j;
        if (tBLiveH5Container == null || tBLiveH5Container.isDestroied()) {
            return;
        }
        this.j.destroy();
        this.j = null;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        TBLiveH5Container tBLiveH5Container = this.j;
        if (tBLiveH5Container != null && !tBLiveH5Container.isDestroied()) {
            return;
        }
        c("tlh5_container_init_begin");
        seg segVar = this.l;
        if (segVar != null) {
            this.j = segVar.a(this.c);
        } else {
            this.j = new TBLiveH5Container(this.c);
        }
        this.j.setWebViewToken(this.m);
        this.j.setBuilder(this);
        String userAgentString = this.j.getUserAgentString();
        this.j.setUserAgentString(userAgentString + " TLHybrid/(" + this.d + "," + TBLive_Container + riy.BRACKET_END_STR);
        c("tlh5_container_init_end");
        this.j.setWebViewClientProxy(new d(this.c, this));
    }

    public String[] a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("c770f637", new Object[]{this}) : this.g;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            a(str, false, true);
        }
    }

    private void a(String str, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35a6232", new Object[]{this, str, new Boolean(z), new Boolean(z2)});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            this.k = str;
            Uri parse = Uri.parse(str);
            if (parse == null) {
                return;
            }
            String queryParameter = parse.getQueryParameter("tl-x-pre-zcache");
            this.i.e &= parse.getBooleanQueryParameter("tl-x-prerender", false);
            this.i.b &= parse.getBooleanQueryParameter("x-preload", false);
            c cVar = this.i;
            cVar.c = parse.getBooleanQueryParameter("x-ssr", false) & cVar.c;
            if (z || this.i.f22052a) {
                d();
            }
            if (this.i.d && !TextUtils.isEmpty(queryParameter)) {
                d(queryParameter);
            }
            if (this.i.b) {
                f(str);
            }
            if (z2 && this.i.e) {
                e(str);
            }
            this.n = true;
        }
    }

    private void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
            return;
        }
        n.a(Arrays.asList(str));
        pso psoVar = this.e;
        String str2 = b;
        psoVar.a(Flag_TaobaoLiveContainer, str2, "preLoadZCache:" + str);
    }

    private void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
            return;
        }
        if (this.f22051a.a(str, this)) {
            c("tlh5_h5_prerender_begin");
        }
        pso psoVar = this.e;
        String str2 = b;
        psoVar.a(Flag_TaobaoLiveContainer, str2, "preRenderUrl:" + str);
    }

    private void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669e4a77", new Object[]{this, str});
            return;
        }
        f.a(new Request.a().a(str).b("GET").a());
        pso psoVar = this.e;
        String str2 = b;
        psoVar.a(Flag_TaobaoLiveContainer, str2, "preLoadHtml:" + str);
    }

    public TBLiveH5Container b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBLiveH5Container) ipChange.ipc$dispatch("57e4ff89", new Object[]{this}) : this.j;
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        g(str);
        if (!this.p) {
            return;
        }
        this.j.loadUrl(str);
    }

    private void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0cfe3b8", new Object[]{this, str});
            return;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (this.o) {
            return;
        }
        this.o = true;
        this.k = str;
        long c = c("tlh5_load_url_begin");
        if (!this.n) {
            a(str, true, false);
        }
        TBLiveH5Container tBLiveH5Container = this.j;
        if (tBLiveH5Container == null || tBLiveH5Container.isDestroied()) {
            hashMap.put("pre_render_failed_code", "5");
            d();
        }
        this.j.setTag(R.id.taolive_container_prerender_status, false);
        if (this.f22051a.a(str)) {
            hashMap.put("pre_render_failed_code", "0");
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("accessUrl", (Object) str);
                WVStandardEventCenter.postNotificationToJS(this.j, "TBLiveBasePlugin.Event.PreRender.Attach", jSONObject.toJSONString());
            }
            this.p = false;
        } else {
            if (this.f22051a.b() || this.f22051a.a()) {
                float b2 = akt.b();
                if (!this.i.e) {
                    hashMap.put("pre_render_failed_code", "1");
                } else if (b2 <= 20.0f) {
                    hashMap.put("pre_render_failed_code", "2");
                } else if (this.f22051a.b()) {
                    hashMap.put("pre_render_failed_code", "4");
                } else if (this.f22051a.a()) {
                    hashMap.put("pre_render_failed_code", "7");
                }
                this.j.destroy();
                this.j = null;
                d();
            }
            this.p = true;
        }
        a("tlh5_fsp", hashMap);
        this.j.setLoadUrlTimestamp(c);
        this.f22051a.c();
    }

    public pso c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pso) ipChange.ipc$dispatch("1e6c9690", new Object[]{this}) : this.e;
    }

    public void a(boolean z, JSONObject jSONObject) {
        TBLiveH5Container tBLiveH5Container;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b98504", new Object[]{this, new Boolean(z), jSONObject});
            return;
        }
        this.f22051a.a(z);
        if (!z && (tBLiveH5Container = this.j) != null) {
            if (seh.a(tBLiveH5Container.getContext())) {
                Toast.makeText(this.j.getContext(), "预渲染失败，释放JS环境", 0).show();
            }
            this.j.destroy();
            this.j = null;
        }
        HashMap<String, String> a2 = psq.a(jSONObject);
        if (a2 == null) {
            a2 = new HashMap<>();
        }
        a2.put("success", String.valueOf(z));
        a("tlh5_prerender_finish", a2);
    }

    public long c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("88097ea8", new Object[]{this, str})).longValue() : a(str, (HashMap<String, String>) null);
    }

    public long a(String str, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3202a435", new Object[]{this, str, hashMap})).longValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (this.e != null) {
            if (hashMap == null) {
                hashMap = new HashMap<>();
            }
            hashMap.put("timestamp", String.valueOf(currentTimeMillis));
            hashMap.put("tlh5_session_id", this.h);
            hashMap.put("tlh5_url", this.k);
            hashMap.put("tlh5_sdk_env", this.d);
            hashMap.put("tlh5_sdk_version", TBLive_Container);
            hashMap.putAll(this.i.a());
            this.e.a(PAGE_TAOBAOLIVECONTAINER, str, hashMap);
            try {
                a(str, Arrays.toString(psq.a(hashMap)));
            } catch (Throwable unused) {
            }
        }
        return currentTimeMillis;
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        pso psoVar = this.e;
        if (psoVar == null) {
            return;
        }
        psoVar.a(Flag_TaobaoLiveContainer, str, str2);
    }
}
