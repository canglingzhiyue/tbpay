package tb;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;

/* loaded from: classes7.dex */
public final class nni {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f31589a;
    private long b;

    static {
        kge.a(-744914722);
    }

    public nni() {
        this(null, 0L, 3, null);
    }

    public nni(String spanName, long j) {
        q.c(spanName, "spanName");
        this.f31589a = spanName;
        this.b = j;
    }

    public /* synthetic */ nni(String str, long j, int i, o oVar) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? -1L : j);
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f31589a;
    }

    public final long b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dd", new Object[]{this})).longValue() : this.b;
    }
}
