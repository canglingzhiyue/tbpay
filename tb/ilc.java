package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.resourceguardian.data.model.b;

/* loaded from: classes6.dex */
public class ilc implements ilb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ilb f29131a;

    static {
        kge.a(1216767220);
        kge.a(-485676334);
    }

    public ilc(ilb ilbVar) {
        this.f29131a = ilbVar;
    }

    @Override // tb.ilb
    public boolean a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("733ff0c7", new Object[]{this, bVar})).booleanValue();
        }
        try {
            return this.f29131a.a(bVar);
        } catch (Exception e) {
            ilt.a("PerformanceListenerCompat", "onWarning error", e.toString());
            ilu.a(this.f29131a.c(), this.f29131a.b(), this.f29131a.a(), e.toString());
            return false;
        }
    }

    @Override // tb.ilb
    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.f29131a.a();
    }

    @Override // tb.ilb
    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.f29131a.b();
    }

    @Override // tb.ilb
    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.f29131a.c();
    }

    @Override // tb.ilb
    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43881515", new Object[]{this});
        }
        try {
            return this.f29131a.d();
        } catch (Throwable th) {
            ilt.a("PerformanceListenerCompat", "bizUrl error", c(), th.toString());
            return "error_url";
        }
    }
}
