package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IPageDataModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import java.util.List;

/* loaded from: classes7.dex */
public class lhm {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BIZ_INDEX = "index";

    /* renamed from: a  reason: collision with root package name */
    private final IContainerDataService<?> f30607a;
    private volatile int b = -1;

    static {
        kge.a(133866890);
    }

    public lhm(ljs ljsVar) {
        this.f30607a = (IContainerDataService) ljsVar.a(IContainerDataService.class);
    }

    public boolean a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{this, new Integer(i)})).booleanValue();
        }
        IContainerDataService<?> iContainerDataService = this.f30607a;
        if (iContainerDataService == null || !a(iContainerDataService.getContainerData(), i)) {
            return false;
        }
        this.b = i;
        return true;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        IContainerDataService<?> iContainerDataService = this.f30607a;
        if (iContainerDataService == null) {
            return false;
        }
        IContainerDataModel<BaseSectionModel<?>> containerData = iContainerDataService.getContainerData();
        if (containerData == null) {
            ldf.d("NextPageTrigger", "onLoadingAppear containerData == null");
            return false;
        }
        int b = b(containerData);
        List<BaseSectionModel<?>> totalData = containerData.getTotalData();
        if (this.b == totalData.size() - b) {
            ldf.d("NextPageTrigger", "已经正常发过请求不补偿");
            return false;
        }
        ldf.d("NextPageTrigger", "达到loading出现补偿请求条件, lastAllowRequestPosition ： " + this.b + ", offset : " + b + ", total.size() : " + totalData.size());
        return true;
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("index", (Object) Integer.valueOf(i));
        this.f30607a.triggerEvent("ViewAppear", jSONObject);
    }

    private boolean a(IContainerDataModel<BaseSectionModel<?>> iContainerDataModel, int i) {
        IPageDataModel a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6622bd94", new Object[]{this, iContainerDataModel, new Integer(i)})).booleanValue();
        }
        if (iContainerDataModel == null || (a2 = a(iContainerDataModel)) == null || a(a2)) {
            return false;
        }
        if (ldj.a("openFirstRequestOptimize", false) && a2.getPageNum() == 0 && iContainerDataModel.getTotalData().size() < 10) {
            return false;
        }
        return b(iContainerDataModel, i);
    }

    private boolean b(IContainerDataModel<BaseSectionModel<?>> iContainerDataModel, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("469c1395", new Object[]{this, iContainerDataModel, new Integer(i)})).booleanValue();
        }
        List<BaseSectionModel<?>> totalData = iContainerDataModel.getTotalData();
        if (totalData.isEmpty()) {
            ldf.d("NextPageTrigger", "total is empty");
            return false;
        }
        int b = b(iContainerDataModel);
        if (b == 999) {
            return false;
        }
        return b > totalData.size() || i == totalData.size() - b;
    }

    private boolean a(IPageDataModel iPageDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5ee16b73", new Object[]{this, iPageDataModel})).booleanValue();
        }
        if (iPageDataModel != null) {
            return iPageDataModel.isLastPage();
        }
        return true;
    }

    private IPageDataModel a(IContainerDataModel<?> iContainerDataModel) {
        IContainerInnerDataModel<?> base;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPageDataModel) ipChange.ipc$dispatch("fa4e5baa", new Object[]{this, iContainerDataModel});
        }
        if (iContainerDataModel != null && (base = iContainerDataModel.getBase()) != null) {
            return base.mo1280getPageParams();
        }
        return null;
    }

    private int b(IContainerDataModel<BaseSectionModel<?>> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("24715a5", new Object[]{this, iContainerDataModel})).intValue();
        }
        IPageDataModel a2 = a(iContainerDataModel);
        if (a2 == null) {
            ldf.d("NextPageTrigger", "pageDataModel == null");
            return 10;
        }
        int requestInAdvance = a2.getRequestInAdvance();
        if (requestInAdvance == 999) {
            return requestInAdvance;
        }
        if (c(iContainerDataModel)) {
            if (requestInAdvance <= 25) {
                return requestInAdvance;
            }
            return 10;
        } else if (requestInAdvance >= 2 && requestInAdvance <= 25) {
            return requestInAdvance;
        } else {
            return 10;
        }
    }

    private boolean c(IContainerDataModel<BaseSectionModel<?>> iContainerDataModel) {
        List<BaseSectionModel<?>> sections;
        BaseSectionModel<?> baseSectionModel;
        JSONObject args;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e03a7b95", new Object[]{this, iContainerDataModel})).booleanValue();
        }
        IContainerInnerDataModel<BaseSectionModel<?>> base = iContainerDataModel.getBase();
        if (base != null && (sections = base.getSections()) != null && sections.size() > 1 && (baseSectionModel = sections.get(0)) != null && (args = baseSectionModel.getArgs()) != null) {
            return TextUtils.equals(args.getString(tim.S_ARGS_IS_CLIENT_CACHE), "1");
        }
        return false;
    }
}
