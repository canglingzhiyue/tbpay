package com.taobao.android.sku;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.alibaba.android.ultron.vfw.instance.d;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.p;
import com.taobao.android.sku.c;
import com.taobao.android.sku.pad.b;
import com.taobao.android.sku.utils.n;
import com.taobao.android.sku.utils.o;
import com.taobao.android.sku.utils.r;
import com.taobao.android.sku.weex.WeexWrapper;
import com.taobao.android.weex_framework.util.k;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.Map;
import tb.ixt;
import tb.iyf;
import tb.kge;
import tb.tfu;

/* loaded from: classes6.dex */
public class WeexCore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Context f15135a;
    private f b;
    private c c;
    private com.taobao.android.sku.data.a d;
    private com.taobao.android.sku.presenter.c e;
    private ViewGroup f;
    private WeexWrapper g;
    private volatile boolean h;
    private boolean i;
    private com.taobao.android.sku.weex.d j;
    private String n;
    private boolean o;
    private String p;
    private String q;
    private d.c r;
    private c.b s;
    private int w;
    private Handler k = new Handler(Looper.getMainLooper());
    private String l = "";
    private String m = "ADDCART_AND_BUYNOW";
    private boolean t = true;
    private volatile boolean u = f.f15177a;
    private int v = 1;
    private Runnable x = new Runnable() { // from class: com.taobao.android.sku.WeexCore.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            WeexCore.this.u();
            if (WeexCore.a(WeexCore.this) != null && n.a("setPageVisibleCallShowSku")) {
                WeexCore.a(WeexCore.this).a((Map<String, Object>) null, WeexCore.b(WeexCore.this).v(), true);
            }
            o.d(o.UM_SKU_SILENT_TIMEOUT);
            WeexCore.b(WeexCore.this).a(-700005, "");
        }
    };

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface SkuWeexType {
    }

    static {
        kge.a(1490040421);
    }

    public static /* synthetic */ com.taobao.android.sku.weex.d a(WeexCore weexCore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.sku.weex.d) ipChange.ipc$dispatch("b472d3ca", new Object[]{weexCore}) : weexCore.j;
    }

    public static /* synthetic */ boolean a(WeexCore weexCore, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aaa44184", new Object[]{weexCore, new Boolean(z)})).booleanValue();
        }
        weexCore.i = z;
        return z;
    }

    public static /* synthetic */ c b(WeexCore weexCore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("d0327ab4", new Object[]{weexCore}) : weexCore.c;
    }

    public static /* synthetic */ WeexWrapper c(WeexCore weexCore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeexWrapper) ipChange.ipc$dispatch("ee3dcc3a", new Object[]{weexCore}) : weexCore.g;
    }

    public static /* synthetic */ String d(WeexCore weexCore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("351fab0f", new Object[]{weexCore}) : weexCore.m;
    }

    public static /* synthetic */ String e(WeexCore weexCore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5e740050", new Object[]{weexCore}) : weexCore.l;
    }

    public static /* synthetic */ ViewGroup f(WeexCore weexCore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("a1794246", new Object[]{weexCore}) : weexCore.f;
    }

    public static /* synthetic */ Handler g(WeexCore weexCore) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Handler) ipChange.ipc$dispatch("fee1a078", new Object[]{weexCore}) : weexCore.k;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        com.taobao.android.sku.weex.d dVar = this.j;
        if (dVar == null) {
            return;
        }
        dVar.b((Map<String, Object>) null);
        this.k.removeCallbacksAndMessages(null);
    }

    public WeexCore(f fVar, c cVar, Context context, com.taobao.android.sku.data.a aVar, com.taobao.android.sku.presenter.c cVar2, int i) {
        this.b = fVar;
        this.c = cVar;
        this.f15135a = context;
        this.e = cVar2;
        this.d = aVar;
        this.w = i;
        this.g = new WeexWrapper(this.f15135a, this.w, this.c.p());
        n();
    }

    private void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
        } else {
            this.e.a(new com.taobao.android.sku.presenter.e() { // from class: com.taobao.android.sku.WeexCore.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.sku.presenter.e
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        WeexCore.c(WeexCore.this).e();
                    }
                }

                @Override // com.taobao.android.sku.presenter.e
                public void b() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("57a83e9", new Object[]{this});
                    } else {
                        WeexCore.c(WeexCore.this).f();
                    }
                }

                @Override // com.taobao.android.sku.presenter.e
                public void c() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5889b6a", new Object[]{this});
                    } else {
                        WeexCore.c(WeexCore.this).g();
                    }
                }

                @Override // com.taobao.android.sku.presenter.e
                public void d() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("596b2eb", new Object[]{this});
                    } else {
                        WeexCore.c(WeexCore.this).h();
                    }
                }
            });
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.g.b();
    }

    public void a(LinearLayout linearLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("920f557f", new Object[]{this, linearLayout});
        } else if (linearLayout == null) {
        } else {
            this.f = linearLayout;
            this.f.setClickable(true);
            this.f.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.sku.WeexCore.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else {
                        Log.e("Weex SKU", "Weex SKU Container Clicked");
                    }
                }
            });
        }
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        iyf.a().b(o.P_WEEX_RENDER, "afterMtop");
        long currentTimeMillis = System.currentTimeMillis();
        a(o.P_WEEX_RENDER, currentTimeMillis);
        Log.e("SKU trace", "weex render time " + currentTimeMillis);
        WeexWrapper weexWrapper = this.g;
        String b = b(this.n);
        JSONObject s = s();
        if (!o() || !z) {
            z2 = false;
        }
        weexWrapper.a(b, s, z2);
        iyf.a().a(o.P_WEEX_RENDER, (Map<String, String>) null);
    }

    private boolean o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("631b57a", new Object[]{this})).booleanValue();
        }
        boolean b = this.u | com.taobao.android.sku.data.a.b(this.n);
        this.u = b;
        return b;
    }

    private boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[]{this})).booleanValue();
        }
        if (com.taobao.android.sku.utils.c.a(this.f15135a)) {
            return false;
        }
        iyf.a().b("weexInit", "afterMtop");
        m();
        long currentTimeMillis = System.currentTimeMillis();
        a(o.P_WEEX_NEW, currentTimeMillis);
        Log.e("SKU trace", "new weex time " + currentTimeMillis);
        this.v = a(this.n);
        this.g.a(this.v, this.n);
        this.g.c();
        this.g.a(new a());
        this.i = false;
        this.h = true;
        this.j = new com.taobao.android.sku.weex.d(this.c, this, this.g, this.w);
        com.taobao.android.sku.weex.f.a(this.c.p() + this.w, this.j);
        iyf.a().a("weexInit", (Map<String, String>) null);
        this.o = false;
        return true;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            t();
        }
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        t();
        com.taobao.android.sku.weex.d dVar = this.j;
        if (dVar == null) {
            return;
        }
        dVar.a(this.d.h(), z);
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        com.taobao.android.sku.weex.d dVar = this.j;
        if (dVar == null) {
            return;
        }
        dVar.b(str);
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        com.taobao.android.sku.weex.d dVar = this.j;
        if (dVar == null) {
            return false;
        }
        return dVar.a(this.c.p());
    }

    private void a(String str, String str2, d.c cVar, c.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6eb3310d", new Object[]{this, str, str2, cVar, bVar});
            return;
        }
        this.p = str;
        this.q = str2;
        this.r = cVar;
        this.s = bVar;
    }

    private void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64de478", new Object[]{this});
            return;
        }
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
        if (r0.equals("dart_curtain_close") != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.alibaba.fastjson.JSONObject r8) {
        /*
            r7 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.android.sku.WeexCore.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 0
            r4 = 2
            if (r1 == 0) goto L15
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r3] = r7
            r1[r2] = r8
            java.lang.String r8 = "266fb88"
            r0.ipc$dispatch(r8, r1)
            return
        L15:
            if (r8 == 0) goto Lc0
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L1f
            goto Lc0
        L1f:
            java.lang.String r0 = "action"
            java.lang.String r0 = r8.getString(r0)
            com.alibaba.fastjson.JSONObject r1 = new com.alibaba.fastjson.JSONObject
            r1.<init>()
            java.lang.String r5 = "params"
            com.alibaba.fastjson.JSONObject r5 = r8.getJSONObject(r5)     // Catch: java.lang.Throwable -> L34
            r1.putAll(r5)     // Catch: java.lang.Throwable -> L34
        L34:
            com.taobao.android.sku.weex.d r5 = r7.j
            if (r5 != 0) goto L39
            return
        L39:
            r5 = -1
            int r6 = r0.hashCode()
            switch(r6) {
                case -1833539181: goto L81;
                case -989506044: goto L76;
                case 143373165: goto L6b;
                case 836241576: goto L60;
                case 865159886: goto L56;
                case 1090279755: goto L4d;
                case 1828388125: goto L42;
                default: goto L41;
            }
        L41:
            goto L8c
        L42:
            java.lang.String r2 = "sku_id_selected"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L8c
            r2 = 5
            goto L8d
        L4d:
            java.lang.String r3 = "dart_curtain_close"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L8c
            goto L8d
        L56:
            java.lang.String r2 = "dark_curtain_sku_action"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L8c
            r2 = 6
            goto L8d
        L60:
            java.lang.String r2 = "size_chart_update_detail"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L8c
            r2 = 3
            goto L8d
        L6b:
            java.lang.String r2 = "pvs_selected"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L8c
            r2 = 4
            goto L8d
        L76:
            java.lang.String r2 = "pv_sku_update"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L8c
            r2 = 0
            goto L8d
        L81:
            java.lang.String r2 = "service_update"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L8c
            r2 = 2
            goto L8d
        L8c:
            r2 = -1
        L8d:
            switch(r2) {
                case 0: goto Lb6;
                case 1: goto Laf;
                case 2: goto La9;
                case 3: goto La3;
                case 4: goto L9d;
                case 5: goto L97;
                case 6: goto L91;
                default: goto L90;
            }
        L90:
            goto Lc0
        L91:
            com.taobao.android.sku.weex.d r8 = r7.j
            r8.g(r1)
            goto Lc0
        L97:
            com.taobao.android.sku.weex.d r8 = r7.j
            r8.f(r1)
            return
        L9d:
            com.taobao.android.sku.weex.d r8 = r7.j
            r8.e(r1)
            return
        La3:
            com.taobao.android.sku.weex.d r8 = r7.j
            r8.c(r1)
            return
        La9:
            com.taobao.android.sku.weex.d r0 = r7.j
            r0.b(r8)
            return
        Laf:
            com.taobao.android.sku.weex.d r8 = r7.j
            r0 = 0
            r8.d(r0)
            return
        Lb6:
            com.taobao.android.sku.weex.d r8 = r7.j
            com.taobao.android.sku.WeexCore$4 r0 = new com.taobao.android.sku.WeexCore$4
            r0.<init>()
            r8.c(r0)
        Lc0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.sku.WeexCore.a(com.alibaba.fastjson.JSONObject):void");
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
            return;
        }
        iyf.a().b("onPreSkuShow", "afterMtop");
        t();
        if (StringUtils.isEmpty(this.n)) {
            o.a("TouchDown preShowSku return because url empty weexType=" + this.w);
            return;
        }
        o.a("TouchDown WeexCore preShowSku");
        if (!this.h) {
            p();
            if (!this.g.a()) {
                a(z);
            }
        }
        com.taobao.android.sku.weex.d dVar = this.j;
        if (dVar == null) {
            return;
        }
        dVar.a((Map<String, Object>) null, g());
        iyf.a().a("onPreSkuShow", (Map<String, String>) null);
        o.a("TouchDown WeexCore mMessageHandler.postPreSkuShow");
    }

    public void a(boolean z, String str, String str2, d.c cVar, c.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddbd8089", new Object[]{this, new Boolean(z), str, str2, cVar, bVar});
            return;
        }
        a(str, str2, cVar, bVar);
        t();
        iyf.a().a("beforeWeexInitInShow", (Map<String, String>) null);
        if (!this.h) {
            p();
            if (!this.g.a()) {
                a(z);
            }
        }
        iyf.a().b("afterWeexRenderInShow", "afterMtop");
        boolean z2 = this.t;
        if (!z2) {
            r();
            this.t = false;
        }
        if (this.f != null) {
            if (this.c.M()) {
                this.f.setVisibility(4);
                this.k.removeCallbacks(this.x);
                this.k.postDelayed(this.x, 5000L);
            } else {
                this.f.setVisibility(0);
            }
        }
        if (bVar != null) {
            bVar.a();
        }
        if (a(this.i, z2)) {
            this.c.w();
        }
        iyf.a().a("afterWeexRenderInShow", (Map<String, String>) null);
        iyf.a().a("afterMtop", (Map<String, String>) null);
        d();
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (this.j == null) {
        } else {
            String v = this.c.v();
            boolean z = !this.c.M();
            this.j.a((Map<String, Object>) null, v, z);
            if (z) {
                return;
            }
            o.d(o.UM_SKU_SILENT_CALL);
        }
    }

    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686427c", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = this.f;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
        this.k.removeCallbacks(this.x);
        this.c.x();
    }

    private boolean a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c194cec", new Object[]{this, new Boolean(z), new Boolean(z2)})).booleanValue();
        }
        if (this.c.M()) {
            return true;
        }
        if (z) {
            return false;
        }
        return !n.a() || !z2;
    }

    private void a(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123b0d2", new Object[]{this, str, new Long(j)});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            try {
                JSONObject jSONObject = this.c.g().g().getJSONObject("skuTimeStamp");
                if (jSONObject == null) {
                    return;
                }
                jSONObject.put(str, (Object) (j + ""));
            } catch (Throwable unused) {
            }
        }
    }

    private void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
            return;
        }
        try {
            JSONObject jSONObject = this.c.g().g().getJSONObject("skuTimeStamp");
            if (jSONObject == null) {
                return;
            }
            jSONObject.put(o.P_SKU_INIT, (Object) "-1");
            jSONObject.put(o.P_WEEX_NEW, (Object) "-1");
            jSONObject.put(o.P_WEEX_RENDER, (Object) "-1");
        } catch (Throwable unused) {
        }
    }

    private int a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("f3a64c25", new Object[]{this, str})).intValue() : k.b(str) ? 2 : 1;
    }

    private String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6111438d", new Object[]{this, str});
        }
        if (StringUtils.isEmpty(str)) {
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        buildUpon.appendQueryParameter("_sku_token_", this.c.p());
        String d = b.INSTANCE.d(this.f15135a);
        if (d != null && b.INSTANCE.a(this.f15135a)) {
            buildUpon.appendQueryParameter(p.KEY_DEVICE_TYPE, d);
        }
        return buildUpon.build().toString();
    }

    private JSONObject s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d26c569a", new Object[]{this});
        }
        JSONObject h = this.c.g().h();
        return h == null ? new JSONObject() : h;
    }

    private void t() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6782afb", new Object[]{this});
            return;
        }
        this.l = this.d.b();
        if (this.w == 3) {
            this.n = this.d.e();
        } else {
            this.n = this.d.f();
        }
        JSONObject g = this.d.g();
        if (g == null || (jSONObject = g.getJSONObject("id_biz_bottom")) == null) {
            return;
        }
        String string = jSONObject.getString("bottomMode");
        if (StringUtils.isEmpty(string)) {
            string = "ADDCART_AND_BUYNOW";
        }
        this.m = string;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        try {
            return Uri.parse(this.n).getBooleanQueryParameter("sku_use_fullscreen", false);
        } catch (Throwable th) {
            o.b(th.toString());
            return false;
        }
    }

    public String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this}) : this.m;
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = this.f;
        if (viewGroup == null) {
            return;
        }
        viewGroup.setVisibility(0);
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = this.f;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
        if (a(this.i, this.t)) {
            this.c.w();
        }
        iyf.a().a("beforeWeexInitInUpdate", (Map<String, String>) null);
        p();
        a(false);
        iyf.a().a("afterMtop", (Map<String, String>) null);
        d();
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = this.f;
        if (viewGroup == null) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue() : this.o;
    }

    private String a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9064aa65", new Object[]{this, new Integer(i)}) : i == 3 ? this.v == 2 ? o.UM_WEEX2_E_PREFIX : o.UM_WEEX_E_PREFIX : this.v == 2 ? o.UM_WEEX2_E_SKU_V3_PREFIX : o.UM_WEEX_E_SKU_V3_PREFIX;
    }

    public void a(String str, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else if (this.o) {
        } else {
            this.c.x();
            this.o = true;
            o.c(this.c.u(), a(this.w) + str, str2, o.UM_WEEX_E_SERVICE_ID);
            String str4 = this.w == 3 ? "newbuy" : "sku3.0";
            String f = this.d.f();
            if (this.w == 3 && c(this.n, f)) {
                this.b.b(this.p, this.q, this.r, this.s);
                str3 = str4 + " 降级至 sku3.0 || errorCode: " + str + " msg: " + str2;
                HashMap hashMap = new HashMap();
                hashMap.put("errorCode", str);
                hashMap.put("msg", str2);
                o.a(19999, "Downgrade_Newbuy2SkuV3", hashMap);
                this.c.a(3, 4);
            } else {
                this.b.a(this.w, this.p, this.q, this.r, this.s);
                str3 = str4 + " 降级至 native || errorCode: " + str + " msg: " + str2;
                this.c.a(this.w, 1);
            }
            r.a(this.f15135a, str3);
            o.d("weexMode", str3);
            q();
            m();
            if (this.w != 3) {
                return;
            }
            o.a();
        }
    }

    public static boolean c(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f277e382", new Object[]{str, str2})).booleanValue() : !StringUtils.isEmpty(str2) && !b(str, str2) && n.a("enable_newbuy_downto_skuv3");
    }

    public static boolean b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65d7b881", new Object[]{str, str2})).booleanValue();
        }
        if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(str2)) {
            Uri parse = Uri.parse(str);
            Uri parse2 = Uri.parse(str2);
            if (StringUtils.equals(parse.getHost(), parse2.getHost()) && StringUtils.equals(parse.getPath(), parse2.getPath())) {
                return true;
            }
        }
        return false;
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        ixt q = this.c.q();
        if (q != null) {
            q.a(a("CLOSE_BTN", null, null, null, null, null, null, null));
        }
        this.e.c();
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        this.k.removeCallbacksAndMessages(null);
        this.g.i();
        com.taobao.android.sku.weex.f.a(this.c.p() + this.w);
        this.h = false;
        this.i = false;
        com.taobao.android.sku.weex.d dVar = this.j;
        if (dVar == null) {
            return;
        }
        dVar.b();
        this.j = null;
    }

    private JSONObject a(final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7, final String str8) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("572adfd8", new Object[]{this, str, str2, str3, str4, str5, str6, str7, str8}) : new JSONObject() { // from class: com.taobao.android.sku.WeexCore.5
            {
                put("actionFrom", (Object) (!StringUtils.isEmpty(str) ? str : "NULL"));
                put("inputMode", (Object) WeexCore.d(WeexCore.this));
                put("buyNow", (Object) new JSONObject() { // from class: com.taobao.android.sku.WeexCore.5.1
                    {
                        put("itemId", (Object) WeexCore.e(WeexCore.this));
                        put("skuId", (Object) str2);
                        put("quantity", (Object) str3);
                        String str9 = "";
                        put("serviceId", (Object) (!StringUtils.isEmpty(str4) ? str4 : str9));
                        put("tgKey", (Object) (!StringUtils.isEmpty(str5) ? str5 : str9));
                        put(com.taobao.android.detail.core.event.subscriber.trade.b.K_BOOKING_DATE, (Object) (!StringUtils.isEmpty(str6) ? str6 : str9));
                        put(com.taobao.android.detail.core.event.subscriber.trade.b.K_ENTRANCE_DATE, (Object) (!StringUtils.isEmpty(str7) ? str7 : str9));
                        put("exParams", (Object) (!StringUtils.isEmpty(str8) ? str8 : str9));
                    }
                });
                put(tfu.ADD_CART, (Object) new JSONObject() { // from class: com.taobao.android.sku.WeexCore.5.2
                    {
                        put("itemId", (Object) WeexCore.e(WeexCore.this));
                        put("skuId", (Object) str2);
                        put("quantity", (Object) str3);
                    }
                });
            }
        };
    }

    /* loaded from: classes6.dex */
    public class a implements WeexWrapper.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1044653578);
            kge.a(830260653);
        }

        private a() {
        }

        @Override // com.taobao.android.sku.weex.WeexWrapper.a
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            } else if (WeexCore.f(WeexCore.this) == null || view == null) {
            } else {
                WeexCore.f(WeexCore.this).removeAllViews();
                WeexCore.f(WeexCore.this).addView(view, -1, -1);
            }
        }

        @Override // com.taobao.android.sku.weex.WeexWrapper.a
        public void a(WeexWrapper.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ed2cd12", new Object[]{this, bVar});
            } else {
                WeexCore.g(WeexCore.this).post(new Runnable() { // from class: com.taobao.android.sku.WeexCore.a.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                            return;
                        }
                        WeexCore.a(WeexCore.this, true);
                        if (!WeexCore.b(WeexCore.this).M()) {
                            WeexCore.b(WeexCore.this).x();
                        }
                        if (WeexCore.a(WeexCore.this) == null) {
                            return;
                        }
                        WeexCore.a(WeexCore.this).a();
                    }
                });
            }
        }

        @Override // com.taobao.android.sku.weex.WeexWrapper.a
        public void a(WeexWrapper.b bVar, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4606126", new Object[]{this, bVar, str, str2});
                return;
            }
            WeexCore weexCore = WeexCore.this;
            weexCore.a("Active=" + str, str2);
            WeexCore.b(WeexCore.this).a("BUYNOW".equals(WeexCore.d(WeexCore.this)) ? -700001 : -700002, "sku渲染失败");
        }
    }
}
