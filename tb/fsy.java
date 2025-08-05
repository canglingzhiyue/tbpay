package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* loaded from: classes.dex */
public class fsy extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_DATA_PARSER_RECYCLER_CURRENT_POSITION = -4732527849534416472L;

    static {
        kge.a(-2004536410);
    }

    @Override // tb.fuf, com.taobao.android.dinamicx.expression.expr_v2.j
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : "recyclerCurrentPosition";
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        DXWidgetNode expandWidgetNode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        int i = -1;
        if (objArr == null || objArr.length < 2 || dXRuntimeContext == null) {
            return -1;
        }
        Object obj = objArr[1];
        if (obj instanceof String) {
            String str = (String) obj;
            DXRootView s = dXRuntimeContext.s();
            if (s != null && (expandWidgetNode = s.getExpandWidgetNode()) != null) {
                DXWidgetNode queryWidgetNodeByUserId = expandWidgetNode.queryWidgetNodeByUserId(str);
                if (queryWidgetNodeByUserId instanceof DXRecyclerLayout) {
                    i = ((DXRecyclerLayout) queryWidgetNodeByUserId).a();
                }
            }
        }
        return Integer.valueOf(i);
    }
}
