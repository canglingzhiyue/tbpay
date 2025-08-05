package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.bk;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* loaded from: classes4.dex */
public class tde extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_FORMAT = "yyyy-MM-dd";
    public static final long DX_EVENT_ID;
    public static final long DX_PARSER_LOCALDATE;

    static {
        kge.a(-1155888652);
        long a2 = fxa.a("localDate");
        DX_EVENT_ID = a2;
        DX_PARSER_LOCALDATE = a2;
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
        return bk.a(System.currentTimeMillis(), objArr.length == 0 ? "yyyy-MM-dd" : (String) objArr[0]);
    }
}
