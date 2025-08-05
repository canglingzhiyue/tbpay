package tb;

import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.bx;
import com.taobao.android.dinamicx.eventchain.j;
import com.taobao.android.dinamicx.eventchain.o;
import com.taobao.android.dinamicx.eventchain.p;
import com.taobao.android.dinamicx.r;

/* loaded from: classes5.dex */
public class kqy extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_MEGAABILITYHUB = -1513454629675625835L;

    static {
        kge.a(1682183674);
    }

    @Override // tb.fuf, com.taobao.android.dinamicx.expression.expr_v2.j
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : "megaAbilityHub";
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        DinamicXEngine b;
        alu P;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        JSONObject jSONObject2 = new JSONObject(0);
        r C = dXRuntimeContext.C();
        if (C != null && (b = C.b()) != null && (P = b.P()) != null && objArr != null && objArr.length >= 2 && (objArr[0] instanceof String) && (objArr[1] instanceof String)) {
            String str = (String) objArr[0];
            String str2 = (String) objArr[1];
            if (objArr.length > 2 && (objArr[2] instanceof JSONObject)) {
                jSONObject = (JSONObject) objArr[2];
            } else {
                jSONObject = new JSONObject(0);
            }
            JSONObject jSONObject3 = jSONObject;
            alq alqVar = new alq();
            o.a(alqVar, dXRuntimeContext);
            alo aloVar = new alo() { // from class: tb.kqy.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.alo
                public void onCallback(ExecuteResult executeResult) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f183ed74", new Object[]{this, executeResult});
                    }
                }
            };
            ExecuteResult a2 = o.a(str, dXRuntimeContext, str2, alqVar, jSONObject3, aloVar);
            if (a2 != null) {
                return j.a(new p(a2));
            }
            ExecuteResult a3 = P.a(str, str2, alqVar, jSONObject3, aloVar);
            if (a3 != null && a3.d() <= 99 && a3.e() != null) {
                if (bx.m()) {
                    fuw.h("DXDataParserMegaAbilityHub " + JSON.toJSONString(a3));
                }
                return a3.e().get("result");
            }
        }
        return jSONObject2;
    }
}
