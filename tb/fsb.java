package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import tb.fqq;

/* loaded from: classes.dex */
public class fsb extends fug {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1253094118);
    }

    @Override // tb.fuf, com.taobao.android.dinamicx.expression.expr_v2.j
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : "if";
    }

    @Override // tb.fug
    public Object a(Object[] objArr, DXRuntimeContext dXRuntimeContext, fqq.a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("d7eec116", new Object[]{this, objArr, dXRuntimeContext, aVar, new Integer(i)});
        }
        if (i == 0) {
            aVar.f28130a = !fqr.a(objArr[0]);
            return null;
        }
        aVar.f28130a = true;
        if (i != 1) {
            return null;
        }
        return objArr[1];
    }
}
