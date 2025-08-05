package tb;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* loaded from: classes5.dex */
public class fui extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_GETVISIBLERECT = 7854820902555606954L;

    static {
        kge.a(1787870025);
    }

    public static /* synthetic */ Object ipc$super(fui fuiVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.fuf, com.taobao.android.dinamicx.expression.expr_v2.j
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : "getVisibleRect";
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext}) : a(dXRuntimeContext.m(), dXRuntimeContext.d());
    }

    private JSONObject a(Context context, DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e3479ef", new Object[]{this, context, dXWidgetNode});
        }
        DXWidgetNode parentWidget = ((dXWidgetNode instanceof gba) || (dXWidgetNode instanceof gay)) ? dXWidgetNode.getParentWidget() : dXWidgetNode;
        while (parentWidget instanceof gax) {
            parentWidget = parentWidget.getParentWidget();
            if (!(parentWidget instanceof gax)) {
                break;
            }
        }
        JSONObject jSONObject = new JSONObject();
        if (parentWidget != null) {
            View v = parentWidget.getDXRuntimeContext().v();
            if (v != null) {
                Rect rect = new Rect();
                v.getGlobalVisibleRect(rect);
                jSONObject.put("x", (Object) Integer.valueOf(rect.left));
                jSONObject.put("y", (Object) Integer.valueOf(rect.top));
            }
            jSONObject.put("width", (Object) Integer.valueOf(parentWidget.getMeasuredWidth()));
            jSONObject.put("height", (Object) Integer.valueOf(parentWidget.getMeasuredHeight()));
            jSONObject.put("w_ap", (Object) Integer.valueOf(gbg.b(dXWidgetNode.getEngine(), context, parentWidget.getMeasuredWidth())));
            jSONObject.put("h_ap", (Object) Integer.valueOf(gbg.b(dXWidgetNode.getEngine(), context, parentWidget.getMeasuredHeight())));
        }
        return jSONObject;
    }
}
