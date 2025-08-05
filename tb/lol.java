package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class lol implements llm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f30775a;

    static {
        kge.a(244253592);
        kge.a(1927718371);
    }

    public lol(String str) {
        this.f30775a = str;
    }

    @Override // tb.llm
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f30775a;
    }
}
