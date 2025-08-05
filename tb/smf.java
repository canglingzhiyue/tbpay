package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.deprecated.message.IMessageService;
import com.taobao.tao.flexbox.layoutmanager.ac.g;
import java.util.Map;

/* loaded from: classes5.dex */
public class smf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2100541084);
    }

    public static void a(FluidContext fluidContext, g.c cVar, String str, String str2, String str3, Map map) {
        a.c a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdf4d5e2", new Object[]{fluidContext, cVar, str, str2, str3, map});
        } else if (cVar == null) {
            spz.c("FluidChannelMessageSender", "【sendMessage】TNodeModuleActionContext is null");
        } else {
            String str4 = null;
            a currentMediaSetData = ((IDataService) fluidContext.getService(IDataService.class)).getCurrentMediaSetData();
            if (currentMediaSetData != null && (a2 = currentMediaSetData.a()) != null) {
                str4 = a2.c;
            }
            spy spyVar = new spy(str, str2, str3, str4, null, map, new slw(cVar));
            ((IMessageService) fluidContext.getService(IMessageService.class)).sendMessage(spyVar);
            spz.c("FluidChannelMessageSender", "【sendMessage】Send message: " + spyVar);
        }
    }
}
