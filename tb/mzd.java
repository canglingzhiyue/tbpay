package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public abstract class mzd<T> implements mzi<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f31330a;

    static {
        kge.a(-2131765980);
        kge.a(-970943322);
    }

    public mzd(String str) {
        this.f31330a = str;
    }

    @Override // tb.mzi
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f31330a;
    }
}
