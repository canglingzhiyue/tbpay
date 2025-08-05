package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.usertrack.track.b;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.deprecated.message.IMessageService;
import java.util.HashMap;

/* loaded from: classes5.dex */
public class smg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1805836314);
    }

    public static void a(FluidContext fluidContext) {
        a.c a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fc4079a", new Object[]{fluidContext});
            return;
        }
        a currentMediaSetData = ((IDataService) fluidContext.getService(IDataService.class)).getCurrentMediaSetData();
        if (currentMediaSetData == null || (a2 = currentMediaSetData.a()) == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("position", "up");
        if (((IDataService) fluidContext.getService(IDataService.class)).getConfig().i()) {
            hashMap.put("enablePlayRate", "true");
        }
        if (((IDataService) fluidContext.getService(IDataService.class)).getConfig().h()) {
            hashMap.put("enablePlayFeedback", "true");
        }
        ((IMessageService) fluidContext.getService(IMessageService.class)).sendMessage(new spy("VSMSG_clickMore", a2.c, hashMap));
    }

    public static void b(FluidContext fluidContext) {
        a.c a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f4da19b", new Object[]{fluidContext});
            return;
        }
        FluidSDK.getNavAdapter().nav(fluidContext, fluidContext.getContext(), ((IDataService) fluidContext.getService(IDataService.class)).getConfig().j().t, null);
        b.c(fluidContext);
        a currentMediaSetData = ((IDataService) fluidContext.getService(IDataService.class)).getCurrentMediaSetData();
        if (currentMediaSetData == null || (a2 = currentMediaSetData.a()) == null) {
            return;
        }
        ((IMessageService) fluidContext.getService(IMessageService.class)).sendMessage(new spy("VSMSG_clickSearch", a2.c, null));
    }
}
