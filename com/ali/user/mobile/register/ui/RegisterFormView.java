package com.ali.user.mobile.register.ui;

import com.ali.user.mobile.base.BaseView;
import com.ali.user.mobile.data.model.SmsApplyResult;

/* loaded from: classes2.dex */
public interface RegisterFormView extends BaseView {
    String getRegType();

    void onSendSMSSuccess(long j, SmsApplyResult smsApplyResult);
}
