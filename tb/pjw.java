package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public class pjw implements pke {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private pkg f32708a;

    static {
        kge.a(-88061802);
        kge.a(1257469013);
    }

    @Override // tb.pke
    public pkf a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pkf) ipChange.ipc$dispatch("f092cb3", new Object[]{this}) : this.f32708a.d;
    }

    public pjw a(pkg pkgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pjw) ipChange.ipc$dispatch("73a3ed5d", new Object[]{this, pkgVar});
        }
        this.f32708a = pkgVar;
        return this;
    }
}
