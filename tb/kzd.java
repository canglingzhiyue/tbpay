package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;
import com.taobao.homepage.pop.protocol.model.section.BasePopSectionModel;
import com.taobao.homepage.pop.utils.b;

/* loaded from: classes.dex */
public class kzd extends kyx {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_POPCANCEL = -2380511699857178210L;

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        BasePopSectionModel<?> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
            return;
        }
        kyu b = b.b(dXRuntimeContext);
        IPopData c = b.c(dXRuntimeContext);
        if (b == null || c == null || (a2 = b.a(dXRuntimeContext)) == null) {
            return;
        }
        a(a2, a(1, a2));
        b.a(1, c.getBusinessID());
    }
}
