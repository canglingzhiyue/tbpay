package com.taobao.mmad.render.dx.event;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.eventchain.l;
import tb.dkx;
import tb.dlg;
import tb.dlh;
import tb.dll;
import tb.dln;
import tb.kge;
import tb.tiq;
import tb.tjl;
import tb.xnp;

/* loaded from: classes7.dex */
public class b extends dlg<l> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long COMMITINTERACTEND = -981405392948311061L;

    static {
        kge.a(156761164);
    }

    @Override // tb.dlg
    public dkx a(dlh dlhVar, l lVar, dll dllVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("a81bf6d9", new Object[]{this, dlhVar, lVar, dllVar});
        }
        DXRuntimeContext h = lVar.h();
        if (h != null && (h.b() instanceof xnp)) {
            tiq a2 = ((xnp) h.b()).a();
            tjl.a(a2.d().b(), dlhVar.e("success").booleanValue(), a2.c());
        }
        return null;
    }

    /* loaded from: classes7.dex */
    public static class a implements dln<tiq> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(814991139);
            kge.a(-1749066050);
        }

        @Override // tb.dln
        public /* synthetic */ dlg b(tiq tiqVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (dlg) ipChange.ipc$dispatch("1766b262", new Object[]{this, tiqVar}) : a(tiqVar);
        }

        public b a(tiq tiqVar) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("8a8d703b", new Object[]{this, tiqVar}) : new b();
        }
    }
}
