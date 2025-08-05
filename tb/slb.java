package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes5.dex */
public class slb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final CopyOnWriteArrayList<sla> f33676a = new CopyOnWriteArrayList<>();

    static {
        kge.a(-1460694444);
    }

    public void a(sla slaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fef140b0", new Object[]{this, slaVar});
        } else if (this.f33676a.contains(slaVar)) {
        } else {
            this.f33676a.add(slaVar);
        }
    }

    public sla a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (sla) ipChange.ipc$dispatch("e6677663", new Object[]{this, new Integer(i)}) : this.f33676a.get(i);
    }

    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.f33676a.size();
    }
}
