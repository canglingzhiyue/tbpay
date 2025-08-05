package tb;

import android.app.Application;
import android.content.Context;
import android.os.HandlerThread;
import com.alibaba.ability.localization.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.android.searchbaseframe.business.srp.SFSrpConfig;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.android.searchbaseframe.util.k;
import com.taobao.android.searchbaseframe.util.n;
import com.taobao.android.weex_framework.m;
import com.taobao.search.common.util.c;
import com.taobao.search.common.util.q;
import com.taobao.search.common.util.u;
import com.taobao.search.jarvis.SearchJarvisCallback;
import com.taobao.search.jarvis.SearchJarvisInputProvider;
import com.taobao.search.jarvis.action.SearchFetchAction;
import com.taobao.search.jarvis.action.SearchRerankAction;
import com.taobao.search.m3.g;
import com.taobao.search.m3.widget.f;
import com.taobao.search.musie.j;
import com.taobao.search.musie.r;
import com.taobao.search.searchdoor.activate.guess.GuessDiscoveryCellBean;
import com.taobao.search.searchdoor.activate.hotspot.HotSpots;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.ActivateCellBean;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.ActivateTypedBean;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.CombineHistoryCellBean;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.HistoryCellBean;
import com.taobao.search.searchdoor.sf.widgets.suggest.data.SuggestCellBean;
import com.taobao.search.sf.o;
import com.taobao.search.sf.widgets.list.listcell.tips.a;
import com.taobao.search.sf.widgets.preposefilter.e;
import com.taobao.search.sf.widgets.preposefilter.i;
import com.taobao.search.sf.widgets.preposefilter.perf.OriginPreposeFilterBean;
import com.taobao.search.sf.widgets.topbar.d;
import com.taobao.tao.TaoApplication;
import tb.isd;
import tb.itb;

/* loaded from: classes8.dex */
public class nsv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static isd f31739a;

    static {
        kge.a(-1090986210);
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[0]);
            return;
        }
        SFSrpConfig.b bVar = (SFSrpConfig.b) f31739a.a();
        if (b.f()) {
            bVar.a(new e(false), nuy.PREPOSE_FILTER_CREATOR);
        } else {
            bVar.a(new e(false), u.s() ? nuy.RECYCLER_PREPOSE_FILTER_CREATOR : nuy.PREPOSE_FILTER_CREATOR);
        }
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
            return;
        }
        k.e("SearchFrameworkInitManager", "init search framework");
        q.a(c.a());
        isd.b l = f31739a.l();
        l.b("TaobaoPhoneSearch");
        l.a("https://market.wapa.taobao.com/app/etaowireless/m-search-chitu/chitupanel/index.html");
        l.c("http://admin.search.taobao.com/chitu/ChituApiLog/requestUpload");
        f31739a.j().a("TBSearch.");
        f31739a.j().c("search");
        f31739a.j().b("s.m.taobao.com");
        f31739a.j().a(nuf.class);
        isd.a h = f31739a.h();
        a aVar = new a();
        itb.a aVar2 = nux.TIPS_CREATOR;
        h.a(aVar, aVar2, aVar2);
        com.taobao.search.sf.widgets.list.listcell.crosstips.a aVar3 = new com.taobao.search.sf.widgets.list.listcell.crosstips.a();
        itb.a aVar4 = nux.CROSS_TIPS_CREATOR;
        h.a(aVar3, aVar4, aVar4);
        h.a("nt_auction_newindustry", new g(), com.taobao.search.m3.widget.e.Companion.a(), f.Companion.a());
        h.a("nt_tmallAuction", new g(), com.taobao.search.m3.widget.e.Companion.a(), f.Companion.a());
        h.a("nt_auction_ad_video_2019", new g(), com.taobao.search.m3.widget.e.Companion.a(), f.Companion.a());
        h.a("nt_ad_auction_live", new g(), com.taobao.search.m3.widget.e.Companion.a(), f.Companion.a());
        h.a("nt_auction_2019", new g(), com.taobao.search.m3.widget.e.Companion.a(), f.Companion.a());
        h.a(new g(), com.taobao.search.m3.widget.e.Companion.a(), f.Companion.a());
        h.a(new com.taobao.search.sf.widgets.list.listcell.defaultauction.a(), nux.DEFAULT_AUCTION_CELL_LIST_CREATOR, nux.DEFAULT_AUCTION_CELL_WF_CREATOR);
        com.taobao.search.sf.widgets.list.listcell.defaultshop.a aVar5 = new com.taobao.search.sf.widgets.list.listcell.defaultshop.a();
        itb.a aVar6 = nux.DEFAULT_SHOP_CELL_CREATOR;
        h.a(aVar5, aVar6, aVar6);
        h.a("nt_inshop_auction_radius", new com.taobao.search.sf.widgets.list.listcell.inshopauction2020.a(), nux.INSHOP_AUCTION_2020_LIST_CREATOR, nux.INSHOP_AUCTION_2020_WF_CREATOR);
        h.a(new com.taobao.search.sf.widgets.list.listcell.inshopauction2020.a(), nux.INSHOP_AUCTION_2020_LIST_CREATOR, nux.INSHOP_AUCTION_2020_WF_CREATOR);
        SFSrpConfig.b bVar = (SFSrpConfig.b) f31739a.a();
        bVar.a(new nom(), nuy.ONESEARCH_CREATOR);
        bVar.a(new d(), nuy.TOPBAR_CREATOR);
        c();
        bVar.a(new i(true), OriginPreposeFilterBean.class, nuy.RECYCLER_PREPOSE_FILTER_CREATOR);
        bVar.a(new com.taobao.search.sf.widgets.topbar.b(), nuy.INSHOP_TOPBAR_CREATOR);
        bVar.e(nuy.TAB_VIEW_CREATOR);
        bVar.f(nuy.TAB_PRESENTER_CREATOR);
        bVar.a(new com.taobao.search.sf.widgets.globaladdress.c(), nuy.GLOBAL_ADDRESS_CREATOR);
        ((SFSrpConfig.c) f31739a.c()).a(new com.taobao.search.sf.widgets.list.promotionfilter.a(), nuy.PROMOTION_FILTER_WIDGET_CREATOR);
        f31739a.a(new ise<Void, HandlerThread>() { // from class: tb.nsv.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.ise
            public HandlerThread a(Void r4) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (HandlerThread) ipChange2.ipc$dispatch("16d01ed", new Object[]{this, r4}) : jbg.a("tb-search-thread");
            }
        });
    }

    public static void a(iml imlVar, Context context, float f, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7db8168", new Object[]{imlVar, context, new Float(f), new Integer(i), new Integer(i2)});
            return;
        }
        j.a((Application) context.getApplicationContext());
        imn imnVar = com.taobao.search.sf.j.f19452a;
        if (imnVar == null) {
            imnVar = imo.d().a(context).a(f, i2, i, a(context), TaoApplication.getVersion()).a("tbsearch_preference").a(new n.a() { // from class: tb.nsv.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.searchbaseframe.util.n.a
                public void a(Context context2, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("61b6362a", new Object[]{this, context2, str});
                    } else {
                        Nav.from(context2).toUri(str);
                    }
                }
            }).a(imlVar).a();
            com.taobao.search.sf.j.f19452a = imnVar;
        }
        imnVar.c().h().b(r.CREATOR);
        imnVar.c().i().b(com.taobao.search.musie.q.CREATOR);
        imnVar.c().j().b(u.m());
        nsk nskVar = new nsk();
        imnVar.p().a(nsj.CONVERTER_NAME, new nsj());
        imnVar.p().a(nsk.CONVERTER_NAME, nskVar);
        imnVar.p().a(nskVar);
        com.taobao.search.sf.j.f19452a = imnVar;
        f31739a = imnVar.c();
        jza.a(imnVar, o.a(imnVar));
        jza.a(imnVar, new nts());
        imnVar.o().a(new com.taobao.search.common.util.i());
        jxp jxpVar = new jxp();
        jxpVar.a(false);
        jxpVar.b(false);
        jxpVar.a(new com.taobao.search.jarvis.rcmd.b());
        jxpVar.b(SearchJarvisCallback.class);
        jxpVar.a(SearchJarvisInputProvider.class);
        jxpVar.a("fetch", SearchFetchAction.class);
        jxpVar.a("rerank", SearchRerankAction.class);
        imnVar.c().f(jxpVar);
        m.f15996a = com.taobao.search.common.util.n.INSTANCE.d();
        com.taobao.android.xsearchplugin.weex.weex.a.f16270a = com.taobao.search.common.util.r.am();
        nsk.f31726a = com.taobao.search.common.util.r.an();
        imnVar.c().j().a(nue.a());
    }

    public static void b(iml imlVar, Context context, float f, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("947bac69", new Object[]{imlVar, context, new Float(f), new Integer(i), new Integer(i2)});
        } else {
            com.taobao.search.sf.j.f19452a = imo.d().a(context).a(f, i2, i, a(context), TaoApplication.getVersion()).a("tbsearch_preference").a(new n.a() { // from class: tb.nsv.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.android.searchbaseframe.util.n.a
                public void a(Context context2, String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("61b6362a", new Object[]{this, context2, str});
                    } else {
                        Nav.from(context2).toUri(str);
                    }
                }
            }).a(imlVar).a();
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
            return;
        }
        npz.a().b().a(ListStyle.LIST, SuggestCellBean.class, nru.CREATOR);
        nqz<ActivateTypedBean> c = npz.a().c();
        c.a(ListStyle.LIST, HistoryCellBean.class, nql.CREATOR);
        c.a(ListStyle.LIST, CombineHistoryCellBean.class, nql.COMBINE_CREATOR);
        c.a(ListStyle.LIST, ActivateCellBean.class, nqi.CREATOR);
        npy d = npz.a().d();
        d.a(new nqt());
        d.a(new nqq());
        d.a(new com.taobao.search.searchdoor.sf.widgets.suggest.data.a());
        d.a(new nqs());
        d.a(new com.taobao.search.searchdoor.activate.guess.a());
        d.a(new com.taobao.search.searchdoor.activate.hotspot.b());
        c.a(ListStyle.LIST, HotSpots.class, com.taobao.search.searchdoor.activate.hotspot.d.Companion.a());
        c.a(ListStyle.LIST, GuessDiscoveryCellBean.class, com.taobao.search.searchdoor.activate.guess.b.Companion.a());
    }

    public static int a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9e1d6453", new Object[]{context})).intValue();
        }
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier <= 0) {
            return 0;
        }
        return context.getResources().getDimensionPixelSize(identifier);
    }
}
