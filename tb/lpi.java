package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerService;
import java.util.List;

/* loaded from: classes.dex */
public class lpi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ljs f30797a;

    static {
        kge.a(229641051);
    }

    public lpi(ljs ljsVar) {
        this.f30797a = ljsVar;
    }

    public void a(BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc98adb0", new Object[]{this, baseSectionModel});
            return;
        }
        IContainerDataService<?> iContainerDataService = (IContainerDataService) this.f30797a.a(IContainerDataService.class);
        if (iContainerDataService == null) {
            return;
        }
        List<BaseSectionModel> a2 = a(iContainerDataService);
        List<BaseSectionModel> b = b(iContainerDataService);
        List<BaseSectionModel> c = c(iContainerDataService);
        if (a2 == null || b == null) {
            return;
        }
        a(baseSectionModel, a2);
        a(baseSectionModel, b);
        a(baseSectionModel, c);
        d(iContainerDataService);
    }

    private void a(BaseSectionModel<?> baseSectionModel, List<BaseSectionModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7755daa1", new Object[]{this, baseSectionModel, list});
        } else if (list == null) {
        } else {
            try {
                list.remove(baseSectionModel);
            } catch (Exception e) {
                ldf.d("DeleteHostCardHelper", "删除商品卡出现异常: " + e);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel] */
    private List<BaseSectionModel> a(IContainerDataService<?> iContainerDataService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b15c9f4d", new Object[]{this, iContainerDataService});
        }
        ?? containerData = iContainerDataService.getContainerData();
        if (containerData != 0) {
            return containerData.getTotalData();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel] */
    private List<BaseSectionModel> b(IContainerDataService<?> iContainerDataService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9707fbce", new Object[]{this, iContainerDataService});
        }
        IContainerInnerDataModel base = iContainerDataService.getContainerData().getBase();
        if (base != null) {
            return base.getSections();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel] */
    private List<BaseSectionModel> c(IContainerDataService<?> iContainerDataService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7cb3584f", new Object[]{this, iContainerDataService});
        }
        IContainerInnerDataModel delta = iContainerDataService.getContainerData().getDelta();
        if (delta != null) {
            return delta.getSections();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel] */
    private void d(IContainerDataService<?> iContainerDataService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f897c97", new Object[]{this, iContainerDataService});
            return;
        }
        IContainerService iContainerService = (IContainerService) this.f30797a.a(IContainerService.class);
        if (iContainerService == 0) {
            return;
        }
        iContainerService.uiRefresh(iContainerDataService.getContainerData(), new lpk(this.f30797a));
    }
}
