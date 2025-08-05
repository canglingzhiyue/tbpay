package com.taobao.message.notification.banner.dx;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.h;
import com.taobao.tao.log.TLog;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0001J3\u0010\u000b\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0010\u0010\u000e\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0010\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0002\u0010\u0013J\u000e\u0010\u0014\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005R*\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001`\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/taobao/message/notification/banner/dx/TapEventHandlerProxy;", "Lcom/taobao/android/dinamicx/DXAbsEventHandler;", "()V", "mDXEventHandlers", "Ljava/util/LinkedHashMap;", "", "Lkotlin/collections/LinkedHashMap;", "addHandler", "", "id", "handler", "handleEvent", "event", "Lcom/taobao/android/dinamicx/expression/event/DXEvent;", "args", "", "", "runtimeContext", "Lcom/taobao/android/dinamicx/DXRuntimeContext;", "(Lcom/taobao/android/dinamicx/expression/event/DXEvent;[Ljava/lang/Object;Lcom/taobao/android/dinamicx/DXRuntimeContext;)V", "removeHandler", "notification_sdk_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class TapEventHandlerProxy extends h {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final TapEventHandlerProxy INSTANCE;
    private static LinkedHashMap<String, h> mDXEventHandlers;

    static {
        kge.a(1642682108);
        INSTANCE = new TapEventHandlerProxy();
        mDXEventHandlers = new LinkedHashMap<>();
    }

    private TapEventHandlerProxy() {
    }

    @Override // com.taobao.android.dinamicx.h, com.taobao.android.dinamicx.bn
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (mDXEventHandlers.size() > 0) {
            Set<Map.Entry<String, h>> entrySet = mDXEventHandlers.entrySet();
            q.a((Object) entrySet, "mDXEventHandlers.entries");
            Iterator<T> it = entrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                (entry != null ? (h) entry.getValue() : null).handleEvent(dXEvent, objArr, dXRuntimeContext);
            }
        } else {
            TLog.loge(DynamicSimpleComponent.TAG, "handlers size == 0");
        }
    }

    public final void addHandler(String id, h handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d619e72", new Object[]{this, id, handler});
            return;
        }
        q.c(id, "id");
        q.c(handler, "handler");
        mDXEventHandlers.put(id, handler);
    }

    public final void removeHandler(String id) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc959437", new Object[]{this, id});
            return;
        }
        q.c(id, "id");
        mDXEventHandlers.remove(id);
    }
}
