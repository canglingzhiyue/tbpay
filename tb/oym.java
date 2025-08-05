package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.scancode.v2.result.MaResult;
import com.taobao.taobao.scancode.v2.result.a;

/* loaded from: classes8.dex */
public class oym extends oyp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-79236246);
    }

    @Override // tb.oyp
    public MaResult a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MaResult) ipChange.ipc$dispatch("acc4db6", new Object[]{this, aVar});
        }
        if (oyl.a(aVar.f21289a, aVar.b)) {
            return new MaResult(oyl.a(aVar), aVar.c, aVar.k, aVar.l, aVar.g, aVar.h, aVar.i, aVar.j);
        }
        return null;
    }
}
