package com.alipay.mobile.verifyidentity.ui;

import android.content.DialogInterface;

/* loaded from: classes3.dex */
public interface ActivityResponsable {
    void alert(String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2);

    void alert(String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2, Boolean bool);

    void dismissProgressDialog();

    void showProgressDialog(String str);

    void showProgressDialog(String str, boolean z, DialogInterface.OnCancelListener onCancelListener);

    void showProgressDialog(String str, boolean z, DialogInterface.OnCancelListener onCancelListener, boolean z2);

    void toast(String str, int i);
}
