package com.taobao.message.message_open_api_adapter.api.data.eventchannel;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.message_open_api_adapter.api.data.eventchannel.bean.ChannelEvent;
import com.taobao.message.message_open_api_adapter.api.data.eventchannel.bean.IChannelSubscriber;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.collections.p;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0007J\u0016\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0007R*\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b0\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/taobao/message/message_open_api_adapter/api/data/eventchannel/ChannelEventManager;", "", "()V", "subscriberLists", "", "", "Ljava/util/ArrayList;", "Lcom/taobao/message/message_open_api_adapter/api/data/eventchannel/bean/IChannelSubscriber;", "Lkotlin/collections/ArrayList;", "addSubscriber", "", "subscriber", "postEvent", "topicName", "event", "Lcom/taobao/message/message_open_api_adapter/api/data/eventchannel/bean/ChannelEvent;", "removeSubscriber", "message_base_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class ChannelEventManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ChannelEventManager INSTANCE;
    private static final Map<String, ArrayList<IChannelSubscriber>> subscriberLists;

    static {
        kge.a(-777298247);
        INSTANCE = new ChannelEventManager();
        subscriberLists = new ConcurrentHashMap();
    }

    private ChannelEventManager() {
    }

    public final void addSubscriber(IChannelSubscriber subscriber) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3a0bfcd", new Object[]{this, subscriber});
            return;
        }
        q.c(subscriber, "subscriber");
        synchronized (subscriberLists) {
            String str = subscriber.topic();
            if (!subscriberLists.containsKey(str)) {
                subscriberLists.put(str, new ArrayList<>());
            }
            ArrayList<IChannelSubscriber> arrayList = subscriberLists.get(str);
            if (arrayList != null) {
                Boolean.valueOf(arrayList.add(subscriber));
            }
        }
    }

    public final void postEvent(String topicName, ChannelEvent event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9f7f3dd", new Object[]{this, topicName, event});
            return;
        }
        q.c(topicName, "topicName");
        q.c(event, "event");
        synchronized (subscriberLists) {
            for (Map.Entry<String, ArrayList<IChannelSubscriber>> entry : subscriberLists.entrySet()) {
                if (q.a((Object) entry.getKey(), (Object) topicName)) {
                    Iterator<IChannelSubscriber> it = entry.getValue().iterator();
                    while (it.hasNext()) {
                        it.next().onEvent(p.a(event));
                    }
                }
            }
            t tVar = t.INSTANCE;
        }
    }

    public final void removeSubscriber(IChannelSubscriber subscriber) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2b5d34a", new Object[]{this, subscriber});
            return;
        }
        q.c(subscriber, "subscriber");
        synchronized (subscriberLists) {
            String str = subscriber.topic();
            if (subscriberLists.containsKey(str)) {
                ArrayList<IChannelSubscriber> arrayList = subscriberLists.get(str);
                if (arrayList != null) {
                    arrayList.remove(subscriber);
                }
                ArrayList<IChannelSubscriber> arrayList2 = subscriberLists.get(str);
                if (arrayList2 == null) {
                    q.a();
                }
                if (arrayList2.isEmpty()) {
                    subscriberLists.remove(str);
                }
            }
            t tVar = t.INSTANCE;
        }
    }
}
