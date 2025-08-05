package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.ultron.common.model.IDMComponent;

/* loaded from: classes5.dex */
public class gng extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_CARTEXISTCOMPONENTSBYTAG = 1508797689610607788L;

    static {
        kge.a(1780953371);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr != null && objArr.length != 0) {
            bbz a2 = bdn.a(dXRuntimeContext);
            for (Object obj : objArr) {
                IDMComponent e = a2.n().e(String.valueOf(obj));
                if (e != null && e.isNormalComponent()) {
                    return true;
                }
            }
        }
        return false;
    }
}
