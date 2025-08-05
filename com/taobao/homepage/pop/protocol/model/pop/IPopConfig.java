package com.taobao.homepage.pop.protocol.model.pop;

import com.alibaba.fastjson.JSONObject;
import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

/* loaded from: classes7.dex */
public interface IPopConfig extends Serializable {

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface FatigueReportStyle {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface PopContentType {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface PopHierarchyType {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface PopPointYType {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface PopTriggerType {
    }

    boolean enablePopControl();

    JSONObject getBizParams();

    List<String> getDeltaWhiteList();

    String getFatigueReportStyle();

    int getHierarchy();

    IPopPoint getPoint();

    int getPointY();

    int getPopContentType();

    String getPopHierarchyName();

    long getRefreshInterval();

    String getRequestType();

    String getScrollToSection();

    int getSelectMaxCount();

    int getSelectMinCount();

    int getShowMaxCount();

    long getShowTimeMills();

    int getTrigger();

    String getWeexUrl();

    boolean isForceUpdate();

    boolean isInterceptClick();

    boolean isPageSwitchHidden();

    boolean isPopLayerHidden();

    boolean isPopMessage();

    boolean isSideslipHidden();

    boolean isTabSwitchHidden();
}
