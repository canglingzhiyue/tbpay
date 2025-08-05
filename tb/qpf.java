package tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.alibaba.android.ultron.event.ext.o;
import com.alibaba.android.ultron.vfw.weex2.UltronWeex2DialogFragment;
import com.alibaba.android.ultron.vfw.weex2.f;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridInstanceRenderMode;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridStage;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.a;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.themis.TradeHybridTMSFragment;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.security.faceauth.api.AntDetector;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.UemAnalysis;
import com.taobao.android.autosize.l;
import com.taobao.android.order.bundle.TBFoldedOrderListActivity;
import com.taobao.android.order.bundle.base.parallelbiz.ParallelBizValueHelper;
import com.taobao.android.order.bundle.cache.a;
import com.taobao.android.order.bundle.constants.CoreConstants;
import com.taobao.android.order.bundle.constants.OrderType;
import com.taobao.android.order.bundle.constants.TabType;
import com.taobao.android.order.bundle.helper.g;
import com.taobao.android.order.constants.OrderBizCode;
import com.taobao.android.order.core.OrderConfigs;
import com.taobao.android.order.core.d;
import com.taobao.android.order.core.h;
import com.taobao.android.order.core.request.PageStatus;
import com.taobao.android.order.core.ui.viewpager.SimpleViewpager;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.weex_framework.p;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import mtopsdk.mtop.domain.MtopResponse;
import tb.bax;
import tb.cts;
import tb.hvu;
import tb.hvx;
import tb.hvy;
import tb.rhx;
import tb.xjy;

/* loaded from: classes6.dex */
public class qpf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_WAIT_PAY_LOADING = "showLoadingInWaitPay";
    private JSONObject A;
    private OrderConfigs C;
    private String D;
    private String E;
    private String F;
    private String G;
    private Bundle J;
    private UltronWeex2DialogFragment K;
    private TradeHybridTMSFragment L;

    /* renamed from: a  reason: collision with root package name */
    public String f33008a;
    public ria b;
    private Context c;
    private boolean d;
    private SimpleViewpager e;
    private String f;
    private jnr g;
    private LinearLayout h;
    private String i;
    private String j;
    private String k;
    private h l;
    private String o;
    private d p;
    private boolean q;
    private String r;
    private String t;
    private String u;
    private String w;
    private JSONObject x;
    private ViewGroup y;
    private UltronWeex2DialogFragment z;
    private JSONArray m = new JSONArray();
    private JSONObject n = new JSONObject();
    private String s = OrderType.ORDERLIST.getValue();
    private boolean H = false;
    private boolean I = false;
    private boolean B = true;
    private boolean v = false;

    static {
        kge.a(-1326566979);
    }

    public static /* synthetic */ UltronWeex2DialogFragment a(qpf qpfVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UltronWeex2DialogFragment) ipChange.ipc$dispatch("5309299f", new Object[]{qpfVar}) : qpfVar.z;
    }

    public qpf(Context context) {
        this.c = context;
    }

    public void a(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8033c25", new Object[]{this, intent});
            return;
        }
        if (intent != null) {
            this.s = intent.getStringExtra("orderType");
        }
        if (TextUtils.isEmpty(this.s)) {
            this.s = OrderType.ORDERLIST.getValue();
        }
        this.o = g.g(intent);
        this.i = g.a(intent, "searchKey");
        this.E = g.a(intent, g.QUERY_WORD);
        this.G = g.a(intent, "searchText");
        this.F = g.a(intent, "orderId");
        this.j = g.a(intent, g.WORD_TERM);
        this.k = g.a(intent, g.WORD_TYPE);
        this.f33008a = UemAnalysis.getTraceId();
        this.r = g.b(intent, CoreConstants.PRESETRES_KEY);
        this.t = g.b(intent, "condition");
        this.w = g.b(intent, CoreConstants.IN_PARAMS_PRESELL);
        this.u = g.h(intent);
        this.f = g.b(intent, CoreConstants.IN_PARAMS_DETAILCLICK);
        w();
        this.D = g.b(intent, "disputeListNewStyle");
        if (!OrderType.ORDERLIST.getValue().equals(this.s)) {
            return;
        }
        this.m = JSON.parseArray(CoreConstants.a());
        if (TabType.ALL.getValue().equals(this.o)) {
            return;
        }
        c(this.o);
    }

    private void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else if (this.m != null) {
            for (int i = 0; i < this.m.size(); i++) {
                Object obj = this.m.get(i);
                if (obj instanceof JSONObject) {
                    JSONObject jSONObject = (JSONObject) obj;
                    if (jSONObject.containsKey("tabCode") && jSONObject.getString("tabCode").equals(str)) {
                        jSONObject.put("isSelected", (Object) "true");
                        ((JSONObject) this.m.get(0)).put("isSelected", (Object) "false");
                        return;
                    }
                }
            }
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.v) {
        } else {
            this.A = a.a();
            if (this.A == null) {
                this.A = a.a(this.c, this.o, a.SCENE_FIRSTSCREEN);
            }
            if (this.A != null) {
                this.q = true;
            } else {
                this.n = hyj.b();
            }
            jpo.b(this.c).a(0, "hitCache", String.valueOf(this.q));
        }
    }

    private void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a2717e", new Object[]{this});
        } else {
            this.v = TextUtils.equals(this.o, "reFund");
        }
    }

    public void b(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15320a6", new Object[]{this, intent});
        } else {
            this.C = new OrderConfigs.a(this.c).a(OrderConfigs.BizNameType.ORDER_LIST).a(d(intent)).a(this.m).b(this.u).a(this.f33008a).c(true).a();
        }
    }

    public OrderConfigs c(Intent intent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (OrderConfigs) ipChange.ipc$dispatch("66024cbf", new Object[]{this, intent}) : new OrderConfigs.a(this.c).a(OrderConfigs.BizNameType.ORDER_LIST).a(d(intent)).a(this.h, this.e).a(this.m).a(this.f33008a).c(OrderType.ORDERLIST.getValue().equals(this.s)).a(this.p).a(this.g).b(this.u).c(this.i).a(this.v).a(this.y).a(this.z).b(this.K).a(this.b).b(this.q).d(this.c instanceof TBFoldedOrderListActivity).a();
    }

    private h d(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("35a9e52d", new Object[]{this, intent});
        }
        h hVar = this.l;
        if (hVar != null) {
            return hVar;
        }
        HashMap hashMap = new HashMap();
        if (jqm.a()) {
            g.a(hashMap, intent);
            hashMap.put(CoreConstants.USE_V2, "true");
        }
        if (TextUtils.isEmpty(this.t)) {
            this.x = x();
            hashMap.put("condition", this.x.toJSONString());
        } else {
            try {
                this.x = JSONObject.parseObject(this.t);
                if (bgd.a()) {
                    this.x.put("inner", (Object) "1");
                }
                hashMap.put("condition", this.x.toJSONString());
            } catch (JSONException e) {
                hyq.a("buildListRequestConfig", "PARSE-CONDITION_ERROR", e.toString());
            }
        }
        if ("true".equals(this.D)) {
            hashMap.put("forceBoughtlist4", "true");
        }
        hashMap.put("tabCode", this.o);
        hashMap.put("OrderType", this.s);
        hashMap.put("page", "1");
        hashMap.put("appName", hvo.b());
        if (jqm.a()) {
            g.a(hashMap, intent);
            hashMap.put(CoreConstants.USE_V2, "true");
        }
        hashMap.put("appVersion", hvo.c());
        hashMap.putAll(g.a(intent));
        h a2 = new h(this.c).a(hyk.b()).b("1.0").d("UNIT_TRADE").a(true).b(hyk.w()).c(hyk.y()).a(hashMap);
        this.l = a2;
        return a2;
    }

    private JSONObject x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("34b3781f", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(this.F) && TextUtils.equals(this.i, this.G)) {
            jSONObject.put("itemTitle", (Object) this.F);
            jSONObject.put("showText", (Object) this.i);
            jSONObject.put("scene", (Object) "repurchaseDiWen");
        } else if (!TextUtils.isEmpty(this.i)) {
            jSONObject.put("itemTitle", (Object) this.i);
            jSONObject.put("showText", (Object) this.i);
        }
        if (!TextUtils.isEmpty(this.j)) {
            jSONObject.put(g.WORD_TERM, (Object) this.j);
        }
        if (!TextUtils.isEmpty(this.k)) {
            jSONObject.put(g.WORD_TYPE, (Object) this.k);
        }
        if (!TextUtils.isEmpty(this.w)) {
            jSONObject.put(CoreConstants.IN_PARAMS_PRESELL, (Object) this.w);
        }
        if (bgd.a()) {
            jSONObject.put("inner", (Object) "1");
        }
        jSONObject.put("version", (Object) "1.0.0");
        bax.a a2 = bax.a();
        if (a2.f25741a == 3) {
            jSONObject.put("deviceLevel", (Object) "high");
        } else if (a2.f25741a == 2) {
            jSONObject.put("deviceLevel", (Object) "medium");
        } else if (a2.f25741a == 1) {
            jSONObject.put("deviceLevel", (Object) "low");
        } else {
            jSONObject.put("deviceLevel", (Object) "unknow");
        }
        return jSONObject;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        hzf hzfVar = new hzf(this.C);
        hzfVar.d(this.c);
        this.C.a(hzfVar);
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.d;
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        } else {
            this.c = context;
        }
    }

    public void a(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46606596", new Object[]{this, recyclerView});
            return;
        }
        final String str = this.o;
        if (TextUtils.isEmpty(str)) {
            jqg.a("OrderListViewModel", "prefetchImgList", "tabCode is empty");
            return;
        }
        final List<IDMComponent> b = b(recyclerView);
        if (b == null || b.isEmpty()) {
            jqg.a("OrderListViewModel", "prefetchImgList", "no components");
        } else {
            jqh.a(new Runnable() { // from class: tb.qpf.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    JSONObject jSONObject;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        ArrayList arrayList = new ArrayList();
                        int a2 = spk.a(iro.ORANGE_KEY_MY_TAOBAO, "prefetchOListImgCnt", 3);
                        for (IDMComponent iDMComponent : b) {
                            if (arrayList.size() >= a2) {
                                break;
                            } else if (iDMComponent != null && iDMComponent.getFields() != null && (jSONObject = iDMComponent.getFields().getJSONObject("item")) != null) {
                                String string = jSONObject.getString("pic");
                                if (!TextUtils.isEmpty(string)) {
                                    arrayList.add(string);
                                }
                            }
                        }
                        a.a(str, arrayList);
                    } catch (Throwable th) {
                        jqg.a("OrderListViewModel", "prefetchImgList", "error " + th.toString());
                    }
                }
            });
        }
    }

    public List<IDMComponent> b(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2c2a9950", new Object[]{this, recyclerView});
        }
        if (recyclerView == null || !(recyclerView.getAdapter() instanceof nkj) || !(((nkj) recyclerView.getAdapter()).c() instanceof bnn)) {
            jqg.a("OrderListViewModel", "getComponentsList", "invalid recyclerView");
            return null;
        }
        return ((bnn) ((nkj) recyclerView.getAdapter()).c()).a();
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }

    public SimpleViewpager d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (SimpleViewpager) ipChange.ipc$dispatch("79c7d97e", new Object[]{this}) : this.e;
    }

    public void a(SimpleViewpager simpleViewpager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c81c65b", new Object[]{this, simpleViewpager});
        } else {
            this.e = simpleViewpager;
        }
    }

    public jnr e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jnr) ipChange.ipc$dispatch("2dcd14ac", new Object[]{this}) : this.g;
    }

    public void a(jnr jnrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efb98c6a", new Object[]{this, jnrVar});
        } else {
            this.g = jnrVar;
        }
    }

    public LinearLayout f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinearLayout) ipChange.ipc$dispatch("db39ddc4", new Object[]{this}) : this.h;
    }

    public void a(LinearLayout linearLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("920f557f", new Object[]{this, linearLayout});
        } else {
            this.h = linearLayout;
        }
    }

    public String g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this}) : this.i;
    }

    public String z() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d3061ebf", new Object[]{this}) : this.E;
    }

    public h h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (h) ipChange.ipc$dispatch("3bff3074", new Object[]{this}) : this.l;
    }

    public JSONObject i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("dde1390", new Object[]{this}) : this.n;
    }

    public void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
        } else {
            this.n = jSONObject;
        }
    }

    public String j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("6aaa74cf", new Object[]{this}) : this.o;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.o = str;
        }
    }

    public d k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("76f6aa7b", new Object[]{this}) : this.p;
    }

    public void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5b39531", new Object[]{this, dVar});
        } else {
            this.p = dVar;
        }
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue() : this.q;
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.q = z;
        }
    }

    public String m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fe3ba4ac", new Object[]{this}) : this.r;
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.r = str;
        }
    }

    public String n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("84c15f4b", new Object[]{this}) : this.s;
    }

    public String o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b4719ea", new Object[]{this}) : this.u;
    }

    public boolean p() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[]{this})).booleanValue() : this.v;
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else {
            this.v = z;
        }
    }

    public JSONObject q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("ab1caf98", new Object[]{this}) : this.x;
    }

    public void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
        } else {
            this.x = jSONObject;
        }
    }

    public ViewGroup r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("8a52b5fc", new Object[]{this}) : this.y;
    }

    public void a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a1860a7", new Object[]{this, viewGroup});
        } else {
            this.y = viewGroup;
        }
    }

    public UltronWeex2DialogFragment s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UltronWeex2DialogFragment) ipChange.ipc$dispatch("b06ee856", new Object[]{this}) : this.z;
    }

    public void a(UltronWeex2DialogFragment ultronWeex2DialogFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a59ccde2", new Object[]{this, ultronWeex2DialogFragment});
        } else {
            this.z = ultronWeex2DialogFragment;
        }
    }

    public UltronWeex2DialogFragment E() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (UltronWeex2DialogFragment) ipChange.ipc$dispatch("94ab8f44", new Object[]{this}) : this.K;
    }

    public void b(UltronWeex2DialogFragment ultronWeex2DialogFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96ee5d63", new Object[]{this, ultronWeex2DialogFragment});
        } else {
            this.K = ultronWeex2DialogFragment;
        }
    }

    public TradeHybridTMSFragment F() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TradeHybridTMSFragment) ipChange.ipc$dispatch("796778a6", new Object[]{this}) : this.L;
    }

    public JSONObject t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("e6142a1b", new Object[]{this}) : this.A;
    }

    public void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c50c34c6", new Object[]{this, jSONObject});
        } else {
            this.A = jSONObject;
        }
    }

    public OrderConfigs u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (OrderConfigs) ipChange.ipc$dispatch("27d9ec4a", new Object[]{this}) : this.C;
    }

    public void a(ria riaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd12218e", new Object[]{this, riaVar});
        } else {
            this.b = riaVar;
        }
    }

    public String v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b8ef3443", new Object[]{this}) : this.f;
    }

    public boolean y() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6bea084", new Object[]{this})).booleanValue() : this.B;
    }

    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
        } else {
            this.B = z;
        }
    }

    public boolean A() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3a97c4c", new Object[]{this})).booleanValue() : this.H;
    }

    public boolean B() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3b793cd", new Object[]{this})).booleanValue() : this.I && !TextUtils.isEmpty(g());
    }

    public void a(org.json.JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686ec75a", new Object[]{this, jSONObject, jSONObject2});
            return;
        }
        if (jSONObject != null) {
            try {
                org.json.JSONObject optJSONObject = jSONObject.optJSONObject(AntDetector.EXT_KEY_AB_TEST);
                if (optJSONObject != null) {
                    this.H = TextUtils.equals("true", optJSONObject.optString("showSearchWeexInfoFlow"));
                    this.I = TextUtils.equals("true", optJSONObject.optString("showSearchNativeInfoFlow"));
                }
            } catch (Throwable unused) {
                return;
            }
        }
        if (jSONObject2 == null || (jSONObject3 = jSONObject2.getJSONObject(AntDetector.EXT_KEY_AB_TEST)) == null) {
            return;
        }
        this.H |= TextUtils.equals("true", jSONObject3.getString("showSearchWeexInfoFlow"));
        this.I = TextUtils.equals("true", jSONObject3.getString("showSearchNativeInfoFlow")) | this.I;
    }

    public void a(hzc hzcVar) {
        com.alibaba.android.ultron.vfw.instance.d d;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecf223a7", new Object[]{this, hzcVar});
        } else if ((hzcVar instanceof hzf) && (d = ((hzf) hzcVar).d()) != null) {
            try {
                List<IDMComponent> e = d.k().e();
                List asList = Arrays.asList(spk.a(iro.ORANGE_KEY_MY_TAOBAO, "headerComponents", "logisticsPick").split(","));
                for (IDMComponent iDMComponent : e) {
                    if (asList.contains(iDMComponent.getTag())) {
                        iDMComponent.getFields().put("status", (Object) null);
                        iDMComponent.getFields().put("visible", (Object) "false");
                        z = true;
                    }
                }
                if (!z) {
                    return;
                }
                d.a(e);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public String C() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ec4b0696", new Object[]{this}) : this.D;
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
        } else {
            this.D = str;
        }
    }

    public Bundle D() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bundle) ipChange.ipc$dispatch("6a0522cf", new Object[]{this}) : this.J;
    }

    public void a(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b668f6c", new Object[]{this, bundle});
        } else {
            this.J = bundle;
        }
    }

    public void a(com.taobao.android.order.core.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5b4f24e", new Object[]{this, gVar});
        } else if (gVar == null) {
        } else {
            gVar.a(hyg.SUBSCRIBER_ID, new hyg());
            gVar.a(hye.SUBSCRIBER_ID, new hye());
            gVar.a(hyf.SUBSCRIBER_ID, new hyf());
            gVar.a(mec.h(), new mec());
            gVar.a("refreshListItemAsync", new o.a(b(gVar), mec.h()));
            gVar.a(Long.valueOf((long) hwb.DX_PARSER_GET_FESTIVAL), new hwb());
            gVar.a(Long.valueOf((long) hwc.DX_PARSER_GET_STATUS_BAR_HEIGHT), new hwc());
            gVar.a(Long.valueOf((long) hwd.DX_PARSER_GETVIEWCONTAINERSTORAGE), new hwd());
            gVar.a(Long.valueOf((long) hwf.DXNAVIBARMOREVIEW_NAVIBARMOREVIEW), new hwf());
            gVar.a(hvx.VIEWCONTAINERSTORAGEREMOVE, new hvx.a());
            gVar.a(hvy.VIEWCONTAINERSTORAGESET, new hvy.a());
            gVar.a(hvu.ULTRONBUYNOW, new hvu.a());
            gVar.a(xjy.TRADEONSTAGE, new xjy.a());
            gVar.a(rhx.REFRESHLISTBYORDERIDS, new rhx.a());
            gVar.a("viewContainerStorageSet", new hvy.a());
            gVar.a("ultronAlipayBindV2", new o.a(b(gVar), hyf.SUBSCRIBER_ID));
            gVar.a("ultronReallyPayV2", new o.a(b(gVar), hyg.SUBSCRIBER_ID));
            gVar.a("ultronAliPayV2", new o.a(b(gVar), hye.SUBSCRIBER_ID));
        }
    }

    public com.alibaba.android.ultron.vfw.instance.d b(com.taobao.android.order.core.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.android.ultron.vfw.instance.d) ipChange.ipc$dispatch("8dc4a9d2", new Object[]{this, gVar});
        }
        hzc e = gVar.e();
        if (!(e instanceof bwv)) {
            throw new IllegalStateException("ContainerProxy必须实现IDetailProxy");
        }
        return ((bwv) e).d();
    }

    public void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40c20cf", new Object[]{this});
        } else if (!iro.b("waitPay", "")) {
            jqg.a("OrderListViewModel", "destroyPaysuccessInstance:", "switcher is off");
        } else {
            com.alibaba.android.ultron.vfw.weex2.highPerformance.management.a.a().a(UltronTradeHybridStage.ON_CONTAINER_DESTROY, "waitPay", null);
        }
    }

    public void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41a3850", new Object[]{this});
        } else if (!spk.a(iro.ORANGE_KEY_HYBRID_CONTAINER, "enableOListRegisterWeexModule", true)) {
        } else {
            jqh.a(new Runnable() { // from class: tb.qpf.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    jqg.a("OrderListViewModel", "registerWeexModule:", "try register weexModule again!");
                    adh.a();
                }
            });
        }
    }

    public void a(Context context, MtopResponse mtopResponse, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3795cb6b", new Object[]{this, context, mtopResponse, jSONObject});
            return;
        }
        try {
            if (context == null) {
                jqg.a("OrderListViewModel", "initOrderDetailByPreRender", "context is null");
            } else if (!b(context)) {
            } else {
                String a2 = a(mtopResponse, (JSONObject) null);
                if (TextUtils.isEmpty(a2)) {
                    jqg.a("OrderListViewModel", "initOrderDetailByPreRender", "preRenderUrl is empty");
                } else {
                    a(context, a2, jSONObject);
                }
            }
        } catch (Exception e) {
            jqg.a(OrderBizCode.orderList, "initOrderDetailByPreRender", e.toString());
        }
    }

    public void a(Context context, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adb9ea60", new Object[]{this, context, jSONObject, jSONObject2});
            return;
        }
        try {
            if (context == null) {
                jqg.a("OrderListViewModel", "initOrderDetailByLocalPreRender", "context is null");
            } else if (!b(context)) {
            } else {
                String a2 = a((MtopResponse) null, jSONObject);
                if (TextUtils.isEmpty(a2)) {
                    jqg.a("OrderListViewModel", "initOrderDetailByLocalPreRender", "preRenderUrl is empty");
                } else {
                    a(context, a2, jSONObject2);
                }
            }
        } catch (Exception e) {
            jqg.a(OrderBizCode.orderList, "initOrderDetailByLocalPreRender", e.toString());
        }
    }

    private boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{this, context})).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 19 && l.d(context) && spk.a(iro.ORANGE_KEY_ORDER_DETAIL, "interceptFoldDevicePreRender", true)) {
            jqg.a("OrderListViewModel", "isOrderDetailContainerValid", "isFoldDevice");
            return false;
        }
        UltronWeex2DialogFragment ultronWeex2DialogFragment = this.z;
        if (ultronWeex2DialogFragment == null) {
            jqg.a("OrderListViewModel", "isOrderDetailContainerValid", "mUltronWeex2DialogFragment is null");
            return false;
        } else if (!ultronWeex2DialogFragment.hasFragmentDisplay()) {
            return true;
        } else {
            jqg.a("OrderListViewModel", "isOrderDetailContainerValid", "mUltronWeex2DialogFragment hasFragmentDisplay");
            return false;
        }
    }

    private String a(MtopResponse mtopResponse, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3a2b809d", new Object[]{this, mtopResponse, jSONObject});
        }
        try {
        } catch (Throwable th) {
            jqg.a("OrderListViewModel", "getOrderDetailPreRenderUrl", "onError: " + th.toString());
        }
        if (mtopResponse == null) {
            if (jSONObject != null) {
                if (jSONObject.getJSONObject("global") != null && jSONObject.getJSONObject("global").getJSONObject("preload") != null) {
                    return jSONObject.getJSONObject("global").getJSONObject("preload").getString("url");
                }
                jqg.a("OrderListViewModel", "getOrderDetailPreRenderUrl", "preload is invalid");
                return "";
            }
            return "";
        } else if (mtopResponse.getDataJsonObject() == null) {
            jqg.a("OrderListViewModel", "getOrderDetailPreRenderUrl", "response is invalid");
            return "";
        } else {
            org.json.JSONObject dataJsonObject = mtopResponse.getDataJsonObject();
            if (dataJsonObject.getJSONObject("global") != null && dataJsonObject.getJSONObject("global").getJSONObject("preload") != null) {
                return dataJsonObject.getJSONObject("global").getJSONObject("preload").getString("url");
            }
            jqg.a("OrderListViewModel", "getOrderDetailPreRenderUrl", "preload is invalid");
            return "";
        }
    }

    private void a(Context context, String str, final JSONObject jSONObject) {
        int a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("564cf206", new Object[]{this, context, str, jSONObject});
        } else if (ibl.y()) {
            Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            buildUpon.appendQueryParameter(cts.a.QUERY_ASYNC_CREATE_INSTANCE, "true");
            final String builder = buildUpon.toString();
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            int i = displayMetrics.widthPixels;
            int i2 = displayMetrics.heightPixels;
            if (spk.a(iro.ORANGE_KEY_HYBRID_CONTAINER, "useRealDisplayHeight", true) && (a2 = adh.a(context)) > 0) {
                i2 = a2;
            }
            f.a().a(context, i, i2, new a.C0105a().a(ParallelBizValueHelper.a(ParallelBizValueHelper.PageType.order_detail)).g(iro.b() ? UltronTradeHybridInstanceRenderMode.SURFACE : UltronTradeHybridInstanceRenderMode.TEXTURE).b(builder).a(), (CopyOnWriteArrayList<Pair<com.alibaba.android.ultron.vfw.weex2.highPerformance.model.a, Object>>) null, new f.a() { // from class: tb.qpf.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alibaba.android.ultron.vfw.weex2.f.a
                public void a(String str2, p pVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("84edcb9b", new Object[]{this, str2, pVar});
                    } else if (TextUtils.isEmpty(str2) || pVar == null) {
                        jqg.a("OrderListViewModel", "onInstanceCreatedInMain", "callback is invalid");
                    } else if (qpf.a(qpf.this) == null) {
                    } else {
                        qpf.a(qpf.this).setWeex2InstanceByPreRender(pVar);
                        qpf.a(qpf.this).setWeex2Url(builder);
                        qpf.a(qpf.this).sendEarlyMessageToWeex2(jSONObject);
                    }
                }
            });
        } else {
            this.z.setWeex2InstanceByPreRender(ibn.a(context, ParallelBizValueHelper.a(ParallelBizValueHelper.PageType.order_detail), str));
            this.z.setWeex2Url(str);
        }
    }

    public JSONObject c(RecyclerView recyclerView) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("99d035b8", new Object[]{this, recyclerView});
        }
        List<IDMComponent> b = b(recyclerView);
        if (b == null || b.isEmpty()) {
            jqg.a("OrderListViewModel", "getOrderDetailQueryParams", "no components");
            return null;
        }
        int a2 = spk.a(iro.ORANGE_KEY_ORDER_DETAIL, "odetailQueryParamsCount", 3);
        try {
            JSONObject jSONObject3 = new JSONObject();
            int i = 0;
            for (IDMComponent iDMComponent : b) {
                if (i < a2 && iDMComponent != null && TextUtils.equals(iDMComponent.getTag(), "item") && (jSONObject2 = (jSONObject = iDMComponent.getData().getJSONObject("fields")).getJSONObject("queryParams")) != null) {
                    String string = jSONObject.getJSONObject("basicInfo").getString("orderId");
                    if (!TextUtils.isEmpty(string)) {
                        String string2 = jSONObject.getJSONObject("basicInfo").getString("orderLineId");
                        if (!TextUtils.isEmpty(string2)) {
                            jSONObject3.put(string + "_" + string2, (Object) jSONObject2);
                            i++;
                        }
                    }
                }
            }
            if (!jSONObject3.isEmpty()) {
                return jSONObject3;
            }
            jqg.a("OrderListViewModel", "getOrderDetailQueryParams", "orderDetailMsg is empty");
            return null;
        } catch (Throwable th) {
            jqg.a("OrderListViewModel", "getOrderDetailQueryParams", "error " + th.toString());
            return null;
        }
    }

    public void a(Context context, PageStatus pageStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69db5472", new Object[]{this, context, pageStatus});
        } else if (context == null) {
            jqg.a("OrderListViewModel", "preRenderLogisticsDetail:", "context is null");
        } else if (!PageStatus.FIRST_PAGE.equals(pageStatus)) {
            jqg.a("OrderListViewModel", "preRenderLogisticsDetail:", "not first page");
        } else if (!iro.b(alz.BizKeyOrderList, cts.a.BIZ_LOGISTICS)) {
            jqg.a("OrderListViewModel", "preRenderLogisticsDetail:", "switcher is off");
        } else if (ibl.z() && c(context)) {
            a(context, cts.a.PRE_RENDER_URL_LOGISTICS);
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("context", (Object) context);
            com.alibaba.android.ultron.vfw.weex2.highPerformance.management.a.a().a(UltronTradeHybridStage.ON_CONTAINER_RESUME, alz.BizKeyOrderList, jSONObject);
        }
    }

    private boolean c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f76bba2", new Object[]{this, context})).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 19 && l.d(context)) {
            jqg.a("OrderListViewModel", "isLogisticsDetailContainerValid", "isFoldDevice");
            return false;
        }
        UltronWeex2DialogFragment ultronWeex2DialogFragment = this.K;
        if (ultronWeex2DialogFragment == null) {
            jqg.a("OrderListViewModel", "isLogisticsDetailContainerValid", "mLogisticsWeex2Fragment is null");
            return false;
        } else if (!ultronWeex2DialogFragment.hasFragmentDisplay()) {
            return true;
        } else {
            jqg.a("OrderListViewModel", "isLogisticsDetailContainerValid", "mLogisticsWeex2Fragment hasFragmentDisplay");
            return false;
        }
    }

    private void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b6362a", new Object[]{this, context, str});
        } else if (this.K == null) {
            jqg.a("OrderListViewModel", "createLogisticsDetailContainer", "mLogisticsWeex2Fragment is null");
        } else {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            this.K.setWeex2InstanceByPreRender(f.a().a(context, ParallelBizValueHelper.a(ParallelBizValueHelper.PageType.logistics_detail), str, displayMetrics.widthPixels, displayMetrics.heightPixels));
            this.K.setWeex2Url(str);
        }
    }

    public void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fe094e", new Object[]{this});
        } else if (!iro.c()) {
            jqg.a("OrderListViewModel", "initRefundDetailTMSContainer", "switcher is off");
        } else {
            Bundle bundle = new Bundle();
            bundle.putInt(TradeHybridTMSFragment.TMS_CONTAINER_RES_ID, R.id.orderLisTMSFragmentContainer);
            bundle.putString(TradeHybridTMSFragment.TMS_BIZ_NAME, cts.a.BIZ_REFUND_DETAIL);
            bundle.putString(TradeHybridTMSFragment.TMS_SCENE_NAME, "refundList");
            this.L = TradeHybridTMSFragment.initTMSContainer(bundle);
        }
    }

    public void a(TradeHybridTMSFragment.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d837067", new Object[]{this, bVar});
            return;
        }
        TradeHybridTMSFragment tradeHybridTMSFragment = this.L;
        if (tradeHybridTMSFragment == null) {
            jqg.a("OrderListViewModel", "processTMSContainerLifecycle", "mTradeHybridTMSFragment is null");
        } else {
            tradeHybridTMSFragment.processLifecycleByHost(bVar);
        }
    }

    public boolean a(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c8bb1508", new Object[]{this, activity, str})).booleanValue();
        }
        if (!(activity instanceof FragmentActivity)) {
            jqg.a("OrderListViewModel", "displayRefundDetailTMSContainer", "activity is not FragmentActivity");
            return false;
        } else if (TextUtils.isEmpty(str)) {
            jqg.a("OrderListViewModel", "displayRefundDetailTMSContainer", "invalid pageUrl");
            return false;
        } else {
            TradeHybridTMSFragment tradeHybridTMSFragment = this.L;
            if (tradeHybridTMSFragment == null) {
                jqg.a("OrderListViewModel", "displayRefundDetailTMSContainer", "mTradeHybridTMSFragment is null");
                return false;
            }
            return tradeHybridTMSFragment.displayByTMSHost(activity, str);
        }
    }
}
