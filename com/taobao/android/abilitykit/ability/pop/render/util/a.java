package com.taobao.android.abilitykit.ability.pop.render.util;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilitykit.ability.pop.render.util.b;
import tb.dly;
import tb.hsy;
import tb.kge;

/* loaded from: classes4.dex */
public class a implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ON_ANIMATION = "onAnimation";
    public static final String ON_ANiM_END_POS_CHANGED = "onPositionChanged";

    /* renamed from: a  reason: collision with root package name */
    private int f8941a;
    private int b;
    private boolean c = false;
    private Animator d;

    static {
        kge.a(-1694688798);
        kge.a(1958735357);
    }

    public static /* synthetic */ boolean a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("de79563", new Object[]{aVar})).booleanValue() : aVar.c;
    }

    public static /* synthetic */ Animator b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Animator) ipChange.ipc$dispatch("cc372435", new Object[]{aVar}) : aVar.d;
    }

    public static /* synthetic */ void c(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3664749d", new Object[]{aVar});
        } else {
            aVar.c();
        }
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.util.b
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.util.b
    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.f8941a = i;
        this.b = i2;
    }

    private void a(final View view, float f, float f2, final b.a aVar) {
        float translationY;
        ObjectAnimator ofFloat;
        float x;
        float y;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f62149f", new Object[]{this, view, new Float(f), new Float(f2), aVar});
            return;
        }
        b();
        if (this.c) {
            translationY = view.getTranslationX();
            ofFloat = ObjectAnimator.ofFloat(view, "translationX", translationY, f2);
            x = (view.getX() + f2) - translationY;
            y = view.getY();
        } else {
            translationY = view.getTranslationY();
            ofFloat = ObjectAnimator.ofFloat(view, "translationY", translationY, f2);
            x = view.getX();
            y = (view.getY() + f2) - translationY;
        }
        final ObjectAnimator objectAnimator = ofFloat;
        final float f3 = x;
        final float f4 = y;
        objectAnimator.setDuration(Math.min(300L, Math.max(50L, (Math.abs(translationY - f2) / Math.min(8000.0f, Math.max(200.0f, f))) * 1000.0f)));
        objectAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.taobao.android.abilitykit.ability.pop.render.util.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 anonymousClass1, String str, Object... objArr) {
                if (str.hashCode() == -2145066406) {
                    super.onAnimationEnd((Animator) objArr[0]);
                    return null;
                }
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3a405721", new Object[]{this, animator});
                } else if (view == null) {
                } else {
                    aVar.a(new dly(a.a(a.this) ? "translationX" : "translationY", new float[]{hsy.b(view.getContext(), a.a(a.this) ? view.getX() : view.getY()), hsy.b(view.getContext(), a.a(a.this) ? f3 : f4)}, Long.valueOf(animator.getDuration()), animator));
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    return;
                }
                super.onAnimationEnd(animator);
                if (a.b(a.this) == objectAnimator) {
                    a.c(a.this);
                }
                aVar.a(f3, f4, true, "onPositionChanged");
                aVar.a();
            }
        });
        objectAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.android.abilitykit.ability.pop.render.util.a.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    return;
                }
                View view2 = view;
                if (view2 == null) {
                    return;
                }
                aVar.a(view2.getX(), view.getY(), true, a.ON_ANIMATION);
            }
        });
        objectAnimator.setInterpolator(new LinearInterpolator());
        this.d = objectAnimator;
        objectAnimator.start();
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.util.b
    public void a(View view, float f, b.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1aa7073", new Object[]{this, view, new Float(f), aVar});
        } else {
            a(view, f, this.b, aVar);
        }
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.util.b
    public void b(View view, float f, b.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a9ced2", new Object[]{this, view, new Float(f), aVar});
        } else {
            a(view, f, 0.0f, aVar);
        }
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.util.b
    public void c(View view, float f, b.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51a92d31", new Object[]{this, view, new Float(f), aVar});
        } else {
            a(view, f, this.b - this.f8941a, aVar);
        }
    }

    @Override // com.taobao.android.abilitykit.ability.pop.render.util.b
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        Animator animator = this.d;
        return animator != null && animator.isStarted();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        if (this.d != null && a()) {
            this.d.cancel();
        }
        c();
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.d = null;
        }
    }
}
