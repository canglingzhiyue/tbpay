package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.adam.common.Util;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* loaded from: classes4.dex */
public class dno extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_GETTAOGLOBALSETTING = 1538439539176936358L;

    static {
        kge.a(-1332802399);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr != null && objArr.length != 0) {
            return Boolean.valueOf(Util.a(dXRuntimeContext.m(), (String) objArr[0]));
        }
        return null;
    }
}
