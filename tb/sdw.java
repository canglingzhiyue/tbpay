package tb;

import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes7.dex */
public class sdw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final List<Runnable> f33498a = new CopyOnWriteArrayList();
    private boolean b = false;
    private Handler c = new Handler(Looper.getMainLooper());
    private boolean d;

    static {
        kge.a(-909125228);
    }

    public sdw() {
        this.d = true;
        this.d = mxj.a("enableScrollStateManager", true);
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (!this.d) {
        } else {
            this.b = z;
            if (z) {
                return;
            }
            c();
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (!this.f33498a.isEmpty()) {
            ArrayList arrayList = new ArrayList(this.f33498a);
            this.f33498a.clear();
            for (int i = 0; i < arrayList.size(); i++) {
                this.c.postDelayed((Runnable) arrayList.get(i), 100L);
            }
        }
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.b;
    }

    public void a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39112e6", new Object[]{this, runnable});
        } else {
            this.f33498a.add(runnable);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.b = false;
        this.f33498a.clear();
        this.c.removeCallbacksAndMessages(null);
    }
}
