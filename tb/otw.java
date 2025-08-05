package tb;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public class otw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f32419a;
    private long c = -1;
    private final long b = SystemClock.uptimeMillis();

    static {
        kge.a(-663038426);
    }

    public otw(String str) {
        this.f32419a = str;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.c = SystemClock.uptimeMillis();
        }
    }

    public long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dd", new Object[]{this})).longValue();
        }
        long j = this.c;
        if (j >= 0) {
            return j - this.b;
        }
        return -1L;
    }
}
