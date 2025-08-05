package tb;

import com.alibaba.android.ultron.trade.presenter.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.Map;

/* loaded from: classes2.dex */
public class bda extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_CARTCURRENTFILTERITEM = 2725036461527485047L;

    /* renamed from: a  reason: collision with root package name */
    private boolean f25815a = spk.a("cart_switch", "enablePreHeatPopFilterItem", true);

    static {
        kge.a(792229556);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        try {
            bbz bbzVar = (bbz) ((Map) dXRuntimeContext.a()).get(b.DINAMIC_CONTEXT_KEY_PRESENTER);
            if (bbzVar != null) {
                String b = bbzVar.n().b();
                boolean k = bbzVar.v().k();
                boolean d = bbzVar.n().d();
                if ("".equals(b)) {
                    b = null;
                }
                return this.f25815a ? (!k || d) ? b : "preHeat" : bbzVar.v().k() ? "preHeat" : b;
            }
        } catch (Exception unused) {
        }
        return "";
    }
}
