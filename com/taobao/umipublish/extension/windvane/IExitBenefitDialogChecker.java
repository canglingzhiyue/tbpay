package com.taobao.umipublish.extension.windvane;

import android.content.Context;
import com.taobao.android.litecreator.service.ServiceImpl;

@ServiceImpl("com.taobao.android.litecreator.service.impl.ExitBenefitDialogChecker")
/* loaded from: classes9.dex */
public interface IExitBenefitDialogChecker {

    /* loaded from: classes9.dex */
    public interface OnClickResult {
        void a();
    }

    boolean checkIsLCRecordPage(Context context);

    boolean checkNeedShow(Context context, String str, OnClickResult onClickResult);

    void stateUtTabQuit(String str);
}
