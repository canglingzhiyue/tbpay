package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public abstract class bpz<V> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(395031440);
    }

    public V a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (V) ipChange.ipc$dispatch("bd3407ca", new Object[]{this});
        }
        return null;
    }
}
