package com.alibaba.triver.triver_shop.container.shopLoft;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.container.shopLoft.ShopContentRecyclerView;
import com.alibaba.triver.triver_shop.container.shopLoft.b;
import com.alibaba.triver.triver_shop.container.shopLoft.f;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.List;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.cen;
import tb.kge;
import tb.ruk;

/* loaded from: classes3.dex */
public final class ShopLoftComponentView extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private com.alibaba.triver.triver_shop.container.shopLoft.f adapter;
    private boolean allowSwipe;
    private ruk<t> closePageCallback;
    private GestureDetector detector;
    private final boolean enableShopLoftLiveCardDisableSwipe;
    private final boolean enableShopLoftSwipeLimit;
    private boolean enableSwipeUpAutoCloseShopLoft;
    private float firstX;
    private float firstY;
    private boolean hasMoveAction;
    private boolean hasNext;
    private boolean isSettling;
    private boolean lastItemIsLiveCard;
    private LinearLayoutManager manager;
    private ShopContentRecyclerView recyclerView;
    private final int swipeThreshold;
    private ShopContentRecyclerView.a swipeToBottomCallback;
    private boolean userCanDrag;

    /* loaded from: classes3.dex */
    public interface a {
        void a();

        void b();
    }

    /* loaded from: classes3.dex */
    public static final class e extends LinearLayoutManager {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e(Context context) {
            super(context);
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            if (str.hashCode() == 514551467) {
                return new Boolean(super.canScrollVertically());
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
        public boolean canScrollVertically() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("1eab6eab", new Object[]{this})).booleanValue() : ShopLoftComponentView.access$getAllowSwipe$p(ShopLoftComponentView.this) && super.canScrollVertically();
        }
    }

    /* loaded from: classes3.dex */
    public static final class f extends RecyclerView.OnScrollListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int b;

        public f() {
        }

        @Override // android.support.v7.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7fb6f2bf", new Object[]{this, recyclerView, new Integer(i)});
            } else if (!ShopLoftComponentView.access$getEnableShopLoftSwipeLimit$p(ShopLoftComponentView.this)) {
            } else {
                int i2 = this.b;
                this.b = i;
                if (i == 2) {
                    ShopLoftComponentView.access$setSettling$p(ShopLoftComponentView.this, true);
                    return;
                }
                ShopLoftComponentView.access$setSettling$p(ShopLoftComponentView.this, false);
                if (i2 != 1 || i == i2) {
                    return;
                }
                ShopLoftComponentView.access$onUserDragFinish(ShopLoftComponentView.this);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ShopContentRecyclerView.a swipeToBottomCallback;
            List<JSONObject> b;
            IpChange ipChange = $ipChange;
            int i = 0;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ShopContentRecyclerView recyclerView = ShopLoftComponentView.this.getRecyclerView();
            if (recyclerView != null) {
                recyclerView.notifyPositionChanged();
            }
            com.alibaba.triver.triver_shop.container.shopLoft.f access$getAdapter$p = ShopLoftComponentView.access$getAdapter$p(ShopLoftComponentView.this);
            if (access$getAdapter$p != null && (b = access$getAdapter$p.b()) != null) {
                i = b.size();
            }
            if (i > 1) {
                return;
            }
            if (!ShopLoftComponentView.this.getHasNext()) {
                Context context = ShopLoftComponentView.this.getContext();
                q.b(context, "context");
                com.alibaba.triver.triver_shop.newShop.ext.b.a(context);
                return;
            }
            ShopContentRecyclerView recyclerView2 = ShopLoftComponentView.this.getRecyclerView();
            if (recyclerView2 == null || (swipeToBottomCallback = recyclerView2.getSwipeToBottomCallback()) == null) {
                return;
            }
            swipeToBottomCallback.a();
        }
    }

    static {
        kge.a(1198041737);
    }

    public static /* synthetic */ Object ipc$super(ShopLoftComponentView shopLoftComponentView, String str, Object... objArr) {
        if (str.hashCode() == 2075560917) {
            return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static final /* synthetic */ com.alibaba.triver.triver_shop.container.shopLoft.f access$getAdapter$p(ShopLoftComponentView shopLoftComponentView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.triver.triver_shop.container.shopLoft.f) ipChange.ipc$dispatch("31460ca9", new Object[]{shopLoftComponentView}) : shopLoftComponentView.adapter;
    }

    public static final /* synthetic */ boolean access$getAllowSwipe$p(ShopLoftComponentView shopLoftComponentView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("63a8b4a2", new Object[]{shopLoftComponentView})).booleanValue() : shopLoftComponentView.allowSwipe;
    }

    public static final /* synthetic */ boolean access$getEnableShopLoftSwipeLimit$p(ShopLoftComponentView shopLoftComponentView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7c8acc8", new Object[]{shopLoftComponentView})).booleanValue() : shopLoftComponentView.enableShopLoftSwipeLimit;
    }

    public static final /* synthetic */ void access$onUserDragFinish(ShopLoftComponentView shopLoftComponentView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47b0da80", new Object[]{shopLoftComponentView});
        } else {
            shopLoftComponentView.onUserDragFinish();
        }
    }

    public static final /* synthetic */ void access$setAllowSwipe$p(ShopLoftComponentView shopLoftComponentView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d576e802", new Object[]{shopLoftComponentView, new Boolean(z)});
        } else {
            shopLoftComponentView.allowSwipe = z;
        }
    }

    public static final /* synthetic */ void access$setSettling$p(ShopLoftComponentView shopLoftComponentView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3d6a059", new Object[]{shopLoftComponentView, new Boolean(z)});
        } else {
            shopLoftComponentView.isSettling = z;
        }
    }

    public static final /* synthetic */ void access$setUserCanDrag$p(ShopLoftComponentView shopLoftComponentView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18767426", new Object[]{shopLoftComponentView, new Boolean(z)});
        } else {
            shopLoftComponentView.userCanDrag = z;
        }
    }

    public final ShopContentRecyclerView getRecyclerView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ShopContentRecyclerView) ipChange.ipc$dispatch("633f9b9d", new Object[]{this}) : this.recyclerView;
    }

    public final void setRecyclerView(ShopContentRecyclerView shopContentRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdfbd3bf", new Object[]{this, shopContentRecyclerView});
        } else {
            this.recyclerView = shopContentRecyclerView;
        }
    }

    public final boolean getHasNext() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("d9ff6182", new Object[]{this})).booleanValue() : this.hasNext;
    }

    public final void setHasNext(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c367c22", new Object[]{this, new Boolean(z)});
        } else {
            this.hasNext = z;
        }
    }

    public final boolean getEnableSwipeUpAutoCloseShopLoft() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("df380b7f", new Object[]{this})).booleanValue() : this.enableSwipeUpAutoCloseShopLoft;
    }

    public final void setEnableSwipeUpAutoCloseShopLoft(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97a96e2d", new Object[]{this, new Boolean(z)});
        } else {
            this.enableSwipeUpAutoCloseShopLoft = z;
        }
    }

    public final boolean getLastItemIsLiveCard() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e69c910", new Object[]{this})).booleanValue() : this.lastItemIsLiveCard;
    }

    public final void setLastItemIsLiveCard(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4fff0bc", new Object[]{this, new Boolean(z)});
        } else {
            this.lastItemIsLiveCard = z;
        }
    }

    public final boolean getEnableShopLoftLiveCardDisableSwipe() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f1ca6059", new Object[]{this})).booleanValue() : this.enableShopLoftLiveCardDisableSwipe;
    }

    public final ruk<t> getClosePageCallback() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ruk) ipChange.ipc$dispatch("e6be9381", new Object[]{this}) : this.closePageCallback;
    }

    public final void setClosePageCallback(ruk<t> rukVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ed96b39", new Object[]{this, rukVar});
        } else {
            this.closePageCallback = rukVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopLoftComponentView(Context context) {
        super(context);
        q.d(context, "context");
        this.allowSwipe = true;
        this.enableShopLoftSwipeLimit = cen.Companion.u();
        this.userCanDrag = true;
        this.swipeThreshold = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.hasNext = true;
        this.enableShopLoftLiveCardDisableSwipe = cen.Companion.S();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopLoftComponentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q.d(context, "context");
        this.allowSwipe = true;
        this.enableShopLoftSwipeLimit = cen.Companion.u();
        this.userCanDrag = true;
        this.swipeThreshold = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.hasNext = true;
        this.enableShopLoftLiveCardDisableSwipe = cen.Companion.S();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopLoftComponentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        q.d(context, "context");
        this.allowSwipe = true;
        this.enableShopLoftSwipeLimit = cen.Companion.u();
        this.userCanDrag = true;
        this.swipeThreshold = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.hasNext = true;
        this.enableShopLoftLiveCardDisableSwipe = cen.Companion.S();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopLoftComponentView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        q.d(context, "context");
        this.allowSwipe = true;
        this.enableShopLoftSwipeLimit = cen.Companion.u();
        this.userCanDrag = true;
        this.swipeThreshold = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.hasNext = true;
        this.enableShopLoftLiveCardDisableSwipe = cen.Companion.S();
    }

    public final void init() {
        b.a j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else if (this.adapter == null) {
        } else {
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.view_shop_loft_component_view, (ViewGroup) null);
            q.b(inflate, "from(context).inflate(R.layout.view_shop_loft_component_view, null)");
            addView(inflate);
            this.recyclerView = (ShopContentRecyclerView) inflate.findViewById(R.id.shopLoftContentList);
            ShopContentRecyclerView shopContentRecyclerView = this.recyclerView;
            if (shopContentRecyclerView != null) {
                com.alibaba.triver.triver_shop.container.shopLoft.f fVar = this.adapter;
                q.a(fVar);
                shopContentRecyclerView.setSwipeToItemCallback(fVar.g());
            }
            ShopContentRecyclerView shopContentRecyclerView2 = this.recyclerView;
            if (shopContentRecyclerView2 != null) {
                shopContentRecyclerView2.setSwipeToBottomCallback(this.swipeToBottomCallback);
            }
            this.manager = new e(getContext());
            ShopContentRecyclerView shopContentRecyclerView3 = this.recyclerView;
            if (shopContentRecyclerView3 != null) {
                shopContentRecyclerView3.setLayoutManager(this.manager);
            }
            ShopContentRecyclerView shopContentRecyclerView4 = this.recyclerView;
            if (shopContentRecyclerView4 != null) {
                shopContentRecyclerView4.setAdapter(this.adapter);
            }
            Context context = getContext();
            q.b(context, "this.context");
            this.detector = new c(this, context, new b(this));
            ShopContentRecyclerView shopContentRecyclerView5 = this.recyclerView;
            if (shopContentRecyclerView5 != null) {
                shopContentRecyclerView5.addOnScrollListener(new f());
            }
            com.alibaba.triver.triver_shop.container.shopLoft.f fVar2 = this.adapter;
            if (fVar2 == null || (j = fVar2.j()) == null) {
                return;
            }
            j jVar = new j();
            jVar.a(new ShopLoftComponentView$init$3$1(this));
            jVar.b(new ShopLoftComponentView$init$3$2(this));
            t tVar = t.INSTANCE;
            j.a("shopLoftFeedsController", jVar);
        }
    }

    private final void onUserDragFinish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("145b10d8", new Object[]{this});
            return;
        }
        this.userCanDrag = false;
        com.alibaba.triver.triver_shop.newShop.ext.b.a(new ShopLoftComponentView$onUserDragFinish$1(this), 800L);
    }

    public final void setSwipeToBottomCallback(ShopContentRecyclerView.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54443fc5", new Object[]{this, aVar});
        } else {
            this.swipeToBottomCallback = aVar;
        }
    }

    /* loaded from: classes3.dex */
    public final class c extends GestureDetector {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ShopLoftComponentView f3703a;
        private final Context b;
        private final b c;

        static {
            kge.a(-705755612);
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            if (str.hashCode() == -1447998406) {
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ShopLoftComponentView this$0, Context context, b gestureListener) {
            super(context, gestureListener);
            q.d(this$0, "this$0");
            q.d(context, "context");
            q.d(gestureListener, "gestureListener");
            this.f3703a = this$0;
            this.b = context;
            this.c = gestureListener;
        }

        @Override // android.view.GestureDetector
        public boolean onTouchEvent(MotionEvent ev) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, ev})).booleanValue();
            }
            q.d(ev, "ev");
            if (ev.getAction() == 1) {
                this.c.a();
            }
            return super.onTouchEvent(ev);
        }
    }

    /* loaded from: classes3.dex */
    public final class b extends GestureDetector.SimpleOnGestureListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ShopLoftComponentView f3702a;
        private boolean b;
        private float c;

        static {
            kge.a(606557710);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            if (str.hashCode() == 307521857) {
                return new Boolean(super.onScroll((MotionEvent) objArr[0], (MotionEvent) objArr[1], ((Number) objArr[2]).floatValue(), ((Number) objArr[3]).floatValue()));
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public b(ShopLoftComponentView this$0) {
            q.d(this$0, "this$0");
            this.f3702a = this$0;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent e1, MotionEvent e2, float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("12546941", new Object[]{this, e1, e2, new Float(f), new Float(f2)})).booleanValue();
            }
            q.d(e1, "e1");
            q.d(e2, "e2");
            if (!ShopLoftComponentView.access$getAllowSwipe$p(this.f3702a)) {
                return false;
            }
            ShopContentRecyclerView recyclerView = this.f3702a.getRecyclerView();
            if (recyclerView != null) {
                if ((this.f3702a.getLastItemIsLiveCard() && this.f3702a.getEnableShopLoftLiveCardDisableSwipe()) || !recyclerView.isSlideToBottom() || this.f3702a.getHasNext()) {
                    return false;
                }
                if (!this.b && Math.abs(f2) > Math.abs(f)) {
                    this.b = true;
                }
                if (!this.b) {
                    return false;
                }
                float translationY = recyclerView.getTranslationY() - f2;
                if (translationY > 0.0f) {
                    translationY = 0.0f;
                }
                recyclerView.setTranslationY(translationY);
                this.c = translationY;
                float abs = 1 - (Math.abs(this.c) / 900.0f);
                if (abs < 0.6f) {
                    abs = 0.6f;
                }
                this.f3702a.setAlpha(abs);
                if (Math.abs(this.c) > 900.0f) {
                    a();
                }
                return true;
            }
            return super.onScroll(e1, e2, f, f2);
        }

        public final void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            if (this.b) {
                if (Math.abs(this.c) > 900.0f && (this.f3702a.getContext() instanceof Activity) && this.f3702a.getEnableSwipeUpAutoCloseShopLoft()) {
                    ruk<t> closePageCallback = this.f3702a.getClosePageCallback();
                    if (closePageCallback != null) {
                        closePageCallback.mo2427invoke();
                    }
                    Context context = this.f3702a.getContext();
                    if (context == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
                    }
                    ((Activity) context).finish();
                }
                ShopContentRecyclerView recyclerView = this.f3702a.getRecyclerView();
                if (recyclerView != null) {
                    recyclerView.setTranslationY(0.0f);
                }
                this.c = 0.0f;
            }
            this.f3702a.setAlpha(1.0f);
            this.b = false;
        }
    }

    /* loaded from: classes3.dex */
    public final class d implements a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ShopLoftComponentView f3704a;

        static {
            kge.a(935903410);
            kge.a(714219249);
        }

        public d(ShopLoftComponentView this$0) {
            q.d(this$0, "this$0");
            this.f3704a = this$0;
        }

        @Override // com.alibaba.triver.triver_shop.container.shopLoft.ShopLoftComponentView.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            } else {
                ShopLoftComponentView.access$setAllowSwipe$p(this.f3704a, true);
            }
        }

        @Override // com.alibaba.triver.triver_shop.container.shopLoft.ShopLoftComponentView.a
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            } else {
                ShopLoftComponentView.access$setAllowSwipe$p(this.f3704a, false);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0037, code lost:
        if (r0 != 3) goto L29;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean dispatchTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.alibaba.triver.triver_shop.container.shopLoft.ShopLoftComponentView.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L1c
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r4] = r7
            r1[r3] = r8
            java.lang.String r8 = "7bb68bd5"
            java.lang.Object r8 = r0.ipc$dispatch(r8, r1)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            return r8
        L1c:
            if (r8 != 0) goto L1f
            return r4
        L1f:
            boolean r0 = r7.enableShopLoftSwipeLimit
            if (r0 == 0) goto L7f
            boolean r0 = r7.isSettling
            if (r0 == 0) goto L28
            return r4
        L28:
            boolean r0 = r7.userCanDrag
            if (r0 != 0) goto L7f
            int r0 = r8.getAction()
            if (r0 == 0) goto L70
            if (r0 == r3) goto L3d
            if (r0 == r2) goto L3a
            r1 = 3
            if (r0 == r1) goto L70
            goto L7f
        L3a:
            r7.hasMoveAction = r3
            return r4
        L3d:
            float r0 = r7.firstX
            float r1 = r8.getX()
            float r0 = r0 - r1
            double r0 = (double) r0
            double r0 = java.lang.Math.abs(r0)
            r2 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r0 = java.lang.Math.pow(r0, r2)
            float r5 = r7.firstY
            float r6 = r8.getY()
            float r5 = r5 - r6
            double r5 = (double) r5
            double r5 = java.lang.Math.abs(r5)
            double r2 = java.lang.Math.pow(r5, r2)
            double r0 = r0 + r2
            double r0 = java.lang.Math.sqrt(r0)
            boolean r2 = r7.hasMoveAction
            if (r2 == 0) goto L7f
            int r2 = r7.swipeThreshold
            double r2 = (double) r2
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 <= 0) goto L7f
            return r4
        L70:
            r7.clearTouchEventRecordStatus()
            float r0 = r8.getX()
            r7.firstX = r0
            float r0 = r8.getY()
            r7.firstY = r0
        L7f:
            android.view.GestureDetector r0 = r7.detector
            if (r0 == 0) goto L8b
            r0.onTouchEvent(r8)
            boolean r8 = super.dispatchTouchEvent(r8)
            return r8
        L8b:
            java.lang.String r8 = "detector"
            kotlin.jvm.internal.q.b(r8)
            r8 = 0
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.triver.triver_shop.container.shopLoft.ShopLoftComponentView.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    private final void clearTouchEventRecordStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6b4bf92", new Object[]{this});
            return;
        }
        this.hasMoveAction = false;
        this.firstX = 0.0f;
        this.firstY = 0.0f;
    }

    public final void onDestroyed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf354a81", new Object[]{this});
            return;
        }
        com.alibaba.triver.triver_shop.container.shopLoft.f fVar = this.adapter;
        if (fVar == null) {
            return;
        }
        fVar.h();
    }

    public final void setAdapter(com.alibaba.triver.triver_shop.container.shopLoft.f adapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3f77b79", new Object[]{this, adapter});
            return;
        }
        q.d(adapter, "adapter");
        this.adapter = adapter;
        adapter.a(new d(this));
    }

    public final void onLoadNewData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc8f444c", new Object[]{this});
            return;
        }
        ShopContentRecyclerView shopContentRecyclerView = this.recyclerView;
        if (shopContentRecyclerView != null) {
            shopContentRecyclerView.scrollBy(0, 1);
        }
        ShopContentRecyclerView shopContentRecyclerView2 = this.recyclerView;
        if (shopContentRecyclerView2 != null) {
            shopContentRecyclerView2.scrollBy(0, -1);
        }
        com.alibaba.triver.triver_shop.newShop.ext.b.d(new ShopLoftComponentView$onLoadNewData$1(this));
    }

    public final void scrollToNextItem() {
        f.a a2;
        ShopContentRecyclerView recyclerView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4a75475", new Object[]{this});
            return;
        }
        com.alibaba.triver.triver_shop.container.shopLoft.f fVar = this.adapter;
        if (fVar == null || (a2 = fVar.a()) == null) {
            return;
        }
        int adapterPosition = a2.getAdapterPosition();
        com.alibaba.triver.triver_shop.container.shopLoft.f fVar2 = this.adapter;
        q.a(fVar2);
        if (adapterPosition >= fVar2.getItemCount() - 1 || (recyclerView = getRecyclerView()) == null) {
            return;
        }
        recyclerView.smoothScrollToPosition(a2.getAdapterPosition() + 1);
    }

    public final void removeCurrentItem() {
        f.a a2;
        List<JSONObject> b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("899dfd8f", new Object[]{this});
            return;
        }
        com.alibaba.triver.triver_shop.container.shopLoft.f fVar = this.adapter;
        if (fVar == null || (a2 = fVar.a()) == null) {
            return;
        }
        com.alibaba.triver.triver_shop.container.shopLoft.f fVar2 = this.adapter;
        if (fVar2 != null && (b2 = fVar2.b()) != null) {
            b2.remove(a2.getAdapterPosition());
        }
        com.alibaba.triver.triver_shop.container.shopLoft.f fVar3 = this.adapter;
        if (fVar3 != null) {
            fVar3.notifyItemRemoved(a2.getAdapterPosition());
        }
        ShopContentRecyclerView recyclerView = getRecyclerView();
        if (recyclerView == null) {
            return;
        }
        recyclerView.post(new g());
    }
}
