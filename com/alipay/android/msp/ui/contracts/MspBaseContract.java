package com.alipay.android.msp.ui.contracts;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.frame.MspWindowFrame;
import com.alipay.android.msp.framework.exception.AppErrorException;
import com.alipay.android.msp.ui.base.OnResultReceived;
import com.alipay.android.msp.ui.widget.MspDialogButton;
import com.alipay.android.msp.ui.widget.dialog.FlybirdDialogEventDesc;
import java.util.List;

/* loaded from: classes3.dex */
public interface MspBaseContract {

    /* loaded from: classes3.dex */
    public interface IPresenter<T extends IView> {
        void attachIView(IView iView);

        void detachIView();

        void disposeUI();

        void exit();

        Activity getActivity();

        int getBizId();

        /* renamed from: getIView */
        T mo545getIView();

        boolean isViewAttached();

        void onException(Throwable th) throws AppErrorException;

        void onViewLoaded(MspContext mspContext);

        void setOnOutJumpResumeCallback(OnResultReceived onResultReceived);
    }

    /* loaded from: classes3.dex */
    public interface IView {
        void addMaskView();

        void disposeActivity();

        View getCurrentView();

        void openActivity(Intent intent, OnResultReceived onResultReceived);

        boolean openUrl(String str, OnResultReceived onResultReceived);

        void removeMaskView();

        void showContentView(View view, int i, MspWindowFrame mspWindowFrame);

        void showCusLoadingView(String str);

        void showCustomOptDialog(String str, String str2, List<FlybirdDialogEventDesc> list);

        void showDialogView(String str, String str2, List<MspDialogButton> list);

        void showLoadingView(String... strArr);

        void showToastView(String str, String str2, long j);

        void stopCusLoadingView();

        void stopLoadingView();
    }
}
