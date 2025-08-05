package com.alibaba.poplayer.norm;

/* loaded from: classes.dex */
public interface IModuleSwitchAdapter {
    float getBigScreenAspectRatio();

    int getFetchOnPageSwitchTimes();

    boolean interruptDownAction();

    boolean isCleanKeepDirectlyEnable();

    boolean isConfigFetchLocalEnable();

    boolean isConfigFetchOptEnable();

    boolean isFatigueFilterEnable();

    boolean isInterceptHover();

    boolean isNewNativeEventNotificationEnable();

    boolean isOpenImmersiveByDefault();

    boolean isPreDealTriggerEnable();

    boolean isRecordBucketId();

    boolean isRequestingFilterEnable();

    boolean isUseNewActionLine();

    boolean removeConfigUpdateNotify();

    boolean usePopReadyApi();
}
