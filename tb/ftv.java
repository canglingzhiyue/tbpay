package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.al;

/* loaded from: classes.dex */
public class ftv extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_GETWIDGETPROPERTYVALUE = 1720632590440773916L;

    static {
        kge.a(-367994049);
    }

    @Override // tb.fuf, com.taobao.android.dinamicx.expression.expr_v2.j
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : "getWidgetPropertyValue";
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        DXWidgetNode d;
        DXWidgetNode dXWidgetNode;
        Object nodePropByKey;
        DXRootView s;
        DXWidgetNode expandWidgetNode;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        Object obj = null;
        if (objArr == null || objArr.length < 2 || objArr[1] == null) {
            return null;
        }
        Object obj2 = objArr[0];
        String str = "";
        String str2 = (!(obj2 instanceof String) || StringUtils.isEmpty((CharSequence) obj2)) ? str : (String) obj2;
        Object obj3 = objArr[1];
        if (obj3 instanceof String) {
            str = (String) obj3;
        }
        if (objArr.length >= 3) {
            obj = objArr[2];
        }
        if (StringUtils.isEmpty(str) || (d = dXRuntimeContext.d()) == null) {
            return obj;
        }
        if (StringUtils.isEmpty(str2) || str2.equals(d.getUserId())) {
            dXWidgetNode = d;
        } else {
            dXWidgetNode = d.queryWidgetNodeByUserId(str2);
            if (dXWidgetNode == null && d.getDXRuntimeContext() != null && (s = d.getDXRuntimeContext().s()) != null && (expandWidgetNode = s.getExpandWidgetNode()) != null) {
                dXWidgetNode = expandWidgetNode.queryWidgetNodeByUserId(str2);
            }
        }
        if ("root".equals(str2) && dXWidgetNode == null) {
            dXWidgetNode = d.queryRootWidgetNode();
        }
        return ((dXWidgetNode instanceof al) && (nodePropByKey = ((al) dXWidgetNode).getNodePropByKey(str)) != null) ? nodePropByKey : obj;
    }
}
