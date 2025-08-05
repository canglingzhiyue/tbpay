package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public class ipx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private pfa f29227a = new pfa();
    private pfb b = new pfb();
    public int c;

    static {
        kge.a(1718070363);
    }

    public pfa a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pfa) ipChange.ipc$dispatch("f091953", new Object[]{this}) : this.f29227a;
    }

    public pfb b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pfb) ipChange.ipc$dispatch("16babed1", new Object[]{this}) : this.b;
    }
}
