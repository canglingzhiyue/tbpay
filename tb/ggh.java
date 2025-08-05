package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* loaded from: classes5.dex */
public class ggh extends ggk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1643740501);
    }

    public ggh() {
    }

    public ggh(DXRuntimeContext dXRuntimeContext) {
        a((short) 14);
        this.f28317a = new ggt(dXRuntimeContext, (short) 14);
    }

    @Override // tb.ggk
    public ggk a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ggk) ipChange.ipc$dispatch("f0506f3", new Object[]{this});
        }
        ggh gghVar = new ggh();
        a(gghVar);
        return gghVar;
    }
}
