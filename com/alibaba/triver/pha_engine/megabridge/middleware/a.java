package com.alibaba.triver.pha_engine.megabridge.middleware;

import com.alibaba.ability.middleware.c;
import com.alibaba.ability.middleware.d;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.alo;
import tb.als;
import tb.kge;

/* loaded from: classes3.dex */
public class a implements d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(602842494);
        kge.a(1794714122);
    }

    @Override // com.alibaba.ability.middleware.d
    public ExecuteResult invoke(String str, String str2, als alsVar, Map<String, ?> map, alo aloVar, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("a1d6a6a6", new Object[]{this, str, str2, alsVar, map, aloVar, cVar});
        }
        try {
            if (RVProxy.get((Class<Object>) ITriverMtopMiddle.class, true) == null) {
                return cVar.a(str, str2, alsVar, map, aloVar);
            }
            return ((ITriverMtopMiddle) RVProxy.get(ITriverMtopMiddle.class)).invoke(str, str2, alsVar, map, aloVar, cVar);
        } catch (Throwable th) {
            RVLogger.e("TriverMtopConfigMiddleware", th);
            return cVar.a(str, str2, alsVar, map, aloVar);
        }
    }
}
