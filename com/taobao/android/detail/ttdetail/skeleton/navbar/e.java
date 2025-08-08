package com.taobao.android.detail.ttdetail.skeleton.navbar;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.support.v4.view.ViewPager;
import android.support.v7.taobao.TBActionBar;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import mtopsdk.common.util.StringUtils;
import android.text.method.ScrollingMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.bizmessage.h;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.skeleton.navbar.search.search.SearchInfoController;
import com.taobao.android.detail.ttdetail.utils.i;
import com.taobao.android.detail.ttdetail.utils.j;
import com.taobao.android.detail.ttdetail.utils.l;
import com.taobao.android.detail.ttdetail.widget.desc.TIconFontTextView;
import com.taobao.android.t;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.search.common.util.k;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.ag;
import com.taobao.uikit.actionbar.ITBPublicMenu;
import com.taobao.uikit.actionbar.TBActionView;
import com.taobao.uikit.actionbar.TBPublicMenu;
import com.taobao.uikit.actionbar.TBPublicMenuItem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.kge;
import tb.noa;
import tb.odg;
import tb.sku;
import tb.soy;
import tb.sys;

/* loaded from: classes5.dex */
public class e implements SearchInfoController.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int VIEW_TYPE_DEFAULT = 0;
    public static final int VIEW_TYPE_END = 2;
    public static final int VIEW_TYPE_SEARCH = 3;
    public static final int VIEW_TYPE_SEARCH_ICON = 4;
    public static final int VIEW_TYPE_START = 1;
    private static int u;
    private static int v;
    private SpannableString A;
    private SpannableString B;
    private boolean C;
    private boolean D;
    private String E;
    private SpannableStringBuilder F;
    private TaoDetailActionBarV3 b;
    private soy.b c;
    private com.taobao.android.detail.ttdetail.skeleton.navbar.search.search.b d;
    private View e;
    private String h;
    private String i;
    private a j;
    private List<String> k;
    private final CartBarViewHolder n;
    private final com.taobao.android.detail.ttdetail.skeleton.navbar.b o;
    private String p;
    private Context q;
    private TIconFontTextView r;
    private List<soy.a> s;
    private ITBPublicMenu t;
    private Map<String, String> w;
    private View.OnClickListener x;
    private TextView y;
    private SpannableString z;
    private boolean f = false;
    private boolean g = false;
    private boolean l = true;
    private int m = 0;

    /* renamed from: a */
    public ViewPager.OnPageChangeListener f10919a = new ViewPager.OnPageChangeListener() { // from class: com.taobao.android.detail.ttdetail.skeleton.navbar.e.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.support.v4.view.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
            }
        }

        {
            e.this = this;
        }

        @Override // android.support.v4.view.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
                return;
            }
            if (i != 0 && f == 0.0f) {
                f = 1.0f;
            }
            e.a(e.this).setTransparencyLR(f);
        }

        @Override // android.support.v4.view.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
                return;
            }
            e.a(e.this).onPageSelected(i);
            if (e.l(e.this) == null || e.l(e.this).size() == 0) {
                return;
            }
            if (!e.m(e.this)) {
                e.a(e.this, true);
                e.a(e.this, i);
            } else if (e.n(e.this) == i) {
            } else {
                String str = (String) e.l(e.this).get(e.n(e.this));
                String str2 = (String) e.l(e.this).get(i);
                String str3 = i > e.n(e.this) ? "Page_Detail_Button_SlideLeft" : "Page_Detail_Button_SlideRight";
                e.a(e.this, i);
                try {
                    JSONObject parseObject = JSONObject.parseObject(JSON.toJSONString(e.a(e.this, str, str2)));
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("arg1", (Object) str3);
                    jSONObject.put("args", (Object) parseObject);
                    com.taobao.android.detail.ttdetail.communication.c.a(e.b(e.this), new h("user_track", jSONObject, new RuntimeAbilityParam[0]));
                } catch (Exception e) {
                    i.a("NavBarHolderV3", "mergeSlideExposure", e);
                }
            }
        }
    };

    /* loaded from: classes5.dex */
    public interface a {
        void onTabChange(int i);
    }

    /* loaded from: classes5.dex */
    public class b {

        /* renamed from: a */
        public String f10931a;
        public String b;
        public String c;
        public String d;
        public boolean e;

        static {
            kge.a(-1760169239);
        }

        public b(JSONObject jSONObject) {
            String str;
            e.this = r4;
            boolean z = false;
            this.e = false;
            if (jSONObject == null) {
                return;
            }
            boolean booleanValue = jSONObject.getBooleanValue("isReviewPageShow");
            this.f10931a = jSONObject.getString("rateText");
            this.d = jSONObject.getString("pageTitle");
            if (e.o(r4)) {
                this.b = jSONObject.getString("leftBlackPic");
                str = "rightBlackPic";
            } else {
                this.b = jSONObject.getString("leftPic");
                str = "rightPic";
            }
            this.c = jSONObject.getString(str);
            if (booleanValue && this.f10931a != null && this.b != null && this.c != null) {
                z = true;
            }
            this.e = z;
        }
    }

    static {
        kge.a(1578137065);
        kge.a(-631105995);
        kge.a(-685631758);
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public static /* synthetic */ int a(e eVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f41d1f74", new Object[]{eVar, new Integer(i)})).intValue();
        }
        eVar.m = i;
        return i;
    }

    public static /* synthetic */ TaoDetailActionBarV3 a(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TaoDetailActionBarV3) ipChange.ipc$dispatch("f8263d7c", new Object[]{eVar}) : eVar.b;
    }

    public static /* synthetic */ Map a(e eVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("f3796b8b", new Object[]{eVar, str, str2}) : eVar.b(str, str2);
    }

    public static /* synthetic */ void a(e eVar, BitmapDrawable bitmapDrawable, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3295d7d", new Object[]{eVar, bitmapDrawable, new Boolean(z)});
        } else {
            eVar.a(bitmapDrawable, z);
        }
    }

    public static /* synthetic */ boolean a(e eVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f41d5f56", new Object[]{eVar, new Boolean(z)})).booleanValue();
        }
        eVar.l = z;
        return z;
    }

    public static /* synthetic */ Context b(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("c8ae5e7b", new Object[]{eVar}) : eVar.q;
    }

    public static /* synthetic */ boolean c(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9ce86548", new Object[]{eVar})).booleanValue() : eVar.f;
    }

    public static /* synthetic */ String d(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("205f6d3b", new Object[]{eVar}) : eVar.i;
    }

    public static /* synthetic */ Map e(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("59e5be7b", new Object[]{eVar}) : eVar.h();
    }

    public static /* synthetic */ String f(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("a48dc7f9", new Object[]{eVar}) : eVar.E;
    }

    public static /* synthetic */ String g(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("e6a4f558", new Object[]{eVar}) : eVar.p;
    }

    public static /* synthetic */ String h(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("28bc22b7", new Object[]{eVar}) : eVar.h;
    }

    public static /* synthetic */ Map i(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("76155a7f", new Object[]{eVar}) : eVar.g();
    }

    public static /* synthetic */ CartBarViewHolder j(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CartBarViewHolder) ipChange.ipc$dispatch("58b21d86", new Object[]{eVar}) : eVar.n;
    }

    public static /* synthetic */ com.taobao.android.detail.ttdetail.skeleton.navbar.b k(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.detail.ttdetail.skeleton.navbar.b) ipChange.ipc$dispatch("2eed6287", new Object[]{eVar}) : eVar.o;
    }

    public static /* synthetic */ List l(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("9bde7e9a", new Object[]{eVar}) : eVar.k;
    }

    public static /* synthetic */ boolean m(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("440264d2", new Object[]{eVar})).booleanValue() : eVar.l;
    }

    public static /* synthetic */ int n(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("54b83182", new Object[]{eVar})).intValue() : eVar.m;
    }

    public static /* synthetic */ boolean o(e eVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("656dfe54", new Object[]{eVar})).booleanValue() : eVar.l();
    }

    public e(Context context, String str) {
        this.q = context;
        this.n = new CartBarViewHolder(this.q);
        this.p = str;
        this.o = new com.taobao.android.detail.ttdetail.skeleton.navbar.b(this.q, this.p);
    }

    public void a(List<soy.a> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else {
            this.s = list;
        }
    }

    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
            return;
        }
        com.taobao.android.detail.ttdetail.skeleton.navbar.b bVar = this.o;
        if (bVar == null) {
            return;
        }
        bVar.a(map);
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
            return;
        }
        com.taobao.android.detail.ttdetail.skeleton.navbar.b bVar = this.o;
        if (bVar == null) {
            return;
        }
        bVar.b(str);
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.i = str;
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }

    public View a(Context context, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f1543f21", new Object[]{this, context, viewGroup});
        }
        if (context == null) {
            context = this.q;
        }
        this.b = new TaoDetailActionBarV3(context);
        this.b.setFullTransparentMode(this.f);
        this.b.init();
        if (!this.g) {
            this.g = true;
            try {
                JSONObject parseObject = JSONObject.parseObject(JSON.toJSONString(h()));
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("page", (Object) "Page_Detail");
                jSONObject.put("eventId", (Object) 2201);
                jSONObject.put("arg1", (Object) "Page_Detail_Show_Navigation");
                jSONObject.put("args", (Object) parseObject);
                com.taobao.android.detail.ttdetail.communication.c.a(this.q, new h("userTrack", jSONObject, new RuntimeAbilityParam[0]));
            } catch (Exception e) {
                i.a("NavBarHolderV3", "Page_Detail_Show_Navigation error", e);
            }
        }
        return this.b;
    }

    private Map<String, String> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7212f323", new Object[]{this});
        }
        Map<String, String> h = h();
        h.put("trackName", "ShoppingCart");
        h.put("trackNamePre", "Button-");
        return h;
    }

    private Map<String, String> b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ebcaabf2", new Object[]{this, str, str2});
        }
        Map<String, String> h = h();
        h.put("slideBefore", str);
        h.put("slideAfter", str2);
        return h;
    }

    private Map<String, String> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3fbd54e4", new Object[]{this});
        }
        HashMap<String, String> j = j();
        if (this.w == null) {
            return j;
        }
        for (Map.Entry<String, String> entry : j.entrySet()) {
            this.w.put(entry.getKey(), entry.getValue());
        }
        return this.w;
    }

    private Map<String, Object> i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("d67b6a5", new Object[]{this}) : new HashMap();
    }

    public void a(soy.b bVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9c668b3", new Object[]{this, bVar, jSONObject});
        } else if (bVar == null || bVar.equals(this.c)) {
        } else {
            this.c = bVar;
            c();
            TaoDetailActionBarV3 taoDetailActionBarV3 = this.b;
            if (taoDetailActionBarV3 != null) {
                taoDetailActionBarV3.setTopAtmosphereBackground(jSONObject);
                this.b.setIsNewNav(b());
            }
            a(this.b, bVar, false);
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        CartBarViewHolder cartBarViewHolder = this.n;
        if (cartBarViewHolder == null) {
            return;
        }
        cartBarViewHolder.d();
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.b == null || !j.H() || !odg.i().b()) {
        } else {
            String a2 = odg.i().a("global", "actionBarBackgroundImage");
            a(odg.i().a("global", "actionbarTextColor", -1), odg.i().a("global", "actionbarTextSelColor", -192), odg.i().a("global", "actionbarTextColor", -197380), odg.i().a("global", "actionBarBackgroundColor", -65386));
            if (odg.i().a()) {
                this.b.setFestivalAtmosphere(true);
            } else {
                this.b.setSkinAtmosphere(true);
            }
            b(a2);
        }
    }

    private void a(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d162128", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        this.b.setItemColor(i);
        this.b.setTabSelectedColor(i2);
        this.b.setTabUnSelectedColor(i3);
        this.b.setActionBarBackgroundColor(i4);
    }

    private void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            com.taobao.phenix.intf.b.h().a(str).succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.taobao.android.detail.ttdetail.skeleton.navbar.e.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    e.this = this;
                }

                @Override // com.taobao.phenix.intf.event.a
                public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
                }

                public boolean a(SuccPhenixEvent succPhenixEvent) {
                    BitmapDrawable drawable;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                    }
                    if (succPhenixEvent.getDrawable() != null && !succPhenixEvent.isIntermediate() && (drawable = succPhenixEvent.getDrawable()) != null && e.a(e.this) != null) {
                        e.a(e.this).setActionBarBackgroundDrawable(drawable);
                    }
                    return true;
                }
            }).failListener(new com.taobao.phenix.intf.event.a<FailPhenixEvent>() { // from class: com.taobao.android.detail.ttdetail.skeleton.navbar.e.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public boolean a(FailPhenixEvent failPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("64c1ef50", new Object[]{this, failPhenixEvent})).booleanValue();
                    }
                    return true;
                }

                {
                    e.this = this;
                }

                @Override // com.taobao.phenix.intf.event.a
                public /* synthetic */ boolean onHappen(FailPhenixEvent failPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, failPhenixEvent})).booleanValue() : a(failPhenixEvent);
                }
            }).fetch();
        }
    }

    public void a(TaoDetailActionBarV3 taoDetailActionBarV3, soy.b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        int i = 3;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("972bd21d", new Object[]{this, taoDetailActionBarV3, bVar, new Boolean(z)});
        } else if (taoDetailActionBarV3 != null && bVar != null) {
            taoDetailActionBarV3.addItemView(a(), 1);
            taoDetailActionBarV3.addNavTabsBar();
            if (bVar.f33796a != null && !z) {
                this.k = new ArrayList();
                String str = bVar.f33796a.f33799a;
                String str2 = bVar.f33796a.b;
                if (!StringUtils.isEmpty(str2)) {
                    taoDetailActionBarV3.setExtraDetailTitleColor(str2);
                }
                if (!StringUtils.isEmpty(str)) {
                    this.k.add(str);
                    try {
                        JSONObject parseObject = JSONObject.parseObject(JSON.toJSONString(h()));
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("page", (Object) "Page_Detail");
                        jSONObject.put("eventId", (Object) 2201);
                        jSONObject.put("arg1", (Object) "Page_Detail_Show_ProductDetail");
                        jSONObject.put("args", (Object) parseObject);
                        com.taobao.android.detail.ttdetail.communication.c.a(this.q, new h("userTrack", jSONObject, new RuntimeAbilityParam[0]));
                    } catch (Exception e) {
                        i.a("NavBarHolderV3", "mergeExposure error", e);
                    }
                }
                String str3 = bVar.f33796a.c;
                if (!StringUtils.isEmpty(str3)) {
                    this.k.add(str3);
                    try {
                        JSONObject parseObject2 = JSONObject.parseObject(JSON.toJSONString(i()));
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("page", (Object) "Page_Detail");
                        jSONObject2.put("eventId", (Object) 2201);
                        jSONObject2.put("arg1", (Object) "Page_Detail_Show_Content");
                        jSONObject2.put("args", (Object) parseObject2);
                        com.taobao.android.detail.ttdetail.communication.c.a(this.q, new h("userTrack", jSONObject2, new RuntimeAbilityParam[0]));
                    } catch (Exception e2) {
                        i.a("NavBarHolderV3", "mergeContentExposure error", e2);
                    }
                }
                for (String str4 : this.k) {
                    taoDetailActionBarV3.addTabWithText(str4, this.j);
                }
                String str5 = bVar.f33796a.d;
                String str6 = bVar.f33796a.e;
                if (!StringUtils.isEmpty(str5) && !StringUtils.isEmpty(str6)) {
                    taoDetailActionBarV3.addShopTab(str5, str6);
                }
                taoDetailActionBarV3.setTabNum(this.k.size());
                taoDetailActionBarV3.setAnchorPoints(this.k);
            }
            taoDetailActionBarV3.addItemView(a(bVar.b), 3);
            this.r = f();
            taoDetailActionBarV3.addItemView(this.r, 4);
            taoDetailActionBarV3.setSearchIconContainerVisibility();
            Iterator<soy.b.a> it = bVar.c.iterator();
            while (it.hasNext()) {
                soy.b.a next = it.next();
                if (bVar.c.size() - 1 == bVar.c.indexOf(next)) {
                    i = 2;
                }
                if ("share".equals(next.f33797a)) {
                    taoDetailActionBarV3.addItemView(c(next), 0);
                } else {
                    if ("cart".equals(next.f33797a)) {
                        View a2 = a(next);
                        a2.setId(R.id.tt_detail_cart_item);
                        CartBarViewHolder cartBarViewHolder = this.n;
                        if (cartBarViewHolder != null) {
                            cartBarViewHolder.a(next);
                        }
                        if (!this.n.a(a2, taoDetailActionBarV3, false, 0)) {
                            taoDetailActionBarV3.addItemView(a2, 0);
                        }
                    } else if ("collect".equals(next.f33797a)) {
                        taoDetailActionBarV3.addItemView(b(next), 0);
                    }
                    i = 0;
                }
            }
            TBActionView tBActionView = (TBActionView) LayoutInflater.from(this.q).inflate(R.layout.tt_detail_action_bar_more_v3, (ViewGroup) null);
            tBActionView.setTitle(this.q.getString(R.string.tt_detail_menu_more_text));
            tBActionView.setMessageBackgroundColor(Color.parseColor("#ff5000"));
            tBActionView.switchActionStyle(TBActionBar.ActionBarStyle.NORMAL);
            taoDetailActionBarV3.addItemView(tBActionView, i);
            a(tBActionView);
            List<soy.a> list = this.s;
            if (list != null && !list.isEmpty()) {
                taoDetailActionBarV3.initElevatorView();
                for (int i2 = 0; i2 < this.s.size(); i2++) {
                    soy.a aVar = this.s.get(i2);
                    if (aVar != null) {
                        String str7 = aVar.b;
                        String str8 = aVar.f33795a;
                        if (!StringUtils.isEmpty(str7)) {
                            taoDetailActionBarV3.addElevatorItem(str8, str7);
                        }
                    }
                }
            }
            taoDetailActionBarV3.initialize();
        }
    }

    private void a(TBActionView tBActionView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d881d71e", new Object[]{this, tBActionView});
            return;
        }
        TBPublicMenu publicMenu = this.t.getPublicMenu();
        if (publicMenu == null) {
            return;
        }
        if (odg.o().a()) {
            publicMenu.showMenuItem(R.id.uik_menu_report);
            publicMenu.setShareContentCallBack(null, false);
        }
        publicMenu.setCustomOverflow(tBActionView);
        if (publicMenu.getCustomMenu(9000004) != null) {
            return;
        }
        TBPublicMenuItem.Builder builder = new TBPublicMenuItem.Builder();
        builder.setId(9000004).setTitle(this.q.getString(R.string.tt_detail_menu_share_text)).setUTControlName(this.q.getString(R.string.tt_detail_menu_share));
        ArrayList<TBPublicMenuItem> arrayList = new ArrayList<>();
        arrayList.add(builder.build());
        publicMenu.addCustomMenus(arrayList, new TBPublicMenu.TBOnPublicMenuClickListener() { // from class: com.taobao.android.detail.ttdetail.skeleton.navbar.e.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                e.this = this;
            }

            @Override // com.taobao.uikit.actionbar.TBPublicMenu.TBOnPublicMenuClickListener
            public void onPublicMenuItemClicked(TBPublicMenuItem tBPublicMenuItem) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("478e7772", new Object[]{this, tBPublicMenuItem});
                } else if (tBPublicMenuItem == null || tBPublicMenuItem.getId() != 9000004) {
                } else {
                    com.taobao.android.detail.ttdetail.communication.c.a(e.b(e.this), new h("share", new JSONObject(), new RuntimeAbilityParam[0]));
                    ArrayList arrayList2 = new ArrayList();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("arg1", (Object) "Button-");
                    jSONObject.put("args", (Object) "Share");
                    arrayList2.add(new h("user_track", jSONObject, new RuntimeAbilityParam[0]));
                    sys.a(e.b(e.this), arrayList2);
                    com.taobao.android.detail.ttdetail.behavior.b.a(e.b(e.this), com.taobao.android.detail.ttdetail.behavior.c.COMPONENT_NAME_NAVI_BAR, com.taobao.android.detail.ttdetail.behavior.c.ACTION_NAVI_BAR_MORE, (Map<String, String>) null);
                }
            }
        });
    }

    private HashMap<String, String> j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("5a3abb14", new Object[]{this}) : new HashMap<String, String>() { // from class: com.taobao.android.detail.ttdetail.skeleton.navbar.NavBarHolderV3$4
            {
                e.this = this;
                put(sku.KEY_VIDEO_TYPE, e.c(e.this) ? "3-4" : "1-1");
            }
        };
    }

    private void a(String str, String str2) {
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
            return;
        }
        try {
            Uri parse = Uri.parse(str2);
            String queryParameter = parse.getQueryParameter(noa.KEY_SEARCHDOOR_LAUNCH_MODE);
            String uri = this.d != null ? this.d.b : parse.toString();
            if (this.d != null) {
                list = this.d.f10937a;
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(parse.getQueryParameter("showText"));
                list = arrayList;
            }
            this.x = new View.OnClickListener() { // from class: com.taobao.android.detail.ttdetail.skeleton.navbar.e.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    e.this = this;
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else if (StringUtils.isEmpty(e.d(e.this))) {
                    } else {
                        try {
                            JSONObject parseObject = JSONObject.parseObject(JSON.toJSONString(e.e(e.this)));
                            JSONObject jSONObject = new JSONObject();
                            if (e.f(e.this) != null) {
                                parseObject.put("itemid", (Object) e.g(e.this));
                                parseObject.put(k.KEY_SUGGEST_RN, (Object) e.f(e.this));
                            }
                            jSONObject.put("arg1", (Object) ag.SEARCH_ENTRANCE_CLICK);
                            jSONObject.put("args", (Object) parseObject);
                            com.taobao.android.detail.ttdetail.communication.c.a(e.b(e.this), new h("user_track", jSONObject, new RuntimeAbilityParam[0]));
                        } catch (Exception e) {
                            i.a("NavBarHolderV3", "ctrlClicked mergeExposure", e);
                        }
                        (noa.VALUE_SEARCHDOOR_LAUNCH_MODE_NEW_TASK.equalsIgnoreCase(e.h(e.this)) ? t.a().a(e.b(e.this)).a(268435456) : t.a().a(e.b(e.this))).a(e.d(e.this));
                        com.taobao.android.detail.ttdetail.behavior.b.a(e.b(e.this), com.taobao.android.detail.ttdetail.behavior.c.COMPONENT_NAME_NAVI_BAR, com.taobao.android.detail.ttdetail.behavior.c.ACTION_NAVI_BAR_SEARCH, (Map<String, String>) null);
                    }
                }
            };
            this.e.setOnClickListener(this.x);
            a(str, list, uri, queryParameter);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void a(String str, List<String> list, String str2, String str3) {
        String str4;
        TextView textView;
        IpChange ipChange = $ipChange;
        int i = 1;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73c8d4b7", new Object[]{this, str, list, str2, str3});
        } else if (this.e == null || !b()) {
        } else {
            TextView textView2 = (TextView) this.e.findViewById(R.id.if_action_bar_search_text);
            if (!StringUtils.isEmpty(str) && (textView = (TextView) this.e.findViewById(R.id.if_action_bar_search_icon)) != null) {
                textView.setText(str);
                u = textView.getWidth();
                v = textView.getRight();
            }
            if (textView2 != null) {
                if (list != null) {
                    String str5 = " | ";
                    SpannableString spannableString = new SpannableString(str5);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    int width = this.e.getWidth();
                    int paddingLeft = this.e.getPaddingLeft();
                    int paddingLeft2 = this.e.getPaddingLeft();
                    int left = textView2.getLeft() - v;
                    Paint paint = new Paint();
                    paint.setTextSize(textView2.getTextSize());
                    float measureText = paint.measureText("测试");
                    float f = (((width - u) - paddingLeft) - paddingLeft2) - left;
                    int i2 = 0;
                    while (i2 < list.size()) {
                        String str6 = list.get(i2);
                        spannableStringBuilder.append((CharSequence) str6);
                        float measureText2 = paint.measureText(str6 + str5);
                        if (measureText2 + measureText > f) {
                            break;
                        }
                        f -= measureText2;
                        if (i2 != list.size() - i) {
                            str4 = str5;
                            spannableString.setSpan(new ForegroundColorSpan(855638016), 0, 3, 33);
                            spannableStringBuilder.append((CharSequence) spannableString);
                        } else {
                            str4 = str5;
                        }
                        i2++;
                        str5 = str4;
                        i = 1;
                    }
                    textView2.setText(spannableStringBuilder);
                    textView2.setContentDescription(list.get(0) + "搜索文本栏");
                } else {
                    textView2.setContentDescription("搜索文本栏");
                }
            }
            this.i = str2;
            this.h = str3;
        }
    }

    public View a(soy.b.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("7bd29f02", new Object[]{this, aVar});
        }
        View d = d(aVar);
        if (!this.D) {
            this.D = true;
            f(aVar);
        }
        if (aVar != null && !StringUtils.isEmpty(aVar.d)) {
            final String str = aVar.d;
            if (!StringUtils.isEmpty(str)) {
                d.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.ttdetail.skeleton.navbar.e.6
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    {
                        e.this = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                            return;
                        }
                        try {
                            JSONObject parseObject = JSONObject.parseObject(JSON.toJSONString(e.i(e.this)));
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("arg1", (Object) "ShoppingCart");
                            jSONObject.put("args", (Object) parseObject);
                            com.taobao.android.detail.ttdetail.communication.c.a(e.b(e.this), new h("user_track", jSONObject, new RuntimeAbilityParam[0]));
                        } catch (Exception e) {
                            i.a("NavBarHolderV3", "ctrlClicked mergeCartExposure", e);
                        }
                        l.a(e.b(e.this), str);
                        int e2 = e.j(e.this).e();
                        Map e3 = e.e(e.this);
                        e3.put("CartBadge", "allitemcount");
                        e3.put("text", e2 > 99 ? "99+" : String.valueOf(e2));
                        try {
                            JSONObject parseObject2 = JSONObject.parseObject(JSON.toJSONString(e3));
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("arg1", (Object) "Page_Detail_Button-ShoppingCart_Badge");
                            jSONObject2.put("args", (Object) parseObject2);
                            com.taobao.android.detail.ttdetail.communication.c.a(e.b(e.this), new h("userTrack", jSONObject2, new RuntimeAbilityParam[0]));
                        } catch (Exception e4) {
                            i.a("NavBarHolderV3", "ctrlClicked mergeExposure", e4);
                        }
                        com.taobao.android.detail.ttdetail.behavior.b.a(e.b(e.this), com.taobao.android.detail.ttdetail.behavior.c.COMPONENT_NAME_NAVI_BAR, com.taobao.android.detail.ttdetail.behavior.c.ACTION_NAVI_BAR_CART, (Map<String, String>) null);
                    }
                });
            }
        }
        return d;
    }

    public View b(soy.b.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("e2ab5ec3", new Object[]{this, aVar});
        }
        View d = d(aVar);
        this.o.a((TIconFontTextView) d);
        this.o.a(this.b);
        this.o.c();
        d.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.ttdetail.skeleton.navbar.e.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                e.this = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                e.k(e.this).b();
                try {
                    JSONObject parseObject = JSONObject.parseObject(JSON.toJSONString(e.e(e.this)));
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("arg1", (Object) "NavbarCollect");
                    jSONObject.put("args", (Object) parseObject);
                    com.taobao.android.detail.ttdetail.communication.c.a(e.b(e.this), new h("user_track", jSONObject, new RuntimeAbilityParam[0]));
                } catch (Exception e) {
                    i.a("NavBarHolderV3", "queryCollect ctrlClicked mergeExposure", e);
                }
                com.taobao.android.detail.ttdetail.behavior.b.a(e.b(e.this), com.taobao.android.detail.ttdetail.behavior.c.COMPONENT_NAME_NAVI_BAR, com.taobao.android.detail.ttdetail.behavior.c.ACTION_NAVI_BAR_COLLECT, (Map<String, String>) null);
            }
        });
        return d;
    }

    public View a(soy.b.C1182b c1182b) {
        View inflate;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("25859a1", new Object[]{this, c1182b});
        }
        com.taobao.android.detail.ttdetail.performance.d a2 = com.taobao.android.detail.ttdetail.performance.d.a(this.q);
        if (a2 != null) {
            inflate = a2.a(this.q, R.layout.tt_detail_action_bar_search_v3, null, true);
        } else {
            inflate = LayoutInflater.from(this.q).inflate(R.layout.tt_detail_action_bar_search_v3, (ViewGroup) null);
        }
        this.e = inflate;
        a(c1182b.f33798a, this.i);
        return inflate;
    }

    public TIconFontTextView f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TIconFontTextView) ipChange.ipc$dispatch("7fa2c050", new Object[]{this});
        }
        TIconFontTextView d = d();
        d.setText("끺");
        d.setContentDescription("搜索,按钮");
        d.setOnClickListener(this.x);
        return d;
    }

    public View c(soy.b.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("49841e84", new Object[]{this, aVar});
        }
        View d = d(aVar);
        if (!this.C) {
            this.C = true;
            f(aVar);
        }
        d.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.ttdetail.skeleton.navbar.e.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                e.this = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                try {
                    JSONObject parseObject = JSONObject.parseObject(JSON.toJSONString(e.e(e.this)));
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("arg1", (Object) "Navigation-Share");
                    jSONObject.put("args", (Object) parseObject);
                    com.taobao.android.detail.ttdetail.communication.c.a(e.b(e.this), new h("user_track", jSONObject, new RuntimeAbilityParam[0]));
                } catch (Exception e) {
                    i.a("NavBarHolderV3", "queryCollect ctrlClicked mergeExposure", e);
                }
                com.taobao.android.detail.ttdetail.communication.c.a(e.b(e.this), new h("share", new JSONObject(), new RuntimeAbilityParam[0]));
                com.taobao.android.detail.ttdetail.behavior.b.a(e.b(e.this), com.taobao.android.detail.ttdetail.behavior.c.COMPONENT_NAME_NAVI_BAR, com.taobao.android.detail.ttdetail.behavior.c.ACTION_NAVI_BAR_SHARE, (Map<String, String>) null);
            }
        });
        return d;
    }

    public View a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("195fbaaa", new Object[]{this});
        }
        TIconFontTextView d = d();
        d.setText("ꁽ");
        d.setContentDescription("返回，按钮");
        d.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.ttdetail.skeleton.navbar.e.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                e.this = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("arg1", (Object) "Back");
                    com.taobao.android.detail.ttdetail.communication.c.a(e.b(e.this), new h("user_track", jSONObject, new RuntimeAbilityParam[0]));
                } catch (Exception e) {
                    i.a("NavBarHolderV3", "back track error", e);
                }
                com.taobao.android.detail.ttdetail.communication.c.a(e.b(e.this), new com.taobao.android.detail.ttdetail.bizmessage.j());
            }
        });
        return d;
    }

    private TIconFontTextView d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TIconFontTextView) ipChange.ipc$dispatch("de1ff12", new Object[]{this});
        }
        TIconFontTextView tIconFontTextView = new TIconFontTextView(this.q);
        tIconFontTextView.setGravity(17);
        tIconFontTextView.setIncludeFontPadding(false);
        tIconFontTextView.setTextColor(-16777216);
        TaoDetailActionBarV3 taoDetailActionBarV3 = this.b;
        if (taoDetailActionBarV3 != null) {
            taoDetailActionBarV3.getNavHeadHeight();
            tIconFontTextView.setTextSize(1, 21.0f);
        } else {
            tIconFontTextView.setTextSize(1, 18.0f);
        }
        return tIconFontTextView;
    }

    public View d(soy.b.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("b05cde45", new Object[]{this, aVar});
        }
        if (aVar == null) {
            return null;
        }
        TIconFontTextView d = d();
        d.setText(aVar.c);
        d.setContentDescription(e(aVar));
        return d;
    }

    private void f(soy.b.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("593d8cc5", new Object[]{this, aVar});
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("page", (Object) "Page_Detail");
            jSONObject.put("eventId", (Object) 2201);
            if ("share".equals(aVar.f33797a)) {
                jSONObject.put("arg1", (Object) "Page_Detail_Show-Navigation-Share");
            } else if ("cart".equals(aVar.f33797a)) {
                jSONObject.put("arg1", (Object) "Page_Detail_Show-ShoppingCart");
            }
            jSONObject.put("args", (Object) new JSONObject());
            com.taobao.android.detail.ttdetail.communication.c.a(this.q, new h("userTrack", jSONObject, new RuntimeAbilityParam[0]));
        } catch (Exception e) {
            i.a("NavBarHolderV3", "Page_Detail_Show_Navigation error:" + aVar.f33797a, e);
        }
    }

    private String e(soy.b.a aVar) {
        CartBarViewHolder cartBarViewHolder;
        String valueOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c069265c", new Object[]{this, aVar});
        }
        String str = aVar.b;
        String str2 = "";
        if ("cart".equals(aVar.f33797a) && (cartBarViewHolder = this.n) != null) {
            int e = cartBarViewHolder.e();
            if (e > 99) {
                valueOf = "99+";
            } else if (e > 0) {
                valueOf = String.valueOf(e);
            }
            str2 = valueOf;
        }
        return str + str2 + "，按钮";
    }

    public void a(ViewGroup viewGroup, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8f4670d", new Object[]{this, viewGroup, new Boolean(z)});
        } else if (this.b == null || viewGroup == null) {
        } else {
            if (viewGroup.getChildCount() > 0) {
                viewGroup.removeAllViews();
            }
            viewGroup.addView(this.b, new LinearLayout.LayoutParams(-1, -2));
        }
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.navbar.search.search.SearchInfoController.a
    public void a(com.taobao.android.detail.ttdetail.skeleton.navbar.search.search.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74909e85", new Object[]{this, bVar});
        } else if (bVar == null) {
        } else {
            this.d = bVar;
            if (StringUtils.isEmpty(bVar.b)) {
                return;
            }
            this.i = bVar.b;
            this.E = bVar.d;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("itemid", (Object) this.p);
            jSONObject.put(k.KEY_SUGGEST_RN, (Object) this.E);
            this.b.setSearchLabParams(jSONObject);
            a((String) null, bVar.f10937a, bVar.b, (String) null);
        }
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e4ddb65", new Object[]{this, aVar});
        } else {
            this.j = aVar;
        }
    }

    public void a(ITBPublicMenu iTBPublicMenu) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b621230a", new Object[]{this, iTBPublicMenu});
        } else {
            this.t = iTBPublicMenu;
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        TaoDetailActionBarV3 taoDetailActionBarV3 = this.b;
        if (taoDetailActionBarV3 == null) {
            return;
        }
        taoDetailActionBarV3.onPageSelected(i);
    }

    public void a(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c114785", new Object[]{this, new Integer(i), new Float(f)});
            return;
        }
        float f2 = (i == 0 || f != 0.0f) ? f : 1.0f;
        if (f >= 0.3f) {
            i++;
        }
        a(Math.min(i, 1));
        this.b.setTransparencyLR(f2);
    }

    private boolean l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue() : this.r.getCurrentTextColor() == -1;
    }

    public void a(JSONObject jSONObject, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a79284c", new Object[]{this, jSONObject, new Boolean(z)});
            return;
        }
        b bVar = new b(jSONObject);
        if (this.y == null) {
            this.y = new TextView(this.q);
        }
        if (z && bVar.e) {
            b(bVar);
        } else {
            d(bVar.d);
        }
        this.b.setNaviBarState(true);
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
        } else {
            this.b.setNaviBarState(false);
        }
    }

    private void b(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48c3f045", new Object[]{this, bVar});
            return;
        }
        SpannableStringBuilder spannableStringBuilder = this.F;
        if (spannableStringBuilder == null) {
            a(bVar);
        } else {
            this.y.setText(spannableStringBuilder);
            this.y.setMaxLines(1);
            this.y.setHorizontallyScrolling(true);
            this.y.setFocusable(true);
            this.y.setMovementMethod(ScrollingMovementMethod.getInstance());
        }
        this.b.setRateTitleView(this.y, true);
    }

    private void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23b17f5", new Object[]{this, str});
            return;
        }
        this.y.setText(str);
        this.y.setTextSize(1, 18.0f);
        this.y.setTextColor(this.r.getCurrentTextColor());
        this.b.setRateTitleView(this.y, false);
    }

    private void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e4e4fc4", new Object[]{this, bVar});
            return;
        }
        int i = l() ? -1 : -40448;
        int length = bVar.f10931a.length();
        this.B = new SpannableString(bVar.f10931a);
        this.B.setSpan(new f(12, i), 0, length, 33);
        a(bVar.b, true);
        a(bVar.c, false);
    }

    private void a(String str, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8123ece2", new Object[]{this, str, new Boolean(z)});
        } else {
            com.taobao.phenix.intf.b.h().a(str).succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.taobao.android.detail.ttdetail.skeleton.navbar.e.11
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    e.this = this;
                }

                @Override // com.taobao.phenix.intf.event.a
                public /* synthetic */ boolean onHappen(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, succPhenixEvent})).booleanValue() : a(succPhenixEvent);
                }

                public boolean a(SuccPhenixEvent succPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("3b4dd374", new Object[]{this, succPhenixEvent})).booleanValue();
                    }
                    if (succPhenixEvent.getDrawable() != null && !succPhenixEvent.isIntermediate()) {
                        e.a(e.this, succPhenixEvent.getDrawable(), z);
                    }
                    return true;
                }
            }).failListener(new com.taobao.phenix.intf.event.a<FailPhenixEvent>() { // from class: com.taobao.android.detail.ttdetail.skeleton.navbar.e.10
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public boolean a(FailPhenixEvent failPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("64c1ef50", new Object[]{this, failPhenixEvent})).booleanValue();
                    }
                    return true;
                }

                {
                    e.this = this;
                }

                @Override // com.taobao.phenix.intf.event.a
                public /* synthetic */ boolean onHappen(FailPhenixEvent failPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, failPhenixEvent})).booleanValue() : a(failPhenixEvent);
                }
            }).fetch();
        }
    }

    private void a(BitmapDrawable bitmapDrawable, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31021117", new Object[]{this, bitmapDrawable, new Boolean(z)});
            return;
        }
        SpannableString spannableString = new SpannableString(" ");
        bitmapDrawable.setBounds(0, 0, com.taobao.android.detail.ttdetail.utils.f.a(10.0f), com.taobao.android.detail.ttdetail.utils.f.a(14.0f));
        spannableString.setSpan(new com.taobao.android.detail.ttdetail.skeleton.navbar.a(bitmapDrawable, 2), 0, 1, 33);
        if (z) {
            this.z = spannableString;
        } else {
            this.A = spannableString;
        }
        if (!n()) {
            return;
        }
        this.F = new SpannableStringBuilder();
        this.F.append((CharSequence) this.z).append((CharSequence) this.B).append((CharSequence) this.A);
        this.y.setText(this.F);
        this.y.setMaxLines(1);
        this.y.setHorizontallyScrolling(true);
        this.y.setFocusable(true);
        this.y.setMovementMethod(ScrollingMovementMethod.getInstance());
    }

    private boolean n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6239df9", new Object[]{this})).booleanValue() : (this.z == null || this.A == null) ? false : true;
    }
}
