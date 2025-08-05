package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* loaded from: classes.dex */
public class kwf extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_RTOJSON = 5284242828433939926L;

    static {
        kge.a(1805704581);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length == 0) {
            return null;
        }
        if (objArr.length % 2 != 0) {
            throw new RuntimeException("illegal operationList");
        }
        JSONObject jSONObject = new JSONObject();
        while (i < objArr.length) {
            int i2 = i + 1;
            jSONObject.put((String) objArr[i], objArr[i2]);
            i = i2 + 1;
        }
        return jSONObject;
    }
}
