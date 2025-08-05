package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class bdh extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_CARTSHOWSUBMITCHECK = 3311639052408616880L;

    static {
        kge.a(1374096963);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        boolean z;
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        bbz a2 = bdn.a(dXRuntimeContext);
        if (a2 == null) {
            return false;
        }
        bcb n = a2.n();
        pwr a3 = jdc.a(a2.S().U());
        if (a3 != null && a3.c()) {
            return false;
        }
        if (a2.n().d()) {
            Iterator<IDMComponent> it = a2.x().d().f().iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                IDMComponent next = it.next();
                if (next != null && "item".equals(next.getTag())) {
                    z = true;
                    break;
                }
            }
            if (!z) {
                return false;
            }
        }
        if (!bem.c(n) && !n.a()) {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }
}
