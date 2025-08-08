package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.eventchain.l;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.DXMsgCenterEvent;
import com.taobao.android.dinamicx.r;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* loaded from: classes6.dex */
public abstract class izq extends dlg<l> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-437020765);
    }

    public abstract dkx a(dlh dlhVar, DXRecyclerLayout dXRecyclerLayout, DXWidgetNode dXWidgetNode, l lVar);

    @Override // tb.dlg
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public abstract int d();

    @Override // tb.dlg
    public dkx a(dlh dlhVar, l lVar, dll dllVar) {
        DXWidgetNode a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("a81bf6d9", new Object[]{this, dlhVar, lVar, dllVar});
        }
        DXRuntimeContext h = lVar.h();
        if (h == null) {
            return a("runtimeContext为空", true);
        }
        if (lVar.i() == null) {
            return a("rootView为空", true);
        }
        r C = h.C();
        if (C == null) {
            return a("engineContext为空", true);
        }
        if (C.b() == null) {
            return a("dinamicXEngine为空", true);
        }
        String c = dlhVar.c("recyclerNodeId");
        DXRuntimeContext h2 = lVar.h();
        if (h2 == null) {
            return a("rootViewContext为空", true);
        }
        DXWidgetNode d = h2.d();
        if (d == null) {
            return a("rootWidget为空", true);
        }
        if (!StringUtils.isEmpty(c)) {
            a2 = lVar.j();
            if (a2 == null || !c.equals(a2.getUserId())) {
                a2 = d.queryWidgetNodeByUserId(c);
            }
        } else {
            a2 = a(lVar.j());
        }
        if (!(a2 instanceof DXRecyclerLayout)) {
            return a("RecyclerLayout 没有找到", true);
        }
        return a(dlhVar, (DXRecyclerLayout) a2, d, lVar);
    }

    public DXRecyclerLayout a(DXWidgetNode dXWidgetNode) {
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

    public DXEvent a(JSONObject jSONObject, l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXEvent) ipChange.ipc$dispatch("88b9ec18", new Object[]{this, jSONObject, lVar});
        }
        String string = jSONObject.getString("method");
        if (lVar instanceof dlk) {
            jSONObject.put(DXRecyclerLayout.ABILITY_SPAN, (Object) b());
        }
        DXMsgCenterEvent dXMsgCenterEvent = new DXMsgCenterEvent(-1747756056147111305L);
        dXMsgCenterEvent.setParams(jSONObject);
        dXMsgCenterEvent.setType("General");
        dXMsgCenterEvent.setMethod(string);
        return dXMsgCenterEvent;
    }

    public dkw a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dkw) ipChange.ipc$dispatch("5f2b9c94", new Object[]{this, str, new Boolean(z)}) : new dkw(new dkv(d(), str), z);
    }
}
