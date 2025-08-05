package com.taobao.android.tbabilitykit.dx;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.eventchain.l;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import tb.dkx;
import tb.dla;
import tb.dlh;
import tb.dll;
import tb.kge;

/* loaded from: classes6.dex */
public class b extends h<l> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DX_PARTIAL_UPDATE = "-3922734880382485599";

    static {
        kge.a(1417566963);
    }

    @Override // com.taobao.android.tbabilitykit.dx.h, tb.dlg
    public dkx a(dlh dlhVar, l lVar, dll dllVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("a81bf6d9", new Object[]{this, dlhVar, lVar, dllVar});
        }
        DXRuntimeContext h = lVar.h();
        if (h == null) {
            return a("runtimeContext为空", true);
        }
        DXWidgetNode d = h.d();
        if (d == null) {
            return a("rootWidget为空", true);
        }
        DXWidgetNode queryWidgetNodeByUserId = d.queryWidgetNodeByUserId(dlhVar.c("userId"));
        if (queryWidgetNodeByUserId == null) {
            queryWidgetNodeByUserId = lVar.j();
        }
        if (queryWidgetNodeByUserId == null) {
            return a("查找当前widget为空", true);
        }
        if ("layout".equals(dlhVar.c("type"))) {
            queryWidgetNodeByUserId.setNeedLayout(true);
        } else {
            queryWidgetNodeByUserId.setNeedParse(true);
        }
        return new dla();
    }
}
