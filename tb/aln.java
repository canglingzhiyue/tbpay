package tb;

import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.ability.result.ExecutingResult;
import com.alibaba.ability.result.FinishResult;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.q;

/* loaded from: classes2.dex */
public class aln {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final alo f25424a;

    static {
        kge.a(1846948875);
    }

    public aln(alo listener) {
        q.d(listener, "listener");
        this.f25424a = listener;
    }

    public final void a(ExecuteResult result) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34013fd1", new Object[]{this, result});
            return;
        }
        q.d(result, "result");
        this.f25424a.onCallback(result);
    }

    public final void a(ErrorResult result) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a5ed5e", new Object[]{this, result});
            return;
        }
        q.d(result, "result");
        this.f25424a.onCallback(result);
    }

    public final void a(FinishResult result) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6f9649d", new Object[]{this, result});
            return;
        }
        q.d(result, "result");
        this.f25424a.onCallback(result);
    }

    public final void a(ExecutingResult result) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64fd2634", new Object[]{this, result});
            return;
        }
        q.d(result, "result");
        this.f25424a.onCallback(result);
    }
}
