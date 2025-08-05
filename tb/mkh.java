package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class mkh<CollectResult> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public abstract CollectResult a(int i, Map<String, ?> map);

    public abstract void b();

    public void b(int i, Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c62340b", new Object[]{this, new Integer(i), map});
        }
    }

    public int[] c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (int[]) ipChange.ipc$dispatch("ab8ad2ba", new Object[]{this}) : new int[0];
    }
}
