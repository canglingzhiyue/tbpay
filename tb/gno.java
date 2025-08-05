package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.Map;

/* loaded from: classes5.dex */
public class gno extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PARSER_TAG = "cartManageState";

    static {
        kge.a(2110590547);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        Object obj;
        bcb bcbVar;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext}) : (dXRuntimeContext == null || dXRuntimeContext.a() == null || !(dXRuntimeContext.a() instanceof Map) || (obj = ((Map) dXRuntimeContext.a()).get("ViewEngine")) == null || !(obj instanceof bny) || (bcbVar = (bcb) ((bny) obj).a(bcb.class)) == null || !bcbVar.j()) ? false : true;
    }
}
