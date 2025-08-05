package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* loaded from: classes.dex */
public class fte extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(292141855);
    }

    @Override // tb.fuf, com.taobao.android.dinamicx.expression.expr_v2.j
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : "substr";
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        String str = null;
        if (objArr == null || objArr.length > 3 || objArr.length < 2) {
            return null;
        }
        Object obj = objArr[0];
        if (!(obj instanceof String)) {
            return null;
        }
        String str2 = (String) obj;
        Object obj2 = objArr[1];
        if (!(obj2 instanceof String)) {
            return null;
        }
        int a2 = fqr.a((String) obj2);
        if (objArr.length == 3) {
            Number c = fqr.c(objArr[2]);
            if (c == null) {
                return null;
            }
            int intValue = c.intValue();
            if (intValue < 0 || a2 + 1 > str2.length()) {
                return "";
            }
            if (a2 < 0) {
                a2 = 0;
            }
            int i = intValue + a2;
            if (i > str2.length()) {
                str = str2.substring(a2);
            }
            return i + (-1) < str2.length() ? str2.substring(a2, i) : str;
        } else if (a2 + 1 > str2.length()) {
            return "";
        } else {
            if (a2 < 0) {
                a2 = 0;
            }
            return str2.substring(a2);
        }
    }
}
