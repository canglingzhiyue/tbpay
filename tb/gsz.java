package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launch.turbo.profile.a;

/* loaded from: classes.dex */
public class gsz implements gsx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final gsx f28435a;
    private final String b;

    static {
        kge.a(-1948890943);
        kge.a(-2112197540);
    }

    @Override // tb.gsx
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "FinishedState";
    }

    public gsz(gsx gsxVar) {
        this(gsxVar, null);
    }

    public gsz(gsx gsxVar, String str) {
        this.f28435a = gsxVar;
        this.b = str;
    }

    @Override // tb.gsx
    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ce40c78", new Object[]{this, aVar});
            return;
        }
        aVar.d().b(104);
        if (this.b == null) {
            String a2 = a();
            gsv.a(a2, "finished from state: " + this.f28435a.a());
            return;
        }
        String a3 = a();
        gsv.a(a3, "finished from state: " + this.f28435a.a() + " due to " + this.b);
    }
}
