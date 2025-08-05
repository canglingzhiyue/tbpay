package tb;

import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.ultron.common.model.IDMComponent;

/* loaded from: classes5.dex */
public class gnn extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_ULTRONDATAREFERENCE = -8384149384111219008L;

    static {
        kge.a(1582402696);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        bbz a2;
        bcb n;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length == 0 || !(objArr[0] instanceof JSONArray) || (a2 = bdn.a(dXRuntimeContext)) == null || (n = a2.n()) == null) {
            return null;
        }
        jny w = n.w();
        IDMComponent b = bdn.b(dXRuntimeContext);
        if (b != null) {
            bnr.a(b.getKey());
        }
        JSONArray jSONArray = (JSONArray) objArr[0];
        JSONArray jSONArray2 = new JSONArray(jSONArray.size());
        for (int i = 0; i < jSONArray.size(); i++) {
            String str = (String) jSONArray.get(i);
            IDMComponent b2 = w.b(str);
            if (b2 != null) {
                jSONArray2.add(b2.getData());
            } else {
                jSONArray2.add(str);
            }
        }
        return jSONArray2;
    }
}
