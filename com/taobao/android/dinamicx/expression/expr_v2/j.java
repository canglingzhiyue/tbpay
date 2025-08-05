package com.taobao.android.dinamicx.expression.expr_v2;

import com.taobao.android.dinamicx.DXRuntimeContext;

/* loaded from: classes.dex */
public interface j {
    f call(DXRuntimeContext dXRuntimeContext, f fVar, int i, f[] fVarArr, h hVar) throws DXExprFunctionError;

    String getDxFunctionName();
}
