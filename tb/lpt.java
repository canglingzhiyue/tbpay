package tb;

import android.view.View;
import com.alibaba.security.realidentity.ui.view.ALBiometricsActivityParentView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.subservice.biz.ICardOverlayService;

/* loaded from: classes.dex */
public class lpt extends syg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_ROVERLAYGUIDE = -9200576388575376305L;

    static {
        kge.a(1380214847);
    }

    @Override // tb.syg
    public void a(ljs ljsVar, View view, BaseSectionModel baseSectionModel, BaseSectionModel baseSectionModel2, View view2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c00d2f3", new Object[]{this, ljsVar, view, baseSectionModel, baseSectionModel2, view2});
            return;
        }
        ICardOverlayService iCardOverlayService = (ICardOverlayService) ljsVar.a(ICardOverlayService.class);
        if (iCardOverlayService == null) {
            return;
        }
        if (baseSectionModel2 != null && view2 != null) {
            iCardOverlayService.showOverlayWithOverlayData(ALBiometricsActivityParentView.n, view, baseSectionModel, baseSectionModel2, view2);
        } else {
            iCardOverlayService.showOverlay(ALBiometricsActivityParentView.n, view, baseSectionModel);
        }
    }
}
