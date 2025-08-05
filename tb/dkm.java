package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.b;
import java.util.Arrays;

/* loaded from: classes.dex */
public class dkm implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f26812a;
    private final String b;
    private final String c;

    public dkm(String str, String str2, String str3) {
        this.f26812a = str;
        this.b = str2;
        this.c = str3;
    }

    public dkm(String str, String str2) {
        this(str, str2, null);
    }

    @Override // com.taobao.android.ab.api.b
    public boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a821d370", new Object[]{this, new Boolean(z)})).booleanValue() : Boolean.parseBoolean(this.b) || "1".equals(this.b);
    }

    @Override // com.taobao.android.ab.api.b
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f26812a;
    }

    @Override // com.taobao.android.ab.api.b
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
    }

    @Override // com.taobao.android.ab.api.b
    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.c;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "VariationImpl{name='" + this.f26812a + "', value='" + this.b + "', desc='" + this.c + "'}";
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
            return this.f26812a.equals(((dkm) obj).f26812a);
        }
        return false;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue() : Arrays.hashCode(new String[]{this.f26812a});
    }
}
