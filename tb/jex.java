package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.pipline.b;
import kotlin.jvm.internal.q;
import kotlin.t;

/* loaded from: classes3.dex */
public final class jex extends crn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private rul<? super b, t> f29511a;

    static {
        kge.a(-1929897619);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jex(rul<? super b, t> callback) {
        super(null, 1, null);
        q.c(callback, "callback");
        this.f29511a = callback;
    }

    public final void a(b pipLineEventBus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a430ec68", new Object[]{this, pipLineEventBus});
            return;
        }
        q.c(pipLineEventBus, "pipLineEventBus");
        this.f29511a.mo2421invoke(pipLineEventBus);
    }
}
