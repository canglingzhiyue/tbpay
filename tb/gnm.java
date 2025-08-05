package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.ultron.common.model.IDMComponent;

/* loaded from: classes5.dex */
public class gnm extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_TABSHORIZONTALOFFSET = -5142515049732466353L;

    static {
        kge.a(483809146);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        bbz a2 = bdn.a(dXRuntimeContext);
        IDMComponent b = bdn.b(dXRuntimeContext);
        if (a2 == null) {
            return null;
        }
        int a3 = a2.n().o().a(b.getKey()).a();
        String str = "lastScrollOffsetX:::" + a3;
        return Integer.valueOf(gbg.c(dXRuntimeContext.m(), a3));
    }
}
