package tb;

import com.alibaba.android.ultron.vfw.viewholder.d;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import java.util.Map;

/* loaded from: classes2.dex */
public class bdj extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_ISCUSTOMBUNDLE = 8033291648836539327L;

    static {
        kge.a(1282979501);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        Map map = (Map) dXRuntimeContext.a();
        if (map == null) {
            return false;
        }
        return Boolean.valueOf(bei.p((DMComponent) map.get(d.TAG_DINAMICX_VIEW_COMPONENT)));
    }
}
