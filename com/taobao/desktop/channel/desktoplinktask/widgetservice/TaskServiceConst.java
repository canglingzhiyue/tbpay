package com.taobao.desktop.channel.desktoplinktask.widgetservice;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.kge;

/* loaded from: classes7.dex */
public class TaskServiceConst {
    public static final int REPLY_MSG_CLOSE = 3;
    public static final int REPLY_MSG_QUERY_RESULT = 4;
    public static final int REPLY_MSG_TRIGGER_FAIL = 2;
    public static final int REPLY_MSG_TRIGGER_SUCCESS = 1;
    public static final int WINDOW_STATUS_OFF = 0;
    public static final int WINDOW_STATUS_ON = 1;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface ReplyMessageType {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface WindowStatus {
    }

    static {
        kge.a(-1801910505);
    }
}
