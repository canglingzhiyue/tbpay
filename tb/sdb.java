package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public final class sdb extends jps<sdb> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(150568382);
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, tb.sdb] */
    @Override // tb.jps
    public /* synthetic */ sdb b(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("30ede31b", new Object[]{this, new Float(f)}) : a(f);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, tb.sdb] */
    @Override // tb.jps
    public /* synthetic */ sdb d(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("1c8a47dd", new Object[]{this, str}) : a(str);
    }

    public sdb(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    public sdb a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sdb) ipChange.ipc$dispatch("7c751803", new Object[]{this, str});
        }
        this.b = str;
        return this;
    }

    public sdb a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sdb) ipChange.ipc$dispatch("98b051d", new Object[]{this, new Float(f)});
        }
        this.f29685a = f;
        return this;
    }
}
