package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.util.Map;

/* loaded from: classes.dex */
public class gfd implements ghg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2003593114);
        kge.a(-1918806736);
    }

    @Override // tb.ghg
    public ggk a(DXRuntimeContext dXRuntimeContext, String str) {
        Map<String, ggk> variableNameMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ggk) ipChange.ipc$dispatch("bf651798", new Object[]{this, dXRuntimeContext, str});
        }
        DXWidgetNode d = dXRuntimeContext.d();
        if (d == null || (variableNameMap = d.getVariableNameMap()) == null) {
            return null;
        }
        if ("runtimeContext".equals(str)) {
            return new ggh(dXRuntimeContext);
        }
        return variableNameMap.get(str);
    }
}
