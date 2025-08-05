package tb;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* loaded from: classes.dex */
public class fsm extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_LINEAR_GRADIENT = 5808997026297879479L;

    static {
        kge.a(-163307022);
    }

    @Override // tb.fuf, com.taobao.android.dinamicx.expression.expr_v2.j
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : "linearGradient";
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        GradientDrawable.Orientation orientation;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length < 3 || !(objArr[0] instanceof String)) {
            return null;
        }
        String str = (String) objArr[0];
        int[] iArr = new int[objArr.length - 1];
        int length = objArr.length;
        for (int i = 1; i < length; i++) {
            try {
                iArr[i - 1] = Color.parseColor(String.valueOf(objArr[i]));
            } catch (Exception unused) {
                String obj = objArr[i] != null ? objArr[i].toString() : null;
                iArr[i - 1] = -12303292;
                Log.e("ParserLinearGradient", obj + "parse Color failed. color miss");
            }
        }
        if ("toLeft".equals(str)) {
            orientation = GradientDrawable.Orientation.RIGHT_LEFT;
        } else if ("toRight".equals(str)) {
            orientation = GradientDrawable.Orientation.LEFT_RIGHT;
        } else if ("toTop".equals(str)) {
            orientation = GradientDrawable.Orientation.BOTTOM_TOP;
        } else if ("toBottom".equals(str)) {
            orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        } else if ("toTopLeft".equals(str)) {
            orientation = GradientDrawable.Orientation.BR_TL;
        } else if ("toTopRight".equals(str)) {
            orientation = GradientDrawable.Orientation.BL_TR;
        } else if ("toBottomLeft".equals(str)) {
            orientation = GradientDrawable.Orientation.TR_BL;
        } else if ("toBottomRight".equals(str)) {
            orientation = GradientDrawable.Orientation.TL_BR;
        } else {
            orientation = GradientDrawable.Orientation.LEFT_RIGHT;
        }
        DXWidgetNode.b bVar = new DXWidgetNode.b();
        bVar.a(0);
        bVar.a(orientation);
        bVar.a(iArr);
        return bVar;
    }
}
