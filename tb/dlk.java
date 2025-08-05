package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.v3.n;

/* loaded from: classes4.dex */
public class dlk extends dlr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private n f26837a;

    static {
        kge.a(-1662208464);
    }

    public void a(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d53277b", new Object[]{this, nVar});
        } else {
            this.f26837a = nVar;
        }
    }
}
