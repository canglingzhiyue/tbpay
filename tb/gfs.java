package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class gfs extends ggk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1675911828);
    }

    public gfs() {
    }

    public gfs(Boolean bool) {
        a((short) 16);
        this.f28317a = new ggt(bool, (short) 16);
    }

    @Override // tb.ggk
    public ggk a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ggk) ipChange.ipc$dispatch("f0506f3", new Object[]{this});
        }
        gfs gfsVar = new gfs();
        a(gfsVar);
        return gfsVar;
    }
}
