package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.eventchain.i;
import com.taobao.android.dinamicx.r;

/* loaded from: classes.dex */
public class frw extends fum {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1874718560);
    }

    @Override // tb.fuf, com.taobao.android.dinamicx.expression.expr_v2.j
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : "getEngineStorage";
    }

    @Override // tb.fum
    public Object a(DXRuntimeContext dXRuntimeContext) {
        DinamicXEngine b;
        i g;
        dkt d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("96478e79", new Object[]{this, dXRuntimeContext});
        }
        r C = dXRuntimeContext.C();
        if (C != null && (b = C.b()) != null && (g = b.g()) != null && (d = g.d()) != null) {
            return d.c();
        }
        return null;
    }
}
