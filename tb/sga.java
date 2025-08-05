package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import com.taobao.infoflow.taobao.subservice.biz.nextpageoptimizeservice.impl.preload.model.PreLoadModel;
import com.taobao.infoflow.taobao.subservice.biz.nextpageoptimizeservice.impl.preload.model.a;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public class sga {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final IContainerDataService<?> f33544a;
    private final IMainFeedsViewService<?> b;

    static {
        kge.a(-1080480449);
    }

    public sga(IContainerDataService<?> iContainerDataService, IMainFeedsViewService<?> iMainFeedsViewService) {
        this.f33544a = iContainerDataService;
        this.b = iMainFeedsViewService;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel] */
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!sgc.a(this.f33544a.getContainerData())) {
            ldf.d("NewDetailOnScreenPreLoader", "未开启 NewDetail 预加载");
        } else {
            PreLoadModel a2 = a(this.b);
            if (a2 == null) {
                ldf.d("NewDetailOnScreenPreLoader", "未构建出预加载模型");
            } else {
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
            ldf.d("NewDetailOnScreenPreLoader", "preparePreLoadModelOnScreen mainFeedsViewService is null");
            return null;
        }
        int[] visiblePositionRange = iMainFeedsViewService.getVisiblePositionRange();
        if (visiblePositionRange == null || visiblePositionRange.length != 2) {
            ldf.d("NewDetailOnScreenPreLoader", "range invalid");
            return null;
        }
        int i = visiblePositionRange[1];
        ArrayList arrayList = new ArrayList();
        for (int i2 = visiblePositionRange[0]; i2 <= i; i2++) {
            BaseSectionModel<?> findItemDataByPosition = iMainFeedsViewService.findItemDataByPosition(i2);
            if (findItemDataByPosition != null) {
                JSONObject ext = findItemDataByPosition.getExt();
                if (ext != null) {
                    ext.put("requestNewDetailFlag", (Object) "1");
                    ext.put("requestNewDetailTime", (Object) Long.valueOf(System.currentTimeMillis()));
                    if (jqm.a()) {
                        String str = "预加载时间戳：" + System.currentTimeMillis();
                    }
                }
                arrayList.add(findItemDataByPosition);
            }
        }
        return a.a(arrayList, -1, "newDetail", "InfoFlow");
    }
}
