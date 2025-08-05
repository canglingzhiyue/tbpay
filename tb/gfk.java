package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* loaded from: classes5.dex */
public class gfk implements gfm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private short f28310a;
    private int b;
    private List<String> c;

    static {
        kge.a(851259128);
        kge.a(140180191);
    }

    public gfk(short s, int i, List<String> list) {
        this.f28310a = s;
        this.b = i;
        this.c = list;
    }

    @Override // tb.gfm
    public short a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c65", new Object[]{this})).shortValue() : this.f28310a;
    }

    @Override // tb.gfm
    public int b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.b;
    }

    @Override // tb.gfm
    public List<String> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("31b9b59d", new Object[]{this}) : this.c;
    }
}
