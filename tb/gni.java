package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.ultron.common.model.IDMComponent;

/* loaded from: classes5.dex */
public class gni extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_CARTGETBUNDLEHEADER = 6842587583402883712L;

    static {
        kge.a(1079444032);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        bbz a2;
        IDMComponent b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr != null && objArr.length != 0 && objArr[0] != null && (a2 = bdn.a(dXRuntimeContext)) != null && (b = bei.b(a2.O(), objArr[0].toString())) != null) {
            return b.getData();
        }
        return null;
    }
}
