package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.deprecated.message.IMessageService;

/* loaded from: classes5.dex */
public final class smj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2144767261);
    }

    public static void a(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fc4079a", new Object[]{fluidContext});
        } else {
            ((IMessageService) fluidContext.getService(IMessageService.class)).sendMessage(new spy("VSMSG_pausePlayer", soi.c(fluidContext), null));
        }
    }
}
