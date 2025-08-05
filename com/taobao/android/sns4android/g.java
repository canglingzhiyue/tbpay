package com.taobao.android.sns4android;

import android.app.Activity;
import com.ali.user.mobile.model.SNSSignInAccount;

/* loaded from: classes6.dex */
public interface g {
    void onCancel(Activity activity, String str, String str2);

    void onError(Activity activity, String str, int i, String str2, String str3);

    void onSucceed(Activity activity, SNSSignInAccount sNSSignInAccount);
}
