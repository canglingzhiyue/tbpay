package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;

/* loaded from: classes.dex */
public class gcw extends gcv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-657687780);
    }

    @Override // tb.gcv, tb.ghe
    public String getDxFunctionName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bc5916ec", new Object[]{this}) : "subdata";
    }

    @Override // tb.gcv
    public Object a(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("96478e79", new Object[]{this, dXRuntimeContext}) : dXRuntimeContext.f();
    }
}
