package tb;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* loaded from: classes4.dex */
public class ejb extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_GETA11YTEXTFROMRICHTEXT = 3284825252322845399L;

    static {
        kge.a(-2121607459);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length == 0 || objArr.length < 2) {
            return null;
        }
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        if ((obj instanceof JSONArray) && (obj2 instanceof String)) {
            JSONArray jSONArray = (JSONArray) obj;
            String str = (String) obj2;
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject.getString(str) != null) {
                    sb.append(jSONObject.getString(str));
                }
            }
            return sb.toString();
        }
        return null;
    }
}
