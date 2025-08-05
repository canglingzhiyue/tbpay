package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* loaded from: classes.dex */
public class frh extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_DXVERSION_GREATERTHANOREQUALTO = 87712825513562832L;

    static {
        kge.a(140516536);
    }

    @Override // tb.fuf, com.taobao.android.dinamicx.expression.expr_v2.j
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : "DXVersion_GreaterThanOrEqualTo";
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length != 1 || !(objArr[0] instanceof String)) {
            return false;
        }
        String[] split = "4.1.27.18".split("\\.");
        String[] split2 = ((String) objArr[0]).split("\\.");
        if (split.length == 4 && split2.length == 4) {
            for (int i = 0; i < 4; i++) {
                String str = split[i];
                String str2 = split2[i];
                if (i == 3) {
                    try {
                        if (str.contains("-")) {
                            str = str.split("-")[0];
                        }
                        if (str2.contains("-")) {
                            str2 = str2.split("-")[0];
                        }
                    } catch (Exception unused) {
                    }
                }
                int parseInt = Integer.parseInt(str);
                int parseInt2 = Integer.parseInt(str2);
                if (parseInt2 > parseInt) {
                    return true;
                }
                if (parseInt2 < parseInt) {
                    return false;
                }
                if (i == 3) {
                    return true;
                }
            }
        }
        return false;
    }
}
