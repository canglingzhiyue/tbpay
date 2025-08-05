package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class kwh extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_REVISIONSWITCH = -1245704009979908881L;

    /* renamed from: a  reason: collision with root package name */
    private final List<String> f30347a = Arrays.asList(ilw.KEY_NEW_FACE_ENABLE, ilw.KEY_NEW_CONTENT_ENABLE, "new2021UIEnable");

    static {
        kge.a(-303163265);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr != null && objArr.length != 0 && (objArr[0] instanceof String) && this.f30347a.contains((String) objArr[0])) {
            return String.valueOf(true);
        }
        return null;
    }
}
