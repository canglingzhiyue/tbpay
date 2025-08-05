package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXDarkModeCenter;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* loaded from: classes5.dex */
public class mrb extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_TRANSFORMEDDESIGNTOKEN = -3169321930677834474L;

    static {
        kge.a(2052072525);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        int length;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr != null && (length = objArr.length) > 0 && Integer.parseInt(String.valueOf(objArr[0])) > 0) {
            if (length >= 3) {
                if (DXDarkModeCenter.a(dXRuntimeContext)) {
                    return objArr[2];
                }
                return objArr[1];
            }
            fuw.b("dxDesignToken  传入的token不合法，解析不出来对应的值");
        }
        return null;
    }
}
