package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes9.dex */
public final class xpp extends xpl<xpp> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1937775335);
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [tb.xpp, java.lang.Object] */
    @Override // tb.xpl
    public /* synthetic */ xpp a(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("e6bc49da", new Object[]{this, new Float(f)}) : b(f);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [tb.xpp, java.lang.Object] */
    @Override // tb.xpl
    public /* synthetic */ xpp a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("17307540", new Object[]{this, str}) : c(str);
    }

    public xpp(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    public xpp c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xpp) ipChange.ipc$dispatch("7dd0e3da", new Object[]{this, str});
        }
        this.b = str;
        return this;
    }

    public xpp b(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xpp) ipChange.ipc$dispatch("f8108037", new Object[]{this, new Float(f)});
        }
        this.f34460a = f;
        return this;
    }
}
