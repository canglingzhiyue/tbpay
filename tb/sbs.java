package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes9.dex */
public class sbs implements sbr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f33460a;

    public sbs(String str) {
        if (str == null) {
            throw new IllegalArgumentException();
        }
        this.f33460a = str;
    }

    @Override // tb.sbr
    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        for (String str2 : str.replaceAll(" ", "").split(",")) {
            if (this.f33460a.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    @Override // tb.sbr
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f33460a;
    }

    @Override // tb.sbr
    public sbr b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sbr) ipChange.ipc$dispatch("16bc0eda", new Object[]{this}) : new sbs(a());
    }

    @Override // tb.sbr
    public String toString() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this}) : a();
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
            return this.f33460a.equals(((sbs) obj).f33460a);
        }
        return false;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue() : this.f33460a.hashCode();
    }
}
