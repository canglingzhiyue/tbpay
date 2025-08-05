package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.videocollection.poplayer.INativeCollectionPoplayerService;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.deprecated.message.IMessageService;
import com.taobao.android.fluid.framework.list.IFeedsListService;
import java.util.HashMap;
import tb.slk;

/* loaded from: classes5.dex */
public class smi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1233623949);
    }

    public static void a(FluidContext fluidContext) {
        a currentMediaSetData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fc4079a", new Object[]{fluidContext});
        } else if (!sjt.b() || (currentMediaSetData = ((IDataService) fluidContext.getService(IDataService.class)).getCurrentMediaSetData()) == null) {
        } else {
            a.c a2 = currentMediaSetData.a();
            IMessageService iMessageService = (IMessageService) fluidContext.getService(IMessageService.class);
            if (iMessageService == null) {
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("isScroll", "true");
            iMessageService.sendMessage(new spy("VSMSG_recyclerViewGlissade", a2.c, hashMap));
        }
    }

    public static void a(FluidContext fluidContext, slk.a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        boolean z2 = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52bba279", new Object[]{fluidContext, aVar, new Boolean(z)});
            return;
        }
        skl j = ((IDataService) fluidContext.getService(IDataService.class)).getConfig().j();
        if (j == null || !j.aa) {
            return;
        }
        IMessageService iMessageService = (IMessageService) fluidContext.getService(IMessageService.class);
        boolean isUpNoMoreData = ((IDataService) fluidContext.getService(IDataService.class)).isUpNoMoreData();
        boolean isDownNoMoreData = ((IDataService) fluidContext.getService(IDataService.class)).isDownNoMoreData();
        if (iMessageService != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("isTop", String.valueOf(z));
            hashMap.put("list", aVar.c);
            if (!z ? isDownNoMoreData : isUpNoMoreData) {
                z2 = false;
            }
            hashMap.put("hasMore", String.valueOf(z2));
            iMessageService.sendMessage(new spy("VSMSG_addList", "-1", hashMap));
        }
        if (fluidContext.getService(INativeCollectionPoplayerService.class) == null) {
            return;
        }
        ((INativeCollectionPoplayerService) fluidContext.getService(INativeCollectionPoplayerService.class)).updateCollectionDialog(fluidContext, ((IDataService) fluidContext.getService(IDataService.class)).getMediaSetList(), aVar, z);
    }

    public static void b(FluidContext fluidContext) {
        a currentMediaSetData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f4da19b", new Object[]{fluidContext});
        } else if (!a() || (currentMediaSetData = ((IDataService) fluidContext.getService(IDataService.class)).getCurrentMediaSetData()) == null) {
        } else {
            a.c a2 = currentMediaSetData.a();
            IMessageService iMessageService = (IMessageService) fluidContext.getService(IMessageService.class);
            if (iMessageService != null) {
                iMessageService.sendMessage(new spy("VSMSG_listChanged", a2.c, new HashMap()));
            }
            sno mediaCardListAdapter = ((IFeedsListService) fluidContext.getService(IFeedsListService.class)).getMediaCardListAdapter();
            if (mediaCardListAdapter == null) {
                return;
            }
            mediaCardListAdapter.j();
        }
    }

    private static boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[0])).booleanValue() : FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enableListChangedMsg", true);
    }
}
