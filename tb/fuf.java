package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError;
import com.taobao.android.dinamicx.expression.expr_v2.f;
import com.taobao.android.dinamicx.expression.expr_v2.h;
import com.taobao.android.dinamicx.expression.expr_v2.j;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class fuf implements j, fut, ghe {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(693425158);
        kge.a(1343895002);
        kge.a(-2117663576);
        kge.a(768463705);
    }

    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        return null;
    }

    @Override // com.taobao.android.dinamicx.expression.expr_v2.j
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.android.dinamicx.expression.expr_v2.j
    public f call(DXRuntimeContext dXRuntimeContext, f fVar, int i, f[] fVarArr, h hVar) throws DXExprFunctionError {
        Object evalWithArgs;
        Object evalWithArgs2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("72be4a64", new Object[]{this, dXRuntimeContext, fVar, new Integer(i), fVarArr, hVar});
        }
        if (i >= 0) {
            Object[] objArr = new Object[i];
            for (int i2 = 0; i2 < i; i2++) {
                objArr[i2] = f.a(fVarArr[i2]);
            }
            if (this instanceof frn) {
                evalWithArgs2 = ((frn) this).a(hVar.a(), objArr, dXRuntimeContext);
            } else {
                evalWithArgs2 = evalWithArgs(objArr, dXRuntimeContext);
            }
            return f.b(evalWithArgs2);
        }
        if (this instanceof frn) {
            evalWithArgs = ((frn) this).a(hVar.a(), (Object[]) null, dXRuntimeContext);
        } else {
            evalWithArgs = evalWithArgs(null, dXRuntimeContext);
        }
        return f.b(evalWithArgs);
    }

    public gfx execute(DXRuntimeContext dXRuntimeContext, gfx gfxVar, int i, gfx[] gfxVarArr, Map map) throws DXExprFunctionError {
        Object evalWithArgs;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gfx) ipChange.ipc$dispatch("e2ae9bd5", new Object[]{this, dXRuntimeContext, gfxVar, new Integer(i), gfxVarArr, map});
        }
        DXEvent dXEvent = null;
        Object[] objArr = null;
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr == null) {
                objArr = new Object[i];
            }
            objArr[i2] = gfx.a(gfxVarArr[i2]);
        }
        if (map != null) {
            Object obj = map.get(ghe.EXTRA_PARAMS_EVENT);
            if (obj instanceof DXEvent) {
                dXEvent = (DXEvent) obj;
            }
        }
        if (this instanceof frn) {
            evalWithArgs = ((frn) this).a(dXEvent, objArr, dXRuntimeContext);
        } else {
            evalWithArgs = evalWithArgs(objArr, dXRuntimeContext);
        }
        return gfx.a(evalWithArgs);
    }
}
