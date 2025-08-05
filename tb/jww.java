package tb;

import android.support.v4.util.Pools;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes6.dex */
public class jww<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f29840a;
    private int b;
    private final boolean c;
    private final Pools.Pool<T> d;
    private int e;

    static {
        kge.a(2121585918);
        kge.a(843953940);
    }

    public jww(String str, int i, boolean z) {
        this.c = z;
        this.f29840a = str;
        this.b = i;
        this.d = z ? new Pools.SynchronizedPool<>(i) : new Pools.SimplePool<>(i);
    }

    public T a() {
        T c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("bd3407ca", new Object[]{this});
        }
        if (this.c) {
            synchronized (this) {
                c = c();
            }
            return c;
        }
        return c();
    }

    private T c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("ca3f7d08", new Object[]{this});
        }
        T acquire = this.d.acquire();
        this.e = Math.max(0, this.e - 1);
        return acquire;
    }

    public void a(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, t});
        } else if (this.c) {
            synchronized (this) {
                b(t);
            }
        } else {
            b(t);
        }
    }

    private void b(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f056ab85", new Object[]{this, t});
            return;
        }
        this.d.release(t);
        this.e = Math.min(this.b, this.e + 1);
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.e >= this.b;
    }
}
