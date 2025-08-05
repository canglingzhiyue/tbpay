package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.tbtheme.kit.j;

/* loaded from: classes.dex */
public class jdm extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_TAOBAO_THEME_GET_CURRENT = -8116936510285409279L;

    static {
        kge.a(1793654617);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        String str = null;
        if (objArr == null || objArr.length == 0 || objArr.length <= 1) {
            return null;
        }
        String str2 = objArr[0] instanceof String ? (String) objArr[0] : null;
        if (objArr[1] instanceof String) {
            str = (String) objArr[1];
        }
        return j.a().a(str2, str);
    }
}
