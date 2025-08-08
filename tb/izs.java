package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.eventchain.l;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.search.common.util.k;

/* loaded from: classes6.dex */
public class izs extends izq {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DXRECYCLERINSERTITEMS = "5583930555706880739";

    static {
        kge.a(1767641);
    }

    @Override // tb.izq
    public int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue();
        }
        return 30003;
    }

    @Override // tb.izq
    public dkx a(dlh dlhVar, DXRecyclerLayout dXRecyclerLayout, DXWidgetNode dXWidgetNode, l lVar) {
        DXWidgetNode j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("7df0f702", new Object[]{this, dlhVar, dXRecyclerLayout, dXWidgetNode, lVar});
        }
        String c = dlhVar.c("targetNodeId");
        if (!StringUtils.isEmpty(c)) {
            j = dXWidgetNode.queryWidgetNodeByUserId(c);
        } else {
            j = lVar.j();
        }
        if (j == null) {
            return a("当前widgetNode为空", true);
        }
        int d = dlhVar.d(k.a.PARAM_KEY_LIST_START_INDEX);
        String c2 = dlhVar.c("refreshType");
        JSONArray jSONArray = null;
        try {
            jSONArray = dlhVar.b("data");
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (jSONArray == null) {
            return new dkw(new dkv(30003, "data参数解析异常"), true);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("method", DXRecyclerLayout.MSG_METHOD_INSERT_ITEMS);
        jSONObject.put("data", (Object) jSONArray);
        jSONObject.put("current", (Object) j);
        jSONObject.put(k.a.PARAM_KEY_LIST_START_INDEX, (Object) Integer.valueOf(d));
        jSONObject.put("refreshType", (Object) c2);
        dXRecyclerLayout.postEvent(a(jSONObject, lVar));
        return new dla();
    }
}
