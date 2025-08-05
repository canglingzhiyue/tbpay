package tb;

import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.q;
import tb.gml;

/* loaded from: classes4.dex */
public final class ify implements gml {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final aln f29004a;

    static {
        kge.a(-1883103613);
        kge.a(-28353765);
    }

    public ify(aln callback) {
        q.d(callback, "callback");
        this.f29004a = callback;
    }

    @Override // tb.gml
    public void a(ErrorResult result) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a5ed5e", new Object[]{this, result});
            return;
        }
        q.d(result, "result");
        gml.a.a(this, result);
        this.f29004a.a(result);
    }
}
