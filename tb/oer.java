package tb;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.core.aa;

/* loaded from: classes8.dex */
public abstract class oer implements oem<Float> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public aa f31980a;
    public float b;
    public float c;
    private boolean d;
    private ValueAnimator e;
    private boolean f;

    static {
        kge.a(-765970356);
        kge.a(-1239841830);
    }

    public abstract void a(aa aaVar, View view, float f);

    public abstract void b(aa aaVar, View view, float f);

    public abstract float c();

    public abstract void c(aa aaVar, View view, float f);

    public void d(aa aaVar, View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e0dcb41", new Object[]{this, aaVar, view, new Float(f)});
        }
    }

    public static /* synthetic */ boolean a(oer oerVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f7c2f400", new Object[]{oerVar})).booleanValue() : oerVar.f;
    }

    public static /* synthetic */ boolean a(oer oerVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c3e5c", new Object[]{oerVar, new Boolean(z)})).booleanValue();
        }
        oerVar.f = z;
        return z;
    }

    public static /* synthetic */ boolean b(oer oerVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e645fa81", new Object[]{oerVar})).booleanValue() : oerVar.d;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }

    public float a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a8218848", new Object[]{this, new Float(f)})).floatValue();
        }
        float f2 = this.b;
        return f2 + (f * (this.c - f2));
    }

    public Float d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Float) ipChange.ipc$dispatch("8873b134", new Object[]{this}) : Float.valueOf(this.c);
    }

    public Animator a(final aa aaVar, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animator) ipChange.ipc$dispatch("7858d1a3", new Object[]{this, aaVar, new Float(f), new Float(f2)});
        }
        final View x = aaVar.x();
        this.f31980a = aaVar;
        this.b = f;
        this.c = f2;
        if (x != null && (this.d || f != f2)) {
            this.e = tfs.a(aaVar);
            this.e.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: tb.oer.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                        return;
                    }
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    if (oer.a(oer.this) && oer.b(oer.this) && oeb.a("resetStartValue", true)) {
                        oer oerVar = oer.this;
                        oerVar.b = oerVar.c();
                    }
                    oer oerVar2 = oer.this;
                    oerVar2.b(aaVar, x, oerVar2.a(floatValue));
                }
            });
            this.e.addListener(new Animator.AnimatorListener() { // from class: tb.oer.2
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
                    oer.a(oer.this, false);
                    if (oer.b(oer.this)) {
                        oer oerVar = oer.this;
                        oerVar.b = oerVar.c();
                    }
                    oer oerVar2 = oer.this;
                    oerVar2.a(aaVar, x, oerVar2.a(((Float) ((ValueAnimator) animator).getAnimatedValue()).floatValue()));
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                        return;
                    }
                    oer.a(oer.this, true);
                    oer oerVar = oer.this;
                    oerVar.c(aaVar, x, oerVar.a(((Float) ((ValueAnimator) animator).getAnimatedValue()).floatValue()));
                    aaVar.a(oer.this.b(), (Object) null);
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("90a3af63", new Object[]{this, animator});
                        return;
                    }
                    oer.a(oer.this, true);
                    oer oerVar = oer.this;
                    oerVar.d(aaVar, x, oerVar.a(((Float) ((ValueAnimator) animator).getAnimatedValue()).floatValue()));
                    aaVar.a(oer.this.b(), (Object) null);
                }
            });
            e();
            aaVar.a(b(), this);
            return this.e;
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
        oem oemVar = (oem) this.f31980a.a(b());
        if (oemVar == null || oemVar.a() == null) {
            return;
        }
        oemVar.a().cancel();
    }

    @Override // tb.oem
    public Animator a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Animator) ipChange.ipc$dispatch("5db56a8b", new Object[]{this}) : this.e;
    }
}
