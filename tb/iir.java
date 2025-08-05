package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;

/* loaded from: classes6.dex */
public final class iir {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final String f29056a;
    private final String b;
    private final String c;
    private final ikr d;
    private final RSoException e;

    public iir(String str, String str2, String str3, ikr ikrVar, RSoException rSoException) {
        this.f29056a = str;
        this.b = str2;
        this.c = str3;
        this.d = ikrVar;
        this.e = rSoException;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f29056a;
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
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : ikw.b((CharSequence) this.c) ? this.c : "empty_path";
    }

    public ikr e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ikr) ipChange.ipc$dispatch("2dcc950a", new Object[]{this}) : this.d;
    }

    public RSoException f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RSoException) ipChange.ipc$dispatch("b6bd87e8", new Object[]{this}) : this.e;
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue() : this.e == null;
    }
}
