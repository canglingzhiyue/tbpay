package com.alibaba.triver.triver_shop.shop2023.template;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.HorizontalScrollView;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.newShop.ext.o;
import com.alibaba.triver.triver_shop.shop2023.data.ShopComponentModel;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import kotlin.Result;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.kge;

/* loaded from: classes3.dex */
public final class Shop2023HeaderTagListTemplate extends com.alibaba.triver.triver_shop.shop2023.template.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private AutoScrollAndScrollableTagView f;

    /* loaded from: classes3.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            AutoScrollAndScrollableTagView o = Shop2023HeaderTagListTemplate.this.o();
            if (o == null) {
                return;
            }
            o.pauseAnimation();
        }
    }

    /* loaded from: classes3.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            AutoScrollAndScrollableTagView o = Shop2023HeaderTagListTemplate.this.o();
            if (o == null) {
                return;
            }
            o.resumeAnimation();
        }
    }

    /* loaded from: classes3.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            AutoScrollAndScrollableTagView o = Shop2023HeaderTagListTemplate.this.o();
            if (o == null) {
                return;
            }
            o.startScroll();
        }
    }

    static {
        kge.a(1398076205);
    }

    public static /* synthetic */ Object ipc$super(Shop2023HeaderTagListTemplate shop2023HeaderTagListTemplate, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1862045111) {
            super.b((View) objArr[0]);
            return null;
        } else if (hashCode != -511102794) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            super.a((Context) objArr[0], (com.alibaba.triver.triver_shop.newShop.data.d) objArr[1], (com.alibaba.triver.triver_shop.newShop.ext.e) objArr[2], (JSONObject) objArr[3]);
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Shop2023HeaderTagListTemplate(ShopComponentModel shopComponentModel) {
        super(shopComponentModel);
        q.d(shopComponentModel, "shopComponentModel");
    }

    public final AutoScrollAndScrollableTagView o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AutoScrollAndScrollableTagView) ipChange.ipc$dispatch("c7c17e93", new Object[]{this}) : this.f;
    }

    @Override // com.alibaba.triver.triver_shop.shop2023.template.a, com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.a
    public void a(Context context, com.alibaba.triver.triver_shop.newShop.data.d shopData, com.alibaba.triver.triver_shop.newShop.ext.e shopDXEngine, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e18930b6", new Object[]{this, context, shopData, shopDXEngine, jSONObject});
            return;
        }
        q.d(context, "context");
        q.d(shopData, "shopData");
        q.d(shopDXEngine, "shopDXEngine");
        super.a(context, shopData, shopDXEngine, jSONObject);
        this.f = new AutoScrollAndScrollableTagView(context);
        AutoScrollAndScrollableTagView autoScrollAndScrollableTagView = this.f;
        if (autoScrollAndScrollableTagView != null) {
            o.b(autoScrollAndScrollableTagView, d());
        }
        AutoScrollAndScrollableTagView autoScrollAndScrollableTagView2 = this.f;
        if (autoScrollAndScrollableTagView2 != null) {
            autoScrollAndScrollableTagView2.setContentView(d());
        }
        a(l().getDXJSONConfig(), shopData.bc().a(l().getData()), true);
    }

    @Override // com.alibaba.triver.triver_shop.shop2023.template.a, com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.a
    public void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91037249", new Object[]{this, view});
            return;
        }
        q.d(view, "view");
        c().c().a((DXRootView) view, new com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.c(b(), this));
        super.b(view);
    }

    public final void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        AutoScrollAndScrollableTagView autoScrollAndScrollableTagView = this.f;
        if (autoScrollAndScrollableTagView == null) {
            return;
        }
        autoScrollAndScrollableTagView.post(new c());
    }

    public final void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bfbf9", new Object[]{this});
            return;
        }
        AutoScrollAndScrollableTagView autoScrollAndScrollableTagView = this.f;
        if (autoScrollAndScrollableTagView == null) {
            return;
        }
        autoScrollAndScrollableTagView.post(new a());
    }

    public final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a137a", new Object[]{this});
            return;
        }
        AutoScrollAndScrollableTagView autoScrollAndScrollableTagView = this.f;
        if (autoScrollAndScrollableTagView == null) {
            return;
        }
        autoScrollAndScrollableTagView.post(new b());
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.component.templateComponent.a
    public View f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("8c57b8ef", new Object[]{this});
        }
        AutoScrollAndScrollableTagView autoScrollAndScrollableTagView = this.f;
        q.a(autoScrollAndScrollableTagView);
        return autoScrollAndScrollableTagView;
    }

    /* loaded from: classes3.dex */
    public static final class AutoScrollAndScrollableTagView extends HorizontalScrollView {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private View contentView;
        private Animator scrollAnimation;

        /* loaded from: classes3.dex */
        public static final class b implements ValueAnimator.AnimatorUpdateListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ int b;

            public b(int i) {
                this.b = i;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                    return;
                }
                AutoScrollAndScrollableTagView autoScrollAndScrollableTagView = AutoScrollAndScrollableTagView.this;
                int i = this.b;
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                }
                autoScrollAndScrollableTagView.scrollTo(i + ((Integer) animatedValue).intValue(), AutoScrollAndScrollableTagView.this.getScrollY());
            }
        }

        /* loaded from: classes3.dex */
        public static final class c implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public c() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    AutoScrollAndScrollableTagView.access$realStart(AutoScrollAndScrollableTagView.this);
                }
            }
        }

        static {
            kge.a(-842806124);
        }

        public static /* synthetic */ Object ipc$super(AutoScrollAndScrollableTagView autoScrollAndScrollableTagView, String str, Object... objArr) {
            if (str.hashCode() == 2075560917) {
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AutoScrollAndScrollableTagView(Context context) {
            super(context);
            q.d(context, "context");
            setSmoothScrollingEnabled(false);
            setHorizontalScrollBarEnabled(false);
        }

        public static final /* synthetic */ void access$realStart(AutoScrollAndScrollableTagView autoScrollAndScrollableTagView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("78056ae2", new Object[]{autoScrollAndScrollableTagView});
            } else {
                autoScrollAndScrollableTagView.realStart();
            }
        }

        public final View getContentView() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("ce219891", new Object[]{this}) : this.contentView;
        }

        public final void setContentView(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6459ac6f", new Object[]{this, view});
            } else {
                this.contentView = view;
            }
        }

        public final Animator getScrollAnimation() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (Animator) ipChange.ipc$dispatch("c4c259eb", new Object[]{this}) : this.scrollAnimation;
        }

        public final void setScrollAnimation(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("99b39a99", new Object[]{this, animator});
            } else {
                this.scrollAnimation = animator;
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
            }
            Animator animator = this.scrollAnimation;
            if (animator != null) {
                animator.cancel();
                setScrollAnimation(null);
            }
            return super.dispatchTouchEvent(motionEvent);
        }

        public final void startScroll() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("75254ad6", new Object[]{this});
                return;
            }
            View view = this.contentView;
            if (view == null) {
                return;
            }
            view.postDelayed(new c(), 500L);
        }

        private final void realStart() {
            View view;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b187ffeb", new Object[]{this});
            } else if (this.scrollAnimation != null || (view = this.contentView) == null || view.getWidth() <= getWidth()) {
            } else {
                startLeftToRight(view.getWidth() - getWidth());
            }
        }

        public final void pauseAnimation() {
            t tVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ca8a27b5", new Object[]{this});
                return;
            }
            try {
                Result.a aVar = Result.Companion;
                Animator scrollAnimation = getScrollAnimation();
                if (scrollAnimation == null) {
                    tVar = null;
                } else {
                    scrollAnimation.pause();
                    tVar = t.INSTANCE;
                }
                Result.m2371constructorimpl(tVar);
            } catch (Throwable th) {
                Result.a aVar2 = Result.Companion;
                Result.m2371constructorimpl(kotlin.i.a(th));
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x002e, code lost:
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void resumeAnimation() {
            /*
                r4 = this;
                com.android.alibaba.ip.runtime.IpChange r0 = com.alibaba.triver.triver_shop.shop2023.template.Shop2023HeaderTagListTemplate.AutoScrollAndScrollableTagView.$ipChange
                boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L12
                java.lang.Object[] r1 = new java.lang.Object[r3]
                r1[r2] = r4
                java.lang.String r2 = "7ef216de"
                r0.ipc$dispatch(r2, r1)
                return
            L12:
                kotlin.Result$a r0 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L40
                android.animation.Animator r0 = r4.getScrollAnimation()     // Catch: java.lang.Throwable -> L40
                if (r0 != 0) goto L1e
                r4.realStart()     // Catch: java.lang.Throwable -> L40
                return
            L1e:
                android.animation.Animator r0 = r4.getScrollAnimation()     // Catch: java.lang.Throwable -> L40
                if (r0 != 0) goto L25
                goto L2c
            L25:
                boolean r0 = r0.isRunning()     // Catch: java.lang.Throwable -> L40
                if (r0 != r3) goto L2c
                r2 = 1
            L2c:
                if (r2 != 0) goto L2f
                return
            L2f:
                android.animation.Animator r0 = r4.getScrollAnimation()     // Catch: java.lang.Throwable -> L40
                if (r0 != 0) goto L37
                r0 = 0
                goto L3c
            L37:
                r0.resume()     // Catch: java.lang.Throwable -> L40
                kotlin.t r0 = kotlin.t.INSTANCE     // Catch: java.lang.Throwable -> L40
            L3c:
                kotlin.Result.m2371constructorimpl(r0)     // Catch: java.lang.Throwable -> L40
                return
            L40:
                r0 = move-exception
                kotlin.Result$a r1 = kotlin.Result.Companion
                java.lang.Object r0 = kotlin.i.a(r0)
                kotlin.Result.m2371constructorimpl(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alibaba.triver.triver_shop.shop2023.template.Shop2023HeaderTagListTemplate.AutoScrollAndScrollableTagView.resumeAnimation():void");
        }

        private final void startLeftToRight(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("54e021c4", new Object[]{this, new Integer(i)});
                return;
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(i);
            ofInt.setDuration(15000L);
            ofInt.addListener(new a());
            ofInt.addUpdateListener(new b(getScrollX()));
            ofInt.setInterpolator(new LinearInterpolator());
            ofInt.start();
            this.scrollAnimation = ofInt;
        }

        /* loaded from: classes3.dex */
        public static final class a implements Animator.AnimatorListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animation) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("90a3af63", new Object[]{this, animation});
                } else {
                    q.d(animation, "animation");
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animation) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("4388ea84", new Object[]{this, animation});
                } else {
                    q.d(animation, "animation");
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animation) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3a405721", new Object[]{this, animation});
                } else {
                    q.d(animation, "animation");
                }
            }

            public a() {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8024e25a", new Object[]{this, animation});
                    return;
                }
                q.d(animation, "animation");
                AutoScrollAndScrollableTagView.this.setScrollAnimation(null);
            }
        }
    }
}
