package com.taobao.android.tbabilitykit.dx;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.eventchain.l;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import kotlin.jvm.internal.q;
import tb.dkv;
import tb.dkw;
import tb.dkx;
import tb.dla;
import tb.dlg;
import tb.dlh;
import tb.dll;
import tb.kge;

/* loaded from: classes6.dex */
public abstract class d extends dlg<l> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(817300604);
    }

    public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public abstract void a(String str, DXWidgetNode dXWidgetNode);

    public abstract String d();

    @Override // tb.dlg
    public dkx<?> a(dlh dlhVar, l lVar, dll dllVar) {
        DXRuntimeContext dXRuntimeContext;
        DXWidgetNode I;
        DXWidgetNode queryWidgetNodeByUserId;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("a81bf6d9", new Object[]{this, dlhVar, lVar, dllVar});
        }
        if (dlhVar != null) {
            String c = dlhVar.c("targetNodeId");
            String c2 = dlhVar.c("eventType");
            String c3 = dlhVar.c("targetNodeType");
            if (c3 == null) {
                c3 = "scrollLayout";
            }
            String str = c;
            if (!(str == null || str.length() == 0)) {
                String str2 = c2;
                if (str2 != null && str2.length() != 0) {
                    z = false;
                }
                if (!z && lVar != null) {
                    DXWidgetNode j = lVar.j();
                    DXRecyclerLayout dXRecyclerLayout = null;
                    if (q.a((Object) c, (Object) (j != null ? j.getUserId() : null))) {
                        dXRecyclerLayout = lVar.j();
                    } else {
                        DXWidgetNode j2 = lVar.j();
                        if (j2 == null || (queryWidgetNodeByUserId = j2.queryWidgetNodeByUserId(c)) == null) {
                            DXWidgetNode j3 = lVar.j();
                            if (j3 != null && (dXRuntimeContext = j3.getDXRuntimeContext()) != null && (I = dXRuntimeContext.I()) != null) {
                                dXRecyclerLayout = I.queryWidgetNodeByUserId(c);
                            }
                        } else {
                            dXRecyclerLayout = queryWidgetNodeByUserId;
                        }
                    }
                    if (q.a((Object) c3, (Object) "recyclerLayout") && !(dXRecyclerLayout instanceof DXRecyclerLayout)) {
                        dXRecyclerLayout = a(lVar.j());
                    }
                    if (dXRecyclerLayout != null) {
                        a(c2, dXRecyclerLayout);
                    } else {
                        return new dkw(new dkv(-1999, "DXScrollLayoutAbsAbility " + d() + " widgetNode not found"), false);
                    }
                }
            }
            return new dkw(new dkv(-1999, "DXScrollLayoutAbsAbility " + d() + " empty userId or type or akCtx"), false);
        }
        return new dla();
    }

    private final DXRecyclerLayout a(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRecyclerLayout) ipChange.ipc$dispatch("fa3670e3", new Object[]{this, dXWidgetNode});
        }
        if (dXWidgetNode == null) {
            return null;
        }
        if (dXWidgetNode instanceof DXRecyclerLayout) {
            return (DXRecyclerLayout) dXWidgetNode;
        }
        return a(dXWidgetNode.getParentWidget());
    }
}
