package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class ktz implements ktx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final kty f30317a;

    static {
        kge.a(-2072197267);
        kge.a(1692916670);
    }

    @Override // tb.ktx
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : "bxFeature";
    }

    public ktz(kua kuaVar) {
        this.f30317a = new kty(kuaVar);
    }

    @Override // tb.ktx
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f30317a.a();
    }
}
