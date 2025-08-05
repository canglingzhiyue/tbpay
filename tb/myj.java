package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public class myj implements myh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private myh f31322a;
    private Lock b;
    private Lock c;

    /* loaded from: classes.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final myj f31323a = new myj();

        public static /* synthetic */ myj a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (myj) ipChange.ipc$dispatch("f0804a0", new Object[0]) : f31323a;
        }
    }

    private myj() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.b = reentrantReadWriteLock.readLock();
        this.c = reentrantReadWriteLock.writeLock();
    }

    public static myj a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (myj) ipChange.ipc$dispatch("f0804a0", new Object[0]) : a.a();
    }

    public void a(myh myhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f56e8d1c", new Object[]{this, myhVar});
            return;
        }
        this.c.lock();
        try {
            if (this.f31322a == null) {
                this.f31322a = myhVar;
            }
        } finally {
            this.c.unlock();
        }
    }

    @Override // tb.myh
    public void a(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20476513", new Object[]{this, str, map});
            return;
        }
        this.b.lock();
        try {
            if (this.f31322a != null) {
                this.f31322a.a(str, map);
            }
        } finally {
            this.b.unlock();
        }
    }
}
