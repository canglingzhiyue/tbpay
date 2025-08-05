package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.service.BUFS;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* loaded from: classes7.dex */
public class men extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_TBLFETCHBHXBUFSFEATURE = -7938287296485434688L;

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length == 0 || !(objArr[0] instanceof JSONObject)) {
            return null;
        }
        JSONObject jSONObject = (JSONObject) objArr[0];
        return BUFS.getFeature(new BUFS.QueryArgs(), jSONObject.getString("invokeId"), jSONObject.getString("bizIdentifier"), jSONObject.getString("currentScene"));
    }
}
