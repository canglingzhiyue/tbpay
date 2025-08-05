package com.alibaba.triver.triver_shop.newShop.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.Guideline;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.a5;
import com.alibaba.triver.triver_shop.newShop.view.ShopSwipeListenerLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.t;
import tb.ceg;
import tb.kge;
import tb.ruk;
import tb.rul;
import tb.ruw;
import tb.rvp;
import tb.rvr;
import tb.rvs;

/* loaded from: classes3.dex */
public class ShopView extends ShopSwipeListenerLayout implements ShopSwipeListenerLayout.a {
    public static final /* synthetic */ kotlin.reflect.k<Object>[] $$delegatedProperties;
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ATMOSPHERE_IMG_PATH = "atmosphere_img_path";
    public static final float BABY_SECOND_HEADER_HEIGHT = 166.0f;
    public static final float BABY_SECOND_VIEW_HEIGHT = 48.0f;
    public static final float COMMON_SECOND_VIEW_HEIGHT = 74.0f;
    public static final float COMMON_TOP_HEADER_HEIGHT = 44.0f;
    public static final a Companion;
    public static final String DEFAULT_BG_IMAGE_PATH = "default_bg_img_path";
    public static final String DEFAULT_BG_IMG_URL = "https://img.alicdn.com/imgextra/i3/O1CN01biYZKy1dlSGR6Z0Z6_!!6000000003776-2-tps-750-2500.png";
    public static final float HOMEPAGE_SECOND_HEADER_HEIGHT = 118.0f;
    public static final long SHOP_ANIMATION_TIME_MS = 200;
    public static final String SP_NAMESPACE = "nativeShop";
    private int animationUpReservedHeight;
    private boolean atmosphere;
    public TUrlImageView atmosphereImageView;
    public View babySecondView;
    public View babyTopView;
    public TUrlImageView backgroundImage;
    private boolean bigCardMode;
    public View bigCardModeHeaderBG;
    public FrameLayout bottomContainer;
    private ruk<Boolean> canSwipeDownDetector;
    private boolean carShopMode;
    public ShopSwipeListenerLayout centerContainer;
    public View commonSecondView;
    public View commonTopView;
    public Guideline contentBottomLine;
    public View contentTopLine;
    private int contentTopMargin;
    private boolean doingAnimation;
    private boolean enableShopLoft;
    public FrameLayout firstHeadContainer;
    private boolean hasLoft;
    private boolean hasViewPagerScrolling;
    private ruw<? super Boolean, ? super Integer, t> headCollapsedCallback;
    private boolean headerHide;
    private final rvs inBabyTab$delegate;
    private boolean inHomePage;
    private boolean isPullDownShopLoftView;
    private long lastAnimationTime;
    private int lastSecondHeaderMoveUpY;
    private long lastSwipeJumpToShopLoftTime;
    public ConstraintLayout rootView;
    public LinearLayout secondHeadContainer;
    public Guideline secondHeaderTopLine;
    private final c shopContentMaxHeightGetter;
    public com.alibaba.triver.triver_shop.newShop.data.d shopData;
    public View shopLoftEntranceView;
    public View shopLoftPullDownView;
    private int shopLoftViewPullDownDistance;
    private int shopLoftViewPullDownMaxDistance;
    private int statusBarSize;
    public View statusBarView;
    private boolean stopScrollAnimation;
    private boolean videoShopMode;
    public View videoShopTabView;
    private final ViewPager.OnPageChangeListener viewPageChangeListener;
    private rul<? super Boolean, t> willHeadCollapsedCallback;

    /* loaded from: classes3.dex */
    public interface c {
        int a();

        int b();
    }

    /* loaded from: classes3.dex */
    public static final class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                com.alibaba.triver.triver_shop.newShop.ext.o.g(ShopView.this);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class f implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ float b;
        public final /* synthetic */ int c;

        public f(float f, int i) {
            this.b = f;
            this.c = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
            }
            int intValue = ((Integer) animatedValue).intValue();
            ShopView.this.getSecondHeadContainer().setTranslationY(this.b + intValue);
            if (ShopView.this.getBigCardMode() && ShopView.this.getInHomePage() && !ShopView.this.getVideoShopMode()) {
                return;
            }
            com.alibaba.triver.triver_shop.newShop.ext.o.c(ShopView.this.getContentTopLine(), this.c + intValue);
        }
    }

    /* loaded from: classes3.dex */
    public static final class h implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ float b;
        public final /* synthetic */ int c;

        public h(float f, int i) {
            this.b = f;
            this.c = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
            }
            int intValue = ((Integer) animatedValue).intValue();
            ShopView.this.getSecondHeadContainer().setTranslationY(this.b - intValue);
            if (!ShopView.this.getBigCardMode() || !ShopView.this.getInHomePage() || ShopView.this.getVideoShopMode()) {
                com.alibaba.triver.triver_shop.newShop.ext.o.c(ShopView.this.getContentTopLine(), this.c - intValue);
            }
            ShopView.this.swipeUpProgressing(intValue);
        }
    }

    /* loaded from: classes3.dex */
    public static final class j extends rvr<Boolean> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object f3908a;
        public final /* synthetic */ ShopView b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Object obj, Object obj2, ShopView shopView) {
            super(obj2);
            this.f3908a = obj;
            this.b = shopView;
        }

        @Override // tb.rvr
        public void a(kotlin.reflect.k<?> property, Boolean bool, Boolean bool2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4a3a624", new Object[]{this, property, bool, bool2});
                return;
            }
            kotlin.jvm.internal.q.d(property, "property");
            boolean booleanValue = bool2.booleanValue();
            bool.booleanValue();
            this.b.inBabyTabStatusChanged(booleanValue);
        }
    }

    /* loaded from: classes3.dex */
    public static final class k extends rvr<Boolean> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object f3909a;
        public final /* synthetic */ ShopView b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Object obj, Object obj2, ShopView shopView) {
            super(obj2);
            this.f3909a = obj;
            this.b = shopView;
        }

        @Override // tb.rvr
        public void a(kotlin.reflect.k<?> property, Boolean bool, Boolean bool2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4a3a624", new Object[]{this, property, bool, bool2});
                return;
            }
            kotlin.jvm.internal.q.d(property, "property");
            boolean booleanValue = bool2.booleanValue();
            bool.booleanValue();
            this.b.inBabyTabStatusChanged(booleanValue);
        }
    }

    /* loaded from: classes3.dex */
    public static final class l extends rvr<Boolean> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object f3910a;
        public final /* synthetic */ ShopView b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Object obj, Object obj2, ShopView shopView) {
            super(obj2);
            this.f3910a = obj;
            this.b = shopView;
        }

        @Override // tb.rvr
        public void a(kotlin.reflect.k<?> property, Boolean bool, Boolean bool2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4a3a624", new Object[]{this, property, bool, bool2});
                return;
            }
            kotlin.jvm.internal.q.d(property, "property");
            boolean booleanValue = bool2.booleanValue();
            bool.booleanValue();
            this.b.inBabyTabStatusChanged(booleanValue);
        }
    }

    /* loaded from: classes3.dex */
    public static final class m extends rvr<Boolean> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object f3911a;
        public final /* synthetic */ ShopView b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(Object obj, Object obj2, ShopView shopView) {
            super(obj2);
            this.f3911a = obj;
            this.b = shopView;
        }

        @Override // tb.rvr
        public void a(kotlin.reflect.k<?> property, Boolean bool, Boolean bool2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4a3a624", new Object[]{this, property, bool, bool2});
                return;
            }
            kotlin.jvm.internal.q.d(property, "property");
            boolean booleanValue = bool2.booleanValue();
            bool.booleanValue();
            this.b.inBabyTabStatusChanged(booleanValue);
        }
    }

    public static /* synthetic */ Object ipc$super(ShopView shopView, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopSwipeListenerLayout
    public boolean inCenterContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9fa114d2", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public void liveCardExpanded(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecfd5158", new Object[]{this, new Boolean(z)});
        }
    }

    public void onActivityPaused() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3aec0f63", new Object[]{this});
        }
    }

    public void onActivityResumed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70a0dbf0", new Object[]{this});
        }
    }

    public void onHomePageWebViewScrollToTop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("153aca28", new Object[]{this});
        }
    }

    public void swipeDownProgressing(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("772f4103", new Object[]{this, new Integer(i2)});
        }
    }

    public void swipeDownStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f9584d", new Object[]{this});
        }
    }

    public void swipeUpEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3047ead", new Object[]{this});
        }
    }

    public void swipeUpProgressing(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dbe77c", new Object[]{this, new Integer(i2)});
        }
    }

    public void updateTopViewTransparentStyle(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8da56efd", new Object[]{this, new Boolean(z)});
        }
    }

    public static final /* synthetic */ boolean access$getDoingAnimation$p(ShopView shopView) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("9d522985", new Object[]{shopView})).booleanValue() : shopView.doingAnimation;
    }

    public static final /* synthetic */ void access$onCenterContainerAnimationEnd(ShopView shopView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8a73196", new Object[]{shopView});
        } else {
            shopView.onCenterContainerAnimationEnd();
        }
    }

    public static final /* synthetic */ void access$pullShopLoftView(ShopView shopView, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee571f4", new Object[]{shopView, new Integer(i2), new Boolean(z)});
        } else {
            shopView.pullShopLoftView(i2, z);
        }
    }

    public static final /* synthetic */ void access$pullShopLoftViewStop(ShopView shopView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82df63cf", new Object[]{shopView, new Boolean(z)});
        } else {
            shopView.pullShopLoftViewStop(z);
        }
    }

    public static final /* synthetic */ void access$setHasViewPagerScrolling$p(ShopView shopView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8ee4c7", new Object[]{shopView, new Boolean(z)});
        } else {
            shopView.hasViewPagerScrolling = z;
        }
    }

    public boolean canSwipeUpDown() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e48ca8d2", new Object[]{this})).booleanValue() : ShopSwipeListenerLayout.a.C0139a.c(this);
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopSwipeListenerLayout.a
    public void onSwipeCancel(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5770811", new Object[]{this, motionEvent});
        } else {
            ShopSwipeListenerLayout.a.C0139a.a(this, motionEvent);
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopSwipeListenerLayout.a
    public void onSwipeDown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b54535e4", new Object[]{this});
        } else {
            ShopSwipeListenerLayout.a.C0139a.b(this);
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopSwipeListenerLayout.a
    public void onSwipeDown(View view, MotionEvent motionEvent, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74251660", new Object[]{this, view, motionEvent, new Integer(i2)});
        } else {
            ShopSwipeListenerLayout.a.C0139a.a(this, view, motionEvent, i2);
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopSwipeListenerLayout.a
    public void onSwipeUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4624ae1d", new Object[]{this});
        } else {
            ShopSwipeListenerLayout.a.C0139a.a(this);
        }
    }

    @Override // com.alibaba.triver.triver_shop.newShop.view.ShopSwipeListenerLayout.a
    public void onSwipeUp(View view, MotionEvent motionEvent, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0e512d9", new Object[]{this, view, motionEvent, new Integer(i2)});
        } else {
            ShopSwipeListenerLayout.a.C0139a.b(this, view, motionEvent, i2);
        }
    }

    /* loaded from: classes3.dex */
    public static final class a {
        static {
            kge.a(575528396);
        }

        public /* synthetic */ a(kotlin.jvm.internal.o oVar) {
            this();
        }

        private a() {
        }
    }

    public final long getLastAnimationTime() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1b8da2c0", new Object[]{this})).longValue() : this.lastAnimationTime;
    }

    public final void setLastAnimationTime(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("886ac984", new Object[]{this, new Long(j2)});
        } else {
            this.lastAnimationTime = j2;
        }
    }

    public final boolean getHeaderHide() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("df882770", new Object[]{this})).booleanValue() : this.headerHide;
    }

    public final void setHeaderHide(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4854125c", new Object[]{this, new Boolean(z)});
        } else {
            this.headerHide = z;
        }
    }

    static {
        kge.a(-32602236);
        kge.a(1157281732);
        $$delegatedProperties = new kotlin.reflect.k[]{kotlin.jvm.internal.t.a(new MutablePropertyReference1Impl(kotlin.jvm.internal.t.b(ShopView.class), "inBabyTab", "getInBabyTab()Z"))};
        Companion = new a(null);
    }

    public final boolean getInBabyTab() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("b46925cf", new Object[]{this})).booleanValue() : ((Boolean) this.inBabyTab$delegate.a(this, $$delegatedProperties[0])).booleanValue();
    }

    public final void setInBabyTab(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0b2ae75", new Object[]{this, new Boolean(z)});
        } else {
            this.inBabyTab$delegate.a(this, $$delegatedProperties[0], Boolean.valueOf(z));
        }
    }

    public boolean getCarShopMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("13bfa582", new Object[]{this})).booleanValue() : this.carShopMode;
    }

    public void setCarShopMode(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8325222", new Object[]{this, new Boolean(z)});
        } else {
            this.carShopMode = z;
        }
    }

    public boolean getVideoShopMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4b7c2d29", new Object[]{this})).booleanValue() : this.videoShopMode;
    }

    public void setVideoShopMode(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb35ac5b", new Object[]{this, new Boolean(z)});
        } else {
            this.videoShopMode = z;
        }
    }

    public final boolean getInHomePage() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("8143b054", new Object[]{this})).booleanValue() : this.inHomePage;
    }

    public final void setInHomePage(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de09a5f8", new Object[]{this, new Boolean(z)});
        } else {
            this.inHomePage = z;
        }
    }

    public final int getContentTopMargin() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("e8dbeda", new Object[]{this})).intValue() : this.contentTopMargin;
    }

    public final void setContentTopMargin(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("933d4370", new Object[]{this, new Integer(i2)});
        } else {
            this.contentTopMargin = i2;
        }
    }

    public final int getStatusBarSize() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d074ed26", new Object[]{this})).intValue() : this.statusBarSize;
    }

    public final void setStatusBarSize(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d554ae3c", new Object[]{this, new Integer(i2)});
        } else {
            this.statusBarSize = i2;
        }
    }

    public final boolean getAtmosphere() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e2384da3", new Object[]{this})).booleanValue() : this.atmosphere;
    }

    public final void setAtmosphere(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ba8b289", new Object[]{this, new Boolean(z)});
        } else {
            this.atmosphere = z;
        }
    }

    public final boolean getStopScrollAnimation() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("2d4d90aa", new Object[]{this})).booleanValue() : this.stopScrollAnimation;
    }

    public final void setStopScrollAnimation(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c31fffa", new Object[]{this, new Boolean(z)});
        } else {
            this.stopScrollAnimation = z;
        }
    }

    public boolean getBigCardMode() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e57d26c8", new Object[]{this})).booleanValue() : this.bigCardMode;
    }

    public void setBigCardMode(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e24f99c", new Object[]{this, new Boolean(z)});
        } else {
            this.bigCardMode = z;
        }
    }

    public final int getAnimationUpReservedHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("bb78752", new Object[]{this})).intValue() : this.animationUpReservedHeight;
    }

    public final void setAnimationUpReservedHeight(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5156a790", new Object[]{this, new Integer(i2)});
        } else {
            this.animationUpReservedHeight = i2;
        }
    }

    public final com.alibaba.triver.triver_shop.newShop.data.d getShopData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.triver.triver_shop.newShop.data.d) ipChange.ipc$dispatch("4264be0e", new Object[]{this});
        }
        com.alibaba.triver.triver_shop.newShop.data.d dVar = this.shopData;
        if (dVar != null) {
            return dVar;
        }
        kotlin.jvm.internal.q.b("shopData");
        throw null;
    }

    public final void setShopData(com.alibaba.triver.triver_shop.newShop.data.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab51df78", new Object[]{this, dVar});
            return;
        }
        kotlin.jvm.internal.q.d(dVar, "<set-?>");
        this.shopData = dVar;
    }

    public final c getShopContentMaxHeightGetter() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("bcd80132", new Object[]{this}) : this.shopContentMaxHeightGetter;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopView(Context context) {
        super(context);
        kotlin.jvm.internal.q.d(context, "context");
        rvp rvpVar = rvp.INSTANCE;
        this.inBabyTab$delegate = new j(false, false, this);
        this.shopContentMaxHeightGetter = new b(this);
        this.shopLoftViewPullDownMaxDistance = com.alibaba.triver.triver_shop.newShop.ext.o.a((Number) 90);
        this.viewPageChangeListener = new n();
        init();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.q.d(context, "context");
        rvp rvpVar = rvp.INSTANCE;
        this.inBabyTab$delegate = new k(false, false, this);
        this.shopContentMaxHeightGetter = new b(this);
        this.shopLoftViewPullDownMaxDistance = com.alibaba.triver.triver_shop.newShop.ext.o.a((Number) 90);
        this.viewPageChangeListener = new n();
        init();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        kotlin.jvm.internal.q.d(context, "context");
        rvp rvpVar = rvp.INSTANCE;
        this.inBabyTab$delegate = new l(false, false, this);
        this.shopContentMaxHeightGetter = new b(this);
        this.shopLoftViewPullDownMaxDistance = com.alibaba.triver.triver_shop.newShop.ext.o.a((Number) 90);
        this.viewPageChangeListener = new n();
        init();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShopView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        kotlin.jvm.internal.q.d(context, "context");
        rvp rvpVar = rvp.INSTANCE;
        this.inBabyTab$delegate = new m(false, false, this);
        this.shopContentMaxHeightGetter = new b(this);
        this.shopLoftViewPullDownMaxDistance = com.alibaba.triver.triver_shop.newShop.ext.o.a((Number) 90);
        this.viewPageChangeListener = new n();
        init();
    }

    public final View getBigCardModeHeaderBG() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("9882f738", new Object[]{this});
        }
        View view = this.bigCardModeHeaderBG;
        if (view != null) {
            return view;
        }
        kotlin.jvm.internal.q.b("bigCardModeHeaderBG");
        throw null;
    }

    public final void setBigCardModeHeaderBG(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39cf56a8", new Object[]{this, view});
            return;
        }
        kotlin.jvm.internal.q.d(view, "<set-?>");
        this.bigCardModeHeaderBG = view;
    }

    @Override // android.view.View
    public final ConstraintLayout getRootView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConstraintLayout) ipChange.ipc$dispatch("256c02dc", new Object[]{this});
        }
        ConstraintLayout constraintLayout = this.rootView;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        kotlin.jvm.internal.q.b("rootView");
        throw null;
    }

    public final void setRootView(ConstraintLayout constraintLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae0b04d8", new Object[]{this, constraintLayout});
            return;
        }
        kotlin.jvm.internal.q.d(constraintLayout, "<set-?>");
        this.rootView = constraintLayout;
    }

    public final FrameLayout getFirstHeadContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("400db6b", new Object[]{this});
        }
        FrameLayout frameLayout = this.firstHeadContainer;
        if (frameLayout != null) {
            return frameLayout;
        }
        kotlin.jvm.internal.q.b("firstHeadContainer");
        throw null;
    }

    public final void setFirstHeadContainer(FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("826e753d", new Object[]{this, frameLayout});
            return;
        }
        kotlin.jvm.internal.q.d(frameLayout, "<set-?>");
        this.firstHeadContainer = frameLayout;
    }

    public final LinearLayout getSecondHeadContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("6dc03895", new Object[]{this});
        }
        LinearLayout linearLayout = this.secondHeadContainer;
        if (linearLayout != null) {
            return linearLayout;
        }
        kotlin.jvm.internal.q.b("secondHeadContainer");
        throw null;
    }

    public final void setSecondHeadContainer(LinearLayout linearLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71e72875", new Object[]{this, linearLayout});
            return;
        }
        kotlin.jvm.internal.q.d(linearLayout, "<set-?>");
        this.secondHeadContainer = linearLayout;
    }

    public final FrameLayout getBottomContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("233b7792", new Object[]{this});
        }
        FrameLayout frameLayout = this.bottomContainer;
        if (frameLayout != null) {
            return frameLayout;
        }
        kotlin.jvm.internal.q.b("bottomContainer");
        throw null;
    }

    public final void setBottomContainer(FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffbad55e", new Object[]{this, frameLayout});
            return;
        }
        kotlin.jvm.internal.q.d(frameLayout, "<set-?>");
        this.bottomContainer = frameLayout;
    }

    public final ShopSwipeListenerLayout getCenterContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopSwipeListenerLayout) ipChange.ipc$dispatch("294868b5", new Object[]{this});
        }
        ShopSwipeListenerLayout shopSwipeListenerLayout = this.centerContainer;
        if (shopSwipeListenerLayout != null) {
            return shopSwipeListenerLayout;
        }
        kotlin.jvm.internal.q.b("centerContainer");
        throw null;
    }

    public final void setCenterContainer(ShopSwipeListenerLayout shopSwipeListenerLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("733ecb7", new Object[]{this, shopSwipeListenerLayout});
            return;
        }
        kotlin.jvm.internal.q.d(shopSwipeListenerLayout, "<set-?>");
        this.centerContainer = shopSwipeListenerLayout;
    }

    public final View getStatusBarView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("a4bc659", new Object[]{this});
        }
        View view = this.statusBarView;
        if (view != null) {
            return view;
        }
        kotlin.jvm.internal.q.b(a5.f3362a);
        throw null;
    }

    public final void setStatusBarView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2da2e4a7", new Object[]{this, view});
            return;
        }
        kotlin.jvm.internal.q.d(view, "<set-?>");
        this.statusBarView = view;
    }

    public final View getContentTopLine() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("dbb8c1af", new Object[]{this});
        }
        View view = this.contentTopLine;
        if (view != null) {
            return view;
        }
        kotlin.jvm.internal.q.b("contentTopLine");
        throw null;
    }

    public final void setContentTopLine(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33310779", new Object[]{this, view});
            return;
        }
        kotlin.jvm.internal.q.d(view, "<set-?>");
        this.contentTopLine = view;
    }

    public final TUrlImageView getBackgroundImage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("7c99879e", new Object[]{this});
        }
        TUrlImageView tUrlImageView = this.backgroundImage;
        if (tUrlImageView != null) {
            return tUrlImageView;
        }
        kotlin.jvm.internal.q.b("backgroundImage");
        throw null;
    }

    public final void setBackgroundImage(TUrlImageView tUrlImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b08b8f8", new Object[]{this, tUrlImageView});
            return;
        }
        kotlin.jvm.internal.q.d(tUrlImageView, "<set-?>");
        this.backgroundImage = tUrlImageView;
    }

    public final TUrlImageView getAtmosphereImageView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("f1a65aad", new Object[]{this});
        }
        TUrlImageView tUrlImageView = this.atmosphereImageView;
        if (tUrlImageView != null) {
            return tUrlImageView;
        }
        kotlin.jvm.internal.q.b("atmosphereImageView");
        throw null;
    }

    public final void setAtmosphereImageView(TUrlImageView tUrlImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("865a6dc9", new Object[]{this, tUrlImageView});
            return;
        }
        kotlin.jvm.internal.q.d(tUrlImageView, "<set-?>");
        this.atmosphereImageView = tUrlImageView;
    }

    public final View getShopLoftPullDownView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("dd3e93d2", new Object[]{this});
        }
        View view = this.shopLoftPullDownView;
        if (view != null) {
            return view;
        }
        kotlin.jvm.internal.q.b("shopLoftPullDownView");
        throw null;
    }

    public final void setShopLoftPullDownView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe98d2b6", new Object[]{this, view});
            return;
        }
        kotlin.jvm.internal.q.d(view, "<set-?>");
        this.shopLoftPullDownView = view;
    }

    public final Guideline getContentBottomLine() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Guideline) ipChange.ipc$dispatch("cc03ed7e", new Object[]{this});
        }
        Guideline guideline = this.contentBottomLine;
        if (guideline != null) {
            return guideline;
        }
        kotlin.jvm.internal.q.b("contentBottomLine");
        throw null;
    }

    public final void setContentBottomLine(Guideline guideline) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d276d4e", new Object[]{this, guideline});
            return;
        }
        kotlin.jvm.internal.q.d(guideline, "<set-?>");
        this.contentBottomLine = guideline;
    }

    public final Guideline getSecondHeaderTopLine() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Guideline) ipChange.ipc$dispatch("89673c8e", new Object[]{this});
        }
        Guideline guideline = this.secondHeaderTopLine;
        if (guideline != null) {
            return guideline;
        }
        kotlin.jvm.internal.q.b("secondHeaderTopLine");
        throw null;
    }

    public final void setSecondHeaderTopLine(Guideline guideline) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65ccf33e", new Object[]{this, guideline});
            return;
        }
        kotlin.jvm.internal.q.d(guideline, "<set-?>");
        this.secondHeaderTopLine = guideline;
    }

    public final View getBabySecondView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("2d08e2ee", new Object[]{this});
        }
        View view = this.babySecondView;
        if (view != null) {
            return view;
        }
        kotlin.jvm.internal.q.b("babySecondView");
        throw null;
    }

    public final void setBabySecondView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be50e1a", new Object[]{this, view});
            return;
        }
        kotlin.jvm.internal.q.d(view, "<set-?>");
        this.babySecondView = view;
    }

    public final View getBabyTopView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("335aed37", new Object[]{this});
        }
        View view = this.babyTopView;
        if (view != null) {
            return view;
        }
        kotlin.jvm.internal.q.b("babyTopView");
        throw null;
    }

    public final void setBabyTopView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a64aec89", new Object[]{this, view});
            return;
        }
        kotlin.jvm.internal.q.d(view, "<set-?>");
        this.babyTopView = view;
    }

    public final View getCommonTopView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("b78251c2", new Object[]{this});
        }
        View view = this.commonTopView;
        if (view != null) {
            return view;
        }
        kotlin.jvm.internal.q.b("commonTopView");
        throw null;
    }

    public final void setCommonTopView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("273dc65e", new Object[]{this, view});
            return;
        }
        kotlin.jvm.internal.q.d(view, "<set-?>");
        this.commonTopView = view;
    }

    public final View getCommonSecondView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("11362e83", new Object[]{this});
        }
        View view = this.commonSecondView;
        if (view != null) {
            return view;
        }
        kotlin.jvm.internal.q.b("commonSecondView");
        throw null;
    }

    public final void setCommonSecondView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0b86825", new Object[]{this, view});
            return;
        }
        kotlin.jvm.internal.q.d(view, "<set-?>");
        this.commonSecondView = view;
    }

    public final View getShopLoftEntranceView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("a1031541", new Object[]{this});
        }
        View view = this.shopLoftEntranceView;
        if (view != null) {
            return view;
        }
        kotlin.jvm.internal.q.b("shopLoftEntranceView");
        throw null;
    }

    public final void setShopLoftEntranceView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3647f27", new Object[]{this, view});
            return;
        }
        kotlin.jvm.internal.q.d(view, "<set-?>");
        this.shopLoftEntranceView = view;
    }

    public final View getVideoShopTabView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("3ece37c8", new Object[]{this});
        }
        View view = this.videoShopTabView;
        if (view != null) {
            return view;
        }
        kotlin.jvm.internal.q.b("videoShopTabView");
        throw null;
    }

    public final void setVideoShopTabView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76218780", new Object[]{this, view});
            return;
        }
        kotlin.jvm.internal.q.d(view, "<set-?>");
        this.videoShopTabView = view;
    }

    public final boolean getEnableShopLoft() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cbebb1cb", new Object[]{this})).booleanValue() : this.enableShopLoft;
    }

    public final void setEnableShopLoft(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffcff961", new Object[]{this, new Boolean(z)});
        } else {
            this.enableShopLoft = z;
        }
    }

    public final boolean getHasLoft() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("fc841d20", new Object[]{this})).booleanValue() : this.hasLoft;
    }

    public final void setHasLoft(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca493444", new Object[]{this, new Boolean(z)});
        } else {
            this.hasLoft = z;
        }
    }

    public final ruw<Boolean, Integer, t> getHeadCollapsedCallback() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ruw) ipChange.ipc$dispatch("cb222445", new Object[]{this}) : this.headCollapsedCallback;
    }

    public final void setHeadCollapsedCallback(ruw<? super Boolean, ? super Integer, t> ruwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37a0e05d", new Object[]{this, ruwVar});
        } else {
            this.headCollapsedCallback = ruwVar;
        }
    }

    public final rul<Boolean, t> getWillHeadCollapsedCallback() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (rul) ipChange.ipc$dispatch("47763e2", new Object[]{this}) : this.willHeadCollapsedCallback;
    }

    public final void setWillHeadCollapsedCallback(rul<? super Boolean, t> rulVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb5f6396", new Object[]{this, rulVar});
        } else {
            this.willHeadCollapsedCallback = rulVar;
        }
    }

    public final ruk<Boolean> getCanSwipeDownDetector() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ruk) ipChange.ipc$dispatch("65e7a02f", new Object[]{this}) : this.canSwipeDownDetector;
    }

    public final void setCanSwipeDownDetector(ruk<Boolean> rukVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54b7f2e3", new Object[]{this, rukVar});
        } else {
            this.canSwipeDownDetector = rukVar;
        }
    }

    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        setSwipeListener(this);
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.view_new_native_shop_container, (ViewGroup) null);
        if (inflate == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.support.constraint.ConstraintLayout");
        }
        setRootView((ConstraintLayout) inflate);
        getRootView().setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        bindingView(getRootView());
        initShopLoftPullDownViewBG();
        addView(getRootView());
        initContentViewScroll();
        post(new d());
        com.alibaba.triver.triver_shop.newShop.ext.b.d(new ShopView$init$2(this));
        Context context = getContext();
        kotlin.jvm.internal.q.b(context, "context");
        this.statusBarSize = com.alibaba.triver.triver_shop.newShop.ext.o.a(context);
        updateSecondHeaderTopPosition(this.statusBarSize + com.alibaba.triver.triver_shop.newShop.ext.o.c((Number) 88));
        com.alibaba.triver.triver_shop.newShop.ext.o.a(getFirstHeadContainer(), com.alibaba.triver.triver_shop.newShop.ext.o.c((Number) 88));
        updateBottomGuidLineEnd(com.alibaba.triver.triver_shop.newShop.ext.o.g((Number) 77));
    }

    /* loaded from: classes3.dex */
    public static final class e implements ShopSwipeListenerLayout.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // com.alibaba.triver.triver_shop.newShop.view.ShopSwipeListenerLayout.a
        public void onSwipeDown() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b54535e4", new Object[]{this});
            } else {
                ShopView.this.onContainerSwipeDown();
            }
        }

        @Override // com.alibaba.triver.triver_shop.newShop.view.ShopSwipeListenerLayout.a
        public void onSwipeUp() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4624ae1d", new Object[]{this});
            } else {
                ShopView.this.onContainerSwipeUp();
            }
        }

        @Override // com.alibaba.triver.triver_shop.newShop.view.ShopSwipeListenerLayout.a
        public void onSwipeDown(View fromTargetView, MotionEvent event, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("74251660", new Object[]{this, fromTargetView, event, new Integer(i)});
                return;
            }
            kotlin.jvm.internal.q.d(fromTargetView, "fromTargetView");
            kotlin.jvm.internal.q.d(event, "event");
            boolean a2 = com.alibaba.triver.triver_shop.newShop.ext.h.a(ShopView.this.getContext());
            if (ShopView.this.getVideoShopMode() && ShopView.this.getInHomePage() && a2) {
                ShopView.this.onSwipeDown(fromTargetView, event, i);
            }
            if (ShopView.access$getDoingAnimation$p(ShopView.this) || ShopView.this.getHeaderHide() || !a2) {
                return;
            }
            ShopView.access$pullShopLoftView(ShopView.this, i, true);
        }

        @Override // com.alibaba.triver.triver_shop.newShop.view.ShopSwipeListenerLayout.a
        public void onSwipeUp(View fromTargetView, MotionEvent event, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c0e512d9", new Object[]{this, fromTargetView, event, new Integer(i)});
                return;
            }
            kotlin.jvm.internal.q.d(fromTargetView, "fromTargetView");
            kotlin.jvm.internal.q.d(event, "event");
            boolean a2 = com.alibaba.triver.triver_shop.newShop.ext.h.a(ShopView.this.getContext());
            if (ShopView.this.getVideoShopMode() && ShopView.this.getInHomePage() && a2) {
                ShopView.this.onSwipeUp(fromTargetView, event, i);
            }
            ShopView.access$pullShopLoftView(ShopView.this, i, false);
        }

        @Override // com.alibaba.triver.triver_shop.newShop.view.ShopSwipeListenerLayout.a
        public void onSwipeCancel(MotionEvent event) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c5770811", new Object[]{this, event});
                return;
            }
            kotlin.jvm.internal.q.d(event, "event");
            if (ShopView.this.getVideoShopMode() && ShopView.this.getInHomePage() && com.alibaba.triver.triver_shop.newShop.ext.h.a(ShopView.this.getContext())) {
                ShopView.this.onSwipeCancel(event);
            }
            ShopView.access$pullShopLoftViewStop(ShopView.this, true);
        }
    }

    private final void initContentViewScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f565f702", new Object[]{this});
        } else {
            getCenterContainer().setSwipeListener(new e());
        }
    }

    public static /* synthetic */ void pullShopLoftViewStop$default(ShopView shopView, boolean z, int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6851f88d", new Object[]{shopView, new Boolean(z), new Integer(i2), obj});
        } else if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pullShopLoftViewStop");
        } else {
            if ((i2 & 1) != 0) {
                z = false;
            }
            shopView.pullShopLoftViewStop(z);
        }
    }

    private final void pullShopLoftViewStop(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbd7d39a", new Object[]{this, new Boolean(z)});
        } else if (!this.enableShopLoft) {
        } else {
            if (!z) {
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - this.lastSwipeJumpToShopLoftTime >= 500) {
                    this.lastSwipeJumpToShopLoftTime = currentTimeMillis;
                    Context context = getContext();
                    kotlin.jvm.internal.q.b(context, "context");
                    com.alibaba.triver.triver_shop.newShop.ext.l.a(context, getShopData().b((JSONObject) null));
                }
            }
            this.isPullDownShopLoftView = false;
            getCenterContainer().setTranslationY(0.0f);
            this.shopLoftViewPullDownDistance = 0;
            com.alibaba.triver.triver_shop.newShop.ext.o.d(getShopLoftPullDownView());
            com.alibaba.triver.triver_shop.newShop.ext.o.b(getShopLoftEntranceView());
        }
    }

    private final void pullShopLoftView(int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c9d2e09", new Object[]{this, new Integer(i2), new Boolean(z)});
        } else if (!this.enableShopLoft) {
        } else {
            if (z) {
                com.alibaba.triver.triver_shop.newShop.ext.o.d(getShopLoftEntranceView());
                com.alibaba.triver.triver_shop.newShop.ext.o.b(getShopLoftPullDownView());
                this.isPullDownShopLoftView = true;
                int i3 = this.shopLoftViewPullDownDistance;
                if (i3 + i2 >= this.shopLoftViewPullDownMaxDistance) {
                    pullShopLoftViewStop$default(this, false, 1, null);
                    return;
                }
                this.shopLoftViewPullDownDistance = i3 + i2;
            } else if (!this.isPullDownShopLoftView) {
                return;
            } else {
                com.alibaba.triver.triver_shop.newShop.ext.o.d(getShopLoftEntranceView());
                int i4 = this.shopLoftViewPullDownDistance;
                if (i4 - i2 <= 0) {
                    this.shopLoftViewPullDownDistance = 0;
                } else {
                    this.shopLoftViewPullDownDistance = i4 - i2;
                }
            }
            getCenterContainer().setTranslationY(this.shopLoftViewPullDownDistance);
            Drawable background = getShopLoftPullDownView().getBackground();
            if (background == null) {
                return;
            }
            background.setAlpha((int) ((this.shopLoftViewPullDownDistance / this.shopLoftViewPullDownMaxDistance) * 255));
        }
    }

    public boolean canDoAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f785f954", new Object[]{this})).booleanValue();
        }
        if (this.stopScrollAnimation || this.isPullDownShopLoftView) {
            return false;
        }
        return isAnimationTimeValid();
    }

    public final boolean isAnimationTimeValid() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("cc7162e0", new Object[]{this})).booleanValue() : System.currentTimeMillis() - this.lastAnimationTime > 400;
    }

    private final void onCenterContainerAnimationEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0271ab", new Object[]{this});
            return;
        }
        this.doingAnimation = false;
        this.lastAnimationTime = System.currentTimeMillis();
    }

    public void onContainerSwipeUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f5f2ba", new Object[]{this});
        } else if (this.hasViewPagerScrolling || this.headerHide || this.doingAnimation || !canDoAnimation()) {
        } else {
            this.doingAnimation = true;
            int height = getSecondHeadContainer().getHeight() - this.animationUpReservedHeight;
            ValueAnimator ofInt = ValueAnimator.ofInt(0, height);
            this.lastSecondHeaderMoveUpY = height;
            ofInt.addUpdateListener(new h(getSecondHeadContainer().getTranslationY(), com.alibaba.triver.triver_shop.newShop.ext.o.h(getContentTopLine())));
            ofInt.addListener(new i(height));
            ofInt.setDuration(200L);
            ofInt.start();
        }
    }

    /* loaded from: classes3.dex */
    public static final class i extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ int b;

        public static /* synthetic */ Object ipc$super(i iVar, String str, Object... objArr) {
            if (str.hashCode() == 977295137) {
                super.onAnimationStart((Animator) objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public i(int i) {
            this.b = i;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animation});
                return;
            }
            kotlin.jvm.internal.q.d(animation, "animation");
            ShopView.this.setHeaderHide(true);
            ShopView.this.getFirstHeadContainer().setAlpha(1.0f);
            com.alibaba.triver.triver_shop.newShop.ext.o.d(ShopView.this.getSecondHeadContainer());
            ShopView.this.swipeUpEnd();
            ShopView.access$onCenterContainerAnimationEnd(ShopView.this);
            ruw<Boolean, Integer, t> headCollapsedCallback = ShopView.this.getHeadCollapsedCallback();
            if (headCollapsedCallback == null) {
                return;
            }
            headCollapsedCallback.mo2423invoke(false, Integer.valueOf(this.b));
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animation});
                return;
            }
            kotlin.jvm.internal.q.d(animation, "animation");
            super.onAnimationStart(animation);
            ShopView.this.swipeUpStart();
            rul<Boolean, t> willHeadCollapsedCallback = ShopView.this.getWillHeadCollapsedCallback();
            if (willHeadCollapsedCallback == null) {
                return;
            }
            willHeadCollapsedCallback.mo2421invoke(false);
        }
    }

    public void onContainerSwipeDown() {
        Boolean mo2427invoke;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1d7c741", new Object[]{this});
        } else if (this.hasViewPagerScrolling) {
        } else {
            ruk<Boolean> rukVar = this.canSwipeDownDetector;
            if (!((rukVar == null || (mo2427invoke = rukVar.mo2427invoke()) == null) ? true : mo2427invoke.booleanValue()) || !this.headerHide || this.doingAnimation || !canDoAnimation()) {
                return;
            }
            this.doingAnimation = true;
            getSecondHeadContainer().setVisibility(0);
            int swipeDownDistance = getSwipeDownDistance();
            ValueAnimator ofInt = ValueAnimator.ofInt(0, swipeDownDistance);
            ofInt.addUpdateListener(new f(getSecondHeadContainer().getTranslationY(), com.alibaba.triver.triver_shop.newShop.ext.o.h(getContentTopLine())));
            ofInt.addListener(new g(swipeDownDistance));
            ofInt.setDuration(200L);
            ofInt.start();
        }
    }

    /* loaded from: classes3.dex */
    public static final class g extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ int b;

        public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
            if (str.hashCode() == 977295137) {
                super.onAnimationStart((Animator) objArr[0]);
                return null;
            }
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        }

        public g(int i) {
            this.b = i;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animation});
                return;
            }
            kotlin.jvm.internal.q.d(animation, "animation");
            ShopView.this.setHeaderHide(false);
            if ((!ShopView.this.getBigCardMode() || !ShopView.this.getInHomePage()) && !ShopView.this.getVideoShopMode()) {
                com.alibaba.triver.triver_shop.newShop.ext.o.c(ShopView.this.getContentTopLine(), ShopView.this.getContentTopMargin());
            }
            ShopView.this.swipeDownEnd();
            ShopView.access$onCenterContainerAnimationEnd(ShopView.this);
            ruw<Boolean, Integer, t> headCollapsedCallback = ShopView.this.getHeadCollapsedCallback();
            if (headCollapsedCallback == null) {
                return;
            }
            headCollapsedCallback.mo2423invoke(true, Integer.valueOf(this.b));
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animation});
                return;
            }
            kotlin.jvm.internal.q.d(animation, "animation");
            super.onAnimationStart(animation);
            rul<Boolean, t> willHeadCollapsedCallback = ShopView.this.getWillHeadCollapsedCallback();
            if (willHeadCollapsedCallback != null) {
                willHeadCollapsedCallback.mo2421invoke(true);
            }
            com.alibaba.triver.triver_shop.newShop.ext.o.b(ShopView.this.getSecondHeadContainer());
            if (ShopView.this.getAtmosphere()) {
                com.alibaba.triver.triver_shop.newShop.ext.o.g(ShopView.this.getFirstHeadContainer());
                com.alibaba.triver.triver_shop.newShop.ext.o.g(ShopView.this.getStatusBarView());
            }
            ShopView.this.swipeDownStart();
        }
    }

    public int getSwipeDownDistance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("b86f4555", new Object[]{this})).intValue() : this.lastSecondHeaderMoveUpY;
    }

    public void swipeDownEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a680146", new Object[]{this});
        } else if (getBigCardMode()) {
        } else {
            com.alibaba.triver.triver_shop.newShop.ext.o.g(getFirstHeadContainer());
            com.alibaba.triver.triver_shop.newShop.ext.o.g(getStatusBarView());
        }
    }

    public void swipeUpStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("686c17f4", new Object[]{this});
        } else if (this.atmosphere) {
        } else {
            getFirstHeadContainer().setBackgroundColor(-1);
            getStatusBarView().setBackgroundColor(-1);
        }
    }

    private final void bindingView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("620aae1", new Object[]{this, view});
            return;
        }
        View findViewById = view.findViewById(R.id.shopView_top_header_container);
        kotlin.jvm.internal.q.b(findViewById, "rootView.findViewById(R.id.shopView_top_header_container)");
        setFirstHeadContainer((FrameLayout) findViewById);
        View findViewById2 = view.findViewById(R.id.shopView_second_header_container);
        kotlin.jvm.internal.q.b(findViewById2, "rootView.findViewById(R.id.shopView_second_header_container)");
        setSecondHeadContainer((LinearLayout) findViewById2);
        View findViewById3 = view.findViewById(R.id.shopView_bottom_container);
        kotlin.jvm.internal.q.b(findViewById3, "rootView.findViewById(R.id.shopView_bottom_container)");
        setBottomContainer((FrameLayout) findViewById3);
        View findViewById4 = view.findViewById(R.id.shopView_center_container);
        kotlin.jvm.internal.q.b(findViewById4, "rootView.findViewById(R.id.shopView_center_container)");
        setCenterContainer((ShopSwipeListenerLayout) findViewById4);
        View findViewById5 = view.findViewById(R.id.shopView_statusBar);
        kotlin.jvm.internal.q.b(findViewById5, "rootView.findViewById(R.id.shopView_statusBar)");
        setStatusBarView(findViewById5);
        View findViewById6 = view.findViewById(R.id.shopView_background_img);
        kotlin.jvm.internal.q.b(findViewById6, "rootView.findViewById(R.id.shopView_background_img)");
        setBackgroundImage((TUrlImageView) findViewById6);
        View findViewById7 = view.findViewById(R.id.shopView_content_bottom_line);
        kotlin.jvm.internal.q.b(findViewById7, "rootView.findViewById(R.id.shopView_content_bottom_line)");
        setContentBottomLine((Guideline) findViewById7);
        View findViewById8 = view.findViewById(R.id.shopView_atmosphereTabBgPic);
        kotlin.jvm.internal.q.b(findViewById8, "rootView.findViewById(R.id.shopView_atmosphereTabBgPic)");
        setAtmosphereImageView((TUrlImageView) findViewById8);
        View findViewById9 = view.findViewById(R.id.shopView_content_top_line);
        kotlin.jvm.internal.q.b(findViewById9, "rootView.findViewById(R.id.shopView_content_top_line)");
        setContentTopLine(findViewById9);
        View findViewById10 = view.findViewById(R.id.shopView_second_header_top_line);
        kotlin.jvm.internal.q.b(findViewById10, "rootView.findViewById(R.id.shopView_second_header_top_line)");
        setSecondHeaderTopLine((Guideline) findViewById10);
        View findViewById11 = view.findViewById(R.id.shopView_bigCardMode_header_background);
        kotlin.jvm.internal.q.b(findViewById11, "rootView.findViewById(R.id.shopView_bigCardMode_header_background)");
        setBigCardModeHeaderBG(findViewById11);
        View findViewById12 = view.findViewById(R.id.shopView_shop_loft_pull_down_view);
        kotlin.jvm.internal.q.b(findViewById12, "rootView.findViewById(R.id.shopView_shop_loft_pull_down_view)");
        setShopLoftPullDownView(findViewById12);
    }

    private final void initShopLoftPullDownViewBG() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebe6404f", new Object[]{this});
        } else {
            com.alibaba.triver.triver_shop.newShop.ext.o.a(getShopLoftPullDownView(), new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, kotlin.collections.g.a(new Integer[]{-16777216, -16777216, 0})));
        }
    }

    public void renderBgImg() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff7bedcf", new Object[]{this});
            return;
        }
        TUrlImageView backgroundImage = getBackgroundImage();
        String aC = getShopData().aC();
        if (aC == null) {
            aC = "https://img.alicdn.com/imgextra/i3/O1CN01biYZKy1dlSGR6Z0Z6_!!6000000003776-2-tps-750-2500.png";
        }
        backgroundImage.setImageUrl(aC);
    }

    public void renderAtmosphereImg(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c285299c", new Object[]{this, str});
        } else if (str == null) {
        } else {
            getAtmosphereImageView().setImageUrl(str);
        }
    }

    public final void setFirstHeaderView(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c467029", new Object[]{this, view, new Boolean(z)});
            return;
        }
        kotlin.jvm.internal.q.d(view, "view");
        if (z) {
            setBabyTopView(view);
        } else {
            setCommonTopView(view);
        }
        getFirstHeadContainer().addView(view, com.alibaba.triver.triver_shop.newShop.ext.o.a(this));
    }

    public final void setSecondHeaderView(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45177631", new Object[]{this, view, new Boolean(z)});
            return;
        }
        kotlin.jvm.internal.q.d(view, "view");
        if (z) {
            setBabySecondView(view);
        } else {
            setCommonSecondView(view);
        }
        getSecondHeadContainer().addView(view);
    }

    public void setShopLoftEntrance(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("497e740c", new Object[]{this, view});
            return;
        }
        kotlin.jvm.internal.q.d(view, "view");
        setShopLoftEntranceView(view);
        getSecondHeadContainer().addView(view);
    }

    public void setTabViewInVideoShop(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2166837", new Object[]{this, view});
            return;
        }
        kotlin.jvm.internal.q.d(view, "view");
        getSecondHeadContainer().addView(view);
        setVideoShopTabView(view);
    }

    public final void setBottomView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ec6ff39", new Object[]{this, view});
            return;
        }
        kotlin.jvm.internal.q.d(view, "view");
        getBottomContainer().addView(view);
        com.alibaba.triver.triver_shop.newShop.ext.o.a(this, new ShopView$setBottomView$1(this, view));
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        getBottomContainer().setElevation(com.alibaba.triver.triver_shop.newShop.ext.o.a((Number) 50));
        getBottomContainer().setBackgroundColor(-1);
    }

    public final void setCenterView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("643dc2cf", new Object[]{this, view});
            return;
        }
        kotlin.jvm.internal.q.d(view, "view");
        getCenterContainer().addView(view, com.alibaba.triver.triver_shop.newShop.ext.o.a(this));
    }

    public final void addBottomSubscribeGuidView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3a25bff", new Object[]{this, view});
            return;
        }
        kotlin.jvm.internal.q.d(view, "view");
        int a2 = com.alibaba.triver.triver_shop.newShop.ext.o.a((Number) 9);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, com.alibaba.triver.triver_shop.newShop.ext.o.a((Number) 50), 80);
        layoutParams.bottomMargin = getBottomContainer().getHeight() + a2;
        layoutParams.leftMargin = a2;
        layoutParams.rightMargin = a2;
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams.setMarginStart(a2);
            layoutParams.setMarginEnd(a2);
        }
        addView(view, layoutParams);
    }

    /* loaded from: classes3.dex */
    public static final class n implements ViewPager.OnPageChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.support.v4.view.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
            }
        }

        @Override // android.support.v4.view.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
            }
        }

        public n() {
        }

        @Override // android.support.v4.view.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
            } else if (i == 1) {
                ShopView.access$setHasViewPagerScrolling$p(ShopView.this, true);
            } else {
                ShopView.access$setHasViewPagerScrolling$p(ShopView.this, false);
            }
        }
    }

    public final ViewPager.OnPageChangeListener getViewPageChangeListener() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewPager.OnPageChangeListener) ipChange.ipc$dispatch("ba44e35f", new Object[]{this}) : this.viewPageChangeListener;
    }

    public final void setStatusBarHeight(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7c3896", new Object[]{this, new Integer(i2)});
            return;
        }
        ViewGroup.LayoutParams layoutParams = getStatusBarView().getLayoutParams();
        layoutParams.height = i2;
        getStatusBarView().setLayoutParams(layoutParams);
        this.statusBarSize = i2;
    }

    public final void clearCenterView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74a3e7ce", new Object[]{this});
        } else {
            getCenterContainer().removeAllViews();
        }
    }

    public void switchToBabyBottomTab() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d1dc2ac", new Object[]{this});
            return;
        }
        setInBabyTab(true);
        com.alibaba.triver.triver_shop.newShop.ext.o.d(getCommonTopView());
        com.alibaba.triver.triver_shop.newShop.ext.o.b(getCommonSecondView());
        com.alibaba.triver.triver_shop.newShop.ext.o.b(getBabyTopView());
        com.alibaba.triver.triver_shop.newShop.ext.o.b(getBabySecondView());
    }

    public void switchToOtherBottomTab() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd69eef0", new Object[]{this});
            return;
        }
        setInBabyTab(false);
        com.alibaba.triver.triver_shop.newShop.ext.o.d(getCommonTopView());
        com.alibaba.triver.triver_shop.newShop.ext.o.b(getCommonSecondView());
        com.alibaba.triver.triver_shop.newShop.ext.o.b(getBabyTopView());
        com.alibaba.triver.triver_shop.newShop.ext.o.e(getBabySecondView());
    }

    public void switchToHomePageBottomTab() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96961df4", new Object[]{this});
            return;
        }
        setInBabyTab(false);
        com.alibaba.triver.triver_shop.newShop.ext.o.b(getCommonTopView());
        com.alibaba.triver.triver_shop.newShop.ext.o.b(getCommonSecondView());
        com.alibaba.triver.triver_shop.newShop.ext.o.d(getBabyTopView());
        com.alibaba.triver.triver_shop.newShop.ext.o.e(getBabySecondView());
    }

    public void updateSubPageChanged(boolean z, String str) {
        IpChange ipChange = $ipChange;
        boolean z2 = false;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c79f7009", new Object[]{this, new Boolean(z), str});
            return;
        }
        updateContentTopMargin(z);
        if (z && getBigCardMode() && !this.headerHide) {
            ruk<Boolean> rukVar = this.canSwipeDownDetector;
            kotlin.jvm.internal.q.a(rukVar);
            if (!rukVar.mo2427invoke().booleanValue()) {
                getSecondHeadContainer().setBackgroundColor(-1);
                getFirstHeadContainer().setBackgroundColor(-1);
                getStatusBarView().setBackgroundColor(-1);
            }
        }
        if (this.hasLoft && (!z || !getBigCardMode())) {
            z2 = true;
        }
        this.enableShopLoft = z2;
    }

    public void onAtmosphere(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b57976c", new Object[]{this, new Boolean(z)});
            return;
        }
        this.atmosphere = z;
        if (z) {
            com.alibaba.triver.triver_shop.newShop.ext.o.b(getAtmosphereImageView());
            com.alibaba.triver.triver_shop.newShop.ext.o.g(getSecondHeadContainer());
            com.alibaba.triver.triver_shop.newShop.ext.o.g(getFirstHeadContainer());
            com.alibaba.triver.triver_shop.newShop.ext.o.g(getStatusBarView());
            return;
        }
        com.alibaba.triver.triver_shop.newShop.ext.o.d(getAtmosphereImageView());
    }

    public final void updateBottomGuidLineEnd(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f03bed12", new Object[]{this, new Integer(i2)});
        } else {
            getContentBottomLine().setGuidelineEnd(i2);
        }
    }

    public final void updateSecondHeaderTopPosition(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4de6bc28", new Object[]{this, new Integer(i2)});
        } else {
            getSecondHeaderTopLine().setGuidelineBegin(i2);
        }
    }

    public final void stopScrollContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59789359", new Object[]{this});
        } else {
            this.stopScrollAnimation = true;
        }
    }

    public final void resetScrollContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d7bd8ec", new Object[]{this});
        } else {
            this.stopScrollAnimation = false;
        }
    }

    public void changeToBigCardMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdc6db2f", new Object[]{this});
        } else {
            setBigCardMode(true);
        }
    }

    private final boolean isSecondBabyInit() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6ff531ef", new Object[]{this})).booleanValue() : this.babySecondView != null;
    }

    public void inBabyTabStatusChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("711b19a5", new Object[]{this, new Boolean(z)});
        } else if (!isSecondBabyInit()) {
        } else {
            if (z) {
                com.alibaba.triver.triver_shop.newShop.ext.o.b(getBabySecondView());
            } else {
                com.alibaba.triver.triver_shop.newShop.ext.o.e(getBabySecondView());
            }
        }
    }

    public void notifyAllTemplateReady() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecc8fa98", new Object[]{this});
            return;
        }
        ceg.Companion.b("all template load ready");
        updateContentTopMargin(this.inHomePage);
    }

    public static /* synthetic */ void updateContentTopMargin$default(ShopView shopView, boolean z, int i2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("386ca2ed", new Object[]{shopView, new Boolean(z), new Integer(i2), obj});
        } else if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateContentTopMargin");
        } else {
            if ((i2 & 1) != 0) {
                z = false;
            }
            shopView.updateContentTopMargin(z);
        }
    }

    public void updateContentTopMargin(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6329d3a", new Object[]{this, new Boolean(z)});
            return;
        }
        this.inHomePage = z;
        com.alibaba.triver.triver_shop.newShop.ext.b.d(new ShopView$updateContentTopMargin$1(this));
    }

    public int getContentMaxHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a7bec322", new Object[]{this})).intValue();
        }
        if (!getBigCardMode() && !getCarShopMode() && getHeight() != 0 && getFirstHeadContainer().getHeight() != 0 && getBottomContainer().getHeight() != 0 && getSecondHeadContainer().getHeight() != 0) {
            return ((getHeight() - this.statusBarSize) - getFirstHeadContainer().getHeight()) - getBottomContainer().getHeight();
        }
        return 0;
    }

    public int getOtherPageContentMaxHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("14331b55", new Object[]{this})).intValue();
        }
        if (!getCarShopMode() && getHeight() != 0 && getFirstHeadContainer().getHeight() != 0 && getBottomContainer().getHeight() != 0 && getSecondHeadContainer().getHeight() != 0) {
            return ((getHeight() - this.statusBarSize) - getFirstHeadContainer().getHeight()) - getBottomContainer().getHeight();
        }
        return 0;
    }

    /* loaded from: classes3.dex */
    public final class b implements c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ShopView f3901a;

        static {
            kge.a(-351465443);
            kge.a(-847988045);
        }

        public b(ShopView this$0) {
            kotlin.jvm.internal.q.d(this$0, "this$0");
            this.f3901a = this$0;
        }

        @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView.c
        public int a() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.f3901a.getContentMaxHeight();
        }

        @Override // com.alibaba.triver.triver_shop.newShop.view.ShopView.c
        public int b() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue() : this.f3901a.getOtherPageContentMaxHeight();
        }
    }
}
