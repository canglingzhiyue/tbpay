package com.taobao.android.detail.wrapper.ext.event;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.event.basic.k;
import com.taobao.android.detail.core.event.basic.n;
import com.taobao.android.detail.core.event.basic.o;
import com.taobao.android.detail.core.open.g;
import com.taobao.android.detail.datasdk.event.sku.OpenSkuEvent;
import com.taobao.android.detail.wrapper.activity.DetailActivity;
import com.taobao.android.detail.wrapper.ext.event.subscriber.basic.WangxinChatSubscriber;
import com.taobao.android.detail.wrapper.ext.event.subscriber.basic.f;
import com.taobao.android.detail.wrapper.ext.event.subscriber.basic.h;
import com.taobao.android.detail.wrapper.ext.event.subscriber.basic.i;
import com.taobao.android.detail.wrapper.ext.event.subscriber.fav.DoFavSubscriber;
import tb.edd;
import tb.edm;
import tb.edx;
import tb.edy;
import tb.eed;
import tb.eee;
import tb.eef;
import tb.eeg;
import tb.eeh;
import tb.emu;
import tb.enq;
import tb.enr;
import tb.ens;
import tb.ent;
import tb.env;
import tb.enx;
import tb.enz;
import tb.eoa;
import tb.eob;
import tb.eod;
import tb.eoh;
import tb.eoi;
import tb.fck;
import tb.fcl;
import tb.fcm;
import tb.fcn;
import tb.fcp;
import tb.fcr;
import tb.fcs;
import tb.fct;
import tb.fcu;
import tb.fcv;
import tb.fcw;
import tb.fcx;
import tb.fdb;
import tb.fdc;
import tb.fdd;
import tb.fde;
import tb.fdf;
import tb.fdg;
import tb.fdh;
import tb.fdi;
import tb.fdj;
import tb.fdk;
import tb.fdl;
import tb.fdm;
import tb.fdn;
import tb.fdo;
import tb.fdp;
import tb.fdq;
import tb.fdr;
import tb.fds;
import tb.fdt;
import tb.fdu;
import tb.kge;

/* loaded from: classes5.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(436453317);
        emu.a("com.taobao.android.detail.wrapper.ext.event.TBEventRegister");
    }

    public static void a(g gVar, DetailActivity detailActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab294d16", new Object[]{gVar, detailActivity});
            return;
        }
        gVar.a(eed.class, new fdp(detailActivity));
        gVar.a(eod.class, new com.taobao.android.detail.wrapper.ext.event.subscriber.sku.c(detailActivity));
        gVar.a(k.class, new f(detailActivity));
        fdm fdmVar = new fdm(detailActivity);
        gVar.a(edy.class, fdmVar);
        gVar.a(edx.class, fdmVar);
        gVar.a(edm.class, new i(detailActivity));
        gVar.a(enx.class, new fdg(detailActivity));
        gVar.a(enx.class, new fdh(detailActivity));
        gVar.a(o.class, new com.taobao.android.detail.wrapper.ext.video.e(detailActivity));
        gVar.a(eob.class, new com.taobao.android.detail.wrapper.ext.event.subscriber.jhs.b(detailActivity));
        gVar.a(eee.class, new com.taobao.android.detail.wrapper.ext.event.subscriber.remind.a(detailActivity));
        gVar.a(eef.class, new com.taobao.android.detail.wrapper.ext.event.subscriber.remind.b(detailActivity));
        gVar.a(enz.class, new fdf(detailActivity));
        gVar.a(eoa.class, new com.taobao.android.detail.wrapper.ext.event.subscriber.desc.a(detailActivity));
        gVar.a(fcx.class, new DoFavSubscriber(detailActivity));
        gVar.a(fcr.class, new fdu(detailActivity));
        gVar.a(fcn.class, new fdr(detailActivity));
        gVar.a(enq.class, new com.taobao.android.detail.wrapper.ext.event.subscriber.basic.a(detailActivity));
        gVar.a(eoh.class, new fdb(detailActivity));
        gVar.a(OpenSkuEvent.class, new com.taobao.android.detail.wrapper.ext.event.subscriber.sku.d(detailActivity));
        gVar.a(com.taobao.android.detail.wrapper.ext.event.subscriber.sku.a.class, new com.taobao.android.detail.wrapper.ext.event.subscriber.sku.b(detailActivity));
        gVar.a(fcw.class, new fdi(detailActivity));
        gVar.a(com.taobao.android.detail.wrapper.ext.event.subscriber.basic.c.class, new fdj(detailActivity));
        gVar.a(ent.class, new fdk(detailActivity));
        gVar.a(fcm.class, new com.taobao.android.detail.wrapper.ext.event.subscriber.basic.e(detailActivity));
        gVar.a(fct.class, new fdc(detailActivity));
        gVar.a(fcu.class, new fdd(detailActivity));
        gVar.a(fcv.class, new fde(detailActivity));
        gVar.a(env.class, new WangxinChatSubscriber(detailActivity));
        gVar.a(eoi.class, new fdt(detailActivity));
        gVar.a(ens.class, new fdo(detailActivity));
        gVar.a(fcp.class, new com.taobao.android.detail.wrapper.ext.event.subscriber.basic.g(detailActivity));
        gVar.a(fck.class, new com.taobao.android.detail.wrapper.ext.event.subscriber.basic.b(detailActivity));
        gVar.a(fcl.class, new com.taobao.android.detail.wrapper.ext.event.subscriber.basic.d(detailActivity));
        gVar.a(enr.class, new fdl(detailActivity));
        gVar.a(eeg.class, new fdq(detailActivity));
        gVar.a(eeh.class, new fds(detailActivity));
        gVar.a(edd.class, new fdn(detailActivity));
        gVar.a(n.class, new com.taobao.android.detail.wrapper.ext.component.main.viewholder.galleryheader.core.e(detailActivity));
        gVar.a(fcs.class, new h(detailActivity));
    }
}
