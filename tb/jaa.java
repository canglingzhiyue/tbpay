package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.eventchain.l;
import com.taobao.android.dinamicx.s;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* loaded from: classes6.dex */
public class jaa extends izq {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String RECYCLERUPDATESTATE = "5078008358199333072";

    static {
        kge.a(-558686984);
    }

    @Override // tb.izq
    public int d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("596b2de", new Object[]{this})).intValue() : s.DXError_EngineFetchException;
    }

    @Override // tb.izq
    public dkx a(dlh dlhVar, DXRecyclerLayout dXRecyclerLayout, DXWidgetNode dXWidgetNode, l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dkx) ipChange.ipc$dispatch("7df0f702", new Object[]{this, dlhVar, dXRecyclerLayout, dXWidgetNode, lVar});
        }
        String c = dlhVar.c("type");
        if (TextUtils.isEmpty(c)) {
            return new dkw(new dkv(d(), "type参数为空"), true);
        }
        String c2 = dlhVar.c("state");
        if (TextUtils.isEmpty(c2)) {
            return new dkw(new dkv(s.DXError_EngineFetchException, "state参数为空"), true);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("method", (Object) ("DXRecyclerLayout#" + c));
        jSONObject.put("status", (Object) c2);
        dXRecyclerLayout.postEvent(a(jSONObject, lVar));
        return new dla();
    }
}
