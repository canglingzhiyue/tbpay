package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError;
import com.taobao.android.dinamicx.expression.expr_v2.f;
import com.taobao.android.dinamicx.expression.expr_v2.h;
import com.taobao.android.dinamicx.expression.expr_v2.k;
import com.taobao.android.weex_framework.util.a;

/* loaded from: classes.dex */
public class fua implements k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1736207358);
        kge.a(-1393527289);
    }

    @Override // com.taobao.android.dinamicx.expression.expr_v2.k
    public f a(DXRuntimeContext dXRuntimeContext, f fVar, int i, f[] fVarArr, String str, h hVar) throws DXExprFunctionError {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("be4ea837", new Object[]{this, dXRuntimeContext, fVar, new Integer(i), fVarArr, str, hVar});
        }
        if (i == 0) {
            throw new DXExprFunctionError("argc == 0");
        }
        if (fVarArr == null || fVarArr.length != i) {
            throw new DXExprFunctionError("args == null || args.length != argc");
        }
        if (StringUtils.isEmpty(str)) {
            throw new DXExprFunctionError("function is null");
        }
        char c = 65535;
        switch (str.hashCode()) {
            case 96370:
                if (str.equals(a.ATOM_EXT_abs)) {
                    c = 0;
                    break;
                }
                break;
            case 100893:
                if (str.equals("exp")) {
                    c = 2;
                    break;
                }
                break;
            case 107876:
                if (str.equals("max")) {
                    c = 4;
                    break;
                }
                break;
            case 108114:
                if (str.equals("min")) {
                    c = 5;
                    break;
                }
                break;
            case 3049733:
                if (str.equals(a.ATOM_EXT_ceil)) {
                    c = 1;
                    break;
                }
                break;
            case 97526796:
                if (str.equals(a.ATOM_EXT_floor)) {
                    c = 3;
                    break;
                }
                break;
            case 108704142:
                if (str.equals(a.ATOM_EXT_round)) {
                    c = 6;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return c(fVarArr);
            case 1:
                return d(fVarArr);
            case 2:
                return e(fVarArr);
            case 3:
                return b(fVarArr);
            case 4:
                return a(i, fVarArr);
            case 5:
                return b(i, fVarArr);
            case 6:
                return a(fVarArr);
            default:
                throw new DXExprFunctionError("can not find function on Math:" + str);
        }
    }

    private f a(f[] fVarArr) throws DXExprFunctionError {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("d0276249", new Object[]{this, fVarArr});
        }
        f fVar = fVarArr[0];
        if (fVar == null || !fVar.b()) {
            throw new DXExprFunctionError("args[0] not number");
        }
        return f.a(Math.round(fVar.c()));
    }

    private f a(int i, f[] fVarArr) throws DXExprFunctionError {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("4a1d13fc", new Object[]{this, new Integer(i), fVarArr});
        }
        f fVar = null;
        for (int i2 = 0; i2 < i; i2++) {
            f fVar2 = fVarArr[i2];
            if (fVar2 == null || !fVar2.b()) {
                throw new DXExprFunctionError("args[" + i2 + "] not number");
            }
            if (fVar == null || fVar.c() < fVar2.c()) {
                fVar = fVar2;
            }
        }
        return fVar;
    }

    private f b(int i, f[] fVarArr) throws DXExprFunctionError {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("b789d11b", new Object[]{this, new Integer(i), fVarArr});
        }
        f fVar = null;
        for (int i2 = 0; i2 < i; i2++) {
            f fVar2 = fVarArr[i2];
            if (fVar2 == null || !fVar2.b()) {
                throw new DXExprFunctionError("args[" + i2 + "] not number");
            }
            if (fVar == null || fVar.c() > fVar2.c()) {
                fVar = fVar2;
            }
        }
        return fVar;
    }

    private f b(f[] fVarArr) throws DXExprFunctionError {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("d3af054a", new Object[]{this, fVarArr});
        }
        f fVar = fVarArr[0];
        if (fVar == null || !fVar.b()) {
            throw new DXExprFunctionError("args[0] not number");
        }
        return f.a((int) Math.floor(fVar.c()));
    }

    private f c(f[] fVarArr) throws DXExprFunctionError {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("d736a84b", new Object[]{this, fVarArr});
        }
        f fVar = fVarArr[0];
        if (fVar == null || !fVar.b()) {
            throw new DXExprFunctionError("args[0] not number");
        }
        if (fVar.v()) {
            return f.a(Math.abs(fVar.w()));
        }
        return f.a(Math.abs(fVar.z()));
    }

    private f d(f[] fVarArr) throws DXExprFunctionError {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("dabe4b4c", new Object[]{this, fVarArr});
        }
        f fVar = fVarArr[0];
        if (fVar == null || !fVar.b()) {
            throw new DXExprFunctionError("args[0] not number");
        }
        return f.a((int) Math.ceil(fVar.c()));
    }

    private f e(f[] fVarArr) throws DXExprFunctionError {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("de45ee4d", new Object[]{this, fVarArr});
        }
        f fVar = fVarArr[0];
        if (fVar == null || !fVar.b()) {
            throw new DXExprFunctionError("args[0] not number");
        }
        return f.a(Math.exp(fVar.c()));
    }
}
