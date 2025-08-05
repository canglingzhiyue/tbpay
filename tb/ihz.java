package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;

/* loaded from: classes.dex */
public class ihz {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String LOAD_FROM_ALREADY_LOADED = "already_loaded";
    public static final String LOAD_FROM_DEFAULT = "default";
    public static final String LOAD_FROM_FALLBACK_SYS_LOAD = "fallback_sys_load";
    public static final String LOAD_FROM_PREFER_SYS_LOAD = "prefer_sys_load";
    public static final String LOAD_FROM_REMOTE_SO_LOAD = "remote_so_load";

    /* renamed from: a  reason: collision with root package name */
    private final String f29036a;
    private String b = null;
    private String c = null;
    private String d = "init";
    private String e = "default";
    private final RSoException f;

    private ihz(String str, RSoException rSoException) {
        this.f29036a = str;
        this.f = rSoException;
    }

    public static ihz a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ihz) ipChange.ipc$dispatch("7c709e39", new Object[]{str}) : new ihz(str, null);
    }

    public static ihz a(String str, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ihz) ipChange.ipc$dispatch("264d547a", new Object[]{str, new Integer(i)}) : new ihz(str, RSoException.error(i));
    }

    public static ihz a(String str, RSoException rSoException) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ihz) ipChange.ipc$dispatch("beb0b1ba", new Object[]{str, rSoException}) : new ihz(str, rSoException);
    }

    public ihz b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ihz) ipChange.ipc$dispatch("7d1d49d8", new Object[]{this, str});
        }
        this.d = str;
        return this;
    }

    public ihz a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ihz) ipChange.ipc$dispatch("953b35af", new Object[]{this, str, str2});
        }
        this.b = str;
        this.c = str2;
        return this;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f29036a;
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
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : this.f == null;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "LoadResult{libName='" + this.f29036a + "', majorVersion='" + this.b + "', minorVersion='" + this.c + "', from='" + this.d + "', loadFrom='" + this.e + "', exception=" + this.f + '}';
    }
}
