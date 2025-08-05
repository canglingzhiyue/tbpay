package tb;

import com.alibaba.android.ultron.trade.presenter.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.tbtheme.kit.j;
import java.util.Map;

/* loaded from: classes2.dex */
public class bdl extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PARSER_TAG = "isWhiteNav";

    static {
        kge.a(-49793185);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (dXRuntimeContext != null) {
            try {
                if ((dXRuntimeContext.a() instanceof Map) && (((Map) dXRuntimeContext.a()).get(b.DINAMIC_CONTEXT_KEY_PRESENTER) instanceof bbz)) {
                    return Boolean.valueOf(!j.c());
                }
            } catch (Throwable unused) {
            }
        }
        if (bew.a().b()) {
            return true;
        }
        return false;
    }
}
