package com.taobao.android.dinamicx.eventchain;

import com.alibaba.ability.result.ExecuteResult;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.Map;
import tb.aln;
import tb.alo;
import tb.alr;
import tb.als;
import tb.alt;
import tb.kge;

/* loaded from: classes5.dex */
public class o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1941249277);
    }

    public static void a(als alsVar, DXRuntimeContext dXRuntimeContext) {
        l lVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31bc3fa1", new Object[]{alsVar, dXRuntimeContext});
        } else if (alsVar == null || !(dXRuntimeContext instanceof DXRuntimeContext)) {
        } else {
            if (dXRuntimeContext != null && dXRuntimeContext.E() != null && (dXRuntimeContext.E().a() instanceof l)) {
                lVar = (l) dXRuntimeContext.E().a();
            } else {
                lVar = new l();
                lVar.a(dXRuntimeContext.m());
                lVar.a(dXRuntimeContext.v());
                lVar.a(dXRuntimeContext.C().b().l());
                lVar.a(dXRuntimeContext.s());
                lVar.a(dXRuntimeContext.d());
            }
            alsVar.a(lVar);
            alr alrVar = new alr(dXRuntimeContext.A(), "DX");
            alrVar.a(dXRuntimeContext.m());
            alsVar.a((alt) alrVar);
        }
    }

    public static ExecuteResult a(String str, DXRuntimeContext dXRuntimeContext, String str2, als alsVar, Map<String, ?> map, alo aloVar) {
        com.alibaba.ability.b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ExecuteResult) ipChange.ipc$dispatch("db82f343", new Object[]{str, dXRuntimeContext, str2, alsVar, map, aloVar});
        }
        if (dXRuntimeContext != null && dXRuntimeContext.D() != null && dXRuntimeContext.D().Q() != null && (bVar = dXRuntimeContext.D().Q().get(str)) != null) {
            return bVar.execute(str2, alsVar, map, new aln(aloVar));
        }
        return null;
    }
}
