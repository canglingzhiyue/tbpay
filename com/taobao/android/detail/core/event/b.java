package com.taobao.android.detail.core.event;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.activity.DetailCoreActivity;
import com.taobao.android.detail.core.detail.content.ContentDXSubscriber;
import com.taobao.android.detail.core.event.basic.GetCommonTrackArgsEvent;
import com.taobao.android.detail.core.event.basic.PreventRepetitionFilter;
import com.taobao.android.detail.core.event.basic.g;
import com.taobao.android.detail.core.event.basic.i;
import com.taobao.android.detail.core.event.basic.j;
import com.taobao.android.detail.core.event.basic.l;
import com.taobao.android.detail.core.event.basic.p;
import com.taobao.android.detail.core.event.basic.q;
import com.taobao.android.detail.core.event.popup.OpenCommonDialogEvent;
import com.taobao.android.detail.core.event.subscriber.jhs.JoinJhsSubscriber;
import com.taobao.android.detail.core.event.subscriber.market.MarketAddCartSubscriber;
import com.taobao.android.detail.core.event.subscriber.trade.AchieveCouponAfterCartSubscriber;
import com.taobao.android.detail.core.event.subscriber.trade.AddCartSubscriber;
import com.taobao.android.trade.event.d;
import com.taobao.android.trade.event.f;
import tb.edc;
import tb.ede;
import tb.edn;
import tb.edo;
import tb.edp;
import tb.edq;
import tb.edr;
import tb.edt;
import tb.edu;
import tb.edv;
import tb.edz;
import tb.eej;
import tb.eek;
import tb.eel;
import tb.eem;
import tb.een;
import tb.eeo;
import tb.eep;
import tb.eeq;
import tb.eer;
import tb.ees;
import tb.eet;
import tb.eeu;
import tb.eev;
import tb.eew;
import tb.eex;
import tb.eey;
import tb.eez;
import tb.efa;
import tb.efb;
import tb.efc;
import tb.efd;
import tb.eff;
import tb.efg;
import tb.efl;
import tb.efo;
import tb.efp;
import tb.efq;
import tb.efr;
import tb.eft;
import tb.efu;
import tb.efw;
import tb.emu;
import tb.eno;
import tb.enp;
import tb.enu;
import tb.enw;
import tb.eny;
import tb.eof;
import tb.kge;

/* loaded from: classes4.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "SubscribeManager";

    static {
        kge.a(-676388931);
        emu.a("com.taobao.android.detail.core.event.SubscribeManager");
    }

    public static void a(DetailCoreActivity detailCoreActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("349c12f3", new Object[]{detailCoreActivity});
            return;
        }
        d a2 = f.a(detailCoreActivity);
        a2.a(eno.a(enu.class), new eep(detailCoreActivity), new PreventRepetitionFilter());
        a2.a(eno.a(eny.class), new eet(detailCoreActivity));
        a2.a(eno.a(efq.class), new efl(detailCoreActivity));
        a2.a(eno.a(efu.class), new com.taobao.android.detail.core.event.subscriber.trade.b(detailCoreActivity), new PreventRepetitionFilter(400L));
        a2.a(eno.a(edu.class), new JoinJhsSubscriber(detailCoreActivity));
        a2.a(eno.a(efr.class), new AddCartSubscriber(detailCoreActivity));
        a2.a(eno.a(edv.class), new MarketAddCartSubscriber(detailCoreActivity));
        a2.a(eno.a(ede.class), new eeu(detailCoreActivity));
        a2.a(eno.a(edo.class), new eev(detailCoreActivity));
        a2.a(eno.a(p.class), new eeq(detailCoreActivity));
        a2.a(eno.a(i.class), new een(detailCoreActivity));
        a2.a(eno.a(edp.class), new eew(detailCoreActivity));
        a2.a(eno.a(eof.class), new efg(detailCoreActivity));
        a2.a(eno.a(enp.class), new eek(detailCoreActivity));
        a2.a(eno.a(com.taobao.android.detail.core.event.basic.b.class), new eej(detailCoreActivity));
        a2.a(eno.a(GetCommonTrackArgsEvent.class), new eel(detailCoreActivity));
        a2.a(eno.a(edt.class), new efb(detailCoreActivity));
        a2.a(9999, new efc(detailCoreActivity));
        a2.a(eno.a(q.class), new eer(detailCoreActivity));
        a2.a(eno.a(j.class), new efa(detailCoreActivity));
        a2.a(eno.a(edq.class), new eey(detailCoreActivity));
        a2.a(eno.a(enw.class), new ees(detailCoreActivity));
        a2.a(eno.a(edn.class), new efo(detailCoreActivity));
        a2.a(eno.a(eft.class), new com.taobao.android.detail.core.event.subscriber.trade.a(detailCoreActivity));
        a2.a(eno.a(edz.class), new efd(detailCoreActivity));
        a2.a(eno.a(l.class), new eex(detailCoreActivity));
        a2.a(eno.a(efw.class), new efp(detailCoreActivity));
        a2.a(eno.a(g.class), new eem(detailCoreActivity));
        a2.a(eno.a(com.taobao.android.detail.core.event.popup.b.class), new eff(detailCoreActivity));
        a2.a(eno.a(edr.class), new eez(detailCoreActivity));
        a2.a(eno.a(edc.class), new AchieveCouponAfterCartSubscriber(detailCoreActivity));
        a2.a(eno.a(com.taobao.android.detail.core.detail.content.b.class), new ContentDXSubscriber(detailCoreActivity));
        a2.a(eno.a(OpenCommonDialogEvent.class), new eeo(detailCoreActivity));
    }
}
