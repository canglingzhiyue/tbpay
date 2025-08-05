package com.taobao.android.detail.ttdetail.utils;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.g;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.CheckPresaleImplementor;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.InviteRateImplementor;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.QuerySMBagPriceImplementor;
import com.taobao.taolive.dinamicext.dinamicx.m;
import java.util.concurrent.ConcurrentHashMap;
import tb.eyx;
import tb.ezh;
import tb.frg;
import tb.kge;
import tb.kqw;
import tb.kqx;
import tb.lez;
import tb.ocg;
import tb.onk;
import tb.onm;
import tb.onn;
import tb.pie;
import tb.pkw;
import tb.qup;
import tb.taf;
import tb.tag;
import tb.tah;
import tb.tai;
import tb.taj;
import tb.tak;
import tb.tan;
import tb.tao;
import tb.tap;
import tb.taq;
import tb.tar;
import tb.tas;
import tb.tat;
import tb.tau;
import tb.tav;
import tb.taw;
import tb.tax;
import tb.tdd;
import tb.tde;
import tb.xiz;
import tb.xjb;
import tb.xjc;
import tb.xjd;

/* loaded from: classes5.dex */
public class bc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(288003183);
    }

    public static void a(eyx eyxVar, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b945bc34", new Object[]{eyxVar, context});
            return;
        }
        bd.a(eyxVar, context);
        b(eyxVar, context);
        c(eyxVar, context);
        d(eyxVar, context);
        f(eyxVar, context);
        e(eyxVar, context);
        a(eyxVar.f());
    }

    private static void b(eyx eyxVar, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a9858d3", new Object[]{eyxVar, context});
            return;
        }
        com.taobao.android.detail.ttdetail.handler.bizhandlers.f fVar = new com.taobao.android.detail.ttdetail.handler.bizhandlers.f(context, eyxVar);
        eyxVar.c().a("buyNow", fVar);
        eyxVar.c().a(com.taobao.android.detail.ttdetail.handler.bizhandlers.f.EVENT_TYPE_ALTERNATIVE, fVar);
        com.taobao.android.detail.ttdetail.handler.bizhandlers.b bVar = new com.taobao.android.detail.ttdetail.handler.bizhandlers.b(context, eyxVar);
        eyxVar.c().a("addToCart", bVar);
        eyxVar.c().a(com.taobao.android.detail.ttdetail.handler.bizhandlers.b.EVENT_TYPE_ALTERNATIVE, bVar);
        com.taobao.android.detail.ttdetail.handler.bizhandlers.z zVar = new com.taobao.android.detail.ttdetail.handler.bizhandlers.z(context, eyxVar);
        eyxVar.c().a("openWW", zVar);
        eyxVar.c().a(com.taobao.android.detail.ttdetail.handler.bizhandlers.z.EVENT_TYPE_ALTERNATIVE, zVar);
        com.taobao.android.detail.ttdetail.handler.bizhandlers.s sVar = new com.taobao.android.detail.ttdetail.handler.bizhandlers.s(context, eyxVar);
        eyxVar.c().a("openRate", sVar);
        eyxVar.c().a(com.taobao.android.detail.ttdetail.handler.bizhandlers.s.EVENT_TYPE_ALTERNATIVE, sVar);
        com.taobao.android.detail.ttdetail.handler.bizhandlers.k kVar = new com.taobao.android.detail.ttdetail.handler.bizhandlers.k(context, eyxVar);
        eyxVar.c().a("openAddress", kVar);
        eyxVar.c().a(com.taobao.android.detail.ttdetail.handler.bizhandlers.k.EVENT_TYPE_ALTERNATIVE, kVar);
        eyxVar.c().a(com.taobao.android.detail.ttdetail.handler.bizhandlers.k.EVENT_TYPE_ALTERNATIVE_BACK_UP, kVar);
        com.taobao.android.detail.ttdetail.handler.bizhandlers.u uVar = new com.taobao.android.detail.ttdetail.handler.bizhandlers.u(context, eyxVar);
        eyxVar.c().a("openShare", uVar);
        eyxVar.c().a("share", uVar);
        com.taobao.android.detail.ttdetail.handler.bizhandlers.d dVar = new com.taobao.android.detail.ttdetail.handler.bizhandlers.d(context, eyxVar);
        eyxVar.c().a("addJhsWaiting", dVar);
        eyxVar.c().a(com.taobao.android.detail.ttdetail.handler.bizhandlers.d.EVENT_TYPE_ALTERNATIVE, dVar);
        com.taobao.android.detail.ttdetail.handler.bizhandlers.r rVar = new com.taobao.android.detail.ttdetail.handler.bizhandlers.r(context, eyxVar);
        eyxVar.c().a("openProductParams", rVar);
        eyxVar.c().a(com.taobao.android.detail.ttdetail.handler.bizhandlers.r.EVENT_TYPE_ALTERNATIVE, rVar);
        com.taobao.android.detail.ttdetail.handler.bizhandlers.q qVar = new com.taobao.android.detail.ttdetail.handler.bizhandlers.q(context);
        eyxVar.c().a("openPopLayer", qVar);
        eyxVar.c().a(com.taobao.android.detail.ttdetail.handler.bizhandlers.q.EVENT_TYPE_ALTERNATIVE, qVar);
        com.taobao.android.detail.ttdetail.handler.bizhandlers.y yVar = new com.taobao.android.detail.ttdetail.handler.bizhandlers.y(context, eyxVar);
        eyxVar.c().a("openTmallApp", yVar);
        eyxVar.c().a(com.taobao.android.detail.ttdetail.handler.bizhandlers.y.EVENT_TYPE_ALTERNATIVE, yVar);
        eyxVar.c().a("disappear", new com.taobao.android.detail.ttdetail.handler.bizhandlers.aa(context, eyxVar));
        eyxVar.c().a("ut_exposure", new com.taobao.android.detail.ttdetail.handler.bizhandlers.al(context, eyxVar));
        eyxVar.c().a("setRemind", new com.taobao.android.detail.ttdetail.handler.bizhandlers.ab(context, eyxVar));
        eyxVar.c().a("adjustState", new com.taobao.android.detail.ttdetail.handler.bizhandlers.e(context, eyxVar));
        eyxVar.c().a("request", new com.taobao.android.detail.ttdetail.handler.bizhandlers.m(context, eyxVar));
        eyxVar.c().a("checkPresale", new CheckPresaleImplementor(context, eyxVar));
        eyxVar.c().a("openPop", new com.taobao.android.detail.ttdetail.handler.bizhandlers.p(context, eyxVar));
        eyxVar.c().a(com.taobao.android.detail.ttdetail.handler.bizhandlers.i.EVENT_TYPE, new com.taobao.android.detail.ttdetail.handler.bizhandlers.i(context, eyxVar));
        eyxVar.c().a(com.taobao.android.detail.ttdetail.handler.bizhandlers.ae.EVENT_TYPE, new com.taobao.android.detail.ttdetail.handler.bizhandlers.ae(context, eyxVar));
        eyxVar.c().a("toast", new com.taobao.android.detail.ttdetail.handler.bizhandlers.ah(context));
        eyxVar.c().a(com.taobao.android.detail.ttdetail.handler.bizhandlers.l.EVENT_TYPE, new com.taobao.android.detail.ttdetail.handler.bizhandlers.l(context, eyxVar));
        eyxVar.c().a(com.taobao.android.detail.ttdetail.handler.bizhandlers.ad.EVENT_TYPE, new com.taobao.android.detail.ttdetail.handler.bizhandlers.ad(context));
        eyxVar.c().a(com.taobao.android.detail.ttdetail.handler.bizhandlers.v.EVENT_TYPE, new com.taobao.android.detail.ttdetail.handler.bizhandlers.v(context, eyxVar));
        eyxVar.c().a(com.taobao.android.detail.ttdetail.handler.bizhandlers.x.EVENT_TYPE, new com.taobao.android.detail.ttdetail.handler.bizhandlers.x(context, eyxVar));
        eyxVar.c().a(com.taobao.android.detail.ttdetail.handler.bizhandlers.o.EVENT_TYPE, new com.taobao.android.detail.ttdetail.handler.bizhandlers.o(context, eyxVar));
        eyxVar.c().a(com.taobao.android.detail.ttdetail.handler.bizhandlers.ag.EVENT_TYPE, new com.taobao.android.detail.ttdetail.handler.bizhandlers.ag(context, eyxVar));
        eyxVar.c().a("openRedPacket", new com.taobao.android.detail.ttdetail.handler.bizhandlers.t(context, eyxVar));
        eyxVar.c().a("checkCollect", new com.taobao.android.detail.ttdetail.handler.bizhandlers.g(context, eyxVar));
        eyxVar.c().a("collectClick", new com.taobao.android.detail.ttdetail.handler.bizhandlers.h(context, eyxVar));
        eyxVar.c().a(com.taobao.android.detail.ttdetail.handler.bizhandlers.af.EVENT_TYPE, new com.taobao.android.detail.ttdetail.handler.bizhandlers.af(context, eyxVar));
        eyxVar.c().a("change_sku_frame", new com.taobao.android.detail.ttdetail.handler.bizhandlers.ac(context, eyxVar));
        eyxVar.c().a("switch_main_pic", new com.taobao.android.detail.ttdetail.handler.bizhandlers.j(context, eyxVar));
        eyxVar.c().a("invateRate", new InviteRateImplementor(context, eyxVar));
        eyxVar.c().a("querySMBagPrice", new QuerySMBagPriceImplementor(context, eyxVar));
    }

    private static void c(eyx eyxVar, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7beaf572", new Object[]{eyxVar, context});
            return;
        }
        eyxVar.a().a(pie.PARSER_ID, new pie(context, eyxVar));
        eyxVar.a().a(pkw.PARSER_ID, new pkw(context, eyxVar));
    }

    private static void d(eyx eyxVar, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd3d9211", new Object[]{eyxVar, context});
            return;
        }
        eyxVar.d().a("native", "headerPic", new onm());
        eyxVar.d().a("native", kqw.NAME, new kqw());
        eyxVar.d().a("native", "navBar", new onn());
        eyxVar.d().a("native", ocg.NAME, new ocg());
        eyxVar.d().a("native", "descSuffixShrink", new lez());
        eyxVar.d().a("native", onk.NAME, new onk());
    }

    private static void f(eyx eyxVar, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fe2cb4f", new Object[]{eyxVar, context});
            return;
        }
        eyxVar.f().a(xiz.DX_ABILITY_ID, new xiz.a(context, eyxVar));
        eyxVar.f().a(xiz.MEGA_NAME, xiz.NAME, new xiz.a(context, eyxVar));
    }

    private static void e(eyx eyxVar, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e902eb0", new Object[]{eyxVar, context});
        } else {
            g(eyxVar, context);
        }
    }

    private static void g(eyx eyxVar, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13567ee", new Object[]{eyxVar, context});
        } else {
            eyxVar.f().a(qup.DX_EVENT_ID, new qup(context, eyxVar));
        }
    }

    public static void a(ezh ezhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7d5dfa5", new Object[]{ezhVar});
            return;
        }
        ezhVar.a(taq.DETAIL_WIDGET_ID, new taq.a());
        ezhVar.a(tav.f34001a, new tav.a());
        ezhVar.a(tar.DX_EVENT_ID, new tar.a());
        ezhVar.a(tax.f34004a, new tax.a());
        ezhVar.a(tau.f33998a, new tau.a());
        ezhVar.a(tas.f33996a, new tas.a());
        ezhVar.a(com.taobao.taolive.dinamicext.dinamicx.m.DXTBLIVEVIEW_TBLIVEVIEW, new m.a());
        ezhVar.a(taw.DXXSHADOWTEXTVIEW_XSHADOWTEXTVIEW, new taw.a());
        ezhVar.a(tat.DXXQINTERACTAVATARANIMATIONVIEW_XQINTERACTAVATARANIMATIONVIEW, new tat.a());
        ezhVar.a(tan.DX_WIDGET_ID, new tan.b());
        ezhVar.a(tao.VIEW_IDENTITY, new tao.a());
        ezhVar.a(tap.VIEW_IDENTITY, new tap.a());
        ezhVar.a(xjd.VIEW_IDENTITY, new xjd.a());
        ezhVar.a(xjc.DETAIL_WIDGET_ID, new xjc.a());
        ezhVar.a(tag.DX_PARSER_CANSHOWINSINGLELINE, new tag());
        ezhVar.a(taf.DX_PARSER_BYTELENGTH, new taf());
        ezhVar.a(tak.DX_PARSER_ID, new tak());
        ezhVar.a(tah.DX_PARSER_ID, new tah());
        ezhVar.a(xjb.DX_PARSER_ID, new xjb());
        if (e.b()) {
            ezhVar.a(frg.DX_PARSER_DX_ENV, new g.a());
        }
        ezhVar.a(com.taobao.android.detail.ttdetail.content.g.DX_PARSER_DETAILURLENCODE, new com.taobao.android.detail.ttdetail.content.g());
        ezhVar.a(-8964819166049023094L, new kqx());
        ezhVar.a(tde.DX_PARSER_LOCALDATE, new tde());
        ezhVar.a(tdd.DX_PARSER_KVSTORAGEGETITEM, new tdd());
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        ezhVar.a(taj.DX_EVENT_DETAILSKUSCROLLED, new taj(concurrentHashMap));
        ezhVar.a(tai.DX_PARSER_DETAILSKUGETSCROLLED, new tai(concurrentHashMap));
    }
}
