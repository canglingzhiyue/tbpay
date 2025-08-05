package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public abstract class fyq<ExposeKey, ExposeData> implements fyv<ExposeKey, ExposeData> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f28224a;
    private final String b;

    static {
        kge.a(2120833870);
        kge.a(1530701251);
        f28224a = "default_exposure";
    }

    public fyq(String str) {
        if (str == null) {
            this.b = f28224a;
        } else {
            this.b = str;
        }
    }

    @Override // tb.fyv
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.b;
    }

    @Override // tb.fyv
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            d().d();
        }
    }

    @Override // tb.fyv
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            d().e();
        }
    }
}
