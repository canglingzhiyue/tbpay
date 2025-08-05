package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* loaded from: classes.dex */
public class fsz extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_RECYCLERDATAINDEX = -1158194156417975076L;

    static {
        kge.a(-997212116);
    }

    @Override // tb.fuf, com.taobao.android.dinamicx.expression.expr_v2.j
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : "recyclerDataIndex";
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (dXRuntimeContext == null || dXRuntimeContext.d() == null) {
            return -1;
        }
        DXWidgetNode d = dXRuntimeContext.d();
        DXWidgetNode dXWidgetNode = d;
        while (dXWidgetNode.getParentWidget() != null) {
            dXWidgetNode = dXWidgetNode.getParentWidget();
            if (dXWidgetNode instanceof DXRecyclerLayout) {
                return Integer.valueOf(((DXRecyclerLayout) dXWidgetNode).d(d));
            }
        }
        return -1;
    }
}
