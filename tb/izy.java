package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.eventchain.l;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.tao.flexbox.layoutmanager.container.b;

/* loaded from: classes6.dex */
public class izy extends izq {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String RECYCLERUPDATECURRENTITEM = "3807884119613639239";

    static {
        kge.a(-128618051);
    }

    @Override // tb.izq
    public int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue();
        }
        return 30005;
    }

    @Override // tb.izq
    public dkx a(dlh dlhVar, DXRecyclerLayout dXRecyclerLayout, DXWidgetNode dXWidgetNode, l lVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dkx) ipChange.ipc$dispatch("7df0f702", new Object[]{this, dlhVar, dXRecyclerLayout, dXWidgetNode, lVar}) : a(dlhVar, dXRecyclerLayout, dXWidgetNode, lVar, DXRecyclerLayout.MSG_METHOD_UPDATE_CURRENT);
    }

    public dkx a(dlh dlhVar, DXRecyclerLayout dXRecyclerLayout, DXWidgetNode dXWidgetNode, l lVar, String str) {
        DXWidgetNode j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("8d2f84b8", new Object[]{this, dlhVar, dXRecyclerLayout, dXWidgetNode, lVar, str});
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
            jSONArray = dlhVar.b(b.KEY_ACTIONS);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (jSONArray == null) {
            return new dkw(new dkv(d(), "data参数解析异常"), true);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("method", (Object) str);
        jSONObject.put(b.KEY_ACTIONS, (Object) jSONArray);
        jSONObject.put("current", (Object) j);
        jSONObject.put("refreshType", (Object) dlhVar.c("refreshType"));
        jSONObject.put("params", (Object) dlhVar.c());
        dXRecyclerLayout.postEvent(a(jSONObject, lVar));
        return new dla();
    }
}
