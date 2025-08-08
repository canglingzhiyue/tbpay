package com.alipay.mobile.beehive.eventbus;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes3.dex */
public class SubscribeFinder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final ConcurrentMap<Class<?>, Map<Object, Set<Method>>> f5350a = new ConcurrentHashMap();
    public static SubscribeFinder ANNOTATED = new SubscribeFinder();

    private synchronized void a(Class<?> cls, Map<Object, Set<Method>> map) {
        Method[] methods;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6fe4f10", new Object[]{this, cls, map});
            return;
        }
        for (Method method : cls.getMethods()) {
            if (!method.isBridge() && method.isAnnotationPresent(Subscribe.class)) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length > 1) {
                    throw new IllegalArgumentException("method:" + method + "@Subscribe方法参数不能超过1个");
                }
                Subscribe subscribe = (Subscribe) method.getAnnotation(Subscribe.class);
                if (StringUtils.isEmpty(subscribe.name())) {
                    if (parameterTypes.length <= 0) {
                        throw new IllegalArgumentException("method:" + method + "@Subscribe方法无参数的时候, 注解参数name不能为空");
                    }
                    Class<?> cls2 = parameterTypes[0];
                    if (cls2.isInterface()) {
                        throw new IllegalArgumentException("method:" + method + " @Subscribe第一个参数不能为接口类型");
                    }
                    str = cls2;
                    if ((method.getModifiers() & 1) == 0) {
                        if ((method.getModifiers() & 4) == 0) {
                            throw new IllegalArgumentException("method:" + method + " @Subscribe方法必须为public或protected");
                        }
                        str = cls2;
                    }
                } else {
                    str = subscribe.name();
                }
                Set<Method> set = map.get(str);
                if (set == null) {
                    set = new CopyOnWriteArraySet<>();
                    map.put(str, set);
                }
                set.add(method);
            }
        }
        f5350a.put(cls, map);
    }

    public synchronized Map<Object, Set<EventHandler>> findAllSubscribers(Object obj, SubscriberConfig subscriberConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2866c710", new Object[]{this, obj, subscriberConfig});
        }
        HashMap hashMap = new HashMap();
        Map<Object, Set<Method>> findSubscriberMethods = findSubscriberMethods(obj);
        if (!findSubscriberMethods.isEmpty()) {
            for (Map.Entry<Object, Set<Method>> entry : findSubscriberMethods.entrySet()) {
                CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
                for (Method method : entry.getValue()) {
                    Subscribe subscribe = (Subscribe) method.getAnnotation(Subscribe.class);
                    String threadMode = subscribe.threadMode();
                    if (StringUtils.isEmpty(threadMode)) {
                        threadMode = ThreadMode.CURRENT.name();
                    }
                    EventHandler eventHandler = new EventHandler(entry.getKey(), obj, method, ThreadMode.fromString(threadMode), subscriberConfig);
                    eventHandler.setWhiteListKey(subscribe.whiteListKey());
                    copyOnWriteArraySet.add(eventHandler);
                }
                hashMap.put(entry.getKey(), copyOnWriteArraySet);
            }
        }
        return hashMap;
    }

    public Map<Object, Set<Method>> findSubscriberMethods(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ee6dba89", new Object[]{this, obj});
        }
        Class<?> cls = obj.getClass();
        Map<Object, Set<Method>> map = f5350a.get(cls);
        if (map != null) {
            return map;
        }
        HashMap hashMap = new HashMap();
        a(cls, hashMap);
        return hashMap;
    }

    private SubscribeFinder() {
    }

    public void dispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
        } else {
            f5350a.clear();
        }
    }
}
