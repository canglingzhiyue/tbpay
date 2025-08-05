package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* loaded from: classes7.dex */
public class mvz extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_MTBICONFONTSUPPORT = -8931733717821205646L;

    static {
        kge.a(-1470230686);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length < 2 || objArr[1] == null) {
            return false;
        }
        if (objArr[0] instanceof Integer) {
            if (2 < ((Integer) objArr[0]).intValue()) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        if (objArr[0] instanceof String) {
            try {
                if (2 < Integer.parseInt((String) objArr[0])) {
                    z = false;
                }
                return Boolean.valueOf(z);
            } catch (Throwable unused) {
            }
        }
        return false;
    }
}
