package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.android.dinamicx.ba;
import java.lang.ref.WeakReference;

/* loaded from: classes8.dex */
public class quf extends ba {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<a> f33061a;

    static {
        kge.a(1383036631);
    }

    public quf(a aVar) {
        this.f33061a = new WeakReference<>(aVar);
    }

    public a a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("3d35f71d", new Object[]{this}) : this.f33061a.get();
    }
}
