package com.taobao.android.sku;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.android.ultron.vfw.instance.d;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliConfigInterface;
import com.taobao.android.detail.datasdk.model.datamodel.node.SkuCoreNode;
import com.taobao.android.sku.c;
import com.taobao.android.sku.data.a;
import com.taobao.android.sku.presenter.c;
import com.taobao.android.sku.utils.b;
import com.taobao.android.sku.utils.n;
import com.taobao.android.sku.utils.o;
import com.taobao.android.sku.utils.r;
import com.taobao.tao.TaoApplication;
import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes6.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int SKU_MODE_NATIVE = 1;
    public static final int SKU_MODE_WEB = 2;
    public static final int SKU_MODE_WEEX = 3;
    public static final int SKU_MODE_WEEX_SKU_V3 = 4;

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f15177a;
    private e b;
    private d c;
    private WeexCore d;
    private WeexCore e;
    private c f;
    private a g;
    private int h = 1;
    private boolean i = true;
    private String l = "sku_native_mode";
    private boolean j = c();
    private boolean k = d();

    public static /* synthetic */ int a(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("570a1da9", new Object[]{fVar})).intValue() : fVar.h;
    }

    public static /* synthetic */ void a(f fVar, String str, c.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd07b073", new Object[]{fVar, str, bVar});
        } else {
            fVar.a(str, bVar);
        }
    }

    public static /* synthetic */ WeexCore b(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeexCore) ipChange.ipc$dispatch("610e8863", new Object[]{fVar}) : fVar.d;
    }

    public static /* synthetic */ WeexCore c(f fVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeexCore) ipChange.ipc$dispatch("549e0ca4", new Object[]{fVar}) : fVar.e;
    }

    static {
        kge.a(146749079);
        f15177a = false;
    }

    public f(c cVar, Context context, com.alibaba.android.ultron.vfw.instance.d dVar, a aVar, com.taobao.android.sku.presenter.c cVar2) {
        this.f = cVar;
        this.b = new e(this, cVar, dVar, aVar);
        this.c = new d(this, cVar, context, aVar, cVar2);
        this.d = new WeexCore(this, cVar, context, aVar, cVar2, 3);
        this.e = new WeexCore(this, cVar, context, aVar, cVar2, 4);
        this.g = aVar;
        com.taobao.android.sku.utils.e.a(context);
        b(cVar2);
    }

    private void b(com.taobao.android.sku.presenter.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ae819a1", new Object[]{this, cVar});
        } else {
            cVar.a(new c.a() { // from class: com.taobao.android.sku.f.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.sku.presenter.c.a
                public boolean a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
                    }
                    int a2 = f.a(f.this);
                    if (a2 == 3) {
                        return f.b(f.this).b();
                    }
                    if (a2 == 4) {
                        return f.c(f.this).b();
                    }
                    return false;
                }
            });
        }
    }

    private boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        AliConfigInterface a2 = com.taobao.android.e.a();
        if (a2 == null) {
            return false;
        }
        return Boolean.parseBoolean(a2.a("android_sku", "is_newbuy_open", "true"));
    }

    private boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue();
        }
        AliConfigInterface a2 = com.taobao.android.e.a();
        if (a2 == null) {
            return false;
        }
        return Boolean.parseBoolean(a2.a("android_sku", "is_sku3_open", "true"));
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a31c578", new Object[]{this, aVar});
            return;
        }
        a(b(aVar, this.i));
        this.c.a();
        this.d.c();
        this.e.c();
    }

    public void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e70fdd7", new Object[]{this, aVar});
            return;
        }
        a(b(aVar, this.i));
        this.b.a(aVar.i(), aVar.j(), aVar.k(), aVar.l());
    }

    public void a(com.taobao.android.sku.presenter.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de47eea0", new Object[]{this, cVar});
            return;
        }
        com.taobao.android.sku.presenter.d a2 = cVar.a();
        if (!(a2 instanceof com.taobao.android.sku.presenter.a)) {
            return;
        }
        com.taobao.android.sku.presenter.a aVar = (com.taobao.android.sku.presenter.a) a2;
        this.b.a(aVar.e());
        this.c.a(aVar.f());
        this.d.a(aVar.g());
        this.e.a(aVar.h());
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        o.a("onUpdateDetail SkuCore.updateDataWithError errorMsg:" + str2);
        this.d.c(str2);
        this.e.c(str2);
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        this.b.b();
        this.c.d();
        this.d.j();
        this.e.j();
    }

    public void a(String str, a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f3fd426", new Object[]{this, str, aVar, new Boolean(z)});
            return;
        }
        int i = this.h;
        a(b(aVar, this.i));
        boolean z2 = i != this.h;
        boolean z3 = !this.d.e() || z2;
        boolean z4 = !this.e.e() || z2;
        o.a("onUpdateDetail SkuCore.updateData needDestroyBeforeUpdate:" + z3 + " keepAlive:" + z);
        this.b.a(str);
        this.c.b();
        if (z3) {
            this.d.m();
        }
        if (z4) {
            this.e.m();
        }
        this.d.b(z);
        this.e.b(z);
        e();
        int i2 = this.h;
        float f = 0.9f;
        if (i2 == 2) {
            this.c.c();
            o.b(false);
            o.a(false);
        } else if (i2 == 3) {
            if (this.d.f()) {
                f = 1.0f;
            }
            if (z3) {
                this.d.i();
            } else {
                this.d.h();
            }
            o.b(true);
            o.a(false);
        } else if (i2 == 4) {
            if (this.e.f()) {
                f = 1.0f;
            }
            if (z4) {
                this.e.i();
            } else {
                this.e.h();
            }
            o.b(false);
            o.a(true);
        } else {
            this.b.a();
            o.b(false);
            o.a(false);
        }
        a(f, false);
        if (!z2 || !n.a("enableExposureSkuOnUpdateData")) {
            return;
        }
        this.f.K();
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        int i = this.h;
        if (i == 2) {
            return;
        }
        if (i == 3) {
            this.d.a(jSONObject);
        } else if (i == 4) {
            this.e.a(jSONObject);
        } else {
            this.b.a(jSONObject);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        int i = this.h;
        if (i == 3) {
            this.d.a();
        } else if (i != 4) {
        } else {
            this.e.a();
        }
    }

    public void b(String str, String str2, d.c cVar, c.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a5c5f2c", new Object[]{this, str, str2, cVar, bVar});
            return;
        }
        a(4);
        e();
        a(str, str2, cVar, bVar);
    }

    public void a(int i, String str, String str2, d.c cVar, c.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eeeeb8ba", new Object[]{this, new Integer(i), str, str2, cVar, bVar});
            return;
        }
        a(1);
        StringBuilder sb = new StringBuilder();
        sb.append(i == 3 ? "newbuy" : "skuV3");
        sb.append("_downgrade");
        this.l = sb.toString();
        if (i == 3) {
            this.d.j();
        } else {
            this.e.j();
        }
        e();
        a(str, str2, cVar, bVar);
    }

    private String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50938a53", new Object[]{this});
        }
        JSONObject a2 = this.g.a();
        if (a2 == null) {
            return "";
        }
        if (b.a(this.f.r())) {
            if (!a2.getBooleanValue("optionalDowngrade")) {
                return "";
            }
            String string = a2.getString("optionalUrl");
            return TextUtils.isEmpty(string) ? this.g.a(this.f.r()) : string;
        } else if (!a2.getBooleanValue("downgrade")) {
            return "";
        } else {
            String string2 = a2.getString("url");
            return TextUtils.isEmpty(string2) ? this.g.d() : string2;
        }
    }

    private String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b82f346c", new Object[]{this, str});
        }
        a aVar = this.g;
        if (aVar == null) {
            return "";
        }
        String r = aVar.r();
        if (TextUtils.isEmpty(r)) {
            return null;
        }
        Uri.Builder buildUpon = Uri.parse(r).buildUpon();
        buildUpon.appendQueryParameter("_sku_token_", str);
        buildUpon.appendQueryParameter("bottom_mode", h());
        buildUpon.appendQueryParameter("ttid", TaoApplication.getTTID());
        return buildUpon.build().toString();
    }

    private void a(String str, c.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b68017a5", new Object[]{this, str, bVar});
            return;
        }
        a(2);
        e();
        this.c.a(str, bVar);
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        a(1);
        this.l = "h5_downgrade";
        e();
        a(str, null, null, null);
    }

    private void a(float f, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c10357c", new Object[]{this, new Float(f), new Boolean(z)});
            return;
        }
        try {
            ((com.taobao.android.sku.presenter.b) this.f.h().a()).a(f, z);
        } catch (Throwable th) {
            o.b(th.toString());
        }
    }

    private void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        try {
            ((com.taobao.android.sku.presenter.b) this.f.h().a()).b(new View.OnClickListener() { // from class: com.taobao.android.sku.f.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else {
                        f.this.j();
                    }
                }
            });
        } catch (Throwable th) {
            o.b(th.toString());
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        int i = this.h;
        if (i == 2) {
            this.c.n();
        } else if (i == 3) {
            this.d.a("TEST", "");
            this.f.a(-700003, "sku前端主动降级");
        } else if (i == 4) {
            this.e.a("TEST", "");
            this.f.a(-700004, "sku前端主动降级");
        } else {
            r.a(this.f.o(), "当前已经是Native模式，无法降级");
        }
    }

    public String a(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("464b1bc4", new Object[]{this, aVar, new Boolean(z)});
        }
        int b = b(aVar, z);
        return b != 2 ? b != 3 ? b != 4 ? "native" : o.TYPE_SKU_V3 : "newbuy" : "web";
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        o.b("Touchdown check before preShowSku mSkuMode:" + this.h);
        if (this.h != 3) {
            return;
        }
        this.d.c(this.i);
    }

    public void a(final String str, String str2, d.c cVar, final c.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6eb3310d", new Object[]{this, str, str2, cVar, bVar});
            return;
        }
        boolean z = this.i;
        this.i = false;
        e();
        int i = this.h;
        float f = 0.9f;
        if (i == 2) {
            this.c.a(bVar);
            o.b(false);
            o.a(false);
        } else if (i == 3) {
            if (this.d.f()) {
                f = 1.0f;
            }
            this.d.a(z, str, str2, cVar, bVar);
            o.b(true);
            o.a(false);
        } else if (i == 4) {
            if (this.e.f()) {
                f = 1.0f;
            }
            this.e.a(z, str, str2, cVar, bVar);
            o.b(false);
            o.a(true);
        } else {
            this.b.a(str, str2, cVar, new c.b() { // from class: com.taobao.android.sku.SkuCore$3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.sku.c.b
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    boolean z2 = true;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        return;
                    }
                    f fVar = f.this;
                    String str3 = f.$ipChange;
                    if (TextUtils.isEmpty(str3)) {
                        f fVar2 = f.this;
                        String str4 = str;
                        str3 = f.$ipChange;
                    } else {
                        z2 = false;
                    }
                    String str5 = "degradeSkuH5Url";
                    if (!TextUtils.isEmpty(str3) && !d.TOKEN_FROM_DOWNGRADE_SKUH5URL.equals(str)) {
                        f.a(f.this, str3, bVar);
                        if (z2) {
                            o.a(19999, "Open_DegradeSkuH5Url", new HashMap<String, String>() { // from class: com.taobao.android.sku.SkuCore$3.1
                                {
                                    f fVar3 = f.this;
                                    put("id", f.$ipChange.n());
                                }
                            });
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append("native 跳转至 ");
                        if (!z2) {
                            str5 = "skuH5Url";
                        }
                        sb.append(str5);
                        String sb2 = sb.toString();
                        f fVar3 = f.this;
                        r.a(f.$ipChange.o(), sb2);
                        o.d("webMode", sb2);
                        f fVar4 = f.this;
                        f.$ipChange.a(-700007, "");
                        return;
                    }
                    c.b bVar2 = bVar;
                    if (bVar2 != null) {
                        bVar2.a();
                    }
                    f fVar5 = f.this;
                    JSONObject m = f.$ipChange.m();
                    if (m == null) {
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    f fVar6 = f.this;
                    hashMap.put("item_id", f.$ipChange.n());
                    f fVar7 = f.this;
                    hashMap.put("reason", f.$ipChange);
                    f fVar8 = f.this;
                    if ("sku_native_mode".equals(f.$ipChange)) {
                        JSONObject jSONObject = m.getJSONObject(SkuCoreNode.TAG);
                        JSONObject jSONObject2 = m.getJSONObject("item");
                        hashMap.put(SkuCoreNode.TAG, JSON.toJSONString(jSONObject));
                        hashMap.put("item", JSON.toJSONString(jSONObject2));
                        hashMap.put("containSkuV3Data", JSON.toJSONString(Boolean.valueOf(m.containsKey("skuV3Data"))));
                        hashMap.put("containNewBuyData", JSON.toJSONString(Boolean.valueOf(m.containsKey("newBuyData"))));
                        f fVar9 = f.this;
                        hashMap.put(str5, f.$ipChange.r());
                        f fVar10 = f.this;
                        hashMap.put("isFirstShow", String.valueOf(f.$ipChange));
                        hashMap.put("isNewBuyBroken", String.valueOf(f.b(f.this).k()));
                        hashMap.put("isSkuV3Broken", String.valueOf(f.c(f.this).k()));
                        f fVar11 = f.this;
                        hashMap.put("utParams", String.valueOf(f.$ipChange.s()));
                        if (jSONObject == null || jSONObject.isEmpty() || jSONObject2 == null || jSONObject2.isEmpty()) {
                            o.a("Open_Sku_Native originalData:" + JSON.toJSONString(m));
                        }
                        o.a("Open_Sku_Native utArgs:" + JSON.toJSONString(hashMap));
                    }
                    o.a(19999, "Open_Sku_Native", hashMap);
                }
            });
            o.b(false);
            o.a(false);
        }
        a(f, false);
        if (!com.taobao.android.sku.utils.e.a()) {
            return;
        }
        k();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.c.e();
        this.d.m();
        this.e.m();
    }

    public void c(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2b03636", new Object[]{this, aVar});
        } else {
            a(b(aVar, this.i));
        }
    }

    private void a(int i) {
        IpChange ipChange = $ipChange;
        int i2 = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        if (i == 2) {
            o.d("webMode", "enter webview mode");
            if (this.c.f()) {
                this.l = "h5_broken";
                o.d("webMode", "webview is broken, now switch to native");
            }
            i2 = i;
        } else if (i == 3) {
            o.d("weexMode", "enter newbuy mode");
            if (this.d.k()) {
                this.l = "newbuy_broken";
                o.d("weexMode", "newbuy is broken, now switch to native");
            }
            i2 = i;
        } else if (i == 4) {
            o.d("weexMode", "enter sku3.0 mode");
            if (this.e.k()) {
                this.l = "skuV3_broken";
                o.d("weexMode", "sku3.0 is broken, now switch to native");
            }
            i2 = i;
        } else {
            o.d("nativeMode", "enter native mode");
        }
        this.h = i2;
    }

    private int b(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        int i = 3;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4faf6fd0", new Object[]{this, aVar, new Boolean(z)})).intValue();
        }
        String e = aVar.e();
        String f = aVar.f();
        boolean equalsIgnoreCase = "BUYNOW".equalsIgnoreCase(h());
        if (TextUtils.isEmpty(e) || !this.j || !equalsIgnoreCase || this.d.k()) {
            if (TextUtils.isEmpty(f) || !this.k || ((equalsIgnoreCase && !WeexCore.c(e, f)) || this.e.k())) {
                i = (TextUtils.isEmpty(aVar.a(this.f.r())) || this.c.f()) ? 1 : 2;
            } else {
                i = 4;
            }
        }
        if (z && i == 2) {
            return 1;
        }
        return i;
    }

    public String h() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this});
        }
        JSONObject g = this.g.g();
        if (g != null && (jSONObject = g.getJSONObject("id_biz_bottom")) != null) {
            String string = jSONObject.getString("bottomMode");
            if (!TextUtils.isEmpty(string)) {
                return string;
            }
        }
        return "ADDCART_AND_BUYNOW";
    }

    public void a(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d8a2226", new Object[]{this, new Long(j), str});
            return;
        }
        JSONObject q = this.g.q();
        if (q == null) {
            return;
        }
        q.put("beforeClickDuration", (Object) String.valueOf(j));
        q.put("clickSource", (Object) str);
    }

    public Map a(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bf3e1ee7", new Object[]{this, str});
        }
        JSONObject q = this.g.q();
        if (q != null) {
            q.put("skuType", (Object) str);
            return q.getInnerMap();
        }
        return new HashMap<String, String>() { // from class: com.taobao.android.sku.SkuCore$4
            {
                f.this = this;
                put("skuType", str);
            }
        };
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else {
            this.g.p();
        }
    }
}
