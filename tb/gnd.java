package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.h;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.model.b;

/* loaded from: classes5.dex */
public class gnd extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_ULTRONEVENTDISPATCH = 5772584274023082473L;

    static {
        kge.a(-1429993094);
    }

    public static /* synthetic */ Object ipc$super(gnd gndVar, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void prepareBindEventWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a67c4e2", new Object[]{this, objArr, dXRuntimeContext});
        } else {
            super.prepareBindEventWithArgs(objArr, dXRuntimeContext);
        }
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        bbz a2;
        jny H;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr != null && objArr.length >= 2 && (a2 = bdn.a(dXRuntimeContext)) != null && (H = a2.H()) != null) {
            String str = (String) objArr[1];
            IDMComponent b = H.b((String) objArr[0]);
            if (b.getStatus() == 1) {
                return;
            }
            a2.a(b, str);
            for (b bVar : b.getEventMap().get(str)) {
                bmz a3 = a2.F().a().a(bVar.getType()).a(b);
                a3.a("eventParamOriginTriggerModel", b);
                a3.a(bVar);
                a3.c(str);
                a2.F().a(a3);
            }
        }
    }
}
