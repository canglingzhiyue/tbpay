package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.tao.topmultitab.c;

/* loaded from: classes.dex */
public class kwa extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_HTABSELECTEDINDEX = 4299033137847078065L;

    static {
        kge.a(1492801114);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext}) : Integer.valueOf(c.a().y());
    }
}
