package com.taobao.android.detail.wrapper.newsku;

import android.graphics.Rect;
import mtopsdk.common.util.StringUtils;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.performance.n;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.core.utils.s;
import com.taobao.android.detail.datasdk.model.datamodel.sku.SkuPageModel;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.f;
import com.taobao.android.detail.wrapper.activity.DetailActivity;
import com.taobao.android.sku.utils.m;
import com.taobao.android.sku.utils.o;
import com.taobao.android.tbsku.TBXSkuCore;
import com.taobao.taobao.R;
import tb.dya;
import tb.dyn;
import tb.dyo;
import tb.eja;
import tb.emu;
import tb.fgr;
import tb.iuy;
import tb.ixt;
import tb.ixu;
import tb.iyh;
import tb.jcv;
import tb.kge;
import tb.riy;
import tb.tfu;

/* loaded from: classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private String f11421a;
    private DetailActivity b;
    private TBXSkuCore c;
    private iyh d;
    private boolean e;
    private ixt f;
    private String g;

    static {
        kge.a(1752564058);
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f95776", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public static /* synthetic */ JSONObject a(a aVar, long j) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("f8b9e343", new Object[]{aVar, new Long(j)}) : aVar.a(j);
    }

    public static /* synthetic */ JSONObject a(a aVar, String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("b0229d09", new Object[]{aVar, str, new Boolean(z)}) : aVar.a(str, z);
    }

    public static /* synthetic */ DetailActivity a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DetailActivity) ipChange.ipc$dispatch("37c36859", new Object[]{aVar}) : aVar.b;
    }

    public static /* synthetic */ String a(a aVar, boolean z, boolean z2, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ad10f775", new Object[]{aVar, new Boolean(z), new Boolean(z2), str}) : aVar.a(z, z2, str);
    }

    public static /* synthetic */ void a(a aVar, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e0ad1df", new Object[]{aVar, str, str2, str3});
        } else {
            aVar.a(str, str2, str3);
        }
    }

    public static /* synthetic */ String b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("69c4ec1e", new Object[]{aVar}) : aVar.n();
    }

    public static /* synthetic */ TBXSkuCore c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBXSkuCore) ipChange.ipc$dispatch("7306ccf", new Object[]{aVar}) : aVar.c;
    }

    public a(DetailActivity detailActivity, String str) {
        this.b = detailActivity;
        this.f11421a = str;
        emu.a("com.taobao.android.detail.wrapper.newsku.PreFetchSKUCore");
    }

    public void a(ixt ixtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee928793", new Object[]{this, ixtVar});
            return;
        }
        this.f = ixtVar;
        TBXSkuCore tBXSkuCore = this.c;
        if (tBXSkuCore == null) {
            return;
        }
        tBXSkuCore.a(this.f);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        TBXSkuCore tBXSkuCore = this.c;
        if (tBXSkuCore == null || tBXSkuCore.b() == null) {
            return;
        }
        this.c.b().a(new ixu() { // from class: com.taobao.android.detail.wrapper.newsku.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                a.this = this;
            }

            @Override // tb.ixu
            public Rect a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return (Rect) ipChange2.ipc$dispatch("ef387fb1", new Object[]{this});
                }
                View findViewById = a.a(a.this).findViewById(R.id.tao_detail_cart_item);
                if (findViewById == null) {
                    return null;
                }
                int[] iArr = new int[2];
                findViewById.getLocationOnScreen(iArr);
                int i = iArr[0];
                int i2 = iArr[1];
                return new Rect(m.b(a.a(a.this), i), m.b(a.a(a.this), i2), m.b(a.a(a.this), findViewById.getWidth() + i), m.b(a.a(a.this), findViewById.getHeight() + i2));
            }
        });
    }

    public void a(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d8a2226", new Object[]{this, new Long(j), str});
            return;
        }
        TBXSkuCore tBXSkuCore = this.c;
        if (tBXSkuCore == null || tBXSkuCore.b() == null) {
            return;
        }
        this.c.b().a(j, str);
    }

    public iyh b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iyh) ipChange.ipc$dispatch("16b7d845", new Object[]{this});
        }
        if (this.d == null) {
            this.d = new iyh();
            TBXSkuCore tBXSkuCore = this.c;
            if (tBXSkuCore != null && !tBXSkuCore.d()) {
                this.c.b().a(this.d);
            }
        }
        return this.d;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : a(false);
    }

    public boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (!StringUtils.isEmpty(o())) {
            if (this.c == null) {
                final long currentTimeMillis = System.currentTimeMillis();
                Log.e("SKU trace", "init time " + currentTimeMillis);
                this.c = new TBXSkuCore(this.b, this.f11421a);
                if (s.b()) {
                    this.c.a(iuy.d);
                }
                this.c.a(this.f);
                this.c.b().a(this.d);
                this.c.a(l());
                this.c.c(new JSONObject() { // from class: com.taobao.android.detail.wrapper.newsku.PreFetchSKUCore$2
                    {
                        put("skuTimeStamp", (Object) a.a(a.this, currentTimeMillis));
                    }
                });
            }
            return true;
        }
        d();
        this.c = null;
        return false;
    }

    private String l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("77b5ea0d", new Object[]{this});
        }
        dyo.a b = dyo.b(dyo.b(this.b));
        if (b != null && b.b) {
            i.c(n.a("PreFetchSKUCore"), "使用流式接口调用的数据");
            return b.d;
        }
        i.c(n.a("PreFetchSKUCore"), "使用非流式接口调用的数据");
        return this.b.b();
    }

    private JSONObject a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("55cbd27c", new Object[]{this, new Long(j)});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(o.P_SKU_INIT, (Object) (j + ""));
        return jSONObject;
    }

    private void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        TBXSkuCore tBXSkuCore = this.c;
        if (tBXSkuCore == null) {
            return;
        }
        try {
            JSONObject jSONObject = tBXSkuCore.b().g().g().getJSONObject("skuTimeStamp");
            if (jSONObject != null) {
                jSONObject.put(o.P_CART_BTN_CLICK, (Object) "-1");
                jSONObject.put(o.P_BUY_BTN_CLICK, (Object) "-1");
                jSONObject.put(o.P_SKUBAR_BTN_CLICK, (Object) "-1");
                if (tfu.ADD_CART.equals(this.b.g)) {
                    jSONObject.put(o.P_CART_BTN_CLICK, (Object) (this.b.f + ""));
                } else if ("buyNow".equals(this.b.g)) {
                    jSONObject.put(o.P_BUY_BTN_CLICK, (Object) (this.b.f + ""));
                } else if ("skuBar".equals(this.b.g)) {
                    jSONObject.put(o.P_SKUBAR_BTN_CLICK, (Object) (this.b.f + ""));
                }
            }
        } catch (Throwable unused) {
        }
        DetailActivity detailActivity = this.b;
        detailActivity.g = null;
        detailActivity.f = -1L;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        TBXSkuCore tBXSkuCore = this.c;
        if (tBXSkuCore == null) {
            return;
        }
        tBXSkuCore.c();
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        TBXSkuCore tBXSkuCore = this.c;
        if (tBXSkuCore != null) {
            tBXSkuCore.c();
        }
        this.c = null;
        this.e = false;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        TBXSkuCore tBXSkuCore = this.c;
        if (tBXSkuCore == null) {
            return;
        }
        tBXSkuCore.i(str);
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        TBXSkuCore tBXSkuCore = this.c;
        if (tBXSkuCore == null) {
            return;
        }
        tBXSkuCore.j(str);
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        TBXSkuCore tBXSkuCore = this.c;
        if (tBXSkuCore == null) {
            return;
        }
        tBXSkuCore.b().w();
    }

    public boolean a(jcv jcvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ef205b5f", new Object[]{this, jcvVar})).booleanValue();
        }
        TBXSkuCore tBXSkuCore = this.c;
        if (tBXSkuCore == null) {
            return false;
        }
        tBXSkuCore.a(jcvVar);
        return true;
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        TBXSkuCore tBXSkuCore = this.c;
        if (tBXSkuCore == null || tBXSkuCore.d()) {
            return;
        }
        this.c.d(str);
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        TBXSkuCore tBXSkuCore = this.c;
        return tBXSkuCore != null && !tBXSkuCore.d();
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
            return;
        }
        TBXSkuCore tBXSkuCore = this.c;
        if (tBXSkuCore == null || tBXSkuCore.d()) {
            return;
        }
        this.c.c(str);
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
        } else {
            this.g = str;
        }
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf10f3", new Object[]{this})).booleanValue();
        }
        TBXSkuCore tBXSkuCore = this.c;
        if (tBXSkuCore == null || tBXSkuCore.d() || this.e) {
            return false;
        }
        m();
        this.c.a(false);
        this.e = true;
        return true;
    }

    public boolean i() {
        JSONObject g;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5dd2874", new Object[]{this})).booleanValue();
        }
        TBXSkuCore tBXSkuCore = this.c;
        if (tBXSkuCore == null || tBXSkuCore.d() || (g = this.c.b().g().g()) == null || (jSONObject = g.getJSONObject("id_biz_property")) == null) {
            return false;
        }
        jSONObject.remove("skuId");
        this.c.b(g);
        return true;
    }

    public void j() {
        iyh j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        TBXSkuCore tBXSkuCore = this.c;
        if (tBXSkuCore == null || tBXSkuCore.d() || (j = this.c.b().j()) == null || !fgr.a("clearStorageInfo", true)) {
            return;
        }
        j.a();
    }

    public boolean a(String str, boolean z, boolean z2, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("bcf76f8", new Object[]{this, str, new Boolean(z), new Boolean(z2), str2, jSONObject})).booleanValue() : a(str, z, z2, str2, jSONObject, null, null);
    }

    public boolean a(String str, boolean z, boolean z2, String str2, JSONObject jSONObject, eja ejaVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9c16f78c", new Object[]{this, str, new Boolean(z), new Boolean(z2), str2, jSONObject, ejaVar})).booleanValue() : a(str, z, z2, str2, jSONObject, null, ejaVar);
    }

    public boolean a(String str, boolean z, boolean z2, String str2, JSONObject jSONObject, String str3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("68484bc2", new Object[]{this, str, new Boolean(z), new Boolean(z2), str2, jSONObject, str3})).booleanValue() : a(str, z, z2, str2, jSONObject, str3, null);
    }

    public boolean a(final String str, final boolean z, final boolean z2, final String str2, final JSONObject jSONObject, final String str3, eja ejaVar) {
        IpChange ipChange = $ipChange;
        boolean z3 = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa7b6256", new Object[]{this, str, new Boolean(z), new Boolean(z2), str2, jSONObject, str3, ejaVar})).booleanValue();
        }
        TBXSkuCore tBXSkuCore = this.c;
        if (tBXSkuCore == null || tBXSkuCore.d()) {
            return false;
        }
        this.c.b(new JSONObject() { // from class: com.taobao.android.detail.wrapper.newsku.PreFetchSKUCore$3
            {
                putAll(a.a(a.this, a.a(a.this, z, z2, str), z2));
                if (!StringUtils.isEmpty(str2)) {
                    put("id_biz_property", new JSONObject() { // from class: com.taobao.android.detail.wrapper.newsku.PreFetchSKUCore$3.1
                        {
                            put("skuId", (Object) str2);
                        }
                    });
                }
                JSONObject jSONObject2 = jSONObject;
                if (jSONObject2 != null && !jSONObject2.isEmpty()) {
                    putAll(jSONObject);
                }
                put("storedData", new JSONObject() { // from class: com.taobao.android.detail.wrapper.newsku.PreFetchSKUCore$3.2
                    {
                        put("transparent_map", (Object) new JSONObject() { // from class: com.taobao.android.detail.wrapper.newsku.PreFetchSKUCore.3.2.1
                            {
                                put("addCartSource", "detail");
                            }
                        });
                    }
                });
                put("fromSendGiftButton", Boolean.valueOf(z));
                String b = a.b(a.this);
                if (!StringUtils.isEmpty(b)) {
                    put("quantity", (Object) b);
                }
            }
        });
        m();
        boolean z4 = this.c.b().m() != null || ejaVar == null;
        a(str, str3, z4);
        if (z4) {
            String a2 = n.a("PreFetchSKUCore");
            StringBuilder sb = new StringBuilder();
            sb.append("not need request sku data, [skuDataProvider == null: ");
            if (ejaVar == null) {
                z3 = true;
            }
            sb.append(z3);
            sb.append(riy.ARRAY_END_STR);
            i.c(a2, sb.toString());
            return true;
        }
        String a3 = ejaVar.a();
        if (a3 != null) {
            i.c(n.a("PreFetchSKUCore"), "sku provider has data");
            a(str, str3, a3);
            return true;
        }
        i.c(n.a("PreFetchSKUCore"), "sku provider request data");
        ejaVar.a(new dyn() { // from class: com.taobao.android.detail.wrapper.newsku.a.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                a.this = this;
            }

            @Override // tb.dyn
            public void a(String str4) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str4});
                    return;
                }
                i.c(n.a("PreFetchSKUCore"), "sku provider request data response");
                a.a(a.this, str, str3, str4);
            }

            @Override // tb.dyn
            public void b(String str4) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3dd7e573", new Object[]{this, str4});
                    return;
                }
                i.c(n.a("PreFetchSKUCore"), "sku provider request data failure");
                a.c(a.this).b().y();
                Toast.makeText(a.a(a.this), "服务器开小差了，请稍后再试一下吧～", 0).show();
            }
        });
        return true;
    }

    private void a(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dbad4d8", new Object[]{this, str, str2, new Boolean(z)});
            return;
        }
        if (z) {
            if (str2 == null) {
                str2 = f(str);
            }
            if (str2 != null) {
                this.c.g(str2);
                return;
            }
        }
        this.c.e();
    }

    private void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            return;
        }
        b(str3);
        if (str2 == null) {
            str2 = f(str);
        }
        if (StringUtils.isEmpty(str2)) {
            return;
        }
        this.c.b().y();
        a(str, str2, true);
    }

    private String f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd890709", new Object[]{this, str});
        }
        dya y = this.b.y();
        if (y == null) {
            return null;
        }
        SkuPageModel h = y.h();
        if ("bottombar_style_confirm_buy".equals(str) && !h.isH5Sku() && !h.showSku() && !h.buyNowShowSku()) {
            return f.EVENT_TYPE_ALTERNATIVE;
        }
        if ("bottombar_style_confirm_addcart".equals(str) && !h.isH5Sku() && !h.showSku()) {
            return "add_cart";
        }
        return null;
    }

    private String n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("84c15f4b", new Object[]{this});
        }
        try {
            Long.parseLong(this.g);
        } catch (Exception unused) {
            this.g = "";
        }
        return this.g;
    }

    private String o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b4719ea", new Object[]{this});
        }
        DetailActivity detailActivity = this.b;
        if (detailActivity != null && detailActivity.y() != null && this.b.y().i() != null) {
            return this.b.y().i().i();
        }
        return null;
    }

    private String a(boolean z, boolean z2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("44b6a22e", new Object[]{this, new Boolean(z), new Boolean(z2), str});
        }
        if (z || z2) {
            return "BUYNOW";
        }
        if (!"bottombar_style_buyaddcart".equals(str)) {
            if ("bottombar_style_confirm_addcart".equals(str)) {
                return "ADDCART";
            }
            if ("bottombar_style_confirm_buy".equals(str)) {
                return "BUYNOW";
            }
            if ("bottombar_style_confirm".equals(str)) {
                return "CONFIRM";
            }
        }
        return "ADDCART_AND_BUYNOW";
    }

    private JSONObject a(final String str, final boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("27269002", new Object[]{this, str, new Boolean(z)}) : new JSONObject() { // from class: com.taobao.android.detail.wrapper.newsku.PreFetchSKUCore$5
            {
                put("id_biz_bottom", (Object) new JSONObject() { // from class: com.taobao.android.detail.wrapper.newsku.PreFetchSKUCore$5.1
                    {
                        put("bottomMode", (Object) str);
                        if ("ADDCART".equals(str)) {
                            put("addCartText", "确认");
                        } else if (!"BUYNOW".equals(str)) {
                        } else {
                            if (z) {
                                put("buyNowText", "我要捐赠");
                            } else {
                                put("buyNowText", "确认");
                            }
                        }
                    }
                });
            }
        };
    }
}
