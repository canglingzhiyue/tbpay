package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.expr_v2.f;
import java.util.Map;

/* loaded from: classes.dex */
public class frn extends ful {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_DXEVENTPROP = -3357931786827536758L;

    static {
        kge.a(2014253964);
    }

    public static /* synthetic */ Object ipc$super(frn frnVar, String str, Object... objArr) {
        if (str.hashCode() == -858210922) {
            return super.evalWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.ful, tb.fuf, com.taobao.android.dinamicx.expression.expr_v2.j
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : "dxEventProp";
    }

    public Object a(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        JSONObject a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("cdec3b3a", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        }
        Object evalWithArgs = super.evalWithArgs(objArr, dXRuntimeContext);
        if (evalWithArgs != null) {
            return evalWithArgs;
        }
        if (objArr == null || objArr.length == 0 || !(objArr[0] instanceof String) || dXEvent == null) {
            return new JSONObject();
        }
        if (dXEvent.getArgs() != null && !dXEvent.getArgs().isEmpty()) {
            a2 = new JSONObject();
            for (Map.Entry<String, f> entry : dXEvent.getArgs().entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    a2.put(entry.getKey(), entry.getValue().D());
                }
            }
        } else {
            a2 = fxr.a(dXEvent, true, (Class<? super DXEvent>) DXEvent.class);
        }
        return a((String) objArr[0], a2, dXRuntimeContext);
    }
}
