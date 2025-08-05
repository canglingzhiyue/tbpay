package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.home.component.utils.c;

/* loaded from: classes.dex */
public class kwe extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_ORANGE = 9860385864900610L;

    static {
        kge.a(1800799166);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr != null && objArr.length >= 2) {
            try {
                return c.a().a((String) objArr[0], (String) objArr[1], objArr.length > 2 ? (String) objArr[2] : null);
            } catch (Throwable unused) {
            }
        }
        return null;
    }
}
