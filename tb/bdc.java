package tb;

import com.alibaba.android.icart.core.data.DataBizContext;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* loaded from: classes2.dex */
public class bdc extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_CARTGROUPCONTEXT = -4831061287669551476L;

    static {
        kge.a(2098702976);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        DataBizContext.CartGroupContext d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        bbz a2 = bdn.a(dXRuntimeContext);
        if (a2 != null && (d = a2.n().o().d()) != null) {
            return JSON.toJSON(d);
        }
        return null;
    }
}
