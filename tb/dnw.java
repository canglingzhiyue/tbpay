package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.adam.common.Util;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.ultron.datamodel.imp.b;

/* loaded from: classes4.dex */
public class dnw extends fum {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_ULTRONGLOBALDATA = -7841073309044055681L;

    static {
        kge.a(-1311807169);
    }

    @Override // tb.fum
    public Object a(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("96478e79", new Object[]{this, dXRuntimeContext});
        }
        b a2 = Util.a(dXRuntimeContext);
        if (a2 == null) {
            return null;
        }
        return a2.c();
    }
}
