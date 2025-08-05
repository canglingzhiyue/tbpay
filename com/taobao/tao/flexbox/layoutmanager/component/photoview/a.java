package com.taobao.tao.flexbox.layoutmanager.component.photoview;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class a implements View.OnTouchListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f20184a;
    private float b;
    private float c;
    private final float d;
    private float e;
    private InterfaceC0843a f;
    private float g;
    private float h;
    private int i;
    private boolean j;

    /* renamed from: com.taobao.tao.flexbox.layoutmanager.component.photoview.a$a  reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    public interface InterfaceC0843a {
        void a();

        void a(float f);

        void b();

        void b(float f);

        void c();
    }

    /* loaded from: classes8.dex */
    public interface b {
        boolean canBeSwiped();
    }

    static {
        kge.a(-146962613);
        kge.a(-468432129);
    }

    public static /* synthetic */ InterfaceC0843a a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (InterfaceC0843a) ipChange.ipc$dispatch("646d84f1", new Object[]{aVar}) : aVar.f;
    }

    public static a a(View view, InterfaceC0843a interfaceC0843a) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("201ce649", new Object[]{view, interfaceC0843a}) : new a(interfaceC0843a, ViewConfiguration.get(view.getContext()).getScaledTouchSlop() << 1, view.getContext().getResources().getDisplayMetrics().heightPixels * 0.5f);
    }

    public a(InterfaceC0843a interfaceC0843a, int i, float f) {
        this(interfaceC0843a, i, f, 0.3f * f);
    }

    public a(InterfaceC0843a interfaceC0843a, int i, float f, float f2) {
        a(interfaceC0843a);
        this.f20184a = i;
        this.d = f;
        this.e = f2;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
        }
        return ((!(view instanceof b) || ((b) view).canBeSwiped() || a()) ? a(view, motionEvent) : false) || view.onTouchEvent(motionEvent);
    }

    public boolean a(View view, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ff88d03", new Object[]{this, view, motionEvent})).booleanValue();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float rawX = motionEvent.getRawX();
            this.g = rawX;
            this.b = rawX;
            float rawY = motionEvent.getRawY();
            this.h = rawY;
            this.c = rawY;
            this.j = false;
            this.i = motionEvent.getPointerId(motionEvent.getPointerCount() - 1);
        } else {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    float rawX2 = motionEvent.getRawX();
                    float rawY2 = motionEvent.getRawY();
                    float f = rawY2 - this.c;
                    float f2 = rawX2 - this.g;
                    float f3 = rawY2 - this.h;
                    this.g = rawX2;
                    this.h = rawY2;
                    if (a(motionEvent) && (this.j || a(f2, f3) || b(f))) {
                        if (!this.j) {
                            ViewGroup c = c(view);
                            if (c != null) {
                                c.requestDisallowInterceptTouchEvent(true);
                            }
                            InterfaceC0843a interfaceC0843a = this.f;
                            if (interfaceC0843a != null) {
                                interfaceC0843a.b();
                            }
                        }
                        this.j = true;
                        a(view, f2, f3);
                    }
                } else if (actionMasked != 3) {
                    if (actionMasked == 5) {
                        b(view);
                        this.j = false;
                        this.i = -1;
                    }
                }
            }
            boolean a2 = (!a(motionEvent) || !this.j) ? false : a(view);
            ViewGroup c2 = c(view);
            if (c2 != null) {
                c2.requestDisallowInterceptTouchEvent(false);
            }
            this.j = false;
            return a2;
        }
        return false;
    }

    private ViewGroup c(View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("e19d4bed", new Object[]{this, view}) : (ViewGroup) view.getParent();
    }

    public void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
        } else {
            this.e = f;
        }
    }

    public boolean b(float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9d660fb", new Object[]{this, new Float(f)})).booleanValue() : Math.abs(f) > ((float) this.f20184a);
    }

    public boolean a(float f, float f2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c0fea6c", new Object[]{this, new Float(f), new Float(f2)})).booleanValue() : Math.abs(f2) > Math.abs(f) && Math.abs(f2) > 10.0f;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.j;
    }

    public boolean a(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5f37b481", new Object[]{this, motionEvent})).booleanValue() : this.i >= 0 && motionEvent.getPointerCount() == 1;
    }

    public boolean a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9501e36e", new Object[]{this, view})).booleanValue();
        }
        view.getTranslationX();
        if (view.getTranslationY() > this.e) {
            InterfaceC0843a interfaceC0843a = this.f;
            if (interfaceC0843a != null) {
                interfaceC0843a.c();
            }
            return true;
        }
        InterfaceC0843a interfaceC0843a2 = this.f;
        if (interfaceC0843a2 != null) {
            interfaceC0843a2.a();
        }
        b(view);
        return false;
    }

    public void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91037249", new Object[]{this, view});
        } else if (view.getTranslationX() == 0.0f && view.getTranslationY() == 0.0f) {
        } else {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", 1.0f);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", 1.0f);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "translationX", 0.0f);
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, "translationY", 0.0f);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.tao.flexbox.layoutmanager.component.photoview.a.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                        return;
                    }
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    if (a.a(a.this) == null) {
                        return;
                    }
                    a.a(a.this).a(floatValue);
                }
            });
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(100L);
            animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
            animatorSet.start();
        }
    }

    public void a(View view, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c23a8ea", new Object[]{this, view, new Float(f), new Float(f2)});
            return;
        }
        float translationX = view.getTranslationX() + f;
        float c = c(view.getTranslationY() + f2);
        view.setTranslationX(translationX);
        view.setTranslationY(c);
        float f3 = 0.0f;
        if (c >= 0.0f) {
            f3 = c / this.d;
        }
        float f4 = 1.0f - f3;
        float f5 = (f4 * 0.5f) + 0.5f;
        view.setScaleX(f5);
        view.setScaleY(f5);
        InterfaceC0843a interfaceC0843a = this.f;
        if (interfaceC0843a == null) {
            return;
        }
        interfaceC0843a.b(c);
        this.f.a(f4);
    }

    public float c(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ab8b3986", new Object[]{this, new Float(f)})).floatValue();
        }
        float f2 = this.d;
        return f > f2 ? f2 : f;
    }

    public void a(InterfaceC0843a interfaceC0843a) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f21b94c", new Object[]{this, interfaceC0843a});
        } else {
            this.f = interfaceC0843a;
        }
    }
}
