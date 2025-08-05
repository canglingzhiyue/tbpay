package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* loaded from: classes6.dex */
public class hwd extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_GETVIEWCONTAINERSTORAGE = 9175482801831875946L;

    static {
        kge.a(-1263373259);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length == 0) {
            return null;
        }
        Context m = dXRuntimeContext.m();
        if (!(m instanceof tey)) {
            return null;
        }
        Object obj = objArr[0];
        if (!(obj instanceof String)) {
            return null;
        }
        Object d = ((tey) m).d((String) obj);
        return d == null ? "" : d;
    }
}
