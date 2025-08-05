package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.subservice.biz.IFeedbackService;

/* loaded from: classes.dex */
public class lps extends syg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_EVENT_ROVERLAY = 6136827152325085276L;
    public static final String TAG = "rOverlay";

    static {
        kge.a(810192621);
    }

    @Override // tb.syg
    public void a(ljs ljsVar, View view, BaseSectionModel baseSectionModel, BaseSectionModel baseSectionModel2, View view2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c00d2f3", new Object[]{this, ljsVar, view, baseSectionModel, baseSectionModel2, view2});
            return;
        }
        IFeedbackService iFeedbackService = (IFeedbackService) ljsVar.a(IFeedbackService.class);
        if (iFeedbackService == null) {
            return;
        }
        if (baseSectionModel2 != null && view2 != null) {
            iFeedbackService.showFeedbackOverlayWithData(view, baseSectionModel, baseSectionModel2, view2);
        } else {
            iFeedbackService.showFeedbackOverlay(view, baseSectionModel);
        }
    }
}
