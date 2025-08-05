package tb;

import android.os.Handler;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract class mkg<CollectResult> extends mkh<CollectResult> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public abstract Handler a();

    public abstract void a(int i, Map<String, ?> map, mkf<CollectResult> mkfVar);

    @Override // tb.mkh
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        }
    }

    @Override // tb.mkh
    @Deprecated
    public final CollectResult a(int i, Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CollectResult) ipChange.ipc$dispatch("8d357de8", new Object[]{this, new Integer(i), map});
        }
        throw new RuntimeException("AsyncCollector: Incorrect usage.");
    }
}
