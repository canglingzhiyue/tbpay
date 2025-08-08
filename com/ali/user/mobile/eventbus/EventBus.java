package com.ali.user.mobile.eventbus;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.log.LoginTLogAdapter;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.kge;

/* loaded from: classes2.dex */
public class EventBus {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final EventBus INSTANCE;
    private final ConcurrentHashMap<String, List<EventListener>> eventListeners = new ConcurrentHashMap<>();
    private final Map<String, Event> persistentEvents = Collections.synchronizedMap(new LinkedHashMap());

    static {
        kge.a(488730567);
        INSTANCE = new EventBus();
    }

    public static EventBus getDefault() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (EventBus) ipChange.ipc$dispatch("98921c5c", new Object[0]) : INSTANCE;
    }

    public void sendEvent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acc10103", new Object[]{this, str});
        } else {
            sendEvent(str, null);
        }
    }

    public void sendEvent(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88045422", new Object[]{this, str, map});
        } else if (StringUtils.isEmpty(str)) {
        } else {
            sendEvent(Event.newEvent(str, map));
        }
    }

    private void sendEvent(Event event) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("754f838f", new Object[]{this, event});
            return;
        }
        List<EventListener> list = this.eventListeners.get(event.name);
        if (list == null || list.size() == 0) {
            this.persistentEvents.put(event.name, event);
            return;
        }
        for (EventListener eventListener : list) {
            try {
                eventListener.onEvent(event);
            } catch (Throwable th) {
                LoginTLogAdapter.e("eventBus", "fail to execute the event " + event.name + " the error message is " + th.getMessage(), th);
            }
        }
    }

    public void registerEventListener(String str, EventListener eventListener) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52e78b1e", new Object[]{this, str, eventListener});
            return;
        }
        boolean z2 = str == null;
        if (eventListener != null) {
            z = false;
        }
        if (z2 || z) {
            return;
        }
        List<EventListener> list = this.eventListeners.get(str);
        if (list == null) {
            this.eventListeners.putIfAbsent(str, new CopyOnWriteArrayList());
            list = this.eventListeners.get(str);
        }
        list.add(eventListener);
        if (this.persistentEvents.get(str) == null) {
            return;
        }
        sendEvent(str);
    }

    public void unregisterEventListener(String str, EventListener eventListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16986865", new Object[]{this, str, eventListener});
            return;
        }
        List<EventListener> list = this.eventListeners.get(str);
        if (list == null) {
            return;
        }
        list.remove(eventListener);
    }
}
