package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;
import com.taobao.homepage.pop.utils.b;
import com.taobao.homepage.pop.utils.c;

/* loaded from: classes.dex */
public class kzh extends kyx {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_POPTRIGGER = -5560324439967280595L;

    public static /* synthetic */ Object ipc$super(kzh kzhVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
            return;
        }
        int a2 = a(objArr);
        if (a2 < 0) {
            c.a("DXPopTriggerEvent ", "getTriggerType is null");
            return;
        }
        kyu b = b.b(dXRuntimeContext);
        IPopData c = b.c(dXRuntimeContext);
        if (b == null || c == null) {
            c.a("DXPopTriggerEvent ", "popEngine or popData is null");
        } else {
            b.b(a2, c.getBusinessID());
        }
    }

    private int a(Object[] objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b63135bc", new Object[]{this, objArr})).intValue();
        }
        if (objArr != null && objArr.length != 0) {
            String obj = objArr[0] == null ? null : objArr[0].toString();
            if (TextUtils.isEmpty(obj)) {
                return -1;
            }
            try {
                return Integer.valueOf(obj).intValue();
            } catch (Throwable th) {
                c.a("dx popTrigger event, getTriggerType error", th);
            }
        }
        return -1;
    }
}
