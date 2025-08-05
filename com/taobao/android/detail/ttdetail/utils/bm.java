package com.taobao.android.detail.ttdetail.utils;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.ai;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.aj;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.ak;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.am;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.n;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.w;
import tb.eyx;
import tb.kge;

/* loaded from: classes5.dex */
public class bm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1390451424);
    }

    public static void a(eyx eyxVar, Context context, com.taobao.android.detail.ttdetail.c cVar, am.a aVar, w.a aVar2, n.a aVar3, ak.a aVar4, ai.a aVar5, ai.b bVar, aj.a aVar6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e08e3b71", new Object[]{eyxVar, context, cVar, aVar, aVar2, aVar3, aVar4, aVar5, bVar, aVar6});
            return;
        }
        eyxVar.c().a(com.taobao.android.detail.ttdetail.handler.bizhandlers.am.EVENT_TYPE, new com.taobao.android.detail.ttdetail.handler.bizhandlers.am(context, eyxVar, aVar));
        com.taobao.android.detail.ttdetail.handler.bizhandlers.w wVar = new com.taobao.android.detail.ttdetail.handler.bizhandlers.w(context, eyxVar, cVar, aVar2);
        eyxVar.c().a("openSKU", wVar);
        eyxVar.c().a(com.taobao.android.detail.ttdetail.handler.bizhandlers.w.EVENT_TYPE_ALTERNATIVE, wVar);
        eyxVar.c().a(com.taobao.android.detail.ttdetail.handler.bizhandlers.ao.EVENT_TYPE, new com.taobao.android.detail.ttdetail.handler.bizhandlers.ao(context, eyxVar, cVar));
        com.taobao.android.detail.ttdetail.handler.bizhandlers.n nVar = new com.taobao.android.detail.ttdetail.handler.bizhandlers.n(context, eyxVar, aVar3);
        eyxVar.c().a("openFloatDialog", nVar);
        eyxVar.c().a(com.taobao.android.detail.ttdetail.handler.bizhandlers.n.EVENT_TYPE_OPENFLOATDIALOG_ALTERNATIVE, nVar);
        eyxVar.c().a(com.taobao.android.detail.ttdetail.handler.bizhandlers.n.EVENT_TYPE_OPENWEEXFLOAT, nVar);
        eyxVar.c().a(com.taobao.android.detail.ttdetail.handler.bizhandlers.ak.EVENT_TYPE, new com.taobao.android.detail.ttdetail.handler.bizhandlers.ak(context, eyxVar, aVar4));
        eyxVar.c().a(com.taobao.android.detail.ttdetail.handler.bizhandlers.ai.EVENT_TYPE, new com.taobao.android.detail.ttdetail.handler.bizhandlers.ai(context, eyxVar, aVar5, bVar));
        eyxVar.c().a("update_sku_quantity", new com.taobao.android.detail.ttdetail.handler.bizhandlers.aj(context, eyxVar, aVar6));
    }
}
