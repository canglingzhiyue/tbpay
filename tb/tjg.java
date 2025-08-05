package tb;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.linked.b;

/* loaded from: classes7.dex */
public class tjg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private tiq f34144a;
    private tji b;
    private tjh c;
    private iwf d;

    static {
        kge.a(-1154635381);
    }

    public static /* synthetic */ void a(tjg tjgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ca487", new Object[]{tjgVar});
        } else {
            tjgVar.c();
        }
    }

    public tjg(tiq tiqVar) {
        this.f34144a = tiqVar;
        this.b = new tji(this.f34144a);
        this.c = new tjh(this.f34144a);
        this.d = new iwf(this.f34144a);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.b.a();
        }
    }

    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.d.a(i2);
        if (i != 200) {
            b();
            return;
        }
        b.a aVar = new b.a();
        boolean a2 = this.f34144a.a().a(aVar);
        stv.a("LinkageManager", "checkLinkage shouldAnimate=" + a2);
        if (!a2) {
            b();
        } else if (this.b.b()) {
            this.b.c();
        } else if (this.c.a()) {
            this.c.a(aVar);
        } else {
            b();
        }
    }

    private void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.f34144a.g().c() == null) {
            c();
        } else {
            this.f34144a.g().c().animate().alpha(0.0f).setDuration(100L).setListener(new AnimatorListenerAdapter() { // from class: tb.tjg.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                    } else {
                        tjg.a(tjg.this);
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    } else {
                        tjg.a(tjg.this);
                    }
                }
            }).start();
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.f34144a.a().c(2001);
        }
    }
}
