package com.alipay.android.msp.framework.hardwarepay.neo.dialog;

import android.app.Activity;
import android.app.Dialog;
import com.alipay.android.msp.framework.hardwarepay.base.IDialogActionListener;

/* loaded from: classes3.dex */
public interface IHardwarePayDialog {
    void dismiss(int i);

    boolean isShown();

    boolean isValidateOk();

    void setAllButtonsGone();

    void setValidateResult(boolean z);

    void showAnimation();

    Dialog showDialog(Activity activity, int i, String str, IDialogActionListener iDialogActionListener);

    void showDialog(Activity activity, String str, IDialogActionListener iDialogActionListener);

    void showLoadingSuccess();

    void updateMsg(String str, int i, int i2);
}
