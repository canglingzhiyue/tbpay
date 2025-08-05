package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.arch.flow.fatigue.a;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class srw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Map<Integer, sry> f33874a = new HashMap();
    private Activity b;
    private final sry c;
    private final sry d;
    private final sry e;
    private final sry f;
    private final sry g;

    static {
        kge.a(1172875037);
    }

    public srw(srq srqVar, srk srkVar, a aVar) {
        sro sroVar = new sro(srqVar);
        com.taobao.bootimage.arch.flow.view.a aVar2 = new com.taobao.bootimage.arch.flow.view.a();
        this.c = new ssc(sroVar, srkVar, aVar, this, aVar2);
        this.d = new srz(sroVar, srkVar, aVar, this, aVar2);
        this.e = new sse(sroVar, srkVar, aVar, this, aVar2);
        this.f = new ssd(sroVar, srkVar, aVar, this, aVar2);
        this.g = new ssa(sroVar, srkVar, aVar, this, aVar2);
        b();
        a(srqVar);
    }

    private void a(srq srqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff4d13a6", new Object[]{this, srqVar});
            return;
        }
        srqVar.a(this.c.b(), this.c);
        srqVar.a(this.d.b(), this.d);
        srqVar.a(this.e.b(), this.e);
        srqVar.a(this.f.b(), this.f);
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.f33874a.put(Integer.valueOf(this.c.b()), this.c);
        this.f33874a.put(Integer.valueOf(this.d.b()), this.d);
        this.f33874a.put(Integer.valueOf(this.e.b()), this.e);
        this.f33874a.put(Integer.valueOf(this.f.b()), this.f);
        this.f33874a.put(Integer.valueOf(this.g.b()), this.g);
    }

    public void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68a25ba", new Object[]{this, activity});
        } else {
            this.b = activity;
        }
    }

    public Activity a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("2162bf40", new Object[]{this}) : this.b;
    }

    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        kej.a("2ARCH_StateContext", "handleState: " + i);
        sry sryVar = this.f33874a.get(Integer.valueOf(i));
        if (sryVar == null) {
            return;
        }
        sryVar.a(i, i2);
    }
}
