package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.infoflow.protocol.subservice.base.ICacheService;
import java.util.Map;

/* loaded from: classes.dex */
public class lfe extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_HGETVALUE = 1466861815985736590L;

    static {
        kge.a(-128994872);
    }

    public static /* synthetic */ Object ipc$super(lfe lfeVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        Object obj = null;
        if (objArr != null && objArr.length > 0) {
            if (objArr.length > 1) {
                obj = objArr[1];
            }
            if (objArr[0] instanceof String) {
                Object a2 = a(dXRuntimeContext, (String) objArr[0]);
                return a2 == null ? obj : a2;
            }
        }
        return obj;
    }

    private Object a(DXRuntimeContext dXRuntimeContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("b8274e2f", new Object[]{this, dXRuntimeContext, str});
        }
        ljs a2 = lfq.a(dXRuntimeContext);
        if (a2 == null) {
            ldf.d("DXDataParserHGetValue", "infoFlowContext is null");
            return null;
        }
        ICacheService iCacheService = (ICacheService) a2.a(ICacheService.class);
        if (iCacheService == null) {
            ldf.d("DXDataParserHGetValue", "cacheService is null");
            return null;
        }
        Map<String, Object> a3 = ler.a(iCacheService);
        if (a3 == null) {
            ldf.d("DXDataParserHGetValue", "dxCache is null");
            return null;
        }
        return a3.get(str);
    }
}
