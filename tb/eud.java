package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes4.dex */
public abstract class eud<D> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private D f27575a;

    public eud(D d) {
        this.f27575a = d;
    }

    public final D a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (D) ipChange.ipc$dispatch("bd3407ca", new Object[]{this}) : this.f27575a;
    }
}
