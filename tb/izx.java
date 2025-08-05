package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.eventchain.l;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.tao.flexbox.layoutmanager.container.b;

/* loaded from: classes6.dex */
public class izx extends izq {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String RECYCLERUPDATEALLITEMS = "-3125948611212114707";

    static {
        kge.a(-197095540);
    }

    @Override // tb.izq
    public int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue();
        }
        return 30004;
    }

    @Override // tb.izq
    public dkx a(dlh dlhVar, DXRecyclerLayout dXRecyclerLayout, DXWidgetNode dXWidgetNode, l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("7df0f702", new Object[]{this, dlhVar, dXRecyclerLayout, dXWidgetNode, lVar});
        }
        JSONArray jSONArray = null;
        try {
            jSONArray = dlhVar.b(b.KEY_ACTIONS);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (jSONArray == null) {
            return new dkw(new dkv(30004, "data参数解析异常"), true);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("method", DXRecyclerLayout.MSG_METHOD_UPDATE_ALL);
        jSONObject.put(b.KEY_ACTIONS, (Object) jSONArray);
        dXRecyclerLayout.postEvent(a(jSONObject, lVar));
        return new dla();
    }
}
