package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class lfk extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_RUNTIMESCOUNT = 7598383176175623821L;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, Integer> f30544a = new HashMap();

    static {
        kge.a(1499984185);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length == 0 || dXRuntimeContext == null || dXRuntimeContext.v() == null || dXRuntimeContext.v().getParent() == null) {
            return null;
        }
        if (!(objArr[0] instanceof String)) {
            return 0;
        }
        String str = (String) objArr[0];
        if (this.f30544a.containsKey(str)) {
            i = this.f30544a.get(str).intValue() + 1;
            this.f30544a.put(str, Integer.valueOf(i));
        } else {
            this.f30544a.put(str, 0);
            i = 0;
        }
        ldf.d("home.RuntimesCount", "currentCount=" + i);
        return Integer.valueOf(i);
    }
}
