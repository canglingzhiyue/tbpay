package com.taobao.tao.topmultitab.protocol;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.taobao.android.tbtheme.kit.ThemeData;
import com.taobao.infoflow.protocol.subservice.biz.IPopViewService;
import com.taobao.location.common.TBLocationDTO;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;
import tb.llg;
import tb.tmv;

/* loaded from: classes.dex */
public interface IHomeSubTabController {

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes8.dex */
    public @interface RefreshState {
    }

    /* loaded from: classes.dex */
    public interface a {
        void a(String str);
    }

    void addPopMessageListenerByMain(IPopViewService.a aVar);

    View createView(Context context);

    String getCurrentSubContainerType();

    Map<String, String> getRequestUpstreamBizParam(String str);

    int getSubContainerScrollY();

    String getSubPageName();

    JSONObject getSubTabData();

    llg getSubTabParams();

    JSONObject getSubTabSearchBarData();

    JSONObject getSubTabSearchBoxData();

    String getTabBarButtonShowState();

    int getTabLayoutType();

    Map<String, String> getUpdateNextPageProperties();

    String getUpdatePageName();

    Map<String, String> getUpdatePageProperties();

    String getUpdatePageUtParam();

    View getViewBySectionBizCodeAndItemBizCode(String str, String str2);

    boolean isAllowProcessPageBack();

    boolean isEnablePullReFresh();

    boolean isEnableToSecondFloor();

    boolean isHandleUpAndDownScrollingEvent();

    boolean isOnRocketState();

    boolean isReachTop();

    void locationChange(TBLocationDTO tBLocationDTO);

    void notifyOutLinkParams(Intent intent, String str);

    void notifyRefreshPage();

    void onActivityResult(int i, int i2, Intent intent);

    void onAppToBackground();

    void onAppToFront();

    void onClickRocket();

    void onColdStartResume();

    void onCreate();

    void onCustomGlobalThemeChanged(String str, ThemeData themeData, boolean z);

    void onDestroy();

    void onEnterPullSecondFloor();

    void onExitPullSecondFloor();

    void onFestivalRefresh();

    void onFirstFrameVisible();

    void onPageScrolled(float f, int i);

    void onPageSelected();

    void onPageUnSelected();

    void onPause();

    void onPullDistance(int i);

    void onPullRefresh();

    void onRefreshStateChanged(String str, String str2);

    void onResume();

    void onStart();

    void onStop();

    void onTabClicked();

    void onWillExit();

    void passThroughData(tmv tmvVar, String str, String str2);

    View preCreateView(Context context);

    void removePopMessageListenerByMain(IPopViewService.a aVar);

    boolean scrollToPositionWithOffset(int i, int i2);

    void selectTabByTabId(String str);

    void setSubPageChangeListener(a aVar);

    boolean smoothScrollToPositionFromInfoFlow(int i);

    void syncGreyStatus(boolean z);

    void triggerPopRemoveByMain(String str);

    void triggerPopShowByMain(int i, JSONObject jSONObject);
}
