package com.taobao.android.detail.ttdetail.utils;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.ArrayList;
import tb.eyx;
import tb.eyy;
import tb.kge;

/* loaded from: classes5.dex */
public class af {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1972954116);
    }

    public static RuntimeAbilityParam[] a(Object[] objArr, DXRuntimeContext dXRuntimeContext, eyx eyxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RuntimeAbilityParam[]) ipChange.ipc$dispatch("d2b4dbec", new Object[]{objArr, dXRuntimeContext, eyxVar});
        }
        ArrayList arrayList = new ArrayList();
        if (objArr != null && objArr.length > 1) {
            Object[] objArr2 = new Object[objArr.length - 1];
            for (int i = 1; i < objArr.length; i++) {
                objArr2[i - 1] = objArr[i];
            }
            arrayList.add(new RuntimeAbilityParam(com.taobao.android.detail.ttdetail.constant.a.DX_EVENT_EXTRA_ARGS, objArr2));
        }
        if (dXRuntimeContext != null) {
            JSONObject e = dXRuntimeContext.e();
            if (e != null && eyxVar != null) {
                arrayList.add(new RuntimeAbilityParam("ttTriggerComponent", eyxVar.b().a(new eyy(e).b())));
            }
            arrayList.add(new RuntimeAbilityParam("ttTriggerView", dXRuntimeContext.v()));
            arrayList.add(new RuntimeAbilityParam("ttTriggerRootView", dXRuntimeContext.s()));
        }
        return (RuntimeAbilityParam[]) arrayList.toArray(new RuntimeAbilityParam[0]);
    }

    public static Object[] a(RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Object[]) ipChange.ipc$dispatch("30497ccf", new Object[]{runtimeAbilityParamArr});
        }
        if (runtimeAbilityParamArr == null) {
            return null;
        }
        for (RuntimeAbilityParam runtimeAbilityParam : runtimeAbilityParamArr) {
            if (com.taobao.android.detail.ttdetail.constant.a.DX_EVENT_EXTRA_ARGS.equals(runtimeAbilityParam.getKey())) {
                Object value = runtimeAbilityParam.getValue();
                if (value instanceof Object[]) {
                    return (Object[]) value;
                }
            }
        }
        return null;
    }
}
