package tb;

import android.app.Activity;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.h;
import com.taobao.android.order.core.e;

/* loaded from: classes6.dex */
public class hzt extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_CLOSE_ACTIVITY = -4639755379645601680L;

    static {
        kge.a(815081574);
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
            return;
        }
        Context m = dXRuntimeContext.m();
        hzy.a("DXCloseActivityEventHandler", "handleEvent", "----");
        if (!(m instanceof Activity)) {
            return;
        }
        if (m instanceof e) {
            ((e) m).a(true);
        }
        ((Activity) m).finish();
    }
}
