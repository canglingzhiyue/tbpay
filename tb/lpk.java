package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.action.IUiRefreshActionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;

/* loaded from: classes7.dex */
public class lpk implements IUiRefreshActionModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ljs f30798a;

    static {
        kge.a(719355105);
        kge.a(1693673289);
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.action.IUiRefreshActionModel
    public String getDataChangeType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1799b5ef", new Object[]{this}) : "delta";
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.action.IUiRefreshActionModel
    public String getDataSourceType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("831c9fe4", new Object[]{this}) : "remote";
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.action.IUiRefreshActionModel
    public String getErrorCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f72feefa", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.action.IUiRefreshActionModel
    public String getRequestType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e6381fa6", new Object[]{this});
        }
        return null;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.action.IUiRefreshActionModel
    public String getUiOperationType() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c08da82", new Object[]{this}) : "uiRefresh";
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.action.IUiRefreshActionModel
    public boolean isSecondReturn() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("73b38699", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public lpk(ljs ljsVar) {
        this.f30798a = ljsVar;
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.action.IUiRefreshActionModel
    public String getContainerId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("94b5b673", new Object[]{this}) : this.f30798a.a().a();
    }

    @Override // com.taobao.infoflow.protocol.model.datamodel.action.IUiRefreshActionModel
    public IContainerDataModel getContainerModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IContainerDataModel) ipChange.ipc$dispatch("697d3f50", new Object[]{this});
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.f30798a.a(IContainerDataService.class);
        if (iContainerDataService != null) {
            return iContainerDataService.getContainerData();
        }
        return null;
    }
}
