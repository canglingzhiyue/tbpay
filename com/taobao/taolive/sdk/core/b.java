package com.taobao.taolive.sdk.core;

import com.taobao.taolive.sdk.model.message.ChatMessage;
import com.taobao.taolive.sdk.model.message.MessageTypeFilter;
import com.taobao.taolive.sdk.model.message.TLiveMsg;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public interface b {
    public static final int STATUS_ANCHOR_BACK = 4;
    public static final int STATUS_ANCHOR_END = 5;
    public static final int STATUS_ANCHOR_LEAVE = 3;
    public static final int STATUS_ENTER_UT_TRACK = 11;
    public static final int STATUS_FANDOM_INIT_FAIL = 10;
    public static final int STATUS_FANDOM_INIT_SUCCESS = 9;
    public static final int STATUS_HEADER_FIELD = 8;
    public static final int STATUS_IDLE = -1;
    public static final int STATUS_INIT = 0;
    public static final int STATUS_INIT_FAIL = 2;
    public static final int STATUS_INIT_SUCCESS = 1;
    public static final int STATUS_PARSE_DATA_START = 7;
    public static final int STATUS_TBTV_CHANGED = 6;

    void addItemUUid(String str);

    void addPowerMessageInterceptor(d dVar);

    void dispatchUserPowerMessage(TLiveMsg tLiveMsg);

    ArrayList<ChatMessage> getMessagesFromPool(long j, int i);

    void pauseGetNewMessage();

    void registerMessageListener(c cVar, MessageTypeFilter messageTypeFilter);

    void resumeGetNewMessage();

    void startGetNewMessage();

    void stopGetNewMessage();

    void unRegisterMessageListener(c cVar);
}
