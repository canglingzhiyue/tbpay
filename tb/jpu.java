package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public final class jpu extends jps<jpu> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String c;
    private String d;

    static {
        kge.a(872680262);
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [tb.jpu, java.lang.Object] */
    @Override // tb.jps
    public /* synthetic */ jpu b(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("30ede31b", new Object[]{this, new Float(f)}) : a(f);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [tb.jpu, java.lang.Object] */
    @Override // tb.jps
    public /* synthetic */ jpu d(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("1c8a47dd", new Object[]{this, str}) : b(str);
    }

    private jpu(String str, String str2, String str3) {
        super(str, str2, str3);
        a(1.0f);
    }

    public static jpu a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jpu) ipChange.ipc$dispatch("7c713005", new Object[]{str}) : new jpu(str, "27659-tracker", "http://taobao.com/jstracker/android/ultron.html");
    }

    public static jpu a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (jpu) ipChange.ipc$dispatch("1bb7ad71", new Object[]{str, str2, str3}) : new jpu(str, str2, str3);
    }

    public jpu b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jpu) ipChange.ipc$dispatch("7d1ddba4", new Object[]{this, str});
        }
        this.b = str;
        return this;
    }

    public jpu c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jpu) ipChange.ipc$dispatch("7dca8743", new Object[]{this, str});
        }
        this.c = str;
        return this;
    }

    public jpu a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jpu) ipChange.ipc$dispatch("9871d1f", new Object[]{this, new Float(f)});
        }
        this.f29685a = f;
        return this;
    }

    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("50938a53", new Object[]{this});
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
