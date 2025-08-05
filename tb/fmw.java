package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class fmw<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f28067a;
    private final T b;

    static {
        kge.a(205771021);
    }

    public fmw(String str, T t) {
        this.f28067a = str;
        this.b = t;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f28067a;
    }

    public T b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (T) ipChange.ipc$dispatch("43b9c269", new Object[]{this}) : this.b;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "Fact{name='" + this.f28067a + "', value=" + this.b + '}';
    }
}
