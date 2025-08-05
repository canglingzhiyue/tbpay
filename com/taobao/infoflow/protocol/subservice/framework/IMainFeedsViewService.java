package com.taobao.infoflow.protocol.subservice.framework;

import android.view.View;
import android.view.ViewGroup;
import com.taobao.infoflow.protocol.model.datamodel.action.a;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.subservice.ISubService;
import java.util.List;
import tb.lkq;
import tb.lks;
import tb.lln;
import tb.llo;
import tb.tbs;

/* loaded from: classes.dex */
public interface IMainFeedsViewService<V extends ViewGroup> extends ISubService, lkq<V>, llo {
    public static final String SERVICE_NAME = "MainRecycleViewService";

    void dispatchWindowVisibility(int i);

    int findBottomPosition(int i, boolean z);

    BaseSectionModel<?> findItemDataByPosition(int i);

    View findItemViewByPosition(int i);

    int findTopPosition(int i);

    void forceExposure();

    int getInfoFlowColumn();

    int getItemCount();

    int[] getItemViewHeights();

    /* renamed from: getLifeCycleRegister */
    lks mo1084getLifeCycleRegister();

    @Deprecated
    /* renamed from: getOriginalView */
    V mo1085getOriginalView();

    int getPositionBySectionBizCode(String str);

    double getViewExposureRatio(int i);

    int[] getVisiblePositionRange();

    boolean isReachTopEdge();

    boolean isRecyclerViewCreated();

    void reloadUi();

    void resetErrorView();

    void scrollToPosition(int i);

    void scrollToPositionWithOffset(int i, int i2);

    void scrollToTop();

    void setGestureDetectorCallback(tbs tbsVar);

    void setInfoFlowColumn(int i);

    @Deprecated
    void setInitConfig(lln llnVar);

    void setScrollEnabled(boolean z);

    void smoothScrollToPositionWithOffset(int i, int i2);

    void stopScroll();

    void uiRefresh(List<BaseSectionModel> list, a aVar);

    void updateItem(BaseSectionModel baseSectionModel);
}
