package com.taobao.android.litecreator.sdk.framework.container.panel.impl;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.util.u;
import java.util.Stack;
import tb.het;
import tb.heu;
import tb.hev;
import tb.kge;

/* loaded from: classes5.dex */
public class a implements het {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final long f13458a = 200;
    private final ViewGroup f;
    private final PanelContainer g;
    private int h;
    private boolean i;
    private ObjectAnimator k;
    private ObjectAnimator l;
    private View m;
    private heu n = new hev();
    private final Stack<View> o = new Stack<>();
    private final Stack<heu> p = new Stack<>();
    private final View.OnClickListener q = new View.OnClickListener() { // from class: com.taobao.android.litecreator.sdk.framework.container.panel.impl.a.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            u.b("LCPanelContainer", "click outside panel.");
            a.a(a.this).a();
        }
    };

    /* renamed from: com.taobao.android.litecreator.sdk.framework.container.panel.impl.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C0520a implements Animator.AnimatorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            kge.a(1966441232);
            kge.a(1420754541);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4388ea84", new Object[]{this, animator});
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
            }
        }
    }

    static {
        kge.a(-94931698);
        kge.a(-986521990);
    }

    private boolean a(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a821939f", new Object[]{this, new Integer(i)})).booleanValue() : i <= 1;
    }

    private boolean b(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9d66c3e", new Object[]{this, new Integer(i)})).booleanValue() : i > 1;
    }

    public static /* synthetic */ heu a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (heu) ipChange.ipc$dispatch("1aa9b28a", new Object[]{aVar}) : aVar.n;
    }

    public static /* synthetic */ heu a(a aVar, heu heuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (heu) ipChange.ipc$dispatch("df406332", new Object[]{aVar, heuVar});
        }
        aVar.n = heuVar;
        return heuVar;
    }

    public static /* synthetic */ void a(a aVar, View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d63d57ce", new Object[]{aVar, view, new Integer(i), new Integer(i2)});
        } else {
            aVar.a(view, i, i2);
        }
    }

    public static /* synthetic */ boolean a(a aVar, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5d134423", new Object[]{aVar, new Integer(i)})).booleanValue() : aVar.a(i);
    }

    public static /* synthetic */ boolean a(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5d1383f4", new Object[]{aVar, new Boolean(z)})).booleanValue();
        }
        aVar.i = z;
        return z;
    }

    public static /* synthetic */ heu b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (heu) ipChange.ipc$dispatch("fb23088b", new Object[]{aVar}) : aVar.g();
    }

    public static /* synthetic */ boolean b(a aVar, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("90c16ee4", new Object[]{aVar, new Integer(i)})).booleanValue() : aVar.b(i);
    }

    public static /* synthetic */ View c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("6989c164", new Object[]{aVar}) : aVar.m;
    }

    public static /* synthetic */ int d(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("525386b4", new Object[]{aVar})).intValue() : aVar.h;
    }

    public static /* synthetic */ PanelContainer e(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (PanelContainer) ipChange.ipc$dispatch("c014bc", new Object[]{aVar}) : aVar.g;
    }

    public static /* synthetic */ Stack f(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Stack) ipChange.ipc$dispatch("53329808", new Object[]{aVar}) : aVar.o;
    }

    public static /* synthetic */ Stack g(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Stack) ipChange.ipc$dispatch("8b237327", new Object[]{aVar}) : aVar.p;
    }

    public static /* synthetic */ ViewGroup h(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewGroup) ipChange.ipc$dispatch("2f945a38", new Object[]{aVar}) : aVar.f;
    }

    public a(Context context) {
        this.g = new PanelContainer(context);
        this.g.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.g.setOnClickListener(this.q);
        this.f = (ViewGroup) ((Activity) context).findViewById(16908290);
    }

    @Override // tb.het
    public void a(heu heuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebd264c0", new Object[]{this, heuVar});
            return;
        }
        u.b("LCPanelContainer", "setHandler. handler=" + heuVar);
        if (heuVar == null) {
            return;
        }
        if (heuVar.d()) {
            this.g.setOnClickListener(null);
            this.g.setClickable(false);
        } else {
            this.g.setOnClickListener(this.q);
            this.g.setClickable(true);
            this.g.setExceptViewList(heuVar.g());
        }
        this.n = heuVar;
        this.p.push(heuVar);
    }

    @Override // tb.het
    public void a(final View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            return;
        }
        view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.taobao.android.litecreator.sdk.framework.container.panel.impl.a.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Boolean) ipChange2.ipc$dispatch("5acfbc33", new Object[]{this})).booleanValue();
                }
                view.getViewTreeObserver().removeOnPreDrawListener(this);
                a aVar = a.this;
                View view2 = view;
                a.a(aVar, view2, view2.getWidth(), view.getHeight());
                return true;
            }
        });
        this.o.push(view);
    }

    @Override // tb.het
    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : e() > 0;
    }

    private void a(View view, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c25114a", new Object[]{this, view, new Integer(i), new Integer(i2)});
        } else if (view == null) {
        } else {
            u.b("LCPanelContainer", "contentview.onPreDraw. contentView width=" + view.getWidth() + ", height=" + view.getHeight());
            this.h = i2;
            d();
        }
    }

    private void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.i = true;
        final int e = e();
        if (a(e)) {
            this.n.e();
        } else {
            this.m = this.o.get(e - 2);
        }
        ObjectAnimator objectAnimator = this.l;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            this.l.cancel();
        }
        View view = null;
        if (this.o.size() > 0) {
            view = this.o.peek();
        }
        if (b(e) && view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.android.litecreator.sdk.framework.container.panel.impl.a.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                    }
                }
            });
        }
        this.k = ObjectAnimator.ofFloat(view, "translationY", this.h, 0.0f);
        this.k.setDuration(200L);
        this.k.setInterpolator(new AccelerateDecelerateInterpolator());
        this.k.addListener(new C0520a() { // from class: com.taobao.android.litecreator.sdk.framework.container.panel.impl.a.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.litecreator.sdk.framework.container.panel.impl.a.C0520a, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    return;
                }
                u.b("LCPanelContainer", "show animation end.");
                if (a.a(a.this, e)) {
                    a.b(a.this).b();
                }
                a.a(a.this, false);
            }
        });
        this.k.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.android.litecreator.sdk.framework.container.panel.impl.a.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    return;
                }
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!a.b(a.this, e) || a.c(a.this) == null) {
                    return;
                }
                a.c(a.this).setAlpha(floatValue / a.d(a.this));
            }
        });
        this.k.start();
    }

    private int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : this.o.size();
    }

    private void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        this.i = true;
        final int e = e();
        if (a(e)) {
            g().f();
        }
        ObjectAnimator objectAnimator = this.k;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            this.k.cancel();
        }
        final View peek = this.o.peek();
        this.l = ObjectAnimator.ofFloat(peek, "translationY", 0.0f, this.h);
        this.l.setDuration(200L);
        this.l.addListener(new C0520a() { // from class: com.taobao.android.litecreator.sdk.framework.container.panel.impl.a.6
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.litecreator.sdk.framework.container.panel.impl.a.C0520a, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    return;
                }
                u.b("LCPanelContainer", "close animation end.");
                if (a.b(a.this, e)) {
                    a.e(a.this).removeView(peek);
                    a.f(a.this).pop();
                    if (a.g(a.this).size() > 0) {
                        a.g(a.this).pop();
                    }
                } else {
                    a.e(a.this).removeView(peek);
                    a.h(a.this).removeView(a.e(a.this));
                    a.f(a.this).clear();
                    if (a.g(a.this).size() > 0) {
                        a aVar = a.this;
                        a.a(aVar, a.b(aVar));
                    }
                    a.g(a.this).clear();
                }
                if (a.a(a.this, e)) {
                    a.a(a.this).c();
                }
                a.a(a.this, false);
            }
        });
        this.l.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.android.litecreator.sdk.framework.container.panel.impl.a.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    return;
                }
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!a.b(a.this, e) || a.c(a.this) == null || a.d(a.this) == 0) {
                    return;
                }
                a.c(a.this).setAlpha(floatValue / a.d(a.this));
            }
        });
        this.l.start();
    }

    private heu g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (heu) ipChange.ipc$dispatch("3d2f5540", new Object[]{this});
        }
        if (this.p.size() > 0) {
            return this.p.peek();
        }
        return this.n;
    }

    @Override // tb.het
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (e() <= 0 || this.i) {
            u.d("LCPanelContainer", "show panel. but contentView is null!");
        } else {
            View peek = this.o.peek();
            c(peek);
            c(this.g);
            u.b("LCPanelContainer", "perform show panel.");
            this.g.addView(peek, new FrameLayout.LayoutParams(-1, -2, 80));
            this.f.addView(this.g);
            this.g.onShow();
        }
    }

    private void c(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d050128", new Object[]{this, view});
        } else if (view.getParent() == null) {
        } else {
            ((ViewGroup) view.getParent()).removeView(view);
        }
    }

    @Override // tb.het
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.o.isEmpty() || this.i) {
        } else {
            u.b("LCPanelContainer", "perform close panel.");
            f();
        }
    }

    @Override // tb.het
    public boolean b(View view) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9103724d", new Object[]{this, view})).booleanValue() : this.o.contains(view);
    }
}
