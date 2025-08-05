package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import tb.fwg;

/* loaded from: classes.dex */
public class fww {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1170519699);
    }

    public boolean a(DXRuntimeContext dXRuntimeContext, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c71e981f", new Object[]{this, dXRuntimeContext, new Boolean(z)})).booleanValue();
        }
        fxe.e(new fwg.a(dXRuntimeContext, z));
        return true;
    }
}
