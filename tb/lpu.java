package tb;

import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.dinamic.a;
import com.taobao.infoflow.core.subservice.base.item.dxservice.impl.render.InfoFlowDxUserContext;
import com.taobao.infoflow.protocol.subservice.biz.IFeedbackService;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;

/* loaded from: classes7.dex */
public class lpu extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-739395639);
    }

    public static /* synthetic */ Object ipc$super(lpu lpuVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.taobao.android.dinamic.dinamic.a, com.taobao.android.dinamic.dinamic.d
    public void a(View view, String str, Object obj, Object obj2, Object obj3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61e48a48", new Object[]{this, view, str, obj, obj2, obj3});
        } else if (!(obj2 instanceof JSONObject)) {
        } else {
            SectionModel sectionModel = new SectionModel((JSONObject) obj2);
            if (!a(sectionModel, view, obj3)) {
                return;
            }
            ljs infoFlowContext = ((InfoFlowDxUserContext) obj3).getInfoFlowContext();
            if (infoFlowContext == null) {
                ldf.d("ROverlayEventHandler", "infoFlowContext == null");
                return;
            }
            IFeedbackService iFeedbackService = (IFeedbackService) infoFlowContext.a(IFeedbackService.class);
            if (iFeedbackService == null) {
                ldf.d("ROverlayEventHandler", "feedbackService == null");
                return;
            }
            iFeedbackService.showFeedbackOverlay(view, sectionModel);
            liw.a((JSONObject) sectionModel);
        }
    }

    private boolean a(SectionModel sectionModel, View view, Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("ec3534cd", new Object[]{this, sectionModel, view, obj})).booleanValue() : (sectionModel == null || !(obj instanceof InfoFlowDxUserContext) || view == null) ? false : true;
    }
}
