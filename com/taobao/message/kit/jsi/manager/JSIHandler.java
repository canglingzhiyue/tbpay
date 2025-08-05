package com.taobao.message.kit.jsi.manager;

import android.os.Handler;
import android.os.HandlerThread;
import com.alibaba.jsi.standard.d;
import com.alibaba.jsi.standard.js.i;
import com.alibaba.jsi.standard.js.w;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\tJ\u000e\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\rJ\u0006\u0010\u0014\u001a\u00020\u0004J8\u0010\u0015\u001a4\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0006j\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\u000b`\nR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R@\u0010\u0005\u001a4\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0006j\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\u000b`\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/taobao/message/kit/jsi/manager/JSIHandler;", "", "()V", "mJSHandler", "Landroid/os/Handler;", "recycleCache", "Ljava/util/HashMap;", "", "Ljava/util/HashSet;", "Lcom/alibaba/jsi/standard/js/JSValue;", "Lkotlin/collections/HashMap;", "Lkotlin/collections/HashSet;", "addRecycleValue", "", "jsiId", "jsValue", "checkException", "jsCtx", "Lcom/alibaba/jsi/standard/JSContext;", "checkInitHandler", "getHandler", "getRecyclerCache", "message_base_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class JSIHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final JSIHandler INSTANCE;
    private static Handler mJSHandler;
    private static final HashMap<Long, HashSet<w>> recycleCache;

    static {
        kge.a(-1856504657);
        INSTANCE = new JSIHandler();
        recycleCache = new HashMap<>(8);
    }

    private JSIHandler() {
    }

    public static final /* synthetic */ HashMap access$getRecycleCache$p(JSIHandler jSIHandler) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("25e1c55d", new Object[]{jSIHandler}) : recycleCache;
    }

    public final HashMap<Long, HashSet<w>> getRecyclerCache() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (HashMap) ipChange.ipc$dispatch("b0e56937", new Object[]{this}) : recycleCache;
    }

    public final void checkException(d jsCtx) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a2950fb", new Object[]{this, jsCtx});
            return;
        }
        q.c(jsCtx, "jsCtx");
        if (!jsCtx.i()) {
            return;
        }
        i j = jsCtx.j();
        if (j != null) {
            j.a();
            TLog.loge("JSIHandler", "excuteJS exception: " + ((((("name: " + j.b(jsCtx)) + "\nmessage: ") + j.c(jsCtx)) + "\nstack: ") + j.d(jsCtx)));
            return;
        }
        TLog.loge("JSIHandler", "excuteJS success");
    }

    public final void addRecycleValue(final long j, final w jsValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2e3e10", new Object[]{this, new Long(j), jsValue});
            return;
        }
        q.c(jsValue, "jsValue");
        checkInitHandler();
        Handler handler = mJSHandler;
        if (handler == null) {
            return;
        }
        handler.post(new Runnable() { // from class: com.taobao.message.kit.jsi.manager.JSIHandler$addRecycleValue$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                synchronized (JSIHandler.access$getRecycleCache$p(JSIHandler.INSTANCE)) {
                    if (JSIHandler.access$getRecycleCache$p(JSIHandler.INSTANCE).get(Long.valueOf(j)) == null) {
                        JSIHandler.access$getRecycleCache$p(JSIHandler.INSTANCE).put(Long.valueOf(j), new HashSet(16));
                    }
                    HashSet hashSet = (HashSet) JSIHandler.access$getRecycleCache$p(JSIHandler.INSTANCE).get(Long.valueOf(j));
                    if (hashSet != null) {
                        Boolean.valueOf(hashSet.add(jsValue));
                    }
                }
            }
        });
    }

    public final Handler getHandler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("e690ed4b", new Object[]{this});
        }
        checkInitHandler();
        Handler handler = mJSHandler;
        if (handler == null) {
            q.a();
        }
        return handler;
    }

    public final void checkInitHandler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e278c179", new Object[]{this});
        } else if (mJSHandler != null) {
        } else {
            HandlerThread handlerThread = new HandlerThread("JSI");
            handlerThread.start();
            mJSHandler = new Handler(handlerThread.getLooper());
        }
    }
}
