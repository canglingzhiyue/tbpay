package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.utils.lang3.ObjectUtils;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import com.taobao.infoflow.taobao.subservice.biz.nextpageoptimizeservice.impl.preload.model.PreLoadModel;
import com.taobao.infoflow.taobao.subservice.biz.nextpageoptimizeservice.impl.preload.model.a;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public class swb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final IContainerDataService<?> f33926a;
    private final IMainFeedsViewService<?> b;

    static {
        kge.a(-1542210045);
    }

    public swb(IContainerDataService<?> iContainerDataService, IMainFeedsViewService<?> iMainFeedsViewService) {
        this.f33926a = iContainerDataService;
        this.b = iMainFeedsViewService;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!a(this.f33926a.getContainerData())) {
            ldf.d("LiteDetailOnScreenPreLoader", "未开启 liteDetail 预加载");
        } else {
            PreLoadModel a2 = a(this.b);
            if (a2 == null) {
                ldf.d("LiteDetailOnScreenPreLoader", "未构建出预加载模型");
            } else if (a2.getItems() == null) {
            } else {
                a2.setBizName(flp.PRELOAD_REQUESTER_BIZ_NAME_LITE);
                sgd.a(a2);
            }
        }
    }

    private PreLoadModel a(IMainFeedsViewService<?> iMainFeedsViewService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PreLoadModel) ipChange.ipc$dispatch("6a2bf3b4", new Object[]{this, iMainFeedsViewService});
        }
        if (iMainFeedsViewService == null) {
            ldf.d("LiteDetailOnScreenPreLoader", "preparePreLoadModelOnScreen mainFeedsViewService is null");
            return null;
        }
        int[] visiblePositionRange = iMainFeedsViewService.getVisiblePositionRange();
        if (visiblePositionRange == null || visiblePositionRange.length != 2) {
            ldf.d("LiteDetailOnScreenPreLoader", "range invalid");
            return null;
        }
        int i = visiblePositionRange[1];
        ArrayList arrayList = new ArrayList();
        for (int i2 = visiblePositionRange[0]; i2 <= i; i2++) {
            arrayList.add(iMainFeedsViewService.findItemDataByPosition(i2));
        }
        return a.a(arrayList, -1, a.TARGET_TYPE_LITE_DETAIL, "InfoFlow");
    }

    public boolean a(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2453afd7", new Object[]{this, iContainerDataModel})).booleanValue();
        }
        if (iContainerDataModel == null) {
            ldf.d("LiteDetailOnScreenPreLoader", "enablePreLoadNewDetail containerDataModel is null");
            return false;
        }
        JSONObject c = sgc.c(iContainerDataModel);
        if (ObjectUtils.a(c)) {
            ldf.d("LiteDetailOnScreenPreLoader", "enablePreLoadNewDetail homeGlobalAbTest is null");
            return false;
        }
        return c.getBooleanValue("enablePreLoadLiteDetail");
    }
}
