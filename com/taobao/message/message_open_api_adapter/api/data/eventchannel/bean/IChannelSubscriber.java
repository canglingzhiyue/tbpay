package com.taobao.message.message_open_api_adapter.api.data.eventchannel.bean;

import com.alipay.android.msp.constants.MspFlybirdDefine;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\b\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/taobao/message/message_open_api_adapter/api/data/eventchannel/bean/IChannelSubscriber;", "", MspFlybirdDefine.FLYBIRD_FRAME_EVENT_TYPE.ON_EVENT, "", "event", "", "Lcom/taobao/message/message_open_api_adapter/api/data/eventchannel/bean/ChannelEvent;", "topic", "", "message_base_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public interface IChannelSubscriber {
    void onEvent(List<ChannelEvent> list);

    String topic();
}
