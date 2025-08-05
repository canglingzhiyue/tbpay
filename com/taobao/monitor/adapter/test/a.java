package com.taobao.monitor.adapter.test;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.ProcedureGlobal;
import com.taobao.monitor.procedure.g;
import tb.mpn;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String a(g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca8aa4cc", new Object[]{gVar}) : mpn.b(ProcedureGlobal.PROCEDURE_MANAGER.b(gVar));
    }
}
