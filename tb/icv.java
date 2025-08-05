package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.purchase.aura.annotation.TBBuyPageMode;
import com.taobao.android.purchase.core.utils.b;

/* loaded from: classes6.dex */
public class icv extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_ID = 242700904017916597L;

    static {
        kge.a(1542397717);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        Object a2 = dXRuntimeContext.a();
        if (!(a2 instanceof art)) {
            return false;
        }
        art artVar = (art) a2;
        if (!TBBuyPageMode.halfPageMode.equals((String) artVar.a().a("pageType", String.class))) {
            return Boolean.valueOf(!b.a(ige.a(artVar.a().e())));
        }
        return false;
    }
}
