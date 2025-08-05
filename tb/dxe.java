package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.Map;

/* loaded from: classes4.dex */
public class dxe extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_DETAILSKUGETSCROLLED = -111953113697201198L;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, Integer> f27060a;

    static {
        kge.a(1052721361);
    }

    public dxe() {
        emu.a("com.taobao.android.detail.core.aura.extension.event.sku.DXDataParserDetailSKUGetScrolled");
    }

    public dxe(Map<String, Integer> map) {
        this.f27060a = map;
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        Map<String, Integer> map = this.f27060a;
        int i = -1;
        if (map == null || map.isEmpty()) {
            return -1;
        }
        if (objArr == null || objArr.length == 0 || objArr[0] == null) {
            return -1;
        }
        Integer num = this.f27060a.get(objArr[0].toString());
        if (num != null) {
            i = num.intValue();
        }
        return Integer.valueOf(i);
    }
}
