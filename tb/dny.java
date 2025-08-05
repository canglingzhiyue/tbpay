package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.adam.common.a;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.ultron.common.model.IDMComponent;

/* loaded from: classes4.dex */
public class dny extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_ULTRONPARENTKEY = -4670834467082391994L;

    static {
        kge.a(-1130879037);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IDMComponent a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr != null && objArr.length != 0) {
            IDMComponent a3 = a.a(dXRuntimeContext);
            if ((a3 instanceof IDMComponent) && (objArr[0] instanceof String) && (a2 = a.a((String) objArr[0], a3)) != null) {
                return a2.getKey();
            }
        }
        return null;
    }
}
