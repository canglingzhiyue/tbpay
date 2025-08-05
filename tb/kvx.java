package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* loaded from: classes.dex */
public class kvx extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_HGETVALUE = 1466861815985736590L;

    static {
        kge.a(718417075);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        Object obj = null;
        if (objArr != null && objArr.length > 0) {
            if (objArr.length > 1) {
                obj = objArr[1];
            }
            if (objArr[0] instanceof String) {
                Object obj2 = kve.f30336a.get((String) objArr[0]);
                return obj2 == null ? obj : obj2;
            }
        }
        return obj;
    }
}
