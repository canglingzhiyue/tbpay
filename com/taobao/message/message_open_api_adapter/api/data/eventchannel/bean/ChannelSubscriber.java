package com.taobao.message.message_open_api_adapter.api.data.eventchannel.bean;

import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.kit.core.IObserver;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005¢\u0006\u0002\u0010\bJ\u0016\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\b\u0010\u0002\u001a\u00020\u0003H\u0016R\u001d\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/taobao/message/message_open_api_adapter/api/data/eventchannel/bean/ChannelSubscriber;", "Lcom/taobao/message/message_open_api_adapter/api/data/eventchannel/bean/IChannelSubscriber;", "topic", "", "observer", "Lcom/taobao/message/kit/core/IObserver;", "", "Lcom/taobao/message/message_open_api_adapter/api/data/eventchannel/bean/ChannelEvent;", "(Ljava/lang/String;Lcom/taobao/message/kit/core/IObserver;)V", "getObserver", "()Lcom/taobao/message/kit/core/IObserver;", "getTopic", "()Ljava/lang/String;", MspFlybirdDefine.FLYBIRD_FRAME_EVENT_TYPE.ON_EVENT, "", "events", "message_base_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class ChannelSubscriber implements IChannelSubscriber {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final IObserver<List<ChannelEvent>> observer;
    private final String topic;

    static {
        kge.a(1527371689);
        kge.a(698965572);
    }

    public ChannelSubscriber(String topic, IObserver<List<ChannelEvent>> observer) {
        q.c(topic, "topic");
        q.c(observer, "observer");
        this.topic = topic;
        this.observer = observer;
    }

    public final IObserver<List<ChannelEvent>> getObserver() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IObserver) ipChange.ipc$dispatch("4683f901", new Object[]{this}) : this.observer;
    }

    public final String getTopic() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("f2a1d120", new Object[]{this}) : this.topic;
    }

    @Override // com.taobao.message.message_open_api_adapter.api.data.eventchannel.bean.IChannelSubscriber
    public String topic() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9373c52a", new Object[]{this}) : this.topic;
    }

    @Override // com.taobao.message.message_open_api_adapter.api.data.eventchannel.bean.IChannelSubscriber
    public void onEvent(List<ChannelEvent> events) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38ab9ff3", new Object[]{this, events});
            return;
        }
        q.c(events, "events");
        this.observer.onNext(events);
    }
}
