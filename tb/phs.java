package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Objects;

/* loaded from: classes8.dex */
public class phs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public float f32653a;
    public int b;
    public String c;

    static {
        kge.a(409312364);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof phs)) {
            return false;
        }
        phs phsVar = (phs) obj;
        return Float.compare(phsVar.f32653a, this.f32653a) == 0 && this.b == phsVar.b && Objects.equals(this.c, phsVar.c);
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue() : Objects.hash(Float.valueOf(this.f32653a), Integer.valueOf(this.b), this.c);
    }
}
