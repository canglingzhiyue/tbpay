package com.taobao.message.message_open_api_adapter.api.data.eventchannel.constant;

import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import kotlin.Metadata;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/taobao/message/message_open_api_adapter/api/data/eventchannel/constant/EventConstant;", "", "()V", "DATA", "", RPCDataItems.SWITCH_TAG_LOG, "TOPIC", "message_base_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class EventConstant {
    public static final String DATA = "data";
    public static final EventConstant INSTANCE;
    public static final String TAG = "api@channel";
    public static final String TOPIC = "topic";

    static {
        kge.a(225638320);
        INSTANCE = new EventConstant();
    }

    private EventConstant() {
    }
}
