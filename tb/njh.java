package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public class njh implements njg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private List<njg> f31498a;
    private Lock b;
    private Lock c;

    /* loaded from: classes.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final njh f31499a = new njh();

        public static /* synthetic */ njh a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (njh) ipChange.ipc$dispatch("f084072", new Object[0]) : f31499a;
        }
    }

    private njh() {
        this.f31498a = new ArrayList(2);
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.b = reentrantReadWriteLock.readLock();
        this.c = reentrantReadWriteLock.writeLock();
    }

    public static njh a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (njh) ipChange.ipc$dispatch("f084072", new Object[0]) : a.a();
    }

    public void a(njg njgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f64f90cd", new Object[]{this, njgVar});
            return;
        }
        this.c.lock();
        if (njgVar != null) {
            try {
                if (!this.f31498a.contains(njgVar)) {
                    this.f31498a.add(njgVar);
                }
            } finally {
                this.c.unlock();
            }
        }
    }

    public void b(njg njgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4d2974e", new Object[]{this, njgVar});
            return;
        }
        this.c.lock();
        try {
            this.f31498a.remove(njgVar);
        } finally {
            this.c.unlock();
        }
    }

    @Override // tb.njg
    public void a(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84162689", new Object[]{this, str, str2, map});
            return;
        }
        this.b.lock();
        try {
            for (njg njgVar : this.f31498a) {
                njgVar.a(str, str2, map);
            }
        } finally {
            this.b.unlock();
        }
    }

    @Override // tb.njg
    public void b(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("854c7968", new Object[]{this, str, str2, map});
            return;
        }
        this.b.lock();
        try {
            for (njg njgVar : this.f31498a) {
                njgVar.b(str, str2, map);
            }
        } finally {
            this.b.unlock();
        }
    }

    @Override // tb.njg
    public void c(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8682cc47", new Object[]{this, str, str2, map});
            return;
        }
        this.b.lock();
        try {
            for (njg njgVar : this.f31498a) {
                njgVar.c(str, str2, map);
            }
        } finally {
            this.b.unlock();
        }
    }

    @Override // tb.njg
    public void d(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87b91f26", new Object[]{this, str, str2, map});
            return;
        }
        this.b.lock();
        try {
            for (njg njgVar : this.f31498a) {
                njgVar.d(str, str2, map);
            }
        } finally {
            this.b.unlock();
        }
    }
}
