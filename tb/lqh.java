package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.action.IUiRefreshActionModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerService;

/* loaded from: classes.dex */
public class lqh implements IContainerService.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(616571395);
        kge.a(504102497);
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerService.a
    public void a(IUiRefreshActionModel iUiRefreshActionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4935db30", new Object[]{this, iUiRefreshActionModel});
            return;
        }
        String requestType = iUiRefreshActionModel.getRequestType();
        String containerId = iUiRefreshActionModel.getContainerId();
        String a2 = a(requestType, iUiRefreshActionModel.getDataSourceType());
        lqe.a(a(a2), a2, containerId);
        if (!StringUtils.equals(requestType, "coldStart")) {
            return;
        }
        lqe.a(containerId, "homeUiRefresh", 1);
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerService.a
    public void b(IUiRefreshActionModel iUiRefreshActionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2729410f", new Object[]{this, iUiRefreshActionModel});
            return;
        }
        String requestType = iUiRefreshActionModel.getRequestType();
        String containerId = iUiRefreshActionModel.getContainerId();
        String a2 = a(requestType, iUiRefreshActionModel.getDataSourceType());
        lqe.a(a(a2), true, a2, containerId);
    }

    private String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2}) : StringUtils.isEmpty(str) ? StringUtils.equals(str2, "local") ? "loadCache" : "coldStart" : str;
    }

    private String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        return str + "SubContainerUiRefresh";
    }
}
