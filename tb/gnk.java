package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.List;

/* loaded from: classes5.dex */
public class gnk extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_CARTSELECTEDITEMCOUNT = 2881203105303185024L;

    static {
        kge.a(1920926908);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        bbz a2 = bdn.a(dXRuntimeContext);
        if (a2 != null) {
            List<IDMComponent> c = bei.c(a2.H());
            if (c != null) {
                i = c.size();
            }
            return Integer.valueOf(i);
        }
        return 0;
    }
}
