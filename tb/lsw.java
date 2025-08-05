package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;

/* loaded from: classes7.dex */
public class lsw implements IContainerDataService.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CLIENT_PAGE_PARAM_KEY = "client_pageParams";

    /* renamed from: a  reason: collision with root package name */
    private final lsu f30904a;

    static {
        kge.a(-1903757351);
        kge.a(348066581);
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
    public void a(lli lliVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f302f74f", new Object[]{this, lliVar});
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
    public void a(lli lliVar, IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce5cd68c", new Object[]{this, lliVar, iContainerDataModel});
        }
    }

    public lsw(lsu lsuVar) {
        this.f30904a = lsuVar;
    }

    @Override // com.taobao.infoflow.protocol.subservice.framework.IContainerDataService.a
    public void b(lli lliVar, IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30b7ed6b", new Object[]{this, lliVar, iContainerDataModel});
        } else if (iContainerDataModel == null) {
        } else {
            ldf.a("CardBackDataProcessor", "start parser cardBack switcher");
            this.f30904a.a(iContainerDataModel);
        }
    }
}
