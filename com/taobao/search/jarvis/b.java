package com.taobao.search.jarvis;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.util.q;
import tb.gse;
import tb.kge;
import tb.noa;

/* loaded from: classes7.dex */
public class b implements gse {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private com.taobao.search.sf.realtimetag.b f19063a;

    static {
        kge.a(1436480830);
        kge.a(20055365);
    }

    public b(com.taobao.search.sf.realtimetag.b bVar) {
        this.f19063a = bVar;
    }

    @Override // tb.gse
    public void notify(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12981c64", new Object[]{this, str, str2});
            return;
        }
        com.taobao.search.sf.realtimetag.b bVar = this.f19063a;
        if (bVar == null || !bVar.c()) {
            return;
        }
        AppMonitor.Alarm.commitSuccess("tppJarvis", noa.VALUE_MODULE_DYNAMIC_CARD);
        this.f19063a.a("ok", str2);
    }

    @Override // tb.gse
    public void errorReport(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28fdfd81", new Object[]{this, str, str2, str3});
            return;
        }
        q.a("DynamicCard", "jarvis run failed: " + str3);
        com.taobao.search.sf.realtimetag.b bVar = this.f19063a;
        if (bVar == null || !bVar.c()) {
            return;
        }
        AppMonitor.Alarm.commitFail("tppJarvis", noa.VALUE_MODULE_DYNAMIC_CARD, str2, str3);
        this.f19063a.a(noa.VALUE_JARVIS_STATUS_FAIL, "");
    }
}
