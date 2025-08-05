package com.taobao.themis.kernel.ability;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes9.dex */
public final class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final c INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    private static final ConcurrentHashMap<String, CopyOnWriteArrayList<a>> f22492a;

    /* loaded from: classes9.dex */
    public interface a {
        void a(String str, JSON json);
    }

    static {
        kge.a(373187774);
        INSTANCE = new c();
        f22492a = new ConcurrentHashMap<>();
    }

    private c() {
    }

    @JvmStatic
    public static final void a(String eventName, a listener) {
        CopyOnWriteArrayList<a> putIfAbsent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91d6c702", new Object[]{eventName, listener});
            return;
        }
        q.d(eventName, "eventName");
        q.d(listener, "listener");
        ConcurrentHashMap<String, CopyOnWriteArrayList<a>> concurrentHashMap = f22492a;
        CopyOnWriteArrayList<a> copyOnWriteArrayList = concurrentHashMap.get(eventName);
        if (copyOnWriteArrayList == null && (putIfAbsent = concurrentHashMap.putIfAbsent(eventName, (copyOnWriteArrayList = new CopyOnWriteArrayList<>()))) != null) {
            copyOnWriteArrayList = putIfAbsent;
        }
        copyOnWriteArrayList.add(listener);
    }

    @JvmStatic
    public static final void a(String eventName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{eventName});
            return;
        }
        q.d(eventName, "eventName");
        f22492a.remove(eventName);
    }

    @JvmStatic
    public static final void a(String eventName, JSON json) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8072587d", new Object[]{eventName, json});
            return;
        }
        q.d(eventName, "eventName");
        CopyOnWriteArrayList<a> copyOnWriteArrayList = f22492a.get(eventName);
        if (copyOnWriteArrayList == null) {
            return;
        }
        for (a aVar : copyOnWriteArrayList) {
            aVar.a(eventName, json);
        }
    }

    @JvmStatic
    public static final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[0]);
        } else {
            f22492a.clear();
        }
    }
}
