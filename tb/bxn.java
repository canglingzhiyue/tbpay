package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import java.util.List;

/* loaded from: classes7.dex */
public class bxn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1124658465);
    }

    public static JSONObject a(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("c2613323", new Object[]{ljsVar});
        }
        JSONObject d = d(ljsVar);
        if (d == null) {
            ldf.d("ContainerDataUtils", "ext == null");
            return null;
        }
        return d.getJSONObject("homeGlobalABTest");
    }

    public static boolean b(ljs ljsVar) {
        IContainerDataModel containerData;
        IContainerInnerDataModel base;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e16e5a88", new Object[]{ljsVar})).booleanValue();
        }
        IContainerDataService iContainerDataService = (IContainerDataService) ljsVar.a(IContainerDataService.class);
        if (iContainerDataService != null && (containerData = iContainerDataService.getContainerData()) != null && (base = containerData.getBase()) != null) {
            return base.isAbandoned();
        }
        return false;
    }

    public static List<BaseSectionModel> c(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("1d5fa6a2", new Object[]{ljsVar});
        }
        IContainerDataService iContainerDataService = (IContainerDataService) ljsVar.a(IContainerDataService.class);
        if (iContainerDataService == null) {
            ldf.d("ContainerDataUtils", "containerDataService == null");
            return null;
        }
        IContainerDataModel containerData = iContainerDataService.getContainerData();
        if (containerData == null) {
            ldf.d("ContainerDataUtils", "containerData == null");
            return null;
        }
        return containerData.getTotalData();
    }

    public static boolean a(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2453afd7", new Object[]{iContainerDataModel})).booleanValue() : b(iContainerDataModel) == 0;
    }

    public static int b(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("24715a5", new Object[]{iContainerDataModel})).intValue();
        }
        if (iContainerDataModel != null && iContainerDataModel.getBase() != null && iContainerDataModel.getBase().mo1280getPageParams() != null) {
            return iContainerDataModel.getBase().mo1280getPageParams().getPageNum();
        }
        return -1;
    }

    public static boolean c(IContainerDataModel<?> iContainerDataModel) {
        IContainerInnerDataModel<?> base;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e03a7b95", new Object[]{iContainerDataModel})).booleanValue();
        }
        if (iContainerDataModel != null && (base = iContainerDataModel.getBase()) != null) {
            return base.isRemote();
        }
        return false;
    }

    public static JSONObject d(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("92437aa6", new Object[]{ljsVar});
        }
        IContainerDataService iContainerDataService = (IContainerDataService) ljsVar.a(IContainerDataService.class);
        if (iContainerDataService == null) {
            ldf.d("ContainerDataUtils", "dataService == null");
            return null;
        }
        IContainerDataModel containerData = iContainerDataService.getContainerData();
        if (containerData == null) {
            ldf.d("ContainerDataUtils", "containerDataModel == null");
            return null;
        }
        IContainerInnerDataModel base = containerData.getBase();
        if (base == null) {
            ldf.d("ContainerDataUtils", "baseData == null");
            return null;
        }
        return base.getExt();
    }
}
