package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class iin {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final iim f29052a;
    private final Object b;

    public iin(iim iimVar, Object obj) {
        this.f29052a = iimVar;
        this.b = obj;
    }

    public iim a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (iim) ipChange.ipc$dispatch("f05f771", new Object[]{this}) : this.f29052a;
    }

    public Object b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("43b9c269", new Object[]{this}) : this.b;
    }
}
