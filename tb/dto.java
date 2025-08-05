package tb;

import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.buy.internal.status.f;

@AURAExtensionImpl(code = "alibuy.impl.aspect.lifecycle.skeleton")
/* loaded from: classes4.dex */
public final class dto extends dtl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1874363229);
    }

    @Override // tb.dtl
    public void i() {
        f k;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else if (g() || (k = k()) == null) {
        } else {
            k.b((Boolean) null);
        }
    }

    @Override // tb.dtl
    public void j() {
        f k;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
        } else if (g() || (k = k()) == null) {
        } else {
            k.b();
        }
    }
}
