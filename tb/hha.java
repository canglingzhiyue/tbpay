package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* loaded from: classes5.dex */
public class hha extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_TBLIVE_GETSERVERTIME = 8895170634865228607L;

    static {
        kge.a(889700275);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (pmd.a().w() != null) {
            currentTimeMillis = pmd.a().w().a();
        }
        if (objArr == null || objArr.length == 0) {
            return Long.valueOf(currentTimeMillis);
        }
        return Long.valueOf(currentTimeMillis);
    }
}
