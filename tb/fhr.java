package tb;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.q;
import kotlin.t;

/* loaded from: classes3.dex */
public final class fhr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f27959a;
    private ruw<? super Integer, ? super Integer, t> b;

    static {
        kge.a(-2002153497);
    }

    public fhr(boolean z, ruw<? super Integer, ? super Integer, t> process) {
        q.c(process, "process");
        this.f27959a = z;
        this.b = process;
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f27959a;
    }

    public final ruw<Integer, Integer, t> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ruw) ipChange.ipc$dispatch("16bbe269", new Object[]{this}) : this.b;
    }
}
