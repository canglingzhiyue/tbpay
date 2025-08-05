package tb;

import com.alibaba.ability.b;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public abstract class alm implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1225267649);
        kge.a(-948502777);
    }

    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }
}
