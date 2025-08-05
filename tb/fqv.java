package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.eventchain.i;
import com.taobao.android.dinamicx.eventchain.l;
import com.taobao.android.dinamicx.r;

/* loaded from: classes.dex */
public class fqv extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_ABILITYHUB = -8392059985777200873L;

    static {
        kge.a(1301041768);
    }

    @Override // tb.fuf, com.taobao.android.dinamicx.expression.expr_v2.j
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : "abilityHub";
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        DinamicXEngine b;
        i g;
        dkt d;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        JSONObject jSONObject2 = new JSONObject(0);
        r C = dXRuntimeContext.C();
        if (C != null && (b = C.b()) != null && (g = b.g()) != null && (d = g.d()) != null && objArr != null && objArr.length > 0 && (objArr[0] instanceof String)) {
            String str = (String) objArr[0];
            if (objArr.length > 1 && (objArr[1] instanceof JSONObject)) {
                jSONObject = (JSONObject) objArr[1];
            } else {
                jSONObject = new JSONObject(0);
            }
            JSONObject jSONObject3 = new JSONObject(2);
            jSONObject3.put("type", (Object) str);
            jSONObject3.put("params", (Object) jSONObject);
            l lVar = new l();
            lVar.a(dXRuntimeContext.m());
            lVar.a(dXRuntimeContext.v());
            lVar.a(d);
            lVar.a(dXRuntimeContext.s());
            lVar.a(dXRuntimeContext.d());
            dkx a2 = d.a(jSONObject3, lVar, new dll() { // from class: tb.fqv.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.dll
                public void callback(String str2, dkx dkxVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("398d9b15", new Object[]{this, str2, dkxVar});
                    }
                }
            });
            if (a2 instanceof dla) {
                return a2.c();
            }
        }
        return jSONObject2;
    }
}
