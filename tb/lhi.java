package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.action.IUiRefreshActionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.subservice.framework.IHostService;

/* loaded from: classes.dex */
public class lhi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ljs f30603a;
    private final lhj b;
    private final lhk c;

    static {
        kge.a(1847613933);
    }

    public lhi(ljs ljsVar) {
        this.f30603a = ljsVar;
        this.b = new lhj(ljsVar);
        this.c = new lhk(ljsVar);
    }

    public void a(IContainerDataModel<?> iContainerDataModel, IUiRefreshActionModel iUiRefreshActionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7eaee5", new Object[]{this, iContainerDataModel, iUiRefreshActionModel});
        } else {
            b(iContainerDataModel, iUiRefreshActionModel);
        }
    }

    private void b(IContainerDataModel<?> iContainerDataModel, IUiRefreshActionModel iUiRefreshActionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7c2afa6", new Object[]{this, iContainerDataModel, iUiRefreshActionModel});
        } else if ("scrollToTop".equals(iUiRefreshActionModel.getUiOperationType())) {
            a();
        } else {
            c(iContainerDataModel, iUiRefreshActionModel);
            a(this.f30603a);
        }
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.c.a();
        }
    }

    private void c(IContainerDataModel<?> iContainerDataModel, IUiRefreshActionModel iUiRefreshActionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a306b067", new Object[]{this, iContainerDataModel, iUiRefreshActionModel});
        } else {
            this.b.a(iContainerDataModel, iUiRefreshActionModel);
        }
    }

    private void a(ljs ljsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2eb5403", new Object[]{this, ljsVar});
            return;
        }
        IHostService iHostService = (IHostService) ljsVar.a(IHostService.class);
        if (iHostService == null) {
            ldf.d("ContainerRefresher", "refreshFinish, hostService == null");
            return;
        }
        lke a2 = iHostService.getInvokeCallback().a();
        if (a2 == null) {
            ldf.d("ContainerRefresher", "refreshFinish, pullDownRefreshCallback == null");
        } else {
            a2.b();
        }
    }
}
