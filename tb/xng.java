package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.external.e;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public class xng {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final IMainFeedsViewService<?> f34398a;

    static {
        kge.a(268496544);
    }

    public xng(ljs ljsVar) {
        this.f34398a = (IMainFeedsViewService) ljsVar.a(IMainFeedsViewService.class);
    }

    public List<e> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("627608df", new Object[]{this});
        }
        IMainFeedsViewService<?> iMainFeedsViewService = this.f34398a;
        if (iMainFeedsViewService != null) {
            return a(iMainFeedsViewService);
        }
        return null;
    }

    private List<e> a(IMainFeedsViewService<?> iMainFeedsViewService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b0850eb7", new Object[]{this, iMainFeedsViewService});
        }
        ArrayList arrayList = new ArrayList();
        int[] visiblePositionRange = iMainFeedsViewService.getVisiblePositionRange();
        if (visiblePositionRange == null || visiblePositionRange.length != 2) {
            ldf.d("BxCardTracer", "findOnScreenViews visiblePositionRange error");
            return null;
        }
        int i = visiblePositionRange[1];
        for (int i2 = visiblePositionRange[0]; i2 <= i; i2++) {
            View findItemViewByPosition = iMainFeedsViewService.findItemViewByPosition(i2);
            BaseSectionModel<?> findItemDataByPosition = iMainFeedsViewService.findItemDataByPosition(i2);
            if (findItemViewByPosition != null && findItemViewByPosition.getVisibility() == 0 && findItemDataByPosition != null) {
                arrayList.add(a(findItemDataByPosition, findItemViewByPosition));
            }
        }
        return arrayList;
    }

    private e a(BaseSectionModel<?> baseSectionModel, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("ac811b9f", new Object[]{this, baseSectionModel, view});
        }
        e eVar = new e();
        eVar.f = stn.b(baseSectionModel);
        eVar.e = stn.c(baseSectionModel);
        eVar.f12314a = stn.a(baseSectionModel);
        eVar.d = liw.a(view);
        return eVar;
    }
}
