package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class jfr implements jfl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private jfl f29526a;

    /* loaded from: classes6.dex */
    public static class a {
        public static final jfr INSTANCE = new jfr();
    }

    public static jfr a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jfr) ipChange.ipc$dispatch("f066128", new Object[0]) : a.INSTANCE;
    }

    private jfr() {
        this.f29526a = new jfo();
    }

    @Override // tb.jfl
    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            return;
        }
        jfj.b("TCrashMonitor", str, str2, str3);
        jgj.a("TCrashMonitor", str, str2, str3);
        this.f29526a.a(str, str2, str3);
    }

    public jfl b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jfl) ipChange.ipc$dispatch("16b805cd", new Object[]{this}) : this.f29526a;
    }

    public void a(jfl jflVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef461628", new Object[]{this, jflVar});
        } else if (jflVar == null) {
            jfj.a(new IllegalArgumentException("monitor is null"));
        } else {
            this.f29526a = jflVar;
        }
    }
}
