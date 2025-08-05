package tb;

import com.alibaba.android.ultron.engine.protocol.Linkage;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class bjo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-259458524);
    }

    public static Linkage a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Linkage) ipChange.ipc$dispatch("2c9731fc", new Object[0]) : new Linkage();
    }
}
