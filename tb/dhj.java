package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public class dhj implements dhi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private dho f26758a;

    static {
        kge.a(-1892629194);
        kge.a(-216540682);
    }

    public dhj(dho dhoVar) {
        this.f26758a = dhoVar;
    }

    @Override // tb.dhi
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            dhh.b().b(this.f26758a);
        }
    }
}
