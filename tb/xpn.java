package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes9.dex */
public final class xpn extends xpl<xpn> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String c;
    private String d;

    static {
        kge.a(-1154551427);
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, tb.xpn] */
    @Override // tb.xpl
    public /* synthetic */ xpn a(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e6bc49da", new Object[]{this, new Float(f)}) : b(f);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, tb.xpn] */
    @Override // tb.xpl
    public /* synthetic */ xpn a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("17307540", new Object[]{this, str}) : d(str);
    }

    private xpn(String str, String str2, String str3) {
        super(str, str2, str3);
        b(1.0f);
    }

    public static xpn c(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (xpn) ipChange.ipc$dispatch("7dd0e39c", new Object[]{str}) : new xpn(str, "27659-tracker", "http://taobao.com/jstracker/android/ultron.html");
    }

    public static xpn a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (xpn) ipChange.ipc$dispatch("1bbe09ca", new Object[]{str, str2, str3}) : new xpn(str, str2, str3);
    }

    public xpn d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xpn) ipChange.ipc$dispatch("7e7d8f3b", new Object[]{this, str});
        }
        this.b = str;
        return this;
    }

    public xpn e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xpn) ipChange.ipc$dispatch("7f2a3ada", new Object[]{this, str});
        }
        this.c = str;
        return this;
    }

    public xpn b(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xpn) ipChange.ipc$dispatch("f8107ff9", new Object[]{this, new Float(f)});
        }
        this.f34460a = f;
        return this;
    }

    public xpn f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xpn) ipChange.ipc$dispatch("7fd6e679", new Object[]{this, str});
        }
        this.d = str;
        return this;
    }

    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d71944f2", new Object[]{this});
        }
        String str = this.d;
        return str == null ? "" : str;
    }

    public String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this});
        }
        String str = this.c;
        return str == null ? "defaultErrorCode" : str;
    }
}
