package com.taobao.android.detail2.core.framework.data.model;

import android.graphics.Color;
import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.base.weex.g;
import com.taobao.android.detail2.core.framework.data.global.NewDetailScreenConfig;
import com.taobao.android.detail2.core.framework.view.navbar.AtmosParams;
import com.taobao.android.detail2.core.framework.view.navbar.l;
import com.taobao.android.detail2.core.framework.view.navbar.n;
import com.ut.share.utils.Constants;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import tb.fjk;
import tb.fjp;
import tb.fjt;
import tb.fkr;
import tb.fkt;
import tb.fmc;
import tb.ipa;
import tb.kge;
import tb.lnr;

/* loaded from: classes5.dex */
public abstract class d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_CONTEXT_DATA_HALF_HEIGHT = "halfHeight";
    public static final String KEY_CONTEXT_DATA_SCREEN_HEIGHT = "screenHeight";
    public static final String KEY_ENABLE_LEFT_SCROLL_TO_SECOND_PAGE = "enable_native_slide";
    public static final String KEY_GUIDE_TPP_ERROR = "guideTppError";
    public static final String KEY_GUIDE_TPP_ERROR_OPEN_IMMEDIATELY = "guideTppErrorOpenImmediately";
    public static final String KEY_ND_OPEN_TYPE = "ndOpenType";
    public static final String KEY_NEW_CARD_DATA = "newCardData";
    public static final String KEY_NEW_DETAIL_VISIBLE_BLOCK_HEIGHT = "screenHeight";
    public static final String KEY_NEW_DETAIL_VISIBLE_BLOCK_RATIO = "screenRadio";
    public static final String KEY_NEW_DETAIL_VISIBLE_BLOCK_WIDTH = "screenWidth";
    public static final String KEY_OPEN_IMMEDIATELY_DATA = "openImmediatelyData";
    public static final String OPEN_TYPE_MVP = "mvp";
    public boolean F;
    public fkr G;
    public JSONObject H;
    public JSONObject I;
    public JSONObject J;
    public JSONObject K;
    public JSONArray L;
    public JSONObject M;
    public JSONArray N;
    public String O;
    public int P;
    public JSONArray Q;
    public JSONObject T;
    public boolean U;
    public String W;
    public JSONObject X;
    public com.taobao.android.detail2.core.framework.data.model.a Y;
    public String Z;

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f11523a;
    private JSONObject ab;
    private JSONObject ac;
    private JSONObject ad;
    private JSONObject ae;
    public String af;
    private HashMap<String, String> b;
    private CardUTArgs e;
    public int f;
    public String g;
    public String h;
    public JSONObject i;
    public JSONObject j;
    public String k;
    public JSONObject l;
    public JSONObject m;
    public JSONObject p;
    public JSONObject q;
    public JSONObject r;
    public CardInnerCommonNode s;
    public JSONObject t;
    public String n = "";
    public String o = "";
    public boolean u = false;
    public boolean v = false;
    public boolean ag = false;
    public boolean ah = false;
    public List<a> w = new ArrayList();
    public HashMap<String, String> x = new HashMap<>();
    public boolean y = false;
    public boolean z = false;
    public boolean ai = false;
    public List<String> A = new ArrayList();
    public boolean B = false;
    public boolean C = false;
    public boolean D = false;
    public boolean E = false;
    private boolean c = true;
    public List<l> R = new ArrayList();
    public List<n> S = new ArrayList();
    private boolean d = false;
    private JSONObject aa = new JSONObject();
    private long V = -1;

    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f11524a;
        public String b;
        public boolean c;

        static {
            kge.a(1403873725);
        }
    }

    static {
        kge.a(-944831114);
    }

    public abstract CardInnerCommonNode a();

    public abstract void a(JSONObject jSONObject);

    public void a(CardInnerCommonNode cardInnerCommonNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3194970f", new Object[]{this, cardInnerCommonNode});
        }
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        }
    }

    public d(fkr fkrVar) {
        this.G = fkrVar;
        b();
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            a(KEY_ENABLE_LEFT_SCROLL_TO_SECOND_PAGE, (Object) true);
        }
    }

    public boolean q() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("64de47c", new Object[]{this})).booleanValue() : this.p != null;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        this.W = str;
        fjp.a(this, fjp.BIZ_CONTEXT_KEY_RECOMMEND_TRACE_ID, str);
    }

    public boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65bfbfd", new Object[]{this})).booleanValue();
        }
        boolean z = this.d;
        this.d = false;
        return z;
    }

    public void a(JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a79284c", new Object[]{this, jSONObject, new Boolean(z)});
            return;
        }
        a(jSONObject, z, false, false);
        JSONObject jSONObject2 = this.j;
        if (jSONObject2 == null) {
            return;
        }
        jSONObject2.put(KEY_GUIDE_TPP_ERROR_OPEN_IMMEDIATELY, (Object) "true");
    }

    public void a(JSONObject jSONObject, boolean z, boolean z2, boolean z3) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90e69fcc", new Object[]{this, jSONObject, new Boolean(z), new Boolean(z2), new Boolean(z3)});
        } else if (jSONObject == null) {
        } else {
            this.ah = z3;
            String str = this.g;
            if (str != null && !str.equals(jSONObject.getString("type"))) {
                this.d = true;
            }
            this.i = jSONObject;
            this.g = jSONObject.getString("type");
            this.h = jSONObject.getString("subType");
            this.k = jSONObject.getString("nid");
            this.af = jSONObject.getString("complexId");
            this.l = jSONObject.getJSONObject("args");
            this.m = jSONObject.getJSONObject("ext");
            this.U = "y".equals(jSONObject.getString("cardFixed"));
            JSONObject jSONObject3 = this.l;
            if (jSONObject3 != null) {
                this.n = jSONObject3.getString("scm");
                this.l.remove("scm");
            }
            this.q = jSONObject.getJSONObject("extraData");
            this.r = jSONObject.getJSONObject("exportData");
            i(jSONObject);
            JSONObject jSONObject4 = this.q;
            if (jSONObject4 != null && (jSONObject2 = this.p) != null) {
                jSONObject2.put("rcmdExtraData", (Object) jSONObject4);
            }
            this.X = jSONObject.getJSONObject("cardUTArgs");
            this.e = new CardUTArgs(this.X);
            this.ae = jSONObject.getJSONObject("preloadResources");
            if (z) {
                h(jSONObject);
            } else {
                g(jSONObject);
            }
            c();
            a(jSONObject, z2, z3);
            JSONObject jSONObject5 = this.p;
            this.j = jSONObject5;
            j(jSONObject5);
            a(this.p);
            this.s = a();
        }
    }

    private void a(JSONObject jSONObject, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ac9408", new Object[]{this, jSONObject, new Boolean(z), new Boolean(z2)});
            return;
        }
        a(C().k().t);
        this.aa.put("optimizeConfig", (Object) this.G.r().f(C().k().W));
        this.aa.put("simpleDeliverData", (Object) this.G.s());
        if (z2) {
            this.aa.put("navOpenImmediatelyData", (Object) Boolean.valueOf(z2));
        }
        if (C().b().af()) {
            String y = C().y();
            String ag = C().b().ag();
            if (!StringUtils.isEmpty(ag)) {
                y = ag;
            }
            fjt.a(fjt.TAG_INSIDE_DETAIL, "initDetailListener processContextData = sourceToken。" + y);
            this.aa.put("feedToken", (Object) C().y());
        }
        if (z) {
            fjt.a(fjt.TAG_FAST_ANIM, "processContextData isSlowWeexBg");
            this.aa.put("slowAnimWeexBg", (Object) "true");
            this.aa.put("slowAnimWeexBgTime", (Object) fkt.aq());
        }
        if (ipa.q() || ipa.s()) {
            this.aa.put("ndWeexLowerSwitch", (Object) this.G.ai());
        }
        this.p.put("context", (Object) this.aa);
        this.aa.put("queryPassExpParam", (Object) C().T());
        JSONObject jSONObject2 = jSONObject.getJSONObject("context");
        if (jSONObject2 == null) {
            return;
        }
        this.aa.putAll(jSONObject2);
        this.ac = jSONObject2.getJSONObject("cardPassExpParam");
        this.ad = jSONObject2.getJSONObject("preloadPassParams");
    }

    public JSONObject s() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("d26c569a", new Object[]{this}) : this.ad;
    }

    public void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
            return;
        }
        this.ab = jSONObject;
        this.aa.put("pagePassExpParam", (Object) this.ab);
    }

    private void c() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        JSONObject jSONObject2 = this.i;
        if (jSONObject2 != null && (jSONObject = jSONObject2.getJSONObject(AtmosParams.KEY_ATMOS_FEED_PARAMS)) != null) {
            C().c(jSONObject);
        }
        t();
    }

    public void t() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6782afb", new Object[]{this});
        } else if (C().G() == null || (jSONObject = this.p) == null) {
        } else {
            jSONObject.putAll(C().G().mRootData);
        }
    }

    private void g(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a56a742", new Object[]{this, jSONObject});
            return;
        }
        fjt.a(fjt.TAG_RENDER, this + "processNewCardData");
        JSONObject jSONObject3 = jSONObject.getJSONObject("newCard");
        if (this.p == null || jSONObject3 == null) {
            fjt.a(fjt.TAG_RENDER, this + "processNewCardData newCardData == null");
            return;
        }
        JSONObject jSONObject4 = jSONObject3.getJSONObject("placeHolderComponent");
        if (jSONObject4 != null) {
            this.Y = new com.taobao.android.detail2.core.framework.data.model.a(jSONObject4);
            this.u = true;
        }
        JSONObject jSONObject5 = jSONObject3.getJSONObject("data");
        if (jSONObject5 == null || (jSONObject2 = jSONObject5.getJSONObject("mainPic")) == null) {
            return;
        }
        this.p.put(KEY_NEW_CARD_DATA, (Object) jSONObject2);
    }

    private void h(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aba943e1", new Object[]{this, jSONObject});
            return;
        }
        fjt.a(fjt.TAG_RENDER, this + "processMVPCardData");
        if (jSONObject == null || this.p == null) {
            return;
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("newCard");
        if (jSONObject3 == null) {
            fjt.a(fjt.TAG_RENDER, this + "processMVPCardData newCardData == null");
            return;
        }
        JSONObject jSONObject4 = (JSONObject) jSONObject3.clone();
        JSONObject jSONObject5 = jSONObject4.getJSONObject("placeHolderComponent");
        if (jSONObject5 != null) {
            this.Y = new com.taobao.android.detail2.core.framework.data.model.a(jSONObject5);
            this.u = true;
        }
        JSONObject jSONObject6 = jSONObject4.getJSONObject("data");
        if (jSONObject6 == null || (jSONObject2 = jSONObject6.getJSONObject("mainPic")) == null) {
            return;
        }
        f(jSONObject2);
        this.p.put(KEY_NEW_CARD_DATA, (Object) jSONObject2);
        this.p.put(KEY_ND_OPEN_TYPE, (Object) OPEN_TYPE_MVP);
    }

    private void f(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONArray jSONArray;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9040aa3", new Object[]{this, jSONObject});
            return;
        }
        JSONObject jSONObject5 = jSONObject.getJSONObject("page");
        if (jSONObject5 == null || (jSONObject2 = jSONObject5.getJSONObject("hierarchy")) == null || (jSONArray = jSONObject2.getJSONArray("root")) == null || jSONArray.isEmpty() || (jSONObject3 = jSONObject5.getJSONObject("container")) == null) {
            return;
        }
        for (int i = 0; i < jSONArray.size(); i++) {
            JSONObject jSONObject6 = jSONArray.getJSONObject(i);
            if (jSONObject6 != null && !jSONObject6.isEmpty() && (jSONObject4 = jSONObject3.getJSONObject(jSONObject6.getString("name"))) != null && "app_weex".equals(jSONObject4.getString("mode"))) {
                jSONObject2.put("root", (Object) jSONObject6.getJSONArray("children"));
            }
        }
    }

    private void i(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfbe080", new Object[]{this, jSONObject});
        } else {
            this.p = jSONObject.getJSONObject("detailInfo");
        }
    }

    private void c(JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc7b16ce", new Object[]{this, jSONObject, new Boolean(z)});
        } else if (jSONObject == null) {
            if (!C().A()) {
                return;
            }
            fjp.b(this, fjp.SCENE_OPEN_IMMEDIATELY, fjp.ERROR_CODE_OPEN_IMMEDIATELY_DATA_EMPTY, "", false);
        } else {
            this.t = new JSONObject();
            this.t.put(KEY_OPEN_IMMEDIATELY_DATA, (Object) jSONObject);
            this.t.put(KEY_GUIDE_TPP_ERROR, (Object) String.valueOf(z));
            this.j = this.t;
        }
    }

    public void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c50c34c6", new Object[]{this, jSONObject});
            return;
        }
        this.f11523a = jSONObject;
        JSONObject jSONObject2 = this.f11523a;
        if (jSONObject2 == null) {
            return;
        }
        this.o = jSONObject2.getString("scm");
        this.f11523a.remove("scm");
    }

    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686427c", new Object[]{this});
        } else {
            this.f11523a = null;
        }
    }

    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69459fd", new Object[]{this});
        } else {
            this.b = null;
        }
    }

    public HashMap<String, String> w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("1ebf8361", new Object[]{this}) : this.b;
    }

    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        HashMap<String, String> hashMap = this.b;
        if (hashMap == null) {
            hashMap = new HashMap<>();
            this.b = hashMap;
        }
        hashMap.put(str, str2);
    }

    public JSONObject x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("34b3781f", new Object[]{this});
        }
        JSONObject jSONObject = this.f11523a;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObject2 = this.l;
        return jSONObject2 == null ? new JSONObject() : jSONObject2;
    }

    public String y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4c806420", new Object[]{this});
        }
        if (!StringUtils.isEmpty(this.o)) {
            return this.o;
        }
        return this.n;
    }

    public boolean z() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6ccb805", new Object[]{this})).booleanValue() : this.u;
    }

    public void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a97c48", new Object[]{this});
        } else {
            this.v = true;
        }
    }

    public void Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fbb060", new Object[]{this});
        } else {
            this.ag = true;
        }
    }

    public boolean B() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3b793cd", new Object[]{this})).booleanValue() : this.v;
    }

    public fkr C() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (fkr) ipChange.ipc$dispatch("2833414f", new Object[]{this}) : this.G;
    }

    public void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d3c2cb", new Object[]{this});
            return;
        }
        this.j = null;
        this.p = null;
        this.s = null;
        k();
    }

    private void j(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e4e7d1f", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
        } else {
            this.H = jSONObject.getJSONObject("biz");
            this.J = jSONObject.getJSONObject("view");
            JSONObject jSONObject2 = this.J;
            if (jSONObject2 != null) {
                this.I = jSONObject2.getJSONObject("naviBar");
                this.K = this.J.getJSONObject(fjp.SCENE_MAIN_PAGE_FLOAT);
                this.M = this.J.getJSONObject("mainPic");
            }
            JSONObject jSONObject3 = this.M;
            if (jSONObject3 != null) {
                this.N = jSONObject3.getJSONArray("cardInfos");
            }
            JSONObject jSONObject4 = this.K;
            if (jSONObject4 != null) {
                this.L = jSONObject4.getJSONArray("cardInfos");
            }
            JSONObject jSONObject5 = this.I;
            if (jSONObject5 == null) {
                return;
            }
            k(jSONObject5);
        }
    }

    private void k(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfa119be", new Object[]{this, jSONObject});
        } else if (jSONObject != null) {
            this.P = l(jSONObject);
            this.Q = jSONObject.getJSONArray("rightBtnList");
            if (this.Q == null) {
                this.Q = d();
            }
            this.R.clear();
            for (int i = 0; i < this.Q.size(); i++) {
                this.R.add(new l(this.Q.getJSONObject(i), this.P, this));
            }
            if ("light".equals(jSONObject.getString("statusBarStyle"))) {
                this.c = false;
            } else {
                this.c = true;
            }
        }
    }

    public boolean E() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3e1da50", new Object[]{this})).booleanValue() : this.c;
    }

    private int l(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("30f3b650", new Object[]{this, jSONObject})).intValue();
        }
        AtmosParams G = this.G.G();
        if (G != null && G.showAtmos && !StringUtils.isEmpty(G.atmosColor)) {
            try {
                return Color.parseColor(G.atmosColor);
            } catch (Exception e) {
                String str = "atmosColor解析错误，nid:" + this.G.f() + ", colorStr: " + G.atmosColor;
                fjt.a("new_detail异常", str, e);
                fjp.a(fjp.SCENE_ENTRANCE_ATMOS, fjp.ERROR_CODE_ATMOS_COLOR_PARSE_ERROR, str, C().T());
            }
        }
        this.O = jSONObject.getString("naviBarColor");
        if (StringUtils.isEmpty(this.O)) {
            return -16777216;
        }
        try {
            return Color.parseColor(this.O);
        } catch (Exception e2) {
            fjt.a("new_detail异常", "naviBarColor解析错误", e2);
            return -16777216;
        }
    }

    private JSONArray d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("38dcc9f3", new Object[]{this});
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.add(JSON.parseObject("{\"btnType\":\"normal\",\"fields\":{\"iconFont\":\"\\ua04a\",\"url\":\"https://h5.m.taobao.com/awp/base/cart.htm?cartfrom=detail\",\"urlParams\":{}}}"));
        jSONArray.add(JSON.parseObject("{\"btnType\":\"more\",\"fields\":{\"iconFont\":\"\\ua06d\",\"showShare\":\"false\"}}"));
        return jSONArray;
    }

    public CardInnerCommonNode a(CardInnerCommonNode cardInnerCommonNode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CardInnerCommonNode) ipChange.ipc$dispatch("ddc49ec4", new Object[]{this, cardInnerCommonNode, str});
        }
        if (cardInnerCommonNode == null) {
            cardInnerCommonNode = new CardInnerCommonNode(null);
        }
        c(cardInnerCommonNode);
        if (cardInnerCommonNode.containerInfo == null) {
            cardInnerCommonNode.containerInfo = new g();
        }
        cardInnerCommonNode.containerInfo.a(str);
        b(cardInnerCommonNode);
        return cardInnerCommonNode;
    }

    public CardInnerCommonNode d(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CardInnerCommonNode) ipChange.ipc$dispatch("6f763df8", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        CardInnerCommonNode cardInnerCommonNode = new CardInnerCommonNode(jSONObject);
        c(cardInnerCommonNode);
        b(cardInnerCommonNode);
        return cardInnerCommonNode;
    }

    public CardInnerCommonNode a(JSONObject jSONObject, Class<? extends CardInnerCommonNode> cls) {
        CardInnerCommonNode cardInnerCommonNode;
        if (jSONObject == null) {
            return null;
        }
        try {
            cardInnerCommonNode = cls.getConstructor(JSONObject.class).newInstance(jSONObject);
        } catch (IllegalAccessException e) {
            e = e;
            cardInnerCommonNode = null;
        } catch (InstantiationException e2) {
            e = e2;
            cardInnerCommonNode = null;
        } catch (NoSuchMethodException e3) {
            e = e3;
            cardInnerCommonNode = null;
        } catch (InvocationTargetException e4) {
            e = e4;
            cardInnerCommonNode = null;
        }
        try {
            c(cardInnerCommonNode);
            b(cardInnerCommonNode);
        } catch (IllegalAccessException e5) {
            e = e5;
            fjp.b(this, "main", "10013", "生成DetailCardInnerNode失败, IllegalAccessException", false);
            e.printStackTrace();
            return cardInnerCommonNode;
        } catch (InstantiationException e6) {
            e = e6;
            fjp.b(this, "main", "10013", "生成DetailCardInnerNode失败, InstantiationException", false);
            e.printStackTrace();
            return cardInnerCommonNode;
        } catch (NoSuchMethodException e7) {
            e = e7;
            fjp.b(this, "main", "10013", "生成DetailCardInnerNode失败, NoSuchMethodException", false);
            e.printStackTrace();
            return cardInnerCommonNode;
        } catch (InvocationTargetException e8) {
            e = e8;
            fjp.b(this, "main", "10013", "生成DetailCardInnerNode失败, InvocationTargetException", false);
            e.printStackTrace();
            return cardInnerCommonNode;
        }
        return cardInnerCommonNode;
    }

    private void c(CardInnerCommonNode cardInnerCommonNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fe65b91", new Object[]{this, cardInnerCommonNode});
            return;
        }
        cardInnerCommonNode.dataContext = this.j;
        cardInnerCommonNode.dataContextNode = this;
        cardInnerCommonNode.nid = this.k;
    }

    public void b(CardInnerCommonNode cardInnerCommonNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38bd7950", new Object[]{this, cardInnerCommonNode});
            return;
        }
        h(cardInnerCommonNode);
        i(cardInnerCommonNode);
        g(cardInnerCommonNode);
        f(cardInnerCommonNode);
        d(cardInnerCommonNode);
        e(cardInnerCommonNode);
    }

    private void d(CardInnerCommonNode cardInnerCommonNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("470f3dd2", new Object[]{this, cardInnerCommonNode});
        } else if (!fjk.a()) {
        } else {
            cardInnerCommonNode.containerInfo.b.put("autoTestInfo", C().k().K);
        }
    }

    private void e(CardInnerCommonNode cardInnerCommonNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e382013", new Object[]{this, cardInnerCommonNode});
            return;
        }
        if (C().S()) {
            cardInnerCommonNode.containerInfo.b.put("isOpenImmediatelyMode", "true");
        }
        if (this.Y == null) {
            return;
        }
        cardInnerCommonNode.containerInfo.b.put("hasPlaceHolderImageCache", String.valueOf(C().L().a(G()).a()));
    }

    private void f(CardInnerCommonNode cardInnerCommonNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55610254", new Object[]{this, cardInnerCommonNode});
        } else {
            cardInnerCommonNode.containerInfo.b.put("preloadDetailData", "true");
        }
    }

    private void g(CardInnerCommonNode cardInnerCommonNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c89e495", new Object[]{this, cardInnerCommonNode});
        } else {
            cardInnerCommonNode.containerInfo.b.put("enableOpenSKUWithRequest", "true");
        }
    }

    private void h(CardInnerCommonNode cardInnerCommonNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b2c6d6", new Object[]{this, cardInnerCommonNode});
            return;
        }
        if (C().C()) {
            cardInnerCommonNode.containerInfo.b.put("halfGuide", "true");
        }
        if (!C().D()) {
            return;
        }
        cardInnerCommonNode.containerInfo.b.put("disableHalfScreenGuide", "true");
    }

    private void i(CardInnerCommonNode cardInnerCommonNode) {
        AtmosParams G;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6adba917", new Object[]{this, cardInnerCommonNode});
        } else if (cardInnerCommonNode == null || cardInnerCommonNode.containerInfo == null || C() == null || (G = C().G()) == null || !G.showAtmos) {
        } else {
            cardInnerCommonNode.containerInfo.b.put("showAtmos", "true");
        }
    }

    public void e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87b16e04", new Object[]{this, jSONObject});
        } else {
            this.T = jSONObject;
        }
    }

    private void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
            return;
        }
        this.s = a(this.s, str);
        a(this.s);
    }

    public void a(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6635bcfe", new Object[]{this, str, jSONObject});
            return;
        }
        c(jSONObject, true);
        d(str);
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
            return;
        }
        d(str);
        Z();
    }

    public boolean F() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3eff1d1", new Object[]{this})).booleanValue();
        }
        JSONObject jSONObject2 = this.H;
        return (jSONObject2 == null || (jSONObject = jSONObject2.getJSONObject("trade")) == null || StringUtils.isEmpty(jSONObject.getString(Constants.WEIBO_REDIRECTURL_KEY))) ? false : true;
    }

    public JSONObject H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("853bcfef", new Object[]{this});
        }
        JSONObject jSONObject = this.H;
        if (jSONObject == null) {
            return new JSONObject();
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("feature");
        return jSONObject2 == null ? new JSONObject() : jSONObject2;
    }

    public String I() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("136d6650", new Object[]{this});
        }
        JSONObject jSONObject2 = this.H;
        return (jSONObject2 == null || (jSONObject = jSONObject2.getJSONObject("seller")) == null) ? "" : jSONObject.getString("sellerId");
    }

    public CardUTArgs J() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CardUTArgs) ipChange.ipc$dispatch("b8ca434b", new Object[]{this}) : this.e;
    }

    public JSONObject K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c0334a72", new Object[]{this});
        }
        JSONObject jSONObject = this.X;
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    public void a(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb6538e", new Object[]{this, str, obj});
        } else {
            this.aa.put(str, obj);
        }
    }

    public void a(com.taobao.android.detail2.core.framework.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8b7157", new Object[]{this, bVar});
            return;
        }
        a(KEY_CONTEXT_DATA_HALF_HEIGHT, Float.valueOf(lnr.c(bVar)));
        a("screenHeight", Integer.valueOf(fmc.a(bVar.h().K().a(), C())));
    }

    public JSONObject L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d3db1df3", new Object[]{this});
        }
        JSONObject jSONObject = this.ab;
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    public JSONObject M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e782f174", new Object[]{this});
        }
        JSONObject jSONObject = this.ac;
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    public JSONArray N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("3b6df1c9", new Object[]{this});
        }
        JSONObject jSONObject = this.ae;
        if (jSONObject != null) {
            return jSONObject.getJSONArray("images");
        }
        return null;
    }

    public JSONArray O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("afad2a28", new Object[]{this});
        }
        JSONObject jSONObject = this.ae;
        if (jSONObject != null) {
            return jSONObject.getJSONArray("videos");
        }
        return null;
    }

    public String P() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c11580a9", new Object[]{this}) : this.Z;
    }

    public String c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b82f346c", new Object[]{this, str}) : StringUtils.isEmpty(this.h) ? str : this.h;
    }

    public JSONObject Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("36223f78", new Object[]{this});
        }
        JSONObject jSONObject = this.aa.getJSONObject("navRefreshParam");
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    public boolean R() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4990bdd", new Object[]{this})).booleanValue() : "true".equals(H().getString("enableHalfScreenZoom"));
    }

    public String G() {
        NewDetailScreenConfig.ScreenType f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("661f112", new Object[]{this});
        }
        com.taobao.android.detail2.core.framework.data.model.a aVar = this.Y;
        if (aVar == null) {
            return "";
        }
        String b = aVar.b();
        NewDetailScreenConfig K = C().K();
        if (K == null || (f = K.f()) == null) {
            return b;
        }
        String uIStrategyTag = f.getUIStrategyTag();
        if (StringUtils.isEmpty(uIStrategyTag)) {
            return b;
        }
        return b + "-" + uIStrategyTag;
    }

    public void a(long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1206f8", new Object[]{this, new Long(j), new Boolean(z)});
            return;
        }
        JSONObject jSONObject = this.aa.getJSONObject("timing");
        if (jSONObject == null) {
            jSONObject = new JSONObject();
            this.aa.put("timing", (Object) jSONObject);
        }
        if (this.V != -1 && !z) {
            return;
        }
        this.V = j;
        jSONObject.put("instanceStart", (Object) Long.valueOf(this.V));
        jSONObject.put("urlInconsistent", (Object) String.valueOf(z));
    }

    public void a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821975c", new Object[]{this, new Long(j)});
            return;
        }
        JSONObject jSONObject = this.aa.getJSONObject("timing");
        if (jSONObject == null) {
            jSONObject = new JSONObject();
            this.aa.put("timing", (Object) jSONObject);
        }
        jSONObject.put("click", (Object) Long.valueOf(j));
    }

    public void Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("509c7e1", new Object[]{this});
        } else if (!this.G.b().o() || !this.G.r().a(C().k().W)) {
        } else {
            this.s.dataContext = new JSONObject();
            JSONObject jSONObject = new JSONObject();
            this.s.dataContext.put("context", (Object) jSONObject);
            jSONObject.put("optimizeConfig", (Object) this.G.r().f(C().k().W));
            jSONObject.put("simpleDeliverData", (Object) this.G.s());
        }
    }
}
