package com.alipay.android.msp.ui.contracts;

import android.app.Activity;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.ui.contracts.MspBaseContract;
import com.alipay.android.msp.ui.web.IWebViewWindow;

/* loaded from: classes3.dex */
public interface MspWebContract {

    /* loaded from: classes3.dex */
    public interface IPresenter<T extends IView> {
        void attachIView(IView iView);

        void detachIView();

        Activity getActivity();

        int getBizId();

        T getIView();

        /* renamed from: getJsWebViewWindow */
        IWebViewWindow mo546getJsWebViewWindow();

        boolean init(boolean z, String str, String str2, int i, String str3, JSONObject jSONObject, JSONObject jSONObject2);

        void initWebUI(String str, String str2, String str3);

        void notifyCaller();

        void onBack();

        void onDestroy();

        void pushWebviewWindow(String str, String str2);

        void setWebViewUA();
    }

    /* loaded from: classes3.dex */
    public interface IView extends MspBaseContract.IView {
        void addViewToMainLayout(View view);

        void initUI(IWebViewWindow iWebViewWindow);

        void removeViewFromMainLayout(View view);

        void setProgressVisibility(int i);

        void setTitleText(String str);
    }
}
