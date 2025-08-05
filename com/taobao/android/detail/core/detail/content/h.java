package com.taobao.android.detail.core.detail.content;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class h extends com.taobao.android.dinamicx.h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_DCEVENT = 4766013649142583504L;

    static {
        kge.a(-413237816);
    }

    public h() {
        emu.a("com.taobao.android.detail.core.detail.content.DXDcEventEventHandler");
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
            return;
        }
        Context m = dXRuntimeContext.m();
        if (m == null || objArr == null || objArr.length == 0) {
            return;
        }
        com.taobao.android.trade.event.f.a(m, new b(objArr));
    }
}
