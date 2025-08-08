package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.eventchain.l;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* loaded from: classes6.dex */
public class izz extends izq {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String RECYCLERUPDATEITEMS = "5055136543337834961";

    static {
        kge.a(56219369);
    }

    @Override // tb.izq
    public int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue();
        }
        return 30008;
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
        JSONArray jSONArray = null;
        try {
            jSONArray = dlhVar.b("data");
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (jSONArray == null) {
            return new dkw(new dkv(30008, "data参数解析异常"), true);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("method", DXRecyclerLayout.MSG_METHOD_UPDATE_ITEMS);
        jSONObject.put("data", (Object) jSONArray);
        jSONObject.put("current", (Object) j);
        dXRecyclerLayout.postEvent(a(jSONObject, lVar));
        return new dla();
    }
}
