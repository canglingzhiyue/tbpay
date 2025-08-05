package com.taobao.mytaobao.ultron.event;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.DXScrollEvent;
import com.taobao.android.dinamicx.h;
import kotlin.Metadata;
import kotlin.collections.g;
import tb.gbg;
import tb.kge;
import tb.mua;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J1\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\u0010\u0007\u001a\f\u0012\u0006\b\u0001\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/taobao/mytaobao/ultron/event/DXMtbToolsEditExposeEventHandler;", "Lcom/taobao/android/dinamicx/DXAbsEventHandler;", "()V", "handleEvent", "", "event", "Lcom/taobao/android/dinamicx/expression/event/DXEvent;", "args", "", "", "runtimeContext", "Lcom/taobao/android/dinamicx/DXRuntimeContext;", "(Lcom/taobao/android/dinamicx/expression/event/DXEvent;[Ljava/lang/Object;Lcom/taobao/android/dinamicx/DXRuntimeContext;)V", "taobao_mytaobao_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class t extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1549229952);
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext runtimeContext) {
        Object a2;
        String obj;
        String obj2;
        String string;
        String string2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, runtimeContext});
            return;
        }
        kotlin.jvm.internal.q.c(runtimeContext, "runtimeContext");
        if (!(dXEvent instanceof DXScrollEvent)) {
            dXEvent = null;
        }
        DXScrollEvent dXScrollEvent = (DXScrollEvent) dXEvent;
        if (dXScrollEvent == null || objArr == null || (a2 = g.a(objArr, 0)) == null || (obj = a2.toString()) == null) {
            return;
        }
        float parseFloat = Float.parseFloat(obj);
        Object a3 = g.a(objArr, 1);
        if (a3 == null || (obj2 = a3.toString()) == null) {
            return;
        }
        float parseFloat2 = Float.parseFloat(obj2);
        Object a4 = g.a(objArr, 2);
        if (!(a4 instanceof JSONObject)) {
            a4 = null;
        }
        JSONObject jSONObject = (JSONObject) a4;
        if (jSONObject == null || (dXScrollEvent.getContentSize().f11827a - dXScrollEvent.getScrollerSize().f11827a) - dXScrollEvent.getOffsetX() >= gbg.b(runtimeContext.m(), (parseFloat2 * 0.5f) + parseFloat) || (string = jSONObject.getString("page")) == null || (string2 = jSONObject.getString("arg1")) == null) {
            return;
        }
        mua.a(string, 2201, string2, null, null, jSONObject.getJSONObject("args"));
    }
}
