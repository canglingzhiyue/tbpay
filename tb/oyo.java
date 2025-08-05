package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.scancode.v2.result.MaResult;
import com.taobao.taobao.scancode.v2.result.a;

/* loaded from: classes8.dex */
public class oyo extends oyp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-929373622);
    }

    @Override // tb.oyp
    public MaResult a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MaResult) ipChange.ipc$dispatch("acc4db6", new Object[]{this, aVar});
        }
        if (oyl.b(aVar.f21289a, aVar.f, aVar.b)) {
            return new MaResult(aVar);
        }
        return null;
    }
}
