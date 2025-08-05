package com.taobao.search.musie.pager;

import android.animation.ValueAnimator;
import android.content.Context;
import android.support.v4.view.NestedScrollingParent2;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_uikit.ui.MUSView;
import com.taobao.android.weex_uikit.ui.i;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.q;
import tb.jwu;
import tb.kge;
import tb.rwf;

/* loaded from: classes7.dex */
public final class TbSlideLayout extends FrameLayout implements NestedScrollingParent2, b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private g adapter;
    private ValueAnimator bounceAnim;
    private final d divider;
    private boolean footerOverInvoke;
    private float footerTranslation;
    private MUSView footerView;
    private final float fraction;
    private boolean hasRequested;
    private MUSDKInstance instance;
    private int invokeDistance;
    private int maxDragDistance;
    private boolean nestedScrolling;
    private TbSlide node;
    private final RecyclerView recyclerView;
    private final e snapHelper;
    private boolean touching;

    /* loaded from: classes7.dex */
    public static final class a implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

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
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
            }
            TbSlideLayout.access$setFooterTranslation$p(TbSlideLayout.this, ((Float) animatedValue).floatValue());
            TbSlideLayout.access$updateTranslation(TbSlideLayout.this);
        }
    }

    static {
        kge.a(1294038053);
        kge.a(-2000658237);
        kge.a(-1567909089);
    }

    public static /* synthetic */ Object ipc$super(TbSlideLayout tbSlideLayout, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -244855388) {
            super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
            return null;
        } else if (hashCode != 2075560917) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        }
    }

    @Override // android.support.v4.view.NestedScrollingParent2
    public void onNestedScrollAccepted(View child, View target, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da61a091", new Object[]{this, child, target, new Integer(i), new Integer(i2)});
            return;
        }
        q.c(child, "child");
        q.c(target, "target");
    }

    public TbSlideLayout(Context context) {
        super(context);
        this.fraction = 0.3f;
        this.recyclerView = new RecyclerView(context);
        this.snapHelper = new e(this);
        this.divider = new d();
        this.recyclerView.setLayoutManager(new LinearLayoutManager(context, 0, false));
        this.recyclerView.addItemDecoration(this.divider);
        addView(this.recyclerView, new FrameLayout.LayoutParams(-1, -1));
        ViewCompat.setNestedScrollingEnabled(this.recyclerView, true);
        this.snapHelper.attachToRecyclerView(this.recyclerView);
    }

    public static final /* synthetic */ void access$setFooterTranslation$p(TbSlideLayout tbSlideLayout, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c69186b", new Object[]{tbSlideLayout, new Float(f)});
        } else {
            tbSlideLayout.footerTranslation = f;
        }
    }

    public static final /* synthetic */ void access$updateTranslation(TbSlideLayout tbSlideLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8f034ed", new Object[]{tbSlideLayout});
        } else {
            tbSlideLayout.updateTranslation();
        }
    }

    public final void mount(TbSlide node) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50f281e6", new Object[]{this, node});
            return;
        }
        q.c(node, "node");
        this.instance = node.getInstance();
        this.footerView = jwu.a(this.instance);
        MUSView mUSView = this.footerView;
        if (mUSView == null) {
            q.a();
        }
        mUSView.setRoot(false);
        addView(this.footerView);
        MUSDKInstance tbSlide = node.getInstance();
        q.a((Object) tbSlide, "node.instance");
        this.adapter = new g(tbSlide);
        this.recyclerView.setAdapter(this.adapter);
        this.node = node;
    }

    public final void unmount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f4059a7", new Object[]{this});
            return;
        }
        g gVar = this.adapter;
        if (gVar != null) {
            gVar.a();
        }
        this.recyclerView.setAdapter(null);
        MUSView mUSView = this.footerView;
        if (mUSView != null) {
            mUSView.release(true);
            this.footerView = null;
        }
        this.footerTranslation = 0.0f;
        this.node = null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        updateTranslation();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (motionEvent == null) {
            q.a();
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.touching = true;
        } else if (action == 1 || action == 3) {
            this.touching = false;
        }
        if (this.nestedScrolling) {
            if (!this.hasRequested) {
                getParent().requestDisallowInterceptTouchEvent(true);
                this.hasRequested = true;
            }
        } else if (this.hasRequested) {
            getParent().requestDisallowInterceptTouchEvent(false);
            this.hasRequested = false;
        }
        return dispatchTouchEvent;
    }

    private final void updateFooter(TbSlideFooter tbSlideFooter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2da2780", new Object[]{this, tbSlideFooter});
        } else if (tbSlideFooter == null) {
            MUSView mUSView = this.footerView;
            if (mUSView == null) {
                return;
            }
            mUSView.release(true);
        } else {
            i iVar = new i();
            iVar.a(tbSlideFooter);
            MUSView mUSView2 = this.footerView;
            if (mUSView2 == null) {
                return;
            }
            mUSView2.setUiNodeTree(iVar);
        }
    }

    public final void refresh(List<? extends i> itemList, TbSlideFooter tbSlideFooter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce230bf8", new Object[]{this, itemList, tbSlideFooter});
            return;
        }
        q.c(itemList, "itemList");
        g gVar = this.adapter;
        if (gVar != null) {
            gVar.a(itemList);
        }
        updateFooter(tbSlideFooter);
    }

    public final void updateItemMargin(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69e49d52", new Object[]{this, new Integer(i)});
            return;
        }
        this.divider.a(i);
        this.recyclerView.invalidateItemDecorations();
        this.snapHelper.a(i);
    }

    public final void updateItemSpacing(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91d76295", new Object[]{this, new Integer(i)});
            return;
        }
        this.divider.b(i);
        this.recyclerView.invalidateItemDecorations();
    }

    public final void updateMaxDistance(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c445c6c", new Object[]{this, new Integer(i)});
            return;
        }
        this.maxDragDistance = i;
        float f = this.footerTranslation;
        int i2 = this.maxDragDistance;
        if (f >= (-i2)) {
            return;
        }
        this.footerTranslation = -i2;
        updateTranslation();
    }

    public final void updateInvokeDistance(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8657f366", new Object[]{this, new Integer(i)});
            return;
        }
        this.invokeDistance = i;
        checkStateChange();
    }

    private final void checkStateChange() {
        TbSlide tbSlide;
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34b34180", new Object[]{this});
            return;
        }
        if (this.footerTranslation <= (-this.invokeDistance)) {
            z = true;
        }
        if (z != this.footerOverInvoke && (tbSlide = this.node) != null) {
            tbSlide.onStateChange(z);
        }
        this.footerOverInvoke = z;
    }

    @Override // android.support.v4.view.NestedScrollingParent2
    public boolean onStartNestedScroll(View child, View target, int i, int i2) {
        IpChange ipChange = $ipChange;
        boolean z = false;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3643ce32", new Object[]{this, child, target, new Integer(i), new Integer(i2)})).booleanValue();
        }
        q.c(child, "child");
        q.c(target, "target");
        if (i == 1) {
            z = true;
        }
        if (z) {
            ValueAnimator valueAnimator = this.bounceAnim;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.bounceAnim = null;
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, android.support.v4.view.NestedScrollingParent
    public boolean onNestedPreFling(View target, float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a49f72c0", new Object[]{this, target, new Float(f), new Float(f2)})).booleanValue();
        }
        q.c(target, "target");
        return this.footerTranslation < ((float) 0);
    }

    @Override // android.support.v4.view.NestedScrollingParent2
    public void onStopNestedScroll(View target, int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaf68c3d", new Object[]{this, target, new Integer(i)});
            return;
        }
        q.c(target, "target");
        if (this.footerTranslation < 0) {
            ValueAnimator valueAnimator = this.bounceAnim;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.bounceAnim = ValueAnimator.ofFloat(this.footerTranslation, 0.0f);
            ValueAnimator valueAnimator2 = this.bounceAnim;
            if (valueAnimator2 == null) {
                q.a();
            }
            valueAnimator2.addUpdateListener(new a());
            ValueAnimator valueAnimator3 = this.bounceAnim;
            if (valueAnimator3 == null) {
                q.a();
            }
            valueAnimator3.start();
            TbSlide tbSlide = this.node;
            if (tbSlide != null) {
                if (this.footerTranslation >= (-this.invokeDistance)) {
                    z = false;
                }
                tbSlide.onBounceBack(z);
            }
        }
        this.nestedScrolling = false;
    }

    @Override // android.support.v4.view.NestedScrollingParent2
    public void onNestedScroll(View target, int i, int i2, int i3, int i4, int i5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64bba3db", new Object[]{this, target, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)});
            return;
        }
        q.c(target, "target");
        if (i3 <= 0 && this.footerTranslation >= 0) {
            return;
        }
        ValueAnimator valueAnimator = this.bounceAnim;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        consume(i3, null);
        this.nestedScrolling = true;
    }

    @Override // android.support.v4.view.NestedScrollingParent2
    public void onNestedPreScroll(View target, int i, int i2, int[] iArr, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("472edc84", new Object[]{this, target, new Integer(i), new Integer(i2), iArr, new Integer(i3)});
            return;
        }
        q.c(target, "target");
        if (this.footerTranslation >= 0) {
            return;
        }
        ValueAnimator valueAnimator = this.bounceAnim;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        consume(i, iArr);
        this.nestedScrolling = true;
    }

    private final void updateTranslation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc776aaf", new Object[]{this});
            return;
        }
        this.recyclerView.setTranslationX(this.footerTranslation);
        MUSView mUSView = this.footerView;
        if (mUSView != null) {
            mUSView.setTranslationX(this.recyclerView.getMeasuredWidth() + this.footerTranslation);
        }
        checkStateChange();
    }

    private final void consume(int i, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810077ee", new Object[]{this, new Integer(i), iArr});
            return;
        }
        if (i < 0) {
            i = rwf.d((int) Math.abs(this.footerTranslation / this.fraction), i);
        }
        if (iArr != null) {
            iArr[0] = i;
        }
        this.footerTranslation -= i * this.fraction;
        float f = this.footerTranslation;
        int i2 = this.maxDragDistance;
        if (f < (-i2)) {
            this.footerTranslation = -i2;
        } else if (f > 0) {
            this.footerTranslation = 0.0f;
        }
        updateTranslation();
    }

    @Override // com.taobao.search.musie.pager.b
    public void onItemSelected(int i) {
        TbSlide tbSlide;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcb34d2f", new Object[]{this, new Integer(i)});
        } else if (i < 0 || (tbSlide = this.node) == null) {
        } else {
            tbSlide.onItemSelected(i);
        }
    }

    public final boolean isTouching() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("81ad9998", new Object[]{this})).booleanValue() : this.touching;
    }

    public final void scrollToPosition(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("161fb68b", new Object[]{this, new Integer(i)});
            return;
        }
        RecyclerView.LayoutManager layoutManager = this.recyclerView.getLayoutManager();
        if (layoutManager == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
        }
        c cVar = new c(this.recyclerView.getContext(), this.divider.a());
        cVar.setTargetPosition(i);
        ((LinearLayoutManager) layoutManager).startSmoothScroll(cVar);
    }
}
