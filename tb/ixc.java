package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.baseactivity.CustomBaseActivity;

/* loaded from: classes6.dex */
public abstract class ixc<E extends CustomBaseActivity> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public E f29391a;

    static {
        kge.a(1674562364);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        }
    }

    public ixc(E e) {
        this.f29391a = e;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        try {
            b();
        } catch (Exception e) {
            Log.e("ShopManager", "Initialize shop manager exception:", e);
        }
    }
}
