package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;

/* loaded from: classes.dex */
public class fqn extends fqp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1860717677);
    }

    public static /* synthetic */ Object ipc$super(fqn fqnVar, String str, Object... objArr) {
        if (str.hashCode() == -608328841) {
            return super.a((DXEvent) objArr[0], (DXRuntimeContext) objArr[1]);
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.fqp
    public Object a(DXEvent dXEvent, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("dbbda377", new Object[]{this, dXEvent, dXRuntimeContext}) : super.a(dXEvent, dXRuntimeContext);
    }
}
