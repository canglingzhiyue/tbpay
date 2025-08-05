package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.eventchain.l;
import com.taobao.android.dinamicx.s;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* loaded from: classes6.dex */
public class izt extends izq {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String RECYCLERINSERTITEMSBYOFFSET = "2259045112721041933";

    static {
        kge.a(1649900207);
    }

    @Override // tb.izq
    public int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : s.DXERROR_ENGINE_CREATE_VIEW_IN_GLOBAL_CENTER_MAP;
    }

    @Override // tb.izq
    public dkx a(dlh dlhVar, DXRecyclerLayout dXRecyclerLayout, DXWidgetNode dXWidgetNode, l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("7df0f702", new Object[]{this, dlhVar, dXRecyclerLayout, dXWidgetNode, lVar});
        }
        if (dlhVar == null || dXRecyclerLayout == null || dXWidgetNode == null || lVar == null) {
            return a("RecyclerInsertItemsByOffsetAbility param check error", true);
        }
        String c = dlhVar.c("targetNodeId");
        DXWidgetNode j = TextUtils.isEmpty(c) ? lVar.j() : dXWidgetNode.queryWidgetNodeByUserId(c);
        if (j == null) {
            return a("RecyclerInsertItemsByOffsetAbility 当前widgetNode为空", true);
        }
        JSONArray b = dlhVar.b("data");
        if (b == null) {
            return a("RecyclerInsertItemsByOffsetAbility data参数解析异常", true);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("method", (Object) DXRecyclerLayout.MSG_METHOD_INSERT_ITEMS_BY_OFFSET);
        jSONObject.put("current", (Object) j);
        jSONObject.put("targetNodeId", (Object) c);
        jSONObject.put("data", (Object) b);
        jSONObject.put("recyclerNodeId", (Object) dlhVar.c("recyclerNodeId"));
        jSONObject.put("offset", (Object) dlhVar.c("offset"));
        jSONObject.put("isRelative", (Object) dlhVar.e("isRelative"));
        jSONObject.put("isRelativeOrder", (Object) dlhVar.e("isRelativeOrder"));
        dXRecyclerLayout.postEvent(a(jSONObject, lVar));
        return new dla();
    }
}
