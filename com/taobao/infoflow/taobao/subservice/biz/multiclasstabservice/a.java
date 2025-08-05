package com.taobao.infoflow.taobao.subservice.biz.multiclasstabservice;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import tb.kge;
import tb.loo;
import tb.lop;
import tb.loq;
import tb.lor;
import tb.lov;

/* loaded from: classes.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2135781426);
    }

    public static void a(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37589d99", new Object[]{dinamicXEngine});
            return;
        }
        dinamicXEngine.a(lor.LOADH5, new lor.a());
        dinamicXEngine.a(loo.CLOSEH5, new loo.a());
        dinamicXEngine.a(lop.POPTABSWITCHEVENT, new lop.a());
        dinamicXEngine.a(loq.SHOWPOP, new loq.a());
        dinamicXEngine.a(lov.DXHSCROLLTABVIEW_HSCROLLTABVIEW, new lov.a());
    }
}
