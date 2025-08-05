package com.alibaba.alibity.container.broadcast;

import com.alipay.mobile.intelligentdecision.model.IDecisionResult;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.collections.p;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0003\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\tJ\u0006\u0010\u0012\u001a\u00020\u0010J(\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0010\u0010\u0016\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0017J\u0016\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0007J\u001e\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000RB\u0010\u0005\u001a(\u0012\u0004\u0012\u00020\u0007\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0006j\u0002`\n0\u0006j\u0002`\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/alibaba/alibity/container/broadcast/MessageChannel;", "", "()V", IDecisionResult.STATE_CLOSED, "Ljava/util/concurrent/atomic/AtomicBoolean;", "mCallbacks", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/alibaba/alibity/container/broadcast/MessageCallback;", "Lcom/alibaba/alibity/container/broadcast/EventCallbacks;", "Lcom/alibaba/alibity/container/broadcast/BizIdCallbacks;", "getMCallbacks$annotations", "getMCallbacks", "()Ljava/util/concurrent/ConcurrentHashMap;", "addEventListener", "", "callback", "close", "dispatchEvent", "bizId", "eventName", "detail", "", "removeEventListener", "Companion", "megability-kit-container-android_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    private static final CopyOnWriteArrayList<b> c = new CopyOnWriteArrayList<>();

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentHashMap<String, ConcurrentHashMap<String, CopyOnWriteArrayList<com.alibaba.alibity.container.broadcast.a>>> f1998a = new ConcurrentHashMap<>();
    private AtomicBoolean b = new AtomicBoolean(false);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/alibaba/alibity/container/broadcast/MessageChannel$Companion;", "", "()V", "kMethodChannelList", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/alibaba/alibity/container/broadcast/MessageChannel;", "getKMethodChannelList", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "megability-kit-container-android_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(o oVar) {
            this();
        }
    }

    public b() {
        c.add(this);
    }

    public final void a(com.alibaba.alibity.container.broadcast.a callback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91648ada", new Object[]{this, callback});
            return;
        }
        q.d(callback, "callback");
        if (this.b.get()) {
            return;
        }
        ConcurrentHashMap<String, CopyOnWriteArrayList<com.alibaba.alibity.container.broadcast.a>> concurrentHashMap = this.f1998a.get(callback.a());
        if (concurrentHashMap == null) {
            concurrentHashMap = new ConcurrentHashMap<>();
            this.f1998a.put(callback.a(), concurrentHashMap);
        }
        CopyOnWriteArrayList<com.alibaba.alibity.container.broadcast.a> copyOnWriteArrayList = concurrentHashMap.get(callback.b());
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            concurrentHashMap.put(callback.b(), copyOnWriteArrayList);
        }
        copyOnWriteArrayList.add(callback);
    }

    public final void a(String bizId, String eventName, Map<?, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84162689", new Object[]{this, bizId, eventName, map});
            return;
        }
        q.d(bizId, "bizId");
        q.d(eventName, "eventName");
        if (this.b.get()) {
            return;
        }
        for (b bVar : c) {
            ConcurrentHashMap<String, CopyOnWriteArrayList<com.alibaba.alibity.container.broadcast.a>> concurrentHashMap = bVar.f1998a.get(bizId);
            CopyOnWriteArrayList<com.alibaba.alibity.container.broadcast.a> copyOnWriteArrayList = concurrentHashMap != null ? concurrentHashMap.get(eventName) : null;
            if (copyOnWriteArrayList != null) {
                int i = 0;
                for (Object obj : copyOnWriteArrayList) {
                    int i2 = i + 1;
                    if (i < 0) {
                        p.b();
                    }
                    com.alibaba.alibity.container.broadcast.a aVar = (com.alibaba.alibity.container.broadcast.a) obj;
                    if (aVar.c()) {
                        copyOnWriteArrayList.remove(aVar);
                    }
                    aVar.a(map);
                    i = i2;
                }
            }
        }
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!this.b.compareAndSet(false, true)) {
        } else {
            this.f1998a.clear();
            c.remove(this);
        }
    }

    public final void a(String bizId, String eventName) {
        ConcurrentHashMap<String, CopyOnWriteArrayList<com.alibaba.alibity.container.broadcast.a>> concurrentHashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, bizId, eventName});
            return;
        }
        q.d(bizId, "bizId");
        q.d(eventName, "eventName");
        if (this.b.get() || (concurrentHashMap = this.f1998a.get(bizId)) == null) {
            return;
        }
        concurrentHashMap.remove(eventName);
    }

    public final void a(String bizId, String eventName, com.alibaba.alibity.container.broadcast.a callback) {
        ConcurrentHashMap<String, CopyOnWriteArrayList<com.alibaba.alibity.container.broadcast.a>> concurrentHashMap;
        CopyOnWriteArrayList<com.alibaba.alibity.container.broadcast.a> copyOnWriteArrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20c70546", new Object[]{this, bizId, eventName, callback});
            return;
        }
        q.d(bizId, "bizId");
        q.d(eventName, "eventName");
        q.d(callback, "callback");
        if (this.b.get() || (concurrentHashMap = this.f1998a.get(bizId)) == null || (copyOnWriteArrayList = concurrentHashMap.get(eventName)) == null) {
            return;
        }
        copyOnWriteArrayList.remove(callback);
    }
}
