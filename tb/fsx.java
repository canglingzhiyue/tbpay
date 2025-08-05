package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXRecyclerLayout;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* loaded from: classes.dex */
public class fsx extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_QUERYRECYCLERCELLINDEXBYUSERID = 2161714594209669644L;

    static {
        kge.a(616770115);
    }

    @Override // tb.fuf, com.taobao.android.dinamicx.expression.expr_v2.j
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : "queryRecyclerCellIndexByUserId";
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        DXWidgetNode queryWTByUserId;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (dXRuntimeContext == null || dXRuntimeContext.d() == null) {
            return -1;
        }
        if (objArr == null || objArr.length != 2) {
            return -2;
        }
        if (objArr[0] == null) {
            return -20;
        }
        if (objArr[1] == null) {
            return -21;
        }
        String obj = objArr[0].toString();
        if (TextUtils.isEmpty(obj)) {
            return -3;
        }
        DXRootView s = dXRuntimeContext.s();
        if (s == null) {
            return -4;
        }
        DXWidgetNode expandWidgetNode = s.getExpandWidgetNode();
        if (expandWidgetNode == null) {
            return -5;
        }
        if (fqi.b(expandWidgetNode.getDXRuntimeContext())) {
            queryWTByUserId = expandWidgetNode.queryWidgetNodeByUserId(obj);
        } else {
            queryWTByUserId = expandWidgetNode.queryWTByUserId(obj);
        }
        if (!(queryWTByUserId instanceof DXRecyclerLayout)) {
            return -7;
        }
        String obj2 = objArr[1].toString();
        if (TextUtils.isEmpty(obj2)) {
            return -8;
        }
        int a2 = ((DXRecyclerLayout) queryWTByUserId).a(obj2);
        if (a2 < 0) {
            return -9;
        }
        return Integer.valueOf(a2);
    }
}
