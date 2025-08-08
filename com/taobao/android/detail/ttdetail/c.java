package com.taobao.android.detail.ttdetail;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.widget.Toast;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.aura.observer.a;
import com.taobao.android.detail.ttdetail.data.meta.DetailAdjustModel;
import com.taobao.android.detail.ttdetail.data.meta.Feature;
import com.taobao.android.detail.ttdetail.utils.ae;
import com.taobao.android.detail.ttdetail.utils.am;
import com.taobao.android.detail.ttdetail.utils.b;
import com.taobao.android.detail.ttdetail.utils.i;
import com.taobao.android.detail.ttdetail.utils.j;
import com.taobao.android.detail.ttdetail.utils.k;
import com.taobao.android.sku.c;
import com.taobao.android.sku.utils.m;
import com.taobao.android.sku.utils.o;
import com.taobao.android.tbsku.TBXSkuCore;
import com.taobao.taobao.R;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import tb.eyx;
import tb.ezv;
import tb.ixt;
import tb.ixu;
import tb.iyf;
import tb.iyh;
import tb.jcv;
import tb.kge;
import tb.pir;
import tb.pkw;
import tb.qqy;
import tb.tac;

/* loaded from: classes4.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BOTTOM_MODE_ADDCART = "ADDCART";
    public static final String BOTTOM_MODE_ADDCART_AND_BUYNOW = "ADDCART_AND_BUYNOW";
    public static final String BOTTOM_MODE_BUYNOW = "BUYNOW";
    public static final String BOTTOM_MODE_CONFIRM = "CONFIRM";

    /* renamed from: a */
    private static final List<String> f10514a;
    private final Context b;
    private final eyx c;
    private TBXSkuCore d;
    private final String e;
    private iyh f;
    private JSONObject g;
    private ixt i;
    private String j;
    private volatile boolean k;
    private com.taobao.android.detail.ttdetail.widget.g l;
    private final String m;
    private int n;
    private ixu h = new ixu() { // from class: com.taobao.android.detail.ttdetail.c.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        {
            c.this = this;
        }

        @Override // tb.ixu
        public Rect a() {
            Activity activity;
            View findViewById;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Rect) ipChange.ipc$dispatch("ef387fb1", new Object[]{this});
            }
            if (!(c.a(c.this) instanceof Activity) || (findViewById = (activity = (Activity) c.a(c.this)).findViewById(R.id.tt_detail_cart_item)) == null) {
                return null;
            }
            int[] iArr = new int[2];
            findViewById.getLocationOnScreen(iArr);
            int i = iArr[0];
            int i2 = iArr[1];
            return new Rect(m.b(activity, i), m.b(activity, i2), m.b(activity, findViewById.getWidth() + i), m.b(activity, findViewById.getHeight() + i2));
        }
    };
    private c.g o = new c.g() { // from class: com.taobao.android.detail.ttdetail.c.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        {
            c.this = this;
        }

        @Override // com.taobao.android.sku.c.g
        public void a(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("20f12ca5", new Object[]{this, new Integer(i), str});
            } else {
                ae.a(i, str);
            }
        }
    };

    public static /* synthetic */ Context a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("c26cf91f", new Object[]{cVar}) : cVar.b;
    }

    public static /* synthetic */ JSONObject a(c cVar, String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("3adb0ae3", new Object[]{cVar, str, new Boolean(z)}) : cVar.a(str, z);
    }

    public static /* synthetic */ Map.Entry a(c cVar, List list, JSONArray jSONArray, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map.Entry) ipChange.ipc$dispatch("e4adc75b", new Object[]{cVar, list, jSONArray, new Boolean(z)}) : cVar.a(list, jSONArray, z);
    }

    public static /* synthetic */ boolean a(c cVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af4ab891", new Object[]{cVar, new Boolean(z)})).booleanValue();
        }
        cVar.k = z;
        return z;
    }

    public static /* synthetic */ JSONArray b(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONArray) ipChange.ipc$dispatch("f4dc0f56", new Object[]{cVar}) : cVar.h();
    }

    public static /* synthetic */ boolean c(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f974bcad", new Object[]{cVar})).booleanValue() : cVar.k;
    }

    public static /* synthetic */ eyx d(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (eyx) ipChange.ipc$dispatch("b1d81e18", new Object[]{cVar}) : cVar.c;
    }

    public static /* synthetic */ iyh e(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (iyh) ipChange.ipc$dispatch("a38393c3", new Object[]{cVar}) : cVar.f;
    }

    public static /* synthetic */ int i(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("58fd5522", new Object[]{cVar})).intValue();
        }
        int i = cVar.n + 1;
        cVar.n = i;
        return i;
    }

    static {
        kge.a(-537721513);
        f10514a = new ArrayList<String>() { // from class: com.taobao.android.detail.ttdetail.TBSkuWrapper$1
            {
                add("BUYNOW");
                add("ADDCART");
                add("CONFIRM");
                add("ADDCART_AND_BUYNOW");
            }
        };
    }

    public c(Context context, eyx eyxVar, String str) {
        this.b = context;
        this.c = eyxVar;
        this.e = eyxVar.e().a();
        this.m = str;
        i();
        this.f.a(a.KEY_PROP_PATH, new iyh.a() { // from class: com.taobao.android.detail.ttdetail.c.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                c.this = this;
            }

            @Override // tb.iyh.a
            public void a(String str2, String str3) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str2, str3});
                    return;
                }
                List a2 = str3 != null ? am.a(str3.split(";")) : null;
                c cVar = c.this;
                Map.Entry a3 = c.a(cVar, a2, c.b(cVar), c.c(c.this));
                if (a3 == null) {
                    c.d(c.this).e().a(a.KEY_PROP_PATH, str3);
                    return;
                }
                c.d(c.this).e().a(com.taobao.android.detail.core.aura.observer.d.KEY_PRICE_MODEL, a3.getKey());
                String str4 = (String) a3.getValue();
                if (StringUtils.isEmpty(str3) && StringUtils.isEmpty(str4)) {
                    str4 = str3;
                }
                c.d(c.this).e().a(a.KEY_PROP_PATH, str4);
            }
        });
        this.c.e().a(a.KEY_PROP_PATH, new tac() { // from class: com.taobao.android.detail.ttdetail.TBSkuWrapper$5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.tac
            public void a(Object obj, Object obj2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("184a7920", new Object[]{this, obj, obj2});
                    return;
                }
                String obj3 = obj2 == null ? null : obj2.toString();
                c.a(c.this, true);
                c.e(c.this).a(a.KEY_PROP_PATH, obj3);
                c.a(c.this, false);
            }
        });
    }

    private JSONArray h() {
        DetailAdjustModel detailAdjustModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("9d9ab6f", new Object[]{this});
        }
        pir pirVar = (pir) this.c.a().a(pkw.PARSER_ID);
        if (pirVar != null && k.d((Feature) pirVar.a(Feature.class)) && (detailAdjustModel = (DetailAdjustModel) pirVar.a(DetailAdjustModel.class)) != null) {
            return detailAdjustModel.getAdjustModel();
        }
        return null;
    }

    private boolean a(List<String> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c6e0ee7", new Object[]{this, list, str})).booleanValue();
        }
        if (list == null || list.isEmpty()) {
            return StringUtils.isEmpty(str);
        }
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : list) {
            sb.append(";");
            sb.append(str2);
        }
        return StringUtils.equals(str, sb.deleteCharAt(0).toString());
    }

    private Map.Entry<String, String> a(List<String> list, JSONArray jSONArray, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map.Entry) ipChange.ipc$dispatch("e0a3e2ba", new Object[]{this, list, jSONArray, new Boolean(z)});
        }
        if (jSONArray != null && !jSONArray.isEmpty()) {
            int size = jSONArray.size();
            for (int i = 0; i < size; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject != null) {
                    String string = jSONObject.getString(a.KEY_PROP_PATH);
                    if (StringUtils.isEmpty(string)) {
                        if (list == null || list.isEmpty()) {
                            return new AbstractMap.SimpleEntry(jSONObject.toJSONString(), string);
                        }
                    } else {
                        List<String> asList = Arrays.asList(string.split(";"));
                        if (z) {
                            if (a(list, asList)) {
                                return new AbstractMap.SimpleEntry(jSONObject.toJSONString(), string);
                            }
                        } else if (a(list, string)) {
                            return new AbstractMap.SimpleEntry(jSONObject.toJSONString(), string);
                        }
                    }
                }
            }
        }
        return null;
    }

    private boolean a(List<String> list, List<String> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("78fe44e", new Object[]{this, list, list2})).booleanValue();
        }
        boolean z = list == null || list.isEmpty();
        boolean z2 = list2 == null || list2.isEmpty();
        if (z && z2) {
            return true;
        }
        if (z || z2) {
            return false;
        }
        for (String str : list) {
            if (!b.a(str, list2)) {
                return false;
            }
        }
        return true;
    }

    public void a(com.taobao.android.detail.ttdetail.widget.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89aa800a", new Object[]{this, gVar});
        } else {
            this.l = gVar;
        }
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else {
            this.g = jSONObject;
        }
    }

    private iyh i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iyh) ipChange.ipc$dispatch("4c935dde", new Object[]{this});
        }
        if (this.f == null) {
            this.f = new iyh();
            TBXSkuCore tBXSkuCore = this.d;
            if (tBXSkuCore != null && !tBXSkuCore.d()) {
                this.d.b().a(this.f);
            }
        }
        return this.f;
    }

    public synchronized void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        if (this.d == null) {
            final long currentTimeMillis = System.currentTimeMillis();
            this.d = new TBXSkuCore(this.b, this.e);
            this.d.a(this.i);
            this.d.b().a(this.h);
            this.d.b().a(this.o);
            this.d.b().a(this.f);
            this.d.l(this.l.b());
            this.d.a(new jcv() { // from class: com.taobao.android.detail.ttdetail.TBSkuWrapper$6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.jcv
                public void a(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f3a64c32", new Object[]{this, str});
                    } else {
                        Toast.makeText(c.a(c.this), qqy.SKU_MSG_JS_CRASHED, 1).show();
                    }
                }
            });
            if (j.aj()) {
                long currentTimeMillis2 = System.currentTimeMillis();
                JSONObject e = com.taobao.android.sku.utils.g.e(this.g);
                iyf.a().a("transJsonInInitSku", "beforeMtop", currentTimeMillis2, System.currentTimeMillis(), null);
                this.d.a(e);
            } else {
                this.d.a(this.g != null ? JSON.toJSONString(this.g, SerializerFeature.DisableCircularReferenceDetect) : null);
            }
            this.d.c(new JSONObject() { // from class: com.taobao.android.detail.ttdetail.TBSkuWrapper$7
                {
                    put("skuTimeStamp", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.TBSkuWrapper$7.1
                        {
                            put(o.P_SKU_INIT, (Object) (currentTimeMillis + ""));
                        }
                    });
                }
            });
        }
    }

    private void m() {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        TBXSkuCore tBXSkuCore = this.d;
        if (tBXSkuCore == null) {
            return;
        }
        try {
            JSONObject jSONObject = tBXSkuCore.b().g().g().getJSONObject("skuTimeStamp");
            if (jSONObject == null) {
                return;
            }
            jSONObject.put(o.P_CART_BTN_CLICK, (Object) "");
            jSONObject.put(o.P_BUY_BTN_CLICK, (Object) "");
            jSONObject.put(o.P_SKUBAR_BTN_CLICK, (Object) "");
            ezv e = this.c.e();
            String str = (String) e.a("skuClickTimeType");
            String str2 = (String) e.a("skuClickTime");
            if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(str2)) {
                jSONObject.put(str, (Object) str2);
                if (this.g == null) {
                    z = true;
                }
                jSONObject.put("isMtopEmpty", (Object) Boolean.valueOf(z));
            }
            e.a("skuClickTimeType", "");
            e.a("skuClickTime", "");
        } catch (Throwable th) {
            i.a("TBSkuWrapper", "updateTimeData exception:", th);
        }
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        TBXSkuCore tBXSkuCore = this.d;
        return tBXSkuCore != null && !tBXSkuCore.d();
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        com.taobao.android.sku.weex.c.a(this.c.e().a());
        TBXSkuCore tBXSkuCore = this.d;
        if (tBXSkuCore == null) {
            return;
        }
        tBXSkuCore.c();
        this.d = null;
    }

    public void a(c.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6b1c7f8", new Object[]{this, eVar});
            return;
        }
        TBXSkuCore tBXSkuCore = this.d;
        if (tBXSkuCore == null) {
            return;
        }
        tBXSkuCore.b().a(eVar);
    }

    public void a(ixt ixtVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee928793", new Object[]{this, ixtVar});
            return;
        }
        this.i = ixtVar;
        TBXSkuCore tBXSkuCore = this.d;
        if (tBXSkuCore == null) {
            return;
        }
        tBXSkuCore.a(this.i);
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        TBXSkuCore tBXSkuCore = this.d;
        if (tBXSkuCore == null) {
            return;
        }
        tBXSkuCore.m(str);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        TBXSkuCore tBXSkuCore = this.d;
        if (tBXSkuCore == null) {
            return;
        }
        tBXSkuCore.i(str);
    }

    public synchronized void b(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d257bc1", new Object[]{this, str, new Boolean(z)});
            return;
        }
        if (this.d != null) {
            this.d.b(str, z);
        }
    }

    public synchronized void a(JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a79284c", new Object[]{this, jSONObject, new Boolean(z)});
            return;
        }
        if (this.d != null) {
            this.d.a(jSONObject, z);
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        TBXSkuCore tBXSkuCore = this.d;
        if (tBXSkuCore == null) {
            return;
        }
        tBXSkuCore.m();
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        TBXSkuCore tBXSkuCore = this.d;
        if (tBXSkuCore == null) {
            return;
        }
        tBXSkuCore.n();
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        TBXSkuCore tBXSkuCore = this.d;
        if (tBXSkuCore == null) {
            return;
        }
        tBXSkuCore.b().y();
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        TBXSkuCore tBXSkuCore = this.d;
        if (tBXSkuCore == null || tBXSkuCore.d()) {
            return;
        }
        this.d.d(str);
    }

    public boolean f() {
        JSONObject g;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue();
        }
        TBXSkuCore tBXSkuCore = this.d;
        if (tBXSkuCore == null || tBXSkuCore.d() || (g = this.d.b().g().g()) == null || (jSONObject = g.getJSONObject("id_biz_property")) == null) {
            return false;
        }
        jSONObject.remove("skuId");
        this.d.b(g);
        return true;
    }

    public void g() {
        iyh j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        TBXSkuCore tBXSkuCore = this.d;
        if (tBXSkuCore == null || tBXSkuCore.d() || (j = this.d.b().j()) == null) {
            return;
        }
        j.a();
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else {
            this.j = str;
        }
    }

    public static String a(String str, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c22dfcae", new Object[]{str, new Boolean(z), new Boolean(z2)});
        }
        if ("BUYNOW".equals(str) && !z && !z2) {
            return com.taobao.android.detail.ttdetail.handler.bizhandlers.f.EVENT_TYPE_ALTERNATIVE;
        }
        if ("ADDCART".equals(str) && !z) {
            return "add_cart";
        }
        return null;
    }

    private JSONObject a(final String str, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("27269002", new Object[]{this, str, new Boolean(z)});
        }
        if (!f10514a.contains(str)) {
            str = "ADDCART_AND_BUYNOW";
        }
        if (z) {
            str = "BUYNOW";
        }
        return new JSONObject() { // from class: com.taobao.android.detail.ttdetail.TBSkuWrapper$8
            {
                put("id_biz_bottom", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.TBSkuWrapper$8.1
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

    private String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6aaa74cf", new Object[]{this});
        }
        try {
            Long.parseLong(this.j);
        } catch (Exception unused) {
            this.j = "";
        }
        return this.j;
    }

    public void e(final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c6cb136", new Object[]{this, str});
            return;
        }
        TBXSkuCore tBXSkuCore = this.d;
        if (tBXSkuCore == null) {
            return;
        }
        tBXSkuCore.b(new JSONObject() { // from class: com.taobao.android.detail.ttdetail.TBSkuWrapper$9
            {
                putAll(c.a(c.this, str, false));
            }
        });
        this.d.i();
    }

    public void a(String str, String str2, String str3, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0bfeb4e", new Object[]{this, str, str2, str3, new Boolean(z)});
            return;
        }
        TBXSkuCore tBXSkuCore = this.d;
        if (tBXSkuCore == null || tBXSkuCore.d()) {
            return;
        }
        iyf.a().b("beforeWeexInitInShow", "afterMtop");
        this.d.b(new TBSkuWrapper$10(this, str, z, str2));
        m();
        if (!StringUtils.isEmpty(str3)) {
            this.d.g(str3);
        } else {
            this.d.e();
        }
        if (this.g != null) {
            return;
        }
        iyf.a().b("showToUpdate", "afterMtop");
    }

    public int l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6076ee6", new Object[]{this})).intValue() : this.n;
    }
}
