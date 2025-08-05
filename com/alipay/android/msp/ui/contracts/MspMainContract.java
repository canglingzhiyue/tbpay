package com.alipay.android.msp.ui.contracts;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.core.frame.MspWindowFrame;
import com.alipay.android.msp.ui.base.NavBarClickAction;
import com.alipay.android.msp.ui.birdnest.plugin.NavBarPlugin;
import com.alipay.android.msp.ui.contracts.MspBaseContract;

/* loaded from: classes3.dex */
public interface MspMainContract {

    /* loaded from: classes3.dex */
    public interface Presenter extends MspBaseContract.IPresenter<View> {
    }

    /* loaded from: classes3.dex */
    public interface View extends MspBaseContract.IView {
        void addViewToMainLayout(android.view.View view, MspWindowFrame mspWindowFrame, int i);

        void dismissDefaultLoading();

        @Override // com.alipay.android.msp.ui.contracts.MspBaseContract.IView
        void disposeActivity();

        int getBizId();

        android.view.View getCurFlybirdView();

        String getCurTplId();

        void preloadAdWebView(JSONArray jSONArray, int i);

        void showAdWebView(String str, String str2, String str3);

        void showDefaultLoading(String... strArr);

        void showH5WebView(JSONObject jSONObject);

        void showNavButton(String str, NavBarClickAction navBarClickAction, String str2, NavBarClickAction navBarClickAction2, String str3, NavBarPlugin.OnNavBarShownListener onNavBarShownListener);

        void showUserInfo();

        void stopDefaultLoadingCountDown();
    }
}
