package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.Map;

/* loaded from: classes6.dex */
public class ixy extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_ID;
    public static final String PARSER_TAG = "xskuGetScrolled";

    /* renamed from: a  reason: collision with root package name */
    private Map<String, Integer> f29402a;

    static {
        kge.a(-185132929);
        DX_PARSER_ID = fxa.a(PARSER_TAG);
    }

    public ixy(Map<String, Integer> map) {
        this.f29402a = map;
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        Integer num;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        Map<String, Integer> map = this.f29402a;
        if (map != null && objArr != null && objArr.length > 0 && objArr[0] != null && (num = map.get(objArr[0].toString())) != null) {
            return Integer.valueOf(num.intValue());
        }
        return -1;
    }
}
