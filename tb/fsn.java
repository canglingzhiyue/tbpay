package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* loaded from: classes.dex */
public class fsn extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_MAX = 523333521;

    static {
        kge.a(-191208185);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        Object a2 = fuv.a(objArr, 1);
        if (!(a2 instanceof Boolean)) {
            return null;
        }
        if (((Boolean) a2).booleanValue()) {
            return fqr.c(objArr[0]);
        }
        return fqr.c(objArr[1]);
    }
}
