package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.Map;

/* loaded from: classes2.dex */
public class bij extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_WALLETGETSCROLLED = -1017335047642913806L;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, Integer> f25925a;

    static {
        kge.a(1044561752);
    }

    public bij(Map<String, Integer> map) {
        this.f25925a = map;
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        Integer num;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        Map<String, Integer> map = this.f25925a;
        if (map != null && objArr != null && objArr.length > 0 && (num = map.get(objArr[0].toString())) != null) {
            return Integer.valueOf(num.intValue());
        }
        return -1;
    }
}
