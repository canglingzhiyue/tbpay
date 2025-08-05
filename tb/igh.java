package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.utils.n;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* loaded from: classes4.dex */
public class igh extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_FORMAT = "yyyy-MM-dd";
    public static final long DX_PARSER_LOCALDATE = 2059029605902633618L;

    static {
        kge.a(-1508361534);
    }

    public igh() {
        emu.a("com.taobao.android.detail.core.aura.extension.event.floatView.DXDataParserLocalDate");
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null) {
            return null;
        }
        return n.a(System.currentTimeMillis(), objArr.length == 0 ? "yyyy-MM-dd" : (String) objArr[0]);
    }
}
