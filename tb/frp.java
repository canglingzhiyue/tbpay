package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.live.plugin.atype.flexalocal.smartlanding.business.SmartLandingTask;

/* loaded from: classes.dex */
public class frp extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(925616663);
    }

    @Override // tb.fuf, com.taobao.android.dinamicx.expression.expr_v2.j
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : SmartLandingTask.Operation.STR_EQUAL;
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length != 2) {
            return null;
        }
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        if (obj == null && obj2 == null) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        if (obj.getClass().equals(obj2.getClass())) {
            return Boolean.valueOf(obj.equals(obj2));
        }
        if ((obj instanceof Number) && (obj2 instanceof Number)) {
            return Boolean.valueOf(fqr.a((Number) obj, (Number) obj2));
        }
        return Boolean.valueOf(obj.equals(obj2));
    }
}
