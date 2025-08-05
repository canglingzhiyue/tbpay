package com.taobao.monitor.procedure;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.ProcedureGlobal;
import com.taobao.monitor.procedure.p;
import tb.mpn;
import tb.mql;

/* loaded from: classes.dex */
public class q implements h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.taobao.monitor.procedure.h
    public g a(String str, p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("a01797ed", new Object[]{this, str, pVar});
        }
        if (pVar == null) {
            pVar = new p.a().a(false).b(true).c(true).a(ProcedureGlobal.PROCEDURE_MANAGER.e()).a();
        }
        return new t(b(str, pVar));
    }

    public ProcedureImpl b(String str, p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ProcedureImpl) ipChange.ipc$dispatch("f750d100", new Object[]{this, str, pVar});
        }
        g a2 = pVar.a();
        if (a2 == g.DEFAULT) {
            a2 = ProcedureGlobal.PROCEDURE_MANAGER.e();
        }
        ProcedureImpl procedureImpl = new ProcedureImpl(str, a2, pVar.b(), pVar.d(), pVar.e());
        if (pVar.c()) {
            procedureImpl.a(new mpn(pVar.g()));
        }
        if (pVar.f()) {
            procedureImpl.a(new mql());
        }
        return procedureImpl;
    }
}
