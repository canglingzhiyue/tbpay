package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.home.component.utils.e;
import com.taobao.android.home.component.utils.o;

/* loaded from: classes5.dex */
public class rhn extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_HGETDATA = 3182781739726707210L;

    static {
        kge.a(1782984086);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length <= 0 || !(objArr[0] instanceof String)) {
            return null;
        }
        String str = (String) objArr[0];
        String a2 = o.a(dXRuntimeContext.m(), str);
        e.e("DXDataParserHGetData", "key = " + str + ", result = " + a2);
        return a2;
    }
}
