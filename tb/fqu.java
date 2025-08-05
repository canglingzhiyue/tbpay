package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;

/* loaded from: classes.dex */
public class fqu extends fqp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1793676337);
    }

    @Override // tb.fqp
    public Object a(DXEvent dXEvent, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("dbbda377", new Object[]{this, dXEvent, dXRuntimeContext}) : this.e;
    }
}
