package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.infoflow.core.exception.InfoFlowRuntimeException;

/* loaded from: classes.dex */
public class lfi extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_RTOJSON = 5284242828433939926L;

    static {
        kge.a(-680090662);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        JSONObject jSONObject = null;
        if (objArr != null && objArr.length != 0) {
            if (objArr.length % 2 != 0) {
                if (lcz.b()) {
                    throw new InfoFlowRuntimeException("illegal operationList");
                }
                return null;
            }
            jSONObject = new JSONObject();
            for (int i = 0; i < objArr.length; i += 2) {
                jSONObject.put((String) objArr[i], objArr[i + 1]);
            }
        }
        return jSONObject;
    }
}
