package com.taobao.search.jarvis;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.q;
import kotlin.jvm.internal.o;
import tb.gse;
import tb.kge;
import tb.noa;

/* loaded from: classes7.dex */
public final class a implements gse {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private com.taobao.search.sf.realtimetag.b f19058a;

    static {
        kge.a(-422198161);
        kge.a(20055365);
    }

    public a() {
        this(null, 1, null);
    }

    public a(com.taobao.search.sf.realtimetag.b bVar) {
        this.f19058a = bVar;
    }

    public /* synthetic */ a(com.taobao.search.sf.realtimetag.b bVar, int i, o oVar) {
        this((i & 1) != 0 ? null : bVar);
    }

    @Override // tb.gse
    public void notify(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12981c64", new Object[]{this, str, str2});
            return;
        }
        com.taobao.search.sf.realtimetag.b bVar = this.f19058a;
        if (bVar == null) {
            return;
        }
        AppMonitor.Alarm.commitSuccess("tppJarvis", noa.VALUE_MODULE_DYNAMIC_CARD);
        bVar.b("ok", str2);
    }

    @Override // tb.gse
    public void errorReport(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28fdfd81", new Object[]{this, str, str2, str3});
            return;
        }
        q.a("CommonDynamicCard", "jarvis run failed: " + str3);
        com.taobao.search.sf.realtimetag.b bVar = this.f19058a;
        if (bVar == null || !bVar.e()) {
            return;
        }
        AppMonitor.Alarm.commitFail("tppJarvis", noa.VALUE_MODULE_DYNAMIC_CARD, str2, str3);
        bVar.b(noa.VALUE_JARVIS_STATUS_FAIL, "");
    }
}
