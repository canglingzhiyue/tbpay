package com.taobao.message.notification.system.base;

/* loaded from: classes7.dex */
public interface IOldAgooNotification {
    int getMergeType();

    String getMessageId();

    void performNotify();

    void setContent(String str);

    void setTitle(String str);

    void setUrl(String str);
}
