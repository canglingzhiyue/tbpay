package com.taobao.android.detail.wrapper.ext.component.actionbar;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.support.v7.taobao.TBActionBar;
import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.fastjson.JSONArray;
import com.alipay.mobile.security.bio.api.BioDetector;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.detail.kit.view.widget.base.uikit.TIconFontTextView;
import com.taobao.android.detail.core.utils.s;
import com.taobao.android.detail.datasdk.model.datamodel.template.ActionModel;
import com.taobao.android.detail.datasdk.model.viewmodel.main.TitleViewModel;
import com.taobao.android.detail.wrapper.activity.DetailActivity;
import com.taobao.android.detail.wrapper.ext.request.client.search.SearchInfoApiRequestClient;
import com.taobao.android.detail.wrapper.ext.request.client.search.a;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.android.fluid.remote.collectionpoplayer.nativecollection.CollectionTabLayout;
import com.taobao.android.trade.event.f;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.taobao.R;
import com.taobao.taolive.room.utils.ag;
import com.taobao.uikit.actionbar.TBActionView;
import com.taobao.uikit.actionbar.TBPublicMenu;
import com.taobao.uikit.actionbar.TBPublicMenuItem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.ead;
import tb.ecf;
import tb.ect;
import tb.ecu;
import tb.ehe;
import tb.ehf;
import tb.ehh;
import tb.ehs;
import tb.eme;
import tb.emu;
import tb.eny;
import tb.eoi;
import tb.epe;
import tb.epq;
import tb.eps;
import tb.feu;
import tb.god;
import tb.kge;
import tb.noa;
import tb.sku;

/* loaded from: classes5.dex */
public class b extends com.taobao.android.detail.core.detail.kit.view.holder.c<ehh> implements com.taobao.android.detail.wrapper.ext.component.actionbar.a, a.InterfaceC0447a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private TaoDetailActionBarV2 g;
    private ehh h;
    private SearchInfoApiRequestClient.a i;
    private View j;
    private List<C0438b> k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private Map<String, String> p;
    private final CartBarViewHolder q;
    private boolean r;
    private String s;
    private String t;
    private String u;
    private View.OnClickListener v;

    /* loaded from: classes5.dex */
    public interface a {
        void a();
    }

    static {
        kge.a(-373988175);
        kge.a(275753548);
        kge.a(492661770);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        if (str.hashCode() == 90991720) {
            super.a();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ TaoDetailActionBarV2 a(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TaoDetailActionBarV2) ipChange.ipc$dispatch("bbb44e56", new Object[]{bVar}) : bVar.g;
    }

    public static /* synthetic */ Map a(b bVar, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("108f6a2f", new Object[]{bVar, str}) : bVar.a(str);
    }

    public static /* synthetic */ Context b(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("dc5a01c7", new Object[]{bVar}) : bVar.f9568a;
    }

    public static /* synthetic */ Context c(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("144adce6", new Object[]{bVar}) : bVar.f9568a;
    }

    public static /* synthetic */ Context d(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("4c3bb805", new Object[]{bVar}) : bVar.f9568a;
    }

    public static /* synthetic */ Context e(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("842c9324", new Object[]{bVar}) : bVar.f9568a;
    }

    public static /* synthetic */ boolean f(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("196a804f", new Object[]{bVar})).booleanValue() : bVar.l;
    }

    public static /* synthetic */ Context g(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("f40e4962", new Object[]{bVar}) : bVar.f9568a;
    }

    public static /* synthetic */ Map h(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Map) ipChange.ipc$dispatch("91eb7efe", new Object[]{bVar}) : bVar.c();
    }

    public static /* synthetic */ Context i(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("63efffa0", new Object[]{bVar}) : bVar.f9568a;
    }

    public static /* synthetic */ Context j(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("9be0dabf", new Object[]{bVar}) : bVar.f9568a;
    }

    public static /* synthetic */ Context k(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("d3d1b5de", new Object[]{bVar}) : bVar.f9568a;
    }

    public static /* synthetic */ Context l(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("bc290fd", new Object[]{bVar}) : bVar.f9568a;
    }

    public static /* synthetic */ boolean m(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b73928", new Object[]{bVar})).booleanValue() : bVar.r;
    }

    public static /* synthetic */ Context n(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("7ba4473b", new Object[]{bVar}) : bVar.f9568a;
    }

    public static /* synthetic */ String o(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("5c375b7e", new Object[]{bVar}) : bVar.s;
    }

    public static /* synthetic */ Context p(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("eb85fd79", new Object[]{bVar}) : bVar.f9568a;
    }

    public static /* synthetic */ String q(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ab2f0f00", new Object[]{bVar}) : bVar.t;
    }

    public static /* synthetic */ Context r(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("5b67b3b7", new Object[]{bVar}) : bVar.f9568a;
    }

    public static /* synthetic */ String s(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("fa26c282", new Object[]{bVar}) : bVar.u;
    }

    public static /* synthetic */ Context t(b bVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("cb4969f5", new Object[]{bVar}) : bVar.f9568a;
    }

    public b(Context context) {
        super(context);
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = false;
        this.r = false;
        this.v = new View.OnClickListener() { // from class: com.taobao.android.detail.wrapper.ext.component.actionbar.b.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                b.this = this;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                if (b.m(b.this)) {
                    Context n = b.n(b.this);
                    b bVar = b.this;
                    ecf.f(n, b.a(bVar, b.o(bVar)));
                }
                eps.a(b.p(b.this), ag.SEARCH_ENTRANCE_CLICK, b.h(b.this));
                if (noa.VALUE_SEARCHDOOR_LAUNCH_MODE_NEW_TASK.equalsIgnoreCase(b.q(b.this))) {
                    epq.a(b.r(b.this), b.s(b.this), 268435456);
                } else {
                    epq.a(b.t(b.this), b.s(b.this));
                }
            }
        };
        this.q = new CartBarViewHolder(this.f9568a);
        emu.a("com.taobao.android.detail.wrapper.ext.component.actionbar.NavBarHolderV2");
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.o = z;
        }
    }

    public void a(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a42121d", new Object[]{this, map});
        } else {
            this.p = map;
        }
    }

    public void a(List<C0438b> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else {
            this.k = list;
        }
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.l = z;
        }
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else {
            this.n = z;
        }
    }

    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
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
        this.g = new TaoDetailActionBarV2(context);
        this.g.setFullTransparentMode(this.l);
        this.g.setImmersiveEnable(this.m);
        this.g.init();
        if (!this.o) {
            this.o = true;
            if (ecu.a("Page_Detail_Show_Navigation")) {
                eps.a(this.f9568a, "Page_Detail", 2201, "Page_Detail_Show_Navigation", null, null, ect.a(c()));
            }
        }
        return this.g;
    }

    private Map<String, String> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3b696c1f", new Object[]{this});
        }
        HashMap<String, String> e = e();
        if (this.p == null) {
            return e;
        }
        for (Map.Entry<String, String> entry : e.entrySet()) {
            this.p.put(entry.getKey(), entry.getValue());
        }
        return this.p;
    }

    private void b(ehh ehhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d55b3f14", new Object[]{this, ehhVar});
        } else if (ehhVar == null || ehhVar.equals(this.h)) {
        } else {
            this.h = ehhVar;
            b(this.h.g);
            b(this.h.i);
            b(this.h.j);
            if (ehhVar == null || ehhVar.k == null || ehhVar.k.f27309a == null) {
                return;
            }
            Iterator<ehf> it = ehhVar.k.f27309a.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
        }
    }

    private void b(ehe eheVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d559e1f7", new Object[]{this, eheVar});
        } else if (eheVar == null || eheVar.component == null || eheVar.component.actionModelList == null) {
            c(eheVar);
        } else {
            if (eheVar.events != null) {
                eheVar.events.clear();
            }
            for (ActionModel actionModel : eheVar.component.actionModelList) {
                if (eheVar.events == null) {
                    return;
                }
                eheVar.events.add(ehs.a(this.f9568a, actionModel, eheVar.mNodeBundle, null, null));
            }
        }
    }

    private void c(ehe eheVar) {
        List<ActionModel> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3dce878", new Object[]{this, eheVar});
        } else if (eheVar != null && eheVar.dmComponent != null && (a2 = a((epe) eheVar)) != null) {
            if (eheVar.events != null) {
                eheVar.events.clear();
            }
            for (ActionModel actionModel : a2) {
                if (eheVar.events == null) {
                    return;
                }
                eheVar.events.add(ehs.a(this.f9568a, actionModel, eheVar.mNodeBundle, null, null));
            }
        }
    }

    private void a(ehf ehfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6d74fd5", new Object[]{this, ehfVar});
        } else if (ehfVar == null || ehfVar.component == null || ehfVar.component.actionModelList == null) {
            b(ehfVar);
        } else {
            for (ActionModel actionModel : ehfVar.component.actionModelList) {
                if (ehfVar.events == null) {
                    return;
                }
                ehfVar.events.add(ehs.a(this.f9568a, actionModel, ehfVar.mNodeBundle, null, null));
            }
        }
    }

    private void b(ehf ehfVar) {
        List<ActionModel> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d55a5656", new Object[]{this, ehfVar});
        } else if (ehfVar != null && ehfVar.dmComponent != null && (a2 = a((epe) ehfVar)) != null) {
            if (ehfVar.events != null) {
                ehfVar.events.clear();
            }
            for (ActionModel actionModel : a2) {
                if (ehfVar.events == null) {
                    return;
                }
                ehfVar.events.add(ehs.a(this.f9568a, actionModel, ehfVar.mNodeBundle, null, null));
            }
        }
    }

    private List<ActionModel> a(epe epeVar) {
        JSONArray jSONArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("12088f09", new Object[]{this, epeVar});
        }
        ArrayList arrayList = null;
        if (epeVar != null && epeVar.dmComponent != null && epeVar.dmComponent.getEvents() != null && (jSONArray = epeVar.dmComponent.getEvents().getJSONArray(com.taobao.tao.flexbox.layoutmanager.container.b.KEY_ACTIONS)) != null && jSONArray.size() > 0) {
            arrayList = new ArrayList(jSONArray.size());
            for (int i = 0; i < jSONArray.size(); i++) {
                arrayList.add(new ActionModel(jSONArray.getJSONObject(i)));
            }
        }
        return arrayList;
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public void a(ehh ehhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6d83893", new Object[]{this, ehhVar});
            return;
        }
        b(ehhVar);
        d();
        a(this.g, ehhVar, false);
        a(this.g);
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        super.a();
        CartBarViewHolder cartBarViewHolder = this.q;
        if (cartBarViewHolder == null) {
            return;
        }
        cartBarViewHolder.a();
    }

    private void a(TaoDetailActionBarV2 taoDetailActionBarV2) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0293758", new Object[]{this, taoDetailActionBarV2});
        } else if (taoDetailActionBarV2 == null) {
        } else {
            if (!com.taobao.android.detail.core.aura.utils.a.b(this.f9568a) && !s.b()) {
                z = false;
            }
            taoDetailActionBarV2.setTabsContainerVisibility(z);
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        try {
            if (!god.b) {
                return;
            }
            FestivalMgr a2 = FestivalMgr.a();
            boolean f = a2.f();
            if (this.g == null || a2 == null || !f) {
                return;
            }
            String a3 = a2.a("global", "actionBarBackgroundImage");
            int a4 = a2.a("global", "actionbarTextColor", -1);
            int a5 = a2.a("global", "actionbarTextSelColor", -192);
            int a6 = a2.a("global", "actionbarTextColor", -197380);
            int a7 = a2.a("global", "actionBarBackgroundColor", -65386);
            this.g.setItemColor(a4);
            this.g.setTabSelectedColor(a5);
            this.g.setTabUnSelectedColor(a6);
            this.g.setActionBarBackgroundColor(a7);
            if (StringUtils.isEmpty(a3)) {
                return;
            }
            com.taobao.phenix.intf.b.h().a(a3).succListener(new com.taobao.phenix.intf.event.a<SuccPhenixEvent>() { // from class: com.taobao.android.detail.wrapper.ext.component.actionbar.b.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    b.this = this;
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
                    if (succPhenixEvent.getDrawable() != null && !succPhenixEvent.isIntermediate() && (drawable = succPhenixEvent.getDrawable()) != null && b.a(b.this) != null) {
                        b.a(b.this).setActionBarBackgroundDrawable(drawable);
                    }
                    return true;
                }
            }).failListener(new com.taobao.phenix.intf.event.a<FailPhenixEvent>() { // from class: com.taobao.android.detail.wrapper.ext.component.actionbar.b.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public boolean a(FailPhenixEvent failPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Boolean) ipChange2.ipc$dispatch("64c1ef50", new Object[]{this, failPhenixEvent})).booleanValue();
                    }
                    return true;
                }

                {
                    b.this = this;
                }

                @Override // com.taobao.phenix.intf.event.a
                public /* synthetic */ boolean onHappen(FailPhenixEvent failPhenixEvent) {
                    IpChange ipChange2 = $ipChange;
                    return ipChange2 instanceof IpChange ? ((Boolean) ipChange2.ipc$dispatch("d1090e38", new Object[]{this, failPhenixEvent})).booleanValue() : a(failPhenixEvent);
                }
            }).fetch();
        } catch (Throwable unused) {
        }
    }

    private void a(TaoDetailActionBarV2 taoDetailActionBarV2, ehh ehhVar, boolean z) {
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65100fb1", new Object[]{this, taoDetailActionBarV2, ehhVar, new Boolean(z)});
        } else if (taoDetailActionBarV2 != null && ehhVar != null) {
            if (ehhVar.k != null && ehhVar.k.f27309a != null) {
                taoDetailActionBarV2.setTabNum(ehhVar.k.f27309a.size());
            }
            if (ehhVar.g != null) {
                if (eme.a(this.f9568a)) {
                    ehhVar.g.c = "퀺";
                }
                taoDetailActionBarV2.addLeftView(a(ehhVar.g));
            }
            List<C0438b> list = this.k;
            if (list == null || list.size() <= 0) {
                z2 = false;
            } else {
                loop0: while (true) {
                    z2 = false;
                    for (C0438b c0438b : this.k) {
                        if (c0438b != null) {
                            View b = b(c0438b);
                            if (c0438b.a() == 1) {
                                taoDetailActionBarV2.addSearchView(b);
                                if (b != null) {
                                    z2 = true;
                                }
                            } else {
                                taoDetailActionBarV2.addSpecialIconView(b);
                            }
                        }
                    }
                }
            }
            if (!z2) {
                taoDetailActionBarV2.addSearchView(new View(this.f9568a));
            }
            if (ehhVar.i != null) {
                View a2 = a(ehhVar.i);
                a2.setId(R.id.tao_detail_cart_item);
                if (!this.q.a(a2, taoDetailActionBarV2, f())) {
                    taoDetailActionBarV2.addCustomView(a2);
                }
            }
            if (ehhVar.j != null) {
                TBActionView tBActionView = (TBActionView) com.taobao.android.detail.core.async.d.b(this.f9568a, R.layout.x_detail_action_bar_more_v2);
                tBActionView.setTitle(this.f9568a.getString(R.string.detail_menu_more_text));
                tBActionView.switchActionStyle(TBActionBar.ActionBarStyle.NORMAL);
                if (f()) {
                    tBActionView.setBackgroundResource(R.drawable.x_detail_action_bar_circular_bg_v2);
                }
                taoDetailActionBarV2.addRightView(tBActionView);
                a(tBActionView);
            }
            if (ehhVar.k != null && ehhVar.k.f27309a != null && ehhVar.k.f27309a.size() > 0 && !z) {
                taoDetailActionBarV2.addNavTabsBar();
                Iterator<ehf> it = ehhVar.k.f27309a.iterator();
                while (it.hasNext()) {
                    ehf next = it.next();
                    if (next != null) {
                        if (!StringUtils.isEmpty(next.d)) {
                            taoDetailActionBarV2.addTabWithImage(next.d, next.events);
                        } else if (!StringUtils.isEmpty(next.c)) {
                            taoDetailActionBarV2.addTabWithText(next.c, next.events);
                        }
                    }
                }
            }
            taoDetailActionBarV2.initialize();
        }
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
            publicMenu.addCustomMenus(arrayList, new TBPublicMenu.TBOnPublicMenuClickListener() { // from class: com.taobao.android.detail.wrapper.ext.component.actionbar.b.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    b.this = this;
                }

                @Override // com.taobao.uikit.actionbar.TBPublicMenu.TBOnPublicMenuClickListener
                public void onPublicMenuItemClicked(TBPublicMenuItem tBPublicMenuItem) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("478e7772", new Object[]{this, tBPublicMenuItem});
                    } else if (tBPublicMenuItem == null || tBPublicMenuItem.getId() != 9000004) {
                    } else {
                        f.a(b.b(b.this), new eoi(TitleViewModel.ShareType.SHARE_TYPE_DEFAULT));
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(new eny(b.c(b.this).getString(R.string.detail_profile_btn_index), b.d(b.this).getString(R.string.detail_menu_share), null));
                        ead.a(b.e(b.this), arrayList2);
                    }
                }
            });
        }
    }

    private HashMap<String, String> e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("e742bccf", new Object[]{this}) : new HashMap<String, String>() { // from class: com.taobao.android.detail.wrapper.ext.component.actionbar.NavBarHolderV2$4
            {
                b.this = this;
                put(sku.KEY_VIDEO_TYPE, b.f(b.this) ? "3-4" : "1-1");
            }
        };
    }

    public TIconFontTextView a(C0438b c0438b) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TIconFontTextView) ipChange.ipc$dispatch("17c593bd", new Object[]{this, c0438b});
        }
        TIconFontTextView tIconFontTextView = new TIconFontTextView(this.f9568a);
        tIconFontTextView.setGravity(17);
        tIconFontTextView.setIncludeFontPadding(false);
        tIconFontTextView.setTextColor(CollectionTabLayout.SELECTED_TEXT_COLOR);
        if (f()) {
            tIconFontTextView.setBackgroundResource(R.drawable.x_detail_action_bar_circular_bg_v2);
        }
        TaoDetailActionBarV2 taoDetailActionBarV2 = this.g;
        if (taoDetailActionBarV2 != null) {
            tIconFontTextView.setTextSize(0, (int) (taoDetailActionBarV2.getNavHeadHeight() * 0.375f));
        } else {
            tIconFontTextView.setTextSize(1, 18.0f);
        }
        return tIconFontTextView;
    }

    private View b(final C0438b c0438b) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("234c0a93", new Object[]{this, c0438b});
        }
        if (c0438b == null || StringUtils.isEmpty(c0438b.c()) || StringUtils.isEmpty(c0438b.b())) {
            return null;
        }
        int a2 = c0438b.a();
        if (a2 == 1) {
            View b = com.taobao.android.detail.core.async.d.b(this.f9568a, R.layout.x_detail_action_bar_search);
            this.j = b;
            c(c0438b);
            return b;
        } else if (a2 == 2) {
            TIconFontTextView a3 = a(c0438b);
            a3.setText(c0438b.c());
            a3.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.wrapper.ext.component.actionbar.b.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    b.this = this;
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    eps.a(b.g(b.this), "Navigation-Share", b.h(b.this));
                    f.a(b.i(b.this), new eoi(TitleViewModel.ShareType.SHARE_TYPE_DEFAULT));
                }
            });
            a3.setContentDescription("分享");
            return a3;
        } else if (a2 == 3) {
            View a4 = feu.a(this.f9568a, c(), this.g.getNavItemWH());
            if (a4 != null) {
                View a5 = feu.a(this.f9568a, a4, c());
                a5.setContentDescription("淘友圈");
                return a5;
            }
            TIconFontTextView a6 = a(c0438b);
            a6.setText(c0438b.c());
            TaoDetailActionBarV2 taoDetailActionBarV2 = this.g;
            if (taoDetailActionBarV2 != null) {
                taoDetailActionBarV2.setTaoMomentsView(a6);
            }
            View a7 = feu.a(this.f9568a, a6, c());
            a7.setContentDescription("淘友圈");
            return a7;
        } else {
            TIconFontTextView tIconFontTextView = new TIconFontTextView(this.f9568a);
            tIconFontTextView.setId(R.id.tao_detail_action_bar_search_normal_item);
            tIconFontTextView.setGravity(17);
            tIconFontTextView.setIncludeFontPadding(false);
            tIconFontTextView.setTextColor(CollectionTabLayout.SELECTED_TEXT_COLOR);
            if (f()) {
                tIconFontTextView.setBackgroundResource(R.drawable.x_detail_action_bar_circular_bg_v2);
            }
            TaoDetailActionBarV2 taoDetailActionBarV22 = this.g;
            if (taoDetailActionBarV22 != null) {
                tIconFontTextView.setTextSize(0, (int) (taoDetailActionBarV22.getNavHeadHeight() * 0.375f));
            } else {
                tIconFontTextView.setTextSize(1, 18.0f);
            }
            tIconFontTextView.setText(c0438b.c());
            tIconFontTextView.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.detail.wrapper.ext.component.actionbar.b.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                {
                    b.this = this;
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    eps.a(b.j(b.this), "Home", b.h(b.this));
                    epq.a(b.k(b.this), c0438b.b());
                }
            });
            return tIconFontTextView;
        }
    }

    private void c(C0438b c0438b) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("925710f0", new Object[]{this, c0438b});
            return;
        }
        try {
            Uri parse = Uri.parse(c0438b.b());
            a(this.i != null ? this.i.f11365a : parse.getQueryParameter("showText"), this.i != null ? this.i.b : parse.toString(), this.i != null ? this.i.c : "", c0438b.c(), parse.getQueryParameter(noa.KEY_SEARCHDOOR_LAUNCH_MODE), this.i != null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void a(String str, String str2, final String str3, String str4, String str5, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d8223ba", new Object[]{this, str, str2, str3, str4, str5, new Boolean(z)});
            return;
        }
        View view = this.j;
        if (view == null) {
            return;
        }
        TextView textView = (TextView) view.findViewById(R.id.if_action_bar_search_icon);
        TextView textView2 = (TextView) this.j.findViewById(R.id.if_action_bar_search_text);
        if (!StringUtils.isEmpty(str4)) {
            textView.setText(str4);
        }
        if (!StringUtils.isEmpty(str)) {
            textView2.setText(str);
        }
        textView2.setContentDescription(str + "搜索文本栏");
        this.g.setSearchHintExposureListener(new a() { // from class: com.taobao.android.detail.wrapper.ext.component.actionbar.b.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            {
                b.this = this;
            }

            @Override // com.taobao.android.detail.wrapper.ext.component.actionbar.b.a
            public void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                } else if (!z) {
                } else {
                    ecf.e(b.l(b.this), b.a(b.this, str3));
                }
            }
        });
        this.r = z;
        this.s = str3;
        this.t = str5;
        this.u = str2;
        if (this.j.hasOnClickListeners()) {
            return;
        }
        this.j.setOnClickListener(this.v);
    }

    private Map<String, String> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bf3e1ee7", new Object[]{this, str});
        }
        HashMap hashMap = new HashMap();
        if (!StringUtils.isEmpty(str)) {
            hashMap.put("utParams", str);
        }
        if (!(this.f9568a instanceof DetailCoreActivity)) {
            return hashMap;
        }
        if (((DetailCoreActivity) this.f9568a).F()) {
            hashMap.put(BioDetector.EXT_KEY_CARD_TYPE, "industry");
        } else {
            hashMap.put(BioDetector.EXT_KEY_CARD_TYPE, "detail2.0");
        }
        return hashMap;
    }

    private boolean f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5b2e1f1", new Object[]{this})).booleanValue() : this.l && !this.n;
    }

    public View a(ehe eheVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("53fdc238", new Object[]{this, eheVar});
        }
        if (eheVar == null) {
            return null;
        }
        TIconFontTextView tIconFontTextView = new TIconFontTextView(this.f9568a);
        tIconFontTextView.setGravity(17);
        tIconFontTextView.setIncludeFontPadding(false);
        tIconFontTextView.setTextColor(CollectionTabLayout.SELECTED_TEXT_COLOR);
        if (f()) {
            tIconFontTextView.setBackgroundResource(R.drawable.x_detail_action_bar_circular_bg_v2);
        }
        double d = eheVar.b;
        if (d < 1.0E-5d) {
            d = 0.375d;
        }
        TaoDetailActionBarV2 taoDetailActionBarV2 = this.g;
        if (taoDetailActionBarV2 != null) {
            tIconFontTextView.setTextSize(0, (int) (taoDetailActionBarV2.getNavHeadHeight() * d));
        } else {
            tIconFontTextView.setTextSize(1, 18.0f);
        }
        tIconFontTextView.setText(eheVar.c);
        com.taobao.android.detail.core.detail.kit.utils.d.a(this.f9568a, this.c, tIconFontTextView, eheVar.events);
        if (eheVar.component != null && eheVar.component.mapping != null && eheVar.component.mapping.containsKey("accessHint")) {
            String string = eheVar.component.mapping.getString("accessHint");
            if (!StringUtils.isEmpty(string)) {
                tIconFontTextView.setContentDescription(string);
            }
        }
        if (eheVar.dmComponent != null && eheVar.dmComponent.getFields() != null && eheVar.dmComponent.getFields().getJSONObject("payload") != null && eheVar.dmComponent.getFields().getJSONObject("payload").containsKey("accessHint")) {
            String string2 = eheVar.dmComponent.getFields().getJSONObject("payload").getString("accessHint");
            if (!StringUtils.isEmpty(string2)) {
                tIconFontTextView.setContentDescription(string2);
            }
        }
        return tIconFontTextView;
    }

    @Override // com.taobao.android.detail.wrapper.ext.component.actionbar.a
    public void a(ViewGroup viewGroup, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8f4670d", new Object[]{this, viewGroup, new Boolean(z)});
        } else if (this.g == null || viewGroup == null) {
        } else {
            if (viewGroup.getChildCount() > 0) {
                viewGroup.removeAllViews();
            }
            viewGroup.addView(this.g, new LinearLayout.LayoutParams(-1, -2));
        }
    }

    @Override // com.taobao.android.detail.wrapper.ext.request.client.search.a.InterfaceC0447a
    public void a(SearchInfoApiRequestClient.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b50a4cc", new Object[]{this, aVar});
            return;
        }
        this.i = aVar;
        if (aVar == null) {
            return;
        }
        a(aVar.f11365a, aVar.b, aVar.c, null, null, true);
    }

    /* renamed from: com.taobao.android.detail.wrapper.ext.component.actionbar.b$b */
    /* loaded from: classes5.dex */
    public static class C0438b {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int TYPE_NORMAL = 0;
        public static final int TYPE_SEARCH = 1;
        public static final int TYPE_SHARE = 2;
        public static final int TYPE_TAO_MOMENTS = 3;

        /* renamed from: a */
        private int f11130a;
        private String b;
        private String c;

        static {
            kge.a(1572105328);
        }

        public C0438b(int i, String str, String str2) {
            this.f11130a = i;
            this.b = str;
            this.c = str2;
        }

        public int a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.f11130a;
        }

        public String b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
        }

        public String c() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.c;
        }
    }
}
