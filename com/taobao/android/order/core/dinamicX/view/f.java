package com.taobao.android.order.core.dinamicX.view;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import tb.kge;

/* loaded from: classes6.dex */
public class f extends com.taobao.android.megadesign.dx.view.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1857512447);
    }

    public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
        if (str.hashCode() == 2119721610) {
            super.onClone((DXWidgetNode) objArr[0], ((Boolean) objArr[1]).booleanValue());
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.megadesign.dx.view.d, com.taobao.android.dinamicx.widget.x, com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.widget.ak
    public DXWidgetNode build(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXWidgetNode) ipChange.ipc$dispatch("966917b0", new Object[]{this, obj}) : new f();
    }

    @Override // com.taobao.android.megadesign.dx.view.d, com.taobao.android.dinamicx.widget.x, com.taobao.android.dinamicx.widget.v, com.taobao.android.dinamicx.widget.o, com.taobao.android.dinamicx.widget.m, com.taobao.android.dinamicx.widget.DXWidgetNode
    public void onClone(DXWidgetNode dXWidgetNode, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e58628a", new Object[]{this, dXWidgetNode, new Boolean(z)});
            return;
        }
        super.onClone(dXWidgetNode, z);
        try {
            a();
        } catch (Throwable unused) {
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (getDXRuntimeContext() == null || getDXRuntimeContext().e() == null || !(getDXRuntimeContext().e().get("fields") instanceof JSONObject)) {
        } else {
            JSONObject jSONObject = (JSONObject) getDXRuntimeContext().e().get("fields");
            if (getOrientation() != 0 || !(jSONObject.get("scrolledX") instanceof Integer)) {
                return;
            }
            Integer num = (Integer) jSONObject.get("scrolledX");
            if (num != null) {
                i = num.intValue();
            }
            this.contentOffset = i;
        }
    }
}
