package com.taobao.android.searchbaseframe.meta.uikit;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import kotlin.TypeCastException;
import kotlin.jvm.internal.q;
import tb.htf;
import tb.itk;
import tb.kge;

/* loaded from: classes6.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ValueAnimator f14979a;
    private int b;
    private boolean c;
    private final int d;
    private final boolean e;
    private final htf f;
    private final MetaLayout g;

    /* renamed from: com.taobao.android.searchbaseframe.meta.uikit.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static final class RunnableC0574a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public RunnableC0574a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            htf a2 = a.a(a.this);
            if (a2 == null) {
                return;
            }
            a2.a();
        }
    }

    static {
        kge.a(1635410576);
    }

    public a(int i, boolean z, htf htfVar, MetaLayout metaLayout) {
        q.c(metaLayout, "metaLayout");
        this.d = i;
        this.e = z;
        this.f = htfVar;
        this.g = metaLayout;
        this.f14979a = ValueAnimator.ofInt(0, this.d);
        this.f14979a.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.taobao.android.searchbaseframe.meta.uikit.a.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator it) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, it});
                    return;
                }
                q.a((Object) it, "it");
                Object animatedValue = it.getAnimatedValue();
                if (animatedValue == null) {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
                }
                int intValue = ((Integer) animatedValue).intValue();
                int b = intValue - a.b(a.this);
                a.a(a.this, intValue);
                a.b(a.this, b);
            }
        });
        this.f14979a.addListener(new AnimatorListenerAdapter() { // from class: com.taobao.android.searchbaseframe.meta.uikit.a.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: com.taobao.android.searchbaseframe.meta.uikit.a$2$a  reason: collision with other inner class name */
            /* loaded from: classes6.dex */
            public static final class RunnableC0573a implements Runnable {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public RunnableC0573a() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    htf a2 = a.a(a.this);
                    if (a2 == null) {
                        return;
                    }
                    a2.a();
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                    return;
                }
                a.c(a.this).post(new RunnableC0573a());
                a.a(a.this, false);
            }
        });
        ValueAnimator animator = this.f14979a;
        q.a((Object) animator, "animator");
        animator.setInterpolator(new DecelerateInterpolator());
    }

    public static final /* synthetic */ htf a(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (htf) ipChange.ipc$dispatch("7bc777ab", new Object[]{aVar}) : aVar.f;
    }

    public static final /* synthetic */ void a(a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c9d4902", new Object[]{aVar, new Integer(i)});
        } else {
            aVar.b = i;
        }
    }

    public static final /* synthetic */ void a(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c9d88d3", new Object[]{aVar, new Boolean(z)});
        } else {
            aVar.c = z;
        }
    }

    public static final /* synthetic */ int b(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fd9c6cb3", new Object[]{aVar})).intValue() : aVar.b;
    }

    public static final /* synthetic */ void b(a aVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5f19e43", new Object[]{aVar, new Integer(i)});
        } else {
            aVar.a(i);
        }
    }

    public static final /* synthetic */ MetaLayout c(a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (MetaLayout) ipChange.ipc$dispatch("32f312ce", new Object[]{aVar}) : aVar.g;
    }

    private final void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        Iterator<itk> it = this.g.originHeaders.iterator();
        while (it.hasNext() && (i = i - it.next().a(i, this.g.getListStart(), 0)) != 0) {
        }
        this.g.updateListTranslation(false);
        this.g.notifyHeaderScroll();
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.e) {
            this.c = true;
            this.f14979a.start();
        } else {
            a(this.d);
            this.g.post(new RunnableC0574a());
        }
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!this.c) {
        } else {
            this.f14979a.cancel();
            this.c = false;
        }
    }
}
