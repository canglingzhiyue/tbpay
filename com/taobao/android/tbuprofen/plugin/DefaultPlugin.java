package com.taobao.android.tbuprofen.plugin;

import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.taobao.zstd.d;
import com.taobao.android.tbuprofen.adapter.TBProfConfig;
import com.taobao.android.tbuprofen.common.TBPEvent;
import com.taobao.android.tbuprofen.e;
import com.taobao.android.tbuprofen.g;
import com.taobao.android.tbuprofen.mock.ARTUtil;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.kge;

/* loaded from: classes6.dex */
public class DefaultPlugin implements e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PLUGIN_LIB_NAME = "tbuprofen-plugin";
    public static final int TBP_VERBOSE_CLASS = 2;
    public static final int TBP_VERBOSE_GC = 1;
    public static final int TBP_VERBOSE_JNI = 4;
    public static final int TBP_VERBOSE_OTHER = 0;

    /* renamed from: a  reason: collision with root package name */
    private PluginEventHandler f15496a;
    private final g b;
    private final String c;
    private boolean d = false;
    private final AtomicBoolean e = new AtomicBoolean(false);

    static {
        kge.a(1422810225);
        kge.a(2012121763);
    }

    private native int forkDumpHeapInstanceNative(String str, long j, long j2, int i, String str2, int i2, int i3, long j3);

    private native int forkDumpHeapReferenceNative(String str, String str2, int i, int i2, long j);

    private native int setCallback(PluginEventHandler pluginEventHandler);

    public native void GC();

    @Override // com.taobao.android.tbuprofen.e
    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : PLUGIN_LIB_NAME;
    }

    public native long getAllocSize();

    public native long getGCCount();

    public native long getGCPauseTime();

    public native long getThreadCount();

    public native void setArgs(int i, boolean z, boolean z2);

    public native void setVerboseFlag(int i, boolean z);

    @Override // com.taobao.android.tbuprofen.e
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.c;
    }

    public DefaultPlugin(g gVar, String str) {
        this.b = gVar;
        this.c = str;
    }

    public boolean c() {
        g gVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        if (d.a() && (gVar = this.b) != null && gVar.a(this) && this.f15496a == null) {
            this.f15496a = new PluginEventHandler();
            if (setCallback(this.f15496a) == 0) {
                return true;
            }
        }
        return false;
    }

    public void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5473ff9", new Object[]{this, cVar});
            return;
        }
        PluginEventHandler pluginEventHandler = this.f15496a;
        if (pluginEventHandler == null || cVar == null) {
            return;
        }
        pluginEventHandler.addEventListener(cVar);
    }

    public void a(PluginCapacity pluginCapacity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2db1d2d", new Object[]{this, pluginCapacity, new Boolean(z)});
            return;
        }
        switch (pluginCapacity) {
            case FUN_BIG_ALLOC_MONITOR:
                a(z);
                return;
            case FUNC_GC_MONITOR:
                b(z);
                return;
            case FUNC_MAIN_LOCK_MONITOR:
                c(z);
                return;
            case FUNC_CAUGHT_EXCEPTION_MONITOR:
                d(z);
                return;
            case FUNC_CLASS_PREPARED_MONITOR:
                e(z);
                return;
            case FUNC_SIGQUIT_DUMP:
                f(z);
                return;
            case FUNC_DUMP_HEAP:
                this.d = z;
                com.taobao.android.tbuprofen.log.c.e("DefaultPlugin", "DumpHeapInfo: " + this.d, new Object[0]);
                return;
            case FUNC_THREAD_MONITOR:
                g(z);
                return;
            default:
                return;
        }
    }

    private void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
            return;
        }
        com.taobao.android.tbuprofen.log.c.e("DefaultPlugin", "monitorBigMemAlloc:" + z, new Object[0]);
        if (TBProfConfig.j()) {
            if (ARTUtil.b() == 0) {
                try {
                    if (TBProfConfig.k()) {
                        com.taobao.android.tbuprofen.log.c.e("DefaultPlugin", "enterGCCriticalSection", new Object[0]);
                        ARTUtil.c();
                    }
                    this.b.a(TBPEvent.TBP_EVENT_VM_OBJECT_ALLOC, z);
                    if (!TBProfConfig.k()) {
                        return;
                    }
                    ARTUtil.d();
                    com.taobao.android.tbuprofen.log.c.e("DefaultPlugin", "exitGCCriticalSection", new Object[0]);
                    return;
                } catch (Throwable th) {
                    if (TBProfConfig.k()) {
                        ARTUtil.d();
                        com.taobao.android.tbuprofen.log.c.e("DefaultPlugin", "exitGCCriticalSection", new Object[0]);
                    }
                    throw th;
                }
            }
            com.taobao.android.tbuprofen.log.c.a("DefaultPlugin", "mutator held! Do not enable VM_OBJECT_ALLOC", new Object[0]);
            return;
        }
        this.b.a(TBPEvent.TBP_EVENT_VM_OBJECT_ALLOC, z);
    }

    private void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        com.taobao.android.tbuprofen.log.c.e("DefaultPlugin", "monitorGC:" + z, new Object[0]);
        this.b.a(TBPEvent.TBP_EVENT_GARBAGE_COLLECTION_START, z);
        this.b.a(TBPEvent.TBP_EVENT_GARBAGE_COLLECTION_FINISH, z);
    }

    private void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b84aa", new Object[]{this, new Boolean(z)});
        } else if (Build.VERSION.SDK_INT < 28) {
        } else {
            com.taobao.android.tbuprofen.log.c.e("DefaultPlugin", "monitorMainThreadLongBlock:" + z, new Object[0]);
            this.b.a(TBPEvent.TBP_EVENT_MONITOR_CONTENDED_ENTER, z);
            this.b.a(TBPEvent.TBP_EVENT_MONITOR_CONTENDED_ENTERED, z);
            this.b.a(TBPEvent.TBP_EVENT_MONITOR_WAIT, z);
            this.b.a(TBPEvent.TBP_EVENT_MONITOR_WAITED, z);
        }
    }

    private void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad405d49", new Object[]{this, new Boolean(z)});
        } else if (Build.VERSION.SDK_INT < 28) {
        } else {
            com.taobao.android.tbuprofen.log.c.e("DefaultPlugin", "monitorCatchException:" + z, new Object[0]);
            this.b.a(TBPEvent.TBP_EVENT_EXCEPTION_CATCH, z);
        }
    }

    private void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aef535e8", new Object[]{this, new Boolean(z)});
            return;
        }
        com.taobao.android.tbuprofen.log.c.e("DefaultPlugin", "monitorClassPrepare:" + z, new Object[0]);
        this.b.a(TBPEvent.TBP_EVENT_CLASS_LOAD, z);
        this.b.a(TBPEvent.TBP_EVENT_CLASS_PREPARE, z);
    }

    private void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0aa0e87", new Object[]{this, new Boolean(z)});
            return;
        }
        com.taobao.android.tbuprofen.log.c.e("DefaultPlugin", "monitorSigQuitDump:" + z, new Object[0]);
        this.b.a(TBPEvent.TBP_EVENT_DATA_DUMP_REQUEST, z);
    }

    private void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b25ee726", new Object[]{this, new Boolean(z)});
            return;
        }
        com.taobao.android.tbuprofen.log.c.e("DefaultPlugin", "monitorThreadRun:" + z, new Object[0]);
        this.b.a(TBPEvent.TBP_EVENT_THREAD_START, z);
        this.b.a(TBPEvent.TBP_EVENT_THREAD_END, z);
    }

    public int a(String str, String str2, int i, int i2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c977d35b", new Object[]{this, str, str2, new Integer(i), new Integer(i2), new Long(j)})).intValue();
        }
        if (!this.d) {
            com.taobao.android.tbuprofen.log.c.d("DefaultPlugin", "DumpReferenceInfo is disable!", new Object[0]);
            return 201;
        } else if (!this.e.compareAndSet(false, true)) {
            com.taobao.android.tbuprofen.log.c.d("DefaultPlugin", "Current in dump process!", new Object[0]);
            return 202;
        } else {
            com.taobao.android.tbuprofen.log.c.d("DefaultPlugin", "dumpHeapReference!", new Object[0]);
            this.e.set(false);
            return -1;
        }
    }

    public int a(String str, long j, long j2, int i, String str2, int i2, int i3, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e3d997dc", new Object[]{this, str, new Long(j), new Long(j2), new Integer(i), str2, new Integer(i2), new Integer(i3), new Long(j3)})).intValue();
        }
        if (!this.d) {
            com.taobao.android.tbuprofen.log.c.d("DefaultPlugin", "DumpInstanceInfo is disable!", new Object[0]);
            return 201;
        } else if (!this.e.compareAndSet(false, true)) {
            com.taobao.android.tbuprofen.log.c.d("DefaultPlugin", "Current in dump process!", new Object[0]);
            return 202;
        } else {
            com.taobao.android.tbuprofen.log.c.d("DefaultPlugin", "ForkDumpInstance!", new Object[0]);
            int forkDumpHeapInstanceNative = forkDumpHeapInstanceNative(str, j, j2, i, str2, i2, i3, j3);
            this.e.set(false);
            return forkDumpHeapInstanceNative;
        }
    }
}
