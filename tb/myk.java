package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public class myk implements myi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private myi f31324a;
    private Lock b;
    private Lock c;

    /* loaded from: classes.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private static final myk f31325a = new myk();

        public static /* synthetic */ myk a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (myk) ipChange.ipc$dispatch("f0804bf", new Object[0]) : f31325a;
        }
    }

    private myk() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.b = reentrantReadWriteLock.readLock();
        this.c = reentrantReadWriteLock.writeLock();
    }

    public static myk a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (myk) ipChange.ipc$dispatch("f0804bf", new Object[0]) : a.a();
    }

    public void a(myi myiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f56f017b", new Object[]{this, myiVar});
            return;
        }
        this.c.lock();
        try {
            if (this.f31324a == null) {
                this.f31324a = myiVar;
            }
        } finally {
            this.c.unlock();
        }
    }

    @Override // tb.myi
    public void a(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84162689", new Object[]{this, str, str2, map});
            return;
        }
        this.b.lock();
        try {
            if (this.f31324a != null) {
                this.f31324a.a(str, str2, map);
            }
        } finally {
            this.b.unlock();
        }
    }

    @Override // tb.myi
    public void b(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("854c7968", new Object[]{this, str, str2, map});
            return;
        }
        this.b.lock();
        try {
            if (this.f31324a != null) {
                this.f31324a.b(str, str2, map);
            }
        } finally {
            this.b.unlock();
        }
    }

    @Override // tb.myi
    public void b(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("819a01b2", new Object[]{this, str, map});
            return;
        }
        this.b.lock();
        try {
            if (this.f31324a != null) {
                this.f31324a.b(str, map);
            }
        } finally {
            this.b.unlock();
        }
    }

    @Override // tb.myi
    public void c(String str, String str2, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8682cc47", new Object[]{this, str, str2, map});
            return;
        }
        this.b.lock();
        try {
            if (this.f31324a != null) {
                this.f31324a.c(str, str2, map);
            }
        } finally {
            this.b.unlock();
        }
    }
}
