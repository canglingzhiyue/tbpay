package com.taobao.android.dinamicx_v4.loader;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dxv4common.logic.dex.DXNativeLogicLoadTask;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.fwr;
import tb.gez;
import tb.gfg;
import tb.gfl;
import tb.gfm;
import tb.gfn;
import tb.kge;

/* loaded from: classes5.dex */
public class i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private h f12230a;
    private e b;
    private f c;
    private j d;
    private d e;
    private DXExtensionSectionLoader f;
    private a g;
    private gez h;
    private int i = 1000;

    static {
        kge.a(-1962634334);
        kge.a(-202982083);
    }

    public i(h hVar, e eVar, f fVar, j jVar, d dVar, DXExtensionSectionLoader dXExtensionSectionLoader, a aVar, gez gezVar) {
        this.f12230a = hVar;
        this.b = eVar;
        this.c = fVar;
        this.d = jVar;
        this.e = dVar;
        this.f = dXExtensionSectionLoader;
        this.g = aVar;
        this.h = gezVar;
    }

    public boolean a(fwr fwrVar, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c47e4ac", new Object[]{this, fwrVar, dXRuntimeContext})).booleanValue();
        }
        fwrVar.c(this.f12230a.a());
        return true;
    }

    public DXWidgetNode a(fwr fwrVar, DXRuntimeContext dXRuntimeContext, boolean z, AtomicBoolean atomicBoolean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("c25133c3", new Object[]{this, fwrVar, dXRuntimeContext, new Boolean(z), atomicBoolean});
        }
        fwrVar.c(this.f12230a.a());
        DXWidgetNode a2 = a(fwrVar, (DXWidgetNode) null, dXRuntimeContext, atomicBoolean);
        a2.getDxv4Properties().b(this.d.a());
        a2.getDxv4Properties().a(this.f.a());
        a2.getDxv4Properties().b(this.g.a());
        if (this.h.a() == 2) {
            DXNativeLogicLoadTask.asyncLoadData(a2);
        } else if (this.h.a() == 0) {
            gfg.a(a2);
        }
        return a2;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x02de A[LOOP:4: B:121:0x02de->B:122:0x02e0, LOOP_START, PHI: r13 
      PHI: (r13v2 int) = (r13v1 int), (r13v3 int) binds: [B:120:0x02dc, B:122:0x02e0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.taobao.android.dinamicx.widget.DXWidgetNode a(tb.fwr r20, com.taobao.android.dinamicx.widget.DXWidgetNode r21, com.taobao.android.dinamicx.DXRuntimeContext r22, java.util.concurrent.atomic.AtomicBoolean r23) {
        /*
            Method dump skipped, instructions count: 745
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx_v4.loader.i.a(tb.fwr, com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.DXRuntimeContext, java.util.concurrent.atomic.AtomicBoolean):com.taobao.android.dinamicx.widget.DXWidgetNode");
    }

    public void a(DXWidgetNode dXWidgetNode, com.taobao.android.dinamicx.model.c<gfn> cVar, com.taobao.android.dinamicx.model.b<gfm> bVar) {
        gfl gflVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18c28108", new Object[]{this, dXWidgetNode, cVar, bVar});
            return;
        }
        if (dXWidgetNode.getDxv4Properties() != null) {
            gflVar = dXWidgetNode.getDxv4Properties();
        } else {
            gfl gflVar2 = new gfl();
            dXWidgetNode.setDxv4Properties(gflVar2);
            gflVar = gflVar2;
        }
        gflVar.a(bVar);
        gflVar.a(cVar);
        gflVar.a(this.c.a());
        gflVar.b(this.b.a());
        gflVar.c(this.e.a());
    }
}
