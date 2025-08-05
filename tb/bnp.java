package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.acj;

/* loaded from: classes2.dex */
public final class bnp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private acj.b f26003a;
    private int b;

    static {
        kge.a(-397643554);
    }

    public bnp(acj.b bVar, int i) {
        this.b = 0;
        this.f26003a = bVar;
        this.b = i;
    }

    public acj.b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (acj.b) ipChange.ipc$dispatch("5768e5d8", new Object[]{this}) : this.f26003a;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.b;
    }
}
