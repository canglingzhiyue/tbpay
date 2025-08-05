package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.DXScrollEvent;
import com.taobao.android.dinamicx.h;
import java.util.Map;

/* loaded from: classes2.dex */
public class bii extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_WALLETSCROLLED = 8426368269627570127L;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, Integer> f25924a;

    static {
        kge.a(-1327831750);
    }

    public static /* synthetic */ Object ipc$super(bii biiVar, String str, Object... objArr) {
        if (str.hashCode() == 1785185506) {
            super.prepareBindEventWithArgs((Object[]) objArr[0], (DXRuntimeContext) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public bii(Map<String, Integer> map) {
        this.f25924a = map;
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
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
            return;
        }
        String str = "args=" + objArr;
        if (this.f25924a == null || dXRuntimeContext == null) {
            return;
        }
        Context m = dXRuntimeContext.m();
        if (!(dXEvent instanceof DXScrollEvent)) {
            return;
        }
        int offsetY = ((DXScrollEvent) dXEvent).getOffsetY();
        if (objArr == null || objArr.length <= 0) {
            return;
        }
        this.f25924a.put(objArr[0].toString(), Integer.valueOf(gbg.c(m, offsetY)));
    }
}
