package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import mtopsdk.mtop.global.SDKUtils;

/* loaded from: classes2.dex */
public class boa implements fut {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_INJECT = 9422011105736515L;
    public static final String TAG = "inject";

    static {
        kge.a(-1548965945);
        kge.a(1343895002);
    }

    @Override // tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        JSONObject e = dXRuntimeContext.e();
        if (objArr == null || objArr.length == 0) {
            return e;
        }
        if (objArr.length != 1 || !(objArr[0] instanceof String) || !"time".equals(objArr[0])) {
            return null;
        }
        return String.valueOf(SDKUtils.getCorrectionTimeMillis());
    }
}
