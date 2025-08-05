package com.taobao.message.sp.framework.model;

import com.taobao.message.datasdk.facade.model.ResultData;
import java.io.Serializable;
import java.util.List;
import tb.kge;

/* loaded from: classes7.dex */
public class SimpleMessageListData implements Serializable {
    public static final String KEY_REASONS = "reasons";
    public static final String REASON_ARRIVE = "messageArrive";
    public static final String REASON_SEND = "messageSend";
    public static final String SOURCE_NAME_MESSAGE = "messageSource";
    public int changeType;
    public boolean forward = true;
    public List<ResultData<SimpleMessage>> list;
    public boolean newHasMore;
    public boolean oldHasMore;
    public String reason;

    static {
        kge.a(-1715075473);
        kge.a(1028243835);
    }
}
