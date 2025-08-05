package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes7.dex */
public class kmo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f30167a;
    public long b;
    public String c;
    public String d;

    public kmo() {
    }

    public kmo(String str) {
        this.f30167a = str;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kmo)) {
            return false;
        }
        kmo kmoVar = (kmo) obj;
        String str = this.f30167a;
        if (str == null ? kmoVar.f30167a != null : !str.equals(kmoVar.f30167a)) {
            return false;
        }
        String str2 = this.d;
        return str2 == null ? kmoVar.d == null : str2.equals(kmoVar.d);
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        String str = this.f30167a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "Item{url='" + this.f30167a + "', size=" + this.b + ", md5='" + this.c + "', name='" + this.d + "'}";
    }
}
