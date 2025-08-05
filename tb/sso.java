package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.infoflow.protocol.subservice.biz.IDynamicLayoutService;

/* loaded from: classes7.dex */
public class sso extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_HDYNAMICLAYOUTENABLE = 8281326256809424134L;

    static {
        kge.a(-897483009);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IDynamicLayoutService iDynamicLayoutService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        ljs a2 = lfq.a(dXRuntimeContext);
        if (a2 != null && (iDynamicLayoutService = (IDynamicLayoutService) a2.a(IDynamicLayoutService.class)) != null) {
            return Boolean.valueOf(iDynamicLayoutService.dynamicLayoutEnable());
        }
        return false;
    }
}
