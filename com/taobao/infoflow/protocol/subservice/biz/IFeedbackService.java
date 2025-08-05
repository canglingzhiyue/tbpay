package com.taobao.infoflow.protocol.subservice.biz;

import android.view.View;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.subservice.ISubService;

/* loaded from: classes7.dex */
public interface IFeedbackService extends ISubService {
    public static final String SERVICE_NAME = "FeedbackService";

    void deleteHostCardByBizCode(String str);

    void showFeedbackOverlay(View view, BaseSectionModel<?> baseSectionModel);

    void showFeedbackOverlayWithData(View view, BaseSectionModel<?> baseSectionModel, BaseSectionModel<?> baseSectionModel2, View view2);
}
