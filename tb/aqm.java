package tb;

import com.alibaba.android.aura.q;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public abstract class aqm implements aqn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(992891654);
        kge.a(-930866641);
    }

    @Override // tb.aqn
    public void a(q qVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c6de311", new Object[]{this, qVar});
        }
    }
}
