package com.taobao.infoflow.protocol.subservice.biz;

import com.taobao.infoflow.protocol.subservice.ISubService;

/* loaded from: classes7.dex */
public interface ISmartBackRefreshService extends ISubService {
    public static final String SERVICE_NAME = "ISearchBackSmartRefreshService";

    boolean enableBaseRefresh();

    boolean enableIpvBackRefresh();

    boolean enableNormalBackRefresh();

    boolean enableOutLinkBackRefresh();

    boolean enableSearchBackRefresh();

    boolean enableSearchClickCheck();

    String getFirstCompletelyVisibleBizCode();

    boolean isBackgroundToFront();

    boolean isCurrentRefreshByOutLink();

    boolean isDirectClickInInfoFlow();

    boolean isDirectClickInInfoFlowForCommon();

    void resetCommonStatus();

    void resetStatus();

    void setDirectClickInInfoFlow(boolean z);

    void setRequestWithBxFeature(boolean z);
}
