package com.taobao.taolive.sdk.utils;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.HashMap;
import tb.kge;
import tb.pmd;
import tb.poy;

/* loaded from: classes8.dex */
public class r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1684414442);
    }

    public static void a(com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1819755d", new Object[]{aVar});
        } else if (!o.y() || !(aVar instanceof com.taobao.taolive.sdk.core.e)) {
        } else {
            com.taobao.taolive.sdk.core.e eVar = (com.taobao.taolive.sdk.core.e) aVar;
            String valueOf = String.valueOf((System.currentTimeMillis() - eVar.D) / 1000);
            VideoInfo u = poy.u(eVar);
            if (u == null || u.broadCaster == null || !"1".equals(u.roomStatus)) {
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("duration", valueOf);
            hashMap.put("isPageUnVisible", String.valueOf(eVar.E));
            hashMap.put("isInsideDetail", String.valueOf(poy.g(eVar)));
            hashMap.put("isInsideDetailFull", String.valueOf(b(eVar)));
            if (pmd.a().e() != null) {
                pmd.a().e().a("Page_TaobaoLiveWatch", "TaoLiveStayTimeDev", hashMap);
            }
            eVar.D = System.currentTimeMillis();
        }
    }

    public static boolean b(com.taobao.alilive.aliliveframework.frame.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c31b80", new Object[]{aVar})).booleanValue();
        }
        if (!(aVar instanceof com.taobao.taolive.sdk.core.e)) {
            return false;
        }
        return ((com.taobao.taolive.sdk.core.e) aVar).E();
    }
}
