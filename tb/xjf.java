package tb;

import android.content.Context;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.view.NewDetailMaskFrameLayout;
import com.taobao.tao.Globals;
import com.taobao.taobao.R;

/* loaded from: classes5.dex */
public class xjf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static volatile xjf f34323a;
    private static volatile xjf b;
    private static volatile long c;
    private volatile FrameLayout d;
    private volatile FrameLayout e;
    private fpz f;

    static {
        kge.a(-1836680394);
        c = -1L;
    }

    public static void a(long j, xjf xjfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0848998", new Object[]{new Long(j), xjfVar});
            return;
        }
        f34323a = xjfVar;
        c = j;
    }

    public static xjf a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xjf) ipChange.ipc$dispatch("dab32676", new Object[]{new Long(j)});
        }
        xjf xjfVar = (j <= 0 || c != j) ? null : f34323a;
        f34323a = null;
        return xjfVar;
    }

    public static xjf a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xjf) ipChange.ipc$dispatch("f0ccbea", new Object[0]);
        }
        xjf xjfVar = b;
        b = null;
        if (xjfVar == null) {
            return new xjf();
        }
        fjt.a(xjg.TAG, "BatterPreView: createLowBatterViewPreHelper From Cache .");
        return xjfVar;
    }

    public FrameLayout a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("77f971ed", new Object[]{this, new Boolean(z)});
        }
        if (z) {
            if (this.e == null) {
                fjt.a(xjg.TAG, "BatterPreView: notHitAnimRootLayout");
                d();
            }
            FrameLayout frameLayout = this.e;
            this.e = null;
            return frameLayout;
        }
        if (this.d == null) {
            fjt.a(xjg.TAG, "BatterPreView: notHitRootLayout");
            e();
        }
        FrameLayout frameLayout2 = this.d;
        this.d = null;
        return frameLayout2;
    }

    public static void a(xjf xjfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75f92a4", new Object[]{xjfVar});
        } else {
            b = xjfVar;
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[0]);
        } else if (!xji.c()) {
        } else {
            xjf xjfVar = new xjf();
            xjfVar.c();
            a(xjfVar);
            fjt.a(xjg.TAG, "BatterPreView: cache_LowBatterViewPreHelper Success.");
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        g();
        e();
        d();
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        g();
        if (z) {
            d();
        } else {
            e();
        }
        fjt.a(xjg.TAG, "BatterPreView: startHelper");
    }

    private void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
        } else {
            this.f = new fpz(Globals.getApplication());
        }
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        fpz fpzVar = this.f;
        if (fpzVar == null) {
            return;
        }
        fpzVar.a(context);
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        fpz fpzVar = this.f;
        NewDetailMaskFrameLayout newDetailMaskFrameLayout = new NewDetailMaskFrameLayout(fpzVar);
        newDetailMaskFrameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        newDetailMaskFrameLayout.setId(R.id.rootAnimFrameLayout);
        FrameLayout frameLayout = new FrameLayout(fpzVar);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setId(R.id.rootParentFrameLayout);
        FrameLayout f = f();
        frameLayout.addView(newDetailMaskFrameLayout);
        newDetailMaskFrameLayout.addView(f);
        this.e = frameLayout;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            this.d = f();
        }
    }

    public FrameLayout f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("ef845acc", new Object[]{this});
        }
        FrameLayout frameLayout = new FrameLayout(this.f);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setId(R.id.root);
        return frameLayout;
    }
}
