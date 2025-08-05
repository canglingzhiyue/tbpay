package com.taobao.android.dinamicx.muise;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.expr_v2.DXExprFunctionError;
import com.taobao.android.dinamicx.expression.expr_v2.f;
import com.taobao.android.dinamicx.expression.expr_v2.h;
import com.taobao.android.dinamicx.expression.expr_v2.j;
import com.taobao.android.weex_framework.l;

/* loaded from: classes.dex */
public class d implements j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.taobao.android.dinamicx.expression.expr_v2.j
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : "removeItem";
    }

    @Override // com.taobao.android.dinamicx.expression.expr_v2.j
    public f call(DXRuntimeContext dXRuntimeContext, f fVar, int i, f[] fVarArr, h hVar) throws DXExprFunctionError {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f) ipChange.ipc$dispatch("72be4a64", new Object[]{this, dXRuntimeContext, fVar, new Integer(i), fVarArr, hVar});
        }
        if (i == 0) {
            throw new DXExprFunctionError("argc == 0");
        }
        f fVar2 = fVarArr[0];
        if (fVar2 == null || !fVar2.k()) {
            throw new DXExprFunctionError("args[0] not string");
        }
        com.taobao.android.weex_framework.module.builtin.storage.b c = l.a().c();
        if (c != null) {
            c.c(fVar2.i(), null);
        }
        return null;
    }
}
