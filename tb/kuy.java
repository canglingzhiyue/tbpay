package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.bg;

/* loaded from: classes5.dex */
public class kuy extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_GET_SUB_VARIABLE = 8408886169094158494L;

    static {
        kge.a(177940515);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        Object obj = null;
        if (objArr != null && objArr.length != 0) {
            String valueOf = String.valueOf(objArr[0]);
            if (objArr.length == 2) {
                obj = objArr[1];
            }
            bg P = dXRuntimeContext.P();
            if (P == null) {
                return obj;
            }
            Object b = P.b(valueOf, dXRuntimeContext);
            if (b != null && !(b instanceof bg.a)) {
                return b;
            }
        }
        return obj;
    }
}
