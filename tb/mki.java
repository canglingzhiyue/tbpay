package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes7.dex */
public class mki extends mkh<mkj> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.mkh
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        }
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [tb.mkj, java.lang.Object] */
    @Override // tb.mkh
    public /* synthetic */ mkj a(int i, Map map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("8d357de8", new Object[]{this, new Integer(i), map}) : c(i, map);
    }

    public mkj c(int i, Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (mkj) ipChange.ipc$dispatch("d984c26e", new Object[]{this, new Integer(i), map}) : new mkj(i, map);
    }
}
