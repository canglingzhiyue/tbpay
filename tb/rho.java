package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.home.component.utils.e;
import mtopsdk.mtop.global.SDKUtils;

/* loaded from: classes5.dex */
public class rho implements fut {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_INJECT = 9422011105736515L;

    static {
        kge.a(-1158744689);
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
            e.e("DXInjectDataParser", "operationList == null || operationList.length == 0");
            return e;
        } else if (objArr.length != 1) {
            e.e("DXInjectDataParser", "operationList.length != 1");
            return null;
        } else if (!(objArr[0] instanceof String)) {
            e.e("DXInjectDataParser", "!(operationList[0] instanceof String)");
            return null;
        } else if (!"time".equals(objArr[0])) {
            return null;
        } else {
            return String.valueOf(SDKUtils.getCorrectionTimeMillis());
        }
    }
}
