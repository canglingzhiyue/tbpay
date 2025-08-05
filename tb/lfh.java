package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.infoflow.protocol.subservice.base.IConfigService;

/* loaded from: classes.dex */
public class lfh extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_ORANGE = 9860385864900610L;

    static {
        kge.a(-80503095);
    }

    public static /* synthetic */ Object ipc$super(lfh lfhVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IConfigService a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length < 2 || (a2 = a(dXRuntimeContext)) == null) {
            return null;
        }
        try {
            return a2.getConfig((String) objArr[0], (String) objArr[1], objArr.length > 2 ? (String) objArr[2] : null);
        } catch (Throwable th) {
            ldf.a("DXDataParserOrange", "解析参数异常", th);
            return null;
        }
    }

    private IConfigService a(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IConfigService) ipChange.ipc$dispatch("3e0e0625", new Object[]{this, dXRuntimeContext});
        }
        if (dXRuntimeContext == null) {
            ldf.d("DXDataParserOrange", "dxRuntimeContext == null");
            return null;
        }
        ljs a2 = lfq.a(dXRuntimeContext);
        if (a2 == null) {
            ldf.d("DXDataParserOrange", "infoFlowContext == null");
            return null;
        }
        return (IConfigService) a2.a(IConfigService.class);
    }
}
