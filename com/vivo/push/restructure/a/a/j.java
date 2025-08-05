package com.vivo.push.restructure.a.a;

import com.vivo.push.util.u;

/* loaded from: classes9.dex */
final class j implements i<com.vivo.push.restructure.a.a> {

    /* renamed from: a  reason: collision with root package name */
    private a f24224a;
    private n b;
    private k c;
    private com.vivo.push.restructure.c.a d;

    public j(n nVar, k kVar, com.vivo.push.restructure.c.a aVar) {
        this.b = nVar;
        this.c = kVar;
        this.d = aVar;
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    private void a2(com.vivo.push.restructure.a.a aVar) {
        String str;
        if (aVar == null) {
            return;
        }
        if (!aVar.e()) {
            str = "core is not support monitor report";
        } else {
            u.a("reportNodeMonitorInfo() , isNeedCollectNodeMonitor: " + aVar.f());
            if (!aVar.f()) {
                return;
            }
            n nVar = this.b;
            if (nVar != null) {
                nVar.a(aVar, this.f24224a);
            }
            k kVar = this.c;
            if (kVar == null) {
                u.a("onNodeError , mReporter is null， can not report");
                return;
            } else {
                kVar.a(aVar, this.f24224a.c().toString());
                str = "reportNodeMonitorInfo() , report client NodeInfo！！！";
            }
        }
        u.a(str);
    }

    @Override // com.vivo.push.restructure.a.a.i
    public final void a(a aVar) {
        this.f24224a = aVar;
    }

    @Override // com.vivo.push.restructure.a.a.i
    public final /* synthetic */ void a(a aVar, com.vivo.push.restructure.a.a aVar2, int i) {
        com.vivo.push.restructure.a.a aVar3 = aVar2;
        if (aVar3 == null) {
            u.a("onNodeError() receivedMsg is null ");
            return;
        }
        u.a("onNodeError() , msgID = " + aVar3.a() + ", nodeName = " + aVar.b());
        com.vivo.push.restructure.c.a aVar4 = this.d;
        if (aVar4 != null) {
            aVar4.a(i, aVar3.a());
        }
        a2(aVar3);
    }

    @Override // com.vivo.push.restructure.a.a.i
    public final /* bridge */ /* synthetic */ void a(com.vivo.push.restructure.a.a aVar) {
        String str;
        com.vivo.push.restructure.a.a aVar2 = aVar;
        if (aVar2 == null) {
            str = "onAllNodeExecuteComplete, receivedMsg is null";
        } else if (this.f24224a != null) {
            a2(aVar2);
            return;
        } else {
            str = "onAllNodeExecuteComplete, mFirstNode is null";
        }
        u.a(str);
    }
}
