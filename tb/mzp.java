package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;

/* loaded from: classes.dex */
public class mzp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final mzn f31337a;
    private final String b;

    static {
        kge.a(1628098086);
    }

    public mzp(mzn mznVar, String str) {
        this.f31337a = mznVar;
        this.b = str;
    }

    public mzn a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (mzn) ipChange.ipc$dispatch("f0808dd", new Object[]{this}) : this.f31337a;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            mzp mzpVar = (mzp) obj;
            if (this.f31337a.equals(mzpVar.f31337a) && this.b.equals(mzpVar.b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue() : Arrays.hashCode(new Object[]{this.f31337a, this.b});
    }
}
