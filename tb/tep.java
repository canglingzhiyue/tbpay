package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.u;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.ac;

/* loaded from: classes5.dex */
public class tep extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_LOCALIZEDTEXT = 9207027465889631337L;

    static {
        kge.a(380893085);
    }

    public static /* synthetic */ Object ipc$super(tep tepVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.fuf, com.taobao.android.dinamicx.expression.expr_v2.j
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : "localizedText";
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length == 0 || objArr[0] == null) {
            return null;
        }
        DXWidgetNode a2 = a(dXRuntimeContext.d());
        String obj = objArr[0].toString();
        if (objArr.length > 1 && objArr[1] != null) {
            return a2.getLanguageString(obj, (String) objArr[1]);
        }
        return a2.getLanguageString(u.k().a(), obj);
    }

    private DXWidgetNode a(DXWidgetNode dXWidgetNode) {
        DXWidgetNode queryRootWidgetNode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("1e0c66e6", new Object[]{this, dXWidgetNode});
        }
        if (dXWidgetNode == null || (queryRootWidgetNode = dXWidgetNode.queryRootWidgetNode()) == null) {
            return null;
        }
        return (!(queryRootWidgetNode.getParentWidget() instanceof ac) || ((ac) queryRootWidgetNode.getParentWidget()).e() != 1) ? queryRootWidgetNode : a(queryRootWidgetNode.getParentWidget());
    }
}
