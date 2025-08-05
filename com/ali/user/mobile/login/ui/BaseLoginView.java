package com.ali.user.mobile.login.ui;

import android.app.Activity;
import android.content.DialogInterface;
import com.ali.user.mobile.base.BaseView;
import com.ali.user.mobile.rpc.HistoryAccount;

/* loaded from: classes2.dex */
public interface BaseLoginView extends BaseView {
    void alertList(String[] strArr, DialogInterface.OnClickListener onClickListener, boolean z);

    void dismissAlertDialog();

    Activity getBaseActivity();

    HistoryAccount getHistoryAccount();

    int getLoginSite();

    String getPageName();

    boolean isHistoryMode();

    void setLoginAccountInfo(String str);
}
