package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class loi implements llj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f30772a;
    private final llk b;
    private final lll c;

    static {
        kge.a(1002936617);
        kge.a(-665681045);
    }

    public loi(String str, llk llkVar, lll lllVar) {
        this.f30772a = str;
        this.b = llkVar;
        this.c = lllVar;
    }

    @Override // tb.llj
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f30772a;
    }

    @Override // tb.llj
    public lll b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lll) ipChange.ipc$dispatch("16b90511", new Object[]{this}) : this.c;
    }

    @Override // tb.llj
    public llk c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (llk) ipChange.ipc$dispatch("1e6aaa51", new Object[]{this}) : this.b;
    }
}
