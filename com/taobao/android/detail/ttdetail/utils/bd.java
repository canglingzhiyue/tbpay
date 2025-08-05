package com.taobao.android.detail.ttdetail.utils;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.OpenUrlImplementor;
import tb.eya;
import tb.eyb;
import tb.eyc;
import tb.eyd;
import tb.eye;
import tb.eyf;
import tb.eyg;
import tb.eyh;
import tb.eyi;
import tb.eyx;
import tb.ezh;
import tb.ezj;
import tb.ezk;
import tb.ioj;
import tb.kge;
import tb.pho;
import tb.qqe;
import tb.xix;

/* loaded from: classes5.dex */
public class bd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1844354256);
    }

    public static void a(eyx eyxVar, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b945bc34", new Object[]{eyxVar, context});
            return;
        }
        b(eyxVar, context);
        c(eyxVar, context);
        d(eyxVar, context);
        f(eyxVar, context);
        a(eyxVar.f());
    }

    private static void b(eyx eyxVar, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a9858d3", new Object[]{eyxVar, context});
            return;
        }
        com.taobao.android.detail.ttdetail.handler.bizhandlers.c cVar = new com.taobao.android.detail.ttdetail.handler.bizhandlers.c(context, eyxVar);
        eyxVar.c().a("userTrack", cVar);
        eyxVar.c().a("user_track", cVar);
        OpenUrlImplementor openUrlImplementor = new OpenUrlImplementor(context, eyxVar);
        eyxVar.c().a("openUrl", openUrlImplementor);
        eyxVar.c().a("open_url", openUrlImplementor);
        eyxVar.c().a("openLightOff", new com.taobao.android.detail.ttdetail.handler.bizhandlers.a(context));
        eyxVar.c().a(com.taobao.android.detail.ttdetail.handler.bizhandlers.an.EVENT_TYPE, new com.taobao.android.detail.ttdetail.handler.bizhandlers.an(context));
    }

    private static void c(eyx eyxVar, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7beaf572", new Object[]{eyxVar, context});
        } else {
            eyxVar.a().a(pho.PARSER_ID, new pho(context, eyxVar));
        }
    }

    private static void d(eyx eyxVar, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd3d9211", new Object[]{eyxVar, context});
            return;
        }
        eyxVar.d().a("native", "_tt_detail_header_frame_", new eyc());
        eyxVar.d().a("native", eyd.NAME, new eyd());
        eyxVar.d().a("native", eyf.NAME, new eyf());
        eyxVar.d().a("native", eyb.NAME, new eyb());
        eyxVar.d().a("native", "triverwidget", new eye());
        eyxVar.d().a("dinamicx", new eya());
        eyxVar.d().a("weex", new eyg());
        eyxVar.d().a("weex2", eyh.NAME, new eyh());
        eyxVar.d().a("weex2", new eyi());
    }

    private static void f(eyx eyxVar, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fe2cb4f", new Object[]{eyxVar, context});
            return;
        }
        eyxVar.f().a(ezj.DX_EVENT_ID, new ezj(context, eyxVar));
        eyxVar.f().a(xix.DX_EVENT_ID, new xix(context, eyxVar));
        eyxVar.f().a(ezk.DX_EVENT_ID, new ezk(context, eyxVar));
        eyxVar.f().a(qqe.DX_EVENT_ID.longValue(), new qqe(context, eyxVar));
    }

    public static void a(ezh ezhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7d5dfa5", new Object[]{ezhVar});
        } else {
            ezhVar.a(ioj.DX_EVENT_ID, new ioj());
        }
    }
}
