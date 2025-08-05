package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;

/* loaded from: classes5.dex */
public class fqm extends fqp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1684240149);
    }

    @Override // tb.fqp
    public Object a(DXEvent dXEvent, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("dbbda377", new Object[]{this, dXEvent, dXRuntimeContext});
        }
        int size = this.c.size();
        if (size <= 1) {
            return null;
        }
        for (int i = 0; i < size; i++) {
            Object a2 = this.c.get(i).a(dXEvent, dXRuntimeContext);
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }

    public fqm() {
        this.f28129a = (byte) 5;
        this.e = "branch";
    }
}
