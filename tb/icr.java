package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.purchase.theme.a;
import tb.dsu;
import tb.dtc;

/* loaded from: classes6.dex */
public class icr extends dsu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private dtc.a f28908a;

    static {
        kge.a(1771578503);
    }

    @Override // tb.dsu
    public dtc.a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dtc.a) ipChange.ipc$dispatch("5d73d08e", new Object[]{this});
        }
        if (this.f28908a == null) {
            this.f28908a = new a();
        }
        return this.f28908a;
    }

    @Override // tb.dsu
    public void a(dsu.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84b3b6f5", new Object[]{this, aVar});
            return;
        }
        meo.a(aVar);
        meo.b(aVar);
    }
}
