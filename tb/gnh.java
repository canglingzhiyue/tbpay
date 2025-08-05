package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.Map;

/* loaded from: classes5.dex */
public class gnh extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_CARTFILTERSTATE = 4494649059866640672L;

    static {
        kge.a(-279964780);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (dXRuntimeContext != null && dXRuntimeContext.a() != null && (dXRuntimeContext.a() instanceof Map)) {
            Object obj = ((Map) dXRuntimeContext.a()).get("ViewEngine");
            bbz a2 = bdn.a(dXRuntimeContext);
            if (a2 == null) {
                return null;
            }
            if (obj instanceof bny) {
                return Boolean.valueOf(!a2.n().a());
            }
        }
        return false;
    }
}
