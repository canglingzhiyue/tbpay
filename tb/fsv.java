package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* loaded from: classes.dex */
public class fsv extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_DATA_PARSER_ORANGE = 2060908603279329344L;

    static {
        kge.a(-1084022869);
    }

    @Override // tb.fuf, com.taobao.android.dinamicx.expression.expr_v2.j
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : "dxOrange";
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        String str = null;
        if (objArr == null || objArr.length < 2 || !(objArr[0] instanceof String) || !(objArr[1] instanceof String)) {
            return null;
        }
        fqj fqjVar = new fqj();
        String str2 = (String) objArr[0];
        if (StringUtils.isEmpty(str2)) {
            return null;
        }
        String str3 = (String) objArr[1];
        if (StringUtils.isEmpty(str3)) {
            return null;
        }
        Object obj = objArr.length >= 3 ? objArr[2] : null;
        if (obj != null) {
            str = obj.toString();
        }
        return fqjVar.a(str2, str3, str);
    }
}
