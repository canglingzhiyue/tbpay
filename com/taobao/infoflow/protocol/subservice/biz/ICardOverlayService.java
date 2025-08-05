package com.taobao.infoflow.protocol.subservice.biz;

import android.view.View;
import android.view.ViewGroup;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.subservice.ISubService;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public interface ICardOverlayService<V extends ViewGroup> extends ISubService {
    public static final String SERVICE_NAME = "OverlayService";

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface ContentType {
    }

    void deleteOverlayHostCard(BaseSectionModel baseSectionModel);

    BaseSectionModel<?> findHostCard(BaseSectionModel<?> baseSectionModel);

    void hideOverlay();

    void removeOverlayView(String str, View view);

    void showOverlay(String str, View view, BaseSectionModel baseSectionModel);

    void showOverlayWithOverlayData(String str, View view, BaseSectionModel baseSectionModel, BaseSectionModel baseSectionModel2, View view2);
}
