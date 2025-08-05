package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidInstanceConfig;
import com.taobao.android.fluid.core.i;
import kotlin.jvm.internal.q;

/* loaded from: classes5.dex */
public final class sot {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final sot INSTANCE;

    static {
        kge.a(759629652);
        INSTANCE = new sot();
    }

    private sot() {
    }

    public final FluidInstanceConfig a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FluidInstanceConfig) ipChange.ipc$dispatch("72a30de8", new Object[]{this, context});
        }
        q.d(context, "context");
        FluidInstanceConfig b = FluidInstanceConfig.a.a().a(context).a((Boolean) true).b(i.BIZ_NAME_RECOMMEND_TAB).a("shortvideo").e("preloadVideo").b();
        q.b(b, "FluidInstanceConfig.Buil…NES)\n            .build()");
        return b;
    }
}
