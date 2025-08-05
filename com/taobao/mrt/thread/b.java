package com.taobao.mrt.thread;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.alinnpython.AliNNPython;
import com.taobao.android.alinnpython.AliNNPythonThreadState;
import com.taobao.mrt.task.MRTJobRefuseReason;
import com.taobao.mrt.task.f;
import com.taobao.mrt.thread.c;
import java.util.HashMap;
import tb.kge;
import tb.mso;

/* loaded from: classes7.dex */
public class b extends Thread {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final MRTThreadPriority f18261a;
    private final d b;
    private volatile boolean c = true;
    private mso d;
    private AliNNPython e;

    static {
        kge.a(-1641136697);
    }

    public b(mso msoVar, MRTThreadPriority mRTThreadPriority, d dVar, String str) {
        this.d = msoVar;
        this.f18261a = mRTThreadPriority;
        setPriority(mRTThreadPriority.getThreadPriority());
        this.b = dVar;
        setName(str);
        com.taobao.mrt.utils.a.e("MRTThread", "线程:" + getName() + " 被创建");
    }

    private static AliNNPython a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliNNPython) ipChange.ipc$dispatch("3336ca37", new Object[]{new Long(j)});
        }
        AliNNPython newAliNNPythonInstance = AliNNPython.newAliNNPythonInstance();
        newAliNNPythonInstance.threadState = new AliNNPythonThreadState();
        return newAliNNPythonInstance;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        try {
            if (this.e == null) {
                this.e = a(getId());
            }
            while (this.c) {
                com.taobao.mrt.utils.a.b("MRTThread", "线程:" + getName() + " is running");
                f a2 = this.d.a();
                if (a2 != null) {
                    String str = a2.g.name;
                    com.taobao.mrt.utils.a.b("MRTThread", "线程:" + getName() + " 开始执行任务:" + str);
                    if (MRTJobRefuseReason.MRTJobRefuseReasonNone != c.a().b(str)) {
                        a2.a();
                    } else if (!this.c) {
                        break;
                    } else {
                        c.a aVar = new c.a(str, a2.g.cid, System.currentTimeMillis(), this.b, getName());
                        c.a().a(aVar);
                        HashMap hashMap = new HashMap();
                        hashMap.put("name", str);
                        com.taobao.mrt.utils.b.a(hashMap);
                        a2.a(this.e);
                        if (a2.d - a2.c > 10000) {
                            c.a().a(str);
                        }
                        c.a().b(aVar);
                        this.d.b(a2);
                        com.taobao.mrt.utils.b.a();
                        com.taobao.mrt.utils.a.b("MRTThread", "线程:" + getName() + " 结束执行任务:" + a2.g.name);
                    }
                }
            }
        } catch (Throwable th) {
            try {
                com.taobao.mrt.utils.a.b("MRTThread", "线程:" + getName() + "异常", th);
                com.taobao.mrt.utils.a.d("MRTThread", "线程:" + getName() + "结束");
                AliNNPython aliNNPython = this.e;
                if (aliNNPython != null) {
                    aliNNPython.release();
                }
                this.c = false;
            } finally {
                com.taobao.mrt.utils.a.d("MRTThread", "线程:" + getName() + "结束");
                AliNNPython aliNNPython2 = this.e;
                if (aliNNPython2 != null) {
                    aliNNPython2.release();
                }
                this.c = false;
            }
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        com.taobao.mrt.utils.a.c("MRTThread", "线程:" + getName() + "将被销毁");
        this.c = false;
    }

    public AliNNPython b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AliNNPython) ipChange.ipc$dispatch("3c38678a", new Object[]{this}) : this.e;
    }

    public MRTThreadPriority c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MRTThreadPriority) ipChange.ipc$dispatch("7c37e870", new Object[]{this}) : this.f18261a;
    }
}
