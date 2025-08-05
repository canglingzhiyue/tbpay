package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.IDXHardwareInterface;
import com.taobao.android.dinamicx.u;

/* loaded from: classes.dex */
public class frm extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_DXDEVICELEVEL = 3863236816138429745L;
    public static final String PARAM_LEVEL_HIGH = "high";
    public static final String PARAM_LEVEL_LOW = "low";
    public static final String PARAM_LEVEL_MEDIUM = "medium";
    public static final String PARAM_LEVEL_UNKNOWN = "unknown";

    static {
        kge.a(1382586749);
    }

    @Override // tb.fuf, com.taobao.android.dinamicx.expression.expr_v2.j
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : "deviceLevel";
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IDXHardwareInterface e;
        int a2;
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length == 0 || (e = u.e()) == null) {
            return false;
        }
        Object obj = objArr[0];
        if (!(obj instanceof String)) {
            return false;
        }
        String lowerCase = ((String) obj).toLowerCase();
        try {
            a2 = e.a();
        } catch (Throwable unused) {
        }
        if ("low".equals(lowerCase)) {
            if (a2 != 2) {
                z = false;
            }
            return Boolean.valueOf(z);
        } else if ("medium".equals(lowerCase)) {
            if (a2 != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        } else if ("high".equals(lowerCase)) {
            if (a2 != 0) {
                z = false;
            }
            return Boolean.valueOf(z);
        } else {
            if ("unknown".equals(lowerCase)) {
                if (a2 != -1) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
            return false;
        }
    }
}
