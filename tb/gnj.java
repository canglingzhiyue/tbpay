package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.Map;

/* loaded from: classes5.dex */
public class gnj extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_CARTISNEWCART2021 = 99778369222156528L;

    static {
        kge.a(-309620946);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (dXRuntimeContext == null || dXRuntimeContext.a() == null || !(dXRuntimeContext.a() instanceof Map)) {
            return null;
        }
        Object obj = ((Map) dXRuntimeContext.a()).get("ViewEngine");
        if (!(obj instanceof bny)) {
            return null;
        }
        bbz bbzVar = (bbz) ((bny) obj).a(bbz.class);
        if (bbzVar == null || !bem.h(bbzVar.n())) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
