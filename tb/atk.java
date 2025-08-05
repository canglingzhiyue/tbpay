package tb;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes2.dex */
public class atk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Handler f25587a = new Handler(Looper.getMainLooper());
    private long b = -1;
    private Runnable c;

    static {
        kge.a(1313513643);
    }

    public static /* synthetic */ long a(atk atkVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("353ad178", new Object[]{atkVar, new Long(j)})).longValue();
        }
        atkVar.b = j;
        return j;
    }

    public void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (-1 == this.b) {
            this.b = currentTimeMillis;
        }
        if (currentTimeMillis - this.b < 50) {
            a(runnable, 50L);
        } else {
            a(runnable, 0L);
        }
    }

    private void a(final Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e91c09e", new Object[]{this, runnable, new Long(j)});
            return;
        }
        this.f25587a.removeCallbacks(this.c);
        this.c = new Runnable() { // from class: tb.atk.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                runnable.run();
                atk.a(atk.this, -1L);
            }
        };
        this.f25587a.postDelayed(this.c, j);
    }
}
