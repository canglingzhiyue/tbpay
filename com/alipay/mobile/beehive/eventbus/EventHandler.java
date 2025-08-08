package com.alipay.mobile.beehive.eventbus;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import tb.riy;

/* loaded from: classes3.dex */
public class EventHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Object f5349a;
    private final Object b;
    private final Method c;
    private ThreadMode d;
    private SubscriberConfig e;
    private String f;
    private final int g;

    public EventHandler(Object obj, Object obj2, Method method, ThreadMode threadMode, SubscriberConfig subscriberConfig) {
        if (obj2 != null) {
            if (method == null) {
                throw new IllegalArgumentException("EventHandler method cannot be null");
            }
            this.b = obj;
            this.e = subscriberConfig;
            if (isWeakRef()) {
                this.f5349a = new WeakReference(obj2);
            } else {
                this.f5349a = obj2;
            }
            this.c = method;
            method.setAccessible(true);
            this.d = threadMode;
            this.g = ((method.hashCode() + 31) * 31) + obj2.hashCode();
            return;
        }
        throw new IllegalArgumentException("EventHandler subscriber cannot be null");
    }

    public Object getEventKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("3e648590", new Object[]{this}) : this.b;
    }

    public ThreadMode getThreadMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ThreadMode) ipChange.ipc$dispatch("32e1b18", new Object[]{this}) : this.d;
    }

    public String toString() {
        String obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        if (isWeakRef()) {
            obj = this.f5349a.toString() + "->" + getRealSubscriber();
        } else {
            obj = this.f5349a.toString();
        }
        return "EventHandler(key=" + this.b + ",subscriber=" + obj + ",method=" + this.c.getName() + riy.BRACKET_END_STR;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue() : this.g;
    }

    public String getWhiteListKey() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("72d818cb", new Object[]{this}) : this.f;
    }

    public void setWhiteListKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78c9750b", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    public Object getSubscriber() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("a7d0d3ed", new Object[]{this}) : this.f5349a;
    }

    public Object getRealSubscriber() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("7c36c96f", new Object[]{this});
        }
        if (isWeakRef() && a() != null) {
            return a().get();
        }
        return this.f5349a;
    }

    public boolean isZombie() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("69eb747b", new Object[]{this})).booleanValue() : isWeakRef() && a() != null && a().get() == null;
    }

    public boolean isWeakRef() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8014797c", new Object[]{this})).booleanValue();
        }
        SubscriberConfig subscriberConfig = this.e;
        return subscriberConfig != null && subscriberConfig.isWeakRef;
    }

    private WeakReference a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeakReference) ipChange.ipc$dispatch("989ead36", new Object[]{this});
        }
        if (!isWeakRef()) {
            return null;
        }
        Object obj = this.f5349a;
        if (!(obj instanceof WeakReference)) {
            return null;
        }
        return (WeakReference) obj;
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EventHandler eventHandler = (EventHandler) obj;
        return isWeakRef() == eventHandler.isWeakRef() && this.c.equals(eventHandler.c) && (getRealSubscriber() == eventHandler.getRealSubscriber() || isSameByUniqueId(eventHandler));
    }

    public boolean isSupportSticky() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8846ab19", new Object[]{this})).booleanValue();
        }
        SubscriberConfig subscriberConfig = this.e;
        return subscriberConfig != null && (subscriberConfig.supportSticky || this.e.supportPending);
    }

    public String getUniqueId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("206169f7", new Object[]{this});
        }
        SubscriberConfig subscriberConfig = this.e;
        return subscriberConfig != null ? subscriberConfig.uniqueId : "";
    }

    public boolean isSameByUniqueId(EventHandler eventHandler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6cd8d2e5", new Object[]{this, eventHandler})).booleanValue();
        }
        String uniqueId = getUniqueId();
        return !StringUtils.isEmpty(uniqueId) && StringUtils.equals(uniqueId, eventHandler.getUniqueId());
    }

    public void handleEvent(Object obj) throws InvocationTargetException {
        try {
            try {
                Class<?>[] parameterTypes = this.c.getParameterTypes();
                Object realSubscriber = getRealSubscriber();
                if (realSubscriber == null) {
                    return;
                }
                if (realSubscriber instanceof IEventSubscriber) {
                    this.c.invoke(realSubscriber, this.b, obj);
                } else if (parameterTypes.length == 1) {
                    this.c.invoke(realSubscriber, obj);
                } else if (parameterTypes.length != 0) {
                } else {
                    this.c.invoke(realSubscriber, new Object[0]);
                }
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof Error) {
                throw ((Error) e2.getCause());
            }
            throw e2;
        }
    }
}
