package com.taobao.android.order.core.dinamicX.parser;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import tb.fuf;
import tb.gbg;
import tb.ibm;
import tb.kge;

/* loaded from: classes6.dex */
public class g extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_ORDERNAVBARHEIGHT = 1442841143712731328L;

    static {
        kge.a(-886981310);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (!(dXRuntimeContext.m() instanceof Activity)) {
            return "0ap";
        }
        return gbg.c(dXRuntimeContext.m(), ibm.a((Activity) dXRuntimeContext.m())) + "ap";
    }
}
