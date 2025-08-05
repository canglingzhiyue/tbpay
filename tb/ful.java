package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;

/* loaded from: classes.dex */
public class ful extends fum {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_EVENTCHAINEVENTDATA = 5680234302234270868L;

    static {
        kge.a(-829977882);
    }

    public static /* synthetic */ Object ipc$super(ful fulVar, String str, Object... objArr) {
        if (str.hashCode() == -858210922) {
            return super.evalWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.fuf, com.taobao.android.dinamicx.expression.expr_v2.j
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : "eventChainEventData";
    }

    @Override // tb.fum, tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        Object evalWithArgs = super.evalWithArgs(objArr, dXRuntimeContext);
        if (evalWithArgs != null) {
            return evalWithArgs;
        }
        if (!fqi.x() || dXRuntimeContext == null || dXRuntimeContext.E() == null) {
            return null;
        }
        DXEvent e = dXRuntimeContext.E().e();
        if (objArr == null || objArr.length == 0 || !(objArr[0] instanceof String) || e == null) {
            return new JSONObject();
        }
        return a((String) objArr[0], a(e), dXRuntimeContext);
    }

    @Override // tb.fum
    public Object a(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("96478e79", new Object[]{this, dXRuntimeContext});
        }
        if (dXRuntimeContext != null && dXRuntimeContext.E() != null) {
            return dXRuntimeContext.E().d();
        }
        return null;
    }

    public JSONObject a(DXEvent dXEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (JSONObject) ipChange.ipc$dispatch("b1378a4a", new Object[]{this, dXEvent}) : fxr.a(dXEvent, true, (Class<? super DXEvent>) DXEvent.class);
    }
}
