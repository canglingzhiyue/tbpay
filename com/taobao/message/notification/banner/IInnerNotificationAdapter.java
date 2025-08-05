package com.taobao.message.notification.banner;

import android.view.View;

/* loaded from: classes7.dex */
public interface IInnerNotificationAdapter {
    int getDelayTime();

    InnerPushVO getVO();

    View getView();

    boolean needShow();

    void onClick(View view);

    void onDismiss();

    void onDismissActive();

    void onError(int i);

    void onShow();

    void updateVO(InnerPushVO innerPushVO);
}
