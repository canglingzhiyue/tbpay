package com.taobao.android.tbuprofen.plugin;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbuprofen.common.TBPEvent;
import com.taobao.android.tbuprofen.common.e;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.kge;

/* loaded from: classes6.dex */
public class PluginEventHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "PluginEventHandler";
    private final List<c> eventListeners = new CopyOnWriteArrayList();

    static {
        kge.a(-1733335898);
    }

    public void addEventListener(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b885e8d", new Object[]{this, cVar});
        } else if (cVar == null || this.eventListeners.contains(cVar)) {
        } else {
            this.eventListeners.add(cVar);
        }
    }

    public void removeListener(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a2c0ea2", new Object[]{this, cVar});
        } else if (cVar == null) {
        } else {
            this.eventListeners.remove(cVar);
        }
    }

    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
        } else {
            this.eventListeners.clear();
        }
    }

    public void onPluginEvent(final int i, final String str, final Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1cfb9ba", new Object[]{this, new Integer(i), str, obj});
            return;
        }
        try {
            if (this.eventListeners.isEmpty()) {
                return;
            }
            com.taobao.android.tbuprofen.log.c.e(TAG, String.format("onPluginEvent type=%d, ret=%s", Integer.valueOf(i), str), new Object[0]);
            if (i != TBPEvent.TBP_EVENT_CLASS_LOAD.getIndex() && i != TBPEvent.TBP_EVENT_CLASS_PREPARE.getIndex() && i != TBPEvent.TBP_EVENT_THREAD_START.getIndex() && i != TBPEvent.TBP_EVENT_THREAD_END.getIndex()) {
                e.a().a(new Runnable() { // from class: com.taobao.android.tbuprofen.plugin.-$$Lambda$PluginEventHandler$lIU-ViPtywYsBapr9gPlsVhSxEI
                    {
                        PluginEventHandler.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        PluginEventHandler.this.lambda$onPluginEvent$0$PluginEventHandler(i, str, obj);
                    }
                });
            }
        } catch (Exception e) {
            com.taobao.android.tbuprofen.log.c.a(TAG, e, "Exception onPluginEvent", new Object[0]);
        }
    }

    public /* synthetic */ void lambda$onPluginEvent$0$PluginEventHandler(int i, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96eb1eeb", new Object[]{this, new Integer(i), str, obj});
        } else {
            handleEvent(i, str, obj);
        }
    }

    public void handleEvent(int i, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d3f370", new Object[]{this, new Integer(i), str, obj});
            return;
        }
        com.taobao.android.tbuprofen.log.c.e(TAG, "handle event: %d, ret: %s", Integer.valueOf(i), str);
        if (i == TBPEvent.TBP_EVENT_CLASS_PREPARE.getIndex()) {
            onClassPrepare(str);
        } else if (i == PluginEvent.CUSTOM_EVENT_BIG_MEM_ALLOC.getIndex()) {
            onObjectAlloc(str, obj);
        } else if (i == TBPEvent.TBP_EVENT_EXCEPTION_CATCH.getIndex()) {
            onExceptionCatch(str, obj);
        } else if (i == PluginEvent.CUSTOM_EVENT_MAIN_THREAD_LONG_BLOCK.getIndex()) {
            onMainThreadLongWait(str, obj);
        } else {
            com.taobao.android.tbuprofen.log.c.b(TAG, "Unsupported event: " + i, new Object[0]);
        }
    }

    private static String[] getInfo(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("fe3ee93d", new Object[]{str, new Integer(i)});
        }
        String[] split = str.split("::", i);
        if (split.length == i) {
            return split;
        }
        return null;
    }

    private void onClassPrepare(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8d2e3ff", new Object[]{this, str});
            return;
        }
        for (c cVar : this.eventListeners) {
            cVar.a(str);
        }
    }

    private void onObjectAlloc(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ebaed04", new Object[]{this, str, obj});
            return;
        }
        String[] info = getInfo(str, 4);
        if (info == null) {
            return;
        }
        long j = -1;
        try {
            j = Long.parseLong(info[3]);
        } catch (Exception unused) {
        }
        StackTraceElement[] stackTraceElementArr = obj instanceof StackTraceElement[] ? (StackTraceElement[]) obj : null;
        for (c cVar : this.eventListeners) {
            cVar.a(info[0], info[1], info[2], j, stackTraceElementArr);
        }
    }

    private void onMainThreadLongWait(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("305739c0", new Object[]{this, str, obj});
            return;
        }
        String[] info = getInfo(str, 3);
        if (info == null) {
            return;
        }
        int i = -1;
        try {
            i = Integer.parseInt(info[1]);
        } catch (Exception unused) {
        }
        StackTraceElement[] stackTraceElementArr = null;
        if (obj instanceof StackTraceElement[]) {
            stackTraceElementArr = (StackTraceElement[]) obj;
        }
        for (c cVar : this.eventListeners) {
            cVar.a(info[0], i, stackTraceElementArr, info[2]);
        }
    }

    private void onExceptionCatch(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35e9b098", new Object[]{this, str, obj});
        } else if (obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            StackTraceElement[] stackTrace = th.getStackTrace();
            StackTraceElement stackTraceElement = null;
            if (stackTrace.length > 0) {
                stackTraceElement = stackTrace[0];
            }
            for (c cVar : this.eventListeners) {
                cVar.a(th, stackTraceElement, str);
            }
        }
    }
}
