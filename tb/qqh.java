package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.f;
import kotlin.jvm.internal.q;

/* loaded from: classes9.dex */
public abstract class qqh implements qqg {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final f mInstance;

    static {
        kge.a(574553627);
        kge.a(2013193873);
    }

    @Override // tb.qqg
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    public qqh(f mInstance) {
        q.d(mInstance, "mInstance");
        this.mInstance = mInstance;
    }

    public final f getMInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (f) ipChange.ipc$dispatch("126edbc8", new Object[]{this}) : this.mInstance;
    }
}
