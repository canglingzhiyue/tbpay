package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* loaded from: classes6.dex */
public class kby implements kcc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public List<kcb> f29954a;

    static {
        kge.a(225023233);
        kge.a(-242193082);
    }

    public kby(List<kcb> list) {
        this.f29954a = list;
    }

    @Override // tb.kcc
    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.f29954a.size();
    }

    @Override // tb.kcc
    public kcb a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (kcb) ipChange.ipc$dispatch("e663b1c1", new Object[]{this, new Integer(i)}) : this.f29954a.get(i);
    }
}
