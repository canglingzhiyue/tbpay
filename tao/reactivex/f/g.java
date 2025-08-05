package tao.reactivex.f;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes9.dex */
public final class g extends a implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1964949473);
        kge.a(-1390502639);
    }

    public g(Runnable runnable) {
        super(runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        this.b = Thread.currentThread();
        try {
            this.f25151a.run();
        } finally {
            try {
            } finally {
            }
        }
    }
}
