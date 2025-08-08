package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerService;
import com.taobao.infoflow.taobao.subservice.framework.dataservice.impl.model.UiRefreshActionModel;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class lri {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ljr f30858a;
    private final IContainerDataService<?> b;
    private final IDxItemRenderService c;
    private final IContainerService<?> d;

    static {
        kge.a(859537737);
    }

    public static /* synthetic */ IContainerDataService a(lri lriVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IContainerDataService) ipChange.ipc$dispatch("859a0a27", new Object[]{lriVar}) : lriVar.b;
    }

    public static /* synthetic */ void a(lri lriVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("125622df", new Object[]{lriVar, str});
        } else {
            lriVar.a(str);
        }
    }

    public static /* synthetic */ IContainerService b(lri lriVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IContainerService) ipChange.ipc$dispatch("8b6e09de", new Object[]{lriVar}) : lriVar.d;
    }

    public lri(ljs ljsVar) {
        this.f30858a = ljsVar.a();
        this.b = (IContainerDataService) ljsVar.a(IContainerDataService.class);
        this.c = (IDxItemRenderService) ljsVar.a(IDxItemRenderService.class);
        this.d = (IContainerService) ljsVar.a(IContainerService.class);
    }

    public boolean a(BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bc98adb4", new Object[]{this, baseSectionModel})).booleanValue();
        }
        if (this.b == null) {
            ldf.d("UpdateDataHandler", "updateData mContainerDataService is null");
            return false;
        }
        String sectionBizCode = baseSectionModel.getSectionBizCode();
        if (StringUtils.isEmpty(sectionBizCode)) {
            ldf.d("UpdateDataHandler", "updateData sectionBizCode is empty");
            return false;
        }
        IContainerDataModel<?> containerData = this.b.getContainerData();
        if (a(containerData)) {
            ldf.d("UpdateDataHandler", "updateData containerData base is null");
            return false;
        }
        ArrayList arrayList = new ArrayList(containerData.getBase().getSections());
        int a2 = lix.a(baseSectionModel, arrayList);
        if (a2 == -1) {
            ldf.d("UpdateDataHandler", "updateData 未查找到卡片： " + sectionBizCode);
            return false;
        }
        b(baseSectionModel);
        a((IContainerDataModel<BaseSectionModel>) containerData, baseSectionModel);
        arrayList.set(a2, baseSectionModel);
        containerData.updateBaseSections(arrayList);
        a("remote");
        return true;
    }

    private void b(BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83a494b1", new Object[]{this, baseSectionModel});
        } else if (this.c == null) {
            ldf.d("UpdateDataHandler", "mDxItemRenderService is null");
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(baseSectionModel);
            this.c.downloadTemplate(arrayList, new IDxItemRenderService.b() { // from class: tb.lri.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.infoflow.protocol.subservice.base.IDxItemRenderService.b
                public void a() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    } else {
                        lri.a(lri.this, "download");
                    }
                }
            });
        }
    }

    private void a(IContainerDataModel<BaseSectionModel> iContainerDataModel, BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8da56b9b", new Object[]{this, iContainerDataModel, baseSectionModel});
        } else if (b(iContainerDataModel)) {
        } else {
            ArrayList arrayList = new ArrayList(iContainerDataModel.getDelta().getSections());
            int a2 = lix.a(baseSectionModel, arrayList);
            if (a2 != -1) {
                arrayList.remove(a2);
                iContainerDataModel.updateDeltaSections(arrayList);
                return;
            }
            ldf.d("UpdateDataHandler", "clearDeltaSection 未查找到卡片： " + baseSectionModel.getSectionBizCode());
        }
    }

    private boolean a(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2453afd7", new Object[]{this, iContainerDataModel})).booleanValue() : iContainerDataModel == null || iContainerDataModel.getBase() == null || iContainerDataModel.getBase().getSections() == null || iContainerDataModel.getBase().getSections().isEmpty();
    }

    private boolean b(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("24715b6", new Object[]{this, iContainerDataModel})).booleanValue() : iContainerDataModel == null || iContainerDataModel.getDelta() == null || iContainerDataModel.getDelta().getSections() == null || iContainerDataModel.getDelta().getSections().isEmpty();
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel] */
    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (this.d == null) {
            ldf.d("UpdateDataHandler", "deltaRefresh mContainerService is null");
        } else {
            final UiRefreshActionModel uiRefreshActionModel = new UiRefreshActionModel();
            uiRefreshActionModel.containerId = this.f30858a.a();
            uiRefreshActionModel.containerModel = this.b.getContainerData();
            uiRefreshActionModel.dataChangeType = "delta";
            uiRefreshActionModel.dataSourceType = str;
            ljd.a().b(new Runnable() { // from class: tb.lri.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        lri.b(lri.this).uiRefresh(lri.a(lri.this).getContainerData(), uiRefreshActionModel);
                    }
                }
            });
        }
    }
}
