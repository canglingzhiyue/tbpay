package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.Map;

/* loaded from: classes5.dex */
public class tai extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final long DX_EVENT_ID;
    public static final long DX_PARSER_DETAILSKUGETSCROLLED;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, Integer> f33985a;

    static {
        kge.a(-301526327);
        long a2 = fxa.a("detailSKUGetScrolled");
        DX_EVENT_ID = a2;
        DX_PARSER_DETAILSKUGETSCROLLED = a2;
    }

    public tai(Map<String, Integer> map) {
        this.f33985a = map;
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        Map<String, Integer> map = this.f33985a;
        int i = -1;
        if (map == null || map.isEmpty()) {
            return -1;
        }
        if (objArr == null || objArr.length == 0 || objArr[0] == null) {
            return -1;
        }
        Integer num = this.f33985a.get(objArr[0].toString());
        if (num != null) {
            i = num.intValue();
        }
        return Integer.valueOf(i);
    }
}
