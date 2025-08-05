package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* loaded from: classes6.dex */
public class ixz extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_ID;
    public static final String PARSER_TAG = "xskuSwtich";

    static {
        kge.a(1042672595);
        DX_PARSER_ID = fxa.a(PARSER_TAG);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length <= 2) {
            return null;
        }
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        if (obj == null || obj2 == null) {
            return objArr[2];
        }
        String obj3 = obj.toString();
        JSONObject parseObject = obj2 instanceof JSONObject ? (JSONObject) obj2 : JSONObject.parseObject(obj2.toString());
        if (parseObject == null || parseObject.isEmpty()) {
            return objArr[2];
        }
        Object obj4 = parseObject.get(obj3);
        return obj4 == null ? objArr[2] : obj4;
    }
}
