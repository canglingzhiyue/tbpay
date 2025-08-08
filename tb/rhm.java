package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.festival.FestivalMgr;

/* loaded from: classes5.dex */
public class rhm extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_FESTIVAL = 2628258857601624166L;

    static {
        kge.a(-445399946);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr != null && objArr.length >= 2) {
            try {
                String obj = objArr[0].toString();
                String obj2 = objArr[1].toString();
                String obj3 = objArr.length > 2 ? objArr[2].toString() : null;
                String a2 = FestivalMgr.a().a(obj, obj2);
                return StringUtils.isEmpty(a2) ? obj3 : a2;
            } catch (Throwable unused) {
            }
        }
        return null;
    }
}
