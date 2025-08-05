package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.h;
import com.taobao.infoflow.protocol.subservice.base.ICacheService;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class ler extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_HSETVALUE = 8520638904096683930L;
    public static final String KEY_DX_CACHE_VALUE = "dxCacheValue";

    static {
        kge.a(-741443866);
    }

    public static /* synthetic */ Object ipc$super(ler lerVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        ljs a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr == null || objArr.length < 2 || !(objArr[0] instanceof String) || (a2 = lfq.a(dXRuntimeContext)) == null) {
        } else {
            a(a2, (String) objArr[0], objArr[1]);
        }
    }

    private void a(ljs ljsVar, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68aac9a9", new Object[]{this, ljsVar, str, obj});
            return;
        }
        ICacheService iCacheService = (ICacheService) ljsVar.a(ICacheService.class);
        if (iCacheService == null) {
            ldf.d("DXHSetValueEventHandler", "cacheService is null");
            return;
        }
        Map a2 = a(iCacheService);
        if (a2 == null) {
            a2 = new HashMap(8);
            iCacheService.putCacheObject(KEY_DX_CACHE_VALUE, a2);
        }
        a2.put(str, obj);
    }

    public static Map<String, Object> a(ICacheService iCacheService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("12a0c70b", new Object[]{iCacheService});
        }
        try {
            return (Map) iCacheService.getCacheObject(KEY_DX_CACHE_VALUE, Map.class);
        } catch (ClassCastException e) {
            ldf.a("DXHSetValueEventHandler", "getDxCacheValue ClassCastException error", e);
            return null;
        }
    }
}
