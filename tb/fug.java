package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import tb.fqq;

/* loaded from: classes.dex */
public abstract class fug extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1775346490);
    }

    public Object a(Object[] objArr, DXRuntimeContext dXRuntimeContext, fqq.a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("d7eec116", new Object[]{this, objArr, dXRuntimeContext, aVar, new Integer(i)});
        }
        return null;
    }
}
