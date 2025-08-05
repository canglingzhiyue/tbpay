package com.alibaba.android.ultron.trade.utils;

import com.alibaba.android.umbrella.link.UMLinkLogInterface;
import com.alibaba.android.umbrella.link.export.a;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.util.HashMap;
import tb.bmz;
import tb.bpk;
import tb.bpp;
import tb.jpz;
import tb.kge;

/* loaded from: classes2.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final UMLinkLogInterface f2679a;

    static {
        kge.a(-44541763);
        f2679a = bpp.a();
    }

    public static void a(bmz bmzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e20852e9", new Object[]{bmzVar});
        } else if (bmzVar == null) {
        } else {
            try {
                HashMap hashMap = new HashMap(2);
                hashMap.put("eventId", bmzVar.b());
                hashMap.put("params", bmzVar.e());
                f2679a.logError("defaultTrade", "", "ultron_event", null, bpk.ERROR_EVENT_NOT_FOUND, "找不到事件处理器", jpz.CONTAINER_DIM_MAP, a.a(hashMap));
            } catch (Throwable th) {
                UnifyLog.a(bmzVar.d().s(), "UMLLUtil", "logMtopReq", th.getMessage());
            }
        }
    }
}
