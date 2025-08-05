package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.Map;

/* loaded from: classes2.dex */
public class bdd extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_CARTISPOPLAYERFILTERING = -2795590046795583635L;

    static {
        kge.a(-1972133552);
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
        if (bbzVar == null || !bbzVar.n().d()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
