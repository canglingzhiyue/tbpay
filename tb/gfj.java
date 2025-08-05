package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes5.dex */
public class gfj extends gfi {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int b;

    static {
        kge.a(-858036497);
    }

    public gfj(int i) {
        this.f28309a = (short) 1;
        this.b = i;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.b;
    }
}
