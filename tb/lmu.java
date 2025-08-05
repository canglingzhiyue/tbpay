package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.bg;

/* loaded from: classes5.dex */
public class lmu extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_GETVARIABLE = 6682077146294913393L;

    static {
        kge.a(-2074379115);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        bg dxv3VariableInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        Object obj = null;
        if (objArr != null && objArr.length != 0) {
            String valueOf = String.valueOf(objArr[0]);
            if (objArr.length == 2) {
                obj = objArr[1];
            }
            DXWidgetNode queryRootWidgetNode = dXRuntimeContext.d().queryRootWidgetNode();
            if (queryRootWidgetNode == null || (dxv3VariableInfo = queryRootWidgetNode.getDxv3VariableInfo()) == null) {
                return obj;
            }
            Object a2 = dxv3VariableInfo.a(valueOf, dXRuntimeContext);
            if (a2 != null && !(a2 instanceof bg.a)) {
                return a2;
            }
        }
        return obj;
    }
}
