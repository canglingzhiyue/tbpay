package tb;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.aa;

/* loaded from: classes8.dex */
public abstract class oet implements oem<Integer> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public aa f31983a;
    public int b;
    public int c;
    private ValueAnimator d;
    private boolean e;
    private boolean f;

    static {
        kge.a(-1778197095);
        kge.a(-1239841830);
    }

    public abstract void a(aa aaVar, Component component, View view, int i);

    public abstract void b(aa aaVar, Component component, View view, int i);

    public abstract int c();

    public static /* synthetic */ boolean a(oet oetVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f7c3dcbe", new Object[]{oetVar})).booleanValue() : oetVar.f;
    }

    public static /* synthetic */ boolean a(oet oetVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b86d5e", new Object[]{oetVar, new Boolean(z)})).booleanValue();
        }
        oetVar.f = z;
        return z;
    }

    public static /* synthetic */ boolean b(oet oetVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e646e33f", new Object[]{oetVar})).booleanValue() : oetVar.e;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.e = z;
        }
    }

    public int a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821884b", new Object[]{this, new Float(f)})).intValue();
        }
        int i = this.b;
        return (int) (i + (f * (this.c - i)) + 0.5f);
    }

    public Integer d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Integer) ipChange.ipc$dispatch("e4778d52", new Object[]{this}) : Integer.valueOf(this.c);
    }

    public Animator a(final aa aaVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animator) ipChange.ipc$dispatch("b9192d43", new Object[]{this, aaVar, new Integer(i), new Integer(i2)});
        }
        final View x = aaVar.x();
        final Component I = aaVar.I();
        this.f31983a = aaVar;
        this.b = i;
        this.c = i2;
        if (x != null && (this.e || i != i2)) {
            this.d = tfs.a(aaVar);
            this.d.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: tb.oet.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                        return;
                    }
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    if (oet.a(oet.this) && oet.b(oet.this) && oeb.a("resetStartValue", true)) {
                        oet oetVar = oet.this;
                        oetVar.b = oetVar.c();
                    }
                    oet oetVar2 = oet.this;
                    oetVar2.a(aaVar, I, x, oetVar2.a(floatValue));
                }
            });
            this.d.addListener(new Animator.AnimatorListener() { // from class: tb.oet.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("4388ea84", new Object[]{this, animator});
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3a405721", new Object[]{this, animator});
                        return;
                    }
                    oet.a(oet.this, false);
                    if (oet.b(oet.this)) {
                        oet oetVar = oet.this;
                        oetVar.b = oetVar.c();
                    }
                    oet.this.a(((Float) ((ValueAnimator) animator).getAnimatedValue()).floatValue());
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                        return;
                    }
                    oet.a(oet.this, true);
                    oet oetVar = oet.this;
                    oetVar.b(aaVar, I, x, oetVar.a(((Float) ((ValueAnimator) animator).getAnimatedValue()).floatValue()));
                    aaVar.a(oet.this.b(), (Object) null);
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                        return;
                    }
                    oet.a(oet.this, true);
                    aaVar.a(oet.this.b(), (Object) null);
                }
            });
            e();
            aaVar.a(b(), this);
            return this.d;
        }
        e();
        aaVar.a(b(), (Object) null);
        return null;
    }

    private void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
            return;
        }
        oem oemVar = (oem) this.f31983a.a(b());
        if (oemVar == null || oemVar.a() == null) {
            return;
        }
        oemVar.a().cancel();
    }

    @Override // tb.oem
    public Animator a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Animator) ipChange.ipc$dispatch("5db56a8b", new Object[]{this}) : this.d;
    }
}
