package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.adam.common.a;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.ultron.common.model.IDMComponent;

/* loaded from: classes4.dex */
public class dnx extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_ULTRONPARENTDXDATA = 7011726503363934038L;

    static {
        kge.a(-478260614);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IDMComponent a2;
        IDMComponent a3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr != null && objArr.length != 0 && objArr.length == 2 && (objArr[0] instanceof String) && (objArr[1] instanceof String) && !TextUtils.isEmpty((String) objArr[0]) && (a2 = a.a(dXRuntimeContext)) != null && (a3 = a.a((String) objArr[0], a2)) != null) {
            return a.a((String) objArr[1], a3.getData());
        }
        return null;
    }
}
