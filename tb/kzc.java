package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.homepage.pop.utils.b;
import com.taobao.homepage.pop.utils.c;

/* loaded from: classes.dex */
public class kzc extends kyx {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_HSETTOSTATICCACHE = -6889574796800758876L;

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr == null || objArr.length == 0 || objArr[0] == null) {
            c.a("SetToStaticCache ", "dx args is null");
        } else {
            kyv.a(b.d(dXRuntimeContext), objArr[0].toString(), objArr.length > 1 ? objArr[1].toString() : null);
        }
    }
}
