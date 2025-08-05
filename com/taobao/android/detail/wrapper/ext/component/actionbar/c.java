package com.taobao.android.detail.wrapper.ext.component.actionbar;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.taobao.TBActionBar;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.ext.g;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.view.widget.base.uikit.TIconFontTextView;
import com.taobao.android.detail.core.utils.i;
import com.taobao.android.detail.datasdk.model.datamodel.node.ResourceNode;
import com.taobao.android.detail.datasdk.model.viewmodel.main.TitleViewModel;
import com.taobao.android.detail.wrapper.activity.DetailActivity;
import com.taobao.android.detail.wrapper.ext.request.client.search.SearchInfoApiRequestClient;
import com.taobao.android.detail.wrapper.ext.request.client.search.a;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.android.trade.event.f;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.ag;
import com.taobao.uikit.actionbar.TBActionView;
import com.taobao.uikit.actionbar.TBPublicMenu;
import com.taobao.uikit.actionbar.TBPublicMenuItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.ead;
import tb.ect;
import tb.ecu;
import tb.ehd;
import tb.ehe;
import tb.ehi;
import tb.eme;
import tb.emu;
import tb.enq;
import tb.enu;
import tb.eny;
import tb.eoi;
import tb.epq;
import tb.eps;
import tb.eqb;
import tb.god;
import tb.kge;
import tb.noa;
import tb.sku;

/* loaded from: classes5.dex */
public class c extends com.taobao.android.detail.core.detail.kit.view.holder.c<ehi> implements com.taobao.android.detail.wrapper.ext.component.actionbar.a, a.InterfaceC0447a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static int C = 0;
    private static int D = 0;
    public static final int VIEW_TYPE_DEFAULT = 0;
    public static final int VIEW_TYPE_END = 2;
    public static final int VIEW_TYPE_SEARCH = 3;
    public static final int VIEW_TYPE_START = 1;
    private static final String y;
    private final e A;
    private String B;
    public ViewPager.OnPageChangeListener g;
    private TaoDetailActionBarV3 h;
    private ehi i;
    private SearchInfoApiRequestClient.a j;
    private View k;
    private boolean l;
    private boolean m;
    private boolean n;
    private Map<String, String> o;
    private String p;
    private String q;
    private a r;
    private int s;
    private boolean t;
    private List<String> u;
    private boolean v;
    private int w;
    private final CartBarViewHolder x;
    public FragmentManager.OnBackStackChangedListener z;

    /* loaded from: classes5.dex */
    public interface a {
        void a(int i);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        if (str.hashCode() == 90991720) {
            super.a();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ Context A(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("971eca27", new Object[]{cVar}) : cVar.f9568a;
    }

    public static /* synthetic */ int a(c cVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c92ca8c7", new Object[]{cVar, new Integer(i)})).intValue();
        }
        cVar.w = i;
        return i;
    }

    public static /* synthetic */ TaoDetailActionBarV3 a(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TaoDetailActionBarV3) ipChange.ipc$dispatch("63302836", new Object[]{cVar}) : cVar.h;
    }

    public static /* synthetic */ Map a(c cVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("9e31de98", new Object[]{cVar, str, str2}) : cVar.a(str, str2);
    }

    public static /* synthetic */ boolean a(c cVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c92ce8a9", new Object[]{cVar, new Boolean(z)})).booleanValue();
        }
        cVar.v = z;
        return z;
    }

    public static /* synthetic */ Context b(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("cd2b0926", new Object[]{cVar}) : cVar.f9568a;
    }

    public static /* synthetic */ Context c(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("51be445", new Object[]{cVar}) : cVar.f9568a;
    }

    public static /* synthetic */ Context d(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("3d0cbf64", new Object[]{cVar}) : cVar.f9568a;
    }

    public static /* synthetic */ Context e(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("74fd9a83", new Object[]{cVar}) : cVar.f9568a;
    }

    public static /* synthetic */ Context f(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("acee75a2", new Object[]{cVar}) : cVar.f9568a;
    }

    public static /* synthetic */ boolean g(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("839a7ccd", new Object[]{cVar})).booleanValue() : cVar.l;
    }

    public static /* synthetic */ String h(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("d46d5cb8", new Object[]{cVar}) : cVar.q;
    }

    public static /* synthetic */ Context i(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("54c106ff", new Object[]{cVar}) : cVar.f9568a;
    }

    public static /* synthetic */ Map j(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("12642cdb", new Object[]{cVar}) : cVar.d();
    }

    public static /* synthetic */ String k(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("cae0e9fb", new Object[]{cVar}) : cVar.p;
    }

    public static /* synthetic */ Context l(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("fc93985c", new Object[]{cVar}) : cVar.f9568a;
    }

    public static /* synthetic */ Context m(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("3484737b", new Object[]{cVar}) : cVar.f9568a;
    }

    public static /* synthetic */ Context n(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("6c754e9a", new Object[]{cVar}) : cVar.f9568a;
    }

    public static /* synthetic */ Map o(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("68252a36", new Object[]{cVar}) : cVar.c();
    }

    public static /* synthetic */ Context p(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("dc5704d8", new Object[]{cVar}) : cVar.f9568a;
    }

    public static /* synthetic */ CartBarViewHolder q(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (CartBarViewHolder) ipChange.ipc$dispatch("4f136c25", new Object[]{cVar}) : cVar.x;
    }

    public static /* synthetic */ Context r(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("4c38bb16", new Object[]{cVar}) : cVar.f9568a;
    }

    public static /* synthetic */ e s(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (e) ipChange.ipc$dispatch("aa7d94e2", new Object[]{cVar}) : cVar.A;
    }

    public static /* synthetic */ Context t(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("bc1a7154", new Object[]{cVar}) : cVar.f9568a;
    }

    public static /* synthetic */ Context u(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("f40b4c73", new Object[]{cVar}) : cVar.f9568a;
    }

    public static /* synthetic */ Context v(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("2bfc2792", new Object[]{cVar}) : cVar.f9568a;
    }

    public static /* synthetic */ Context w(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("63ed02b1", new Object[]{cVar}) : cVar.f9568a;
    }

    public static /* synthetic */ List x(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("80b9c06f", new Object[]{cVar}) : cVar.u;
    }

    public static /* synthetic */ boolean y(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("faf20efb", new Object[]{cVar})).booleanValue() : cVar.v;
    }

    public static /* synthetic */ int z(c cVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("65219709", new Object[]{cVar})).intValue() : cVar.w;
    }

    static {
        kge.a(-373988174);
        kge.a(275753548);
        kge.a(492661770);
        y = c.class.getSimpleName();
    }

    public c(Context context) {
        super(context);
        this.l = false;
        this.m = false;
        this.n = false;
        this.v = true;
        this.w = 0;
        this.z = new FragmentManager.OnBackStackChangedListener() { // from class: com.taobao.android.detail.wrapper.ext.component.actionbar.c.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                c.this = this;
            }

            @Override // android.support.v4.app.FragmentManager.OnBackStackChangedListener
            public void onBackStackChanged() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("2062519", new Object[]{this});
                } else if (((DetailActivity) c.b(c.this)).b.i.getBackStackEntryCount() != 0) {
                } else {
                    c.a(c.this).setIsRateFragmentShown(false);
                    c.a(c.this).showActionBarTitle(false);
                    c.a(c.this).showElevatorView(true);
                }
            }
        };
        this.g = new ViewPager.OnPageChangeListener() { // from class: com.taobao.android.detail.wrapper.ext.component.actionbar.c.10
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
                }
            }

            {
                c.this = this;
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
                c.a(c.this).setTransparencyLR(f);
            }

            @Override // android.support.v4.view.ViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
                    return;
                }
                c.a(c.this).onPageSelected(i);
                if (c.x(c.this) == null || c.x(c.this).size() == 0) {
                    return;
                }
                if (!c.y(c.this)) {
                    c.a(c.this, true);
                    c.a(c.this, i);
                } else if (c.z(c.this) == i) {
                } else {
                    String str = (String) c.x(c.this).get(c.z(c.this));
                    String str2 = (String) c.x(c.this).get(i);
                    String str3 = i > c.z(c.this) ? "Page_Detail_Button_SlideLeft" : "Page_Detail_Button_SlideRight";
                    c.a(c.this, i);
                    Context A = c.A(c.this);
                    String[] a2 = ect.a(c.a(c.this, str, str2));
                    eps.a(A, "Page_Detail", 2101, str3, "detailV3", a2, "slideBefore=" + str, "slideAfter=" + str2);
                }
            }
        };
        this.x = new CartBarViewHolder(this.f9568a);
        this.B = k();
        this.A = new e(this.f9568a, this.B);
        emu.a("com.taobao.android.detail.wrapper.ext.component.actionbar.NavBarHolderV3");
    }

    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else {
            this.o = map;
        }
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.q = str;
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

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.m = z;
        }
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public View a(Context context, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f1543f21", new Object[]{this, context, viewGroup});
        }
        if (context == null) {
            context = this.f9568a;
        }
        this.h = new TaoDetailActionBarV3(context);
        this.h.setFullTransparentMode(this.l);
        this.h.setImmersiveEnable(this.m);
        this.h.init();
        if (!this.n) {
            this.n = true;
            if (ecu.a("Page_Detail_Show_Navigation")) {
                eps.a(this.f9568a, "Page_Detail", 2201, "Page_Detail_Show_Navigation", null, null, ect.a(d()));
            }
        }
        return this.h;
    }

    private Map<String, String> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3b696c1f", new Object[]{this});
        }
        Map<String, String> d = d();
        d.put("trackName", "ShoppingCart");
        d.put("trackNamePre", "Button-");
        return d;
    }

    private Map<String, String> a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c27656b1", new Object[]{this, str, str2});
        }
        Map<String, String> d = d();
        d.put("slideBefore", str);
        d.put("slideAfter", str2);
        return d;
    }

    private Map<String, String> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("913cde0", new Object[]{this});
        }
        HashMap<String, String> f = f();
        if (this.o == null) {
            return f;
        }
        for (Map.Entry<String, String> entry : f.entrySet()) {
            this.o.put(entry.getKey(), entry.getValue());
        }
        return this.o;
    }

    private Map<String, Object> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6dbf0a5e", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        try {
            com.taobao.android.detail.datasdk.model.datamodel.node.c cVar = ((DetailActivity) this.f9568a).y().t;
            hashMap.putAll(eqb.x(cVar.f10055a).commonUtParams);
            hashMap.put("itemId", cVar.i());
        } catch (Exception e) {
            i.a("[mergeContentExposure]" + y, e.getMessage());
        }
        return hashMap;
    }

    private String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f1302f6e", new Object[]{this});
        }
        try {
            return ((DetailActivity) this.f9568a).y().t.i();
        } catch (Exception e) {
            i.a("[getItemId]" + y, e.getMessage());
            return "";
        }
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.s = i;
        }
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else {
            this.v = z;
        }
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public void a(ehi ehiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6d8acf2", new Object[]{this, ehiVar});
        } else if (ehiVar == null || ehiVar.equals(this.i)) {
        } else {
            this.i = ehiVar;
            e();
            TaoDetailActionBarV3 taoDetailActionBarV3 = this.h;
            if (taoDetailActionBarV3 != null) {
                taoDetailActionBarV3.setTopAtmosphereBackground(n());
                this.h.setIsNewNav(l());
            }
            a(this.h, ehiVar, false);
        }
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        super.a();
        CartBarViewHolder cartBarViewHolder = this.x;
        if (cartBarViewHolder == null) {
            return;
        }
        cartBarViewHolder.a();
        j();
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else if (this.h == null) {
        } else {
            try {
                if (!god.f28406a) {
                    return;
                }
                FestivalMgr a2 = FestivalMgr.a();
                boolean f = a2.f();
                com.taobao.android.festival.skin.b a3 = com.taobao.android.festival.skin.b.a();
                boolean b = a3.b();
                if (a2 != null && f) {
                    String a4 = a2.a("global", "actionBarBackgroundImage");
                    a(a2.a("global", "actionbarTextColor", -1), a2.a("global", "actionbarTextSelColor", -192), a2.a("global", "actionbarTextColor", -197380), a2.a("global", "actionBarBackgroundColor", -65386));
                    this.h.setFestivalAtmosphere(true);
                    c(a4);
                } else if (a3 == null || !b) {
                } else {
                    String a5 = a3.a("global", "actionBarBackgroundImage");
                    a(a3.a("global", "actionbarTextColor", -1), a3.a("global", "actionbarTextSelColor", -192), a3.a("global", "actionbarTextColor", -197380), a3.a("global", "actionBarBackgroundColor", -65386));
                    this.h.setSkinAtmosphere(true);
                    c(a5);
                }
            } catch (Throwable unused) {
            }
        }
    }

    private void a(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d162128", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        this.h.setItemColor(i);
        this.h.setTabSelectedColor(i2);
        this.h.setTabUnSelectedColor(i3);
        this.h.setActionBarBackgroundColor(i4);
    }

    private void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097eb4", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            com.taobao.phenix.intf.b.h().a(str).succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.taobao.android.detail.wrapper.ext.component.actionbar.c.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    c.this = this;
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
                    if (succPhenixEvent.getDrawable() != null && !succPhenixEvent.isIntermediate() && (drawable = succPhenixEvent.getDrawable()) != null && c.a(c.this) != null) {
                        c.a(c.this).setActionBarBackgroundDrawable(drawable);
                    }
                    return true;
                }
            }).failListener(new com.taobao.phenix.intf.event.a<FailPhenixEvent>() { // from class: com.taobao.android.detail.wrapper.ext.component.actionbar.c.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public boolean a(FailPhenixEvent failPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("64c1ef50", new Object[]{this, failPhenixEvent})).booleanValue();
                    }
                    return true;
                }

                {
                    c.this = this;
                }

                @Override // com.taobao.phenix.intf.event.a
                public /* synthetic */ boolean onHappen(FailPhenixEvent failPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, failPhenixEvent})).booleanValue() : a(failPhenixEvent);
                }
            }).fetch();
        }
    }

    public void a(TaoDetailActionBarV3 taoDetailActionBarV3, ehi ehiVar, boolean z) {
        int i;
        JSONArray m;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53a12db3", new Object[]{this, taoDetailActionBarV3, ehiVar, new Boolean(z)});
        } else if (taoDetailActionBarV3 != null && ehiVar != null) {
            if (ehiVar.f != null) {
                if (eme.a(this.f9568a)) {
                    ehiVar.f.c = "퀺";
                }
                taoDetailActionBarV3.addItemView(d(ehiVar.f), 1);
                i = 1;
            } else {
                i = 0;
            }
            taoDetailActionBarV3.addNavTabsBar();
            if (ehiVar.k != null && !z && (this.s > 0 || this.t)) {
                this.u = new ArrayList();
                String str = (String) ehiVar.k.get("detailTitle");
                String str2 = (String) ehiVar.k.get("detailExtraTitle");
                String str3 = (String) ehiVar.k.get("detailExtraTitleColor");
                if (str3 != null) {
                    taoDetailActionBarV3.setExtraDetailTitleColor(str3);
                }
                if (!TextUtils.isEmpty(str2)) {
                    str = str2;
                } else if (TextUtils.isEmpty(str)) {
                    str = "";
                }
                if (!TextUtils.isEmpty(str)) {
                    this.u.add(str);
                    eps.a(this.f9568a, "Page_Detail", 2201, "Page_Detail_Show_ProductDetail", "detailV3", null, ect.a(d()));
                }
                String str4 = (String) ehiVar.k.get("contentTitle");
                if (!TextUtils.isEmpty(str4)) {
                    this.u.add(str4);
                    eps.a(this.f9568a, "Page_Detail", 2201, "Page_Detail_Show_Content", "detailV3", null, ect.b(b()));
                }
                for (String str5 : this.u) {
                    taoDetailActionBarV3.addTabWithText(str5, this.r);
                }
                String str6 = (String) ehiVar.k.get("shopTitle");
                String str7 = (String) ehiVar.k.get(g.KEY_APM_SHOP_URL);
                if (!TextUtils.isEmpty(str6) && !TextUtils.isEmpty(str7)) {
                    taoDetailActionBarV3.addShopTab(str6);
                }
                taoDetailActionBarV3.setTabNum(this.u.size());
                taoDetailActionBarV3.setAnchorPoints(this.u);
            }
            ArrayList arrayList = new ArrayList();
            if (ehiVar.g != null) {
                arrayList.add(ehiVar.g);
            }
            if (ehiVar.h != null) {
                arrayList.add(ehiVar.h);
            }
            if (ehiVar.i != null) {
                arrayList.add(ehiVar.i);
            }
            if (ehiVar.m != null) {
                arrayList.add(ehiVar.m);
            }
            if (ehiVar.j != null) {
                arrayList.add(ehiVar.j);
            }
            Collections.sort(arrayList, new Comparator<ehe>() { // from class: com.taobao.android.detail.wrapper.ext.component.actionbar.c.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    c.this = this;
                }

                @Override // java.util.Comparator
                public /* synthetic */ int compare(ehe eheVar, ehe eheVar2) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("6a9be197", new Object[]{this, eheVar, eheVar2})).intValue() : a(eheVar, eheVar2);
                }

                public int a(ehe eheVar, ehe eheVar2) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Number) ipChange2.ipc$dispatch("86205c77", new Object[]{this, eheVar, eheVar2})).intValue() : Integer.parseInt(eheVar.f) - Integer.parseInt(eheVar2.f);
                }
            });
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ehe eheVar = (ehe) it.next();
                if (arrayList.size() - 1 == arrayList.indexOf(eheVar)) {
                    i = 2;
                }
                if (eheVar == ehiVar.g) {
                    taoDetailActionBarV3.addItemView(b(ehiVar.g), 3);
                    i = 3;
                } else {
                    if (eheVar == ehiVar.h) {
                        taoDetailActionBarV3.addItemView(c(ehiVar.h), 0);
                    } else if (eheVar == ehiVar.i) {
                        View a2 = a(ehiVar.i);
                        a2.setId(R.id.tao_detail_cart_item);
                        if (!this.x.a(a2, taoDetailActionBarV3, false, 0)) {
                            taoDetailActionBarV3.addItemView(a2, 0);
                        }
                    } else if (eheVar == ehiVar.m) {
                        taoDetailActionBarV3.addItemView(g(ehiVar.m), 0);
                    } else if (eheVar == ehiVar.j) {
                        TBActionView tBActionView = (TBActionView) com.taobao.android.detail.core.async.d.b(this.f9568a, R.layout.x_detail_action_bar_more_v3);
                        tBActionView.setTitle(this.f9568a.getString(R.string.detail_menu_more_text));
                        tBActionView.setMessageBackgroundColor(Color.parseColor("#ff5000"));
                        tBActionView.switchActionStyle(TBActionBar.ActionBarStyle.NORMAL);
                        taoDetailActionBarV3.addItemView(tBActionView, i);
                        a(tBActionView);
                    }
                    i = 0;
                }
            }
            if (l() && (m = m()) != null) {
                taoDetailActionBarV3.initElevatorView();
                for (int i2 = 0; i2 < m.size(); i2++) {
                    JSONObject jSONObject = m.getJSONObject(i2);
                    if (jSONObject != null) {
                        String string = jSONObject.getString("title");
                        String string2 = jSONObject.getString("locationId");
                        if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                            taoDetailActionBarV3.addElevatorItem(string2, string);
                        }
                    }
                }
            }
            taoDetailActionBarV3.initialize();
            i();
        }
    }

    private JSONArray m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("4f15c54a", new Object[]{this});
        }
        if (!(this.f9568a instanceof DetailActivity)) {
            return null;
        }
        DetailActivity detailActivity = (DetailActivity) this.f9568a;
        if (detailActivity.b == null || detailActivity.b.h == null || !(detailActivity.b.h.e instanceof ehd)) {
            return null;
        }
        ehd ehdVar = (ehd) detailActivity.b.h.e;
        if (ehdVar.a() != null && ehdVar.a().d != null) {
            return ehdVar.a().d.getJSONArray("titles");
        }
        return null;
    }

    private FragmentManager h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FragmentManager) ipChange.ipc$dispatch("fcd14778", new Object[]{this});
        }
        if (!(this.f9568a instanceof DetailActivity)) {
            return null;
        }
        DetailActivity detailActivity = (DetailActivity) this.f9568a;
        if (detailActivity.b != null && detailActivity.b.i != null) {
            return detailActivity.b.i;
        }
        return null;
    }

    private void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        FragmentManager h = h();
        if (h == null) {
            return;
        }
        h.addOnBackStackChangedListener(this.z);
    }

    private void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        FragmentManager h = h();
        if (h == null) {
            return;
        }
        h.removeOnBackStackChangedListener(this.z);
    }

    private void a(TBActionView tBActionView) {
        TBPublicMenu publicMenu;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d881d71e", new Object[]{this, tBActionView});
        } else if (!(this.f9568a instanceof DetailActivity) || (publicMenu = ((DetailActivity) this.f9568a).getPublicMenu()) == null) {
        } else {
            if (com.alibaba.ability.localization.b.c()) {
                publicMenu.showMenuItem(R.id.uik_menu_report);
                publicMenu.setShareContentCallBack(null, false);
            }
            publicMenu.setCustomOverflow(tBActionView);
            if (publicMenu.getCustomMenu(9000004) != null) {
                return;
            }
            TBPublicMenuItem.Builder builder = new TBPublicMenuItem.Builder();
            builder.setId(9000004).setTitle(this.f9568a.getString(R.string.detail_menu_share_text)).setUTControlName(this.f9568a.getString(R.string.detail_menu_share));
            ArrayList<TBPublicMenuItem> arrayList = new ArrayList<>();
            arrayList.add(builder.build());
            publicMenu.addCustomMenus(arrayList, new TBPublicMenu.TBOnPublicMenuClickListener() { // from class: com.taobao.android.detail.wrapper.ext.component.actionbar.NavBarHolderV3$5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.uikit.actionbar.TBPublicMenu.TBOnPublicMenuClickListener
                public void onPublicMenuItemClicked(TBPublicMenuItem tBPublicMenuItem) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("478e7772", new Object[]{this, tBPublicMenuItem});
                    } else if (tBPublicMenuItem == null || tBPublicMenuItem.getId() != 9000004) {
                    } else {
                        f.a(c.c(c.this), new eoi(TitleViewModel.ShareType.SHARE_TYPE_DEFAULT));
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(new eny(c.d(c.this).getString(R.string.detail_profile_btn_index), c.e(c.this).getString(R.string.detail_menu_share), null));
                        ead.a(c.f(c.this), arrayList2);
                    }
                }
            });
        }
    }

    private HashMap<String, String> f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("31745610", new Object[]{this}) : new HashMap<String, String>() { // from class: com.taobao.android.detail.wrapper.ext.component.actionbar.NavBarHolderV3$6
            {
                c.this = this;
                put(sku.KEY_VIDEO_TYPE, c.g(c.this) ? "3-4" : "1-1");
            }
        };
    }

    private void b(String str, String str2) {
        List<String> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65d7b87d", new Object[]{this, str, str2});
            return;
        }
        try {
            Uri parse = Uri.parse(str2);
            String queryParameter = parse.getQueryParameter(noa.KEY_SEARCHDOOR_LAUNCH_MODE);
            String uri = this.j != null ? this.j.b : parse.toString();
            if (this.j != null) {
                list = this.j.d;
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(parse.getQueryParameter("showText"));
                list = arrayList;
            }
            this.k.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.wrapper.ext.component.actionbar.c.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    c.this = this;
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else if (TextUtils.isEmpty(c.h(c.this))) {
                    } else {
                        eps.a(c.i(c.this), ag.SEARCH_ENTRANCE_CLICK, c.j(c.this));
                        if (noa.VALUE_SEARCHDOOR_LAUNCH_MODE_NEW_TASK.equalsIgnoreCase(c.k(c.this))) {
                            epq.a(c.l(c.this), c.h(c.this), 268435456);
                        } else {
                            epq.a(c.m(c.this), c.h(c.this));
                        }
                    }
                }
            });
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
        } else if (this.k == null || !l()) {
        } else {
            TextView textView2 = (TextView) this.k.findViewById(R.id.if_action_bar_search_text);
            if (!TextUtils.isEmpty(str) && (textView = (TextView) this.k.findViewById(R.id.if_action_bar_search_icon)) != null) {
                textView.setText(str);
                C = textView.getWidth();
                D = textView.getRight();
            }
            if (textView2 != null) {
                if (list != null) {
                    String str5 = " | ";
                    SpannableString spannableString = new SpannableString(str5);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    int width = this.k.getWidth();
                    int paddingLeft = this.k.getPaddingLeft();
                    int paddingLeft2 = this.k.getPaddingLeft();
                    int left = textView2.getLeft() - D;
                    Paint paint = new Paint();
                    paint.setTextSize(textView2.getTextSize());
                    float measureText = paint.measureText("测试");
                    float f = (((width - C) - paddingLeft) - paddingLeft2) - left;
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
            this.q = str2;
            this.p = str3;
        }
    }

    public View a(ehe eheVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("53fdc238", new Object[]{this, eheVar});
        }
        View e = e(eheVar);
        JSONObject f = f(eheVar);
        if (f != null && f.containsKey("jumpUrl")) {
            final String string = f.getString("jumpUrl");
            if (!TextUtils.isEmpty(string)) {
                e.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.wrapper.ext.component.actionbar.c.8
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    {
                        c.this = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                            return;
                        }
                        eps.a(c.n(c.this), "ShoppingCart", c.o(c.this));
                        f.a(c.p(c.this), new enu(string));
                        int b = c.q(c.this).b();
                        Map j = c.j(c.this);
                        j.put("CartBadge", "allitemcount");
                        j.put("text", b > 99 ? "99+" : String.valueOf(b));
                        eps.a(c.r(c.this), "Page_Detail_Button-ShoppingCart_Badge", c.j(c.this));
                    }
                });
            }
        }
        return e;
    }

    public View g(ehe eheVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("d17273be", new Object[]{this, eheVar});
        }
        View e = e(eheVar);
        this.A.a((TIconFontTextView) e);
        this.A.a(this.h);
        this.A.a(p());
        this.A.a(o());
        this.A.c();
        e.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.wrapper.ext.component.actionbar.c.9
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                c.this = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                c.s(c.this).b();
                eps.a(c.t(c.this), "NavbarCollect", c.j(c.this));
            }
        });
        return e;
    }

    public View b(ehe eheVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("68e68a79", new Object[]{this, eheVar});
        }
        View b = l() ? com.taobao.android.detail.core.async.d.b(this.f9568a, R.layout.x_detail_action_bar_search_v3) : e(eheVar);
        this.k = b;
        b(eheVar.c, this.q);
        return b;
    }

    public View c(ehe eheVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("7dcf52ba", new Object[]{this, eheVar});
        }
        View e = e(eheVar);
        e.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.wrapper.ext.component.actionbar.c.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                c.this = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                eps.a(c.u(c.this), "Navigation-Share", c.j(c.this));
                f.a(c.v(c.this), new eoi(TitleViewModel.ShareType.SHARE_TYPE_DEFAULT));
            }
        });
        return e;
    }

    public View d(ehe eheVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("92b81afb", new Object[]{this, eheVar});
        }
        View e = e(eheVar);
        e.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.wrapper.ext.component.actionbar.c.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                c.this = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    f.a(c.w(c.this), new enq());
                }
            }
        });
        return e;
    }

    public View e(ehe eheVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("a7a0e33c", new Object[]{this, eheVar});
        }
        if (eheVar == null) {
            return null;
        }
        TIconFontTextView tIconFontTextView = new TIconFontTextView(this.f9568a);
        tIconFontTextView.setGravity(17);
        tIconFontTextView.setIncludeFontPadding(false);
        tIconFontTextView.setTextColor(-16777216);
        TaoDetailActionBarV3 taoDetailActionBarV3 = this.h;
        if (taoDetailActionBarV3 != null) {
            taoDetailActionBarV3.getNavHeadHeight();
            tIconFontTextView.setTextSize(1, 21.0f);
        } else {
            tIconFontTextView.setTextSize(1, 18.0f);
        }
        tIconFontTextView.setText(eheVar.c);
        com.taobao.android.detail.core.detail.kit.utils.d.a(this.f9568a, this.c, tIconFontTextView, eheVar.events);
        if (eheVar.component != null && eheVar.component.mapping != null && eheVar.component.mapping.containsKey("accessHint")) {
            String string = eheVar.component.mapping.getString("accessHint");
            if (!TextUtils.isEmpty(string)) {
                tIconFontTextView.setContentDescription(c(eheVar.e, string));
            }
        }
        JSONObject f = f(eheVar);
        if (f != null && f.containsKey("accessHint")) {
            String string2 = f.getString("accessHint");
            if (!TextUtils.isEmpty(string2)) {
                tIconFontTextView.setContentDescription(c(eheVar.e, string2));
            }
        }
        return tIconFontTextView;
    }

    private String c(String str, String str2) {
        CartBarViewHolder cartBarViewHolder;
        String valueOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cef1bce2", new Object[]{this, str, str2});
        }
        String str3 = "";
        if ("cart".equals(str) && (cartBarViewHolder = this.x) != null) {
            int b = cartBarViewHolder.b();
            if (b > 99) {
                valueOf = "99+";
            } else if (b > 0) {
                valueOf = String.valueOf(b);
            }
            str3 = valueOf;
        }
        return str2 + str3 + "，按钮";
    }

    private JSONObject f(ehe eheVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9b7dfb1b", new Object[]{this, eheVar});
        }
        if (eheVar.dmComponent != null && eheVar.dmComponent.getFields() != null && eheVar.dmComponent.getFields().getJSONObject("payload") != null) {
            return eheVar.dmComponent.getFields().getJSONObject("payload");
        }
        return null;
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.actionbar.a
    public void a(ViewGroup viewGroup, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8f4670d", new Object[]{this, viewGroup, new Boolean(z)});
        } else if (this.h == null || viewGroup == null) {
        } else {
            if (viewGroup.getChildCount() > 0) {
                viewGroup.removeAllViews();
            }
            viewGroup.addView(this.h, new LinearLayout.LayoutParams(-1, -2));
        }
    }

    @Override // com.taobao.android.detail.wrapper.ext.request.client.search.a.InterfaceC0447a
    public void a(SearchInfoApiRequestClient.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b50a4cc", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            this.j = aVar;
            if (TextUtils.isEmpty(aVar.b)) {
                return;
            }
            this.q = aVar.b;
            a((String) null, aVar.d, aVar.b, (String) null);
        }
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2f7c72", new Object[]{this, aVar});
        } else {
            this.r = aVar;
        }
    }

    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
        } else {
            this.t = z;
        }
    }

    private JSONObject n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("70253515", new Object[]{this});
        }
        try {
            ResourceNode l = eqb.l(((DetailActivity) this.f9568a).y().t.f10055a);
            if (l == null) {
                return null;
            }
            return l.getData().getJSONObject("topAtmosphere");
        } catch (Exception e) {
            i.a(y, "getTopAtmosphere", e);
            return null;
        }
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6076ef7", new Object[]{this})).booleanValue();
        }
        if (!(this.f9568a instanceof DetailActivity)) {
            return false;
        }
        return ((DetailActivity) this.f9568a).bd();
    }

    private Map<String, String> p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ad1062ec", new Object[]{this});
        }
        if (!(this.f9568a instanceof DetailActivity)) {
            return null;
        }
        return ((DetailActivity) this.f9568a).B();
    }

    public String o() {
        com.taobao.android.detail.datasdk.model.datamodel.node.c C2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b4719ea", new Object[]{this});
        }
        if ((this.f9568a instanceof DetailActivity) && (C2 = ((DetailActivity) this.f9568a).C()) != null && C2.b()) {
            return C2.j();
        }
        return null;
    }
}
