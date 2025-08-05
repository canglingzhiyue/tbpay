package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.update.b;
import com.taobao.update.framework.d;

/* loaded from: classes9.dex */
public class rgl extends d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private b f33146a;

    static {
        kge.a(584054797);
    }

    public rgl(b bVar) {
        this.f33146a = bVar;
    }

    @Override // com.taobao.update.framework.d
    public void onForeground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7f3c09", new Object[]{this});
        } else if (!this.f33146a.foregroundRequest) {
        } else {
            rfy.getInstance().startUpdate(true, true);
        }
    }
}
