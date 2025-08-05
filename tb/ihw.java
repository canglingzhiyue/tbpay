package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;

/* loaded from: classes6.dex */
public class ihw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f29035a;
    private final String b;
    private String c = null;
    private String d = null;
    private String e = "init";
    private final RSoException f;

    private ihw(String str, String str2, RSoException rSoException) {
        this.f29035a = str;
        this.b = str2;
        this.f = rSoException;
    }

    public static ihw a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ihw) ipChange.ipc$dispatch("953b3552", new Object[]{str, str2}) : new ihw(str, str2, null);
    }

    public static ihw a(String str, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ihw) ipChange.ipc$dispatch("264d541d", new Object[]{str, new Integer(i)}) : new ihw(str, null, RSoException.error(i));
    }

    public static ihw a(String str, RSoException rSoException) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ihw) ipChange.ipc$dispatch("beb0b15d", new Object[]{str, rSoException}) : new ihw(str, null, rSoException);
    }

    public ihw a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ihw) ipChange.ipc$dispatch("7c709ddc", new Object[]{this, str});
        }
        this.e = str;
        return this;
    }

    public ihw b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ihw) ipChange.ipc$dispatch("cf05d731", new Object[]{this, str, str2});
        }
        this.c = str;
        this.d = str2;
        return this;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f29035a;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.b;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.c;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.d;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.e;
    }

    public RSoException f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RSoException) ipChange.ipc$dispatch("b6bd87e8", new Object[]{this}) : this.f;
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        String str = this.b;
        return str != null && str.length() > 0 && this.f == null;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "FetchResult{libName='" + this.f29035a + "', libFullPath='" + this.b + "', majorVersion='" + this.c + "', minorVersion='" + this.d + "', from='" + this.e + "', exception=" + this.f + '}';
    }
}
