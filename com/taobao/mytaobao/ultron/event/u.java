package com.taobao.mytaobao.ultron.event;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.h;
import kotlin.Metadata;
import kotlin.collections.g;
import tb.kge;
import tb.mua;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J3\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\u0010\u0007\u001a\f\u0012\u0006\b\u0001\u0012\u00020\t\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/taobao/mytaobao/ultron/event/DXMtbUtEventHandler;", "Lcom/taobao/android/dinamicx/DXAbsEventHandler;", "()V", "handleEvent", "", "event", "Lcom/taobao/android/dinamicx/expression/event/DXEvent;", "args", "", "", "runtimeContext", "Lcom/taobao/android/dinamicx/DXRuntimeContext;", "(Lcom/taobao/android/dinamicx/expression/event/DXEvent;[Ljava/lang/Object;Lcom/taobao/android/dinamicx/DXRuntimeContext;)V", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class u extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1338014392);
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
            return;
        }
        JSONObject jSONObject = null;
        Object a2 = objArr != null ? g.a(objArr, 0) : null;
        if (!(a2 instanceof JSONObject)) {
            a2 = null;
        }
        JSONObject jSONObject2 = (JSONObject) a2;
        if (jSONObject2 == null) {
            return;
        }
        Object a3 = objArr != null ? g.a(objArr, 1) : null;
        if (!(a3 instanceof JSONObject)) {
            a3 = null;
        }
        JSONObject jSONObject3 = (JSONObject) a3;
        Object remove = jSONObject3 != null ? jSONObject3.remove("args") : null;
        if (remove instanceof JSONObject) {
            jSONObject = remove;
        }
        JSONObject jSONObject4 = jSONObject;
        if (jSONObject3 != null) {
            jSONObject2.putAll(jSONObject3);
        }
        String string = jSONObject2.getString("page");
        int intValue = jSONObject2.getIntValue("eventId");
        String string2 = jSONObject2.getString("arg1");
        String string3 = jSONObject2.getString("arg2");
        String string4 = jSONObject2.getString("arg3");
        JSONObject jSONObject5 = jSONObject2.getJSONObject("args");
        if (jSONObject5 == null) {
            jSONObject5 = new JSONObject();
        }
        JSONObject jSONObject6 = jSONObject5;
        if (jSONObject4 != null) {
            jSONObject6.putAll(jSONObject4);
        }
        mua.a(string, intValue, string2, string3, string4, jSONObject6);
    }
}
