package com.taobao.android.dinamicx;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError;
import tb.kge;

/* loaded from: classes.dex */
public abstract class h implements bn, com.taobao.android.dinamicx.expression.expr_v2.j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1649712699);
        kge.a(600646234);
        kge.a(-2117663576);
    }

    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.android.dinamicx.bn
    public abstract void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext);

    @Override // com.taobao.android.dinamicx.bn
    public void prepareBindEventWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a67c4e2", new Object[]{this, objArr, dXRuntimeContext});
        }
    }

    @Override // com.taobao.android.dinamicx.expression.expr_v2.j
    public com.taobao.android.dinamicx.expression.expr_v2.f call(DXRuntimeContext dXRuntimeContext, com.taobao.android.dinamicx.expression.expr_v2.f fVar, int i, com.taobao.android.dinamicx.expression.expr_v2.f[] fVarArr, com.taobao.android.dinamicx.expression.expr_v2.h hVar) throws DXExprFunctionError {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.dinamicx.expression.expr_v2.f) ipChange.ipc$dispatch("72be4a64", new Object[]{this, dXRuntimeContext, fVar, new Integer(i), fVarArr, hVar});
        }
        if (i >= 0) {
            Object[] objArr = new Object[i];
            for (int i2 = 0; i2 < i; i2++) {
                objArr[i2] = com.taobao.android.dinamicx.expression.expr_v2.f.a(fVarArr[i2]);
            }
            if (hVar.a() != null && hVar.a().isPrepareBind()) {
                prepareBindEventWithArgs(objArr, dXRuntimeContext);
            } else {
                handleEvent(hVar.a(), objArr, dXRuntimeContext);
            }
            return com.taobao.android.dinamicx.expression.expr_v2.f.b((Object) null);
        }
        if (hVar.a() != null && hVar.a().isPrepareBind()) {
            prepareBindEventWithArgs(null, dXRuntimeContext);
        } else {
            handleEvent(hVar.a(), null, dXRuntimeContext);
        }
        return com.taobao.android.dinamicx.expression.expr_v2.f.f();
    }
}
