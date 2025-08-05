package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes6.dex */
public abstract class ilj {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final List<a> b = new ArrayList();

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f29138a = new AtomicBoolean(false);

    /* loaded from: classes6.dex */
    public interface a {
        void a(com.taobao.android.resourceguardian.data.model.a aVar);
    }

    static {
        kge.a(95419842);
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        }
    }

    public void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f76bb9e", new Object[]{this, context});
        }
    }

    public void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a023673d", new Object[]{this, context});
        }
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("708a9b4", new Object[]{this, aVar});
        } else {
            this.b.add(aVar);
        }
    }

    public void a(com.taobao.android.resourceguardian.data.model.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("733f7c64", new Object[]{this, aVar});
            return;
        }
        for (a aVar2 : this.b) {
            aVar2.a(aVar);
        }
    }

    public void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eca0fff", new Object[]{this, context});
        } else if (!this.f29138a.compareAndSet(false, true)) {
        } else {
            c(context);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (!this.f29138a.compareAndSet(true, false)) {
        } else {
            b();
        }
    }
}
