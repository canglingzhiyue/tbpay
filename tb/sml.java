package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.deprecated.message.IMessageService;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class sml {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PROGRESS_POSITION_DOWN = "down";
    public static final String PROGRESS_POSITION_UP = "up";

    static {
        kge.a(-1970161589);
    }

    private static void a(FluidContext fluidContext, String str, Map map, String str2) {
        a currentMediaSetData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1913bab", new Object[]{fluidContext, str, map, str2});
            return;
        }
        IMessageService iMessageService = (IMessageService) fluidContext.getService(IMessageService.class);
        if (iMessageService == null) {
            return;
        }
        if (str2 == null && (currentMediaSetData = ((IDataService) fluidContext.getService(IDataService.class)).getCurrentMediaSetData()) != null && currentMediaSetData.a() != null) {
            str2 = currentMediaSetData.a().c;
        }
        iMessageService.sendMessage(new spy(str, str2, map));
    }

    public static void a(FluidContext fluidContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ab43ee4", new Object[]{fluidContext, str});
        } else if (!a()) {
        } else {
            spz.c("MessageSenderHelper", "sendDragingList state=" + str);
            HashMap hashMap = new HashMap();
            hashMap.put("state", str);
            a(fluidContext, "VSMSG_draggingListView", hashMap, null);
        }
    }

    public static void a(FluidContext fluidContext, String str, a.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa82ec49", new Object[]{fluidContext, str, cVar});
        } else if (cVar == null) {
        } else {
            String str2 = cVar.c;
            spz.c("MessageSenderHelper", "VSMSG_progressChanged，positionState=" + str + "; sessionId=" + str2);
            HashMap hashMap = new HashMap(1);
            hashMap.put("position", str);
            a(fluidContext, "VSMSG_progressChanged", hashMap, str2);
        }
    }

    private static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enableDragListviewMessage", true);
    }
}
