package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.action.IUiRefreshActionModel;
import com.taobao.infoflow.protocol.model.datamodel.action.a;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IPageDataModel;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;

/* loaded from: classes.dex */
public class lhj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final IMainFeedsViewService<?> f30604a;

    static {
        kge.a(-265192952);
    }

    public lhj(ljs ljsVar) {
        this.f30604a = (IMainFeedsViewService) ljsVar.a(IMainFeedsViewService.class);
    }

    public void a(IContainerDataModel<?> iContainerDataModel, IUiRefreshActionModel iUiRefreshActionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7eaee5", new Object[]{this, iContainerDataModel, iUiRefreshActionModel});
            return;
        }
        IMainFeedsViewService<?> iMainFeedsViewService = this.f30604a;
        if (iMainFeedsViewService == null) {
            return;
        }
        a(iContainerDataModel, iUiRefreshActionModel, iMainFeedsViewService);
    }

    private void a(IContainerDataModel iContainerDataModel, IUiRefreshActionModel iUiRefreshActionModel, IMainFeedsViewService<?> iMainFeedsViewService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5ef13b3", new Object[]{this, iContainerDataModel, iUiRefreshActionModel, iMainFeedsViewService});
        } else if (StringUtils.isEmpty(iUiRefreshActionModel.getDataChangeType())) {
            iMainFeedsViewService.resetErrorView();
        } else if (!a(iUiRefreshActionModel, iContainerDataModel, iMainFeedsViewService)) {
        } else {
            iMainFeedsViewService.uiRefresh(iContainerDataModel.getTotalData(), b(iContainerDataModel, iUiRefreshActionModel));
        }
    }

    private a b(IContainerDataModel iContainerDataModel, IUiRefreshActionModel iUiRefreshActionModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("41517422", new Object[]{this, iContainerDataModel, iUiRefreshActionModel}) : new lhl(c(iContainerDataModel, iUiRefreshActionModel), a(iContainerDataModel), b(iUiRefreshActionModel));
    }

    private boolean a(IUiRefreshActionModel iUiRefreshActionModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4935db34", new Object[]{this, iUiRefreshActionModel})).booleanValue() : StringUtils.equals(iUiRefreshActionModel.getDataSourceType(), "local");
    }

    private boolean b(IUiRefreshActionModel iUiRefreshActionModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("27294113", new Object[]{this, iUiRefreshActionModel})).booleanValue() : StringUtils.equals(iUiRefreshActionModel.getDataSourceType(), "download");
    }

    private boolean c(IContainerDataModel iContainerDataModel, IUiRefreshActionModel iUiRefreshActionModel) {
        IPageDataModel mo1280getPageParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a306b06b", new Object[]{this, iContainerDataModel, iUiRefreshActionModel})).booleanValue();
        }
        boolean equals = StringUtils.equals(iUiRefreshActionModel.getDataChangeType(), "base");
        return (!equals || (mo1280getPageParams = iContainerDataModel.getBase().mo1280getPageParams()) == null) ? equals : mo1280getPageParams.getPageNum() == 0 && !iUiRefreshActionModel.isSecondReturn();
    }

    private boolean a(IContainerDataModel iContainerDataModel) {
        IContainerInnerDataModel base;
        IPageDataModel mo1280getPageParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2453afd7", new Object[]{this, iContainerDataModel})).booleanValue();
        }
        if (iContainerDataModel != null && (base = iContainerDataModel.getBase()) != null && (mo1280getPageParams = base.mo1280getPageParams()) != null) {
            return mo1280getPageParams.isLastPage();
        }
        return true;
    }

    private boolean a(IUiRefreshActionModel iUiRefreshActionModel, IContainerDataModel<?> iContainerDataModel, IMainFeedsViewService<?> iMainFeedsViewService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("80936951", new Object[]{this, iUiRefreshActionModel, iContainerDataModel, iMainFeedsViewService})).booleanValue();
        }
        if (iContainerDataModel == null) {
            ldf.d("FeedsRefresher", "containerData is null");
            return false;
        }
        IContainerInnerDataModel<?> base = iContainerDataModel.getBase();
        if (base == null || base.getSections() == null || base.mo1280getPageParams() == null) {
            ldf.d("FeedsRefresher", "isAllowRefresh data exception");
            return false;
        } else if (!a(iUiRefreshActionModel) || iMainFeedsViewService.getItemCount() <= 1) {
            return true;
        } else {
            ldf.d("FeedsRefresher", "避免缓存数据无效刷新，原始老逻辑");
            return false;
        }
    }
}
