package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class nec {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f31379a;
    private final String b;
    private final String[] c;
    private final boolean d;
    private final a e;
    private final boolean f;

    /* loaded from: classes.dex */
    public interface a {
        boolean a(byte[] bArr);
    }

    static {
        kge.a(-1660037632);
    }

    public nec(String str, String str2, String[] strArr, a aVar) {
        this(str, str2, strArr, false, false, aVar);
    }

    public nec(String str, String str2, String[] strArr, boolean z, a aVar) {
        this(str, str2, strArr, z, false, aVar);
    }

    public nec(String str, String str2, boolean z, String[] strArr, a aVar) {
        this(str, str2, strArr, false, z, aVar);
    }

    private nec(String str, String str2, String[] strArr, boolean z, boolean z2, a aVar) {
        this.f31379a = str;
        this.b = str2;
        this.c = strArr;
        this.d = z;
        this.f = z2;
        this.e = aVar;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f31379a;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue() : this.d;
    }

    public boolean a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c196733", new Object[]{this, bArr})).booleanValue() : this.e.a(bArr);
    }

    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{this, str})).booleanValue();
        }
        for (String str2 : this.c) {
            if (str2.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : this.f;
    }

    public boolean a(nec necVar) {
        String b;
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f60749d0", new Object[]{this, necVar})).booleanValue() : (necVar == null || (b = b()) == null || !b.equals(necVar.b())) ? false : true;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "image/" + b();
    }
}
