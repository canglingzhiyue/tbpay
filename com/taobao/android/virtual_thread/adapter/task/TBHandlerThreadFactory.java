package com.taobao.android.virtual_thread.adapter.task;

import android.os.Build;
import android.os.HandlerThread;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.stub.config.StubConfig;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import tb.jbg;
import tb.jqp;
import tb.jrj;
import tb.jrk;
import tb.kge;

/* loaded from: classes6.dex */
public class TBHandlerThreadFactory implements jbg.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private jrj d;
    private final jqp e;
    private final SharedHandlerThread[] mHighSharedHandlerThreads;
    private final SharedHandlerThread[] mSharedHandlerThreads;
    private volatile int mSharedCount = 0;
    private volatile int highSharedCount = 0;
    private final Set<Looper> looperSet = new CopyOnWriteArraySet();

    static {
        kge.a(1503648080);
        kge.a(1464485472);
    }

    public TBHandlerThreadFactory(jrj jrjVar, jqp jqpVar) {
        this.mSharedHandlerThreads = new SharedHandlerThread[jrjVar.a("TOTAL_GLOBAL_HANDLER_COUNT", 15)];
        this.mHighSharedHandlerThreads = new SharedHandlerThread[jrjVar.a("TOTAL_GLOBAL_HANDLER_COUNT", 5)];
        this.d = jrjVar;
        this.e = jqpVar;
    }

    public void a(jrj jrjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efee4776", new Object[]{this, jrjVar});
        } else {
            this.d = jrjVar;
        }
    }

    @Override // tb.jbg.a
    public HandlerThread a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HandlerThread) ipChange.ipc$dispatch("578e15aa", new Object[]{this, str});
        }
        if (this.d.a("use_global_handler", this.e.a()) && !StubConfig.isExcludeThread(str)) {
            int i = this.mSharedCount + 1;
            this.mSharedCount = i;
            SharedHandlerThread[] sharedHandlerThreadArr = this.mSharedHandlerThreads;
            int length = i % sharedHandlerThreadArr.length;
            this.mSharedCount = length;
            if (sharedHandlerThreadArr[length] == null) {
                synchronized (sharedHandlerThreadArr) {
                    if (this.mSharedHandlerThreads[length] == null) {
                        SharedHandlerThread[] sharedHandlerThreadArr2 = this.mSharedHandlerThreads;
                        sharedHandlerThreadArr2[length] = new SharedHandlerThread("global-handler" + length);
                        this.looperSet.add(this.mSharedHandlerThreads[length].getLooper());
                    }
                }
            }
            jrk.b("SharedHandler", str, "in shared handler");
            return this.mSharedHandlerThreads[length];
        }
        return new HandlerThread(str);
    }

    @Override // tb.jbg.a
    public HandlerThread highHandlerThread(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HandlerThread) ipChange.ipc$dispatch("90793a79", new Object[]{this, str});
        }
        if (this.d.a("use_global_handler", this.e.a()) && !StubConfig.isExcludeThread(str)) {
            int i = this.highSharedCount + 1;
            this.highSharedCount = i;
            SharedHandlerThread[] sharedHandlerThreadArr = this.mHighSharedHandlerThreads;
            int length = i % sharedHandlerThreadArr.length;
            this.highSharedCount = length;
            if (sharedHandlerThreadArr[length] == null) {
                synchronized (sharedHandlerThreadArr) {
                    if (this.mHighSharedHandlerThreads[length] == null) {
                        SharedHandlerThread[] sharedHandlerThreadArr2 = this.mHighSharedHandlerThreads;
                        sharedHandlerThreadArr2[length] = new SharedHandlerThread("global-high-handler" + length);
                        this.looperSet.add(this.mHighSharedHandlerThreads[length].getLooper());
                    }
                }
            }
            jrk.b("SharedHandler", str, "in high shared handler");
            return this.mHighSharedHandlerThreads[length];
        }
        return new HandlerThread(str);
    }

    public void quit(Looper looper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8118f", new Object[]{this, looper});
        } else if (isGlobalLooper(looper)) {
        } else {
            looper.quit();
        }
    }

    public void quitSafely(Looper looper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3579cd95", new Object[]{this, looper});
        } else if (Build.VERSION.SDK_INT < 18 || isGlobalLooper(looper)) {
        } else {
            looper.quitSafely();
        }
    }

    private boolean isGlobalLooper(Looper looper) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("aa5c44e4", new Object[]{this, looper})).booleanValue() : this.looperSet.contains(looper);
    }
}
