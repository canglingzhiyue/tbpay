package tb;

import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* loaded from: classes5.dex */
public class xjb extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final long DX_PARSER_ID;

    static {
        kge.a(326525495);
        DX_PARSER_ID = fxa.a("arrayJoinedByString");
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        String str = "";
        if (objArr != null && objArr.length >= 2) {
            JSONArray jSONArray = objArr[0] instanceof JSONArray ? (JSONArray) objArr[0] : null;
            if (jSONArray != null && !jSONArray.isEmpty()) {
                if (objArr[1] instanceof String) {
                    str = (String) objArr[1];
                }
                StringBuffer stringBuffer = new StringBuffer();
                for (int i = 0; i < jSONArray.size(); i++) {
                    stringBuffer.append(jSONArray.get(i));
                    if (i < jSONArray.size() - 1) {
                        stringBuffer.append(str);
                    }
                }
                return stringBuffer.toString();
            }
        }
        return str;
    }
}
